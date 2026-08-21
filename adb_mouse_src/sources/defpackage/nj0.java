package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class nj0 {
    public final Resources a;
    public final Resources.Theme b;

    public nj0(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nj0.class == obj.getClass()) {
            nj0 nj0Var = (nj0) obj;
            if (this.a.equals(nj0Var.a) && Objects.equals(this.b, nj0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
