// Generated by Dagger (https://dagger.dev).
package app.swiftbills.data.home;

import com.google.firebase.auth.FirebaseAuth;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DashboardRepositoryImpl_Factory implements Factory<DashboardRepositoryImpl> {
  private final Provider<InvoiceRepository> invoiceRepositoryProvider;

  private final Provider<FirebaseAuth> authProvider;

  public DashboardRepositoryImpl_Factory(Provider<InvoiceRepository> invoiceRepositoryProvider,
      Provider<FirebaseAuth> authProvider) {
    this.invoiceRepositoryProvider = invoiceRepositoryProvider;
    this.authProvider = authProvider;
  }

  @Override
  public DashboardRepositoryImpl get() {
    return newInstance(invoiceRepositoryProvider.get(), authProvider.get());
  }

  public static DashboardRepositoryImpl_Factory create(
      Provider<InvoiceRepository> invoiceRepositoryProvider, Provider<FirebaseAuth> authProvider) {
    return new DashboardRepositoryImpl_Factory(invoiceRepositoryProvider, authProvider);
  }

  public static DashboardRepositoryImpl newInstance(InvoiceRepository invoiceRepository,
      FirebaseAuth auth) {
    return new DashboardRepositoryImpl(invoiceRepository, auth);
  }
}
