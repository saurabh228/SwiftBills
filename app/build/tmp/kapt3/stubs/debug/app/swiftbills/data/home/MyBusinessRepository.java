package app.swiftbills.data.home;

import app.swiftbills.data.Resource;
import app.swiftbills.data.models.Business;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lapp/swiftbills/data/home/MyBusinessRepository;", "", "addMyBusiness", "Lapp/swiftbills/data/Resource;", "Lapp/swiftbills/data/models/Business;", "business", "(Lapp/swiftbills/data/models/Business;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canAddBusiness", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMyBusiness", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyBusinesses", "", "updateMyBusiness", "app_debug"})
public abstract interface MyBusinessRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMyBusinesses(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super app.swiftbills.data.Resource<? extends java.util.List<app.swiftbills.data.models.Business>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object canAddBusiness(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addMyBusiness(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.models.Business business, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super app.swiftbills.data.Resource<app.swiftbills.data.models.Business>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateMyBusiness(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.models.Business business, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super app.swiftbills.data.Resource<app.swiftbills.data.models.Business>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteMyBusiness(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super app.swiftbills.data.Resource<java.lang.Boolean>> continuation);
}