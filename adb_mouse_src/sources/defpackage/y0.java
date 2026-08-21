package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class y0 extends mn {
    @Override // defpackage.mn
    public final void I(z0 z0Var, z0 z0Var2) {
        z0Var.b = z0Var2;
    }

    @Override // defpackage.mn
    public final void J(z0 z0Var, Thread thread) {
        z0Var.a = thread;
    }

    @Override // defpackage.mn
    public final boolean f(a1 a1Var, w0 w0Var) {
        w0 w0Var2 = w0.b;
        synchronized (a1Var) {
            try {
                if (a1Var.d == w0Var) {
                    a1Var.d = w0Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mn
    public final boolean g(a1 a1Var, Object obj, Object obj2) {
        synchronized (a1Var) {
            try {
                if (a1Var.c == obj) {
                    a1Var.c = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mn
    public final boolean h(a1 a1Var, z0 z0Var, z0 z0Var2) {
        synchronized (a1Var) {
            try {
                if (a1Var.e == z0Var) {
                    a1Var.e = z0Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
