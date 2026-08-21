package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class r31 extends f31 {
    public final zq0 b;

    public r31(zq0 zq0Var) {
        super(4);
        this.b = zq0Var;
    }

    @Override // defpackage.f31
    public final boolean a(y21 y21Var) {
        if (y21Var.f.get(null) == null) {
            return false;
        }
        c.a();
        return false;
    }

    @Override // defpackage.f31
    public final pv[] b(y21 y21Var) {
        if (y21Var.f.get(null) == null) {
            return null;
        }
        c.a();
        return null;
    }

    @Override // defpackage.f31
    public final void c(Status status) {
        this.b.a(new b5(status));
    }

    @Override // defpackage.f31
    public final void d(Exception exc) {
        this.b.a(exc);
    }

    @Override // defpackage.f31
    public final void e(y21 y21Var) {
        try {
            h(y21Var);
        } catch (DeadObjectException e) {
            c(f31.g(e));
            throw e;
        } catch (RemoteException e2) {
            c(f31.g(e2));
        } catch (RuntimeException e3) {
            this.b.a(e3);
        }
    }

    public final void h(y21 y21Var) {
        if (y21Var.f.remove(null) == null) {
            zq0 zq0Var = this.b;
            Boolean bool = Boolean.FALSE;
            va1 va1Var = zq0Var.a;
            synchronized (va1Var.a) {
                try {
                    if (va1Var.c) {
                        return;
                    }
                    va1Var.c = true;
                    va1Var.d = bool;
                    va1Var.b.f(va1Var);
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c.a();
    }

    @Override // defpackage.f31
    public final /* bridge */ /* synthetic */ void f(jp0 jp0Var, boolean z) {
    }
}
