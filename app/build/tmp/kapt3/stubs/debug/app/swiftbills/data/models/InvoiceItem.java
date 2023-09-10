package app.swiftbills.data.models;

import com.google.firebase.firestore.IgnoreExtraProperties;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lapp/swiftbills/data/models/InvoiceItem;", "Lapp/swiftbills/data/models/BaseModel;", "desc", "", "qty", "", "price", "(Ljava/lang/String;DD)V", "amount", "getAmount", "()D", "getDesc", "()Ljava/lang/String;", "getPrice", "getQty", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
@com.google.firebase.firestore.IgnoreExtraProperties
public final class InvoiceItem extends app.swiftbills.data.models.BaseModel {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String desc = null;
    private final double qty = 0.0;
    private final double price = 0.0;
    
    @org.jetbrains.annotations.NotNull
    public final app.swiftbills.data.models.InvoiceItem copy(@org.jetbrains.annotations.NotNull
    java.lang.String desc, double qty, double price) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public InvoiceItem() {
        super(null);
    }
    
    public InvoiceItem(@org.jetbrains.annotations.NotNull
    java.lang.String desc, double qty, double price) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDesc() {
        return null;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double getQty() {
        return 0.0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double getPrice() {
        return 0.0;
    }
    
    public final double getAmount() {
        return 0.0;
    }
}