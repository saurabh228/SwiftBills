package app.swiftbills.data.home

import app.swiftbills.data.BaseRepository
import app.swiftbills.data.Resource
import app.swiftbills.data.models.Tax
import app.swiftbills.data.utils.await
import app.swiftbills.data.utils.currentDateTime
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class TaxRepositoryImpl @Inject constructor(
    auth: FirebaseAuth,
    firestore: FirebaseFirestore
) : TaxRepository, BaseRepository<Tax>(auth, firestore, DB_TAXES) {

    override suspend fun getTaxes(): Resource<List<Tax>> {
        return try {
            val snapshot = db.get().await()
            Resource.Success(getData(snapshot, Tax::class.java))
        } catch (e: Exception) {
            Resource.Failure(e)
        }
    }

    override suspend fun addTax(tax: Tax): Resource<Tax> {
        return try {
            db.add(tax).await()
            Resource.Success(tax)
        } catch (e: Exception) {
            Resource.Failure(e)
        }
    }

    override suspend fun updateTax(tax: Tax): Resource<Tax> {
        return try {
            tax.updatedAt = currentDateTime
            db.document(tax.id).set(tax).await()
            Resource.Success(tax)
        } catch (e: Exception) {
            Resource.Failure(e)
        }
    }

    override suspend fun deleteTax(id: String): Resource<Boolean> {
        return try {
            db.document(id).delete().await()
            Resource.Success(true)
        } catch (e: Exception) {
            Resource.Failure(e)
        }
    }

    companion object {
        private const val DB_TAXES = "taxes"
    }
}