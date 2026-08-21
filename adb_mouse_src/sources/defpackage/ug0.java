package defpackage;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class ug0 extends bc {
    public final byte[] e;
    public final short[][] f;
    public final short[][] g;
    public final short[][] h;
    public final short[][] i;
    public final short[][][] j;
    public final short[][][] k;
    public final short[][][] l;
    public final short[][][] m;
    public final short[][][] n;
    public final short[][][] o;
    public final short[][][] p;
    public final byte[] q;
    public final byte[] r;

    public ug0(tg0 tg0Var, byte[] bArr) {
        super(true, tg0Var);
        gk0 gk0Var = tg0Var.f;
        int i = tg0Var.c;
        int i2 = tg0Var.b;
        int i3 = tg0Var.a;
        int i4 = tg0Var.g;
        Class cls = Short.TYPE;
        int i5 = 0;
        if (i4 == 3) {
            byte[] p = f20.p(bArr, 0, 32);
            this.q = p;
            byte[] p2 = f20.p(bArr, 32, 64);
            this.e = p2;
            byte[] e = f20.e(p2);
            byte[] e2 = f20.e(p);
            sg0 sg0Var = new sg0(e, gk0Var);
            sg0 sg0Var2 = new sg0(e2, gk0Var);
            short[][] l = wg0.l(sg0Var, i2, i);
            short[][] l2 = wg0.l(sg0Var, i3, i2);
            short[][] l3 = wg0.l(sg0Var, i3, i);
            short[][] l4 = wg0.l(sg0Var, i2, i);
            short[][] c = wv0.c(wv0.J(l2, l4), l3);
            short[][][] k = wg0.k(sg0Var2, i2, i3, i3, true);
            short[][][] k2 = wg0.k(sg0Var2, i2, i3, i2, false);
            short[][][] k3 = wg0.k(sg0Var2, i, i3, i3, true);
            short[][][] k4 = wg0.k(sg0Var2, i, i3, i2, false);
            short[][][] k5 = wg0.k(sg0Var2, i, i3, i, false);
            short[][][] k6 = wg0.k(sg0Var2, i, i2, i2, true);
            short[][][] k7 = wg0.k(sg0Var2, i, i2, i, false);
            short[][][] L = wv0.L(l, k3, k);
            short[][][] L2 = wv0.L(l, k4, k2);
            short[][][] d = wg0.d(L);
            short[][][] sArr = new short[i2][];
            while (i5 < i2) {
                short[][][] sArr2 = k3;
                short[][] f = wv0.f(L[i5]);
                sArr[i5] = f;
                short[][] J = wv0.J(f, l2);
                sArr[i5] = J;
                sArr[i5] = wv0.c(J, L2[i5]);
                i5++;
                k4 = k4;
                k3 = sArr2;
            }
            short[][][] sArr3 = k3;
            short[][][] sArr4 = k4;
            short[][][] sArr5 = new short[i][];
            short[][][] sArr6 = new short[i][];
            short[][][] sArr7 = new short[i][];
            short[][][] sArr8 = new short[i][];
            short[][][] d2 = wg0.d(sArr3);
            int i6 = 0;
            while (i6 < i) {
                short[][][] sArr9 = sArr5;
                short[][] f2 = wv0.f(sArr3[i6]);
                short[][][] sArr10 = sArr8;
                short[][] J2 = wv0.J(f2, l2);
                sArr9[i6] = J2;
                short[][][] sArr11 = sArr;
                sArr9[i6] = wv0.c(J2, sArr4[i6]);
                sArr6[i6] = wv0.J(f2, c);
                short[][] c2 = wv0.c(sArr6[i6], wv0.J(sArr4[i6], l4));
                sArr6[i6] = c2;
                sArr6[i6] = wv0.c(c2, k5[i6]);
                short[][] c3 = wv0.c(wv0.J(sArr3[i6], l2), sArr4[i6]);
                short[][] a0 = wv0.a0(l2);
                short[][] J3 = wv0.J(a0, c3);
                sArr7[i6] = J3;
                short[][] c4 = wv0.c(J3, k6[i6]);
                sArr7[i6] = c4;
                short[][] sArr12 = l;
                if (c4.length == c4[0].length) {
                    short[][] sArr13 = (short[][]) Array.newInstance((Class<?>) cls, c4.length, c4.length);
                    int i7 = 0;
                    while (i7 < c4.length) {
                        sArr13[i7][i7] = c4[i7][i7];
                        short[][] sArr14 = c4;
                        int i8 = i7 + 1;
                        while (i8 < sArr14[0].length) {
                            short[] sArr15 = sArr13[i7];
                            short s = sArr14[i7][i8];
                            short s2 = sArr14[i8][i7];
                            byte[][] bArr2 = oz.a;
                            int i9 = i8;
                            sArr15[i9] = (short) (s ^ s2);
                            i8 = i9 + 1;
                        }
                        c4 = sArr14;
                        i7 = i8;
                    }
                    sArr7[i6] = sArr13;
                    sArr10[i6] = wv0.J(a0, sArr6[i6]);
                    sArr10[i6] = wv0.c(sArr10[i6], wv0.J(wv0.a0(sArr4[i6]), c));
                    short[][] c5 = wv0.c(sArr10[i6], wv0.J(wv0.f(k6[i6]), l4));
                    sArr10[i6] = c5;
                    sArr10[i6] = wv0.c(c5, k7[i6]);
                    i6++;
                    sArr8 = sArr10;
                    sArr5 = sArr9;
                    sArr = sArr11;
                    l = sArr12;
                } else {
                    f40.f("Computation to upper triangular matrix is not possible!");
                    throw null;
                }
            }
            ug0 ug0Var = new ug0(tg0Var, e, l, l2, l4, c, d, sArr, d2, sArr5, sArr6, sArr7, sArr8);
            this.r = null;
            this.f = ug0Var.f;
            this.g = ug0Var.g;
            this.h = ug0Var.h;
            this.i = ug0Var.i;
            this.j = ug0Var.j;
            this.k = ug0Var.k;
            this.l = ug0Var.l;
            this.m = ug0Var.m;
            this.n = ug0Var.n;
            this.o = ug0Var.o;
            this.p = ug0Var.p;
            return;
        }
        short[][] sArr16 = (short[][]) Array.newInstance((Class<?>) cls, i2, i);
        this.f = sArr16;
        short[][] sArr17 = (short[][]) Array.newInstance((Class<?>) cls, i3, i2);
        this.g = sArr17;
        short[][] sArr18 = (short[][]) Array.newInstance((Class<?>) cls, i3, i);
        this.i = sArr18;
        short[][] sArr19 = (short[][]) Array.newInstance((Class<?>) cls, i2, i);
        this.h = sArr19;
        short[][][] sArr20 = (short[][][]) Array.newInstance((Class<?>) cls, i2, i3, i3);
        this.j = sArr20;
        short[][][] sArr21 = (short[][][]) Array.newInstance((Class<?>) cls, i2, i3, i2);
        this.k = sArr21;
        short[][][] sArr22 = (short[][][]) Array.newInstance((Class<?>) cls, i, i3, i3);
        this.l = sArr22;
        short[][][] sArr23 = (short[][][]) Array.newInstance((Class<?>) cls, i, i3, i2);
        this.m = sArr23;
        short[][][] sArr24 = (short[][][]) Array.newInstance((Class<?>) cls, i, i3, i);
        this.n = sArr24;
        short[][][] sArr25 = (short[][][]) Array.newInstance((Class<?>) cls, i, i2, i2);
        this.o = sArr25;
        short[][][] sArr26 = (short[][][]) Array.newInstance((Class<?>) cls, i, i2, i);
        this.p = sArr26;
        this.q = null;
        byte[] p3 = f20.p(bArr, 0, 32);
        this.e = p3;
        int length = p3.length;
        int s3 = wg0.s(sArr16, bArr, length) + length;
        int s4 = wg0.s(sArr17, bArr, s3) + s3;
        int s5 = wg0.s(sArr18, bArr, s4) + s4;
        int s6 = wg0.s(sArr19, bArr, s5) + s5;
        int t = wg0.t(sArr20, bArr, s6, true) + s6;
        int t2 = wg0.t(sArr21, bArr, t, false) + t;
        int t3 = wg0.t(sArr22, bArr, t2, true) + t2;
        int t4 = wg0.t(sArr23, bArr, t3, false) + t3;
        int t5 = wg0.t(sArr24, bArr, t4, false) + t4;
        int t6 = wg0.t(sArr25, bArr, t5, true) + t5;
        this.r = f20.p(bArr, wg0.t(sArr26, bArr, t6, false) + t6, bArr.length);
    }

    public final byte[] getEncoded() {
        byte[] h;
        int i = ((tg0) this.d).g;
        byte[] bArr = this.e;
        byte[] bArr2 = this.q;
        if (i == 3) {
            return f20.h(bArr2, bArr);
        }
        if (i == 3) {
            h = f20.h(bArr2, bArr);
        } else {
            h = f20.h(f20.h(f20.h(f20.h(f20.h(f20.h(f20.h(f20.h(f20.h(f20.h(f20.h(bArr, wg0.n(this.f)), wg0.n(this.g)), wg0.n(this.i)), wg0.n(this.h)), wg0.o(this.j, true)), wg0.o(this.k, false)), wg0.o(this.l, true)), wg0.o(this.m, false)), wg0.o(this.n, false)), wg0.o(this.o, true)), wg0.o(this.p, false));
        }
        return f20.h(h, this.r);
    }

    public ug0(tg0 tg0Var, byte[] bArr, short[][] sArr, short[][] sArr2, short[][] sArr3, short[][] sArr4, short[][][] sArr5, short[][][] sArr6, short[][][] sArr7, short[][][] sArr8, short[][][] sArr9, short[][][] sArr10, short[][][] sArr11) {
        super(true, tg0Var);
        this.q = null;
        this.r = null;
        this.e = (byte[]) bArr.clone();
        this.f = wg0.c(sArr);
        this.g = wg0.c(sArr2);
        this.h = wg0.c(sArr3);
        this.i = wg0.c(sArr4);
        this.j = wg0.d(sArr5);
        this.k = wg0.d(sArr6);
        this.l = wg0.d(sArr7);
        this.m = wg0.d(sArr8);
        this.n = wg0.d(sArr9);
        this.o = wg0.d(sArr10);
        this.p = wg0.d(sArr11);
    }
}
