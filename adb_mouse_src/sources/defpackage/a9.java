package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class a9 implements vc0 {
    public static final a9 a = new Object();
    public static final qv b = qv.a("eventTimeMs");
    public static final qv c = qv.a("eventCode");
    public static final qv d = qv.a("eventUptimeMs");
    public static final qv e = qv.a("sourceExtension");
    public static final qv f = qv.a("sourceExtensionJsonProto3");
    public static final qv g = qv.a("timezoneOffsetSeconds");
    public static final qv h = qv.a("networkConnectionInfo");

    @Override // defpackage.zt
    public final void a(Object obj, Object obj2) {
        k70 k70Var = (k70) obj;
        wc0 wc0Var = (wc0) obj2;
        wc0Var.d(b, ((v9) k70Var).a);
        v9 v9Var = (v9) k70Var;
        wc0Var.a(c, v9Var.b);
        wc0Var.d(d, v9Var.c);
        wc0Var.a(e, v9Var.d);
        wc0Var.a(f, v9Var.e);
        wc0Var.d(g, v9Var.f);
        wc0Var.a(h, v9Var.g);
    }
}
