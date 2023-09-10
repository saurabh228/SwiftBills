package app.swiftbills.ui.faker

import app.swiftbills.data.Resource
import app.swiftbills.data.auth.AuthRepository
import app.swiftbills.data.home.*
import app.swiftbills.data.models.*
import app.swiftbills.ui.auth.AuthViewModel
import app.swiftbills.ui.auth.home.customers.CustomersViewModel
import app.swiftbills.ui.auth.home.dashboard.DashboardViewModel
import app.swiftbills.ui.auth.home.invoices.InvoicesViewModel
import app.swiftbills.ui.auth.home.mybusinesses.MyBusinessesViewModel
import app.swiftbills.ui.auth.home.taxes.TaxesViewModel
import com.google.firebase.auth.FirebaseUser


object FakeViewModelProvider {

    fun provideDashboardViewModel() = DashboardViewModel(dashboardRepo)

    fun provideInvoicesViewModel() = InvoicesViewModel(invoiceRepo, businessRepo, customersRepo, taxRepo)

    fun provideTaxesViewModel() = TaxesViewModel(taxRepo)

    fun provideCustomersViewModel() = CustomersViewModel(customersRepo)

    fun provideMyBusinessesViewModel() = MyBusinessesViewModel(businessRepo)

    fun provideAuthViewModel() = AuthViewModel(authRepo)

    private val dashboardRepo = object : DashboardRepository {
        override suspend fun getDashboardInfo(): Resource<Dashboard> {
            TODO("Not yet implemented")
        }
    }

    private val invoiceRepo = object : InvoiceRepository {
        override suspend fun getInvoices(): Resource<List<Invoice>> {
            TODO("Not yet implemented")
        }

        override suspend fun addInvoice(invoice: Invoice): Resource<Invoice> {
            TODO("Not yet implemented")
        }

        override suspend fun updateInvoice(invoice: Invoice): Resource<Invoice> {
            TODO("Not yet implemented")
        }

        override suspend fun deleteInvoice(id: String): Resource<Boolean> {
            TODO("Not yet implemented")
        }

        override suspend fun updatePaidState(id: String, isPaid: Boolean): Resource<Boolean> {
            TODO("Not yet implemented")
        }

    }

    private val taxRepo = object : TaxRepository {
        override suspend fun getTaxes(): Resource<List<Tax>> {
            TODO("Not yet implemented")
        }

        override suspend fun addTax(tax: Tax): Resource<Tax> {
            TODO("Not yet implemented")
        }

        override suspend fun updateTax(tax: Tax): Resource<Tax> {
            TODO("Not yet implemented")
        }

        override suspend fun deleteTax(id: String): Resource<Boolean> {
            TODO("Not yet implemented")
        }

    }

    private val customersRepo = object : CustomersRepository {
        override suspend fun getCustomers(): Resource<List<Customer>> {
            TODO("Not yet implemented")
        }

        override suspend fun addCustomer(customer: Customer): Resource<Customer> {
            TODO("Not yet implemented")
        }

        override suspend fun updateCustomer(customer: Customer): Resource<Customer> {
            TODO("Not yet implemented")
        }

        override suspend fun deleteCustomer(id: String): Resource<Boolean> {
            TODO("Not yet implemented")
        }

    }

    private val businessRepo = object : MyBusinessRepository {
        override suspend fun getMyBusinesses(): Resource<List<Business>> {
            TODO("Not yet implemented")
        }

        override suspend fun canAddBusiness(): Boolean {
            TODO("Not yet implemented")
        }

        override suspend fun addMyBusiness(business: Business): Resource<Business> {
            TODO("Not yet implemented")
        }

        override suspend fun updateMyBusiness(business: Business): Resource<Business> {
            TODO("Not yet implemented")
        }

        override suspend fun deleteMyBusiness(id: String): Resource<Boolean> {
            TODO("Not yet implemented")
        }
    }

    private val authRepo = object : AuthRepository {
        override val currentUser: FirebaseUser?
            get() = null

        override suspend fun login(email: String, password: String): Resource<FirebaseUser> {
            TODO("Not yet implemented")
        }

        override suspend fun signup(name: String, email: String, password: String): Resource<FirebaseUser> {
            TODO("Not yet implemented")
        }

        override fun logout() {
            TODO("Not yet implemented")
        }

    }
}