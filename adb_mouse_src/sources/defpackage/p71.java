package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class p71 {
    public static final boolean e = c91.e;
    public sb0 a;
    public final byte[] b;
    public final int c;
    public int d;

    public p71(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.b = bArr;
            this.d = 0;
            this.c = i;
        } else {
            Locale locale = Locale.US;
            c.k(qo0.o("Array range is invalid. Buffer.length=", length, ", offset=0, length=", i));
            throw null;
        }
    }

    public static int n(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int o(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void a(byte b) {
        int i = this.d;
        try {
            int i2 = i + 1;
            try {
                this.b[i] = b;
                this.d = i2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                i = i2;
                throw new s71(i, this.c, 1, e);
            }
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
        }
    }

    public final void b(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new s71(this.d, this.c, i2, e2);
        }
    }

    public final void c(int i, int i2) {
        k((i << 3) | 5);
        d(i2);
    }

    public final void d(int i) {
        int i2 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.d = i2 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new s71(i2, this.c, 4, e2);
        }
    }

    public final void e(int i, long j) {
        k((i << 3) | 1);
        f(j);
    }

    public final void f(long j) {
        int i = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.d = i + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new s71(i, this.c, 8, e2);
        }
    }

    public final void g(int i, int i2) {
        k(i << 3);
        h(i2);
    }

    public final void h(int i) {
        if (i >= 0) {
            k(i);
        } else {
            m(i);
        }
    }

    public final void i(int i, int i2) {
        k((i << 3) | i2);
    }

    public final void j(int i, int i2) {
        k(i << 3);
        k(i2);
    }

    public final void k(int i) {
        int i2;
        int i3 = this.d;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.b;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.d = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e2) {
                    throw new s71(i2, this.c, 1, e2);
                }
            }
            throw new s71(i2, this.c, 1, e2);
        }
    }

    public final void l(int i, long j) {
        k(i << 3);
        m(j);
    }

    public final void m(long j) {
        int i;
        int i2 = this.d;
        boolean z = e;
        byte[] bArr = this.b;
        int i3 = this.c;
        if (z && i3 - i2 >= 10) {
            int i4 = i2;
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                c91.c.h(bArr, c91.f + i4, (byte) (((int) j2) | 128));
                j2 >>>= 7;
                i4++;
            }
            i = i4 + 1;
            c91.c.h(bArr, c91.f + i4, (byte) j2);
        } else {
            int i5 = i2;
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                int i6 = i5 + 1;
                try {
                    bArr[i5] = (byte) (((int) j3) | 128);
                    j3 >>>= 7;
                    i5 = i6;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i = i6;
                    throw new s71(i, i3, 1, e);
                }
            }
            i = i5 + 1;
            try {
                bArr[i5] = (byte) j3;
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                throw new s71(i, i3, 1, e);
            }
        }
        this.d = i;
    }
}
