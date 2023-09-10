package app.swiftbills.ui.auth;

import androidx.lifecycle.ViewModel;
import com.google.firebase.auth.FirebaseUser;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import app.swiftbills.data.auth.AuthRepository;
import app.swiftbills.data.Resource;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0019J\u001e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lapp/swiftbills/ui/auth/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lapp/swiftbills/data/auth/AuthRepository;", "(Lapp/swiftbills/data/auth/AuthRepository;)V", "_loginFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lapp/swiftbills/data/Resource;", "Lcom/google/firebase/auth/FirebaseUser;", "_signupFlow", "currentUser", "getCurrentUser", "()Lcom/google/firebase/auth/FirebaseUser;", "loginFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getLoginFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "signupFlow", "getSignupFlow", "login", "Lkotlinx/coroutines/Job;", "email", "", "password", "logout", "", "signup", "name", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    private final app.swiftbills.data.auth.AuthRepository repository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<app.swiftbills.data.Resource<com.google.firebase.auth.FirebaseUser>> _signupFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<com.google.firebase.auth.FirebaseUser>> signupFlow = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<app.swiftbills.data.Resource<com.google.firebase.auth.FirebaseUser>> _loginFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<com.google.firebase.auth.FirebaseUser>> loginFlow = null;
    
    @javax.inject.Inject
    public AuthViewModel(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.auth.AuthRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<com.google.firebase.auth.FirebaseUser>> getSignupFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<com.google.firebase.auth.FirebaseUser>> getLoginFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.firebase.auth.FirebaseUser getCurrentUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job login(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job signup(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return null;
    }
    
    public final void logout() {
    }
}