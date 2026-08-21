package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import com.google.android.material.button.MaterialButton;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class dp extends k20 {
    public final /* synthetic */ int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dp(int i) {
        super(19);
        this.G = i;
    }

    @Override // defpackage.k20
    public final float E(Object obj) {
        switch (this.G) {
            case 0:
                return ((ep) obj).s.b * 10000.0f;
            default:
                return MaterialButton.b((MaterialButton) obj);
        }
    }

    @Override // defpackage.k20
    public final void i0(Object obj, float f) {
        float f2;
        switch (this.G) {
            case 0:
                ep epVar = (ep) obj;
                epVar.s.b = f / 10000.0f;
                epVar.invalidateSelf();
                int i = (int) f;
                if (epVar.d.a(true)) {
                    Context context = epVar.c;
                    if (epVar.w == null) {
                        LinearInterpolator linearInterpolator = x4.a;
                        epVar.y = wv0.V(context, R.attr.motionEasingStandardInterpolator, linearInterpolator);
                        epVar.z = wv0.V(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        epVar.w = valueAnimator;
                        valueAnimator.setDuration(500L);
                        epVar.w.setFloatValues(0.0f, 1.0f);
                        epVar.w.setInterpolator(null);
                        epVar.w.addUpdateListener(new cp(0, epVar));
                    }
                    float f3 = i;
                    if (f3 >= 1000.0f && f3 <= 9000.0f) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    float f4 = epVar.t;
                    ValueAnimator valueAnimator2 = epVar.w;
                    if (f2 != f4) {
                        if (valueAnimator2.isRunning()) {
                            epVar.w.cancel();
                        }
                        epVar.t = f2;
                        if (f2 == 1.0f) {
                            epVar.x = epVar.y;
                            epVar.w.start();
                            return;
                        } else {
                            epVar.x = epVar.z;
                            epVar.w.reverse();
                            return;
                        }
                    }
                    if (!valueAnimator2.isRunning()) {
                        epVar.s.d = f2;
                        epVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            default:
                MaterialButton.c((MaterialButton) obj, f);
                return;
        }
    }
}
