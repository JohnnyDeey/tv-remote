package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* loaded from: classes.dex */
public final class ls {
    public static final k20[] g = new k20[0];
    public final is a;
    public final k20 b;
    public final k20 c;
    public final k20[] d;
    public Hashtable e;
    public final /* synthetic */ int f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ls(defpackage.is r3, defpackage.k20 r4, defpackage.k20 r5, int r6) {
        /*
            r2 = this;
            r2.f = r6
            if (r3 != 0) goto L6
            r6 = 0
            goto L8
        L6:
            int r6 = r3.f
        L8:
            if (r6 == 0) goto L3b
            r0 = 5
            if (r6 == r0) goto L3b
            java.math.BigInteger r0 = defpackage.fs.b
            k20 r0 = r3.e(r0)
            r1 = 1
            if (r6 == r1) goto L36
            r1 = 2
            if (r6 == r1) goto L36
            r1 = 3
            if (r6 == r1) goto L31
            r1 = 4
            if (r6 == r1) goto L2a
            r1 = 6
            if (r6 != r1) goto L23
            goto L36
        L23:
            java.lang.String r2 = "unknown coordinate system"
            defpackage.c.k(r2)
            r2 = 0
            throw r2
        L2a:
            k20 r6 = r3.b
            k20[] r6 = new defpackage.k20[]{r0, r6}
            goto L3d
        L31:
            k20[] r6 = new defpackage.k20[]{r0, r0, r0}
            goto L3d
        L36:
            k20[] r6 = new defpackage.k20[]{r0}
            goto L3d
        L3b:
            k20[] r6 = defpackage.ls.g
        L3d:
            r2.<init>(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls.<init>(is, k20, k20, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x027f, code lost:
    
        if (r7.O() != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:?, code lost:
    
        return o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0374, code lost:
    
        if (r6.O() != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03d0, code lost:
    
        if (r2.O() != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r1.O() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return r2.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00eb, code lost:
    
        if (r1.O() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0185, code lost:
    
        if (r1.O() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e3, code lost:
    
        if (r1.O() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ls a(defpackage.ls r19) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls.a(ls):ls");
    }

    public k20 b(k20 k20Var, k20 k20Var2) {
        k20 k20Var3 = this.a.b;
        if (!k20Var3.O() && !k20Var.N()) {
            if (k20Var2 == null) {
                k20Var2 = k20Var.k0();
            }
            k20 k0 = k20Var2.k0();
            k20 W = k20Var3.W();
            if (W.f() < k20Var3.f()) {
                return k0.T(W).W();
            }
            return k0.T(k20Var3);
        }
        return k20Var3;
    }

    public final void c() {
        if (i()) {
            return;
        }
        c.o("point not in normal form");
    }

    public final int d() {
        is isVar = this.a;
        if (isVar == null) {
            return 0;
        }
        return isVar.f;
    }

    public k20 e() {
        int i = this.f;
        k20 k20Var = this.c;
        switch (i) {
            case 0:
                int d = d();
                if ((d == 5 || d == 6) && !h()) {
                    k20 k20Var2 = this.b;
                    if (!k20Var2.O()) {
                        k20 T = k20Var.a(k20Var2).T(k20Var2);
                        if (6 == d) {
                            k20 k20Var3 = this.d[0];
                            if (!k20Var3.N()) {
                                return T.q(k20Var3);
                            }
                            return T;
                        }
                        return T;
                    }
                    return k20Var;
                }
                return k20Var;
            default:
                return k20Var;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj != this) {
            if (obj instanceof ls) {
                ls lsVar = (ls) obj;
                is isVar = lsVar.a;
                is isVar2 = this.a;
                if (isVar2 == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (isVar == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean h = h();
                boolean h2 = lsVar.h();
                if (!h && !h2) {
                    if (!z || !z2) {
                        if (z) {
                            lsVar = lsVar.j();
                        } else if (z2) {
                            this = j();
                        } else if (isVar2.d(isVar)) {
                            ls[] lsVarArr = new ls[2];
                            lsVarArr[0] = this;
                            lsVarArr[1] = isVar2.h(lsVar);
                            for (int i = 0; i < 2; i++) {
                                ls lsVar2 = lsVarArr[i];
                                if (lsVar2 != null && isVar2 != lsVar2.a) {
                                    c.k("'points' entries must be null or on this curve");
                                    return false;
                                }
                            }
                            int i2 = isVar2.f;
                            if (i2 != 0 && i2 != 5) {
                                k20[] k20VarArr = new k20[2];
                                int[] iArr = new int[2];
                                int i3 = 0;
                                for (int i4 = 0; i4 < 2; i4++) {
                                    ls lsVar3 = lsVarArr[i4];
                                    if (lsVar3 != null && !lsVar3.i()) {
                                        k20VarArr[i3] = lsVar3.f();
                                        iArr[i3] = i4;
                                        i3++;
                                    }
                                }
                                if (i3 != 0) {
                                    k20[] k20VarArr2 = new k20[i3];
                                    k20VarArr2[0] = k20VarArr[0];
                                    int i5 = 0;
                                    while (true) {
                                        int i6 = i5 + 1;
                                        if (i6 >= i3) {
                                            break;
                                        }
                                        k20VarArr2[i6] = k20VarArr2[i5].T(k20VarArr[i6]);
                                        i5 = i6;
                                    }
                                    k20 J = k20VarArr2[i5].J();
                                    while (i5 > 0) {
                                        int i7 = i5 - 1;
                                        k20 k20Var = k20VarArr[i5];
                                        k20VarArr[i5] = k20VarArr2[i7].T(J);
                                        J = J.T(k20Var);
                                        i5 = i7;
                                    }
                                    k20VarArr[0] = J;
                                    for (int i8 = 0; i8 < i3; i8++) {
                                        int i9 = iArr[i8];
                                        lsVarArr[i9] = lsVarArr[i9].k(k20VarArr[i8]);
                                    }
                                }
                            }
                            this = lsVarArr[0];
                            lsVar = lsVarArr[1];
                        }
                    }
                    if (!this.b.equals(lsVar.b) || !this.e().equals(lsVar.e())) {
                    }
                } else if (!h || !h2 || (!z && !z2 && !isVar2.d(isVar))) {
                }
            }
            return false;
        }
        return true;
    }

    public k20 f() {
        k20[] k20VarArr = this.d;
        if (k20VarArr.length <= 0) {
            return null;
        }
        return k20VarArr[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [jx0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [jx0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final boolean g(boolean z) {
        Hashtable hashtable;
        ?? r5;
        if (h()) {
            return true;
        }
        is isVar = this.a;
        isVar.getClass();
        if (isVar == this.a) {
            synchronized (this) {
                try {
                    hashtable = this.e;
                    if (hashtable == null) {
                        hashtable = new Hashtable(4);
                        this.e = hashtable;
                    }
                } finally {
                }
            }
            synchronized (hashtable) {
                try {
                    jx0 jx0Var = (jx0) hashtable.get("bc_validity");
                    if (jx0Var != null) {
                        r5 = jx0Var;
                    } else {
                        r5 = 0;
                    }
                    if (r5 == 0) {
                        r5 = new Object();
                        r5.a = false;
                        r5.b = false;
                        r5.c = false;
                    }
                    if (!r5.a) {
                        if (!r5.b) {
                            if (z || l()) {
                                r5.b = true;
                            }
                            r5.a = true;
                        }
                        if (!r5.c) {
                            if (!m()) {
                                r5.a = true;
                            } else {
                                r5.c = true;
                            }
                        }
                    }
                    if (r5 != jx0Var) {
                        hashtable.put("bc_validity", r5);
                    }
                } finally {
                }
            }
            return !r5.a;
        }
        c.k("'point' must be non-null and on this curve");
        return false;
    }

    public final boolean h() {
        if (this.b != null && this.c != null) {
            k20[] k20VarArr = this.d;
            if (k20VarArr.length <= 0 || !k20VarArr[0].O()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        is isVar = this.a;
        if (isVar == null) {
            i = 0;
        } else {
            i = ~isVar.hashCode();
        }
        if (!h()) {
            ls j = j();
            return (j.e().hashCode() * 257) ^ (i ^ (j.b.hashCode() * 17));
        }
        return i;
    }

    public final boolean i() {
        int d = d();
        if (d != 0 && d != 5 && !h() && !this.d[0].N()) {
            return false;
        }
        return true;
    }

    public final ls j() {
        int d;
        if (!h() && (d = d()) != 0 && d != 5) {
            k20 f = f();
            if (!f.N()) {
                is isVar = this.a;
                if (isVar != null) {
                    k20 i = isVar.i(wl.b());
                    return k(f.T(i).J().T(i));
                }
                c.o("Detached points must be in affine coordinates");
                return null;
            }
            return this;
        }
        return this;
    }

    public final ls k(k20 k20Var) {
        int d = d();
        k20 k20Var2 = this.c;
        k20 k20Var3 = this.b;
        is isVar = this.a;
        if (d != 1) {
            if (d != 2 && d != 3 && d != 4) {
                if (d != 6) {
                    c.o("not a projective coordinate system");
                    return null;
                }
            } else {
                k20 k0 = k20Var.k0();
                return isVar.b(k20Var3.T(k0), k20Var2.T(k0.T(k20Var)));
            }
        }
        return isVar.b(k20Var3.T(k20Var), k20Var2.T(k20Var));
    }

    public final boolean l() {
        k20 V;
        k20 T;
        int i = this.f;
        is isVar = this.a;
        k20 k20Var = this.c;
        k20 k20Var2 = this.b;
        k20[] k20VarArr = this.d;
        switch (i) {
            case 0:
                k20 k20Var3 = isVar.b;
                k20 k20Var4 = isVar.c;
                int i2 = isVar.f;
                if (i2 == 6) {
                    k20 k20Var5 = k20VarArr[0];
                    boolean N = k20Var5.N();
                    if (k20Var2.O()) {
                        T = k20Var.k0();
                        if (!N) {
                            k20Var4 = k20Var4.T(k20Var5.k0());
                        }
                    } else {
                        k20 k0 = k20Var2.k0();
                        if (N) {
                            V = k20Var.k0().a(k20Var).a(k20Var3);
                            k20Var4 = k0.k0().a(k20Var4);
                        } else {
                            k20 k02 = k20Var5.k0();
                            k20 k03 = k02.k0();
                            V = k20Var.a(k20Var5).V(k20Var, k20Var3, k02);
                            k20Var4 = k0.l0(k20Var4, k03);
                        }
                        T = V.T(k0);
                    }
                    return T.equals(k20Var4);
                }
                k20 T2 = k20Var.a(k20Var2).T(k20Var);
                if (i2 != 0) {
                    if (i2 == 1) {
                        k20 k20Var6 = k20VarArr[0];
                        if (!k20Var6.N()) {
                            k20 T3 = k20Var6.T(k20Var6.k0());
                            T2 = T2.T(k20Var6);
                            k20Var3 = k20Var3.T(k20Var6);
                            k20Var4 = k20Var4.T(T3);
                        }
                    } else {
                        c.o("unsupported coordinate system");
                        return false;
                    }
                }
                return T2.equals(k20Var2.a(k20Var3).T(k20Var2.k0()).a(k20Var4));
            default:
                k20 k20Var7 = isVar.b;
                k20 k20Var8 = isVar.c;
                k20 k04 = k20Var.k0();
                int d = d();
                if (d != 0) {
                    if (d != 1) {
                        if (d != 2 && d != 3 && d != 4) {
                            c.o("unsupported coordinate system");
                            return false;
                        }
                        k20 k20Var9 = k20VarArr[0];
                        if (!k20Var9.N()) {
                            k20 k05 = k20Var9.k0();
                            k20 k06 = k05.k0();
                            k20 T4 = k05.T(k06);
                            k20Var7 = k20Var7.T(k06);
                            k20Var8 = k20Var8.T(T4);
                        }
                    } else {
                        k20 k20Var10 = k20VarArr[0];
                        if (!k20Var10.N()) {
                            k20 k07 = k20Var10.k0();
                            k20 T5 = k20Var10.T(k07);
                            k04 = k04.T(k20Var10);
                            k20Var7 = k20Var7.T(k07);
                            k20Var8 = k20Var8.T(T5);
                        }
                    }
                }
                return k04.equals(k20Var2.k0().a(k20Var7).T(k20Var2).a(k20Var8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0060 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m() {
        /*
            r3 = this;
            int r0 = r3.f
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r3 = r3.n()
            return r3
        La:
            is r0 = r3.a
            java.math.BigInteger r1 = r0.e
            java.math.BigInteger r2 = defpackage.fs.c
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L28
            ls r3 = r3.j()
            r3.c()
            k20 r3 = r3.b
            js r3 = (defpackage.js) r3
            int r3 = r3.u0()
            if (r3 == 0) goto L62
            goto L60
        L28:
            java.math.BigInteger r2 = defpackage.fs.d
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L64
            ls r3 = r3.j()
            r3.c()
            k20 r1 = r3.b
            r2 = r0
            gs r2 = (defpackage.gs) r2
            k20 r0 = r0.b
            k20 r0 = r1.a(r0)
            k20 r0 = r2.j(r0)
            if (r0 != 0) goto L49
            goto L62
        L49:
            r3.c()
            k20 r3 = r3.e()
            k20 r0 = r1.T(r0)
            k20 r3 = r0.a(r3)
            js r3 = (defpackage.js) r3
            int r3 = r3.u0()
            if (r3 != 0) goto L62
        L60:
            r3 = 1
            goto L68
        L62:
            r3 = 0
            goto L68
        L64:
            boolean r3 = r3.n()
        L68:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls.m():boolean");
    }

    public final boolean n() {
        BigInteger bigInteger;
        ls lsVar;
        BigInteger bigInteger2 = fs.b;
        is isVar = this.a;
        if (!bigInteger2.equals(isVar.e) && (bigInteger = isVar.d) != null) {
            BigInteger abs = bigInteger.abs();
            ls g2 = isVar.g();
            int bitLength = abs.bitLength();
            if (bitLength > 0) {
                if (abs.testBit(0)) {
                    g2 = this;
                }
                for (int i = 1; i < bitLength; i++) {
                    this = this.o();
                    if (abs.testBit(i)) {
                        g2 = g2.a(this);
                    }
                }
            }
            if (bigInteger.signum() < 0) {
                switch (g2.f) {
                    case 0:
                        k20[] k20VarArr = g2.d;
                        is isVar2 = g2.a;
                        k20 k20Var = g2.c;
                        if (!g2.h()) {
                            k20 k20Var2 = g2.b;
                            if (!k20Var2.O()) {
                                int d = g2.d();
                                if (d != 0) {
                                    if (d != 1) {
                                        if (d != 5) {
                                            if (d == 6) {
                                                k20 k20Var3 = k20VarArr[0];
                                                lsVar = new ls(isVar2, k20Var2, k20Var.a(k20Var3), new k20[]{k20Var3}, 0);
                                            } else {
                                                c.o("unsupported coordinate system");
                                                g2 = null;
                                                break;
                                            }
                                        } else {
                                            g2 = new ls(isVar2, k20Var2, k20Var.b(), 0);
                                            break;
                                        }
                                    } else {
                                        lsVar = new ls(isVar2, k20Var2, k20Var.a(k20Var2), new k20[]{k20VarArr[0]}, 0);
                                    }
                                    g2 = lsVar;
                                    break;
                                } else {
                                    g2 = new ls(isVar2, k20Var2, k20Var.a(k20Var2), 0);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        k20 k20Var4 = g2.c;
                        if (!g2.h()) {
                            is isVar3 = g2.a;
                            int i2 = isVar3.f;
                            k20 k20Var5 = g2.b;
                            if (i2 != 0) {
                                lsVar = new ls(isVar3, k20Var5, k20Var4.W(), g2.d, 1);
                                g2 = lsVar;
                                break;
                            } else {
                                g2 = new ls(isVar3, k20Var5, k20Var4.W(), 1);
                                break;
                            }
                        }
                        break;
                }
            }
            if (!g2.h()) {
                return false;
            }
        }
        return true;
    }

    public final ls o() {
        k20 T;
        ls lsVar;
        k20 T2;
        k20 k0;
        k20 T3;
        k20 T4;
        k20 a;
        k20 l0;
        k20 T5;
        k20 T6;
        k20 k02;
        ls lsVar2;
        k20 k20Var;
        k20 T7;
        k20 k03;
        int i = this.f;
        k20 k20Var2 = this.b;
        k20[] k20VarArr = this.d;
        k20 k20Var3 = this.c;
        switch (i) {
            case 0:
                if (!h()) {
                    boolean O = k20Var2.O();
                    is isVar = this.a;
                    if (O) {
                        return isVar.g();
                    }
                    int i2 = isVar.f;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 6) {
                                k20 k20Var4 = k20VarArr[0];
                                boolean N = k20Var4.N();
                                if (N) {
                                    T2 = k20Var3;
                                } else {
                                    T2 = k20Var3.T(k20Var4);
                                }
                                if (N) {
                                    k0 = k20Var4;
                                } else {
                                    k0 = k20Var4.k0();
                                }
                                k20 k20Var5 = isVar.b;
                                if (N) {
                                    T3 = k20Var5;
                                } else {
                                    T3 = k20Var5.T(k0);
                                }
                                k20 a2 = k20Var3.k0().a(T2).a(T3);
                                if (a2.O()) {
                                    return new ls(isVar, a2, isVar.c.j0(), 0);
                                }
                                k20 k04 = a2.k0();
                                if (N) {
                                    T4 = a2;
                                } else {
                                    T4 = a2.T(k0);
                                }
                                k20 k20Var6 = isVar.c;
                                if (k20Var6.f() < (isVar.f() >> 1)) {
                                    k20 k05 = k20Var3.a(k20Var2).k0();
                                    if (k20Var6.N()) {
                                        l0 = T3.a(k0).k0();
                                    } else {
                                        l0 = T3.l0(k20Var6, k0.k0());
                                    }
                                    a = k05.a(a2).a(k0).T(k05).a(l0).a(k04);
                                    if (!k20Var5.O()) {
                                        if (!k20Var5.N()) {
                                            a = a.a(k20Var5.b().T(T4));
                                        }
                                        lsVar = new ls(isVar, k04, a, new k20[]{T4}, 0);
                                    }
                                } else {
                                    if (!N) {
                                        k20Var2 = k20Var2.T(k20Var4);
                                    }
                                    a = k20Var2.l0(a2, T2).a(k04);
                                }
                                a = a.a(T4);
                                lsVar = new ls(isVar, k04, a, new k20[]{T4}, 0);
                            } else {
                                c.o("unsupported coordinate system");
                                return null;
                            }
                        } else {
                            k20 k20Var7 = k20VarArr[0];
                            boolean N2 = k20Var7.N();
                            if (N2) {
                                T = k20Var2;
                            } else {
                                T = k20Var2.T(k20Var7);
                            }
                            if (!N2) {
                                k20Var3 = k20Var3.T(k20Var7);
                            }
                            k20 k06 = k20Var2.k0();
                            k20 a3 = k06.a(k20Var3);
                            k20 k07 = T.k0();
                            k20 a4 = a3.a(T);
                            k20 V = a4.V(a3, k07, isVar.b);
                            lsVar = new ls(isVar, T.T(V), k06.k0().V(T, V, a4), new k20[]{T.T(k07)}, 0);
                        }
                        return lsVar;
                    }
                    k20 a5 = k20Var3.q(k20Var2).a(k20Var2);
                    k20 a6 = a5.k0().a(a5).a(isVar.b);
                    return new ls(isVar, a6, k20Var2.l0(a6, a5.b()), 0);
                }
                return this;
            default:
                if (!h()) {
                    boolean O2 = k20Var3.O();
                    is isVar2 = this.a;
                    if (O2) {
                        return isVar2.g();
                    }
                    int i3 = isVar2.f;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 4) {
                                    k20 k20Var8 = k20VarArr[0];
                                    k20 k20Var9 = k20VarArr[1];
                                    if (k20Var9 == null) {
                                        k20Var9 = b(k20VarArr[0], null);
                                        k20VarArr[1] = k20Var9;
                                    }
                                    k20 k08 = k20Var2.k0();
                                    k20 a7 = k08.a(k08).a(k08).a(k20Var9);
                                    k20 a8 = k20Var3.a(k20Var3);
                                    k20 T8 = a8.T(k20Var3);
                                    k20 T9 = k20Var2.T(T8);
                                    k20 a9 = T9.a(T9);
                                    k20 n0 = a7.k0().n0(a9.a(a9));
                                    k20 k09 = T8.k0();
                                    k20 a10 = k09.a(k09);
                                    k20 n02 = a7.T(a9.n0(n0)).n0(a10);
                                    k20 T10 = a10.T(k20Var9);
                                    k20 a11 = T10.a(T10);
                                    if (!k20Var8.N()) {
                                        a8 = a8.T(k20Var8);
                                    }
                                    lsVar2 = new ls(isVar2, n0, n02, new k20[]{a8, a11}, 1);
                                } else {
                                    c.o("unsupported coordinate system");
                                    return null;
                                }
                            } else {
                                k20 k20Var10 = k20VarArr[0];
                                boolean N3 = k20Var10.N();
                                k20 k010 = k20Var3.k0();
                                k20 k011 = k010.k0();
                                k20 k20Var11 = isVar2.b;
                                k20 W = k20Var11.W();
                                if (W.r0().equals(BigInteger.valueOf(3L))) {
                                    if (N3) {
                                        k03 = k20Var10;
                                    } else {
                                        k03 = k20Var10.k0();
                                    }
                                    k20 T11 = k20Var2.a(k03).T(k20Var2.n0(k03));
                                    k20Var = T11.a(T11).a(T11);
                                    T7 = k010.T(k20Var2);
                                } else {
                                    k20 k012 = k20Var2.k0();
                                    k20 a12 = k012.a(k012).a(k012);
                                    if (!N3) {
                                        if (!k20Var11.O()) {
                                            k20 k013 = k20Var10.k0().k0();
                                            if (W.f() < k20Var11.f()) {
                                                k20Var = a12.n0(k013.T(W));
                                            } else {
                                                k20Var11 = k013.T(k20Var11);
                                            }
                                        } else {
                                            k20Var = a12;
                                        }
                                        T7 = k20Var2.T(k010);
                                    }
                                    k20Var = a12.a(k20Var11);
                                    T7 = k20Var2.T(k010);
                                }
                                k20 a13 = T7.a(T7);
                                k20 a14 = a13.a(a13);
                                k20 n03 = k20Var.k0().n0(a14.a(a14));
                                k20 T12 = a14.n0(n03).T(k20Var);
                                k20 a15 = k011.a(k011);
                                k20 a16 = a15.a(a15);
                                k20 n04 = T12.n0(a16.a(a16));
                                k20 a17 = k20Var3.a(k20Var3);
                                if (!N3) {
                                    a17 = a17.T(k20Var10);
                                }
                                lsVar2 = new ls(isVar2, n03, n04, new k20[]{a17}, 1);
                            }
                        } else {
                            k20 k20Var12 = k20VarArr[0];
                            boolean N4 = k20Var12.N();
                            k20 k20Var13 = isVar2.b;
                            if (!k20Var13.O() && !N4) {
                                k20Var13 = k20Var13.T(k20Var12.k0());
                            }
                            k20 k014 = k20Var2.k0();
                            k20 a18 = k20Var13.a(k014.a(k014).a(k014));
                            if (N4) {
                                T5 = k20Var3;
                            } else {
                                T5 = k20Var3.T(k20Var12);
                            }
                            if (N4) {
                                T6 = k20Var3.k0();
                            } else {
                                T6 = T5.T(k20Var3);
                            }
                            k20 T13 = k20Var2.T(T6);
                            k20 a19 = T13.a(T13);
                            k20 a20 = a19.a(a19);
                            k20 n05 = a18.k0().n0(a20.a(a20));
                            k20 a21 = T5.a(T5);
                            k20 T14 = n05.T(a21);
                            k20 a22 = T6.a(T6);
                            k20 T15 = a20.n0(n05).T(a18);
                            k20 k015 = a22.k0();
                            k20 n06 = T15.n0(k015.a(k015));
                            if (N4) {
                                k02 = a22.a(a22);
                            } else {
                                k02 = a21.k0();
                            }
                            lsVar2 = new ls(isVar2, T14, n06, new k20[]{k02.a(k02).T(T5)}, 1);
                        }
                        return lsVar2;
                    }
                    k20 k016 = k20Var2.k0();
                    k20 q = k016.a(k016).a(k016).a(isVar2.b).q(k20Var3.a(k20Var3));
                    k20 n07 = q.k0().n0(k20Var2.a(k20Var2));
                    return new ls(isVar2, n07, q.T(k20Var2.n0(n07)).n0(k20Var3), 1);
                }
                return this;
        }
    }

    public final String toString() {
        if (h()) {
            return "INF";
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        int i = 0;
        while (true) {
            k20[] k20VarArr = this.d;
            if (i < k20VarArr.length) {
                sb.append(',');
                sb.append(k20VarArr[i]);
                i++;
            } else {
                sb.append(')');
                return sb.toString();
            }
        }
    }

    public ls(is isVar, k20 k20Var, k20 k20Var2, k20[] k20VarArr) {
        this.e = null;
        this.a = isVar;
        this.b = k20Var;
        this.c = k20Var2;
        this.d = k20VarArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ls(is isVar, k20 k20Var, k20 k20Var2, k20[] k20VarArr, int i) {
        this(isVar, k20Var, k20Var2, k20VarArr);
        this.f = i;
    }
}
