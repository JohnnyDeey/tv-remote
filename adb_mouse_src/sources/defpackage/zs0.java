package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class zs0 extends InputStream {
    public final ks0 c;

    public zs0(ks0 ks0Var) {
        this.c = ks0Var;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.c.a.c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.h(true);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ks0 ks0Var = this.c;
        ks0Var.getClass();
        bArr.getClass();
        int length = bArr.length - i;
        if ((length | i | i2 | (length - i2)) >= 0) {
            if (ks0Var.l) {
                if (i2 < 1) {
                    return 0;
                }
                while (true) {
                    int i3 = ks0Var.a.c;
                    if (i3 < 1) {
                        if (ks0Var.j) {
                            if (!ks0Var.k) {
                                return -1;
                            }
                            throw new IOException("Cannot read application data on failed TLS connection");
                        }
                        ks0Var.y();
                    } else {
                        int min = Math.min(i2, i3);
                        ks0Var.a.c(bArr, i, min);
                        return min;
                    }
                }
            } else {
                c.o("Cannot read application data until initial handshake completed.");
                return 0;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) <= 0) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
