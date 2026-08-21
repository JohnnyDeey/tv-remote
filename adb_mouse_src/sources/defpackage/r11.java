package defpackage;

import android.view.WindowInsetsController;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class r11 extends q11 {
    @Override // defpackage.q11, defpackage.wg0
    public final void y(boolean z) {
        int i;
        WindowInsetsController windowInsetsController = this.d;
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        windowInsetsController.setSystemBarsAppearance(i, 16);
    }

    @Override // defpackage.q11, defpackage.wg0
    public final void z(boolean z) {
        int i;
        WindowInsetsController windowInsetsController = this.d;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        windowInsetsController.setSystemBarsAppearance(i, 8);
    }
}
