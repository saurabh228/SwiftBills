package app.swiftbills.ui.auth.home.invoices;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import app.swiftbills.data.Resource;
import app.swiftbills.data.home.CustomersRepository;
import app.swiftbills.data.home.InvoiceRepository;
import app.swiftbills.data.home.MyBusinessRepository;
import app.swiftbills.data.home.TaxRepository;
import app.swiftbills.data.models.*;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u00105\u001a\u000206J\u0006\u00107\u001a\u00020\rJ\u0006\u00108\u001a\u000209J\u000e\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\'J\u000e\u0010<\u001a\u0002062\u0006\u0010=\u001a\u00020\u0019J\b\u0010!\u001a\u000209H\u0002J\b\u0010%\u001a\u000209H\u0002J\b\u0010-\u001a\u000209H\u0002J\b\u00104\u001a\u000209H\u0002J\u000e\u0010>\u001a\u0002062\u0006\u0010*\u001a\u00020\u0013J\u0006\u0010?\u001a\u000206J\u000e\u0010@\u001a\u0002062\u0006\u0010=\u001a\u00020\u0019J\u000e\u0010A\u001a\u0002062\u0006\u0010B\u001a\u00020\u0011J\u000e\u0010C\u001a\u0002062\u0006\u0010*\u001a\u00020\u0013J\u000e\u0010D\u001a\u0002062\u0006\u0010E\u001a\u00020\u0015J\u000e\u0010F\u001a\u0002062\u0006\u0010G\u001a\u00020\u001bJ\u0006\u0010H\u001a\u000206J\u0016\u0010I\u001a\u0002092\u0006\u0010;\u001a\u00020\'2\u0006\u0010J\u001a\u00020\rJ\u0006\u0010K\u001a\u000206R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0010\u0018\u00010\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0010\u0018\u00010\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0010\u0018\u00010\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R%\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u001f\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR%\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0010\u0018\u00010\u000f0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R%\u0010,\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0010\u0018\u00010\u000f0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\'0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\'0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R%\u00103\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0010\u0018\u00010\u000f0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001f\u00a8\u0006L"}, d2 = {"Lapp/swiftbills/ui/auth/home/invoices/InvoicesViewModel;", "Landroidx/lifecycle/ViewModel;", "invoiceRepository", "Lapp/swiftbills/data/home/InvoiceRepository;", "businessRepository", "Lapp/swiftbills/data/home/MyBusinessRepository;", "customersRepository", "Lapp/swiftbills/data/home/CustomersRepository;", "taxRepository", "Lapp/swiftbills/data/home/TaxRepository;", "(Lapp/swiftbills/data/home/InvoiceRepository;Lapp/swiftbills/data/home/MyBusinessRepository;Lapp/swiftbills/data/home/CustomersRepository;Lapp/swiftbills/data/home/TaxRepository;)V", "_areInputsValid", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_businesses", "Lapp/swiftbills/data/Resource;", "", "Lapp/swiftbills/data/models/Business;", "_createInvoice", "Lapp/swiftbills/data/models/Invoice;", "_customers", "Lapp/swiftbills/data/models/Customer;", "_invoice", "_invoices", "_isUpdatingInvoiceItem", "", "_taxes", "Lapp/swiftbills/data/models/Tax;", "areInputsValid", "Lkotlinx/coroutines/flow/StateFlow;", "getAreInputsValid", "()Lkotlinx/coroutines/flow/StateFlow;", "businesses", "getBusinesses", "createInvoice", "getCreateInvoice", "customers", "getCustomers", "desc", "", "getDesc", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "invoice", "getInvoice", "invoices", "getInvoices", "isUpdatingInvoiceItem", "price", "getPrice", "qty", "getQty", "taxes", "getTaxes", "addInvoiceItem", "", "canCreateInvoice", "createOrUpdateInvoice", "Lkotlinx/coroutines/Job;", "deleteInvoice", "id", "deleteInvoiceItem", "index", "initInvoiceUpdate", "initNewInvoice", "initUpdateInvoiceItem", "setBusiness", "business", "setCurrentInvoice", "setCustomer", "customer", "setTax", "tax", "updateInvoiceItem", "updatePaidState", "isPaid", "validateInputs", "app_debug"})
public final class InvoicesViewModel extends androidx.lifecycle.ViewModel {
    private final app.swiftbills.data.home.InvoiceRepository invoiceRepository = null;
    private final app.swiftbills.data.home.MyBusinessRepository businessRepository = null;
    private final app.swiftbills.data.home.CustomersRepository customersRepository = null;
    private final app.swiftbills.data.home.TaxRepository taxRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> desc = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> qty = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> price = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Business>>> _businesses = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Business>>> businesses = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Customer>>> _customers = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Customer>>> customers = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Tax>>> _taxes = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Tax>>> taxes = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Invoice>>> _invoices = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Invoice>>> invoices = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<app.swiftbills.data.models.Invoice> _invoice = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.models.Invoice> invoice = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<app.swiftbills.data.Resource<app.swiftbills.data.models.Invoice>> _createInvoice = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<app.swiftbills.data.models.Invoice>> createInvoice = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _areInputsValid = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> areInputsValid = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _isUpdatingInvoiceItem = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> isUpdatingInvoiceItem = null;
    
    @javax.inject.Inject
    public InvoicesViewModel(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.home.InvoiceRepository invoiceRepository, @org.jetbrains.annotations.NotNull
    app.swiftbills.data.home.MyBusinessRepository businessRepository, @org.jetbrains.annotations.NotNull
    app.swiftbills.data.home.CustomersRepository customersRepository, @org.jetbrains.annotations.NotNull
    app.swiftbills.data.home.TaxRepository taxRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getDesc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getQty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Business>>> getBusinesses() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Customer>>> getCustomers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Tax>>> getTaxes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Invoice>>> getInvoices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.models.Invoice> getInvoice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<app.swiftbills.data.models.Invoice>> getCreateInvoice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getAreInputsValid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> isUpdatingInvoiceItem() {
        return null;
    }
    
    private final kotlinx.coroutines.Job getInvoices() {
        return null;
    }
    
    private final kotlinx.coroutines.Job getBusinesses() {
        return null;
    }
    
    private final kotlinx.coroutines.Job getCustomers() {
        return null;
    }
    
    private final kotlinx.coroutines.Job getTaxes() {
        return null;
    }
    
    public final void validateInputs() {
    }
    
    public final void setBusiness(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.models.Business business) {
    }
    
    public final void setCustomer(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.models.Customer customer) {
    }
    
    public final void setTax(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.models.Tax tax) {
    }
    
    public final void addInvoiceItem() {
    }
    
    public final void initUpdateInvoiceItem(int index) {
    }
    
    public final void updateInvoiceItem() {
    }
    
    public final void deleteInvoiceItem(int index) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job createOrUpdateInvoice() {
        return null;
    }
    
    public final boolean canCreateInvoice() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteInvoice(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job updatePaidState(@org.jetbrains.annotations.NotNull
    java.lang.String id, boolean isPaid) {
        return null;
    }
    
    public final void initInvoiceUpdate(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.models.Invoice invoice) {
    }
    
    public final void initNewInvoice() {
    }
    
    public final void setCurrentInvoice(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.models.Invoice invoice) {
    }
}