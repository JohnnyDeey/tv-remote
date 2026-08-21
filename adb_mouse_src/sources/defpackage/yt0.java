package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class yt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public yt0(q01 q01Var, View view) {
        this.b = q01Var;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((n8) obj2).remove(animator);
                ((bu0) obj).p.remove(animator);
                return;
            default:
                ((q01) obj2).a.d(1.0f);
                m01.e((View) obj);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((bu0) this.c).p.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public yt0(bu0 bu0Var, n8 n8Var) {
        this.c = bu0Var;
        this.b = n8Var;
    }
}
