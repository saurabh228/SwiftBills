package app.swiftbills.ui.auth.home.dashboard;

import android.content.res.Configuration;
import androidx.annotation.DrawableRes;
import androidx.compose.foundation.layout.*;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.constraintlayout.compose.Dimension;
import app.swiftbills.data.Resource;
import app.swiftbills.data.models.Dashboard;
import app.swiftbills.R;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0007\u001a\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a\b\u0010\r\u001a\u00020\u0001H\u0007\u001a\b\u0010\u000e\u001a\u00020\u0001H\u0007\u00a8\u0006\u000f"}, d2 = {"DashboardCard", "", "icon", "", "title", "", "value", "DashboardData", "resource", "Lapp/swiftbills/data/models/Dashboard;", "DashboardScreen", "viewModel", "Lapp/swiftbills/ui/auth/home/dashboard/DashboardViewModel;", "HomeScreenPreviewDark", "HomeScreenPreviewLight", "app_debug"})
public final class DashboardScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void DashboardScreen(@org.jetbrains.annotations.NotNull
    app.swiftbills.ui.auth.home.dashboard.DashboardViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void DashboardData(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.models.Dashboard resource) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void DashboardCard(@androidx.annotation.DrawableRes
    int icon, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true, uiMode = android.content.res.Configuration.UI_MODE_NIGHT_NO)
    public static final void HomeScreenPreviewLight() {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true, uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
    public static final void HomeScreenPreviewDark() {
    }
}