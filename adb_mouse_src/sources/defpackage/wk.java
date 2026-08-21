package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class wk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout c;

    public wk(CoordinatorLayout coordinatorLayout) {
        this.c = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.c.p(0);
        return true;
    }
}
