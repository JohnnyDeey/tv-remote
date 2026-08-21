package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ei0 extends f1 {
    public final fi0 d;
    public final WeakHashMap e = new WeakHashMap();

    public ei0(fi0 fi0Var) {
        this.d = fi0Var;
    }

    @Override // defpackage.f1
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        f1 f1Var = (f1) this.e.get(view);
        if (f1Var != null) {
            return f1Var.a(view, accessibilityEvent);
        }
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.f1
    public final i81 b(View view) {
        f1 f1Var = (f1) this.e.get(view);
        if (f1Var != null) {
            return f1Var.b(view);
        }
        return super.b(view);
    }

    @Override // defpackage.f1
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        f1 f1Var = (f1) this.e.get(view);
        if (f1Var != null) {
            f1Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.f1
    public final void d(View view, s1 s1Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = s1Var.a;
        fi0 fi0Var = this.d;
        RecyclerView recyclerView = fi0Var.d;
        RecyclerView recyclerView2 = fi0Var.d;
        boolean K = recyclerView.K();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        if (!K && recyclerView2.getLayoutManager() != null) {
            recyclerView2.getLayoutManager().W(view, s1Var);
            f1 f1Var = (f1) this.e.get(view);
            if (f1Var != null) {
                f1Var.d(view, s1Var);
                return;
            } else {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                return;
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // defpackage.f1
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        f1 f1Var = (f1) this.e.get(view);
        if (f1Var != null) {
            f1Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.f1
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        f1 f1Var = (f1) this.e.get(viewGroup);
        if (f1Var != null) {
            return f1Var.f(viewGroup, view, accessibilityEvent);
        }
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.f1
    public final boolean g(View view, int i, Bundle bundle) {
        fi0 fi0Var = this.d;
        RecyclerView recyclerView = fi0Var.d;
        RecyclerView recyclerView2 = fi0Var.d;
        if (!recyclerView.K() && recyclerView2.getLayoutManager() != null) {
            f1 f1Var = (f1) this.e.get(view);
            if (f1Var != null) {
                if (f1Var.g(view, i, bundle)) {
                    return true;
                }
            } else if (super.g(view, i, bundle)) {
                return true;
            }
            uh0 uh0Var = recyclerView2.getLayoutManager().b.d;
            return false;
        }
        return super.g(view, i, bundle);
    }

    @Override // defpackage.f1
    public final void h(View view, int i) {
        f1 f1Var = (f1) this.e.get(view);
        if (f1Var != null) {
            f1Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.f1
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        f1 f1Var = (f1) this.e.get(view);
        if (f1Var != null) {
            f1Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
