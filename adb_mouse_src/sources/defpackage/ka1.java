package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ka1 {
    public final String a;
    public final String b;
    public final boolean c;

    public ka1(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            if (!TextUtils.isEmpty("com.google.android.gms")) {
                this.b = "com.google.android.gms";
                this.c = z;
                return;
            } else {
                c.k("Given String is empty or null");
                throw null;
            }
        }
        c.k("Given String is empty or null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka1)) {
            return false;
        }
        ka1 ka1Var = (ka1) obj;
        if (f20.t(this.a, ka1Var.a) && f20.t(this.b, ka1Var.b) && f20.t(null, null) && this.c == ka1Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        wv0.p(null);
        throw null;
    }
}
