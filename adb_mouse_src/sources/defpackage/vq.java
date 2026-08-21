package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class vq extends xq implements nl, qk {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(vq.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final gl f;
    public final rk g;
    public Object h;
    public final Object i;

    public vq(gl glVar, rk rkVar) {
        super(-1);
        this.f = glVar;
        this.g = rkVar;
        this.h = mn.b;
        this.i = wv0.Y(rkVar.d());
    }

    @Override // defpackage.nl
    public final nl c() {
        return this.g;
    }

    @Override // defpackage.qk
    public final dl d() {
        return this.g.d();
    }

    @Override // defpackage.qk
    public final void e(Object obj) {
        Object uiVar;
        Throwable a = tj0.a(obj);
        if (a == null) {
            uiVar = obj;
        } else {
            uiVar = new ui(a, false);
        }
        rk rkVar = this.g;
        dl d = rkVar.d();
        gl glVar = this.f;
        if (glVar.c(d)) {
            this.h = uiVar;
            this.e = 0;
            glVar.b(rkVar.d(), this);
            return;
        }
        pu a2 = tr0.a();
        if (a2.e >= 4294967296L) {
            this.h = uiVar;
            this.e = 0;
            h8 h8Var = a2.g;
            if (h8Var == null) {
                h8Var = new h8();
                a2.g = h8Var;
            }
            h8Var.addLast(this);
            return;
        }
        a2.n(true);
        try {
            dl d2 = rkVar.d();
            Object c0 = wv0.c0(d2, this.i);
            try {
                rkVar.e(obj);
                do {
                } while (a2.q());
            } finally {
                wv0.W(d2, c0);
            }
        } catch (Throwable th) {
            try {
                i(th);
            } finally {
                a2.e();
            }
        }
    }

    @Override // defpackage.xq
    public final Object j() {
        Object obj = this.h;
        this.h = mn.b;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f + ", " + mn.S(this.g) + ']';
    }

    @Override // defpackage.xq
    public final qk f() {
        return this;
    }
}
