package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class q9 extends vh {
    public final n9 a;

    public q9(n9 n9Var) {
        this.a = n9Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof vh) {
                vh vhVar = (vh) obj;
                Object obj2 = uh.c;
                if (obj2.equals(obj2)) {
                    if (this.a.equals(((q9) vhVar).a)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ ((uh.c.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + uh.c + ", androidClientInfo=" + this.a + "}";
    }
}
