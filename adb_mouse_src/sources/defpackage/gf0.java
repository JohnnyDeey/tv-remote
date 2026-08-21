package defpackage;

import android.os.Handler;
import androidx.lifecycle.a;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class gf0 implements s50 {
    public static final gf0 k = new gf0();
    public int c;
    public int d;
    public Handler g;
    public boolean e = true;
    public boolean f = true;
    public final a h = new a(this);
    public final x2 i = new x2(11, this);
    public final sb0 j = new sb0(this);

    public final void b() {
        int i = this.d + 1;
        this.d = i;
        if (i == 1) {
            if (this.e) {
                this.h.d(l50.ON_RESUME);
                this.e = false;
            } else {
                Handler handler = this.g;
                handler.getClass();
                handler.removeCallbacks(this.i);
            }
        }
    }

    @Override // defpackage.s50
    public final a e() {
        return this.h;
    }
}
