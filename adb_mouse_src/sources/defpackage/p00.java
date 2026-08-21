package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class p00 extends ak {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public mj t0 = this.J;
    public int u0 = 0;
    public boolean v0;

    public p00() {
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    @Override // defpackage.ak
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.ak
    public final boolean B() {
        return this.v0;
    }

    @Override // defpackage.ak
    public final void Q(e60 e60Var, boolean z) {
        if (this.T == null) {
            return;
        }
        mj mjVar = this.t0;
        e60Var.getClass();
        int n = e60.n(mjVar);
        if (this.u0 == 1) {
            this.Y = n;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = n;
        O(this.T.q());
        L(0);
    }

    public final void R(int i) {
        this.t0.l(i);
        this.v0 = true;
    }

    public final void S(int i) {
        if (this.u0 != i) {
            this.u0 = i;
            ArrayList arrayList = this.R;
            arrayList.clear();
            if (this.u0 == 1) {
                this.t0 = this.I;
            } else {
                this.t0 = this.J;
            }
            arrayList.add(this.t0);
            mj[] mjVarArr = this.Q;
            int length = mjVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                mjVarArr[i2] = this.t0;
            }
        }
    }

    @Override // defpackage.ak
    public final void b(e60 e60Var, boolean z) {
        boolean z2;
        bk bkVar = (bk) this.T;
        if (bkVar != null) {
            Object i = bkVar.i(2);
            Object i2 = bkVar.i(4);
            ak akVar = this.T;
            boolean z3 = true;
            if (akVar != null && akVar.p0[0] == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.u0 == 0) {
                i = bkVar.i(3);
                i2 = bkVar.i(5);
                ak akVar2 = this.T;
                if (akVar2 == null || akVar2.p0[1] != 2) {
                    z3 = false;
                }
                z2 = z3;
            }
            if (this.v0) {
                mj mjVar = this.t0;
                if (mjVar.c) {
                    ro0 k = e60Var.k(mjVar);
                    e60Var.d(k, this.t0.d());
                    if (this.r0 != -1) {
                        if (z2) {
                            e60Var.f(e60Var.k(i2), k, 0, 5);
                        }
                    } else if (this.s0 != -1 && z2) {
                        ro0 k2 = e60Var.k(i2);
                        e60Var.f(k, e60Var.k(i), 0, 5);
                        e60Var.f(k2, k, 0, 5);
                    }
                    this.v0 = false;
                    return;
                }
            }
            if (this.r0 != -1) {
                ro0 k3 = e60Var.k(this.t0);
                e60Var.e(k3, e60Var.k(i), this.r0, 8);
                if (z2) {
                    e60Var.f(e60Var.k(i2), k3, 0, 5);
                    return;
                }
                return;
            }
            if (this.s0 != -1) {
                ro0 k4 = e60Var.k(this.t0);
                ro0 k5 = e60Var.k(i2);
                e60Var.e(k4, k5, -this.s0, 8);
                if (z2) {
                    e60Var.f(k4, e60Var.k(i), 0, 5);
                    e60Var.f(k5, k4, 0, 5);
                    return;
                }
                return;
            }
            if (this.q0 != -1.0f) {
                ro0 k6 = e60Var.k(this.t0);
                ro0 k7 = e60Var.k(i2);
                float f = this.q0;
                o8 l = e60Var.l();
                l.d.g(k6, -1.0f);
                l.d.g(k7, f);
                e60Var.c(l);
            }
        }
    }

    @Override // defpackage.ak
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ak
    public final mj i(int i) {
        int C = qo0.C(i);
        if (C != 1) {
            if (C != 2) {
                if (C != 3) {
                    if (C != 4) {
                        return null;
                    }
                }
            }
            if (this.u0 == 0) {
                return this.t0;
            }
            return null;
        }
        if (this.u0 == 1) {
            return this.t0;
        }
        return null;
    }
}
