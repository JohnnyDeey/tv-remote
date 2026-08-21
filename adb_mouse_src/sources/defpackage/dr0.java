package defpackage;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class dr0 extends InputStream {
    public final a10 c;
    public final nq d;

    public dr0(a10 a10Var, nq nqVar) {
        this.c = a10Var;
        this.d = nqVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.c.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
        this.d.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.c.read();
        if (read >= 0) {
            this.d.write(read);
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.c.read(bArr, i, i2);
        if (read > 0) {
            this.d.write(bArr, i, read);
        }
        return read;
    }
}
