package app.swiftbills.ui.faker;

import app.swiftbills.data.Resource;
import app.swiftbills.data.auth.AuthRepository;
import app.swiftbills.data.home.*;
import app.swiftbills.data.models.*;
import app.swiftbills.ui.auth.AuthViewModel;
import app.swiftbills.ui.auth.home.customers.CustomersViewModel;
import app.swiftbills.ui.auth.home.dashboard.DashboardViewModel;
import app.swiftbills.ui.auth.home.invoices.InvoicesViewModel;
import app.swiftbills.ui.auth.home.mybusinesses.MyBusinessesViewModel;
import app.swiftbills.ui.auth.home.taxes.TaxesViewModel;
import com.google.firebase.auth.FirebaseUser;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lapp/swiftbills/ui/faker/FakeViewModelProvider;", "", "()V", "authRepo", "Lapp/swiftbills/data/auth/AuthRepository;", "businessRepo", "Lapp/swiftbills/data/home/MyBusinessRepository;", "customersRepo", "Lapp/swiftbills/data/home/CustomersRepository;", "dashboardRepo", "Lapp/swiftbills/data/home/DashboardRepository;", "invoiceRepo", "Lapp/swiftbills/data/home/InvoiceRepository;", "taxRepo", "Lapp/swiftbills/data/home/TaxRepository;", "provideAuthViewModel", "Lapp/swiftbills/ui/auth/AuthViewModel;", "provideCustomersViewModel", "Lapp/swiftbills/ui/auth/home/customers/CustomersViewModel;", "provideDashboardViewModel", "Lapp/swiftbills/ui/auth/home/dashboard/DashboardViewModel;", "provideInvoicesViewModel", "Lapp/swiftbills/ui/auth/home/invoices/InvoicesViewModel;", "provideMyBusinessesViewModel", "Lapp/swiftbills/ui/auth/home/mybusinesses/MyBusinessesViewModel;", "provideTaxesViewModel", "Lapp/swiftbills/ui/auth/home/taxes/TaxesViewModel;", "app_debug"})
public final class FakeViewModelProvider {
    @org.jetbrains.annotations.NotNull
    public static final app.swiftbills.ui.faker.FakeViewModelProvider INSTANCE = null;
    private static final app.swiftbills.data.home.DashboardRepository dashboardRepo = null;
    private static final app.swiftbills.data.home.InvoiceRepository invoiceRepo = null;
    private static final app.swiftbills.data.home.TaxRepository taxRepo = null;
    private static final app.swiftbills.data.home.CustomersRepository customersRepo = null;
    private static final app.swiftbills.data.home.MyBusinessRepository businessRepo = null;
    private static final app.swiftbills.data.auth.AuthRepository authRepo = null;
    
    private FakeViewModelProvider() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final app.swiftbills.ui.auth.home.dashboard.DashboardViewModel provideDashboardViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final app.swiftbills.ui.auth.home.invoices.InvoicesViewModel provideInvoicesViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final app.swiftbills.ui.auth.home.taxes.TaxesViewModel provideTaxesViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final app.swiftbills.ui.auth.home.customers.CustomersViewModel provideCustomersViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final app.swiftbills.ui.auth.home.mybusinesses.MyBusinessesViewModel provideMyBusinessesViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final app.swiftbills.ui.auth.AuthViewModel provideAuthViewModel() {
        return null;
    }
}