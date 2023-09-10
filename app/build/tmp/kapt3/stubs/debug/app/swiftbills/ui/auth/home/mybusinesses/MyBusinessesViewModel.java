package app.swiftbills.ui.auth.home.mybusinesses;

import androidx.lifecycle.ViewModel;
import app.swiftbills.data.Resource;
import app.swiftbills.data.home.MyBusinessRepository;
import app.swiftbills.data.models.Business;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import java.lang.IllegalArgumentException;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010$\u001a\u00020%J\u0011\u0010\u0017\u001a\u00020&H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0006\u0010(\u001a\u00020%J\u0011\u0010)\u001a\u00020&H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\b\u0010*\u001a\u00020%H\u0002J\u0006\u0010+\u001a\u00020&J\u0010\u0010,\u001a\u00020&2\b\u0010-\u001a\u0004\u0018\u00010\rJ\u0006\u0010.\u001a\u00020%J\u0006\u0010/\u001a\u00020&R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f\u0018\u00010\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0019\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u001f\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R%\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f\u0018\u00010\f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0012R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00060"}, d2 = {"Lapp/swiftbills/ui/auth/home/mybusinesses/MyBusinessesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lapp/swiftbills/data/home/MyBusinessRepository;", "(Lapp/swiftbills/data/home/MyBusinessRepository;)V", "_areInputsValid", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_canAddBusiness", "_isUpdating", "", "_manageBusinessResult", "Lapp/swiftbills/data/Resource;", "Lapp/swiftbills/data/models/Business;", "_myBusinesses", "", "address", "getAddress", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "areInputsValid", "Lkotlinx/coroutines/flow/StateFlow;", "getAreInputsValid", "()Lkotlinx/coroutines/flow/StateFlow;", "canAddBusiness", "getCanAddBusiness", "email", "getEmail", "isUpdating", "manageBusinessResult", "getManageBusinessResult", "myBusinesses", "getMyBusinesses", "name", "getName", "phone", "getPhone", "addMyBusiness", "Lkotlinx/coroutines/Job;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMyBusiness", "getBusinesses", "init", "resetResource", "setUpdating", "business", "updateMyBusiness", "validateInputs", "app_debug"})
public final class MyBusinessesViewModel extends androidx.lifecycle.ViewModel {
    private final app.swiftbills.data.home.MyBusinessRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> name = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> address = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> phone = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> email = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _isUpdating = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> isUpdating = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _areInputsValid = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> areInputsValid = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<app.swiftbills.data.Resource<app.swiftbills.data.models.Business>> _manageBusinessResult = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<app.swiftbills.data.models.Business>> manageBusinessResult = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Business>>> _myBusinesses = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Business>>> myBusinesses = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _canAddBusiness = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> canAddBusiness = null;
    
    @javax.inject.Inject
    public MyBusinessesViewModel(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.home.MyBusinessRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getEmail() {
        return null;
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
    public final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<app.swiftbills.data.models.Business>> getManageBusinessResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<java.util.List<app.swiftbills.data.models.Business>>> getMyBusinesses() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getCanAddBusiness() {
        return null;
    }
    
    private final kotlinx.coroutines.Job init() {
        return null;
    }
    
    public final void validateInputs() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job addMyBusiness() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job updateMyBusiness() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteMyBusiness() {
        return null;
    }
    
    public final void setUpdating(@org.jetbrains.annotations.Nullable
    app.swiftbills.data.models.Business business) {
    }
    
    public final void resetResource() {
    }
    
    private final java.lang.Object getBusinesses(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object canAddBusiness(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}