package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class cy0 extends d01 {
    public zo k;
    public fd l;

    @Override // defpackage.xo
    public final void a(xo xoVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (qo0.C(this.j) != 3) {
            uq uqVar = this.e;
            if (uqVar.c && !uqVar.j && this.d == 3) {
                ak akVar = this.b;
                int i2 = akVar.s;
                if (i2 != 2) {
                    if (i2 == 3) {
                        uq uqVar2 = akVar.d.e;
                        if (uqVar2.j) {
                            int i3 = akVar.X;
                            if (i3 != -1) {
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        i = 0;
                                        uqVar.d(i);
                                    } else {
                                        f = uqVar2.g;
                                        f2 = akVar.W;
                                    }
                                } else {
                                    f3 = uqVar2.g * akVar.W;
                                    i = (int) (f3 + 0.5f);
                                    uqVar.d(i);
                                }
                            } else {
                                f = uqVar2.g;
                                f2 = akVar.W;
                            }
                            f3 = f / f2;
                            i = (int) (f3 + 0.5f);
                            uqVar.d(i);
                        }
                    }
                } else {
                    ak akVar2 = akVar.T;
                    if (akVar2 != null) {
                        if (akVar2.e.e.j) {
                            uqVar.d((int) ((r5.g * akVar.z) + 0.5f));
                        }
                    }
                }
            }
            zo zoVar = this.h;
            boolean z = zoVar.c;
            ArrayList arrayList = zoVar.l;
            if (z) {
                zo zoVar2 = this.i;
                boolean z2 = zoVar2.c;
                ArrayList arrayList2 = zoVar2.l;
                if (z2) {
                    if (!zoVar.j || !zoVar2.j || !uqVar.j) {
                        if (!uqVar.j && this.d == 3) {
                            ak akVar3 = this.b;
                            if (akVar3.r == 0 && !akVar3.y()) {
                                zo zoVar3 = (zo) arrayList.get(0);
                                zo zoVar4 = (zo) arrayList2.get(0);
                                int i4 = zoVar3.g + zoVar.f;
                                int i5 = zoVar4.g + zoVar2.f;
                                zoVar.d(i4);
                                zoVar2.d(i5);
                                uqVar.d(i5 - i4);
                                return;
                            }
                        }
                        if (!uqVar.j && this.d == 3 && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                            zo zoVar5 = (zo) arrayList.get(0);
                            int i6 = (((zo) arrayList2.get(0)).g + zoVar2.f) - (zoVar5.g + zoVar.f);
                            int i7 = uqVar.m;
                            if (i6 < i7) {
                                uqVar.d(i6);
                            } else {
                                uqVar.d(i7);
                            }
                        }
                        if (uqVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                            zo zoVar6 = (zo) arrayList.get(0);
                            zo zoVar7 = (zo) arrayList2.get(0);
                            int i8 = zoVar6.g;
                            int i9 = zoVar.f + i8;
                            int i10 = zoVar7.g;
                            int i11 = zoVar2.f + i10;
                            float f4 = this.b.e0;
                            if (zoVar6 == zoVar7) {
                                f4 = 0.5f;
                            } else {
                                i8 = i9;
                                i10 = i11;
                            }
                            zoVar.d((int) ((((i10 - i8) - uqVar.g) * f4) + i8 + 0.5f));
                            zoVar2.d(zoVar.g + uqVar.g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ak akVar4 = this.b;
        l(akVar4.J, akVar4.L, 1);
    }

    /* JADX WARN: Type inference failed for: r1v105, types: [uq, fd] */
    @Override // defpackage.d01
    public final void d() {
        ak akVar;
        ak akVar2;
        ak akVar3;
        ak akVar4;
        zo zoVar = this.k;
        ak akVar5 = this.b;
        boolean z = akVar5.a;
        uq uqVar = this.e;
        if (z) {
            uqVar.d(akVar5.k());
        }
        boolean z2 = uqVar.j;
        ArrayList arrayList = uqVar.k;
        ArrayList arrayList2 = uqVar.l;
        zo zoVar2 = this.i;
        zo zoVar3 = this.h;
        if (!z2) {
            ak akVar6 = this.b;
            this.d = akVar6.p0[1];
            if (akVar6.E) {
                this.l = new uq(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (akVar4 = this.b.T) != null && akVar4.p0[1] == 1) {
                    int k = (akVar4.k() - this.b.J.e()) - this.b.L.e();
                    d01.b(zoVar3, akVar4.e.h, this.b.J.e());
                    d01.b(zoVar2, akVar4.e.i, -this.b.L.e());
                    uqVar.d(k);
                    return;
                }
                if (i == 1) {
                    uqVar.d(this.b.k());
                }
            }
        } else if (this.d == 4 && (akVar2 = (akVar = this.b).T) != null && akVar2.p0[1] == 1) {
            d01.b(zoVar3, akVar2.e.h, akVar.J.e());
            d01.b(zoVar2, akVar2.e.i, -this.b.L.e());
            return;
        }
        boolean z3 = uqVar.j;
        if (z3) {
            ak akVar7 = this.b;
            if (akVar7.a) {
                mj[] mjVarArr = akVar7.Q;
                mj mjVar = mjVarArr[2];
                mj mjVar2 = mjVar.f;
                if (mjVar2 != null && mjVarArr[3].f != null) {
                    boolean y = akVar7.y();
                    ak akVar8 = this.b;
                    if (y) {
                        zoVar3.f = akVar8.Q[2].e();
                        zoVar2.f = -this.b.Q[3].e();
                    } else {
                        zo h = d01.h(akVar8.Q[2]);
                        if (h != null) {
                            d01.b(zoVar3, h, this.b.Q[2].e());
                        }
                        zo h2 = d01.h(this.b.Q[3]);
                        if (h2 != null) {
                            d01.b(zoVar2, h2, -this.b.Q[3].e());
                        }
                        zoVar3.b = true;
                        zoVar2.b = true;
                    }
                    ak akVar9 = this.b;
                    if (akVar9.E) {
                        d01.b(zoVar, zoVar3, akVar9.a0);
                        return;
                    }
                    return;
                }
                if (mjVar2 != null) {
                    zo h3 = d01.h(mjVar);
                    if (h3 != null) {
                        d01.b(zoVar3, h3, this.b.Q[2].e());
                        d01.b(zoVar2, zoVar3, uqVar.g);
                        ak akVar10 = this.b;
                        if (akVar10.E) {
                            d01.b(zoVar, zoVar3, akVar10.a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                mj mjVar3 = mjVarArr[3];
                if (mjVar3.f != null) {
                    zo h4 = d01.h(mjVar3);
                    if (h4 != null) {
                        d01.b(zoVar2, h4, -this.b.Q[3].e());
                        d01.b(zoVar3, zoVar2, -uqVar.g);
                    }
                    ak akVar11 = this.b;
                    if (akVar11.E) {
                        d01.b(zoVar, zoVar3, akVar11.a0);
                        return;
                    }
                    return;
                }
                mj mjVar4 = mjVarArr[4];
                if (mjVar4.f != null) {
                    zo h5 = d01.h(mjVar4);
                    if (h5 != null) {
                        d01.b(zoVar, h5, 0);
                        d01.b(zoVar3, zoVar, -this.b.a0);
                        d01.b(zoVar2, zoVar3, uqVar.g);
                        return;
                    }
                    return;
                }
                if (!(akVar7 instanceof g10) && akVar7.T != null && akVar7.i(7).f == null) {
                    ak akVar12 = this.b;
                    d01.b(zoVar3, akVar12.T.e.h, akVar12.s());
                    d01.b(zoVar2, zoVar3, uqVar.g);
                    ak akVar13 = this.b;
                    if (akVar13.E) {
                        d01.b(zoVar, zoVar3, akVar13.a0);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!z3 && this.d == 3) {
            ak akVar14 = this.b;
            int i2 = akVar14.s;
            if (i2 != 2) {
                if (i2 == 3 && !akVar14.y()) {
                    ak akVar15 = this.b;
                    if (akVar15.r != 3) {
                        uq uqVar2 = akVar15.d.e;
                        arrayList2.add(uqVar2);
                        uqVar2.k.add(uqVar);
                        uqVar.b = true;
                        arrayList.add(zoVar3);
                        arrayList.add(zoVar2);
                    }
                }
            } else {
                ak akVar16 = akVar14.T;
                if (akVar16 != null) {
                    uq uqVar3 = akVar16.e.e;
                    arrayList2.add(uqVar3);
                    uqVar3.k.add(uqVar);
                    uqVar.b = true;
                    arrayList.add(zoVar3);
                    arrayList.add(zoVar2);
                }
            }
        } else {
            uqVar.b(this);
        }
        ak akVar17 = this.b;
        mj[] mjVarArr2 = akVar17.Q;
        mj mjVar5 = mjVarArr2[2];
        mj mjVar6 = mjVar5.f;
        if (mjVar6 != null && mjVarArr2[3].f != null) {
            boolean y2 = akVar17.y();
            ak akVar18 = this.b;
            if (y2) {
                zoVar3.f = akVar18.Q[2].e();
                zoVar2.f = -this.b.Q[3].e();
            } else {
                zo h6 = d01.h(akVar18.Q[2]);
                zo h7 = d01.h(this.b.Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = 4;
            }
            if (this.b.E) {
                c(zoVar, zoVar3, 1, this.l);
            }
        } else if (mjVar6 != null) {
            zo h8 = d01.h(mjVar5);
            if (h8 != null) {
                d01.b(zoVar3, h8, this.b.Q[2].e());
                c(zoVar2, zoVar3, 1, uqVar);
                if (this.b.E) {
                    c(zoVar, zoVar3, 1, this.l);
                }
                if (this.d == 3) {
                    ak akVar19 = this.b;
                    if (akVar19.W > 0.0f) {
                        l10 l10Var = akVar19.d;
                        if (l10Var.d == 3) {
                            l10Var.e.k.add(uqVar);
                            arrayList2.add(this.b.d.e);
                            uqVar.a = this;
                        }
                    }
                }
            }
        } else {
            mj mjVar7 = mjVarArr2[3];
            if (mjVar7.f != null) {
                zo h9 = d01.h(mjVar7);
                if (h9 != null) {
                    d01.b(zoVar2, h9, -this.b.Q[3].e());
                    c(zoVar3, zoVar2, -1, uqVar);
                    if (this.b.E) {
                        c(zoVar, zoVar3, 1, this.l);
                    }
                }
            } else {
                mj mjVar8 = mjVarArr2[4];
                if (mjVar8.f != null) {
                    zo h10 = d01.h(mjVar8);
                    if (h10 != null) {
                        d01.b(zoVar, h10, 0);
                        c(zoVar3, zoVar, -1, this.l);
                        c(zoVar2, zoVar3, 1, uqVar);
                    }
                } else if (!(akVar17 instanceof g10) && (akVar3 = akVar17.T) != null) {
                    d01.b(zoVar3, akVar3.e.h, akVar17.s());
                    c(zoVar2, zoVar3, 1, uqVar);
                    if (this.b.E) {
                        c(zoVar, zoVar3, 1, this.l);
                    }
                    if (this.d == 3) {
                        ak akVar20 = this.b;
                        if (akVar20.W > 0.0f) {
                            l10 l10Var2 = akVar20.d;
                            if (l10Var2.d == 3) {
                                l10Var2.e.k.add(uqVar);
                                arrayList2.add(this.b.d.e);
                                uqVar.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            uqVar.c = true;
        }
    }

    @Override // defpackage.d01
    public final void e() {
        zo zoVar = this.h;
        if (zoVar.j) {
            this.b.Z = zoVar.g;
        }
    }

    @Override // defpackage.d01
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.d01
    public final boolean k() {
        if (this.d == 3 && this.b.s != 0) {
            return false;
        }
        return true;
    }

    public final void m() {
        this.g = false;
        zo zoVar = this.h;
        zoVar.c();
        zoVar.j = false;
        zo zoVar2 = this.i;
        zoVar2.c();
        zoVar2.j = false;
        zo zoVar3 = this.k;
        zoVar3.c();
        zoVar3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.h0;
    }
}
