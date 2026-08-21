package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class fh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ gh b;

    public /* synthetic */ fh(gh ghVar, int i) {
        this.a = i;
        this.b = ghVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                gh ghVar = this.b;
                ghVar.c();
                zc zcVar = ghVar.j;
                if (zcVar != null) {
                    zcVar.a((t10) ghVar.a);
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
                gh ghVar = this.b;
                ghVar.g = (ghVar.g + gh.l.length) % ghVar.f.e.length;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
