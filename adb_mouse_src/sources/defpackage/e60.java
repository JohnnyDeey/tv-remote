package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class e60 {
    public static boolean q = false;
    public final bf0 d;
    public final b8 m;
    public o8 p;
    public int a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public ro0[] n = new ro0[1000];
    public int o = 0;
    public o8[] g = new o8[32];

    /* JADX WARN: Type inference failed for: r2v2, types: [o8, java.lang.Object, bf0] */
    public e60() {
        s();
        b8 b8Var = new b8(3);
        b8Var.d = new ee0();
        b8Var.e = new ee0();
        b8Var.f = new ro0[32];
        this.m = b8Var;
        ?? o8Var = new o8(b8Var);
        o8Var.f = new ro0[128];
        o8Var.g = new ro0[128];
        o8Var.h = 0;
        o8Var.i = new r6(28, (Object) o8Var);
        this.d = o8Var;
        this.p = new o8(b8Var);
    }

    public static int n(Object obj) {
        ro0 ro0Var = ((mj) obj).i;
        if (ro0Var != null) {
            return (int) (ro0Var.g + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final ro0 a(int i) {
        ee0 ee0Var = (ee0) this.m.e;
        int i2 = ee0Var.b;
        ro0 ro0Var = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = ee0Var.a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            ee0Var.b = i3;
            ro0Var = r4;
        }
        ro0 ro0Var2 = ro0Var;
        if (ro0Var2 == null) {
            ro0Var2 = new ro0(i);
            ro0Var2.n = i;
        } else {
            ro0Var2.c();
            ro0Var2.n = i;
        }
        int i4 = this.o;
        int i5 = this.a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.a = i6;
            this.n = (ro0[]) Arrays.copyOf(this.n, i6);
        }
        ro0[] ro0VarArr = this.n;
        int i7 = this.o;
        this.o = i7 + 1;
        ro0VarArr[i7] = ro0Var2;
        return ro0Var2;
    }

    public final void b(ro0 ro0Var, ro0 ro0Var2, int i, float f, ro0 ro0Var3, ro0 ro0Var4, int i2, int i3) {
        o8 l = l();
        if (ro0Var2 == ro0Var3) {
            l.d.g(ro0Var, 1.0f);
            l.d.g(ro0Var4, 1.0f);
            l.d.g(ro0Var2, -2.0f);
        } else {
            i8 i8Var = l.d;
            if (f == 0.5f) {
                i8Var.g(ro0Var, 1.0f);
                l.d.g(ro0Var2, -1.0f);
                l.d.g(ro0Var3, -1.0f);
                l.d.g(ro0Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    l.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                i8Var.g(ro0Var, -1.0f);
                l.d.g(ro0Var2, 1.0f);
                l.b = i;
            } else if (f >= 1.0f) {
                i8Var.g(ro0Var4, -1.0f);
                l.d.g(ro0Var3, 1.0f);
                l.b = -i2;
            } else {
                float f2 = 1.0f - f;
                i8Var.g(ro0Var, f2 * 1.0f);
                l.d.g(ro0Var2, f2 * (-1.0f));
                l.d.g(ro0Var3, (-1.0f) * f);
                l.d.g(ro0Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    l.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            l.a(this, i3);
        }
        c(l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d0, code lost:
    
        if (r4.m <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00dd, code lost:
    
        if (r4.m <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f2, code lost:
    
        if (r4.m <= 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ff, code lost:
    
        if (r4.m <= 1) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.o8 r18) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e60.c(o8):void");
    }

    public final void d(ro0 ro0Var, int i) {
        int i2 = ro0Var.e;
        if (i2 == -1) {
            ro0Var.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                ro0 ro0Var2 = ((ro0[]) this.m.f)[i3];
            }
            return;
        }
        if (i2 != -1) {
            o8 o8Var = this.g[i2];
            if (o8Var.e) {
                o8Var.b = i;
                return;
            }
            if (o8Var.d.d() == 0) {
                o8Var.e = true;
                o8Var.b = i;
                return;
            }
            o8 l = l();
            if (i < 0) {
                l.b = i * (-1);
                l.d.g(ro0Var, 1.0f);
            } else {
                l.b = i;
                l.d.g(ro0Var, -1.0f);
            }
            c(l);
            return;
        }
        o8 l2 = l();
        l2.a = ro0Var;
        float f = i;
        ro0Var.g = f;
        l2.b = f;
        l2.e = true;
        c(l2);
    }

    public final void e(ro0 ro0Var, ro0 ro0Var2, int i, int i2) {
        if (i2 == 8 && ro0Var2.h && ro0Var.e == -1) {
            ro0Var.d(this, ro0Var2.g + i);
            return;
        }
        o8 l = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l.b = i;
        }
        i8 i8Var = l.d;
        if (!z) {
            i8Var.g(ro0Var, -1.0f);
            l.d.g(ro0Var2, 1.0f);
        } else {
            i8Var.g(ro0Var, 1.0f);
            l.d.g(ro0Var2, -1.0f);
        }
        if (i2 != 8) {
            l.a(this, i2);
        }
        c(l);
    }

    public final void f(ro0 ro0Var, ro0 ro0Var2, int i, int i2) {
        o8 l = l();
        ro0 m = m();
        m.f = 0;
        l.b(ro0Var, ro0Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void g(ro0 ro0Var, ro0 ro0Var2, int i, int i2) {
        o8 l = l();
        ro0 m = m();
        m.f = 0;
        l.c(ro0Var, ro0Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void h(o8 o8Var) {
        int i;
        if (o8Var.e) {
            o8Var.a.d(this, o8Var.b);
        } else {
            o8[] o8VarArr = this.g;
            int i2 = this.k;
            o8VarArr[i2] = o8Var;
            ro0 ro0Var = o8Var.a;
            ro0Var.e = i2;
            this.k = i2 + 1;
            ro0Var.e(this, o8Var);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                o8 o8Var2 = this.g[i3];
                if (o8Var2 != null && o8Var2.e) {
                    o8Var2.a.d(this, o8Var2.b);
                    ((ee0) this.m.d).b(o8Var2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        o8[] o8VarArr2 = this.g;
                        int i6 = i4 - 1;
                        o8 o8Var3 = o8VarArr2[i4];
                        o8VarArr2[i6] = o8Var3;
                        ro0 ro0Var2 = o8Var3.a;
                        if (ro0Var2.e == i4) {
                            ro0Var2.e = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            o8 o8Var = this.g[i];
            o8Var.a.g = o8Var.b;
        }
    }

    public final ro0 j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        ro0 a = a(4);
        float[] fArr = a.j;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        a.d = i2;
        a.f = i;
        ((ro0[]) this.m.f)[i2] = a;
        bf0 bf0Var = this.d;
        bf0Var.i.d = a;
        Arrays.fill(fArr, 0.0f);
        fArr[a.f] = 1.0f;
        bf0Var.j(a);
        return a;
    }

    public final ro0 k(Object obj) {
        if (obj != null) {
            if (this.j + 1 >= this.f) {
                o();
            }
            if (obj instanceof mj) {
                mj mjVar = (mj) obj;
                ro0 ro0Var = mjVar.i;
                if (ro0Var == null) {
                    mjVar.k();
                    ro0Var = mjVar.i;
                }
                int i = ro0Var.d;
                b8 b8Var = this.m;
                if (i != -1 && i <= this.c && ((ro0[]) b8Var.f)[i] != null) {
                    return ro0Var;
                }
                if (i != -1) {
                    ro0Var.c();
                }
                int i2 = this.c + 1;
                this.c = i2;
                this.j++;
                ro0Var.d = i2;
                ro0Var.n = 1;
                ((ro0[]) b8Var.f)[i2] = ro0Var;
                return ro0Var;
            }
            return null;
        }
        return null;
    }

    public final o8 l() {
        Object obj;
        b8 b8Var = this.m;
        ee0 ee0Var = (ee0) b8Var.d;
        int i = ee0Var.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = ee0Var.a;
            obj = objArr[i2];
            objArr[i2] = null;
            ee0Var.b = i2;
        } else {
            obj = null;
        }
        o8 o8Var = (o8) obj;
        if (o8Var == null) {
            return new o8(b8Var);
        }
        o8Var.a = null;
        o8Var.d.b();
        o8Var.b = 0.0f;
        o8Var.e = false;
        return o8Var;
    }

    public final ro0 m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        ro0 a = a(3);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        a.d = i;
        ((ro0[]) this.m.f)[i] = a;
        return a;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (o8[]) Arrays.copyOf(this.g, i);
        b8 b8Var = this.m;
        b8Var.f = (ro0[]) Arrays.copyOf((ro0[]) b8Var.f, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        bf0 bf0Var = this.d;
        if (bf0Var.e()) {
            i();
            return;
        }
        if (this.h) {
            for (int i = 0; i < this.k; i++) {
                if (!this.g[i].e) {
                    q(bf0Var);
                    return;
                }
            }
            i();
            return;
        }
        q(bf0Var);
    }

    public final void q(bf0 bf0Var) {
        int i = 0;
        while (true) {
            if (i >= this.k) {
                break;
            }
            o8 o8Var = this.g[i];
            int i2 = 1;
            if (o8Var.a.n != 1) {
                float f = 0.0f;
                if (o8Var.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.k) {
                            o8 o8Var2 = this.g[i6];
                            if (o8Var2.a.n != i2 && !o8Var2.e && o8Var2.b < f) {
                                int d = o8Var2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    ro0 e = o8Var2.d.e(i8);
                                    float c = o8Var2.d.c(e);
                                    if (c > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = e.i[i9] / c;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e.d;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            o8 o8Var3 = this.g[i4];
                            o8Var3.a.e = -1;
                            o8Var3.g(((ro0[]) this.m.f)[i5]);
                            ro0 ro0Var = o8Var3.a;
                            ro0Var.e = i4;
                            ro0Var.e(this, o8Var3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.j / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(bf0Var);
        i();
    }

    public final void r(o8 o8Var) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.j; i2++) {
            this.i[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 < this.j * 2) {
                ro0 ro0Var = o8Var.a;
                if (ro0Var != null) {
                    this.i[ro0Var.d] = true;
                }
                ro0 d = o8Var.d(this.i);
                if (d != null) {
                    boolean[] zArr = this.i;
                    int i4 = d.d;
                    if (!zArr[i4]) {
                        zArr[i4] = true;
                    } else {
                        return;
                    }
                }
                if (d != null) {
                    float f = Float.MAX_VALUE;
                    int i5 = i;
                    int i6 = -1;
                    while (i5 < this.k) {
                        o8 o8Var2 = this.g[i5];
                        if (o8Var2.a.n != 1 && !o8Var2.e) {
                            i8 i8Var = o8Var2.d;
                            int i7 = i8Var.h;
                            if (i7 != -1) {
                                for (int i8 = i; i7 != -1 && i8 < i8Var.a; i8++) {
                                    if (i8Var.e[i7] == d.d) {
                                        z = true;
                                        break;
                                    }
                                    i7 = i8Var.f[i7];
                                }
                            }
                            z = false;
                            if (z) {
                                float c = o8Var2.d.c(d);
                                if (c < 0.0f) {
                                    float f2 = (-o8Var2.b) / c;
                                    if (f2 < f) {
                                        i6 = i5;
                                        f = f2;
                                    }
                                }
                            }
                        }
                        i5++;
                        i = 0;
                    }
                    if (i6 > -1) {
                        o8 o8Var3 = this.g[i6];
                        o8Var3.a.e = -1;
                        o8Var3.g(d);
                        ro0 ro0Var2 = o8Var3.a;
                        ro0Var2.e = i6;
                        ro0Var2.e(this, o8Var3);
                    }
                } else {
                    z2 = true;
                }
                i = 0;
            } else {
                return;
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            o8 o8Var = this.g[i];
            if (o8Var != null) {
                ((ee0) this.m.d).b(o8Var);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        b8 b8Var;
        int i = 0;
        while (true) {
            b8Var = this.m;
            ro0[] ro0VarArr = (ro0[]) b8Var.f;
            if (i >= ro0VarArr.length) {
                break;
            }
            ro0 ro0Var = ro0VarArr[i];
            if (ro0Var != null) {
                ro0Var.c();
            }
            i++;
        }
        ee0 ee0Var = (ee0) b8Var.e;
        ro0[] ro0VarArr2 = this.n;
        int i2 = this.o;
        ee0Var.getClass();
        if (i2 > ro0VarArr2.length) {
            i2 = ro0VarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ro0 ro0Var2 = ro0VarArr2[i3];
            int i4 = ee0Var.b;
            Object[] objArr = ee0Var.a;
            if (i4 < objArr.length) {
                objArr[i4] = ro0Var2;
                ee0Var.b = i4 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((ro0[]) b8Var.f, (Object) null);
        this.c = 0;
        bf0 bf0Var = this.d;
        bf0Var.h = 0;
        bf0Var.b = 0.0f;
        this.j = 1;
        for (int i5 = 0; i5 < this.k; i5++) {
            o8 o8Var = this.g[i5];
        }
        s();
        this.k = 0;
        this.p = new o8(b8Var);
    }
}
