package defpackage;

/* loaded from: classes.dex */
public final class dn extends b0 {
    public int f;

    public dn(i[] iVarArr) {
        super(false, iVarArr);
        this.f = -1;
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        vVar.p(49, z);
        cn d = vVar.d();
        i[] iVarArr = this.c;
        int length = iVarArr.length;
        int i = 0;
        if (this.f < 0 && length <= 16) {
            x[] xVarArr = new x[length];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                x p = iVarArr[i3].c().p();
                xVarArr[i3] = p;
                i2 += p.l(true);
            }
            this.f = i2;
            vVar.k(i2);
            while (i < length) {
                d.q(xVarArr[i]);
                i++;
            }
            return;
        }
        vVar.k(t());
        while (i < length) {
            d.q(iVarArr[i].c());
            i++;
        }
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        return v.f(t(), z);
    }

    public final int t() {
        if (this.f < 0) {
            int i = 0;
            for (i iVar : this.c) {
                i += iVar.c().p().l(true);
            }
            this.f = i;
        }
        return this.f;
    }

    @Override // defpackage.b0, defpackage.x
    public final x p() {
        return this;
    }
}
