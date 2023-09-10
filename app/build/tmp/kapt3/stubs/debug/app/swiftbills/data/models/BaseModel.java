package app.swiftbills.data.models;

import com.google.firebase.firestore.Exclude;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u00020\u00038\u0017X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lapp/swiftbills/data/models/BaseModel;", "", "id", "", "(Ljava/lang/String;)V", "createdAt", "", "getCreatedAt", "()J", "setCreatedAt", "(J)V", "getId", "()Ljava/lang/String;", "setId", "updatedAt", "getUpdatedAt", "setUpdatedAt", "app_debug"})
public abstract class BaseModel {
    @org.jetbrains.annotations.NotNull
    private java.lang.String id;
    private long createdAt;
    private long updatedAt;
    
    public BaseModel() {
        super();
    }
    
    public BaseModel(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @com.google.firebase.firestore.Exclude
    public java.lang.String getId() {
        return null;
    }
    
    public void setId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final long getCreatedAt() {
        return 0L;
    }
    
    public final void setCreatedAt(long p0) {
    }
    
    public final long getUpdatedAt() {
        return 0L;
    }
    
    public final void setUpdatedAt(long p0) {
    }
}