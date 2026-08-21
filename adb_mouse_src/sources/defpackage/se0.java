package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class se0 {
    public final int a;
    public final int b;
    public final String c;

    public se0(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.G;
        this.b = preference.H;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof se0) {
            se0 se0Var = (se0) obj;
            if (this.a == se0Var.a && this.b == se0Var.b && TextUtils.equals(this.c, se0Var.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((527 + this.a) * 31) + this.b) * 31);
    }
}
