// Generated by Dagger (https://dagger.dev).
package app.swiftbills.ui.auth.home.customers;

import app.swiftbills.data.home.CustomersRepository;
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
public final class CustomersViewModel_Factory implements Factory<CustomersViewModel> {
  private final Provider<CustomersRepository> repositoryProvider;

  public CustomersViewModel_Factory(Provider<CustomersRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public CustomersViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static CustomersViewModel_Factory create(
      Provider<CustomersRepository> repositoryProvider) {
    return new CustomersViewModel_Factory(repositoryProvider);
  }

  public static CustomersViewModel newInstance(CustomersRepository repository) {
    return new CustomersViewModel(repository);
  }
}
