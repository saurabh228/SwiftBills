package app.swiftbills.ui.auth.home.dashboard;

import androidx.lifecycle.ViewModel;
import app.swiftbills.data.Resource;
import app.swiftbills.data.home.DashboardRepository;
import app.swiftbills.data.models.Dashboard;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lapp/swiftbills/ui/auth/home/dashboard/DashboardViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lapp/swiftbills/data/home/DashboardRepository;", "(Lapp/swiftbills/data/home/DashboardRepository;)V", "_dashboard", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lapp/swiftbills/data/Resource;", "Lapp/swiftbills/data/models/Dashboard;", "dashboard", "Lkotlinx/coroutines/flow/StateFlow;", "getDashboard", "()Lkotlinx/coroutines/flow/StateFlow;", "getDashboardInfo", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class DashboardViewModel extends androidx.lifecycle.ViewModel {
    private final app.swiftbills.data.home.DashboardRepository repository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<app.swiftbills.data.Resource<app.swiftbills.data.models.Dashboard>> _dashboard = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<app.swiftbills.data.models.Dashboard>> dashboard = null;
    
    @javax.inject.Inject
    public DashboardViewModel(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.home.DashboardRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<app.swiftbills.data.Resource<app.swiftbills.data.models.Dashboard>> getDashboard() {
        return null;
    }
    
    private final kotlinx.coroutines.Job getDashboardInfo() {
        return null;
    }
}