package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class s9 {
    public final ba1 a;

    public s9(ba1 ba1Var) {
        this.a = ba1Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof s9) && this.a.equals(((s9) obj).a)) {
                Object obj2 = af0.c;
                if (obj2.equals(obj2)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ (1000003 * 1000003)) * 1000003) ^ af0.c.hashCode();
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + af0.c + "}";
    }
}
