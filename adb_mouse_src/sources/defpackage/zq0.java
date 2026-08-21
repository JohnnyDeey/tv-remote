package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class zq0 {
    public final va1 a = new va1();

    public final void a(Exception exc) {
        va1 va1Var = this.a;
        va1Var.getClass();
        wv0.q(exc, "Exception must not be null");
        synchronized (va1Var.a) {
            try {
                if (va1Var.c) {
                    return;
                }
                va1Var.c = true;
                va1Var.e = exc;
                va1Var.b.f(va1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
