package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class w00 extends t40 {
    public final int d;
    public final w40 e;

    public w00(int i, w40 w40Var) {
        super(false);
        if (w40Var != null) {
            this.d = i;
            this.e = w40Var;
        } else {
            c.g("lmsPublicKey");
            throw null;
        }
    }

    public static w00 a(Object obj) {
        if (obj instanceof w00) {
            return (w00) obj;
        }
        if (obj instanceof DataInputStream) {
            return new w00(((DataInputStream) obj).readInt(), w40.a(obj));
        }
        DataInputStream dataInputStream = null;
        if (obj instanceof byte[]) {
            try {
                DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    w00 a = a(dataInputStream2);
                    dataInputStream2.close();
                    return a;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        dataInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (obj instanceof InputStream) {
                return a(gi0.j((InputStream) obj));
            }
            c.r(obj, "cannot parse ");
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w00.class != obj.getClass()) {
            return false;
        }
        w00 w00Var = (w00) obj;
        if (this.d != w00Var.d) {
            return false;
        }
        return this.e.equals(w00Var.e);
    }

    @Override // defpackage.xt
    public final byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.d;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
        try {
            byteArrayOutputStream.write(this.e.b());
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            f40.k(e.getMessage(), e);
            return null;
        }
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d * 31);
    }
}
