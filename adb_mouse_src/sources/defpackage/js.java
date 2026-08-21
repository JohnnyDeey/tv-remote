package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class js extends k20 {
    public final int G;
    public final int H;
    public final int[] I;
    public final q70 J;

    public js(int i, int[] iArr, q70 q70Var) {
        super(17);
        int i2;
        this.H = i;
        if (iArr.length == 1) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.G = i2;
        this.I = iArr;
        this.J = q70Var;
    }

    @Override // defpackage.k20
    public final int A() {
        return this.H;
    }

    @Override // defpackage.k20
    public final k20 J() {
        int i;
        q70 q70Var = this.J;
        int f = q70Var.f();
        if (f != 0) {
            int i2 = this.H;
            int[] iArr = this.I;
            int i3 = 1;
            if (f != 1) {
                q70 q70Var2 = (q70) q70Var.clone();
                int i4 = (i2 + 63) >>> 6;
                q70 q70Var3 = new q70(i4);
                long[] jArr = q70Var3.c;
                q70.h(jArr, i2);
                int length = iArr.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    q70.h(jArr, iArr[length]);
                }
                int i5 = 0;
                q70.h(jArr, 0);
                q70 q70Var4 = new q70(i4);
                q70Var4.c[0] = 1;
                q70 q70Var5 = new q70(i4);
                int[] iArr2 = new int[2];
                iArr2[0] = f;
                iArr2[1] = i2 + 1;
                q70[] q70VarArr = {q70Var2, q70Var3};
                int[] iArr3 = new int[2];
                iArr3[0] = 1;
                iArr3[1] = 0;
                q70[] q70VarArr2 = {q70Var4, q70Var5};
                int i6 = iArr2[1];
                int i7 = i6 - iArr2[0];
                while (true) {
                    if (i7 < 0) {
                        i7 = -i7;
                        iArr2[i3] = i6;
                        iArr3[i3] = i5;
                        i3 = 1 - i3;
                        i6 = iArr2[i3];
                        i5 = iArr3[i3];
                    }
                    i = 1 - i3;
                    q70VarArr[i3].b(q70VarArr[i], iArr2[i], i7);
                    int g = q70VarArr[i3].g(i6);
                    if (g == 0) {
                        break;
                    }
                    int i8 = iArr3[i];
                    q70VarArr2[i3].b(q70VarArr2[i], i8, i7);
                    int i9 = i8 + i7;
                    if (i9 > i5) {
                        i5 = i9;
                    } else if (i9 == i5) {
                        i5 = q70VarArr2[i3].g(i5);
                    }
                    i7 += g - i6;
                    i6 = g;
                }
                q70Var = q70VarArr2[i];
            }
            return new js(i2, iArr, q70Var);
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.k20
    public final boolean N() {
        return this.J.m();
    }

    @Override // defpackage.k20
    public final boolean O() {
        return this.J.n();
    }

    @Override // defpackage.k20
    public final k20 T(k20 k20Var) {
        int i;
        long[] jArr;
        int i2;
        q70 q70Var = ((js) k20Var).J;
        q70 q70Var2 = this.J;
        int f = q70Var2.f();
        int i3 = this.H;
        int[] iArr = this.I;
        if (f == 0) {
            q70Var = q70Var2;
        } else {
            int f2 = q70Var.f();
            if (f2 != 0) {
                if (f > f2) {
                    q70Var2 = q70Var;
                    q70Var = q70Var2;
                    f2 = f;
                    f = f2;
                }
                int i4 = (f + 63) >>> 6;
                int i5 = (f2 + 63) >>> 6;
                int i6 = ((f + f2) + 62) >>> 6;
                if (i4 == 1) {
                    long j = q70Var2.c[0];
                    if (j != 1) {
                        long[] jArr2 = new long[i6];
                        q70.p(j, q70Var.c, i5, jArr2);
                        q70Var = new q70(jArr2, q70.q(jArr2, i6, i3, iArr));
                    }
                } else {
                    int i7 = (f2 + 70) >>> 6;
                    int[] iArr2 = new int[16];
                    int i8 = i7 << 4;
                    long[] jArr3 = new long[i8];
                    iArr2[1] = i7;
                    System.arraycopy(q70Var.c, 0, jArr3, i7, i5);
                    int i9 = 2;
                    int i10 = i7;
                    while (i9 < 16) {
                        int i11 = i10 + i7;
                        iArr2[i9] = i11;
                        if ((i9 & 1) == 0) {
                            q70.r(jArr3, i11 >>> 1, jArr3, i11, i7, 1);
                        } else {
                            int i12 = i11 - i7;
                            for (int i13 = 0; i13 < i7; i13++) {
                                jArr3[i11 + i13] = jArr3[i7 + i13] ^ jArr3[i12 + i13];
                            }
                        }
                        i9++;
                        i10 = i11;
                    }
                    long[] jArr4 = new long[i8];
                    q70.r(jArr3, 0, jArr4, 0, i8, 4);
                    long[] jArr5 = q70Var2.c;
                    int i14 = i6 << 3;
                    long[] jArr6 = new long[i14];
                    int i15 = 0;
                    while (i15 < i4) {
                        int i16 = i3;
                        int i17 = i15;
                        long j2 = jArr5[i15];
                        while (true) {
                            jArr = jArr5;
                            i2 = i14;
                            int i18 = iArr2[((int) j2) & 15];
                            int i19 = iArr2[((int) (j2 >>> 4)) & 15];
                            for (int i20 = 0; i20 < i7; i20++) {
                                int i21 = i17 + i20;
                                jArr6[i21] = jArr6[i21] ^ (jArr3[i18 + i20] ^ jArr4[i19 + i20]);
                            }
                            j2 >>>= 8;
                            if (j2 == 0) {
                                break;
                            }
                            i17 += i6;
                            i14 = i2;
                            jArr5 = jArr;
                        }
                        i15++;
                        i14 = i2;
                        i3 = i16;
                        jArr5 = jArr;
                    }
                    i = i3;
                    while (true) {
                        int i22 = i14 - i6;
                        if (i22 == 0) {
                            break;
                        }
                        q70.d(jArr6, i22 - i6, jArr6, i22, i6, 8);
                        i14 = i22;
                    }
                    q70Var = new q70(jArr6, q70.q(jArr6, i6, i, iArr));
                    return new js(i, iArr, q70Var);
                }
            }
        }
        i = i3;
        return new js(i, iArr, q70Var);
    }

    @Override // defpackage.k20
    public final k20 U(k20 k20Var, k20 k20Var2, k20 k20Var3) {
        return V(k20Var, k20Var2, k20Var3);
    }

    @Override // defpackage.k20
    public final k20 V(k20 k20Var, k20 k20Var2, k20 k20Var3) {
        q70 q70Var = ((js) k20Var).J;
        q70 q70Var2 = ((js) k20Var2).J;
        q70 q70Var3 = ((js) k20Var3).J;
        q70 q70Var4 = this.J;
        q70 o = q70Var4.o(q70Var);
        q70 o2 = q70Var2.o(q70Var3);
        if (o == q70Var4 || o == q70Var) {
            o = (q70) o.clone();
        }
        o.c(o2);
        long[] jArr = o.c;
        int length = jArr.length;
        int i = this.H;
        int[] iArr = this.I;
        int q = q70.q(jArr, length, i, iArr);
        if (q < jArr.length) {
            long[] jArr2 = new long[q];
            o.c = jArr2;
            System.arraycopy(jArr, 0, jArr2, 0, q);
        }
        return new js(i, iArr, o);
    }

    @Override // defpackage.k20
    public final k20 a(k20 k20Var) {
        q70 q70Var = (q70) this.J.clone();
        q70Var.c(((js) k20Var).J);
        return new js(this.H, this.I, q70Var);
    }

    @Override // defpackage.k20
    public final k20 b() {
        q70 q70Var;
        q70 q70Var2 = this.J;
        if (q70Var2.c.length == 0) {
            q70Var = new q70(new long[]{1});
        } else {
            int max = Math.max(1, q70Var2.k());
            long[] jArr = new long[max];
            long[] jArr2 = q70Var2.c;
            System.arraycopy(jArr2, 0, jArr, 0, Math.min(jArr2.length, max));
            jArr[0] = jArr[0] ^ 1;
            q70Var = new q70(jArr);
        }
        return new js(this.H, this.I, q70Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof js) {
                js jsVar = (js) obj;
                if (this.H == jsVar.H && this.G == jsVar.G && Arrays.equals(this.I, jsVar.I) && this.J.equals(jsVar.J)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.k20
    public final int f() {
        return this.J.f();
    }

    public final int hashCode() {
        int hashCode = this.J.hashCode() ^ this.H;
        int[] iArr = this.I;
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i = (i * 257) ^ iArr[length];
            } else {
                return hashCode ^ i;
            }
        }
    }

    @Override // defpackage.k20
    public final k20 j0() {
        q70 q70Var = this.J;
        if (!q70Var.n() && !q70Var.m()) {
            return m0(this.H - 1);
        }
        return this;
    }

    @Override // defpackage.k20
    public final k20 k0() {
        q70 q70Var = this.J;
        int k = q70Var.k();
        int i = this.H;
        int[] iArr = this.I;
        if (k != 0) {
            int i2 = k << 1;
            long[] jArr = new long[i2];
            int i3 = 0;
            while (i3 < i2) {
                long j = q70Var.c[i3 >>> 1];
                int i4 = i3 + 1;
                jArr[i3] = q70.l((int) j);
                i3 += 2;
                jArr[i4] = q70.l((int) (j >>> 32));
            }
            q70Var = new q70(jArr, q70.q(jArr, i2, i, iArr));
        }
        return new js(i, iArr, q70Var);
    }

    @Override // defpackage.k20
    public final k20 l0(k20 k20Var, k20 k20Var2) {
        q70 q70Var;
        q70 q70Var2 = ((js) k20Var).J;
        q70 q70Var3 = ((js) k20Var2).J;
        q70 q70Var4 = this.J;
        int k = q70Var4.k();
        if (k == 0) {
            q70Var = q70Var4;
        } else {
            int i = k << 1;
            long[] jArr = new long[i];
            int i2 = 0;
            while (i2 < i) {
                long j = q70Var4.c[i2 >>> 1];
                int i3 = i2 + 1;
                jArr[i2] = q70.l((int) j);
                i2 += 2;
                jArr[i3] = q70.l((int) (j >>> 32));
            }
            q70Var = new q70(jArr, i);
        }
        q70 o = q70Var2.o(q70Var3);
        if (q70Var == q70Var4) {
            q70Var = (q70) q70Var.clone();
        }
        q70Var.c(o);
        long[] jArr2 = q70Var.c;
        int length = jArr2.length;
        int i4 = this.H;
        int[] iArr = this.I;
        int q = q70.q(jArr2, length, i4, iArr);
        if (q < jArr2.length) {
            long[] jArr3 = new long[q];
            q70Var.c = jArr3;
            System.arraycopy(jArr2, 0, jArr3, 0, q);
        }
        return new js(i4, iArr, q70Var);
    }

    @Override // defpackage.k20
    public final k20 m0(int i) {
        if (i < 1) {
            return this;
        }
        q70 q70Var = this.J;
        int k = q70Var.k();
        int i2 = this.H;
        int[] iArr = this.I;
        if (k != 0) {
            int i3 = ((i2 + 63) >>> 6) << 1;
            long[] jArr = new long[i3];
            System.arraycopy(q70Var.c, 0, jArr, 0, k);
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                int i4 = k << 1;
                while (true) {
                    k--;
                    if (k >= 0) {
                        long j = jArr[k];
                        jArr[i4 - 1] = q70.l((int) (j >>> 32));
                        i4 -= 2;
                        jArr[i4] = q70.l((int) j);
                    }
                }
                k = q70.q(jArr, i3, i2, iArr);
            }
            q70Var = new q70(jArr, k);
        }
        return new js(i2, iArr, q70Var);
    }

    @Override // defpackage.k20
    public final k20 n0(k20 k20Var) {
        return a(k20Var);
    }

    @Override // defpackage.k20
    public final boolean o0() {
        long[] jArr = this.J.c;
        if (jArr.length <= 0 || (jArr[0] & 1) == 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.k20
    public final k20 q(k20 k20Var) {
        return T(k20Var.J());
    }

    @Override // defpackage.k20
    public final BigInteger r0() {
        q70 q70Var = this.J;
        int k = q70Var.k();
        if (k == 0) {
            return fs.a;
        }
        int i = k - 1;
        long j = q70Var.c[i];
        byte[] bArr = new byte[8];
        int i2 = 0;
        boolean z = false;
        for (int i3 = 7; i3 >= 0; i3--) {
            byte b = (byte) (j >>> (i3 * 8));
            if (z || b != 0) {
                bArr[i2] = b;
                i2++;
                z = true;
            }
        }
        byte[] bArr2 = new byte[(i * 8) + i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = bArr[i4];
        }
        for (int i5 = k - 2; i5 >= 0; i5--) {
            long j2 = q70Var.c[i5];
            int i6 = 7;
            while (i6 >= 0) {
                bArr2[i2] = (byte) (j2 >>> (i6 * 8));
                i6--;
                i2++;
            }
        }
        return new BigInteger(1, bArr2);
    }

    public final int u0() {
        int i = this.H;
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i);
        k20 k20Var = this;
        int i2 = 1;
        while (numberOfLeadingZeros > 0) {
            k20Var = k20Var.m0(i2).a(k20Var);
            numberOfLeadingZeros--;
            i2 = i >>> numberOfLeadingZeros;
            if ((i2 & 1) != 0) {
                k20Var = k20Var.k0().a(this);
            }
        }
        if (k20Var.O()) {
            return 0;
        }
        if (k20Var.N()) {
            return 1;
        }
        c.o("Internal error in trace calculation");
        return 0;
    }

    @Override // defpackage.k20
    public final k20 W() {
        return this;
    }
}
