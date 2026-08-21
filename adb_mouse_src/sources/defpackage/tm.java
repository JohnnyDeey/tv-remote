package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class tm extends x implements d0 {
    public final byte[] c;

    public tm(byte[] bArr) {
        this.c = bArr;
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
        if (!(xVar instanceof tm)) {
            return false;
        }
        return Arrays.equals(this.c, ((tm) xVar).c);
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        vVar.m(21, z, this.c);
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
