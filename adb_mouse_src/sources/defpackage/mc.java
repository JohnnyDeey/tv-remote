package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class mc extends g10 {
    public int s0;
    public boolean t0;
    public int u0;
    public boolean v0;

    @Override // defpackage.ak
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.ak
    public final boolean B() {
        return this.v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.r0;
            if (i4 >= i) {
                break;
            }
            ak akVar = this.q0[i4];
            if ((this.t0 || akVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !akVar.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !akVar.B()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.r0; i6++) {
            ak akVar2 = this.q0[i6];
            if (this.t0 || akVar2.c()) {
                if (!z2) {
                    int i7 = this.s0;
                    if (i7 == 0) {
                        i5 = akVar2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = akVar2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = akVar2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = akVar2.i(5).d();
                    }
                    z2 = true;
                }
                int i8 = this.s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, akVar2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, akVar2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, akVar2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, akVar2.i(5).d());
                }
            }
        }
        int i9 = i5 + this.u0;
        int i10 = this.s0;
        if (i10 != 0 && i10 != 1) {
            K(i9, i9);
        } else {
            J(i9, i9);
        }
        this.v0 = true;
        return true;
    }

    public final int U() {
        int i = this.s0;
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // defpackage.ak
    public final void b(e60 e60Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        mj[] mjVarArr = this.Q;
        mj mjVar = this.I;
        mjVarArr[0] = mjVar;
        int i5 = 2;
        mj mjVar2 = this.J;
        mjVarArr[2] = mjVar2;
        mj mjVar3 = this.K;
        mjVarArr[1] = mjVar3;
        mj mjVar4 = this.L;
        mjVarArr[3] = mjVar4;
        for (mj mjVar5 : mjVarArr) {
            mjVar5.i = e60Var.k(mjVar5);
        }
        int i6 = this.s0;
        if (i6 >= 0 && i6 < 4) {
            mj mjVar6 = mjVarArr[i6];
            if (!this.v0) {
                T();
            }
            if (this.v0) {
                this.v0 = false;
                int i7 = this.s0;
                if (i7 != 0 && i7 != 1) {
                    if (i7 == 2 || i7 == 3) {
                        e60Var.d(mjVar2.i, this.Z);
                        e60Var.d(mjVar4.i, this.Z);
                        return;
                    }
                    return;
                }
                e60Var.d(mjVar.i, this.Y);
                e60Var.d(mjVar3.i, this.Y);
                return;
            }
            for (int i8 = 0; i8 < this.r0; i8++) {
                ak akVar = this.q0[i8];
                if ((this.t0 || akVar.c()) && ((((i4 = this.s0) == 0 || i4 == 1) && akVar.p0[0] == 3 && akVar.I.f != null && akVar.K.f != null) || ((i4 == 2 || i4 == 3) && akVar.p0[1] == 3 && akVar.J.f != null && akVar.L.f != null))) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (!mjVar.g() && !mjVar3.g()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!mjVar2.g() && !mjVar4.g()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z2 && (((i3 = this.s0) == 0 && z3) || ((i3 == 2 && z4) || ((i3 == 1 && z3) || (i3 == 3 && z4))))) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                i = 4;
            } else {
                i = 5;
            }
            int i9 = 0;
            while (i9 < this.r0) {
                ak akVar2 = this.q0[i9];
                if (this.t0 || akVar2.c()) {
                    ro0 k = e60Var.k(akVar2.Q[this.s0]);
                    mj[] mjVarArr2 = akVar2.Q;
                    int i10 = this.s0;
                    mj mjVar7 = mjVarArr2[i10];
                    mjVar7.i = k;
                    mj mjVar8 = mjVar7.f;
                    if (mjVar8 != null && mjVar8.d == this) {
                        i2 = mjVar7.g;
                    } else {
                        i2 = 0;
                    }
                    if (i10 != 0 && i10 != i5) {
                        ro0 ro0Var = mjVar6.i;
                        int i11 = this.u0 + i2;
                        o8 l = e60Var.l();
                        ro0 m = e60Var.m();
                        m.f = 0;
                        l.b(ro0Var, k, m, i11);
                        e60Var.c(l);
                    } else {
                        ro0 ro0Var2 = mjVar6.i;
                        int i12 = this.u0 - i2;
                        o8 l2 = e60Var.l();
                        ro0 m2 = e60Var.m();
                        m2.f = 0;
                        l2.c(ro0Var2, k, m2, i12);
                        e60Var.c(l2);
                    }
                    e60Var.e(mjVar6.i, k, this.u0 + i2, i);
                }
                i9++;
                i5 = 2;
            }
            int i13 = this.s0;
            if (i13 == 0) {
                e60Var.e(mjVar3.i, mjVar.i, 0, 8);
                e60Var.e(mjVar.i, this.T.K.i, 0, 4);
                e60Var.e(mjVar.i, this.T.I.i, 0, 0);
                return;
            }
            if (i13 == 1) {
                e60Var.e(mjVar.i, mjVar3.i, 0, 8);
                e60Var.e(mjVar.i, this.T.I.i, 0, 4);
                e60Var.e(mjVar.i, this.T.K.i, 0, 0);
            } else if (i13 == 2) {
                e60Var.e(mjVar4.i, mjVar2.i, 0, 8);
                e60Var.e(mjVar2.i, this.T.L.i, 0, 4);
                e60Var.e(mjVar2.i, this.T.J.i, 0, 0);
            } else if (i13 == 3) {
                e60Var.e(mjVar2.i, mjVar4.i, 0, 8);
                e60Var.e(mjVar2.i, this.T.J.i, 0, 4);
                e60Var.e(mjVar2.i, this.T.L.i, 0, 0);
            }
        }
    }

    @Override // defpackage.ak
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ak
    public final String toString() {
        String s = qo0.s(new StringBuilder("[Barrier] "), this.h0, " {");
        for (int i = 0; i < this.r0; i++) {
            ak akVar = this.q0[i];
            if (i > 0) {
                s = s.concat(", ");
            }
            s = s + akVar.h0;
        }
        return s.concat("}");
    }
}
