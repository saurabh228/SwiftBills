// Generated by Dagger (https://dagger.dev).
package app.swiftbills;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import app.swiftbills.data.auth.AuthRepository;
import app.swiftbills.data.auth.AuthRepositoryImpl;
import app.swiftbills.data.home.CustomersRepository;
import app.swiftbills.data.home.CustomersRepositoryImpl;
import app.swiftbills.data.home.DashboardRepository;
import app.swiftbills.data.home.DashboardRepositoryImpl;
import app.swiftbills.data.home.InvoiceRepository;
import app.swiftbills.data.home.InvoiceRepositoryImpl;
import app.swiftbills.data.home.MyBusinessRepository;
import app.swiftbills.data.home.MyBusinessRepositoryImpl;
import app.swiftbills.data.home.TaxRepository;
import app.swiftbills.data.home.TaxRepositoryImpl;
import app.swiftbills.di.AppModule;
import app.swiftbills.di.AppModule_ProvideAuthRepositoryFactory;
import app.swiftbills.di.AppModule_ProvideCustomersRepositoryFactory;
import app.swiftbills.di.AppModule_ProvideDashboardRepositoryFactory;
import app.swiftbills.di.AppModule_ProvideFirebaseAuthFactory;
import app.swiftbills.di.AppModule_ProvideFirebaseDbFactory;
import app.swiftbills.di.AppModule_ProvideInvoiceRepositoryFactory;
import app.swiftbills.di.AppModule_ProvideMyBusinessRepositoryFactory;
import app.swiftbills.di.AppModule_ProvideTaxRepositoryFactory;
import app.swiftbills.ui.auth.AuthActivity;
import app.swiftbills.ui.auth.AuthViewModel;
import app.swiftbills.ui.auth.AuthViewModel_HiltModules_KeyModule_ProvideFactory;
import app.swiftbills.ui.auth.home.HomeActivity;
import app.swiftbills.ui.auth.home.customers.CustomersViewModel;
import app.swiftbills.ui.auth.home.customers.CustomersViewModel_HiltModules_KeyModule_ProvideFactory;
import app.swiftbills.ui.auth.home.dashboard.DashboardViewModel;
import app.swiftbills.ui.auth.home.dashboard.DashboardViewModel_HiltModules_KeyModule_ProvideFactory;
import app.swiftbills.ui.auth.home.invoices.InvoicesViewModel;
import app.swiftbills.ui.auth.home.invoices.InvoicesViewModel_HiltModules_KeyModule_ProvideFactory;
import app.swiftbills.ui.auth.home.mybusinesses.MyBusinessesViewModel;
import app.swiftbills.ui.auth.home.mybusinesses.MyBusinessesViewModel_HiltModules_KeyModule_ProvideFactory;
import app.swiftbills.ui.auth.home.taxes.TaxesViewModel;
import app.swiftbills.ui.auth.home.taxes.TaxesViewModel_HiltModules_KeyModule_ProvideFactory;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerSwiftBills_HiltComponents_SingletonC {
  private DaggerSwiftBills_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private AppModule appModule;

    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    public SwiftBills_HiltComponents.SingletonC build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(appModule, applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements SwiftBills_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public SwiftBills_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements SwiftBills_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public SwiftBills_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements SwiftBills_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public SwiftBills_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements SwiftBills_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public SwiftBills_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements SwiftBills_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public SwiftBills_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements SwiftBills_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public SwiftBills_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle);
    }
  }

  private static final class ServiceCBuilder implements SwiftBills_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public SwiftBills_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends SwiftBills_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends SwiftBills_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends SwiftBills_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends SwiftBills_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectAuthActivity(AuthActivity arg0) {
    }

    @Override
    public void injectHomeActivity(HomeActivity arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonCImpl.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return ImmutableSet.<String>of(AuthViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CustomersViewModel_HiltModules_KeyModule_ProvideFactory.provide(), DashboardViewModel_HiltModules_KeyModule_ProvideFactory.provide(), InvoicesViewModel_HiltModules_KeyModule_ProvideFactory.provide(), MyBusinessesViewModel_HiltModules_KeyModule_ProvideFactory.provide(), TaxesViewModel_HiltModules_KeyModule_ProvideFactory.provide());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends SwiftBills_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<AuthViewModel> authViewModelProvider;

    private Provider<CustomersViewModel> customersViewModelProvider;

    private Provider<DashboardViewModel> dashboardViewModelProvider;

    private Provider<InvoicesViewModel> invoicesViewModelProvider;

    private Provider<MyBusinessesViewModel> myBusinessesViewModelProvider;

    private Provider<TaxesViewModel> taxesViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam) {
      this.authViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.customersViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.dashboardViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.invoicesViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.myBusinessesViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
      this.taxesViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 5);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return ImmutableMap.<String, Provider<ViewModel>>builderWithExpectedSize(6).put("app.swiftbills.ui.auth.AuthViewModel", ((Provider) authViewModelProvider)).put("app.swiftbills.ui.auth.home.customers.CustomersViewModel", ((Provider) customersViewModelProvider)).put("app.swiftbills.ui.auth.home.dashboard.DashboardViewModel", ((Provider) dashboardViewModelProvider)).put("app.swiftbills.ui.auth.home.invoices.InvoicesViewModel", ((Provider) invoicesViewModelProvider)).put("app.swiftbills.ui.auth.home.mybusinesses.MyBusinessesViewModel", ((Provider) myBusinessesViewModelProvider)).put("app.swiftbills.ui.auth.home.taxes.TaxesViewModel", ((Provider) taxesViewModelProvider)).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // app.swiftbills.ui.auth.AuthViewModel 
          return (T) new AuthViewModel(singletonCImpl.authRepository());

          case 1: // app.swiftbills.ui.auth.home.customers.CustomersViewModel 
          return (T) new CustomersViewModel(singletonCImpl.customersRepository());

          case 2: // app.swiftbills.ui.auth.home.dashboard.DashboardViewModel 
          return (T) new DashboardViewModel(singletonCImpl.dashboardRepository());

          case 3: // app.swiftbills.ui.auth.home.invoices.InvoicesViewModel 
          return (T) new InvoicesViewModel(singletonCImpl.invoiceRepository(), singletonCImpl.myBusinessRepository(), singletonCImpl.customersRepository(), singletonCImpl.taxRepository());

          case 4: // app.swiftbills.ui.auth.home.mybusinesses.MyBusinessesViewModel 
          return (T) new MyBusinessesViewModel(singletonCImpl.myBusinessRepository());

          case 5: // app.swiftbills.ui.auth.home.taxes.TaxesViewModel 
          return (T) new TaxesViewModel(singletonCImpl.taxRepository());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends SwiftBills_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    @SuppressWarnings("rawtypes")
    private Provider lifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider<Object>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.Lifecycle 
          return (T) ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends SwiftBills_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends SwiftBills_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final AppModule appModule;

    private final SingletonCImpl singletonCImpl = this;

    private SingletonCImpl(AppModule appModuleParam,
        ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      this.appModule = appModuleParam;

    }

    private AuthRepositoryImpl authRepositoryImpl() {
      return new AuthRepositoryImpl(AppModule_ProvideFirebaseAuthFactory.provideFirebaseAuth(appModule));
    }

    private AuthRepository authRepository() {
      return AppModule_ProvideAuthRepositoryFactory.provideAuthRepository(appModule, authRepositoryImpl());
    }

    private CustomersRepositoryImpl customersRepositoryImpl() {
      return new CustomersRepositoryImpl(AppModule_ProvideFirebaseAuthFactory.provideFirebaseAuth(appModule), AppModule_ProvideFirebaseDbFactory.provideFirebaseDb(appModule));
    }

    private CustomersRepository customersRepository() {
      return AppModule_ProvideCustomersRepositoryFactory.provideCustomersRepository(appModule, customersRepositoryImpl());
    }

    private InvoiceRepositoryImpl invoiceRepositoryImpl() {
      return new InvoiceRepositoryImpl(AppModule_ProvideFirebaseAuthFactory.provideFirebaseAuth(appModule), AppModule_ProvideFirebaseDbFactory.provideFirebaseDb(appModule));
    }

    private InvoiceRepository invoiceRepository() {
      return AppModule_ProvideInvoiceRepositoryFactory.provideInvoiceRepository(appModule, invoiceRepositoryImpl());
    }

    private DashboardRepositoryImpl dashboardRepositoryImpl() {
      return new DashboardRepositoryImpl(invoiceRepository(), AppModule_ProvideFirebaseAuthFactory.provideFirebaseAuth(appModule));
    }

    private DashboardRepository dashboardRepository() {
      return AppModule_ProvideDashboardRepositoryFactory.provideDashboardRepository(appModule, dashboardRepositoryImpl());
    }

    private MyBusinessRepositoryImpl myBusinessRepositoryImpl() {
      return new MyBusinessRepositoryImpl(AppModule_ProvideFirebaseAuthFactory.provideFirebaseAuth(appModule), AppModule_ProvideFirebaseDbFactory.provideFirebaseDb(appModule));
    }

    private MyBusinessRepository myBusinessRepository() {
      return AppModule_ProvideMyBusinessRepositoryFactory.provideMyBusinessRepository(appModule, myBusinessRepositoryImpl());
    }

    private TaxRepositoryImpl taxRepositoryImpl() {
      return new TaxRepositoryImpl(AppModule_ProvideFirebaseAuthFactory.provideFirebaseAuth(appModule), AppModule_ProvideFirebaseDbFactory.provideFirebaseDb(appModule));
    }

    private TaxRepository taxRepository() {
      return AppModule_ProvideTaxRepositoryFactory.provideTaxRepository(appModule, taxRepositoryImpl());
    }

    @Override
    public void injectSwiftBills(SwiftBills arg0) {
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return ImmutableSet.<Boolean>of();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }
  }
}
