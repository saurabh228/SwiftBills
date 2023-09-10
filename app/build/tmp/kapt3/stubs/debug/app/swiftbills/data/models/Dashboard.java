package app.swiftbills.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lapp/swiftbills/data/models/Dashboard;", "Lapp/swiftbills/data/models/BaseModel;", "invoiceCount", "", "receivedAmount", "", "totalAmount", "pendingInvoices", "pendingAmount", "(IDDID)V", "getInvoiceCount", "()I", "getPendingAmount", "()D", "getPendingInvoices", "getReceivedAmount", "getTotalAmount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
public final class Dashboard extends app.swiftbills.data.models.BaseModel {
    private final int invoiceCount = 0;
    private final double receivedAmount = 0.0;
    private final double totalAmount = 0.0;
    private final int pendingInvoices = 0;
    private final double pendingAmount = 0.0;
    
    @org.jetbrains.annotations.NotNull
    public final app.swiftbills.data.models.Dashboard copy(int invoiceCount, double receivedAmount, double totalAmount, int pendingInvoices, double pendingAmount) {
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
    
    public Dashboard(int invoiceCount, double receivedAmount, double totalAmount, int pendingInvoices, double pendingAmount) {
        super(null);
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getInvoiceCount() {
        return 0;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double getReceivedAmount() {
        return 0.0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double getTotalAmount() {
        return 0.0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getPendingInvoices() {
        return 0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double getPendingAmount() {
        return 0.0;
    }
}