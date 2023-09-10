package app.swiftbills.ui;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import app.swiftbills.R;
import app.swiftbills.ui.auth.home.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\r\u000e\u000f\u0010\u0011\u0012\u0013B#\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u0082\u0001\u0016\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\'()\u00a8\u0006*"}, d2 = {"Lapp/swiftbills/ui/AppScreen;", "", "title", "", "icon", "route", "", "(IILjava/lang/String;)V", "getIcon", "()I", "getRoute", "()Ljava/lang/String;", "getTitle", "Auth", "Customers", "Dashboard", "Invoices", "Logout", "MyBusinesses", "Taxes", "Lapp/swiftbills/ui/AppScreen$Auth;", "Lapp/swiftbills/ui/AppScreen$Auth$Login;", "Lapp/swiftbills/ui/AppScreen$Auth$Signup;", "Lapp/swiftbills/ui/AppScreen$Customers;", "Lapp/swiftbills/ui/AppScreen$Customers$Home;", "Lapp/swiftbills/ui/AppScreen$Customers$ManageCustomer;", "Lapp/swiftbills/ui/AppScreen$Dashboard;", "Lapp/swiftbills/ui/AppScreen$Invoices;", "Lapp/swiftbills/ui/AppScreen$Invoices$Home;", "Lapp/swiftbills/ui/AppScreen$Invoices$InvoiceDetail;", "Lapp/swiftbills/ui/AppScreen$Invoices$ManageInvoice;", "Lapp/swiftbills/ui/AppScreen$Invoices$ManageInvoice$AddItems;", "Lapp/swiftbills/ui/AppScreen$Invoices$ManageInvoice$PickBusiness;", "Lapp/swiftbills/ui/AppScreen$Invoices$ManageInvoice$PickCustomer;", "Lapp/swiftbills/ui/AppScreen$Invoices$ManageInvoice$PickTax;", "Lapp/swiftbills/ui/AppScreen$Logout;", "Lapp/swiftbills/ui/AppScreen$MyBusinesses;", "Lapp/swiftbills/ui/AppScreen$MyBusinesses$Home;", "Lapp/swiftbills/ui/AppScreen$MyBusinesses$ManageMyBusiness;", "Lapp/swiftbills/ui/AppScreen$Taxes;", "Lapp/swiftbills/ui/AppScreen$Taxes$Home;", "Lapp/swiftbills/ui/AppScreen$Taxes$ManageTaxes;", "app_debug"})
public abstract class AppScreen {
    private final int title = 0;
    private final int icon = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String route = null;
    
    private AppScreen(@androidx.annotation.StringRes
    int title, @androidx.annotation.DrawableRes
    int icon, java.lang.String route) {
        super();
    }
    
    public final int getTitle() {
        return 0;
    }
    
    public final int getIcon() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lapp/swiftbills/ui/AppScreen$Auth;", "Lapp/swiftbills/ui/AppScreen;", "()V", "Login", "Signup", "app_debug"})
    public static final class Auth extends app.swiftbills.ui.AppScreen {
        @org.jetbrains.annotations.NotNull
        public static final app.swiftbills.ui.AppScreen.Auth INSTANCE = null;
        
        private Auth() {
            super(0, 0, null);
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/AppScreen$Auth$Login;", "Lapp/swiftbills/ui/AppScreen;", "()V", "app_debug"})
        public static final class Login extends app.swiftbills.ui.AppScreen {
            @org.jetbrains.annotations.NotNull
            public static final app.swiftbills.ui.AppScreen.Auth.Login INSTANCE = null;
            
            private Login() {
                super(0, 0, null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/AppScreen$Auth$Signup;", "Lapp/swiftbills/ui/AppScreen;", "()V", "app_debug"})
        public static final class Signup extends app.swiftbills.ui.AppScreen {
            @org.jetbrains.annotations.NotNull
            public static final app.swiftbills.ui.AppScreen.Auth.Signup INSTANCE = null;
            
            private Signup() {
                super(0, 0, null);
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/AppScreen$Dashboard;", "Lapp/swiftbills/ui/AppScreen;", "()V", "app_debug"})
    public static final class Dashboard extends app.swiftbills.ui.AppScreen {
        @org.jetbrains.annotations.NotNull
        public static final app.swiftbills.ui.AppScreen.Dashboard INSTANCE = null;
        
        private Dashboard() {
            super(0, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lapp/swiftbills/ui/AppScreen$Invoices;", "Lapp/swiftbills/ui/AppScreen;", "()V", "Home", "InvoiceDetail", "ManageInvoice", "app_debug"})
    public static final class Invoices extends app.swiftbills.ui.AppScreen {
        @org.jetbrains.annotations.NotNull
        public static final app.swiftbills.ui.AppScreen.Invoices INSTANCE = null;
        
        private Invoices() {
            super(0, 0, null);
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/AppScreen$Invoices$Home;", "Lapp/swiftbills/ui/AppScreen;", "()V", "app_debug"})
        public static final class Home extends app.swiftbills.ui.AppScreen {
            @org.jetbrains.annotations.NotNull
            public static final app.swiftbills.ui.AppScreen.Invoices.Home INSTANCE = null;
            
            private Home() {
                super(0, 0, null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/AppScreen$Invoices$InvoiceDetail;", "Lapp/swiftbills/ui/AppScreen;", "()V", "app_debug"})
        public static final class InvoiceDetail extends app.swiftbills.ui.AppScreen {
            @org.jetbrains.annotations.NotNull
            public static final app.swiftbills.ui.AppScreen.Invoices.InvoiceDetail INSTANCE = null;
            
            private InvoiceDetail() {
                super(0, 0, null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0007"}, d2 = {"Lapp/swiftbills/ui/AppScreen$Invoices$ManageInvoice;", "Lapp/swiftbills/ui/AppScreen;", "()V", "AddItems", "PickBusiness", "PickCustomer", "PickTax", "app_debug"})
        public static final class ManageInvoice extends app.swiftbills.ui.AppScreen {
            @org.jetbrains.annotations.NotNull
            public static final app.swiftbills.ui.AppScreen.Invoices.ManageInvoice INSTANCE = null;
            
            private ManageInvoice() {
                super(0, 0, null);
            }
            
            @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/AppScreen$Invoices$ManageInvoice$PickBusiness;", "Lapp/swiftbills/ui/AppScreen;", "()V", "app_debug"})
            public static final class PickBusiness extends app.swiftbills.ui.AppScreen {
                @org.jetbrains.annotations.NotNull
                public static final app.swiftbills.ui.AppScreen.Invoices.ManageInvoice.PickBusiness INSTANCE = null;
                
                private PickBusiness() {
                    super(0, 0, null);
                }
            }
            
            @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/AppScreen$Invoices$ManageInvoice$PickCustomer;", "Lapp/swiftbills/ui/AppScreen;", "()V", "app_debug"})
            public static final class PickCustomer extends app.swiftbills.ui.AppScreen {
                @org.jetbrains.annotations.NotNull
                public static final app.swiftbills.ui.AppScreen.Invoices.ManageInvoice.PickCustomer INSTANCE = null;
                
                private PickCustomer() {
                    super(0, 0, null);
                }
            }
            
            @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/AppScreen$Invoices$ManageInvoice$PickTax;", "Lapp/swiftbills/ui/AppScreen;", "()V", "app_debug"})
            public static final class PickTax extends app.swiftbills.ui.AppScreen {
                @org.jetbrains.annotations.NotNull
                public static final app.swiftbills.ui.AppScreen.Invoices.ManageInvoice.PickTax INSTANCE = null;
                
                private PickTax() {
                    super(0, 0, null);
                }
            }
            
            @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/AppScreen$Invoices$ManageInvoice$AddItems;", "Lapp/swiftbills/ui/AppScreen;", "()V", "app_debug"})
            public static final class AddItems extends app.swiftbills.ui.AppScreen {
                @org.jetbrains.annotations.NotNull
                public static final app.swiftbills.ui.AppScreen.Invoices.ManageInvoice.AddItems INSTANCE = null;
                
                private AddItems() {
                    super(0, 0, null);
                }
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lapp/swiftbills/ui/AppScreen$Taxes;", "Lapp/swiftbills/ui/AppScreen;", "()V", "Home", "ManageTaxes", "app_debug"})
    public static final class Taxes extends app.swiftbills.ui.AppScreen {
        @org.jetbrains.annotations.NotNull
        public static final app.swiftbills.ui.AppScreen.Taxes INSTANCE = null;
        
        private Taxes() {
            super(0, 0, null);
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/AppScreen$Taxes$Home;", "Lapp/swiftbills/ui/AppScreen;", "()V", "app_debug"})
        public static final class Home extends app.swiftbills.ui.AppScreen {
            @org.jetbrains.annotations.NotNull
            public static final app.swiftbills.ui.AppScreen.Taxes.Home INSTANCE = null;
            
            private Home() {
                super(0, 0, null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/AppScreen$Taxes$ManageTaxes;", "Lapp/swiftbills/ui/AppScreen;", "()V", "app_debug"})
        public static final class ManageTaxes extends app.swiftbills.ui.AppScreen {
            @org.jetbrains.annotations.NotNull
            public static final app.swiftbills.ui.AppScreen.Taxes.ManageTaxes INSTANCE = null;
            
            private ManageTaxes() {
                super(0, 0, null);
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lapp/swiftbills/ui/AppScreen$MyBusinesses;", "Lapp/swiftbills/ui/AppScreen;", "()V", "Home", "ManageMyBusiness", "app_debug"})
    public static final class MyBusinesses extends app.swiftbills.ui.AppScreen {
        @org.jetbrains.annotations.NotNull
        public static final app.swiftbills.ui.AppScreen.MyBusinesses INSTANCE = null;
        
        private MyBusinesses() {
            super(0, 0, null);
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/AppScreen$MyBusinesses$Home;", "Lapp/swiftbills/ui/AppScreen;", "()V", "app_debug"})
        public static final class Home extends app.swiftbills.ui.AppScreen {
            @org.jetbrains.annotations.NotNull
            public static final app.swiftbills.ui.AppScreen.MyBusinesses.Home INSTANCE = null;
            
            private Home() {
                super(0, 0, null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/AppScreen$MyBusinesses$ManageMyBusiness;", "Lapp/swiftbills/ui/AppScreen;", "()V", "app_debug"})
        public static final class ManageMyBusiness extends app.swiftbills.ui.AppScreen {
            @org.jetbrains.annotations.NotNull
            public static final app.swiftbills.ui.AppScreen.MyBusinesses.ManageMyBusiness INSTANCE = null;
            
            private ManageMyBusiness() {
                super(0, 0, null);
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lapp/swiftbills/ui/AppScreen$Customers;", "Lapp/swiftbills/ui/AppScreen;", "()V", "Home", "ManageCustomer", "app_debug"})
    public static final class Customers extends app.swiftbills.ui.AppScreen {
        @org.jetbrains.annotations.NotNull
        public static final app.swiftbills.ui.AppScreen.Customers INSTANCE = null;
        
        private Customers() {
            super(0, 0, null);
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/AppScreen$Customers$Home;", "Lapp/swiftbills/ui/AppScreen;", "()V", "app_debug"})
        public static final class Home extends app.swiftbills.ui.AppScreen {
            @org.jetbrains.annotations.NotNull
            public static final app.swiftbills.ui.AppScreen.Customers.Home INSTANCE = null;
            
            private Home() {
                super(0, 0, null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/AppScreen$Customers$ManageCustomer;", "Lapp/swiftbills/ui/AppScreen;", "()V", "app_debug"})
        public static final class ManageCustomer extends app.swiftbills.ui.AppScreen {
            @org.jetbrains.annotations.NotNull
            public static final app.swiftbills.ui.AppScreen.Customers.ManageCustomer INSTANCE = null;
            
            private ManageCustomer() {
                super(0, 0, null);
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/swiftbills/ui/AppScreen$Logout;", "Lapp/swiftbills/ui/AppScreen;", "()V", "app_debug"})
    public static final class Logout extends app.swiftbills.ui.AppScreen {
        @org.jetbrains.annotations.NotNull
        public static final app.swiftbills.ui.AppScreen.Logout INSTANCE = null;
        
        private Logout() {
            super(0, 0, null);
        }
    }
}