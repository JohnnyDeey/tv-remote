package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o extends x {
    public static final d e = new d(4, o.class);
    public final byte[] c;
    public final int d;

    public o(byte[] bArr) {
        if (!u(bArr)) {
            this.c = bArr;
            int length = bArr.length - 1;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                if (bArr[i] != (bArr[i2] >> 7)) {
                    break;
                } else {
                    i = i2;
                }
            }
            this.d = i;
            return;
        }
        c.k("malformed integer");
        throw null;
    }

    public static o q(Object obj) {
        if (obj != null && !(obj instanceof o)) {
            if (obj instanceof byte[]) {
                try {
                    d dVar = e;
                    x n = x.n((byte[]) obj);
                    dVar.a(n);
                    return (o) n;
                } catch (Exception e2) {
                    throw new IllegalArgumentException("encoding error in getInstance: " + e2.toString());
                }
            }
            c.k("illegal object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        return (o) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int s(int i, byte[] bArr) {
        int length = bArr.length;
        int max = Math.max(i, length - 4);
        int i2 = bArr[max];
        while (true) {
            max++;
            if (max < length) {
                i2 = (i2 << 8) | (bArr[max] & 255);
            } else {
                return i2;
            }
        }
    }

    public static boolean u(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return true;
        }
        if (length != 1 && bArr[0] == (bArr[1] >> 7) && !qf0.b("org.bouncycastle.asn1.allow_unsafe_integer")) {
            return true;
        }
        return false;
    }

    @Override // defpackage.x, defpackage.p
    public final int hashCode() {
        return f20.K(this.c);
    }

    @Override // defpackage.x
    public final boolean i(x xVar) {
        if (!(xVar instanceof o)) {
            return false;
        }
        return Arrays.equals(this.c, ((o) xVar).c);
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        vVar.m(2, z, this.c);
    }

    @Override // defpackage.x
    public final boolean k() {
        return false;
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        return v.f(this.c.length, z);
    }

    public final boolean r(int i) {
        byte[] bArr = this.c;
        int length = bArr.length;
        int i2 = this.d;
        if (length - i2 <= 4 && s(i2, bArr) == i) {
            return true;
        }
        return false;
    }

    public final int t() {
        byte[] bArr = this.c;
        int length = bArr.length;
        int i = this.d;
        if (length - i <= 4) {
            return s(i, bArr);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public final String toString() {
        return new BigInteger(this.c).toString();
    }

    public final long v() {
        byte[] bArr = this.c;
        int length = bArr.length;
        int i = this.d;
        if (length - i <= 8) {
            int length2 = bArr.length;
            int max = Math.max(i, length2 - 8);
            long j = bArr[max];
            while (true) {
                max++;
                if (max < length2) {
                    j = (j << 8) | (bArr[max] & 255);
                } else {
                    return j;
                }
            }
        } else {
            throw new ArithmeticException("ASN.1 Integer out of long range");
        }
    }

    public o(BigInteger bigInteger) {
        this.c = bigInteger.toByteArray();
        this.d = 0;
    }

    public o(long j) {
        this.c = BigInteger.valueOf(j).toByteArray();
        this.d = 0;
    }
}
