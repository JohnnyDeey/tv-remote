package defpackage;

/* loaded from: classes.dex */
public final class k21 extends p {
    public final int c;
    public final int d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final int i;
    public final byte[] j;

    public k21(a0 a0Var) {
        int i;
        o q = o.q(a0Var.t(0));
        if (!q.r(0) && !q.r(1)) {
            c.k("unknown version of sequence");
            throw null;
        }
        this.c = q.t();
        if (a0Var.size() != 2 && a0Var.size() != 3) {
            c.k("key sequence wrong size");
            throw null;
        }
        a0 s = a0.s(a0Var.t(1));
        this.d = o.q(s.t(0)).t();
        this.e = f20.e(t.q(s.t(1)).c);
        this.f = f20.e(t.q(s.t(2)).c);
        this.g = f20.e(t.q(s.t(3)).c);
        this.h = f20.e(t.q(s.t(4)).c);
        if (s.size() == 6) {
            yb q2 = yb.q(s.t(5));
            if (q2.e == 0) {
                i = ((o) o.e.d(q2, false)).t();
            } else {
                c.k("unknown tag in XMSSPrivateKey");
                throw null;
            }
        } else if (s.size() == 5) {
            i = -1;
        } else {
            c.k("keySeq should be 5 or 6 in length");
            throw null;
        }
        this.i = i;
        if (a0Var.size() == 3) {
            this.j = f20.e(((t) t.d.d(yb.q(a0Var.t(2)), true)).c);
        } else {
            this.j = null;
        }
    }

    @Override // defpackage.p, defpackage.i
    public final x c() {
        o oVar;
        j jVar = new j();
        int i = this.i;
        if (i >= 0) {
            oVar = new o(1L);
        } else {
            oVar = new o(0L);
        }
        jVar.d(oVar);
        j jVar2 = new j();
        jVar2.d(new o(this.d));
        jVar2.d(new t(this.e));
        jVar2.d(new t(this.f));
        jVar2.d(new t(this.g));
        jVar2.d(new t(this.h));
        if (i >= 0) {
            jVar2.d(new yb(false, 0, (i) new o(i), 1));
        }
        nm nmVar = new nm(jVar2, 0);
        nmVar.f = -1;
        jVar.d(nmVar);
        jVar.d(new yb(true, 0, (i) new t(this.j), 1));
        nm nmVar2 = new nm(jVar, 0);
        nmVar2.f = -1;
        return nmVar2;
    }

    public k21(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i2) {
        this.c = 1;
        this.d = i;
        this.e = f20.e(bArr);
        this.f = f20.e(bArr2);
        this.g = f20.e(bArr3);
        this.h = f20.e(bArr4);
        this.j = f20.e(bArr5);
        this.i = i2;
    }

    public k21(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.c = 0;
        this.d = i;
        this.e = f20.e(bArr);
        this.f = f20.e(bArr2);
        this.g = f20.e(bArr3);
        this.h = f20.e(bArr4);
        this.j = f20.e(bArr5);
        this.i = -1;
    }
}
