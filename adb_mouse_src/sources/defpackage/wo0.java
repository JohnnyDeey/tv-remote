package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class wo0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ xo0 d;
    public final /* synthetic */ no e;

    public /* synthetic */ wo0(no noVar, xo0 xo0Var, int i) {
        this.c = i;
        this.e = noVar;
        this.d = xo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        xo0 xo0Var = this.d;
        no noVar = this.e;
        switch (i) {
            case 0:
                if (noVar.b.contains(xo0Var)) {
                    qo0.a(xo0Var.c.G, xo0Var.a);
                    return;
                }
                return;
            default:
                noVar.b.remove(xo0Var);
                noVar.c.remove(xo0Var);
                return;
        }
    }
}
