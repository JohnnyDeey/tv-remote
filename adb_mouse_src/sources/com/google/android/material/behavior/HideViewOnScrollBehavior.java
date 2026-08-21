package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.c;
import defpackage.g2;
import defpackage.j10;
import defpackage.k10;
import defpackage.k20;
import defpackage.of;
import defpackage.qo0;
import defpackage.sk;
import defpackage.vk;
import defpackage.wv0;
import defpackage.x4;
import java.util.Iterator;
import java.util.LinkedHashSet;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends sk {
    public k20 a;
    public AccessibilityManager b;
    public j10 c;
    public int e;
    public int f;
    public TimeInterpolator g;
    public TimeInterpolator h;
    public ViewPropertyAnimator k;
    public final LinkedHashSet d = new LinkedHashSet();
    public int i = 0;
    public int j = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // defpackage.sk
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        if (this.b == null) {
            this.b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null && this.c == null) {
            j10 j10Var = new j10(this, view, 1);
            this.c = j10Var;
            accessibilityManager.addTouchExplorationStateChangeListener(j10Var);
            view.addOnAttachStateChangeListener(new of(4, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((vk) view.getLayoutParams()).c;
        if (i3 != 80 && i3 != 81) {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i2 = 0;
            } else {
                i2 = 2;
            }
            r(i2);
        } else {
            r(1);
        }
        this.i = this.a.C(view, marginLayoutParams);
        this.e = wv0.U(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f = wv0.U(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = wv0.V(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, x4.d);
        this.h = wv0.V(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, x4.c);
        return false;
    }

    @Override // defpackage.sk
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i > 0) {
            if (this.j != 1) {
                AccessibilityManager accessibilityManager = this.b;
                if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    ViewPropertyAnimator viewPropertyAnimator = this.k;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        view.clearAnimation();
                    }
                    this.j = 1;
                    Iterator it = this.d.iterator();
                    if (!it.hasNext()) {
                        this.k = this.a.G(view, this.i).setInterpolator(this.h).setDuration(this.f).setListener(new g2(4, this));
                        return;
                    }
                    throw qo0.l(it);
                }
                return;
            }
            return;
        }
        if (i < 0) {
            s(view);
        }
    }

    @Override // defpackage.sk
    public final boolean o(View view, int i, int i2) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public final void r(int i) {
        k20 k20Var = this.a;
        if (k20Var != null && k20Var.F() == i) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.a = new k10(1);
                    return;
                } else {
                    c.k(qo0.n("Invalid view edge position value: ", i, ". Must be 0, 1 or 2."));
                    return;
                }
            }
            this.a = new k10(0);
            return;
        }
        this.a = new k10(2);
    }

    public final void s(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.d.iterator();
        if (!it.hasNext()) {
            this.a.getClass();
            this.k = this.a.G(view, 0).setInterpolator(this.g).setDuration(this.e).setListener(new g2(4, this));
            return;
        }
        throw qo0.l(it);
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
