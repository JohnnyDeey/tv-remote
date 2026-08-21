package defpackage;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;

/* loaded from: classes.dex */
public final class v20 extends SecureRandomSpi {
    public final SecureRandom c;
    public final MessageDigest d;
    public final byte[] e;
    public final byte[] f;

    public v20(SecureRandom secureRandom, MessageDigest messageDigest) {
        this.c = secureRandom;
        this.d = messageDigest;
        byte[] generateSeed = secureRandom.generateSeed(messageDigest.getDigestLength());
        this.e = generateSeed;
        this.f = new byte[generateSeed.length];
    }

    public final void a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        MessageDigest messageDigest = this.d;
        messageDigest.update(bArr);
        messageDigest.update(bArr2);
        try {
            messageDigest.digest(bArr3, 0, bArr3.length);
        } catch (DigestException e) {
            f40.j("unable to generate nonce data: ", e.getMessage(), e);
        }
    }

    @Override // java.security.SecureRandomSpi
    public final byte[] engineGenerateSeed(int i) {
        return this.c.generateSeed(i);
    }

    @Override // java.security.SecureRandomSpi
    public final void engineNextBytes(byte[] bArr) {
        synchronized (this.d) {
            try {
                int length = this.f.length;
                int i = 0;
                while (i != bArr.length) {
                    byte[] bArr2 = this.f;
                    if (length == bArr2.length) {
                        this.c.nextBytes(bArr2);
                        byte[] bArr3 = this.e;
                        byte[] bArr4 = this.f;
                        a(bArr3, bArr4, bArr4);
                        length = 0;
                    }
                    bArr[i] = this.f[length];
                    i++;
                    length++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.SecureRandomSpi
    public final void engineSetSeed(byte[] bArr) {
        synchronized (this.d) {
            byte[] bArr2 = this.e;
            a(bArr2, bArr, bArr2);
        }
    }
}
