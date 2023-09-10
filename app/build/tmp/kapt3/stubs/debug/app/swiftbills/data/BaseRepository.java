package app.swiftbills.data;

import app.swiftbills.data.models.BaseModel;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lapp/swiftbills/data/BaseRepository;", "T", "Lapp/swiftbills/data/models/BaseModel;", "", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "dbNode", "", "(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/lang/String;)V", "currentUser", "Lcom/google/firebase/auth/FirebaseUser;", "db", "Lcom/google/firebase/firestore/CollectionReference;", "getDb", "()Lcom/google/firebase/firestore/CollectionReference;", "getData", "", "snapshot", "Lcom/google/firebase/firestore/QuerySnapshot;", "model", "Ljava/lang/Class;", "app_debug"})
public abstract class BaseRepository<T extends app.swiftbills.data.models.BaseModel> {
    private final com.google.firebase.auth.FirebaseUser currentUser = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.firestore.CollectionReference db = null;
    
    public BaseRepository(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth auth, @org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firestore, @org.jetbrains.annotations.NotNull
    java.lang.String dbNode) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.google.firebase.firestore.CollectionReference getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<T> getData(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.QuerySnapshot snapshot, @org.jetbrains.annotations.NotNull
    java.lang.Class<T> model) {
        return null;
    }
}