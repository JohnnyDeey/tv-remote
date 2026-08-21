package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class y9 extends bc0 {
    public final ac0 a;
    public final zb0 b;

    public y9(ac0 ac0Var, zb0 zb0Var) {
        this.a = ac0Var;
        this.b = zb0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bc0) {
            bc0 bc0Var = (bc0) obj;
            ac0 ac0Var = this.a;
            if (ac0Var != null ? ac0Var.equals(((y9) bc0Var).a) : ((y9) bc0Var).a == null) {
                zb0 zb0Var = this.b;
                if (zb0Var != null ? zb0Var.equals(((y9) bc0Var).b) : ((y9) bc0Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        ac0 ac0Var = this.a;
        if (ac0Var == null) {
            hashCode = 0;
        } else {
            hashCode = ac0Var.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        zb0 zb0Var = this.b;
        if (zb0Var != null) {
            i = zb0Var.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
