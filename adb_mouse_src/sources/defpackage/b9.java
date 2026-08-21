package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class b9 implements vc0 {
    public static final b9 a = new Object();
    public static final qv b = qv.a("requestTimeMs");
    public static final qv c = qv.a("requestUptimeMs");
    public static final qv d = qv.a("clientInfo");
    public static final qv e = qv.a("logSource");
    public static final qv f = qv.a("logSourceName");
    public static final qv g = qv.a("logEvent");
    public static final qv h = qv.a("qosTier");

    @Override // defpackage.zt
    public final void a(Object obj, Object obj2) {
        n70 n70Var = (n70) obj;
        wc0 wc0Var = (wc0) obj2;
        wc0Var.d(b, ((w9) n70Var).a);
        w9 w9Var = (w9) n70Var;
        wc0Var.d(c, w9Var.b);
        wc0Var.a(d, w9Var.c);
        wc0Var.a(e, w9Var.d);
        wc0Var.a(f, w9Var.e);
        wc0Var.a(g, w9Var.f);
        wc0Var.a(h, cg0.c);
    }
}
