package defpackage;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class e30 implements hs0 {
    public final rd a;
    public final Cipher b;
    public final String c;
    public final int d;
    public final int e;
    public SecretKeySpec f;

    public e30(rd rdVar, Cipher cipher, String str, int i, boolean z) {
        int i2;
        this.a = rdVar;
        this.b = cipher;
        this.c = str;
        this.d = i;
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.e = i2;
    }

    @Override // defpackage.hs0
    public final void a(byte[] bArr, int i, int i2) {
        if (this.d == i2) {
            this.f = new SecretKeySpec(bArr, i, i2, this.c);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.hs0
    public final void b(byte[] bArr, int i, int i2) {
        try {
            this.b.init(this.e, this.f, new IvParameterSpec(bArr, i, i2), (SecureRandom) this.a.d);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    @Override // defpackage.hs0
    public final int c() {
        return this.b.getBlockSize();
    }

    @Override // defpackage.hs0
    public final int d(int i, byte[] bArr, byte[] bArr2) {
        int i2 = 0;
        int i3 = i;
        int i4 = 5;
        while (true) {
            Cipher cipher = this.b;
            if (i3 > 32768) {
                byte[] bArr3 = bArr;
                byte[] bArr4 = bArr2;
                try {
                    i2 += cipher.update(bArr3, i4, 32768, bArr4, 5 + i2);
                    i4 += 32768;
                    i3 -= 32768;
                    bArr = bArr3;
                    bArr2 = bArr4;
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e.getMessage(), e);
                }
            } else {
                byte[] bArr5 = bArr2;
                int update = i2 + cipher.update(bArr, i4, i3, bArr5, 5 + i2);
                return update + this.b.doFinal(bArr5, 5 + update);
            }
            throw new IllegalStateException(e.getMessage(), e);
        }
    }
}
