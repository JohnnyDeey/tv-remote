package defpackage;

/* loaded from: classes.dex */
public final class vb extends a0 {
    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        vVar.n(z, 48, this.c);
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 3;
        }
        int length = this.c.length;
        for (int i2 = 0; i2 < length; i2++) {
            i += this.c[i2].c().l(true);
        }
        return i;
    }

    @Override // defpackage.a0
    public final e v() {
        return new qb(q());
    }

    @Override // defpackage.a0
    public final t w() {
        t[] r = r();
        return new tb(tb.r(r), r);
    }

    @Override // defpackage.a0
    public final b0 x() {
        return new b0(false, this.c);
    }
}
