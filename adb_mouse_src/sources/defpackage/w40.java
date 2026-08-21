package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w40 extends t40 {
    public final y40 d;
    public final r40 e;
    public final byte[] f;
    public final byte[] g;

    public w40(y40 y40Var, r40 r40Var, byte[] bArr, byte[] bArr2) {
        super(false);
        this.d = y40Var;
        this.e = r40Var;
        this.f = f20.e(bArr2);
        this.g = f20.e(bArr);
    }

    public static w40 a(Object obj) {
        if (obj instanceof w40) {
            return (w40) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            y40 y40Var = (y40) y40.e.get(Integer.valueOf(dataInputStream.readInt()));
            r40 r40Var = (r40) r40.g.get(Integer.valueOf(dataInputStream.readInt()));
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[y40Var.b];
            dataInputStream.readFully(bArr2);
            return new w40(y40Var, r40Var, bArr2, bArr);
        }
        DataInputStream dataInputStream2 = null;
        if (obj instanceof byte[]) {
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    w40 a = a(dataInputStream3);
                    dataInputStream3.close();
                    return a;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream2 = dataInputStream3;
                    if (dataInputStream2 != null) {
                        dataInputStream2.close();
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

    public final byte[] b() {
        v vVar = new v();
        vVar.h(this.d.a);
        vVar.h(this.e.a);
        vVar.b(this.f);
        vVar.b(this.g);
        return vVar.a.toByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w40.class != obj.getClass()) {
            return false;
        }
        w40 w40Var = (w40) obj;
        if (!this.d.equals(w40Var.d) || !this.e.equals(w40Var.e) || !Arrays.equals(this.f, w40Var.f)) {
            return false;
        }
        return Arrays.equals(this.g, w40Var.g);
    }

    @Override // defpackage.xt
    public final byte[] getEncoded() {
        return b();
    }

    public final int hashCode() {
        return f20.K(this.g) + ((f20.K(this.f) + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31);
    }
}
