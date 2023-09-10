// Generated by Dagger (https://dagger.dev).
package app.swiftbills.data.auth;

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
public final class AuthRepositoryImpl_Factory implements Factory<AuthRepositoryImpl> {
  private final Provider<FirebaseAuth> firebaseAuthProvider;

  public AuthRepositoryImpl_Factory(Provider<FirebaseAuth> firebaseAuthProvider) {
    this.firebaseAuthProvider = firebaseAuthProvider;
  }

  @Override
  public AuthRepositoryImpl get() {
    return newInstance(firebaseAuthProvider.get());
  }

  public static AuthRepositoryImpl_Factory create(Provider<FirebaseAuth> firebaseAuthProvider) {
    return new AuthRepositoryImpl_Factory(firebaseAuthProvider);
  }

  public static AuthRepositoryImpl newInstance(FirebaseAuth firebaseAuth) {
    return new AuthRepositoryImpl(firebaseAuth);
  }
}
