package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class xd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m90 m90Var = ((BottomSheetBehavior) obj).i;
                if (m90Var != null) {
                    k90 k90Var = m90Var.d;
                    if (k90Var.j != floatValue) {
                        k90Var.j = floatValue;
                        m90Var.h = true;
                        m90Var.i = true;
                        m90Var.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                ov ovVar = (ov) obj;
                ovVar.c.setAlpha(floatValue2);
                ovVar.d.setAlpha(floatValue2);
                ovVar.s.invalidate();
                return;
            default:
                ((TextInputLayout) obj).y0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
