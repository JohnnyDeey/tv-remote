package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import androidx.lifecycle.a;
import androidx.savedstate.Recreator;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import javax.crypto.spec.DHParameterSpec;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class jy {
    public boolean a;
    public final Object b;
    public Object c;

    public jy(rd rdVar, j jVar) {
        xm xmVar;
        DHParameterSpec z;
        int i = jVar.b;
        if (i >= 0) {
            xmVar = wg0.p(i);
        } else {
            xmVar = (xm) jVar.c;
        }
        if (xmVar != null && (z = wv0.z(rdVar, xmVar)) != null) {
            this.b = rdVar;
            this.c = z;
            this.a = jVar.a;
            return;
        }
        c.k("No DH configuration provided");
        throw null;
    }

    public BigInteger a(byte[] bArr) {
        if (this.a && (((DHParameterSpec) this.c).getP().bitLength() + 7) / 8 != bArr.length) {
            throw new us0((short) 47, null, null);
        }
        return new BigInteger(1, bArr);
    }

    public void b(z4 z4Var, zq0 zq0Var) {
        sb0 sb0Var = (sb0) ((sb0) this.c).c;
        sb0Var.getClass();
        s31 s31Var = (s31) ((w31) z4Var).q();
        er0 er0Var = (er0) sb0Var.c;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(s31Var.c);
        int i = e31.a;
        if (er0Var == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            er0Var.writeToParcel(obtain, 0);
        }
        try {
            s31Var.b.transact(1, obtain, null, 1);
            obtain.recycle();
            va1 va1Var = zq0Var.a;
            synchronized (va1Var.a) {
                va1Var.a();
                va1Var.c = true;
                va1Var.d = null;
            }
            va1Var.b.f(va1Var);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public void c() {
        yl0 yl0Var = (yl0) this.b;
        a e = yl0Var.e();
        if (e.d == m50.d) {
            e.a(new Recreator(yl0Var));
            final l5 l5Var = (l5) this.c;
            l5Var.getClass();
            if (!l5Var.c) {
                e.a(new p50() { // from class: vl0
                    @Override // defpackage.p50
                    public final void c(s50 s50Var, l50 l50Var) {
                        l5 l5Var2 = l5.this;
                        l5Var2.getClass();
                        if (l50Var == l50.ON_START) {
                            l5Var2.e = true;
                        } else if (l50Var == l50.ON_STOP) {
                            l5Var2.e = false;
                        }
                    }
                });
                l5Var.c = true;
                this.a = true;
                return;
            }
            c.o("SavedStateRegistry was already attached.");
            return;
        }
        c.o("Restarter must be created only during owner's initialization stage");
    }

    public void d(Bundle bundle) {
        Bundle bundle2;
        if (!this.a) {
            c();
        }
        a e = ((yl0) this.b).e();
        if (e.d.compareTo(m50.f) < 0) {
            l5 l5Var = (l5) this.c;
            if (l5Var.c) {
                if (!l5Var.d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    l5Var.a = bundle2;
                    l5Var.d = true;
                    return;
                }
                c.o("SavedStateRegistry was already restored.");
                return;
            }
            c.o("You must call performAttach() before calling performRestore(Bundle).");
            return;
        }
        f40.l(e.d, "performRestore cannot be called when owner is ");
    }

    public void e(Bundle bundle) {
        l5 l5Var = (l5) this.c;
        l5Var.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) l5Var.a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        sl0 sl0Var = (sl0) l5Var.f;
        sl0Var.getClass();
        ql0 ql0Var = new ql0(sl0Var);
        sl0Var.e.put(ql0Var, Boolean.FALSE);
        while (ql0Var.hasNext()) {
            Map.Entry entry = (Map.Entry) ql0Var.next();
            bundle2.putBundle((String) entry.getKey(), ((xl0) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public void f(va1 va1Var) {
        k91 k91Var;
        boolean z;
        synchronized (this.b) {
            if (((ArrayDeque) this.c) != null && !this.a) {
                this.a = true;
                while (true) {
                    synchronized (this.b) {
                        try {
                            k91Var = (k91) ((ArrayDeque) this.c).poll();
                            z = false;
                            if (k91Var == null) {
                                this.a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    synchronized (k91Var.b) {
                    }
                    k91Var.a.execute(new m61(k91Var, va1Var, 17, z));
                }
            }
        }
    }

    public jy() {
        this.b = new Object();
    }

    public jy(sb0 sb0Var, pv[] pvVarArr, boolean z) {
        this.c = sb0Var;
        this.b = pvVarArr;
        boolean z2 = false;
        if (pvVarArr != null && z) {
            z2 = true;
        }
        this.a = z2;
    }

    public jy(yl0 yl0Var) {
        this.b = yl0Var;
        this.c = new l5();
    }

    public jy(cj cjVar, wi wiVar) {
        this.b = new Object();
        this.c = new ArrayList();
    }
}
