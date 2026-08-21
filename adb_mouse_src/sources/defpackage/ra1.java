package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ra1 extends na1 {
    public final /* synthetic */ sa1 j;

    public ra1(sa1 sa1Var) {
        this.j = sa1Var;
    }

    @Override // defpackage.na1
    public final String b() {
        pa1 pa1Var = (pa1) this.j.c.get();
        if (pa1Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return qo0.r("tag=[", String.valueOf(pa1Var.a), "]");
    }
}
