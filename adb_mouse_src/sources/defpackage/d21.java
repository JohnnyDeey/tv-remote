package defpackage;

/* loaded from: classes.dex */
public final class d21 extends p {
    public final int c;
    public final long d;
    public final long e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;
    public final byte[] j;

    public d21(a0 a0Var) {
        long j;
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
        this.d = o.q(s.t(0)).v();
        this.f = f20.e(t.q(s.t(1)).c);
        this.g = f20.e(t.q(s.t(2)).c);
        this.h = f20.e(t.q(s.t(3)).c);
        this.i = f20.e(t.q(s.t(4)).c);
        if (s.size() == 6) {
            yb q2 = yb.q(s.t(5));
            if (q2.e == 0) {
                j = ((o) o.e.d(q2, false)).v();
            } else {
                c.k("unknown tag in XMSSPrivateKey");
                throw null;
            }
        } else if (s.size() == 5) {
            j = -1;
        } else {
            c.k("keySeq should be 5 or 6 in length");
            throw null;
        }
        this.e = j;
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
        long j = this.e;
        if (j >= 0) {
            oVar = new o(1L);
        } else {
            oVar = new o(0L);
        }
        jVar.d(oVar);
        j jVar2 = new j();
        jVar2.d(new o(this.d));
        jVar2.d(new t(this.f));
        jVar2.d(new t(this.g));
        jVar2.d(new t(this.h));
        jVar2.d(new t(this.i));
        if (j >= 0) {
            jVar2.d(new yb(false, 0, (i) new o(j), 1));
        }
        nm nmVar = new nm(jVar2, 0);
        nmVar.f = -1;
        jVar.d(nmVar);
        jVar.d(new yb(true, 0, (i) new t(this.j), 1));
        nm nmVar2 = new nm(jVar, 0);
        nmVar2.f = -1;
        return nmVar2;
    }

    public d21(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j2) {
        this.c = 1;
        this.d = j;
        this.f = f20.e(bArr);
        this.g = f20.e(bArr2);
        this.h = f20.e(bArr3);
        this.i = f20.e(bArr4);
        this.j = f20.e(bArr5);
        this.e = j2;
    }

    public d21(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.c = 0;
        this.d = j;
        this.f = f20.e(bArr);
        this.g = f20.e(bArr2);
        this.h = f20.e(bArr3);
        this.i = f20.e(bArr4);
        this.j = f20.e(bArr5);
        this.e = -1L;
    }
}
