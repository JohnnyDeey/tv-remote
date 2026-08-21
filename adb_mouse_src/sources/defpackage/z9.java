package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class z9 {
    public final long a;
    public final ca b;
    public final t9 c;

    public z9(long j, ca caVar, t9 t9Var) {
        this.a = j;
        this.b = caVar;
        this.c = t9Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof z9) {
                z9 z9Var = (z9) obj;
                if (this.a == z9Var.a && this.b.equals(z9Var.b) && this.c.equals(z9Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
