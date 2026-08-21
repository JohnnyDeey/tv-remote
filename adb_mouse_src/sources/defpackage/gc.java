package defpackage;

import android.window.BackEvent;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class gc {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public gc(BackEvent backEvent) {
        a5 a5Var = a5.a;
        float d = a5Var.d(backEvent);
        float e = a5Var.e(backEvent);
        float b = a5Var.b(backEvent);
        int c = a5Var.c(backEvent);
        this.a = d;
        this.b = e;
        this.c = b;
        this.d = c;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}
