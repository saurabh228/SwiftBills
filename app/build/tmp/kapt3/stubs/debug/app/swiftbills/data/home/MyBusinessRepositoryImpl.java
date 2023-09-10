package app.swiftbills.data.home;

import app.swiftbills.data.BaseRepository;
import app.swiftbills.data.Resource;
import app.swiftbills.data.models.Business;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00150\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lapp/swiftbills/data/home/MyBusinessRepositoryImpl;", "Lapp/swiftbills/data/home/MyBusinessRepository;", "Lapp/swiftbills/data/BaseRepository;", "Lapp/swiftbills/data/models/Business;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/firestore/FirebaseFirestore;)V", "addMyBusiness", "Lapp/swiftbills/data/Resource;", "business", "(Lapp/swiftbills/data/models/Business;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canAddBusiness", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMyBusiness", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyBusinesses", "", "updateMyBusiness", "Companion", "app_debug"})
public final class MyBusinessRepositoryImpl extends app.swiftbills.data.BaseRepository<app.swiftbills.data.models.Business> implements app.swiftbills.data.home.MyBusinessRepository {
    @org.jetbrains.annotations.NotNull
    public static final app.swiftbills.data.home.MyBusinessRepositoryImpl.Companion Companion = null;
    private static final java.lang.String DB_MY_BUSINESSES = "my_businesses";
    private static final int MAX_ALLOWED_BUSINESS = 5;
    
    @javax.inject.Inject
    public MyBusinessRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth auth, @org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firestore) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getMyBusinesses(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super app.swiftbills.data.Resource<? extends java.util.List<app.swiftbills.data.models.Business>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object canAddBusiness(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object addMyBusiness(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.models.Business business, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super app.swiftbills.data.Resource<app.swiftbills.data.models.Business>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object updateMyBusiness(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.models.Business business, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super app.swiftbills.data.Resource<app.swiftbills.data.models.Business>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteMyBusiness(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super app.swiftbills.data.Resource<java.lang.Boolean>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lapp/swiftbills/data/home/MyBusinessRepositoryImpl$Companion;", "", "()V", "DB_MY_BUSINESSES", "", "MAX_ALLOWED_BUSINESS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}