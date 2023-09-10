package app.swiftbills.data.models;

import com.google.firebase.firestore.IgnoreExtraProperties;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u0010(\u001a\u00020\fH\u00c6\u0003J\t\u0010)\u001a\u00020\u000eH\u00c6\u0003JQ\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020/H\u00d6\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\t\u00100\u001a\u00020\u000eH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\r\u001a\u00020\u000eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u001bR\u0011\u0010\"\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u001b\u00a8\u00061"}, d2 = {"Lapp/swiftbills/data/models/Invoice;", "Lapp/swiftbills/data/models/BaseModel;", "business", "Lapp/swiftbills/data/models/Business;", "customer", "Lapp/swiftbills/data/models/Customer;", "tax", "Lapp/swiftbills/data/models/Tax;", "items", "", "Lapp/swiftbills/data/models/InvoiceItem;", "isPaid", "", "id", "", "(Lapp/swiftbills/data/models/Business;Lapp/swiftbills/data/models/Customer;Lapp/swiftbills/data/models/Tax;Ljava/util/List;ZLjava/lang/String;)V", "getBusiness", "()Lapp/swiftbills/data/models/Business;", "getCustomer", "()Lapp/swiftbills/data/models/Customer;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "invoiceAmount", "", "getInvoiceAmount", "()D", "getItems", "()Ljava/util/List;", "getTax", "()Lapp/swiftbills/data/models/Tax;", "taxAmount", "getTaxAmount", "totalAmount", "getTotalAmount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "app_debug"})
@com.google.firebase.firestore.IgnoreExtraProperties
public final class Invoice extends app.swiftbills.data.models.BaseModel {
    @org.jetbrains.annotations.Nullable
    private final app.swiftbills.data.models.Business business = null;
    @org.jetbrains.annotations.Nullable
    private final app.swiftbills.data.models.Customer customer = null;
    @org.jetbrains.annotations.Nullable
    private final app.swiftbills.data.models.Tax tax = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<app.swiftbills.data.models.InvoiceItem> items = null;
    @kotlin.jvm.JvmField
    public boolean isPaid;
    @org.jetbrains.annotations.NotNull
    private java.lang.String id;
    
    @org.jetbrains.annotations.NotNull
    public final app.swiftbills.data.models.Invoice copy(@org.jetbrains.annotations.Nullable
    app.swiftbills.data.models.Business business, @org.jetbrains.annotations.Nullable
    app.swiftbills.data.models.Customer customer, @org.jetbrains.annotations.Nullable
    app.swiftbills.data.models.Tax tax, @org.jetbrains.annotations.NotNull
    java.util.List<app.swiftbills.data.models.InvoiceItem> items, boolean isPaid, @org.jetbrains.annotations.NotNull
    java.lang.String id) {
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
    
    public Invoice() {
        super(null);
    }
    
    public Invoice(@org.jetbrains.annotations.Nullable
    app.swiftbills.data.models.Business business, @org.jetbrains.annotations.Nullable
    app.swiftbills.data.models.Customer customer, @org.jetbrains.annotations.Nullable
    app.swiftbills.data.models.Tax tax, @org.jetbrains.annotations.NotNull
    java.util.List<app.swiftbills.data.models.InvoiceItem> items, boolean isPaid, @org.jetbrains.annotations.NotNull
    java.lang.String id) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final app.swiftbills.data.models.Business component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final app.swiftbills.data.models.Business getBusiness() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final app.swiftbills.data.models.Customer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final app.swiftbills.data.models.Customer getCustomer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final app.swiftbills.data.models.Tax component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final app.swiftbills.data.models.Tax getTax() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<app.swiftbills.data.models.InvoiceItem> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<app.swiftbills.data.models.InvoiceItem> getItems() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getId() {
        return null;
    }
    
    @java.lang.Override
    public void setId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final double getInvoiceAmount() {
        return 0.0;
    }
    
    public final double getTaxAmount() {
        return 0.0;
    }
    
    public final double getTotalAmount() {
        return 0.0;
    }
    
    public final boolean isPaid() {
        return false;
    }
}