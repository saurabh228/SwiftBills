
package app.swiftbills.data.home

import app.swiftbills.data.Resource
import app.swiftbills.data.models.Invoice

interface InvoiceRepository {
    suspend fun getInvoices(): Resource<List<Invoice>>
    suspend fun addInvoice(invoice: Invoice): Resource<Invoice>
    suspend fun updateInvoice(invoice: Invoice): Resource<Invoice>
    suspend fun deleteInvoice(id: String): Resource<Boolean>
    suspend fun updatePaidState(id: String, isPaid: Boolean): Resource<Boolean>
}