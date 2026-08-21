package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class y00 extends gl implements wo {
    public final Handler e;
    public final boolean f;
    public final y00 g;

    public y00(Handler handler, boolean z) {
        y00 y00Var;
        this.e = handler;
        this.f = z;
        if (z) {
            y00Var = this;
        } else {
            y00Var = new y00(handler, true);
        }
        this.g = y00Var;
    }

    @Override // defpackage.wo
    public final void a(ff ffVar) {
        m61 m61Var = new m61(ffVar, 7, this);
        if (this.e.postDelayed(m61Var, 2000L)) {
            ffVar.u(new cf(0, new x00(this, m61Var)));
        } else {
            e(ffVar.g, m61Var);
        }
    }

    @Override // defpackage.gl
    public final void b(dl dlVar, Runnable runnable) {
        if (!this.e.post(runnable)) {
            e(dlVar, runnable);
        }
    }

    @Override // defpackage.gl
    public final boolean c(dl dlVar) {
        if (this.f && k20.c(Looper.myLooper(), this.e.getLooper())) {
            return false;
        }
        return true;
    }

    public final void e(dl dlVar, Runnable runnable) {
        mn.e(dlVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        ho hoVar = yq.a;
        un.e.b(dlVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y00) {
            y00 y00Var = (y00) obj;
            if (y00Var.e == this.e && y00Var.f == this.f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int identityHashCode = System.identityHashCode(this.e);
        if (this.f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i ^ identityHashCode;
    }

    @Override // defpackage.gl
    public final String toString() {
        y00 y00Var;
        String str;
        ho hoVar = yq.a;
        y00 y00Var2 = p80.a;
        if (this == y00Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                y00Var = y00Var2.g;
            } catch (UnsupportedOperationException unused) {
                y00Var = null;
            }
            if (this == y00Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String handler = this.e.toString();
            if (this.f) {
                return handler + ".immediate";
            }
            return handler;
        }
        return str;
    }
}
