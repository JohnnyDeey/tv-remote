package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class b61 extends wg0 {
    @Override // defpackage.wg0
    public final z51 C(x61 x61Var) {
        z51 z51Var;
        z51 z51Var2 = z51.d;
        synchronized (x61Var) {
            try {
                z51Var = x61Var.d;
                if (z51Var != z51Var2) {
                    x61Var.d = z51Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z51Var;
    }

    @Override // defpackage.wg0
    public final d61 E(x61 x61Var) {
        d61 d61Var;
        d61 d61Var2 = d61.c;
        synchronized (x61Var) {
            try {
                d61Var = x61Var.e;
                if (d61Var != d61Var2) {
                    x61Var.e = d61Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d61Var;
    }

    @Override // defpackage.wg0
    public final void G(d61 d61Var, d61 d61Var2) {
        d61Var.b = d61Var2;
    }

    @Override // defpackage.wg0
    public final void I(d61 d61Var, Thread thread) {
        d61Var.a = thread;
    }

    @Override // defpackage.wg0
    public final boolean J(x61 x61Var, z51 z51Var, z51 z51Var2) {
        synchronized (x61Var) {
            try {
                if (x61Var.d == z51Var) {
                    x61Var.d = z51Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wg0
    public final boolean L(e61 e61Var, Object obj, Object obj2) {
        synchronized (e61Var) {
            try {
                if (e61Var.c == obj) {
                    e61Var.c = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wg0
    public final boolean M(e61 e61Var, d61 d61Var, d61 d61Var2) {
        synchronized (e61Var) {
            try {
                if (e61Var.e == d61Var) {
                    e61Var.e = d61Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
