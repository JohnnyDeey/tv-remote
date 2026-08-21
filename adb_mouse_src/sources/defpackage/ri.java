package defpackage;

/* loaded from: classes.dex */
public final class ri implements xs0 {
    public js0 a;
    public rd b;
    public xs0 c;
    public xs0 d;

    @Override // defpackage.xs0
    public final byte[] a() {
        byte[] e;
        xs0 xs0Var = this.d;
        xs0 xs0Var2 = this.c;
        js0 js0Var = this.a;
        if (js0Var != null) {
            byte[] bArr = ht0.a;
            if (js0Var.a().H.k()) {
                byte[] bArr2 = jl0.a;
                i30 i30Var = js0Var.c().o;
                rd rdVar = js0Var.a;
                if (i30Var != null) {
                    synchronized (i30Var) {
                        e = f20.e(i30Var.a);
                    }
                    byte[] e2 = new i30(rdVar, f20.e(e)).e();
                    xs0Var2.update(e2, 0, e2.length);
                    byte[] bArr3 = jl0.c;
                    xs0Var2.update(bArr3, 0, 48);
                    byte[] a = xs0Var2.a();
                    xs0Var2.update(e2, 0, e2.length);
                    byte[] bArr4 = jl0.d;
                    xs0Var2.update(bArr4, 0, 48);
                    xs0Var2.update(a, 0, a.length);
                    xs0Var.update(e2, 0, e2.length);
                    xs0Var.update(bArr3, 0, 40);
                    byte[] a2 = xs0Var.a();
                    xs0Var.update(e2, 0, e2.length);
                    xs0Var.update(bArr4, 0, 40);
                    xs0Var.update(a2, 0, a2.length);
                } else {
                    c.k("unrecognized TlsSecret - cannot copy data: ".concat(i30Var.getClass().getName()));
                    return null;
                }
            }
        }
        return f20.h(xs0Var2.a(), xs0Var.a());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xs0, ri, java.lang.Object] */
    @Override // defpackage.xs0
    public final xs0 b() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c.b();
        obj.d = this.d.b();
        return obj;
    }

    @Override // defpackage.xs0
    public final void reset() {
        this.c.reset();
        this.d.reset();
    }

    @Override // defpackage.xs0
    public final void update(byte[] bArr, int i, int i2) {
        this.c.update(bArr, i, i2);
        this.d.update(bArr, i, i2);
    }
}
