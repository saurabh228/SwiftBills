package app.swiftbills.ui.auth.home.invoices;

import android.content.res.Configuration;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.navigation.NavController;
import app.swiftbills.R;
import app.swiftbills.data.Resource;
import app.swiftbills.data.models.Business;
import app.swiftbills.ui.AppScreen;
import app.swiftbills.ui.faker.FakeViewModelProvider;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\b\u0010\t\u001a\u00020\u0001H\u0007\u001a\b\u0010\n\u001a\u00020\u0001H\u0007\u001a\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\f"}, d2 = {"PickBusiness", "", "viewModel", "Lapp/swiftbills/ui/auth/home/invoices/InvoicesViewModel;", "businesses", "", "Lapp/swiftbills/data/models/Business;", "navController", "Landroidx/navigation/NavController;", "PickBusinessPreviewDark", "PickBusinessPreviewLight", "PickBusinessScreen", "app_debug"})
public final class PickBusinessKt {
    
    @androidx.compose.runtime.Composable
    public static final void PickBusinessScreen(@org.jetbrains.annotations.NotNull
    app.swiftbills.ui.auth.home.invoices.InvoicesViewModel viewModel, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void PickBusiness(@org.jetbrains.annotations.NotNull
    app.swiftbills.ui.auth.home.invoices.InvoicesViewModel viewModel, @org.jetbrains.annotations.NotNull
    java.util.List<app.swiftbills.data.models.Business> businesses, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true, uiMode = android.content.res.Configuration.UI_MODE_NIGHT_NO)
    public static final void PickBusinessPreviewLight() {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true, uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
    public static final void PickBusinessPreviewDark() {
    }
}