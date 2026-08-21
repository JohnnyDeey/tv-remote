package defpackage;

/* loaded from: classes.dex */
public final class nm extends a0 {
    public final /* synthetic */ int e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm(i[] iVarArr, int i) {
        super(iVarArr);
        this.e = i;
        switch (i) {
            case 1:
                return;
            default:
                if (iVarArr != null) {
                    for (i iVar : iVarArr) {
                        if (iVar != null) {
                        }
                    }
                    this.c = j.e(iVarArr);
                    this.f = -1;
                    return;
                }
                c.g("'elements' cannot be null, or contain null");
                throw null;
        }
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        int i = 0;
        switch (this.e) {
            case 0:
                vVar.p(48, z);
                lm c = vVar.c();
                int length = this.c.length;
                if (this.f < 0 && length <= 16) {
                    x[] xVarArr = new x[length];
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        x o = this.c[i3].c().o();
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
                vVar.k(y());
                while (i < length) {
                    this.c[i].c().o().j(c, true);
                    i++;
                }
                return;
            default:
                vVar.p(48, z);
                cn d = vVar.d();
                int length2 = this.c.length;
                if (this.f < 0 && length2 <= 16) {
                    x[] xVarArr2 = new x[length2];
                    int i4 = 0;
                    for (int i5 = 0; i5 < length2; i5++) {
                        x p = this.c[i5].c().p();
                        xVarArr2[i5] = p;
                        i4 += p.l(true);
                    }
                    this.f = i4;
                    vVar.k(i4);
                    while (i < length2) {
                        d.q(xVarArr2[i]);
                        i++;
                    }
                    return;
                }
                vVar.k(z());
                while (i < length2) {
                    d.q(this.c[i].c());
                    i++;
                }
                return;
        }
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        switch (this.e) {
            case 0:
                return v.f(y(), z);
            default:
                return v.f(z(), z);
        }
    }

    @Override // defpackage.a0, defpackage.x
    public x o() {
        switch (this.e) {
            case 0:
                return this;
            default:
                return super.o();
        }
    }

    @Override // defpackage.a0, defpackage.x
    public final x p() {
        int i = this.e;
        return this;
    }

    @Override // defpackage.a0
    public final e v() {
        byte b = 0;
        switch (this.e) {
            case 0:
                return new cm(qb.u(q()), b, b);
            default:
                return new cm(qb.u(q()), 1, b);
        }
    }

    @Override // defpackage.a0
    public final t w() {
        switch (this.e) {
            case 0:
                return new t(tb.r(r()));
            default:
                return new t(tb.r(r()));
        }
    }

    @Override // defpackage.a0
    public final b0 x() {
        switch (this.e) {
            case 0:
                return new dn(this.c);
            default:
                return new dn(this.c);
        }
    }

    public int y() {
        if (this.f < 0) {
            int length = this.c.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.c[i2].c().o().l(true);
            }
            this.f = i;
        }
        return this.f;
    }

    public int z() {
        if (this.f < 0) {
            int length = this.c.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.c[i2].c().p().l(true);
            }
            this.f = i;
        }
        return this.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nm(i iVar, int i) {
        super(iVar);
        this.e = i;
    }

    public nm(i iVar, i iVar2) {
        this.e = 0;
        if (iVar == null) {
            c.g("'element1' cannot be null");
            throw null;
        }
        if (iVar2 != null) {
            this.c = new i[]{iVar, iVar2};
            this.f = -1;
        } else {
            c.g("'element2' cannot be null");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nm(j jVar, int i) {
        super(jVar);
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nm(boolean z, i[] iVarArr) {
        super(iVarArr);
        this.e = 0;
    }
}
