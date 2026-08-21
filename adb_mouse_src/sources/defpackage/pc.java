package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class pc {
    public static final nc e = new pc(-1, false, false);
    public static final byte[] f = {13, 10};
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;

    /* JADX WARN: Type inference failed for: r0v0, types: [pc, nc] */
    static {
        new pc(-1, true, false);
        new pc(76, false, true);
        new pc(64, false, true);
    }

    public pc(int i, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = i;
        if (z && z2) {
            c.k("Failed requirement.");
            throw null;
        }
        this.d = i / 4;
    }

    public static void a(int i, int i2) {
        if (i2 <= i) {
            if (i2 >= 0) {
                return;
            }
            c.k(qo0.m("startIndex: 0 > endIndex: ", i2));
            return;
        }
        c.m(qo0.o("startIndex: 0, endIndex: ", i2, ", size: ", i));
    }

    public final int b(int i) {
        int i2 = (i / 3) * 4;
        if (i % 3 != 0) {
            i2 += 4;
        }
        if (i2 >= 0) {
            if (this.b) {
                i2 += ((i2 - 1) / this.c) * 2;
            }
            if (i2 >= 0) {
                return i2;
            }
            c.k("Input is too big");
            return 0;
        }
        c.k("Input is too big");
        return 0;
    }

    public final byte[] c(int i, byte[] bArr) {
        byte[] bArr2;
        int i2;
        int i3;
        a(bArr.length, i);
        int b = b(i);
        byte[] bArr3 = new byte[b];
        a(bArr.length, i);
        int b2 = b(i);
        if (b >= 0) {
            if (b2 >= 0 && b2 <= b) {
                if (this.a) {
                    bArr2 = qc.b;
                } else {
                    bArr2 = qc.a;
                }
                if (this.b) {
                    i2 = this.d;
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    i3 = i4 + 2;
                    if (i3 >= i) {
                        break;
                    }
                    int min = Math.min((i - i4) / 3, i2);
                    for (int i6 = 0; i6 < min; i6++) {
                        int i7 = bArr[i4] & 255;
                        int i8 = i4 + 2;
                        int i9 = bArr[i4 + 1] & 255;
                        i4 += 3;
                        int i10 = (i9 << 8) | (i7 << 16) | (bArr[i8] & 255);
                        bArr3[i5] = bArr2[i10 >>> 18];
                        bArr3[i5 + 1] = bArr2[(i10 >>> 12) & 63];
                        int i11 = i5 + 3;
                        bArr3[i5 + 2] = bArr2[(i10 >>> 6) & 63];
                        i5 += 4;
                        bArr3[i11] = bArr2[i10 & 63];
                    }
                    if (min == i2 && i4 != i) {
                        int i12 = i5 + 1;
                        byte[] bArr4 = f;
                        bArr3[i5] = bArr4[0];
                        i5 += 2;
                        bArr3[i12] = bArr4[1];
                    }
                }
                int i13 = i - i4;
                if (i13 != 1) {
                    if (i13 == 2) {
                        int i14 = ((bArr[i4 + 1] & 255) << 2) | ((bArr[i4] & 255) << 10);
                        bArr3[i5] = bArr2[i14 >>> 12];
                        bArr3[i5 + 1] = bArr2[(i14 >>> 6) & 63];
                        bArr3[i5 + 2] = bArr2[i14 & 63];
                        bArr3[i5 + 3] = 61;
                        i4 = i3;
                    }
                } else {
                    int i15 = (bArr[i4] & 255) << 4;
                    bArr3[i5] = bArr2[i15 >>> 6];
                    bArr3[i5 + 1] = bArr2[i15 & 63];
                    bArr3[i5 + 2] = 61;
                    bArr3[i5 + 3] = 61;
                    i4++;
                }
                if (i4 == i) {
                    return bArr3;
                }
                c.o("Check failed.");
                return null;
            }
            c.m(qo0.o("The destination array does not have enough capacity, destination offset: 0, destination size: ", b, ", capacity needed: ", b2));
            return null;
        }
        c.m(qo0.m("destination offset: 0, destination size: ", b));
        return null;
    }
}
