package defpackage;

/* loaded from: classes.dex */
public final class m21 extends p {
    public final byte[] c;
    public final byte[] d;

    public m21(a0 a0Var) {
        if (o.q(a0Var.t(0)).r(0)) {
            this.c = f20.e(t.q(a0Var.t(1)).c);
            this.d = f20.e(t.q(a0Var.t(2)).c);
        } else {
            c.k("unknown version of sequence");
            throw null;
        }
    }

    @Override // defpackage.p, defpackage.i
    public final x c() {
        j jVar = new j();
        jVar.d(new o(0L));
        jVar.d(new t(this.c));
        jVar.d(new t(this.d));
        nm nmVar = new nm(jVar, 0);
        nmVar.f = -1;
        return nmVar;
    }

    public m21(byte[] bArr, byte[] bArr2) {
        this.c = f20.e(bArr);
        this.d = f20.e(bArr2);
    }
}
