package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class e9 implements vc0 {
    public static final e9 a = new Object();
    public static final qv b;

    /* JADX WARN: Type inference failed for: r0v0, types: [e9, java.lang.Object] */
    static {
        v8 v8Var = new v8(1);
        HashMap hashMap = new HashMap();
        hashMap.put(tf0.class, v8Var);
        b = new qv("storageMetrics", Collections.unmodifiableMap(new HashMap(hashMap)));
    }

    @Override // defpackage.zt
    public final void a(Object obj, Object obj2) {
        ((wc0) obj2).a(b, ((xz) obj).a);
    }
}
