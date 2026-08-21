package defpackage;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public final class os0 extends c1 {
    public final /* synthetic */ int c;
    public Object d;
    public Object e;
    public fs0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ os0(int i, int i2) {
        super(i);
        this.c = i2;
    }

    @Override // defpackage.c1
    public final void a(nq nqVar) {
        switch (this.c) {
            case 0:
                ht0.X(((g30) this.f).a(), nqVar);
                return;
            default:
                ht0.Y(this.f.a(), nqVar);
                return;
        }
    }

    @Override // defpackage.c1
    public final i30 b() {
        switch (this.c) {
            case 0:
                return ((g30) this.f).b();
            default:
                return this.f.b();
        }
    }

    @Override // defpackage.c1
    public final short[] c() {
        switch (this.c) {
            case 0:
                return null;
            default:
                return new short[]{2, 64, 1};
        }
    }

    @Override // defpackage.c1
    public final void d(s20 s20Var) {
        switch (this.c) {
            case 0:
                throw new us0((short) 80, null, null);
            default:
                byte[] bArr = ht0.a;
                if (s20Var instanceof s20) {
                    return;
                } else {
                    throw new us0((short) 80, null, null);
                }
        }
    }

    @Override // defpackage.c1
    public final void e(wf wfVar) {
        switch (this.c) {
            case 0:
                throw new us0((short) 10, null, null);
            default:
                this.e = wfVar.b(0);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [nq, java.io.ByteArrayOutputStream] */
    @Override // defpackage.c1
    public final void f(a10 a10Var) {
        switch (this.c) {
            case 0:
                this.e = wg0.x(this.b, (qo) this.d, a10Var);
                byte[] L = ht0.L(a10Var);
                g30 g30Var = new g30(0, new jy(this.b.a, (j) this.e));
                this.f = g30Var;
                g30Var.c(L);
                return;
            default:
                ?? byteArrayOutputStream = new ByteArrayOutputStream();
                dr0 dr0Var = new dr0(a10Var, byteArrayOutputStream);
                this.d = gi0.l(this.b, dr0Var);
                byte[] N = ht0.N(dr0Var);
                ht0.V(this.b, a10Var, (r6) this.e, byteArrayOutputStream);
                this.f = this.b.a.n((jk0) this.d).j();
                gi0.d(((jk0) this.d).b, N);
                this.f.c(N);
                return;
        }
    }

    @Override // defpackage.c1
    public final boolean g() {
        switch (this.c) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override // defpackage.c1
    public final void i() {
        switch (this.c) {
            case 0:
                return;
            default:
                throw new us0((short) 80, null, null);
        }
    }

    private final void j() {
    }
}
