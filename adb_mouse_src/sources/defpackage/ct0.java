package defpackage;

/* loaded from: classes.dex */
public final class ct0 extends c1 {
    public qo c;
    public byte[] d;
    public j e;
    public jk0 f;
    public fs0 g;

    @Override // defpackage.c1
    public final void a(nq nqVar) {
        this.d.getClass();
        throw null;
    }

    @Override // defpackage.c1
    public final i30 b() {
        throw null;
    }

    @Override // defpackage.c1
    public final void d(s20 s20Var) {
        throw new us0((short) 80, null, null);
    }

    @Override // defpackage.c1
    public final void e(wf wfVar) {
        if (this.a == 15) {
            wfVar.b(0).h();
            return;
        }
        throw new us0((short) 10, null, null);
    }

    @Override // defpackage.c1
    public final void f(a10 a10Var) {
        this.d = ht0.K(ht0.P(a10Var), a10Var);
        int i = this.a;
        if (i == 14) {
            this.e = wg0.x(this.b, this.c, a10Var);
            byte[] L = ht0.L(a10Var);
            g30 g30Var = new g30(0, new jy(this.b.a, this.e));
            this.g = g30Var;
            g30Var.c(L);
            return;
        }
        if (i == 24) {
            this.f = gi0.l(this.b, a10Var);
            byte[] N = ht0.N(a10Var);
            this.g = this.b.a.n(this.f).j();
            gi0.d(this.f.b, N);
            this.g.c(N);
        }
    }

    @Override // defpackage.c1
    public final boolean g() {
        int i = this.a;
        if (i != 14 && i != 24) {
            return false;
        }
        return true;
    }

    @Override // defpackage.c1
    public final void i() {
        if (this.a != 15) {
        } else {
            throw new us0((short) 80, null, null);
        }
    }
}
