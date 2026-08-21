package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class mm extends x implements d0 {
    public final byte[] c;

    public mm(String str) {
        this.c = yp0.b(str);
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
        if (!(xVar instanceof mm)) {
            return false;
        }
        return Arrays.equals(this.c, ((mm) xVar).c);
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        vVar.m(19, z, this.c);
    }

    @Override // defpackage.x
    public final boolean k() {
        return false;
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        return v.f(this.c.length, z);
    }

    public final String toString() {
        return yp0.a(this.c);
    }

    public mm(byte[] bArr) {
        this.c = bArr;
    }
}
