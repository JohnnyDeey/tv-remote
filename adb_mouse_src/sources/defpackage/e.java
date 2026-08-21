package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class e extends x implements d0, f {
    public static final d d = new d(0, e.class);
    public static final char[] e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] c;

    public e(int i, byte[] bArr) {
        if (bArr != null) {
            if (bArr.length == 0 && i != 0) {
                c.k("zero length data with non-zero pad bits");
                throw null;
            }
            if (i <= 7 && i >= 0) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length + 1];
                System.arraycopy(bArr, 0, bArr2, 1, length);
                bArr2[0] = (byte) i;
                this.c = bArr2;
                return;
            }
            c.k("pad bits cannot be greater than 7 or less than 0");
            throw null;
        }
        c.g("'data' cannot be null");
        throw null;
    }

    public static e q(byte[] bArr) {
        String str;
        int length = bArr.length;
        if (length >= 1) {
            int i = bArr[0] & 255;
            if (i > 0) {
                if (i <= 7 && length >= 2) {
                    byte b = bArr[length - 1];
                    if (b != ((byte) ((255 << i) & b))) {
                        return new cm(bArr, 1, (byte) 0);
                    }
                } else {
                    str = "invalid pad bits detected";
                }
            }
            return new cm(bArr, 0, (byte) 0);
        }
        str = "truncated BIT STRING detected";
        c.k(str);
        return null;
    }

    public static e s(Object obj) {
        if (obj != null && !(obj instanceof e)) {
            if (obj instanceof i) {
                x c = ((i) obj).c();
                if (c instanceof e) {
                    return (e) c;
                }
            } else if (obj instanceof byte[]) {
                try {
                    d dVar = d;
                    x n = x.n((byte[]) obj);
                    dVar.a(n);
                    return (e) n;
                } catch (IOException e2) {
                    c.j(e2.getMessage(), "failed to construct BIT STRING from byte[]: ");
                    return null;
                }
            }
            c.k("illegal object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        return (e) obj;
    }

    @Override // defpackage.d0
    public final String d() {
        try {
            byte[] encoded = getEncoded();
            StringBuilder sb = new StringBuilder((encoded.length * 2) + 1);
            sb.append('#');
            for (int i = 0; i != encoded.length; i++) {
                byte b = encoded[i];
                char[] cArr = e;
                sb.append(cArr[(b >>> 4) & 15]);
                sb.append(cArr[b & 15]);
            }
            return sb.toString();
        } catch (IOException e2) {
            c.i("Internal error encoding BitString: ", e2.getMessage(), e2);
            return null;
        }
    }

    @Override // defpackage.f
    public final int e() {
        return this.c[0] & 255;
    }

    @Override // defpackage.f
    public final InputStream g() {
        byte[] bArr = this.c;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // defpackage.x, defpackage.p
    public final int hashCode() {
        byte[] bArr = this.c;
        if (bArr.length < 2) {
            return 1;
        }
        int i = 0;
        int i2 = bArr[0] & 255;
        int length = bArr.length;
        int i3 = length - 1;
        byte b = (byte) ((255 << i2) & bArr[i3]);
        if (bArr != null) {
            i = length;
            while (true) {
                i3--;
                if (i3 < 0) {
                    break;
                }
                i = (i * 257) ^ bArr[i3];
            }
        }
        return (i * 257) ^ b;
    }

    @Override // defpackage.x
    public final boolean i(x xVar) {
        if (!(xVar instanceof e)) {
            return false;
        }
        byte[] bArr = ((e) xVar).c;
        byte[] bArr2 = this.c;
        int length = bArr2.length;
        if (bArr.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr2[i2] != bArr[i2]) {
                return false;
            }
        }
        int i3 = 255 << (bArr2[0] & 255);
        if (((byte) (bArr2[i] & i3)) != ((byte) (bArr[i] & i3))) {
            return false;
        }
        return true;
    }

    @Override // defpackage.x
    public x o() {
        return new cm(this.c, 0, (byte) 0);
    }

    @Override // defpackage.x
    public x p() {
        return new cm(this.c, 1, (byte) 0);
    }

    public final byte[] r() {
        byte[] bArr = this.c;
        if (bArr.length == 1) {
            return t.e;
        }
        int i = bArr[0] & 255;
        byte[] p = f20.p(bArr, 1, bArr.length);
        int length = p.length - 1;
        p[length] = (byte) (((byte) (255 << i)) & p[length]);
        return p;
    }

    public final byte[] t() {
        byte[] bArr = this.c;
        if (bArr[0] == 0) {
            return f20.p(bArr, 1, bArr.length);
        }
        c.o("attempt to get non-octet aligned data from BIT STRING");
        return null;
    }

    public final String toString() {
        return d();
    }

    public e(byte[] bArr) {
        this.c = bArr;
    }

    @Override // defpackage.o10
    public final x f() {
        return this;
    }
}
