package app.swiftbills.ui.auth.home.taxes;

import androidx.lifecycle.ViewModel;
import app.swiftbills.data.Resource;
import app.swiftbills.data.home.TaxRepository;
import app.swiftbills.data.models.Tax;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020!J\u0011\u0010\u001c\u001a\u00020#H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\b\u0010%\u001a\u00020!H\u0002J\u0006\u0010&\u001a\u00020#J\u0010\u0010\'\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010\fJ\u0006\u0010)\u001a\u00020!J\u0006\u0010*\u001a\u00020#R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e\u0018\u00010\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u001f\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R%\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e\u0018\u00010\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lapp/swiftbills/ui/auth/home/taxes/TaxesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lapp/swiftbills/data/home/TaxRepository;", "(Lapp/swiftbills/data/home/TaxRepository;)V", "_areInputsValid", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_isUpdating", "", "_manageTaxResult", "Lapp/swiftbills/data/Resource;", "Lapp/swiftbills/data/models/Tax;", "_taxes", "", "areInputsValid", "Lkotlinx/coroutines/flow/StateFlow;", "getAreInputsValid", "()Lkotlinx/coroutines/flow/StateFlow;", "desc", "getDesc", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setDesc", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "isUpdating", "manageTaxResult", "getManageTaxResult", "taxes", "getTaxes", "value", "getValue", "setValue", "addTax", "Lkotlinx/coroutines/Job;", "deleteCustomer", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "init", "resetResource", "setUpdating", "tax", "updateTax", "validateInputs", "app_debug"})
public final class TaxesViewModel extends androidx.lifecycle.ViewModel {
    private final app.swiftbills.data.home.TaxRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> desc;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> value;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _isUpdating = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> isUpdating = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _areInputsValid = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> areInputsValid = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<app.swiftbills.data.Resource<app.swiftbills.data.models.Tax>> _manageTaxResult = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<app.swiftbills.data.models.Tax>> manageTaxResult = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Tax>>> _taxes = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Tax>>> taxes = null;
    
    @javax.inject.Inject
    public TaxesViewModel(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.home.TaxRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getDesc() {
        return null;
    }
    
    public final void setDesc(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getValue() {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> isUpdating() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getAreInputsValid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<app.swiftbills.data.models.Tax>> getManageTaxResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Tax>>> getTaxes() {
        return null;
    }
    
    private final kotlinx.coroutines.Job init() {
        return null;
    }
    
    public final void validateInputs() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job addTax() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job updateTax() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteCustomer() {
        return null;
    }
    
    public final void setUpdating(@org.jetbrains.annotations.Nullable
    app.swiftbills.data.models.Tax tax) {
    }
    
    public final void resetResource() {
    }
    
    private final java.lang.Object getTaxes(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}