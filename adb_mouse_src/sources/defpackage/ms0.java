package defpackage;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public final class ms0 extends c1 {
    public qo c;
    public j d;
    public r6 e;
    public g30 f;

    @Override // defpackage.c1
    public final void a(nq nqVar) {
        ht0.X(this.f.a(), nqVar);
    }

    @Override // defpackage.c1
    public final i30 b() {
        return this.f.b();
    }

    @Override // defpackage.c1
    public final short[] c() {
        return new short[]{2, 64, 1};
    }

    @Override // defpackage.c1
    public final void d(s20 s20Var) {
        byte[] bArr = ht0.a;
        if (s20Var instanceof s20) {
        } else {
            throw new us0((short) 80, null, null);
        }
    }

    @Override // defpackage.c1
    public final void e(wf wfVar) {
        this.e = wfVar.b(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nq, java.io.ByteArrayOutputStream] */
    @Override // defpackage.c1
    public final void f(a10 a10Var) {
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        dr0 dr0Var = new dr0(a10Var, byteArrayOutputStream);
        this.d = wg0.x(this.b, this.c, dr0Var);
        byte[] L = ht0.L(dr0Var);
        ht0.V(this.b, a10Var, this.e, byteArrayOutputStream);
        g30 g30Var = new g30(0, new jy(this.b.a, this.d));
        this.f = g30Var;
        g30Var.c(L);
    }

    @Override // defpackage.c1
    public final void i() {
        throw new us0((short) 80, null, null);
    }
}
