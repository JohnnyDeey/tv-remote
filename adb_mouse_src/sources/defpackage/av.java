package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class av extends AnimatorListenerAdapter implements au0 {
    public final View a;
    public boolean b = false;

    public av(View view) {
        this.a = view;
    }

    @Override // defpackage.au0
    public final void b() {
        float f;
        View view = this.a;
        if (view.getVisibility() == 0) {
            f = kz0.a.B(view);
        } else {
            f = 0.0f;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(f));
    }

    @Override // defpackage.au0
    public final void c() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        kz0.a.N(this.a, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (!z) {
            qz0 qz0Var = kz0.a;
            qz0Var.N(view, 1.0f);
            qz0Var.getClass();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // defpackage.au0
    public final void a(bu0 bu0Var) {
    }

    @Override // defpackage.au0
    public final void d(bu0 bu0Var) {
    }

    @Override // defpackage.au0
    public final void e(bu0 bu0Var) {
    }

    @Override // defpackage.au0
    public final void f(bu0 bu0Var) {
    }
}
