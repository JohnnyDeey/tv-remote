package defpackage;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class i30 {
    public static final byte[] c;
    public byte[] a;
    public final rd b;

    static {
        byte[] bArr = new byte[120];
        int i = 0;
        for (int i2 = 0; i2 < 15; i2++) {
            byte b = (byte) (i2 + 65);
            int i3 = 0;
            while (i3 <= i2) {
                bArr[i] = b;
                i3++;
                i++;
            }
        }
        c = bArr;
    }

    public i30(rd rdVar, byte[] bArr) {
        this.a = bArr;
        this.b = rdVar;
    }

    public static i30 b(rd rdVar, i30 i30Var) {
        byte[] e;
        if (i30Var instanceof i30) {
            return i30Var;
        }
        if (i30Var != null) {
            synchronized (i30Var) {
                e = f20.e(i30Var.a);
            }
            rdVar.getClass();
            return new i30(rdVar, e);
        }
        c.k("unrecognized TlsSecret - cannot copy data: ".concat(i30Var.getClass().getName()));
        return null;
    }

    public final void a() {
        if (this.a != null) {
            return;
        }
        c.o("Secret has already been extracted or destroyed");
    }

    public final synchronized i30 c(int i, int i2, String str, byte[] bArr) {
        a();
        try {
            if (i != 4) {
                if (i != 5) {
                    if (i != 7) {
                        rd rdVar = this.b;
                        byte[] h = h(i, i2, str, bArr);
                        rdVar.getClass();
                        return new i30(rdVar, h);
                    }
                    return r21.A(7, i2, this, str, bArr);
                }
                return r21.A(5, i2, this, str, bArr);
            }
            return r21.A(4, i2, this, str, bArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final synchronized void d() {
        byte[] bArr = this.a;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.a = null;
        }
    }

    public final synchronized byte[] e() {
        byte[] bArr;
        a();
        bArr = this.a;
        this.a = null;
        return bArr;
    }

    public final synchronized i30 f(int i, i30 i30Var) {
        byte[] doFinal;
        rd rdVar;
        a();
        byte[] bArr = this.a;
        this.a = null;
        try {
            this.b.getClass();
            String y = rd.y(i);
            Mac l = ((sb0) this.b.c).l(y);
            l.init(new SecretKeySpec(bArr, 0, bArr.length, y));
            b(this.b, i30Var).i(l);
            doFinal = l.doFinal();
            rdVar = this.b;
            rdVar.getClass();
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
        return new i30(rdVar, doFinal);
    }

    public final void g(int i, int i2, int i3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        rd rdVar = this.b;
        rdVar.getClass();
        String str = "Hmac" + rd.x(i).replaceAll("-", "");
        Mac l = ((sb0) rdVar.c).l(str);
        l.init(new SecretKeySpec(bArr, i2, i3, str));
        int macLength = l.getMacLength();
        byte[] bArr4 = new byte[macLength];
        byte[] bArr5 = new byte[macLength];
        int i4 = 0;
        byte[] bArr6 = bArr2;
        while (i4 < bArr3.length) {
            l.update(bArr6, 0, bArr6.length);
            l.doFinal(bArr4, 0);
            l.update(bArr4, 0, macLength);
            l.update(bArr2, 0, bArr2.length);
            l.doFinal(bArr5, 0);
            System.arraycopy(bArr5, 0, bArr3, i4, Math.min(macLength, bArr3.length - i4));
            i4 += macLength;
            bArr6 = bArr4;
        }
    }

    public final byte[] h(int i, int i2, String str, byte[] bArr) {
        int i3 = 1;
        if (i == 0) {
            rd rdVar = this.b;
            MessageDigest m = ((sb0) rdVar.c).m("MD5");
            MessageDigest m2 = ((sb0) rdVar.c).m("SHA-1");
            int digestLength = m.getDigestLength();
            int digestLength2 = m2.getDigestLength();
            byte[] bArr2 = new byte[Math.max(digestLength, digestLength2)];
            byte[] bArr3 = new byte[i2];
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                m2.update(c, i5, i3);
                int i6 = i3 + 1;
                i5 += i3;
                byte[] bArr4 = this.a;
                m2.update(bArr4, 0, bArr4.length);
                m2.update(bArr, 0, bArr.length);
                m2.digest(bArr2, 0, digestLength2);
                byte[] bArr5 = this.a;
                m.update(bArr5, 0, bArr5.length);
                m.update(bArr2, 0, digestLength2);
                int i7 = i2 - i4;
                if (i7 < digestLength) {
                    m.digest(bArr2, 0, digestLength);
                    System.arraycopy(bArr2, 0, bArr3, i4, i7);
                    i4 += i7;
                } else {
                    m.digest(bArr3, i4, digestLength);
                    i4 += digestLength;
                }
                i3 = i6;
            }
            return bArr3;
        }
        byte[] h = f20.h(yp0.b(str), bArr);
        if (1 == i) {
            byte[] bArr6 = this.a;
            int length = (bArr6.length + 1) / 2;
            byte[] bArr7 = new byte[i2];
            g(1, 0, length, bArr6, h, bArr7);
            byte[] bArr8 = new byte[i2];
            byte[] bArr9 = this.a;
            g(2, bArr9.length - length, length, bArr9, h, bArr8);
            for (int i8 = 0; i8 < i2; i8++) {
                bArr7[i8] = (byte) (bArr7[i8] ^ bArr8[i8]);
            }
            return bArr7;
        }
        int t = r21.t(i);
        byte[] bArr10 = new byte[i2];
        byte[] bArr11 = this.a;
        g(t, 0, bArr11.length, bArr11, h, bArr10);
        return bArr10;
    }

    public final synchronized void i(Mac mac) {
        a();
        byte[] bArr = this.a;
        mac.update(bArr, 0, bArr.length);
    }
}
