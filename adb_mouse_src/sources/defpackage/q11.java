package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class q11 extends wg0 {
    public final WindowInsetsController d;
    public Window e;

    public q11(WindowInsetsController windowInsetsController, g00 g00Var) {
        this.d = windowInsetsController;
    }

    public final void N(int i, int i2, boolean z) {
        Window window = this.e;
        if (window != null) {
            if (z) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
                return;
            } else {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.d;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(i2, i2);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, i2);
        }
    }

    @Override // defpackage.wg0
    public void y(boolean z) {
        N(16, 16, z);
    }

    @Override // defpackage.wg0
    public void z(boolean z) {
        N(8192, 8, z);
    }
}
