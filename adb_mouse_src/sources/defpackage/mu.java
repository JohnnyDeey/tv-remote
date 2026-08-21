package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class mu extends nu {
    public final ff e;
    public final /* synthetic */ pu f;

    public mu(pu puVar, long j, ff ffVar) {
        this.f = puVar;
        this.c = j;
        this.d = -1;
        this.e = ffVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.z(this.f);
    }

    @Override // defpackage.nu
    public final String toString() {
        return super.toString() + this.e;
    }
}
