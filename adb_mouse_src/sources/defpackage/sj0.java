package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class sj0 implements Serializable {
    public final Throwable c;

    public sj0(Throwable th) {
        th.getClass();
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sj0) {
            if (k20.c(this.c, ((sj0) obj).c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.c + ')';
    }
}
