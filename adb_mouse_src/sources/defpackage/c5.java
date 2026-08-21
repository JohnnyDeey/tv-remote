package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class c5 {
    public final int a;
    public final r6 b;
    public final String c;

    public c5(r6 r6Var, String str) {
        this.b = r6Var;
        this.c = str;
        this.a = Arrays.hashCode(new Object[]{r6Var, fr0.a, str});
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof c5) {
                    c5 c5Var = (c5) obj;
                    if (f20.t(this.b, c5Var.b)) {
                        fr0 fr0Var = fr0.a;
                        if (f20.t(fr0Var, fr0Var) && f20.t(this.c, c5Var.c)) {
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
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
