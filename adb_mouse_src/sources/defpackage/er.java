package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class er implements yf0 {
    public static final Object e = new Object();
    public volatile zu c;
    public volatile Object d;

    /* JADX WARN: Type inference failed for: r0v1, types: [yf0, java.lang.Object, er] */
    public static yf0 a(zu zuVar) {
        if (zuVar instanceof er) {
            return zuVar;
        }
        ?? obj = new Object();
        obj.d = e;
        obj.c = zuVar;
        return obj;
    }

    @Override // defpackage.yf0
    public final Object get() {
        Object obj;
        Object obj2 = this.d;
        Object obj3 = e;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.d;
                    if (obj == obj3) {
                        obj = this.c.get();
                        Object obj4 = this.d;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.d = obj;
                        this.c = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return obj;
        }
        return obj2;
    }
}
