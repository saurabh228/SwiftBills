package app.swiftbills.data.home

import app.swiftbills.data.Resource
import app.swiftbills.data.models.Customer

interface CustomersRepository {
    suspend fun getCustomers(): Resource<List<Customer>>
    suspend fun addCustomer(customer: Customer): Resource<Customer>
    suspend fun updateCustomer(customer: Customer): Resource<Customer>
    suspend fun deleteCustomer(id: String): Resource<Boolean>
}