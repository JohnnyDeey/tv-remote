package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class nv extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ ov b;

    public nv(ov ovVar) {
        this.b = ovVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        ov ovVar = this.b;
        if (((Float) ovVar.z.getAnimatedValue()).floatValue() == 0.0f) {
            ovVar.A = 0;
            ovVar.g(0);
        } else {
            ovVar.A = 2;
            ovVar.s.invalidate();
        }
    }
}
