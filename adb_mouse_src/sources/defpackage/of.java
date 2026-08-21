package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class of implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ of(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return;
            case 1:
                gu guVar = (gu) obj;
                AccessibilityManager accessibilityManager = guVar.v;
                if (guVar.w != null && accessibilityManager != null && guVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(guVar.w);
                    return;
                }
                return;
            case 2:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = ry0.a;
                view2.requestApplyInsets();
                return;
            case 3:
            case 4:
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                rf rfVar = (rf) obj;
                ViewTreeObserver viewTreeObserver = rfVar.z;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        rfVar.z = view.getViewTreeObserver();
                    }
                    rfVar.z.removeGlobalOnLayoutListener(rfVar.k);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                gu guVar = (gu) obj;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = guVar.w;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = guVar.v) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                j10 j10Var = hideBottomViewOnScrollBehavior.h;
                if (j10Var != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(j10Var);
                    hideBottomViewOnScrollBehavior.h = null;
                    return;
                }
                return;
            case 4:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                j10 j10Var2 = hideViewOnScrollBehavior.c;
                if (j10Var2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(j10Var2);
                    hideViewOnScrollBehavior.c = null;
                    return;
                }
                return;
            default:
                np0 np0Var = (np0) obj;
                ViewTreeObserver viewTreeObserver2 = np0Var.q;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        np0Var.q = view.getViewTreeObserver();
                    }
                    np0Var.q.removeGlobalOnLayoutListener(np0Var.k);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
