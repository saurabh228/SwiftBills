package app.swiftbills.data.home

import app.swiftbills.data.BaseRepository
import app.swiftbills.data.Resource
import app.swiftbills.data.models.Customer
import app.swiftbills.data.utils.await
import app.swiftbills.data.utils.currentDateTime
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class CustomersRepositoryImpl @Inject constructor(
    auth: FirebaseAuth,
    firestore: FirebaseFirestore
) : CustomersRepository, BaseRepository<Customer>(auth, firestore, DB_CUSTOMERS) {

    override suspend fun getCustomers(): Resource<List<Customer>> {
        return try {
            val snapshot = db.get().await()
            Resource.Success(getData(snapshot, Customer::class.java))
        } catch (e: Exception) {
            Resource.Failure(e)
        }
    }

    override suspend fun addCustomer(customer: Customer): Resource<Customer> {
        return try {
            db.add(customer).await()
            Resource.Success(customer)
        } catch (e: Exception) {
            Resource.Failure(e)
        }
    }

    override suspend fun updateCustomer(customer: Customer): Resource<Customer> {
        return try {
            customer.updatedAt = currentDateTime
            db.document(customer.id).set(customer).await()
            Resource.Success(customer)
        } catch (e: Exception) {
            Resource.Failure(e)
        }
    }

    override suspend fun deleteCustomer(id: String): Resource<Boolean> {
        return try {
            db.document(id).delete().await()
            Resource.Success(true)
        } catch (e: Exception) {
            Resource.Failure(e)
        }
    }

    companion object {
        private const val DB_CUSTOMERS = "customers"
    }
}