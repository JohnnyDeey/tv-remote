package defpackage;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class qs0 extends c1 {
    public final /* synthetic */ int c;
    public Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qs0(int i, int i2) {
        super(i);
        this.c = i2;
    }

    @Override // defpackage.c1
    public final void a(nq nqVar) {
        byte[] x;
        switch (this.c) {
            case 0:
                ht0.Y(((fs0) this.e).a(), nqVar);
                return;
            default:
                js0 js0Var = this.b;
                r6 r6Var = (r6) this.d;
                byte[] bArr = ht0.a;
                xf0 xf0Var = js0Var.g;
                rd rdVar = js0Var.a;
                byte[] bArr2 = new byte[48];
                ((SecureRandom) rdVar.d).nextBytes(bArr2);
                ht0.d0(xf0Var, bArr2, 0);
                i30 i30Var = new i30(rdVar, bArr2);
                synchronized (i30Var) {
                    i30Var.a();
                    byte[] bArr3 = i30Var.a;
                    x = r6Var.x(bArr3.length, bArr3);
                }
                if (js0Var.a().H.k()) {
                    byte[] bArr4 = jl0.a;
                    nqVar.write(x);
                } else {
                    ht0.X(x, nqVar);
                }
                this.e = i30Var;
                return;
        }
    }

    @Override // defpackage.c1
    public final i30 b() {
        switch (this.c) {
            case 0:
                return ((fs0) this.e).b();
            default:
                i30 i30Var = (i30) this.e;
                this.e = null;
                return i30Var;
        }
    }

    @Override // defpackage.c1
    public final short[] c() {
        switch (this.c) {
            case 0:
                return null;
            default:
                return new short[]{1, 2, 64};
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
                this.d = wfVar.b(0).h();
                return;
        }
    }

    @Override // defpackage.c1
    public void f(a10 a10Var) {
        switch (this.c) {
            case 0:
                this.d = gi0.l(this.b, a10Var);
                byte[] N = ht0.N(a10Var);
                this.e = this.b.a.n((jk0) this.d).j();
                gi0.d(((jk0) this.d).b, N);
                ((fs0) this.e).c(N);
                return;
            default:
                super.f(a10Var);
                return;
        }
    }

    @Override // defpackage.c1
    public boolean g() {
        switch (this.c) {
            case 0:
                return true;
            default:
                return super.g();
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
