package defpackage;

/* loaded from: classes.dex */
public final class xb extends b0 {
    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        vVar.n(z, 49, this.c);
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 3;
        }
        for (i iVar : this.c) {
            i += iVar.c().l(true);
        }
        return i;
    }
}
