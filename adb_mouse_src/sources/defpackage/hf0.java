package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class hf0 extends m0 implements hg, um0 {
    public final he f;

    public hf0(dl dlVar, he heVar) {
        super(dlVar, true);
        this.f = heVar;
    }

    @Override // defpackage.m0
    public final void R(Throwable th, boolean z) {
        if (!this.f.f(th, false) && !z) {
            f20.J(this.e, th);
        }
    }

    @Override // defpackage.m0
    public final void S(Object obj) {
        this.f.f(null, false);
    }

    @Override // defpackage.um0
    public final Object a(qk qkVar, Object obj) {
        return this.f.a(qkVar, obj);
    }

    @Override // defpackage.um0
    public final Object i(Object obj) {
        return this.f.i(tp.a);
    }

    @Override // defpackage.q30, defpackage.hg
    public final void j(CancellationException cancellationException) {
        Object obj = q30.c.get(this);
        if (!(obj instanceof ui)) {
            if (!(obj instanceof p30) || !((p30) obj).e()) {
                if (cancellationException == null) {
                    cancellationException = new k30(q(), null, this);
                }
                o(cancellationException);
            }
        }
    }

    @Override // defpackage.q30
    public final void o(CancellationException cancellationException) {
        this.f.f(cancellationException, true);
        n(cancellationException);
    }
}
