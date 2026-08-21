package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class z21 {
    public final c5 a;
    public final pv b;

    public /* synthetic */ z21(c5 c5Var, pv pvVar) {
        this.a = c5Var;
        this.b = pvVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof z21)) {
            z21 z21Var = (z21) obj;
            if (f20.t(this.a, z21Var.a) && f20.t(this.b, z21Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        r6 r6Var = new r6(this);
        r6Var.e(this.a, "key");
        r6Var.e(this.b, "feature");
        return r6Var.toString();
    }
}
