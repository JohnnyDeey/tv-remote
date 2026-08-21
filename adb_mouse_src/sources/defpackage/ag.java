package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ag extends d01 {
    public final ArrayList k;
    public int l;

    public ag(ak akVar, int i) {
        super(akVar);
        ak akVar2;
        d01 d01Var;
        int i2;
        d01 d01Var2;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        ak akVar3 = this.b;
        ak m = akVar3.m(i);
        while (true) {
            akVar2 = akVar3;
            akVar3 = m;
            if (akVar3 == null) {
                break;
            } else {
                m = akVar3.m(this.f);
            }
        }
        this.b = akVar2;
        int i3 = this.f;
        if (i3 == 0) {
            d01Var = akVar2.d;
        } else if (i3 == 1) {
            d01Var = akVar2.e;
        } else {
            d01Var = null;
        }
        arrayList.add(d01Var);
        ak l = akVar2.l(this.f);
        while (l != null) {
            int i4 = this.f;
            if (i4 == 0) {
                d01Var2 = l.d;
            } else if (i4 == 1) {
                d01Var2 = l.e;
            } else {
                d01Var2 = null;
            }
            arrayList.add(d01Var2);
            l = l.l(this.f);
        }
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            d01 d01Var3 = (d01) obj;
            int i6 = this.f;
            if (i6 == 0) {
                d01Var3.b.b = this;
            } else if (i6 == 1) {
                d01Var3.b.c = this;
            }
        }
        if (this.f == 0 && ((bk) this.b.T).v0 && arrayList.size() > 1) {
            this.b = ((d01) arrayList.get(arrayList.size() - 1)).b;
        }
        int i7 = this.f;
        ak akVar4 = this.b;
        if (i7 == 0) {
            i2 = akVar4.i0;
        } else {
            i2 = akVar4.j0;
        }
        this.l = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0390, code lost:
    
        r0 = r0 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // defpackage.xo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.xo r28) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ag.a(xo):void");
    }

    @Override // defpackage.d01
    public final void d() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((d01) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        ak akVar = ((d01) arrayList.get(0)).b;
        ak akVar2 = ((d01) arrayList.get(size2 - 1)).b;
        int i2 = this.f;
        zo zoVar = this.i;
        zo zoVar2 = this.h;
        if (i2 == 0) {
            mj mjVar = akVar.I;
            mj mjVar2 = akVar2.K;
            zo i3 = d01.i(mjVar, 0);
            int e = mjVar.e();
            ak m = m();
            if (m != null) {
                e = m.I.e();
            }
            if (i3 != null) {
                d01.b(zoVar2, i3, e);
            }
            zo i4 = d01.i(mjVar2, 0);
            int e2 = mjVar2.e();
            ak n = n();
            if (n != null) {
                e2 = n.K.e();
            }
            if (i4 != null) {
                d01.b(zoVar, i4, -e2);
            }
        } else {
            mj mjVar3 = akVar.J;
            mj mjVar4 = akVar2.L;
            zo i5 = d01.i(mjVar3, 1);
            int e3 = mjVar3.e();
            ak m2 = m();
            if (m2 != null) {
                e3 = m2.J.e();
            }
            if (i5 != null) {
                d01.b(zoVar2, i5, e3);
            }
            zo i6 = d01.i(mjVar4, 1);
            int e4 = mjVar4.e();
            ak n2 = n();
            if (n2 != null) {
                e4 = n2.L.e();
            }
            if (i6 != null) {
                d01.b(zoVar, i6, -e4);
            }
        }
        zoVar2.a = this;
        zoVar.a = this;
    }

    @Override // defpackage.d01
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i < arrayList.size()) {
                ((d01) arrayList.get(i)).e();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.d01
    public final void f() {
        this.c = null;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((d01) obj).f();
        }
    }

    @Override // defpackage.d01
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r4.i.f + ((d01) arrayList.get(i)).j() + j + r4.h.f;
        }
        return j;
    }

    @Override // defpackage.d01
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((d01) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final ak m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i < arrayList.size()) {
                ak akVar = ((d01) arrayList.get(i)).b;
                if (akVar.g0 != 8) {
                    return akVar;
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final ak n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ak akVar = ((d01) arrayList.get(size)).b;
            if (akVar.g0 != 8) {
                return akVar;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((d01) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
