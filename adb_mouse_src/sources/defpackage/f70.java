package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class f70 extends ze implements ky, h40 {
    public final boolean i;

    public f70(g70 g70Var) {
        super(g70Var, mn.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.i = false;
    }

    @Override // defpackage.ky
    public final Object a() {
        return this.d.getClass().getSimpleName();
    }

    public final h40 d() {
        if (this.i) {
            return this;
        }
        h40 h40Var = this.c;
        if (h40Var == null) {
            li0.a.getClass();
            this.c = this;
            return this;
        }
        return h40Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof f70) {
                f70 f70Var = (f70) obj;
                if (c().equals(f70Var.c()) && this.f.equals(f70Var.f) && this.g.equals(f70Var.g) && k20.c(this.d, f70Var.d)) {
                    return true;
                }
                return false;
            }
            if (obj instanceof f70) {
                return obj.equals(d());
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        h40 d = d();
        if (d != this) {
            return d.toString();
        }
        return qo0.s(new StringBuilder("property "), this.f, " (Kotlin reflection is not available)");
    }
}
