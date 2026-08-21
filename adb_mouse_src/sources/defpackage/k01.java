package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class k01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ q01 a;
    public final /* synthetic */ m11 b;
    public final /* synthetic */ m11 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public k01(q01 q01Var, m11 m11Var, m11 m11Var2, int i, View view) {
        this.a = q01Var;
        this.b = m11Var;
        this.c = m11Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y01 r01Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        q01 q01Var = this.a;
        p01 p01Var = q01Var.a;
        p01Var.d(animatedFraction);
        float b = p01Var.b();
        PathInterpolator pathInterpolator = m01.e;
        int i = Build.VERSION.SDK_INT;
        m11 m11Var = this.b;
        if (i >= 36) {
            r01Var = new x01(m11Var);
        } else if (i >= 35) {
            r01Var = new w01(m11Var);
        } else if (i >= 34) {
            r01Var = new v01(m11Var);
        } else if (i >= 31) {
            r01Var = new u01(m11Var);
        } else if (i >= 30) {
            r01Var = new t01(m11Var);
        } else if (i >= 29) {
            r01Var = new s01(m11Var);
        } else {
            r01Var = new r01(m11Var);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            i11 i11Var = m11Var.a;
            if (i3 == 0) {
                r01Var.d(i2, i11Var.h(i2));
            } else {
                d20 h = i11Var.h(i2);
                d20 h2 = this.c.a.h(i2);
                float f = 1.0f - b;
                r01Var.d(i2, m11.e(h, (int) (((h.a - h2.a) * f) + 0.5d), (int) (((h.b - h2.b) * f) + 0.5d), (int) (((h.c - h2.c) * f) + 0.5d), (int) (((h.d - h2.d) * f) + 0.5d)));
            }
        }
        m01.g(this.e, r01Var.b(), Collections.singletonList(q01Var));
    }
}
