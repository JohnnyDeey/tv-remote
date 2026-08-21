package defpackage;

/* loaded from: classes.dex */
public final class g extends x {
    public static final g d;
    public static final g e;
    public final byte c;

    static {
        new d(1, g.class);
        d = new g((byte) 0);
        e = new g((byte) -1);
    }

    public g(byte b) {
        this.c = b;
    }

    public static g q(byte[] bArr) {
        if (bArr.length == 1) {
            byte b = bArr[0];
            if (b != -1) {
                if (b != 0) {
                    return new g(b);
                }
                return d;
            }
            return e;
        }
        c.k("BOOLEAN value should have 1 byte in it");
        return null;
    }

    @Override // defpackage.x, defpackage.p
    public final int hashCode() {
        return r() ? 1 : 0;
    }

    @Override // defpackage.x
    public final boolean i(x xVar) {
        if (!(xVar instanceof g) || r() != ((g) xVar).r()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        vVar.p(1, z);
        vVar.k(1);
        vVar.i(this.c);
    }

    @Override // defpackage.x
    public final boolean k() {
        return false;
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        return v.f(1, z);
    }

    @Override // defpackage.x
    public final x o() {
        if (r()) {
            return e;
        }
        return d;
    }

    public final boolean r() {
        if (this.c != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        if (r()) {
            return "TRUE";
        }
        return "FALSE";
    }
}
