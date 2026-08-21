package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class g9 implements vc0 {
    public static final g9 a = new Object();
    public static final qv b;
    public static final qv c;

    /* JADX WARN: Type inference failed for: r0v0, types: [g9, java.lang.Object] */
    static {
        v8 v8Var = new v8(1);
        HashMap hashMap = new HashMap();
        hashMap.put(tf0.class, v8Var);
        b = new qv("logSource", Collections.unmodifiableMap(new HashMap(hashMap)));
        v8 v8Var2 = new v8(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(tf0.class, v8Var2);
        c = new qv("logEventDropped", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // defpackage.zt
    public final void a(Object obj, Object obj2) {
        o70 o70Var = (o70) obj;
        wc0 wc0Var = (wc0) obj2;
        wc0Var.a(b, o70Var.a);
        wc0Var.a(c, o70Var.b);
    }
}
