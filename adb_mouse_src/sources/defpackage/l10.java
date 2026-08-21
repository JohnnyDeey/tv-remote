package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class l10 extends d01 {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    iArr[0] = i6;
                    iArr[1] = (int) ((i6 * f) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i7 * f) + 0.5f);
            iArr[1] = i7;
            return;
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r5 != 1) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02aa  */
    @Override // defpackage.xo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.xo r24) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l10.a(xo):void");
    }

    @Override // defpackage.d01
    public final void d() {
        ak akVar;
        ak akVar2;
        int i;
        ak akVar3;
        ak akVar4;
        int i2;
        ak akVar5 = this.b;
        boolean z = akVar5.a;
        uq uqVar = this.e;
        if (z) {
            uqVar.d(akVar5.q());
        }
        boolean z2 = uqVar.j;
        ArrayList arrayList = uqVar.k;
        ArrayList arrayList2 = uqVar.l;
        zo zoVar = this.i;
        zo zoVar2 = this.h;
        if (!z2) {
            ak akVar6 = this.b;
            int i3 = akVar6.p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (akVar4 = akVar6.T) != null && ((i2 = akVar4.p0[0]) == 1 || i2 == 4)) {
                    int q = (akVar4.q() - this.b.I.e()) - this.b.K.e();
                    d01.b(zoVar2, akVar4.d.h, this.b.I.e());
                    d01.b(zoVar, akVar4.d.i, -this.b.K.e());
                    uqVar.d(q);
                    return;
                }
                if (i3 == 1) {
                    uqVar.d(akVar6.q());
                }
            }
        } else if (this.d == 4 && (akVar2 = (akVar = this.b).T) != null && ((i = akVar2.p0[0]) == 1 || i == 4)) {
            d01.b(zoVar2, akVar2.d.h, akVar.I.e());
            d01.b(zoVar, akVar2.d.i, -this.b.K.e());
            return;
        }
        if (uqVar.j) {
            ak akVar7 = this.b;
            if (akVar7.a) {
                mj[] mjVarArr = akVar7.Q;
                mj mjVar = mjVarArr[0];
                mj mjVar2 = mjVar.f;
                if (mjVar2 != null && mjVarArr[1].f != null) {
                    boolean x = akVar7.x();
                    ak akVar8 = this.b;
                    if (x) {
                        zoVar2.f = akVar8.Q[0].e();
                        zoVar.f = -this.b.Q[1].e();
                        return;
                    }
                    zo h = d01.h(akVar8.Q[0]);
                    if (h != null) {
                        d01.b(zoVar2, h, this.b.Q[0].e());
                    }
                    zo h2 = d01.h(this.b.Q[1]);
                    if (h2 != null) {
                        d01.b(zoVar, h2, -this.b.Q[1].e());
                    }
                    zoVar2.b = true;
                    zoVar.b = true;
                    return;
                }
                if (mjVar2 != null) {
                    zo h3 = d01.h(mjVar);
                    if (h3 != null) {
                        d01.b(zoVar2, h3, this.b.Q[0].e());
                        d01.b(zoVar, zoVar2, uqVar.g);
                        return;
                    }
                    return;
                }
                mj mjVar3 = mjVarArr[1];
                if (mjVar3.f != null) {
                    zo h4 = d01.h(mjVar3);
                    if (h4 != null) {
                        d01.b(zoVar, h4, -this.b.Q[1].e());
                        d01.b(zoVar2, zoVar, -uqVar.g);
                        return;
                    }
                    return;
                }
                if (!(akVar7 instanceof g10) && akVar7.T != null && akVar7.i(7).f == null) {
                    ak akVar9 = this.b;
                    d01.b(zoVar2, akVar9.T.d.h, akVar9.r());
                    d01.b(zoVar, zoVar2, uqVar.g);
                    return;
                }
                return;
            }
        }
        if (this.d == 3) {
            ak akVar10 = this.b;
            int i4 = akVar10.r;
            if (i4 != 2) {
                if (i4 == 3) {
                    if (akVar10.s == 3) {
                        zoVar2.a = this;
                        zoVar.a = this;
                        cy0 cy0Var = akVar10.e;
                        cy0Var.h.a = this;
                        cy0Var.i.a = this;
                        uqVar.a = this;
                        if (akVar10.y()) {
                            arrayList2.add(this.b.e.e);
                            this.b.e.e.k.add(uqVar);
                            cy0 cy0Var2 = this.b.e;
                            cy0Var2.e.a = this;
                            arrayList2.add(cy0Var2.h);
                            arrayList2.add(this.b.e.i);
                            this.b.e.h.k.add(uqVar);
                            this.b.e.i.k.add(uqVar);
                        } else {
                            boolean x2 = this.b.x();
                            ak akVar11 = this.b;
                            if (x2) {
                                akVar11.e.e.l.add(uqVar);
                                arrayList.add(this.b.e.e);
                            } else {
                                akVar11.e.e.l.add(uqVar);
                            }
                        }
                    } else {
                        uq uqVar2 = akVar10.e.e;
                        arrayList2.add(uqVar2);
                        uqVar2.k.add(uqVar);
                        this.b.e.h.k.add(uqVar);
                        this.b.e.i.k.add(uqVar);
                        uqVar.b = true;
                        arrayList.add(zoVar2);
                        arrayList.add(zoVar);
                        zoVar2.l.add(uqVar);
                        zoVar.l.add(uqVar);
                    }
                }
            } else {
                ak akVar12 = akVar10.T;
                if (akVar12 != null) {
                    uq uqVar3 = akVar12.e.e;
                    arrayList2.add(uqVar3);
                    uqVar3.k.add(uqVar);
                    uqVar.b = true;
                    arrayList.add(zoVar2);
                    arrayList.add(zoVar);
                }
            }
        }
        ak akVar13 = this.b;
        mj[] mjVarArr2 = akVar13.Q;
        mj mjVar4 = mjVarArr2[0];
        mj mjVar5 = mjVar4.f;
        if (mjVar5 != null && mjVarArr2[1].f != null) {
            boolean x3 = akVar13.x();
            ak akVar14 = this.b;
            if (x3) {
                zoVar2.f = akVar14.Q[0].e();
                zoVar.f = -this.b.Q[1].e();
                return;
            }
            zo h5 = d01.h(akVar14.Q[0]);
            zo h6 = d01.h(this.b.Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = 4;
            return;
        }
        if (mjVar5 != null) {
            zo h7 = d01.h(mjVar4);
            if (h7 != null) {
                d01.b(zoVar2, h7, this.b.Q[0].e());
                c(zoVar, zoVar2, 1, uqVar);
                return;
            }
            return;
        }
        mj mjVar6 = mjVarArr2[1];
        if (mjVar6.f != null) {
            zo h8 = d01.h(mjVar6);
            if (h8 != null) {
                d01.b(zoVar, h8, -this.b.Q[1].e());
                c(zoVar2, zoVar, -1, uqVar);
                return;
            }
            return;
        }
        if (!(akVar13 instanceof g10) && (akVar3 = akVar13.T) != null) {
            d01.b(zoVar2, akVar3.d.h, akVar13.r());
            c(zoVar, zoVar2, 1, uqVar);
        }
    }

    @Override // defpackage.d01
    public final void e() {
        zo zoVar = this.h;
        if (zoVar.j) {
            this.b.Y = zoVar.g;
        }
    }

    @Override // defpackage.d01
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.d01
    public final boolean k() {
        if (this.d == 3 && this.b.r != 0) {
            return false;
        }
        return true;
    }

    public final void n() {
        this.g = false;
        zo zoVar = this.h;
        zoVar.c();
        zoVar.j = false;
        zo zoVar2 = this.i;
        zoVar2.c();
        zoVar2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.h0;
    }
}
