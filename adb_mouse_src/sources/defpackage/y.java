package defpackage;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class y extends x {
    public static final ConcurrentHashMap e = new ConcurrentHashMap();
    public final byte[] c;
    public String d = null;

    public y(byte[] bArr) {
        this.c = bArr;
    }

    public static y q(byte[] bArr, boolean z) {
        if (bArr.length <= 4096) {
            y yVar = (y) e.get(new r(bArr));
            if (yVar != null) {
                return yVar;
            }
            if (r(bArr)) {
                if (z) {
                    bArr = f20.e(bArr);
                }
                return new y(bArr);
            }
            c.k("invalid relative OID contents");
            return null;
        }
        c.k("exceeded relative OID contents length limit");
        return null;
    }

    public static boolean r(byte[] bArr) {
        if (qf0.b("org.bouncycastle.asn1.allow_wrong_oid_enc")) {
            return true;
        }
        if (bArr.length < 1) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            if (z && (bArr[i] & 255) == 128) {
                return false;
            }
            if ((bArr[i] & 128) == 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static boolean s(String str, int i) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = length - 1;
            if (i3 >= i) {
                char charAt = str.charAt(i3);
                if (charAt == '.') {
                    if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                        break;
                    }
                    i2 = 0;
                    length = i3;
                } else {
                    if ('0' > charAt || charAt > '9') {
                        break;
                    }
                    i2++;
                    length = i3;
                }
            } else {
                if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) (((int) j) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    @Override // defpackage.x, defpackage.p
    public final int hashCode() {
        return f20.K(this.c);
    }

    @Override // defpackage.x
    public final boolean i(x xVar) {
        if (this == xVar) {
            return true;
        }
        if (!(xVar instanceof y)) {
            return false;
        }
        return Arrays.equals(this.c, ((y) xVar).c);
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        vVar.m(13, z, this.c);
    }

    @Override // defpackage.x
    public final boolean k() {
        return false;
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        return v.f(this.c.length, z);
    }

    public final String toString() {
        String str;
        synchronized (this) {
            try {
                if (this.d == null) {
                    byte[] bArr = this.c;
                    StringBuilder sb = new StringBuilder();
                    boolean z = true;
                    BigInteger bigInteger = null;
                    long j = 0;
                    for (int i = 0; i != bArr.length; i++) {
                        byte b = bArr[i];
                        if (j <= 72057594037927808L) {
                            long j2 = j + (b & Byte.MAX_VALUE);
                            if ((b & 128) == 0) {
                                if (z) {
                                    z = false;
                                } else {
                                    sb.append('.');
                                }
                                sb.append(j2);
                                j = 0;
                            } else {
                                j = j2 << 7;
                            }
                        } else {
                            if (bigInteger == null) {
                                bigInteger = BigInteger.valueOf(j);
                            }
                            BigInteger or = bigInteger.or(BigInteger.valueOf(b & Byte.MAX_VALUE));
                            if ((b & 128) == 0) {
                                if (z) {
                                    z = false;
                                } else {
                                    sb.append('.');
                                }
                                sb.append(or);
                                bigInteger = null;
                                j = 0;
                            } else {
                                bigInteger = or.shiftLeft(7);
                            }
                        }
                    }
                    this.d = sb.toString();
                }
                str = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
