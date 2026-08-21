package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class t extends x implements u {
    public static final d d = new d(6, t.class);
    public static final byte[] e = new byte[0];
    public final byte[] c;

    public t(byte[] bArr) {
        if (bArr != null) {
            this.c = bArr;
        } else {
            c.g("'string' cannot be null");
            throw null;
        }
    }

    public static t q(Object obj) {
        if (obj != null && !(obj instanceof t)) {
            if (obj instanceof i) {
                x c = ((i) obj).c();
                if (c instanceof t) {
                    return (t) c;
                }
            } else if (obj instanceof byte[]) {
                try {
                    d dVar = d;
                    x n = x.n((byte[]) obj);
                    dVar.a(n);
                    return (t) n;
                } catch (IOException e2) {
                    c.j(e2.getMessage(), "failed to construct OCTET STRING from byte[]: ");
                    return null;
                }
            }
            c.k("illegal object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        return (t) obj;
    }

    @Override // defpackage.u
    public final InputStream b() {
        return new ByteArrayInputStream(this.c);
    }

    @Override // defpackage.x, defpackage.p
    public final int hashCode() {
        return f20.K(this.c);
    }

    @Override // defpackage.x
    public final boolean i(x xVar) {
        if (!(xVar instanceof t)) {
            return false;
        }
        return Arrays.equals(this.c, ((t) xVar).c);
    }

    @Override // defpackage.x
    public x o() {
        return new t(this.c);
    }

    @Override // defpackage.x
    public x p() {
        return new t(this.c);
    }

    public final String toString() {
        i10 i10Var = h10.a;
        byte[] bArr = this.c;
        return "#".concat(yp0.a(h10.b(bArr.length, bArr)));
    }

    @Override // defpackage.o10
    public final x f() {
        return this;
    }
}
