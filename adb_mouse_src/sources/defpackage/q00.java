package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class q00 extends d01 {
    @Override // defpackage.xo
    public final void a(xo xoVar) {
        zo zoVar = this.h;
        if (!zoVar.c || zoVar.j) {
            return;
        }
        zoVar.d((int) ((((zo) zoVar.l.get(0)).g * ((p00) this.b).q0) + 0.5f));
    }

    @Override // defpackage.d01
    public final void d() {
        ak akVar = this.b;
        p00 p00Var = (p00) akVar;
        int i = p00Var.r0;
        int i2 = p00Var.s0;
        int i3 = p00Var.u0;
        zo zoVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                zoVar.l.add(akVar.T.d.h);
                this.b.T.d.h.k.add(zoVar);
                zoVar.f = i;
            } else if (i2 != -1) {
                zoVar.l.add(akVar.T.d.i);
                this.b.T.d.i.k.add(zoVar);
                zoVar.f = -i2;
            } else {
                zoVar.b = true;
                zoVar.l.add(akVar.T.d.i);
                this.b.T.d.i.k.add(zoVar);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            zoVar.l.add(akVar.T.e.h);
            this.b.T.e.h.k.add(zoVar);
            zoVar.f = i;
        } else if (i2 != -1) {
            zoVar.l.add(akVar.T.e.i);
            this.b.T.e.i.k.add(zoVar);
            zoVar.f = -i2;
        } else {
            zoVar.b = true;
            zoVar.l.add(akVar.T.e.i);
            this.b.T.e.i.k.add(zoVar);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.d01
    public final void e() {
        ak akVar = this.b;
        int i = ((p00) akVar).u0;
        zo zoVar = this.h;
        if (i == 1) {
            akVar.Y = zoVar.g;
        } else {
            akVar.Z = zoVar.g;
        }
    }

    @Override // defpackage.d01
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.d01
    public final boolean k() {
        return false;
    }

    public final void m(zo zoVar) {
        zo zoVar2 = this.h;
        zoVar2.k.add(zoVar);
        zoVar.l.add(zoVar2);
    }
}
