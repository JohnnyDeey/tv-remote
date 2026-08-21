package defpackage;

import android.view.KeyEvent;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class np extends kp {
    public final KeyEvent a;

    public np(KeyEvent keyEvent) {
        this.a = keyEvent;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof np) || !this.a.equals(((np) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyboardEvent(value=" + this.a + ')';
    }
}
