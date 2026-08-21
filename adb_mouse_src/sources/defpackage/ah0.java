package defpackage;

import java.io.InputStream;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class ah0 {
    public final byte[] a;
    public volatile byte[] b;
    public volatile int c = 0;

    public ah0() {
        byte[] bArr = new byte[5];
        this.a = bArr;
        this.b = bArr;
    }

    public final void a(int i, InputStream inputStream) {
        while (this.c < i) {
            try {
                int read = inputStream.read(this.b, this.c, i - this.c);
                if (read >= 0) {
                    this.c += read;
                } else {
                    return;
                }
            } catch (InterruptedIOException e) {
                this.c += e.bytesTransferred;
                e.bytesTransferred = 0;
                throw e;
            }
        }
    }
}
