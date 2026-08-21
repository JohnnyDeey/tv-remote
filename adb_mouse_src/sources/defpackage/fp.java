package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class fp extends kp {
    public final String a;
    public final int b;

    public fp(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fp) {
                fp fpVar = (fp) obj;
                if (!this.a.equals(fpVar.a) || this.b != fpVar.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConfigureEvent(ip=" + this.a + ", port=" + this.b + ')';
    }
}
