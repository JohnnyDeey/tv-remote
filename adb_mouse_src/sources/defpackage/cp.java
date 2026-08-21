package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class cp implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cp(sb0 sb0Var, View view) {
        this.a = 2;
        this.b = sb0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ep epVar = (ep) obj;
                epVar.s.d = epVar.x.getInterpolation(epVar.w.getAnimatedFraction());
                return;
            case 1:
                ((bs) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((View) ((j01) ((sb0) obj).c).d.getParent()).invalidate();
                return;
        }
    }

    public /* synthetic */ cp(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
