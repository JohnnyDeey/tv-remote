package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class dk extends InputStream {
    public final c0 c;
    public boolean d = true;
    public int e = 0;
    public f f;
    public InputStream g;

    public dk(c0 c0Var) {
        this.c = c0Var;
    }

    public final f a() {
        i i;
        c0 c0Var = this.c;
        int read = ((w50) c0Var.e).read();
        if (read < 0) {
            i = null;
        } else {
            i = c0Var.i(read);
        }
        if (i == null) {
            return null;
        }
        if (i instanceof f) {
            if (this.e == 0) {
                return (f) i;
            }
            throw new IOException("only the last nested bitstring can have padding");
        }
        c.l(i.getClass(), "unknown object encountered: ");
        return null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        if (this.g == null) {
            if (this.d) {
                f a = a();
                this.f = a;
                if (a != null) {
                    this.d = false;
                    this.g = a.g();
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        }
        while (true) {
            int read = this.g.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                this.e = this.f.e();
                f a2 = a();
                this.f = a2;
                if (a2 != null) {
                    this.g = a2.g();
                } else {
                    this.g = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.g == null) {
            if (this.d) {
                f a = a();
                this.f = a;
                if (a != null) {
                    this.d = false;
                    this.g = a.g();
                }
            }
            return -1;
        }
        while (true) {
            int read = this.g.read();
            if (read >= 0) {
                return read;
            }
            this.e = this.f.e();
            f a2 = a();
            this.f = a2;
            if (a2 == null) {
                this.g = null;
                return -1;
            }
            this.g = a2.g();
        }
    }
}
