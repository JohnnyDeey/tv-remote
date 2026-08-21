package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.ArrayDeque;
import java.util.Map;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class q31 extends f31 {
    public final jy b;
    public final zq0 c;
    public final vj0 d;

    public q31(jy jyVar, zq0 zq0Var, vj0 vj0Var) {
        super(2);
        this.c = zq0Var;
        this.b = jyVar;
        this.d = vj0Var;
        if (!jyVar.a) {
            return;
        }
        c.k("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        throw null;
    }

    @Override // defpackage.f31
    public final boolean a(y21 y21Var) {
        return this.b.a;
    }

    @Override // defpackage.f31
    public final pv[] b(y21 y21Var) {
        return (pv[]) this.b.b;
    }

    @Override // defpackage.f31
    public final void c(Status status) {
        b5 b5Var;
        this.d.getClass();
        if (status.e != null) {
            b5Var = new b5(status);
        } else {
            b5Var = new b5(status);
        }
        this.c.a(b5Var);
    }

    @Override // defpackage.f31
    public final void d(Exception exc) {
        this.c.a(exc);
    }

    @Override // defpackage.f31
    public final void e(y21 y21Var) {
        zq0 zq0Var = this.c;
        try {
            this.b.b(y21Var.b, zq0Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            c(f31.g(e2));
        } catch (RuntimeException e3) {
            zq0Var.a(e3);
        }
    }

    @Override // defpackage.f31
    public final void f(jp0 jp0Var, boolean z) {
        zq0 zq0Var = this.c;
        ((Map) jp0Var.e).put(zq0Var, Boolean.valueOf(z));
        va1 va1Var = zq0Var.a;
        jp0 jp0Var2 = new jp0(jp0Var, zq0Var, 7, false);
        va1Var.getClass();
        k91 k91Var = new k91(ar0.a, jp0Var2);
        jy jyVar = va1Var.b;
        synchronized (jyVar.b) {
            try {
                if (((ArrayDeque) jyVar.c) == null) {
                    jyVar.c = new ArrayDeque();
                }
                ((ArrayDeque) jyVar.c).add(k91Var);
            } finally {
            }
        }
        synchronized (va1Var.a) {
            try {
                if (!va1Var.c) {
                    return;
                }
                va1Var.b.f(va1Var);
            } finally {
            }
        }
    }
}
