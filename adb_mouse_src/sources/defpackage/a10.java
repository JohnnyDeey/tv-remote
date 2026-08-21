package defpackage;

import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public final class a10 extends ByteArrayInputStream {
    public final void a(xs0 xs0Var) {
        byte[] bArr = ((ByteArrayInputStream) this).buf;
        int i = ((ByteArrayInputStream) this).mark;
        xs0Var.update(bArr, i, ((ByteArrayInputStream) this).count - i);
    }

    @Override // java.io.ByteArrayInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.ByteArrayInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }
}
