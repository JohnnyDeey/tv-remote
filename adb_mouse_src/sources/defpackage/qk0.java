package defpackage;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class qk0 extends SecureRandom {
    public final b8 c;
    public final SecureRandom d;
    public final i81 e;
    public c10 f;

    public qk0(SecureRandom secureRandom, i81 i81Var, b8 b8Var) {
        this.d = secureRandom;
        this.e = i81Var;
        this.c = b8Var;
    }

    @Override // java.security.SecureRandom
    public final byte[] generateSeed(int i) {
        byte[] bArr = new byte[i];
        int i2 = i * 8;
        i81 i81Var = this.e;
        i81Var.getClass();
        if (i2 <= 256) {
            System.arraycopy(i81Var.t(), 0, bArr, 0, i);
            return bArr;
        }
        for (int i3 = 0; i3 < i; i3 += 32) {
            byte[] t = i81Var.t();
            int i4 = i - i3;
            if (t.length <= i4) {
                System.arraycopy(t, 0, bArr, i3, t.length);
            } else {
                System.arraycopy(t, 0, bArr, i3, i4);
            }
        }
        return bArr;
    }

    @Override // java.security.SecureRandom
    public final String getAlgorithm() {
        Object obj = this.c.d;
        return "HASH-DRBG-".concat("SHA".concat("SHA-512".substring(4)));
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = this.c.v(this.e);
                }
                if (this.f.b(bArr) < 0) {
                    this.f.c();
                    this.f.b(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void setSeed(long j) {
        synchronized (this) {
            try {
                SecureRandom secureRandom = this.d;
                if (secureRandom != null) {
                    secureRandom.setSeed(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.SecureRandom
    public final void setSeed(byte[] bArr) {
        synchronized (this) {
            try {
                SecureRandom secureRandom = this.d;
                if (secureRandom != null) {
                    secureRandom.setSeed(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
