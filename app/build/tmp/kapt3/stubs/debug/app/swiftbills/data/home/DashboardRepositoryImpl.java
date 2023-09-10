package app.swiftbills.data.home;

import app.swiftbills.data.Resource;
import app.swiftbills.data.models.Dashboard;
import app.swiftbills.data.models.Invoice;
import com.google.firebase.auth.FirebaseAuth;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u0007\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lapp/swiftbills/data/home/DashboardRepositoryImpl;", "Lapp/swiftbills/data/home/DashboardRepository;", "invoiceRepository", "Lapp/swiftbills/data/home/InvoiceRepository;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "(Lapp/swiftbills/data/home/InvoiceRepository;Lcom/google/firebase/auth/FirebaseAuth;)V", "getDashboardInfo", "Lapp/swiftbills/data/Resource;", "Lapp/swiftbills/data/models/Dashboard;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoices", "", "Lapp/swiftbills/data/models/Invoice;", "app_debug"})
public final class DashboardRepositoryImpl implements app.swiftbills.data.home.DashboardRepository {
    private final app.swiftbills.data.home.InvoiceRepository invoiceRepository = null;
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    
    @javax.inject.Inject
    public DashboardRepositoryImpl(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.home.InvoiceRepository invoiceRepository, @org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth auth) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getDashboardInfo(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super app.swiftbills.data.Resource<app.swiftbills.data.models.Dashboard>> continuation) {
        return null;
    }
    
    private final app.swiftbills.data.models.Dashboard getDashboardInfo(java.util.List<app.swiftbills.data.models.Invoice> invoices) {
        return null;
    }
}