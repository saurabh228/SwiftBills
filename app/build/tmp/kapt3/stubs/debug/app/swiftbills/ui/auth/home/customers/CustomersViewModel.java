package app.swiftbills.ui.auth.home.customers;

import androidx.lifecycle.ViewModel;
import app.swiftbills.data.Resource;
import app.swiftbills.data.home.CustomersRepository;
import app.swiftbills.data.models.Customer;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import java.lang.IllegalArgumentException;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010&\u001a\u00020\'J\u0006\u0010(\u001a\u00020\'J\u0011\u0010\u0019\u001a\u00020)H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\b\u0010+\u001a\u00020\'H\u0002J\u0006\u0010,\u001a\u00020)J\u0010\u0010-\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010/\u001a\u00020\'J\u0006\u00100\u001a\u00020)R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u0018\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u0019\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u001f\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R \u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R \u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00061"}, d2 = {"Lapp/swiftbills/ui/auth/home/customers/CustomersViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lapp/swiftbills/data/home/CustomersRepository;", "(Lapp/swiftbills/data/home/CustomersRepository;)V", "_areInputsValid", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_customers", "Lapp/swiftbills/data/Resource;", "", "Lapp/swiftbills/data/models/Customer;", "_isUpdating", "", "_manageCustomerResult", "address", "getAddress", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setAddress", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "areInputsValid", "Lkotlinx/coroutines/flow/StateFlow;", "getAreInputsValid", "()Lkotlinx/coroutines/flow/StateFlow;", "customers", "getCustomers", "email", "getEmail", "setEmail", "isUpdating", "manageCustomerResult", "getManageCustomerResult", "name", "getName", "setName", "phone", "getPhone", "setPhone", "addCustomer", "Lkotlinx/coroutines/Job;", "deleteCustomer", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "init", "resetResource", "setUpdating", "customer", "updateCustomer", "validateInputs", "app_debug"})
public final class CustomersViewModel extends androidx.lifecycle.ViewModel {
    private final app.swiftbills.data.home.CustomersRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> name;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> address;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> phone;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> email;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _isUpdating = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> isUpdating = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _areInputsValid = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> areInputsValid = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<app.swiftbills.data.Resource<app.swiftbills.data.models.Customer>> _manageCustomerResult = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<app.swiftbills.data.models.Customer>> manageCustomerResult = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Customer>>> _customers = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Customer>>> customers = null;
    
    @javax.inject.Inject
    public CustomersViewModel(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.home.CustomersRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getPhone() {
        return null;
    }
    
    public final void setPhone(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull
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
    public final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<app.swiftbills.data.models.Customer>> getManageCustomerResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Customer>>> getCustomers() {
        return null;
    }
    
    private final kotlinx.coroutines.Job init() {
        return null;
    }
    
    public final void validateInputs() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job addCustomer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job updateCustomer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteCustomer() {
        return null;
    }
    
    public final void setUpdating(@org.jetbrains.annotations.Nullable
    app.swiftbills.data.models.Customer customer) {
    }
    
    public final void resetResource() {
    }
    
    private final java.lang.Object getCustomers(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}