package app.swiftbills.ui.auth.home.invoices;

import androidx.annotation.StringRes;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.vector.ImageVector;
import app.swiftbills.R;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB\u0019\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0004\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lapp/swiftbills/ui/auth/home/invoices/InvoiceMenu;", "", "title", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(ILandroidx/compose/ui/graphics/vector/ImageVector;)V", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getTitle", "()I", "Delete", "Edit", "MarkAsPaid", "MarkAsUnPaid", "Lapp/swiftbills/ui/auth/home/invoices/InvoiceMenu$Delete;", "Lapp/swiftbills/ui/auth/home/invoices/InvoiceMenu$Edit;", "Lapp/swiftbills/ui/auth/home/invoices/InvoiceMenu$MarkAsPaid;", "Lapp/swiftbills/ui/auth/home/invoices/InvoiceMenu$MarkAsUnPaid;", "app_debug"})
public abstract class InvoiceMenu {
    private final int title = 0;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.ui.graphics.vector.ImageVector icon = null;
    
    private InvoiceMenu(@androidx.annotation.StringRes
    int title, androidx.compose.ui.graphics.vector.ImageVector icon) {
        super();
    }
    
    public final int getTitle() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.ui.graphics.vector.ImageVector getIcon() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/auth/home/invoices/InvoiceMenu$MarkAsPaid;", "Lapp/swiftbills/ui/auth/home/invoices/InvoiceMenu;", "()V", "app_debug"})
    public static final class MarkAsPaid extends app.swiftbills.ui.auth.home.invoices.InvoiceMenu {
        @org.jetbrains.annotations.NotNull
        public static final app.swiftbills.ui.auth.home.invoices.InvoiceMenu.MarkAsPaid INSTANCE = null;
        
        private MarkAsPaid() {
            super(0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/auth/home/invoices/InvoiceMenu$MarkAsUnPaid;", "Lapp/swiftbills/ui/auth/home/invoices/InvoiceMenu;", "()V", "app_debug"})
    public static final class MarkAsUnPaid extends app.swiftbills.ui.auth.home.invoices.InvoiceMenu {
        @org.jetbrains.annotations.NotNull
        public static final app.swiftbills.ui.auth.home.invoices.InvoiceMenu.MarkAsUnPaid INSTANCE = null;
        
        private MarkAsUnPaid() {
            super(0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/auth/home/invoices/InvoiceMenu$Edit;", "Lapp/swiftbills/ui/auth/home/invoices/InvoiceMenu;", "()V", "app_debug"})
    public static final class Edit extends app.swiftbills.ui.auth.home.invoices.InvoiceMenu {
        @org.jetbrains.annotations.NotNull
        public static final app.swiftbills.ui.auth.home.invoices.InvoiceMenu.Edit INSTANCE = null;
        
        private Edit() {
            super(0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/auth/home/invoices/InvoiceMenu$Delete;", "Lapp/swiftbills/ui/auth/home/invoices/InvoiceMenu;", "()V", "app_debug"})
    public static final class Delete extends app.swiftbills.ui.auth.home.invoices.InvoiceMenu {
        @org.jetbrains.annotations.NotNull
        public static final app.swiftbills.ui.auth.home.invoices.InvoiceMenu.Delete INSTANCE = null;
        
        private Delete() {
            super(0, null);
        }
    }
}