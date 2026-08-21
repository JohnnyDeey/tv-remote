package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class d01 implements xo {
    public int a;
    public ak b;
    public bk0 c;
    public int d;
    public final uq e = new uq(this);
    public int f = 0;
    public boolean g = false;
    public final zo h = new zo(this);
    public final zo i = new zo(this);
    public int j = 1;

    public d01(ak akVar) {
        this.b = akVar;
    }

    public static void b(zo zoVar, zo zoVar2, int i) {
        zoVar.l.add(zoVar2);
        zoVar.f = i;
        zoVar2.k.add(zoVar);
    }

    public static zo h(mj mjVar) {
        mj mjVar2 = mjVar.f;
        if (mjVar2 != null) {
            ak akVar = mjVar2.d;
            int C = qo0.C(mjVar2.e);
            if (C != 1) {
                if (C != 2) {
                    if (C != 3) {
                        if (C != 4) {
                            if (C != 5) {
                                return null;
                            }
                            return akVar.e.k;
                        }
                        return akVar.e.i;
                    }
                    return akVar.d.i;
                }
                return akVar.e.h;
            }
            return akVar.d.h;
        }
        return null;
    }

    public static zo i(mj mjVar, int i) {
        d01 d01Var;
        mj mjVar2 = mjVar.f;
        if (mjVar2 != null) {
            ak akVar = mjVar2.d;
            if (i == 0) {
                d01Var = akVar.d;
            } else {
                d01Var = akVar.e;
            }
            int C = qo0.C(mjVar2.e);
            if (C != 1 && C != 2) {
                if (C != 3 && C != 4) {
                    return null;
                }
                return d01Var.i;
            }
            return d01Var.h;
        }
        return null;
    }

    public final void c(zo zoVar, zo zoVar2, int i, uq uqVar) {
        zoVar.l.add(zoVar2);
        zoVar.l.add(this.e);
        zoVar.h = i;
        zoVar.i = uqVar;
        zoVar2.k.add(zoVar);
        uqVar.k.add(zoVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        ak akVar = this.b;
        if (i2 == 0) {
            int i3 = akVar.v;
            int max = Math.max(akVar.u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            int i4 = akVar.y;
            int max2 = Math.max(akVar.x, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long j() {
        if (this.e.j) {
            return r2.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.mj r12, defpackage.mj r13, int r14) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d01.l(mj, mj, int):void");
    }
}
