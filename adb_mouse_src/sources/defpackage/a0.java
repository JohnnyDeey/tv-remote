package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class a0 extends x implements Iterable {
    public static final d d = new d(7, a0.class);
    public i[] c;

    public a0(i iVar) {
        if (iVar != null) {
            this.c = new i[]{iVar};
        } else {
            c.g("'element' cannot be null");
            throw null;
        }
    }

    public static a0 s(Object obj) {
        if (obj != null && !(obj instanceof a0)) {
            if (obj instanceof i) {
                x c = ((i) obj).c();
                if (c instanceof a0) {
                    return (a0) c;
                }
            } else if (obj instanceof byte[]) {
                try {
                    d dVar = d;
                    x n = x.n((byte[]) obj);
                    dVar.a(n);
                    return (a0) n;
                } catch (IOException e) {
                    c.j(e.getMessage(), "failed to construct sequence from byte[]: ");
                    return null;
                }
            }
            c.k("unknown object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        return (a0) obj;
    }

    @Override // defpackage.x, defpackage.p
    public int hashCode() {
        int length = this.c.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i = (i * 257) ^ this.c[length].c().hashCode();
            } else {
                return i;
            }
        }
    }

    @Override // defpackage.x
    public final boolean i(x xVar) {
        if (xVar instanceof a0) {
            a0 a0Var = (a0) xVar;
            int size = size();
            if (a0Var.size() == size) {
                for (int i = 0; i < size; i++) {
                    x c = this.c[i].c();
                    x c2 = a0Var.c[i].c();
                    if (c == c2 || c.i(c2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new p0(this.c);
    }

    @Override // defpackage.x
    public final boolean k() {
        return true;
    }

    @Override // defpackage.x
    public x o() {
        nm nmVar = new nm(false, this.c);
        nmVar.f = -1;
        return nmVar;
    }

    @Override // defpackage.x
    public x p() {
        nm nmVar = new nm(this.c, 1);
        nmVar.f = -1;
        return nmVar;
    }

    public final e[] q() {
        int size = size();
        e[] eVarArr = new e[size];
        for (int i = 0; i < size; i++) {
            eVarArr[i] = e.s(this.c[i]);
        }
        return eVarArr;
    }

    public final t[] r() {
        int size = size();
        t[] tVarArr = new t[size];
        for (int i = 0; i < size; i++) {
            tVarArr[i] = t.q(this.c[i]);
        }
        return tVarArr;
    }

    public int size() {
        return this.c.length;
    }

    public i t(int i) {
        return this.c[i];
    }

    public final String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            sb.append(this.c[i]);
            i++;
            if (i >= size) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
        }
    }

    public Enumeration u() {
        return new z(this);
    }

    public abstract e v();

    public abstract t w();

    public abstract b0 x();

    public a0() {
        this.c = j.d;
    }

    public a0(j jVar) {
        if (jVar != null) {
            this.c = jVar.g();
        } else {
            c.g("'elementVector' cannot be null");
            throw null;
        }
    }

    public a0(i[] iVarArr) {
        this.c = iVarArr;
    }
}
