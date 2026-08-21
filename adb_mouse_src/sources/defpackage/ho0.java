package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

/* loaded from: classes.dex */
public final class ho0 extends OutputStream {
    public final /* synthetic */ int c = 0;
    public Object d;

    public ho0(ks0 ks0Var) {
        this.d = ks0Var;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.c) {
            case 1:
                ((ks0) this.d).h(true);
                return;
            default:
                super.close();
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        long j;
        switch (this.c) {
            case 0:
                try {
                    ((Signature) this.d).update(bArr, i, i2);
                    return;
                } catch (SignatureException e) {
                    throw r21.C(e.getMessage(), e);
                }
            default:
                ks0 ks0Var = (ks0) this.d;
                ks0Var.getClass();
                bArr.getClass();
                int length = bArr.length - i;
                if ((length | i | i2 | (length - i2)) >= 0) {
                    if (ks0Var.l) {
                        synchronized (ks0Var.e) {
                            while (i2 > 0) {
                                try {
                                    if (!ks0Var.j) {
                                        if (ks0Var.m) {
                                            if (i2 > 1) {
                                                ks0Var.z(i, 1, (short) 23, bArr);
                                                i++;
                                                i2--;
                                            }
                                        } else if (!ks0Var.n) {
                                            continue;
                                        } else if (ks0Var.o) {
                                            ks0Var.A(false);
                                        } else {
                                            bh0 bh0Var = ks0Var.d.c;
                                            synchronized (bh0Var) {
                                                j = bh0Var.b;
                                            }
                                            if (j >= 1048576) {
                                                ks0Var.A(true);
                                            }
                                        }
                                        int min = Math.min(i2, ks0Var.d.l);
                                        ks0Var.z(i, min, (short) 23, bArr);
                                        i += min;
                                        i2 -= min;
                                    } else {
                                        throw new IOException("Cannot write application data on closed/failed TLS connection");
                                    }
                                } finally {
                                }
                            }
                        }
                        return;
                    }
                    c.o("Cannot write application data until initial handshake completed.");
                    return;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    public /* synthetic */ ho0() {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        switch (this.c) {
            case 0:
                try {
                    ((Signature) this.d).update(bArr);
                    return;
                } catch (SignatureException e) {
                    throw r21.C(e.getMessage(), e);
                }
            default:
                super.write(bArr);
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.c) {
            case 0:
                try {
                    ((Signature) this.d).update((byte) i);
                    return;
                } catch (SignatureException e) {
                    throw r21.C(e.getMessage(), e);
                }
            default:
                write(new byte[]{(byte) i}, 0, 1);
                return;
        }
    }
}
