package defpackage;

import android.view.MotionEvent;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class op extends kp {
    public final MotionEvent a;
    public final int b;

    public op(MotionEvent motionEvent, int i) {
        this.a = motionEvent;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof op) {
                op opVar = (op) obj;
                if (!this.a.equals(opVar.a) || this.b != opVar.b) {
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
        return "MouseEvent(event=" + this.a + ", sensitivity=" + this.b + ')';
    }
}
