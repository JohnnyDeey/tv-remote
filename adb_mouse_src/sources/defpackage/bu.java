package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class bu {
    public final String a;

    public bu(String str) {
        if (str != null) {
            this.a = str;
        } else {
            c.g("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu)) {
            return false;
        }
        return this.a.equals(((bu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return qo0.s(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
