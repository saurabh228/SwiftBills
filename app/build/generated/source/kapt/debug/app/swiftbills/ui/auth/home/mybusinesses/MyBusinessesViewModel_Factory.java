// Generated by Dagger (https://dagger.dev).
package app.swiftbills.ui.auth.home.mybusinesses;

import app.swiftbills.data.home.MyBusinessRepository;
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
public final class MyBusinessesViewModel_Factory implements Factory<MyBusinessesViewModel> {
  private final Provider<MyBusinessRepository> repositoryProvider;

  public MyBusinessesViewModel_Factory(Provider<MyBusinessRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public MyBusinessesViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static MyBusinessesViewModel_Factory create(
      Provider<MyBusinessRepository> repositoryProvider) {
    return new MyBusinessesViewModel_Factory(repositoryProvider);
  }

  public static MyBusinessesViewModel newInstance(MyBusinessRepository repository) {
    return new MyBusinessesViewModel(repository);
  }
}
