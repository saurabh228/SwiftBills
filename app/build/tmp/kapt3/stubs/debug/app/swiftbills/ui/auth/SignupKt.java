package app.swiftbills.ui.auth;

import android.widget.Toast;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.*;
import androidx.compose.runtime.*;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.constraintlayout.compose.Dimension;
import androidx.navigation.NavHostController;
import app.swiftbills.R;
import app.swiftbills.ui.AppScreen;
import app.swiftbills.ui.auth.home.HomeActivity;
import app.swiftbills.ui.faker.FakeViewModelProvider;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0007\u001a\b\u0010\u0007\u001a\u00020\u0001H\u0007\u00a8\u0006\b"}, d2 = {"SignupScreen", "", "viewModel", "Lapp/swiftbills/ui/auth/AuthViewModel;", "navController", "Landroidx/navigation/NavHostController;", "SignupScreenPreviewDark", "SignupScreenPreviewLight", "app_debug"})
public final class SignupKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class, androidx.compose.foundation.ExperimentalFoundationApi.class})
    public static final void SignupScreen(@org.jetbrains.annotations.NotNull
    app.swiftbills.ui.auth.AuthViewModel viewModel, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true, uiMode = android.content.res.Configuration.UI_MODE_NIGHT_NO)
    public static final void SignupScreenPreviewLight() {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true, uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
    public static final void SignupScreenPreviewDark() {
    }
}