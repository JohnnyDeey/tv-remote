package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ia1 extends hi0 {
    @Override // defpackage.hi0
    public final void r(ja1 ja1Var, ja1 ja1Var2) {
        ja1Var.b = ja1Var2;
    }

    @Override // defpackage.hi0
    public final void s(ja1 ja1Var, Thread thread) {
        ja1Var.a = thread;
    }

    @Override // defpackage.hi0
    public final boolean t(na1 na1Var, m81 m81Var, m81 m81Var2) {
        synchronized (na1Var) {
            try {
                if (na1Var.d == m81Var) {
                    na1Var.d = m81Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hi0
    public final boolean u(na1 na1Var, Object obj, Object obj2) {
        synchronized (na1Var) {
            try {
                if (na1Var.c == obj) {
                    na1Var.c = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hi0
    public final boolean w(na1 na1Var, ja1 ja1Var, ja1 ja1Var2) {
        synchronized (na1Var) {
            try {
                if (na1Var.e == ja1Var) {
                    na1Var.e = ja1Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
