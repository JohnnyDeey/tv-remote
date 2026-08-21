package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class h01 extends gi0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ j01 j;

    public /* synthetic */ h01(j01 j01Var, int i) {
        this.i = i;
        this.j = j01Var;
    }

    @Override // defpackage.fz0
    public final void a() {
        View view;
        int i = this.i;
        j01 j01Var = this.j;
        switch (i) {
            case 0:
                if (j01Var.o && (view = j01Var.g) != null) {
                    view.setTranslationY(0.0f);
                    j01Var.d.setTranslationY(0.0f);
                }
                j01Var.d.setVisibility(8);
                j01Var.d.setTransitioning(false);
                j01Var.s = null;
                r6 r6Var = j01Var.k;
                if (r6Var != null) {
                    r6Var.H(j01Var.j);
                    j01Var.j = null;
                    j01Var.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = j01Var.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = ry0.a;
                    actionBarOverlayLayout.requestApplyInsets();
                    return;
                }
                return;
            default:
                j01Var.s = null;
                j01Var.d.requestLayout();
                return;
        }
    }
}
