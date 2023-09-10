// Generated by Dagger (https://dagger.dev).
package app.swiftbills.data.home;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
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
public final class TaxRepositoryImpl_Factory implements Factory<TaxRepositoryImpl> {
  private final Provider<FirebaseAuth> authProvider;

  private final Provider<FirebaseFirestore> firestoreProvider;

  public TaxRepositoryImpl_Factory(Provider<FirebaseAuth> authProvider,
      Provider<FirebaseFirestore> firestoreProvider) {
    this.authProvider = authProvider;
    this.firestoreProvider = firestoreProvider;
  }

  @Override
  public TaxRepositoryImpl get() {
    return newInstance(authProvider.get(), firestoreProvider.get());
  }

  public static TaxRepositoryImpl_Factory create(Provider<FirebaseAuth> authProvider,
      Provider<FirebaseFirestore> firestoreProvider) {
    return new TaxRepositoryImpl_Factory(authProvider, firestoreProvider);
  }

  public static TaxRepositoryImpl newInstance(FirebaseAuth auth, FirebaseFirestore firestore) {
    return new TaxRepositoryImpl(auth, firestore);
  }
}