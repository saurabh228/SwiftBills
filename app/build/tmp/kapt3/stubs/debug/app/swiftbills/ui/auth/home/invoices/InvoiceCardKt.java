package app.swiftbills.ui.auth.home.invoices;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.*;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.*;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.Preview;
import app.swiftbills.R;
import app.swiftbills.data.models.Invoice;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001aI\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\b\u0010\u0013\u001a\u00020\u0001H\u0007\u001a\b\u0010\u0014\u001a\u00020\u0001H\u0007\u00a8\u0006\u0015"}, d2 = {"InvoiceCard", "", "invoice", "Lapp/swiftbills/data/models/Invoice;", "onClick", "Lkotlin/Function0;", "onMenuClick", "Lkotlin/Function1;", "Lapp/swiftbills/ui/auth/home/invoices/InvoiceMenu;", "Lkotlin/ParameterName;", "name", "menu", "InvoiceDropDown", "expanded", "", "isPaid", "onItemClick", "item", "onDismiss", "InvoicePreviewDark", "InvoicePreviewLight", "app_debug"})
public final class InvoiceCardKt {
    
    @androidx.compose.runtime.Composable
    public static final void InvoiceCard(@org.jetbrains.annotations.NotNull
    app.swiftbills.data.models.Invoice invoice, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super app.swiftbills.ui.auth.home.invoices.InvoiceMenu, kotlin.Unit> onMenuClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void InvoiceDropDown(boolean expanded, boolean isPaid, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super app.swiftbills.ui.auth.home.invoices.InvoiceMenu, kotlin.Unit> onItemClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true, uiMode = android.content.res.Configuration.UI_MODE_NIGHT_NO)
    public static final void InvoicePreviewLight() {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true, uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
    public static final void InvoicePreviewDark() {
    }
}