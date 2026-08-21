package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class pd implements Runnable {
    public final /* synthetic */ rd c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ pd(rd rdVar, boolean z) {
        this.c = rdVar;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dn0 dn0Var = (dn0) this.c.g;
        if (dn0Var != null) {
            dn0Var.h(Boolean.valueOf(this.d));
        }
    }
}
