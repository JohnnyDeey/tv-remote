package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f50 extends a0 {
    public byte[] e;

    @Override // defpackage.a0, defpackage.x, defpackage.p
    public final int hashCode() {
        y();
        return super.hashCode();
    }

    @Override // defpackage.a0, java.lang.Iterable
    public final Iterator iterator() {
        y();
        return super.iterator();
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.e;
        }
        if (bArr != null) {
            vVar.m(48, z, bArr);
        } else {
            super.p().j(vVar, z);
        }
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.e;
        }
        if (bArr != null) {
            return v.f(bArr.length, z);
        }
        return super.p().l(z);
    }

    @Override // defpackage.a0, defpackage.x
    public final x o() {
        y();
        return super.o();
    }

    @Override // defpackage.a0, defpackage.x
    public final x p() {
        y();
        return super.p();
    }

    @Override // defpackage.a0
    public final int size() {
        y();
        return this.c.length;
    }

    @Override // defpackage.a0
    public final i t(int i) {
        y();
        return this.c[i];
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [e50, java.util.Enumeration, java.lang.Object] */
    @Override // defpackage.a0
    public final Enumeration u() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.e;
        }
        if (bArr != null) {
            ?? obj = new Object();
            obj.a = new n(0, bArr);
            obj.b = obj.a();
            return obj;
        }
        return new z(this);
    }

    @Override // defpackage.a0
    public final e v() {
        return ((a0) p()).v();
    }

    @Override // defpackage.a0
    public final t w() {
        return ((a0) p()).w();
    }

    @Override // defpackage.a0
    public final b0 x() {
        return ((a0) p()).x();
    }

    public final synchronized void y() {
        j jVar;
        if (this.e != null) {
            n nVar = new n(0, this.e);
            try {
                x f = nVar.f();
                if (f == null) {
                    jVar = new j(0);
                } else {
                    j jVar2 = new j();
                    do {
                        jVar2.d(f);
                        f = nVar.f();
                    } while (f != null);
                    jVar = jVar2;
                }
                nVar.close();
                this.c = jVar.g();
                this.e = null;
            } catch (IOException e) {
                throw new w(0, e, "malformed ASN.1: " + e);
            }
        }
    }
}
