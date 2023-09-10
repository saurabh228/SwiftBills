package app.swiftbills.data.home

import app.swiftbills.data.Resource
import app.swiftbills.data.models.Tax

interface TaxRepository {
    suspend fun getTaxes(): Resource<List<Tax>>
    suspend fun addTax(tax: Tax): Resource<Tax>
    suspend fun updateTax(tax: Tax): Resource<Tax>
    suspend fun deleteTax(id: String): Resource<Boolean>
}