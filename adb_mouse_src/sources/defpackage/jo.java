package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class jo extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xo0 d;
    public final /* synthetic */ lo e;

    public jo(ViewGroup viewGroup, View view, boolean z, xo0 xo0Var, lo loVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = xo0Var;
        this.e = loVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        xo0 xo0Var = this.d;
        if (z) {
            qo0.a(view, xo0Var.a);
        }
        this.e.e();
        if (vx.F(2)) {
            Log.v("FragmentManager", "Animator from operation " + xo0Var + " has ended.");
        }
    }
}
