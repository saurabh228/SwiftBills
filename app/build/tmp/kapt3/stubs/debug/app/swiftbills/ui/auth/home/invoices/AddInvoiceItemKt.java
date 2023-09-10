package app.swiftbills.ui.auth.home.invoices;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.*;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.*;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.navigation.NavController;
import app.swiftbills.R;
import app.swiftbills.data.Resource;
import app.swiftbills.data.models.InvoiceItem;
import app.swiftbills.ui.AppScreen;
import app.swiftbills.ui.faker.FakeViewModelProvider;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\b\u0010\f\u001a\u00020\u0001H\u0007\u001a\b\u0010\r\u001a\u00020\u0001H\u0007\u00a8\u0006\u000e"}, d2 = {"AddInvoiceItem", "", "viewModel", "Lapp/swiftbills/ui/auth/home/invoices/InvoicesViewModel;", "navController", "Landroidx/navigation/NavController;", "InvoiceItemCard", "index", "", "item", "Lapp/swiftbills/data/models/InvoiceItem;", "InvoiceItemInput", "PreviewAddInvoiceItemDark", "PreviewAddInvoiceItemLight", "app_debug"})
public final class AddInvoiceItemKt {
    
    @androidx.compose.runtime.Composable
    @android.annotation.SuppressLint(value = {"UnusedMaterial3ScaffoldPaddingParameter"})
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void AddInvoiceItem(@org.jetbrains.annotations.NotNull
    app.swiftbills.ui.auth.home.invoices.InvoicesViewModel viewModel, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void InvoiceItemInput(@org.jetbrains.annotations.NotNull
    app.swiftbills.ui.auth.home.invoices.InvoicesViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void InvoiceItemCard(@org.jetbrains.annotations.NotNull
    app.swiftbills.ui.auth.home.invoices.InvoicesViewModel viewModel, int index, @org.jetbrains.annotations.NotNull
    app.swiftbills.data.models.InvoiceItem item) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true, uiMode = android.content.res.Configuration.UI_MODE_NIGHT_NO)
    public static final void PreviewAddInvoiceItemLight() {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true, uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
    public static final void PreviewAddInvoiceItemDark() {
    }
}