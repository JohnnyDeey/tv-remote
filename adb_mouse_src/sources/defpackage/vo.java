package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class vo extends w50 {
    public static final byte[] g = new byte[0];
    public final int e;
    public int f;

    public vo(InputStream inputStream, int i, int i2) {
        super(i2, inputStream);
        if (i <= 0) {
            if (i >= 0) {
                a();
            } else {
                c.k("negative lengths not allowed");
                throw null;
            }
        }
        this.e = i;
        this.f = i;
    }

    public final byte[] b() {
        int i = this.f;
        if (i == 0) {
            return g;
        }
        int i2 = this.d;
        if (i < i2) {
            byte[] bArr = new byte[i];
            int k = i - gi0.k(this.c, bArr, i);
            this.f = k;
            if (k == 0) {
                a();
                return bArr;
            }
            c.c(this.e, this.f);
            return null;
        }
        throw new IOException("corrupted stream - out of bounds length found: " + this.f + " >= " + i2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f;
        if (i3 == 0) {
            return -1;
        }
        int read = this.c.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.f - read;
            this.f = i4;
            if (i4 == 0) {
                a();
            }
            return read;
        }
        c.c(this.e, this.f);
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f == 0) {
            return -1;
        }
        int read = this.c.read();
        if (read < 0) {
            c.c(this.e, this.f);
            return 0;
        }
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
        return read;
    }
}
