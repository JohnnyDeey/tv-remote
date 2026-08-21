package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AccessController;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class d30 implements es0 {
    public static final boolean j = ((Boolean) AccessController.doPrivileged(new lz(1))).booleanValue();
    public final rd a;
    public final sb0 b;
    public final int c;
    public final Cipher d;
    public final String e;
    public final int f;
    public final String g;
    public SecretKeySpec h;
    public byte[] i;

    public d30(rd rdVar, sb0 sb0Var, String str, String str2, int i, boolean z) {
        int i2;
        this.a = rdVar;
        this.b = sb0Var;
        this.d = sb0Var.e(str);
        this.e = str2;
        this.f = i;
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.c = i2;
        String str3 = "CCM";
        try {
            if (!str.contains("CCM")) {
                str3 = "GCM";
            }
            sb0Var.d(str3);
        } catch (Exception unused) {
            str3 = null;
        }
        this.g = str3;
    }

    @Override // defpackage.es0
    public final void a(byte[] bArr, int i, int i2) {
        if (this.f == i2) {
            this.h = new SecretKeySpec(bArr, i, i2, this.e);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.es0
    public final void b(int i, byte[] bArr) {
        String str;
        SecureRandom secureRandom = (SecureRandom) this.a.d;
        try {
            boolean z = j;
            int i2 = this.c;
            Cipher cipher = this.d;
            if (z && (str = this.g) != null) {
                AlgorithmParameters d = this.b.d(str);
                if (mz.a != null) {
                    d.init((AlgorithmParameterSpec) AccessController.doPrivileged(new kz(i * 8, bArr)));
                } else {
                    byte[] e = f20.e(bArr);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    j jVar = new j(2);
                    jVar.d(new t(e));
                    if (i != 12) {
                        jVar.d(new o(i));
                    }
                    nm nmVar = new nm(jVar, 0);
                    nmVar.f = -1;
                    nmVar.j(new v(byteArrayOutputStream), true);
                    d.init(byteArrayOutputStream.toByteArray());
                }
                cipher.init(i2, this.h, d, secureRandom);
                return;
            }
            byte[] bArr2 = this.i;
            if (bArr2 == null || bArr2.length != bArr.length) {
                this.i = new byte[bArr.length];
            }
            System.arraycopy(bArr, 0, this.i, 0, bArr.length);
            byte[] bArr3 = this.i;
            bArr3[0] = (byte) (bArr3[0] ^ 128);
            cipher.init(i2, this.h, new a(this.i, null), secureRandom);
            byte[] bArr4 = this.i;
            bArr4[0] = (byte) (bArr4[0] ^ 128);
        } catch (Exception e2) {
            throw new IllegalStateException(e2.getMessage(), e2);
        }
    }

    @Override // defpackage.es0
    public final int c(int i) {
        return this.d.getOutputSize(i);
    }

    @Override // defpackage.es0
    public final int d(int i, int i2, int i3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!f20.M(bArr)) {
            boolean z = j;
            Cipher cipher = this.d;
            if (z) {
                cipher.updateAAD(bArr);
            } else {
                try {
                    SecureRandom secureRandom = (SecureRandom) this.a.d;
                    cipher.init(this.c, this.h, new a(this.i, bArr), secureRandom);
                } catch (Exception e) {
                    throw new IOException(e.getMessage(), e);
                }
            }
        }
        try {
            return this.d.doFinal(bArr2, i, i2, bArr3, i3);
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException("", e2);
        }
    }
}
