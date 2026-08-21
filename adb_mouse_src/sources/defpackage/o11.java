package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class o11 extends n11 {
    @Override // defpackage.wg0
    public final void y(boolean z) {
        if (z) {
            Window window = this.d;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            return;
        }
        N(16);
    }
}
