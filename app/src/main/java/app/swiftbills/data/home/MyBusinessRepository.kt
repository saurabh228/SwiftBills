package app.swiftbills.data.home

import app.swiftbills.data.Resource
import app.swiftbills.data.models.Business

interface MyBusinessRepository {
    suspend fun getMyBusinesses(): Resource<List<Business>>
    suspend fun canAddBusiness(): Boolean
    suspend fun addMyBusiness(business: Business): Resource<Business>
    suspend fun updateMyBusiness(business: Business): Resource<Business>
    suspend fun deleteMyBusiness(id: String): Resource<Boolean>
}