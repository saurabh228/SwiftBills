package app.swiftbills.data.home;

import app.swiftbills.data.BaseRepository;
import app.swiftbills.data.Resource;
import app.swiftbills.data.models.Customer;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0016B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00130\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lapp/swiftbills/data/home/CustomersRepositoryImpl;", "Lapp/swiftbills/data/home/CustomersRepository;", "Lapp/swiftbills/data/BaseRepository;", "Lapp/swiftbills/data/models/Customer;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/firestore/FirebaseFirestore;)V", "addCustomer", "Lapp/swiftbills/data/Resource;", "customer", "(Lapp/swiftbills/data/models/Customer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCustomer", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomers", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCustomer", "Companion", "app_debug"})
public final class CustomersRepositoryImpl extends app.swiftbills.data.BaseRepository<app.swiftbills.data.models.Customer> implements app.swiftbills.data.home.CustomersRepository {
    @org.jetbrains.annotations.NotNull
    public static final app.swiftbills.data.home.CustomersRepositoryImpl.Companion Companion = null;
    private static final java.lang.String DB_CUSTOMERS = "customers";
    
    @javax.inject.Inject
    public CustomersRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth auth, @org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firestore) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCustomers(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super app.swiftbills.data.Resource<? extends java.util.List<app.swiftbills.data.models.Customer>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object addCustomer(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.models.Customer customer, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super app.swiftbills.data.Resource<app.swiftbills.data.models.Customer>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object updateCustomer(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.models.Customer customer, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super app.swiftbills.data.Resource<app.swiftbills.data.models.Customer>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteCustomer(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super app.swiftbills.data.Resource<java.lang.Boolean>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lapp/swiftbills/data/home/CustomersRepositoryImpl$Companion;", "", "()V", "DB_CUSTOMERS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}