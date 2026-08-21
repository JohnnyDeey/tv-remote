package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class o30 extends n30 {
    public final q30 g;
    public final p30 h;
    public final wg i;
    public final Object j;

    public o30(q30 q30Var, p30 p30Var, wg wgVar, Object obj) {
        this.g = q30Var;
        this.h = p30Var;
        this.i = wgVar;
        this.j = obj;
    }

    @Override // defpackage.n30
    public final boolean k() {
        return false;
    }

    @Override // defpackage.n30
    public final void l(Throwable th) {
        wg wgVar = this.i;
        wg H = q30.H(wgVar);
        q30 q30Var = this.g;
        p30 p30Var = this.h;
        Object obj = this.j;
        if (H == null || !q30Var.Q(p30Var, H, obj)) {
            p30Var.c.e(new k60(2), 2);
            wg H2 = q30.H(wgVar);
            if (H2 != null && q30Var.Q(p30Var, H2, obj)) {
                return;
            }
            q30Var.l(q30Var.u(p30Var, obj));
        }
    }
}
