package defpackage;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class s extends x {
    public static final ConcurrentHashMap e;
    public final byte[] c;
    public String d;

    static {
        new d(5, s.class);
        e = new ConcurrentHashMap();
    }

    public s(String str) {
        if (str.length() <= 16385) {
            if (w(str)) {
                byte[] z = z(str);
                r(z.length);
                this.c = z;
                this.d = str;
                return;
            }
            c.k(qo0.r("string ", str, " not a valid OID"));
            throw null;
        }
        c.k("exceeded OID contents length limit");
        throw null;
    }

    public static void r(int i) {
        if (i <= 4096) {
            return;
        }
        c.k("exceeded OID contents length limit");
    }

    public static s s(byte[] bArr, boolean z) {
        r(bArr.length);
        s sVar = (s) e.get(new r(bArr));
        if (sVar != null) {
            return sVar;
        }
        if (y.r(bArr)) {
            if (z) {
                bArr = f20.e(bArr);
            }
            return new s(bArr, null);
        }
        c.k("invalid OID contents");
        return null;
    }

    public static s u(i iVar) {
        if (iVar != null && !(iVar instanceof s)) {
            x c = iVar.c();
            if (c instanceof s) {
                return (s) c;
            }
            c.k("illegal object in getInstance: ".concat(iVar.getClass().getName()));
            return null;
        }
        return (s) iVar;
    }

    public static boolean w(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2' || !y.s(str, 2)) {
            return false;
        }
        if (charAt == '2' || str.length() == 3 || str.charAt(3) == '.') {
            return true;
        }
        if ((str.length() != 4 && str.charAt(4) != '.') || str.charAt(2) >= '4') {
            return false;
        }
        return true;
    }

    public static String y(byte[] bArr) {
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
                        if (j2 < 40) {
                            sb.append('0');
                        } else if (j2 < 80) {
                            sb.append('1');
                            j2 -= 40;
                        } else {
                            sb.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    sb.append('.');
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
                        sb.append('2');
                        or = or.subtract(BigInteger.valueOf(80L));
                        z = false;
                    }
                    sb.append('.');
                    sb.append(or);
                    bigInteger = null;
                    j = 0;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        return sb.toString();
    }

    public static byte[] z(String str) {
        int i;
        String substring;
        String substring2;
        int i2;
        boolean z;
        String str2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int indexOf = str.indexOf(46, 0);
        if (indexOf == -1) {
            substring = str.substring(0);
            i = -1;
        } else {
            i = indexOf + 1;
            substring = str.substring(0, indexOf);
        }
        int parseInt = Integer.parseInt(substring) * 40;
        if (i == -1) {
            i2 = i;
            substring2 = null;
        } else {
            int indexOf2 = str.indexOf(46, i);
            if (indexOf2 == -1) {
                substring2 = str.substring(i);
                i2 = -1;
            } else {
                substring2 = str.substring(i, indexOf2);
                i2 = indexOf2 + 1;
            }
        }
        if (substring2.length() <= 18) {
            y.t(byteArrayOutputStream, Long.parseLong(substring2) + parseInt);
        } else {
            y.u(byteArrayOutputStream, new BigInteger(substring2).add(BigInteger.valueOf(parseInt)));
        }
        while (true) {
            if (i2 != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i2 == -1) {
                    str2 = null;
                } else {
                    int indexOf3 = str.indexOf(46, i2);
                    if (indexOf3 == -1) {
                        str2 = str.substring(i2);
                        i2 = -1;
                    } else {
                        String substring3 = str.substring(i2, indexOf3);
                        i2 = indexOf3 + 1;
                        str2 = substring3;
                    }
                }
                if (str2.length() <= 18) {
                    y.t(byteArrayOutputStream, Long.parseLong(str2));
                } else {
                    y.u(byteArrayOutputStream, new BigInteger(str2));
                }
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
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
        if (!(xVar instanceof s)) {
            return false;
        }
        return Arrays.equals(this.c, ((s) xVar).c);
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        vVar.m(6, z, this.c);
    }

    @Override // defpackage.x
    public final boolean k() {
        return false;
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        return v.f(this.c.length, z);
    }

    public final s q(String str) {
        String str2;
        byte[] h;
        String substring;
        ConcurrentHashMap concurrentHashMap = y.e;
        if (str.length() <= 16383) {
            int i = 0;
            if (y.s(str, 0)) {
                int length = str.length();
                byte[] bArr = this.c;
                if (length <= 2) {
                    r(bArr.length + 1);
                    int charAt = str.charAt(0) - '0';
                    if (str.length() == 2) {
                        charAt = (charAt * 10) + (str.charAt(1) - '0');
                    }
                    int length2 = bArr.length;
                    h = new byte[length2 + 1];
                    System.arraycopy(bArr, 0, h, 0, length2);
                    h[length2] = (byte) charAt;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int i2 = -1;
                        if (i == -1) {
                            break;
                        }
                        if (i == -1) {
                            i2 = i;
                            substring = null;
                        } else {
                            int indexOf = str.indexOf(46, i);
                            if (indexOf == -1) {
                                substring = str.substring(i);
                            } else {
                                substring = str.substring(i, indexOf);
                                i2 = indexOf + 1;
                            }
                        }
                        if (substring.length() <= 18) {
                            y.t(byteArrayOutputStream, Long.parseLong(substring));
                        } else {
                            y.u(byteArrayOutputStream, new BigInteger(substring));
                        }
                        i = i2;
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    r(bArr.length + byteArray.length);
                    h = f20.h(bArr, byteArray);
                }
                return new s(h, t() + "." + str);
            }
            str2 = qo0.r("string ", str, " not a valid relative OID");
        } else {
            str2 = "exceeded relative OID contents length limit";
        }
        c.k(str2);
        return null;
    }

    public final synchronized String t() {
        try {
            if (this.d == null) {
                this.d = y(this.c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.d;
    }

    public final String toString() {
        return t();
    }

    public final s v() {
        r rVar = new r(this.c);
        ConcurrentHashMap concurrentHashMap = e;
        s sVar = (s) concurrentHashMap.get(rVar);
        if (sVar == null) {
            synchronized (concurrentHashMap) {
                try {
                    if (!concurrentHashMap.containsKey(rVar)) {
                        concurrentHashMap.put(rVar, this);
                    } else {
                        this = (s) concurrentHashMap.get(rVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return this;
        }
        return sVar;
    }

    public final boolean x(s sVar) {
        byte[] bArr = sVar.c;
        int length = bArr.length;
        byte[] bArr2 = this.c;
        if (bArr2.length > length) {
            for (int i = 0; i < length; i++) {
                if (bArr2[i] == bArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public s(byte[] bArr, String str) {
        this.c = bArr;
        this.d = str;
    }
}
