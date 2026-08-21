package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class wv extends g10 {
    public int A0;
    public gd B0;
    public rj C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public ak[] X0;
    public ak[] Y0;
    public int[] Z0;
    public ak[] a1;
    public int b1;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    @Override // defpackage.g10
    public final void S() {
        for (int i = 0; i < this.r0; i++) {
            ak akVar = this.q0[i];
            if (akVar != null) {
                akVar.F = true;
            }
        }
    }

    public final int T(ak akVar, int i) {
        ak akVar2;
        if (akVar != null) {
            int[] iArr = akVar.p0;
            if (iArr[1] == 3) {
                int i2 = akVar.s;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (akVar.z * i);
                        if (i3 != akVar.k()) {
                            akVar.g = true;
                            V(iArr[0], akVar.q(), 1, i3, akVar);
                        }
                        return i3;
                    }
                    akVar2 = akVar;
                    if (i2 == 1) {
                        return akVar2.k();
                    }
                    if (i2 == 3) {
                        return (int) ((akVar2.q() * akVar2.W) + 0.5f);
                    }
                }
            } else {
                akVar2 = akVar;
            }
            return akVar2.k();
        }
        return 0;
    }

    public final int U(ak akVar, int i) {
        ak akVar2;
        if (akVar != null) {
            int[] iArr = akVar.p0;
            if (iArr[0] == 3) {
                int i2 = akVar.r;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (akVar.w * i);
                        if (i3 != akVar.q()) {
                            akVar.g = true;
                            V(1, i3, iArr[1], akVar.k(), akVar);
                        }
                        return i3;
                    }
                    akVar2 = akVar;
                    if (i2 == 1) {
                        return akVar2.q();
                    }
                    if (i2 == 3) {
                        return (int) ((akVar2.k() * akVar2.W) + 0.5f);
                    }
                }
            } else {
                akVar2 = akVar;
            }
            return akVar2.q();
        }
        return 0;
    }

    public final void V(int i, int i2, int i3, int i4, ak akVar) {
        rj rjVar;
        ak akVar2;
        gd gdVar = this.B0;
        while (true) {
            rjVar = this.C0;
            if (rjVar != null || (akVar2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((bk) akVar2).u0;
            }
        }
        gdVar.a = i;
        gdVar.b = i3;
        gdVar.c = i2;
        gdVar.d = i4;
        rjVar.c(akVar, gdVar);
        akVar.O(gdVar.e);
        akVar.L(gdVar.f);
        akVar.E = gdVar.h;
        akVar.I(gdVar.g);
    }

    @Override // defpackage.ak
    public final void b(e60 e60Var, boolean z) {
        boolean z2;
        boolean z3;
        ak akVar;
        float f;
        int i;
        boolean z4;
        ArrayList arrayList = this.W0;
        super.b(e60Var, z);
        ak akVar2 = this.T;
        if (akVar2 != null && ((bk) akVar2).v0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = this.T0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            uv uvVar = (uv) arrayList.get(i3);
                            if (i3 == size - 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            uvVar.b(i3, z2, z4);
                        }
                    }
                } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                    for (int i4 = 0; i4 < this.b1; i4++) {
                        this.a1[i4].D();
                    }
                    int[] iArr = this.Z0;
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    float f2 = this.J0;
                    ak akVar3 = null;
                    int i7 = 0;
                    while (i7 < i5) {
                        if (z2) {
                            i = (i5 - i7) - 1;
                            f = 1.0f - this.J0;
                        } else {
                            f = f2;
                            i = i7;
                        }
                        ak akVar4 = this.Y0[i];
                        if (akVar4 != null) {
                            mj mjVar = akVar4.I;
                            if (akVar4.g0 != 8) {
                                if (i7 == 0) {
                                    akVar4.f(mjVar, this.I, this.w0);
                                    akVar4.i0 = this.D0;
                                    akVar4.d0 = f;
                                }
                                if (i7 == i5 - 1) {
                                    akVar4.f(akVar4.K, this.K, this.x0);
                                }
                                if (i7 > 0 && akVar3 != null) {
                                    mj mjVar2 = akVar3.K;
                                    akVar4.f(mjVar, mjVar2, this.P0);
                                    akVar3.f(mjVar2, mjVar, 0);
                                }
                                akVar3 = akVar4;
                            }
                        }
                        i7++;
                        f2 = f;
                    }
                    for (int i8 = 0; i8 < i6; i8++) {
                        ak akVar5 = this.X0[i8];
                        if (akVar5 != null) {
                            mj mjVar3 = akVar5.J;
                            if (akVar5.g0 != 8) {
                                if (i8 == 0) {
                                    akVar5.f(mjVar3, this.J, this.s0);
                                    akVar5.j0 = this.E0;
                                    akVar5.e0 = this.K0;
                                }
                                if (i8 == i6 - 1) {
                                    akVar5.f(akVar5.L, this.L, this.t0);
                                }
                                if (i8 > 0 && akVar3 != null) {
                                    mj mjVar4 = akVar3.L;
                                    akVar5.f(mjVar3, mjVar4, this.Q0);
                                    akVar3.f(mjVar4, mjVar3, 0);
                                }
                                akVar3 = akVar5;
                            }
                        }
                    }
                    for (int i9 = 0; i9 < i5; i9++) {
                        for (int i10 = 0; i10 < i6; i10++) {
                            int i11 = (i10 * i5) + i9;
                            if (this.V0 == 1) {
                                i11 = (i9 * i6) + i10;
                            }
                            ak[] akVarArr = this.a1;
                            if (i11 < akVarArr.length && (akVar = akVarArr[i11]) != null && akVar.g0 != 8) {
                                ak akVar6 = this.Y0[i9];
                                ak akVar7 = this.X0[i10];
                                if (akVar != akVar6) {
                                    akVar.f(akVar.I, akVar6.I, 0);
                                    akVar.f(akVar.K, akVar6.K, 0);
                                }
                                if (akVar != akVar7) {
                                    akVar.f(akVar.J, akVar7.J, 0);
                                    akVar.f(akVar.L, akVar7.L, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    uv uvVar2 = (uv) arrayList.get(i12);
                    if (i12 == size2 - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    uvVar2.b(i12, z2, z3);
                }
            }
        } else if (arrayList.size() > 0) {
            ((uv) arrayList.get(0)).b(0, z2, true);
        }
        this.y0 = false;
    }
}
