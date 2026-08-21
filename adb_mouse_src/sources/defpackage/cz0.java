package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class cz0 extends sk {
    public sd a;

    @Override // defpackage.sk
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new sd(view);
        }
        sd sdVar = this.a;
        View view2 = (View) sdVar.d;
        sdVar.b = view2.getTop();
        sdVar.c = view2.getLeft();
        sd sdVar2 = this.a;
        View view3 = (View) sdVar2.d;
        int top = 0 - (view3.getTop() - sdVar2.b);
        WeakHashMap weakHashMap = ry0.a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - sdVar2.c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
