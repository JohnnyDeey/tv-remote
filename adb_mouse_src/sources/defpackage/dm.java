package defpackage;

/* loaded from: classes.dex */
public final class dm extends x {
    public s c;
    public o d;
    public x e;
    public int f;
    public x g;
    public final /* synthetic */ int h = 0;

    public dm(a0 a0Var) {
        int i;
        i c;
        x c2;
        x r = r(a0Var, 0);
        if (r instanceof s) {
            this.c = (s) r;
            r = r(a0Var, 1);
            i = 1;
        } else {
            i = 0;
        }
        if (r instanceof o) {
            this.d = (o) r;
            i++;
            r = r(a0Var, i);
        }
        if (!(r instanceof yb)) {
            this.e = r;
            i++;
            r = r(a0Var, i);
        }
        if (a0Var.size() == i + 1) {
            if (r instanceof yb) {
                yb ybVar = (yb) r;
                int i2 = ybVar.e;
                if (i2 >= 0 && i2 <= 2) {
                    this.f = i2;
                    wv0.n(ybVar);
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                c2 = (e) e.d.d(ybVar, false);
                            } else {
                                c.k("invalid tag: ".concat(wv0.E(ybVar.d, i2)));
                                throw null;
                            }
                        } else {
                            c2 = (t) t.d.d(ybVar, false);
                        }
                    } else if (ybVar.r()) {
                        i iVar = ybVar.f;
                        if (iVar instanceof p) {
                            c = (p) iVar;
                        } else {
                            c = iVar.c();
                        }
                        c2 = c.c();
                    } else {
                        c.o("object implicit - explicit expected.");
                        throw null;
                    }
                    this.g = c2;
                    return;
                }
                c.k(qo0.m("invalid encoding value: ", i2));
                throw null;
            }
            c.k("No tagged object found in sequence. Structure doesn't seem to be of type External");
            throw null;
        }
        c.k("input sequence too large");
        throw null;
    }

    public static x r(a0 a0Var, int i) {
        if (a0Var.size() > i) {
            return a0Var.t(i).c();
        }
        c.k("too few objects in input sequence");
        return null;
    }

    @Override // defpackage.x, defpackage.p
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        s sVar = this.c;
        int i = 0;
        if (sVar == null) {
            hashCode = 0;
        } else {
            hashCode = sVar.hashCode();
        }
        o oVar = this.d;
        if (oVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = oVar.hashCode();
        }
        int i2 = hashCode ^ hashCode2;
        x xVar = this.e;
        if (xVar != null) {
            i = xVar.hashCode();
        }
        return this.g.hashCode() ^ ((i2 ^ i) ^ this.f);
    }

    @Override // defpackage.x
    public final boolean i(x xVar) {
        dm dmVar;
        s sVar;
        s sVar2;
        if (this != xVar) {
            if (!(xVar instanceof dm) || ((sVar = this.c) != (sVar2 = (dmVar = (dm) xVar).c) && (sVar == null || sVar2 == null || !sVar.equals(sVar2)))) {
                return false;
            }
            o oVar = this.d;
            o oVar2 = dmVar.d;
            if (oVar != oVar2 && (oVar == null || oVar2 == null || !oVar.equals(oVar2))) {
                return false;
            }
            x xVar2 = this.e;
            x xVar3 = dmVar.e;
            if ((xVar2 != xVar3 && (xVar2 == null || xVar3 == null || !xVar2.equals(xVar3))) || this.f != dmVar.f || !this.g.m(dmVar.g)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        vVar.p(40, z);
        q().j(vVar, false);
    }

    @Override // defpackage.x
    public final boolean k() {
        return true;
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        return q().l(z);
    }

    @Override // defpackage.x
    public x o() {
        switch (this.h) {
            case 0:
                return this;
            default:
                s sVar = this.c;
                o oVar = this.d;
                x xVar = this.e;
                int i = this.f;
                x xVar2 = this.g;
                dm dmVar = new dm();
                dmVar.c = sVar;
                dmVar.d = oVar;
                dmVar.e = xVar;
                if (i >= 0 && i <= 2) {
                    dmVar.f = i;
                    if (i == 1 ? !t.class.isInstance(xVar2) : i == 2 && !e.class.isInstance(xVar2)) {
                        c.o("unexpected object: ".concat(xVar2.getClass().getName()));
                    } else {
                        dmVar.g = xVar2;
                        return dmVar;
                    }
                } else {
                    c.k(qo0.m("invalid encoding value: ", i));
                }
                return null;
        }
    }

    @Override // defpackage.x
    public final x p() {
        int i = this.h;
        return this;
    }

    public final a0 q() {
        boolean z;
        boolean z2 = false;
        switch (this.h) {
            case 0:
                j jVar = new j(4);
                s sVar = this.c;
                if (sVar != null) {
                    jVar.d(sVar);
                }
                o oVar = this.d;
                if (oVar != null) {
                    jVar.d(oVar);
                }
                x xVar = this.e;
                if (xVar != null) {
                    jVar.d(xVar.o());
                }
                int i = this.f;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                jVar.d(new yb(z, i, this.g, 1));
                nm nmVar = new nm(jVar, 0);
                nmVar.f = -1;
                return nmVar;
            default:
                j jVar2 = new j(4);
                s sVar2 = this.c;
                if (sVar2 != null) {
                    jVar2.d(sVar2);
                }
                o oVar2 = this.d;
                if (oVar2 != null) {
                    jVar2.d(oVar2);
                }
                x xVar2 = this.e;
                if (xVar2 != null) {
                    jVar2.d(xVar2.p());
                }
                int i2 = this.f;
                if (i2 == 0) {
                    z2 = true;
                }
                jVar2.d(new yb(z2, i2, this.g, 2));
                nm nmVar2 = new nm(jVar2, 1);
                nmVar2.f = -1;
                return nmVar2;
        }
    }

    public /* synthetic */ dm() {
    }
}
