package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class n11 extends wg0 {
    public final Window d;

    public n11(Window window, g00 g00Var) {
        this.d = window;
    }

    public final void N(int i) {
        View decorView = this.d.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.wg0
    public final void z(boolean z) {
        if (z) {
            Window window = this.d;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            return;
        }
        N(8192);
    }
}
