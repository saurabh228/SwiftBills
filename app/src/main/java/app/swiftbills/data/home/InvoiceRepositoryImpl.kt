
package app.swiftbills.data.home

import app.swiftbills.data.BaseRepository
import app.swiftbills.data.Resource
import app.swiftbills.data.models.Invoice
import app.swiftbills.data.utils.await
import app.swiftbills.data.utils.currentDateTime
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class InvoiceRepositoryImpl @Inject constructor(
    auth: FirebaseAuth,
    firestore: FirebaseFirestore
) : InvoiceRepository, BaseRepository<Invoice>(auth, firestore, DB_INVOICES) {

    override suspend fun getInvoices(): Resource<List<Invoice>> {
        return try {
            val snapshot = db.get().await()
            Resource.Success(getData(snapshot, Invoice::class.java))
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Failure(e)
        }
    }

    override suspend fun addInvoice(invoice: Invoice): Resource<Invoice> {
        return try {
            db.add(invoice).await()
            Resource.Success(invoice)
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Failure(e)
        }
    }

    override suspend fun updateInvoice(invoice: Invoice): Resource<Invoice> {
        return try {
            invoice.updatedAt = currentDateTime
            db.document(invoice.id).set(invoice).await()
            Resource.Success(invoice)
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Failure(e)
        }
    }

    override suspend fun deleteInvoice(id: String): Resource<Boolean> {
        return try {
            db.document(id).delete().await()
            Resource.Success(true)
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Failure(e)
        }
    }

    override suspend fun updatePaidState(id: String, isPaid: Boolean): Resource<Boolean> {
        return try {
            db.document(id).update(FIELD_IS_PAID, isPaid).await()
            Resource.Success(true)
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Failure(e)
        }
    }

    companion object {
        private const val DB_INVOICES = "invoices"
        private const val FIELD_IS_PAID = "isPaid"
    }
}