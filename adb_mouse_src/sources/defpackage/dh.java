package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class dh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ eh b;

    public /* synthetic */ dh(eh ehVar, int i) {
        this.a = i;
        this.b = ehVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                eh ehVar = this.b;
                ehVar.c();
                zc zcVar = ehVar.j;
                if (zcVar != null) {
                    zcVar.a((t10) ehVar.a);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationRepeat(animator);
                eh ehVar = this.b;
                ehVar.g = (ehVar.g + 4) % ehVar.f.e.length;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
