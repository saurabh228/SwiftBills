package app.swiftbills.di;

import com.google.firebase.auth.FirebaseAuth;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import app.swiftbills.data.auth.AuthRepository;
import app.swiftbills.data.auth.AuthRepositoryImpl;
import app.swiftbills.data.home.*;
import com.google.firebase.firestore.FirebaseFirestore;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0019H\u0007\u00a8\u0006\u001a"}, d2 = {"Lapp/swiftbills/di/AppModule;", "", "()V", "provideAuthRepository", "Lapp/swiftbills/data/auth/AuthRepository;", "impl", "Lapp/swiftbills/data/auth/AuthRepositoryImpl;", "provideCustomersRepository", "Lapp/swiftbills/data/home/CustomersRepository;", "Lapp/swiftbills/data/home/CustomersRepositoryImpl;", "provideDashboardRepository", "Lapp/swiftbills/data/home/DashboardRepository;", "Lapp/swiftbills/data/home/DashboardRepositoryImpl;", "provideFirebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "provideFirebaseDb", "Lcom/google/firebase/firestore/FirebaseFirestore;", "provideInvoiceRepository", "Lapp/swiftbills/data/home/InvoiceRepository;", "Lapp/swiftbills/data/home/InvoiceRepositoryImpl;", "provideMyBusinessRepository", "Lapp/swiftbills/data/home/MyBusinessRepository;", "Lapp/swiftbills/data/home/MyBusinessRepositoryImpl;", "provideTaxRepository", "Lapp/swiftbills/data/home/TaxRepository;", "Lapp/swiftbills/data/home/TaxRepositoryImpl;", "app_debug"})
@dagger.Module
public final class AppModule {
    
    public AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.google.firebase.auth.FirebaseAuth provideFirebaseAuth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.google.firebase.firestore.FirebaseFirestore provideFirebaseDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final app.swiftbills.data.auth.AuthRepository provideAuthRepository(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.auth.AuthRepositoryImpl impl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final app.swiftbills.data.home.MyBusinessRepository provideMyBusinessRepository(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.home.MyBusinessRepositoryImpl impl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final app.swiftbills.data.home.CustomersRepository provideCustomersRepository(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.home.CustomersRepositoryImpl impl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final app.swiftbills.data.home.TaxRepository provideTaxRepository(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.home.TaxRepositoryImpl impl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final app.swiftbills.data.home.InvoiceRepository provideInvoiceRepository(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.home.InvoiceRepositoryImpl impl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final app.swiftbills.data.home.DashboardRepository provideDashboardRepository(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.home.DashboardRepositoryImpl impl) {
        return null;
    }
}