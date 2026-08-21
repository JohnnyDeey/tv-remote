package defpackage;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class ek extends InputStream {
    public final c0 c;
    public boolean d = true;
    public InputStream e;

    public ek(c0 c0Var) {
        this.c = c0Var;
    }

    public final u a() {
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
        if (i instanceof u) {
            return (u) i;
        }
        c.l(i.getClass(), "unknown object encountered: ");
        return null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        u a;
        int i3 = 0;
        if (this.e == null) {
            if (this.d && (a = a()) != null) {
                this.d = false;
                this.e = a.b();
            } else {
                return -1;
            }
        }
        while (true) {
            int read = this.e.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                u a2 = a();
                if (a2 != null) {
                    this.e = a2.b();
                } else {
                    this.e = null;
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
        u a;
        if (this.e == null) {
            if (!this.d || (a = a()) == null) {
                return -1;
            }
            this.d = false;
            this.e = a.b();
        }
        while (true) {
            int read = this.e.read();
            if (read >= 0) {
                return read;
            }
            u a2 = a();
            if (a2 == null) {
                this.e = null;
                return -1;
            }
            this.e = a2.b();
        }
    }
}
