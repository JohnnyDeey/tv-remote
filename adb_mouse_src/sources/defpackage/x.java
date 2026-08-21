package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class x extends p {
    public static x n(byte[] bArr) {
        n nVar = new n(bArr);
        try {
            x f = nVar.f();
            if (nVar.available() == 0) {
                return f;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    @Override // defpackage.p
    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof i) && i(((i) obj).c())) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.p
    public abstract int hashCode();

    public abstract boolean i(x xVar);

    public abstract void j(v vVar, boolean z);

    public abstract boolean k();

    public abstract int l(boolean z);

    public final boolean m(x xVar) {
        if (this != xVar && !i(xVar)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.p, defpackage.i
    public final x c() {
        return this;
    }

    public x o() {
        return this;
    }

    public x p() {
        return this;
    }
}
