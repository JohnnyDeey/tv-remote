package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class gm extends x implements d0 {
    public final byte[] c;

    static {
        new d(3, gm.class);
    }

    public gm(byte[] bArr) {
        if (bArr != null) {
            this.c = bArr;
        } else {
            c.g("'contents' cannot be null");
            throw null;
        }
    }

    @Override // defpackage.d0
    public final String d() {
        return yp0.a(this.c);
    }

    @Override // defpackage.x, defpackage.p
    public final int hashCode() {
        return f20.K(this.c);
    }

    @Override // defpackage.x
    public final boolean i(x xVar) {
        if (!(xVar instanceof gm)) {
            return false;
        }
        return Arrays.equals(this.c, ((gm) xVar).c);
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        vVar.m(25, z, this.c);
    }

    @Override // defpackage.x
    public final boolean k() {
        return false;
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        return v.f(this.c.length, z);
    }
}
