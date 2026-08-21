package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.g2;
import defpackage.j10;
import defpackage.of;
import defpackage.qo0;
import defpackage.sk;
import defpackage.wv0;
import defpackage.x4;
import java.util.Iterator;
import java.util.LinkedHashSet;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends sk {
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public AccessibilityManager g;
    public j10 h;
    public ViewPropertyAnimator k;
    public final LinkedHashSet a = new LinkedHashSet();
    public int f = 0;
    public final boolean i = true;
    public int j = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // defpackage.sk
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = wv0.U(view.getContext(), R.attr.motionDurationLong2, 225);
        this.c = wv0.U(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = wv0.V(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, x4.d);
        this.e = wv0.V(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, x4.c);
        if (this.g == null) {
            this.g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager != null && this.h == null) {
            j10 j10Var = new j10(this, view, 0);
            this.h = j10Var;
            accessibilityManager.addTouchExplorationStateChangeListener(j10Var);
            view.addOnAttachStateChangeListener(new of(3, this));
        }
        return false;
    }

    @Override // defpackage.sk
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i > 0) {
            if (this.j != 1) {
                if (!this.i || (accessibilityManager = this.g) == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    ViewPropertyAnimator viewPropertyAnimator = this.k;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        view.clearAnimation();
                    }
                    this.j = 1;
                    Iterator it = this.a.iterator();
                    if (!it.hasNext()) {
                        this.k = view.animate().translationY(this.f).setInterpolator(this.e).setDuration(this.c).setListener(new g2(3, this));
                        return;
                    }
                    throw qo0.l(it);
                }
                return;
            }
            return;
        }
        if (i < 0) {
            r(view);
        }
    }

    @Override // defpackage.sk
    public boolean o(View view, int i, int i2) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public final void r(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.a.iterator();
        if (!it.hasNext()) {
            this.k = view.animate().translationY(0.0f).setInterpolator(this.d).setDuration(this.b).setListener(new g2(3, this));
            return;
        }
        throw qo0.l(it);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
