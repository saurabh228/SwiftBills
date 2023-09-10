package app.swiftbills.data.home;

import app.swiftbills.data.Resource;
import app.swiftbills.data.models.Tax;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lapp/swiftbills/data/home/TaxRepository;", "", "addTax", "Lapp/swiftbills/data/Resource;", "Lapp/swiftbills/data/models/Tax;", "tax", "(Lapp/swiftbills/data/models/Tax;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTax", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTaxes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTax", "app_debug"})
public abstract interface TaxRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTaxes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super app.swiftbills.data.Resource<? extends java.util.List<app.swiftbills.data.models.Tax>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addTax(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.models.Tax tax, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super app.swiftbills.data.Resource<app.swiftbills.data.models.Tax>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateTax(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.models.Tax tax, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super app.swiftbills.data.Resource<app.swiftbills.data.models.Tax>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteTax(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super app.swiftbills.data.Resource<java.lang.Boolean>> continuation);
}