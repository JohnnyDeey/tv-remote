package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class pf implements Runnable {
    public final /* synthetic */ qf c;
    public final /* synthetic */ z90 d;
    public final /* synthetic */ w90 e;
    public final /* synthetic */ i81 f;

    public pf(i81 i81Var, qf qfVar, z90 z90Var, w90 w90Var) {
        this.f = i81Var;
        this.c = qfVar;
        this.d = z90Var;
        this.e = w90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rf rfVar = (rf) this.f.d;
        qf qfVar = this.c;
        if (qfVar != null) {
            rfVar.B = true;
            qfVar.b.c(false);
            rfVar.B = false;
        }
        z90 z90Var = this.d;
        if (z90Var.isEnabled() && z90Var.hasSubMenu()) {
            this.e.q(z90Var, null, 4);
        }
    }
}
