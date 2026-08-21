package defpackage;

import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Hashtable;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class f30 implements es0 {
    public static final byte[] f = new byte[15];
    public static final byte[] g = {-49, 33, -83, 116, -27, -102, 97, 17, -66, 29, -116, 2, 30, 101, -72, -111, -62, -94, 17, 22, 122, -69, -116, 94, 7, -98, 9, -30, -56, -88, 51, -100};
    public final int a;
    public final Object b;
    public final Object c;
    public final Cloneable d;
    public Serializable e;

    public f30(rd rdVar, sb0 sb0Var, boolean z) {
        int i;
        this.b = rdVar;
        this.c = sb0Var.e("ChaCha7539");
        this.d = sb0Var.l("Poly1305");
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.a = i;
    }

    @Override // defpackage.es0
    public void a(byte[] bArr, int i, int i2) {
        this.e = new SecretKeySpec(bArr, i, i2, "ChaCha7539");
    }

    @Override // defpackage.es0
    public void b(int i, byte[] bArr) {
        if (bArr.length == 12 && i == 16) {
            try {
                ((Cipher) this.c).init(this.a, (SecretKeySpec) this.e, new IvParameterSpec(bArr), (SecureRandom) ((rd) this.b).d);
                return;
            } catch (GeneralSecurityException e) {
                throw new RuntimeException(e);
            }
        }
        throw new us0((short) 80, null, null);
    }

    @Override // defpackage.es0
    public int c(int i) {
        if (this.a == 1) {
            return i + 16;
        }
        return i - 16;
    }

    @Override // defpackage.es0
    public int d(int i, int i2, int i3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i4;
        int i5;
        Mac mac = (Mac) this.d;
        try {
            int i6 = this.a;
            Object obj = this.c;
            if (i6 == 1) {
                int i7 = i2 + 64;
                byte[] bArr4 = new byte[i7];
                System.arraycopy(bArr2, i, bArr4, 64, i2);
                if (i7 == ((Cipher) obj).doFinal(bArr4, 0, i7, bArr4, 0)) {
                    System.arraycopy(bArr4, 64, bArr3, i3, i2);
                    mac.init(new SecretKeySpec(bArr4, 0, 32, "Poly1305"));
                    for (int i8 = 0; i8 < 64; i8++) {
                        bArr4[i8] = 0;
                    }
                    if (!f20.M(bArr)) {
                        i5 = bArr.length;
                        e(bArr, 0, bArr.length);
                    } else {
                        i5 = 0;
                    }
                    e(bArr4, 64, i2);
                    byte[] bArr5 = new byte[16];
                    k20.S(0, i5 & 4294967295L, bArr5);
                    k20.S(8, i2 & 4294967295L, bArr5);
                    mac.update(bArr5, 0, 16);
                    mac.doFinal(bArr3, i3 + i2);
                    return i2 + 16;
                }
                throw new IllegalStateException();
            }
            int i9 = i2 - 16;
            int i10 = i2 + 48;
            byte[] bArr6 = new byte[i10];
            System.arraycopy(bArr2, i, bArr6, 64, i9);
            if (i10 == ((Cipher) obj).doFinal(bArr6, 0, i10, bArr6, 0)) {
                mac.init(new SecretKeySpec(bArr6, 0, 32, "Poly1305"));
                for (int i11 = 0; i11 < 64; i11++) {
                    bArr6[i11] = 0;
                }
                if (!f20.M(bArr)) {
                    i4 = bArr.length;
                    e(bArr, 0, bArr.length);
                } else {
                    i4 = 0;
                }
                e(bArr2, i, i9);
                byte[] bArr7 = new byte[16];
                k20.S(0, i4 & 4294967295L, bArr7);
                k20.S(8, i9 & 4294967295L, bArr7);
                mac.update(bArr7, 0, 16);
                mac.doFinal(bArr7, 0);
                if (ht0.j(16, i + i9, bArr7, bArr2)) {
                    System.arraycopy(bArr6, 64, bArr3, i3, i9);
                    return i9;
                }
                throw new us0((short) 20, null, null);
            }
            throw new IllegalStateException();
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }

    public void e(byte[] bArr, int i, int i2) {
        Mac mac = (Mac) this.d;
        mac.update(bArr, i, i2);
        int i3 = i2 % 16;
        if (i3 != 0) {
            mac.update(f, 0, 16 - i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f30(xf0 xf0Var, byte[] bArr, byte[] bArr2, int i, Hashtable hashtable) {
        this.b = xf0Var;
        this.c = bArr;
        this.d = bArr2;
        this.a = i;
        this.e = hashtable;
    }
}
