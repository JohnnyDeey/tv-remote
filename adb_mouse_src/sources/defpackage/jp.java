package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class jp {
    public final String a;
    public final int b;
    public final mn c;

    public jp(String str, int i, mn mnVar) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = mnVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jp) {
                jp jpVar = (jp) obj;
                if (!k20.c(this.a, jpVar.a) || this.b != jpVar.b || !this.c.equals(jpVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((Integer.hashCode(this.b) + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ConnectionState(ip=" + this.a + ", port=" + this.b + ", status=" + this.c + ')';
    }
}
