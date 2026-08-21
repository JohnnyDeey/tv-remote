package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class d9 implements vc0 {
    public static final d9 a = new Object();
    public static final qv b;
    public static final qv c;
    public static final qv d;
    public static final qv e;

    /* JADX WARN: Type inference failed for: r0v0, types: [d9, java.lang.Object] */
    static {
        v8 v8Var = new v8(1);
        HashMap hashMap = new HashMap();
        hashMap.put(tf0.class, v8Var);
        b = new qv("window", Collections.unmodifiableMap(new HashMap(hashMap)));
        v8 v8Var2 = new v8(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(tf0.class, v8Var2);
        c = new qv("logSourceMetrics", Collections.unmodifiableMap(new HashMap(hashMap2)));
        v8 v8Var3 = new v8(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(tf0.class, v8Var3);
        d = new qv("globalMetrics", Collections.unmodifiableMap(new HashMap(hashMap3)));
        v8 v8Var4 = new v8(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(tf0.class, v8Var4);
        e = new qv("appNamespace", Collections.unmodifiableMap(new HashMap(hashMap4)));
    }

    @Override // defpackage.zt
    public final void a(Object obj, Object obj2) {
        wh whVar = (wh) obj;
        wc0 wc0Var = (wc0) obj2;
        wc0Var.a(b, whVar.a);
        wc0Var.a(c, whVar.b);
        wc0Var.a(d, whVar.c);
        wc0Var.a(e, whVar.d);
    }
}
