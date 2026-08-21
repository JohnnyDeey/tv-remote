package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class yb extends x implements o10 {
    public final int c;
    public final int d;
    public final int e;
    public final i f;
    public final /* synthetic */ int g;

    public yb(int i, int i2, int i3, i iVar) {
        if (iVar != null) {
            if (i2 != 0 && (i2 & 192) == i2) {
                this.c = iVar instanceof h ? 1 : i;
                this.d = i2;
                this.e = i3;
                this.f = iVar;
                return;
            }
            c.k(qo0.m("invalid tag class: ", i2));
            throw null;
        }
        c.g("'obj' cannot be null");
        throw null;
    }

    public static yb q(Object obj) {
        if (obj != null && !(obj instanceof yb)) {
            if (obj instanceof i) {
                x c = ((i) obj).c();
                if (c instanceof yb) {
                    return (yb) c;
                }
            } else if (obj instanceof byte[]) {
                try {
                    x n = x.n((byte[]) obj);
                    if (n instanceof yb) {
                        return (yb) n;
                    }
                    throw new IllegalStateException("unexpected object: ".concat(n.getClass().getName()));
                } catch (IOException e) {
                    c.j(e.getMessage(), "failed to construct tagged object from byte[]: ");
                    return null;
                }
            }
            c.k("unknown object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        return (yb) obj;
    }

    @Override // defpackage.x, defpackage.p
    public final int hashCode() {
        int i;
        int i2 = (this.d * 7919) ^ this.e;
        if (r()) {
            i = 15;
        } else {
            i = 240;
        }
        return this.f.c().hashCode() ^ (i2 ^ i);
    }

    @Override // defpackage.x
    public final boolean i(x xVar) {
        if (xVar instanceof yb) {
            yb ybVar = (yb) xVar;
            if (this.e == ybVar.e && this.d == ybVar.d) {
                if (this.c == ybVar.c || r() == ybVar.r()) {
                    x c = this.f.c();
                    x c2 = ybVar.f.c();
                    if (c == c2) {
                        return true;
                    }
                    if (!r()) {
                        try {
                            return Arrays.equals(getEncoded(), ybVar.getEncoded());
                        } catch (IOException unused) {
                            return false;
                        }
                    }
                    return c.i(c2);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        int i = this.g;
        int i2 = this.e;
        int i3 = this.d;
        i iVar = this.f;
        switch (i) {
            case 0:
                x c = iVar.c();
                boolean r = r();
                if (z) {
                    if (r || c.k()) {
                        i3 |= 32;
                    }
                    vVar.o(i3, i2);
                }
                if (r) {
                    vVar.i(128);
                    c.j(vVar, true);
                    vVar.i(0);
                    vVar.i(0);
                    return;
                }
                c.j(vVar, false);
                return;
            case 1:
                x o = iVar.c().o();
                boolean r2 = r();
                if (z) {
                    if (r2 || o.k()) {
                        i3 |= 32;
                    }
                    vVar.o(i3, i2);
                }
                if (r2) {
                    vVar.k(o.l(true));
                }
                o.j(vVar.c(), r2);
                return;
            default:
                x p = iVar.c().p();
                boolean r3 = r();
                if (z) {
                    if (r3 || p.k()) {
                        i3 |= 32;
                    }
                    vVar.o(i3, i2);
                }
                if (r3) {
                    vVar.k(p.l(true));
                }
                p.j(vVar.d(), r3);
                return;
        }
    }

    @Override // defpackage.x
    public final boolean k() {
        int i = this.g;
        i iVar = this.f;
        switch (i) {
            case 0:
                if (r() || iVar.c().k()) {
                    return true;
                }
                return false;
            case 1:
                if (r() || iVar.c().o().k()) {
                    return true;
                }
                return false;
            default:
                if (r() || iVar.c().p().k()) {
                    return true;
                }
                return false;
        }
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        int i = this.g;
        int i2 = 0;
        int i3 = this.e;
        i iVar = this.f;
        switch (i) {
            case 0:
                x c = iVar.c();
                boolean r = r();
                int l = c.l(r);
                if (r) {
                    l += 3;
                }
                if (z) {
                    i2 = v.g(i3);
                }
                return l + i2;
            case 1:
                x o = iVar.c().o();
                boolean r2 = r();
                int l2 = o.l(r2);
                if (r2) {
                    l2 += v.e(l2);
                }
                if (z) {
                    i2 = v.g(i3);
                }
                return l2 + i2;
            default:
                x p = iVar.c().p();
                boolean r3 = r();
                int l3 = p.l(r3);
                if (r3) {
                    l3 += v.e(l3);
                }
                if (z) {
                    i2 = v.g(i3);
                }
                return l3 + i2;
        }
    }

    @Override // defpackage.x
    public x o() {
        switch (this.g) {
            case 1:
                return this;
            default:
                return new yb(this.c, this.d, this.e, this.f, 1);
        }
    }

    @Override // defpackage.x
    public x p() {
        switch (this.g) {
            case 1:
            case 2:
                return this;
            default:
                return new yb(this.c, this.d, this.e, this.f, 2);
        }
    }

    public final boolean r() {
        int i = this.c;
        if (i == 1 || i == 3) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return wv0.E(this.d, this.e) + this.f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yb(int i, int i2, int i3, i iVar, int i4) {
        this(i, i2, i3, iVar);
        this.g = i4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yb(boolean z, int i, i iVar, int i2) {
        this(z ? 1 : 2, 128, i, iVar);
        this.g = i2;
    }

    @Override // defpackage.o10
    public final x f() {
        return this;
    }
}
