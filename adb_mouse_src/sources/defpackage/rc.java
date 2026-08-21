package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class rc {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean[] h;

    public rc(String str, char[] cArr) {
        boolean z;
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        while (true) {
            if (i < cArr.length) {
                char c = cArr[i];
                if (c < 128) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (bArr[c] == -1) {
                        bArr[c] = (byte) i;
                        i++;
                    } else {
                        c.k(mi0.G("Duplicate character: %s", Character.valueOf(c)));
                        throw null;
                    }
                } else {
                    c.k(mi0.G("Non-ASCII character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                this.a = str;
                this.b = cArr;
                try {
                    int length = cArr.length;
                    RoundingMode roundingMode = RoundingMode.UNNECESSARY;
                    int Q = f20.Q(length);
                    this.d = Q;
                    int numberOfTrailingZeros = Integer.numberOfTrailingZeros(Q);
                    int i2 = 1 << (3 - numberOfTrailingZeros);
                    this.e = i2;
                    this.f = Q >> numberOfTrailingZeros;
                    this.c = cArr.length - 1;
                    this.g = bArr;
                    boolean[] zArr = new boolean[i2];
                    for (int i3 = 0; i3 < this.f; i3++) {
                        int i4 = this.d;
                        RoundingMode roundingMode2 = RoundingMode.CEILING;
                        zArr[f20.s(i3 * 8, i4)] = true;
                    }
                    this.h = zArr;
                    return;
                } catch (ArithmeticException e) {
                    throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
                }
            }
        }
    }

    public final int a(char c) {
        if (c <= 127) {
            byte b = this.g[c];
            if (b == -1) {
                if (c > ' ' && c != 127) {
                    throw new IOException("Unrecognized character: " + c);
                }
                throw new IOException("Unrecognized character: 0x" + Integer.toHexString(c));
            }
            return b;
        }
        throw new IOException("Unrecognized character: 0x" + Integer.toHexString(c));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof rc) && Arrays.equals(this.b, ((rc) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + 1237;
    }

    public final String toString() {
        return this.a;
    }
}
