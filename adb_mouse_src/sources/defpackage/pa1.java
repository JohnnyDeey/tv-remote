package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class pa1 {
    public Object a;
    public sa1 b;
    public ua1 c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        sa1 sa1Var = this.b;
        if (sa1Var != null) {
            ra1 ra1Var = sa1Var.d;
            ra1Var.getClass();
            if (obj == null) {
                obj = na1.i;
            }
            if (na1.h.u(ra1Var, null, obj)) {
                na1.c(ra1Var);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void finalize() {
        ua1 ua1Var;
        sa1 sa1Var = this.b;
        if (sa1Var != null) {
            ra1 ra1Var = sa1Var.d;
            if (!ra1Var.isDone()) {
                if (na1.h.u(ra1Var, null, new c81(new r71("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.a)), 1)))) {
                    na1.c(ra1Var);
                }
            }
        }
        if (!this.d && (ua1Var = this.c) != null) {
            ua1Var.h(null);
        }
    }
}
