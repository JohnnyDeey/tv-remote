package defpackage;

import java.io.EOFException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class s10 extends w50 {
    public int e;
    public int f;
    public boolean g;
    public boolean h;

    public s10(int i, InputStream inputStream) {
        super(i, inputStream);
        this.g = false;
        this.h = true;
        this.e = inputStream.read();
        int read = inputStream.read();
        this.f = read;
        if (read >= 0) {
            b();
            return;
        }
        throw new EOFException();
    }

    public final boolean b() {
        if (!this.g && this.h && this.e == 0 && this.f == 0) {
            this.g = true;
            a();
        }
        return this.g;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (!this.h && i2 >= 3) {
            if (this.g) {
                return -1;
            }
            InputStream inputStream = this.c;
            int read = inputStream.read(bArr, i + 2, i2 - 2);
            if (read >= 0) {
                bArr[i] = (byte) this.e;
                bArr[i + 1] = (byte) this.f;
                this.e = inputStream.read();
                int read2 = inputStream.read();
                this.f = read2;
                if (read2 >= 0) {
                    return read + 2;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        return super.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (b()) {
            return -1;
        }
        int read = this.c.read();
        if (read < 0) {
            throw new EOFException();
        }
        int i = this.e;
        this.e = this.f;
        this.f = read;
        return i;
    }
}
