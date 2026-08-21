package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class v5 extends gi0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    public /* synthetic */ v5(int i, Object obj) {
        this.i = i;
        this.j = obj;
    }

    @Override // defpackage.fz0
    public final void a() {
        int i = this.i;
        Object obj = this.j;
        switch (i) {
            case 0:
                g6 g6Var = ((t5) obj).d;
                g6Var.w.setAlpha(1.0f);
                g6Var.z.d(null);
                g6Var.z = null;
                return;
            case 1:
                g6 g6Var2 = (g6) obj;
                g6Var2.w.setAlpha(1.0f);
                g6Var2.z.d(null);
                g6Var2.z = null;
                return;
            default:
                g6 g6Var3 = (g6) ((r6) obj).e;
                g6Var3.w.setVisibility(8);
                PopupWindow popupWindow = g6Var3.x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (g6Var3.w.getParent() instanceof View) {
                    View view = (View) g6Var3.w.getParent();
                    WeakHashMap weakHashMap = ry0.a;
                    view.requestApplyInsets();
                }
                g6Var3.w.e();
                g6Var3.z.d(null);
                g6Var3.z = null;
                ViewGroup viewGroup = g6Var3.B;
                WeakHashMap weakHashMap2 = ry0.a;
                viewGroup.requestApplyInsets();
                return;
        }
    }

    @Override // defpackage.gi0, defpackage.fz0
    public void c() {
        int i = this.i;
        Object obj = this.j;
        switch (i) {
            case 0:
                ((t5) obj).d.w.setVisibility(0);
                return;
            case 1:
                g6 g6Var = (g6) obj;
                g6Var.w.setVisibility(0);
                if (g6Var.w.getParent() instanceof View) {
                    View view = (View) g6Var.w.getParent();
                    WeakHashMap weakHashMap = ry0.a;
                    view.requestApplyInsets();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
