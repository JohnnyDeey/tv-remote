package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class b0 extends x implements Iterable {
    public static final d e = new d(8, b0.class);
    public final i[] c;
    public i[] d;

    public b0(i[] iVarArr) {
        for (i iVar : iVarArr) {
            if (iVar == null) {
                c.g("'elements' cannot be null, or contain null");
                throw null;
            }
        }
        i[] e2 = j.e(iVarArr);
        if (e2.length >= 2) {
            s(e2);
        }
        this.c = e2;
        this.d = iVarArr;
    }

    public static byte[] q(i iVar) {
        try {
            return iVar.c().h();
        } catch (IOException unused) {
            c.k("cannot encode object added to SET");
            return null;
        }
    }

    public static boolean r(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & 223;
        int i2 = bArr2[0] & 223;
        if (i != i2) {
            if (i >= i2) {
                return false;
            }
            return true;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < min; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                if ((b & 255) >= (b2 & 255)) {
                    return false;
                }
                return true;
            }
        }
        if ((bArr[min] & 255) > (bArr2[min] & 255)) {
            return false;
        }
        return true;
    }

    public static void s(i[] iVarArr) {
        int i;
        int length = iVarArr.length;
        if (length < 2) {
            return;
        }
        i iVar = iVarArr[0];
        i iVar2 = iVarArr[1];
        byte[] q = q(iVar);
        byte[] q2 = q(iVar2);
        if (r(q2, q)) {
            iVar2 = iVar;
            iVar = iVar2;
            q2 = q;
            q = q2;
        }
        for (int i2 = 2; i2 < length; i2++) {
            i iVar3 = iVarArr[i2];
            byte[] q3 = q(iVar3);
            if (r(q2, q3)) {
                iVarArr[i2 - 2] = iVar;
                iVar = iVar2;
                q = q2;
                iVar2 = iVar3;
                q2 = q3;
            } else if (r(q, q3)) {
                iVarArr[i2 - 2] = iVar;
                iVar = iVar3;
                q = q3;
            } else {
                int i3 = i2 - 1;
                while (true) {
                    i = i3 - 1;
                    if (i <= 0) {
                        break;
                    }
                    i iVar4 = iVarArr[i3 - 2];
                    if (r(q(iVar4), q3)) {
                        break;
                    }
                    iVarArr[i] = iVar4;
                    i3 = i;
                }
                iVarArr[i] = iVar3;
            }
        }
        iVarArr[length - 2] = iVar;
        iVarArr[length - 1] = iVar2;
    }

    @Override // defpackage.x, defpackage.p
    public final int hashCode() {
        i[] iVarArr = this.c;
        int length = iVarArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i += iVarArr[length].c().hashCode();
            } else {
                return i;
            }
        }
    }

    @Override // defpackage.x
    public final boolean i(x xVar) {
        if (xVar instanceof b0) {
            b0 b0Var = (b0) xVar;
            int length = this.c.length;
            if (b0Var.c.length == length) {
                om omVar = (om) o();
                om omVar2 = (om) b0Var.o();
                for (int i = 0; i < length; i++) {
                    x c = omVar.c[i].c();
                    x c2 = omVar2.c[i].c();
                    if (c == c2 || c.i(c2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p0(j.e(this.c));
    }

    @Override // defpackage.x
    public final boolean k() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [x, b0, om] */
    @Override // defpackage.x
    public x o() {
        if (this.d == null) {
            i[] iVarArr = (i[]) this.c.clone();
            this.d = iVarArr;
            s(iVarArr);
        }
        ?? b0Var = new b0(true, this.d);
        b0Var.f = -1;
        return b0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x, dn, b0] */
    @Override // defpackage.x
    public x p() {
        ?? b0Var = new b0(this.c, this.d);
        b0Var.f = -1;
        return b0Var;
    }

    public final String toString() {
        i[] iVarArr = this.c;
        int length = iVarArr.length;
        if (length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            sb.append(iVarArr[i]);
            i++;
            if (i >= length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
        }
    }

    public b0(j jVar) {
        if (jVar == null) {
            c.g("'elementVector' cannot be null");
            throw null;
        }
        i[] g = jVar.g();
        this.c = g;
        this.d = g.length < 2 ? g : null;
    }

    public b0(w8 w8Var) {
        i[] iVarArr = {w8Var};
        this.c = iVarArr;
        this.d = iVarArr;
    }

    public b0(boolean z, i[] iVarArr) {
        this.c = iVarArr;
        if (!z && iVarArr.length >= 2) {
            iVarArr = null;
        }
        this.d = iVarArr;
    }

    public b0() {
        i[] iVarArr = j.d;
        this.c = iVarArr;
        this.d = iVarArr;
    }

    public b0(i[] iVarArr, i[] iVarArr2) {
        this.c = iVarArr;
        this.d = iVarArr2;
    }
}
