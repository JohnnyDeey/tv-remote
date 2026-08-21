package defpackage;

/* loaded from: classes.dex */
public final class om extends b0 {
    public int f;

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        vVar.p(49, z);
        lm c = vVar.c();
        i[] iVarArr = this.c;
        int length = iVarArr.length;
        int i = 0;
        if (this.f < 0 && length <= 16) {
            x[] xVarArr = new x[length];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                x o = iVarArr[i3].c().o();
                xVarArr[i3] = o;
                i2 += o.l(true);
            }
            this.f = i2;
            vVar.k(i2);
            while (i < length) {
                xVarArr[i].j(c, true);
                i++;
            }
            return;
        }
        vVar.k(t());
        while (i < length) {
            iVarArr[i].c().o().j(c, true);
            i++;
        }
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        return v.f(t(), z);
    }

    @Override // defpackage.b0, defpackage.x
    public final x o() {
        if (this.d != null) {
            return this;
        }
        return super.o();
    }

    public final int t() {
        if (this.f < 0) {
            int i = 0;
            for (i iVar : this.c) {
                i += iVar.c().o().l(true);
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
