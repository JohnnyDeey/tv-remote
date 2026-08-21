package defpackage;

/* loaded from: classes.dex */
public final class q extends x {
    public final gm c;

    public q(gm gmVar) {
        this.c = gmVar;
    }

    @Override // defpackage.x, defpackage.p
    public final int hashCode() {
        return ~f20.K(this.c.c);
    }

    @Override // defpackage.x
    public final boolean i(x xVar) {
        if (!(xVar instanceof q)) {
            return false;
        }
        return this.c.i(((q) xVar).c);
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        vVar.p(7, z);
        vVar.m(25, false, this.c.c);
    }

    @Override // defpackage.x
    public final boolean k() {
        return false;
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        return this.c.l(z);
    }

    @Override // defpackage.x
    public final x o() {
        return this;
    }

    @Override // defpackage.x
    public final x p() {
        return this;
    }
}
