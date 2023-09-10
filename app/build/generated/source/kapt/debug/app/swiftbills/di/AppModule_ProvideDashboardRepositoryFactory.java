// Generated by Dagger (https://dagger.dev).
package app.swiftbills.di;

import app.swiftbills.data.home.DashboardRepository;
import app.swiftbills.data.home.DashboardRepositoryImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideDashboardRepositoryFactory implements Factory<DashboardRepository> {
  private final AppModule module;

  private final Provider<DashboardRepositoryImpl> implProvider;

  public AppModule_ProvideDashboardRepositoryFactory(AppModule module,
      Provider<DashboardRepositoryImpl> implProvider) {
    this.module = module;
    this.implProvider = implProvider;
  }

  @Override
  public DashboardRepository get() {
    return provideDashboardRepository(module, implProvider.get());
  }

  public static AppModule_ProvideDashboardRepositoryFactory create(AppModule module,
      Provider<DashboardRepositoryImpl> implProvider) {
    return new AppModule_ProvideDashboardRepositoryFactory(module, implProvider);
  }

  public static DashboardRepository provideDashboardRepository(AppModule instance,
      DashboardRepositoryImpl impl) {
    return Preconditions.checkNotNullFromProvides(instance.provideDashboardRepository(impl));
  }
}
