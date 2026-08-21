package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class qp extends kp {
    public final String a;
    public final int b;

    public qp(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qp) {
                qp qpVar = (qp) obj;
                if (!this.a.equals(qpVar.a) || this.b != qpVar.b) {
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
        return "PairingRequestEvent(code=" + this.a + ", pairingPort=" + this.b + ')';
    }
}
