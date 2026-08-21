package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class nq extends ByteArrayOutputStream {
    public nq(short s, int i) {
        super(i + 4);
        byte[] bArr = ht0.a;
        if ((s & 255) == s) {
            write(s);
            ((ByteArrayOutputStream) this).count += 3;
            return;
        }
        throw new us0((short) 80, null, null);
    }

    public void a(OutputStream outputStream) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = byteArrayInputStream.read(bArr, 0, 4096);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public void b(uo uoVar, int i) {
        int i2 = (((ByteArrayOutputStream) this).count - 4) + i;
        byte[] bArr = ht0.a;
        if ((16777215 & i2) == i2) {
            ht0.b0(i2, ((ByteArrayOutputStream) this).buf);
            uoVar.update(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            return;
        }
        throw new us0((short) 80, null, null);
    }

    public void c(ks0 ks0Var) {
        int i = ((ByteArrayOutputStream) this).count - 4;
        byte[] bArr = ht0.a;
        if ((16777215 & i) == i) {
            ht0.b0(i, ((ByteArrayOutputStream) this).buf);
            ks0Var.E(((ByteArrayOutputStream) this).count, ((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = null;
            return;
        }
        throw new us0((short) 80, null, null);
    }

    public void d(ks0 ks0Var, uo uoVar, int i) {
        if (i > 0) {
            uoVar.update(((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count - i, i);
        }
        ks0Var.E(((ByteArrayOutputStream) this).count, ((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
    }

    public void e(xs0 xs0Var) {
        xs0Var.update(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
    }

    public nq(short s) {
        this(s, 60);
    }
}
