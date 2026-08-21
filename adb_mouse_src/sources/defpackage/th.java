package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class th extends hu {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final ph j;
    public final qh k;
    public AnimatorSet l;
    public ValueAnimator m;

    public th(gu guVar) {
        super(guVar);
        this.j = new ph(0, this);
        this.k = new qh(this, 0);
        this.e = wv0.U(guVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f = wv0.U(guVar.getContext(), R.attr.motionDurationShort3, 150);
        this.g = wv0.V(guVar.getContext(), R.attr.motionEasingLinearInterpolator, x4.a);
        this.h = wv0.V(guVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, x4.d);
    }

    @Override // defpackage.hu
    public final void a() {
        if (this.b.r != null) {
            return;
        }
        s(t());
    }

    @Override // defpackage.hu
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.hu
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.hu
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.hu
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.hu
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.hu
    public final void l(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(t());
    }

    @Override // defpackage.hu
    public final void o(boolean z) {
        if (this.b.r == null) {
            return;
        }
        s(z);
    }

    @Override // defpackage.hu
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f);
        final int i = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: rh
            public final /* synthetic */ th b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                th thVar = this.b;
                switch (i2) {
                    case 0:
                        thVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = thVar.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.e;
        ofFloat2.setDuration(i2);
        final int i3 = 0;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: rh
            public final /* synthetic */ th b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                th thVar = this.b;
                switch (i22) {
                    case 0:
                        thVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = thVar.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.l.addListener(new sh(this, i3));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i2);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: rh
            public final /* synthetic */ th b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                th thVar = this.b;
                switch (i22) {
                    case 0:
                        thVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = thVar.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        this.m = ofFloat3;
        ofFloat3.addListener(new sh(this, i));
    }

    @Override // defpackage.hu
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new x2(3, this));
        }
    }

    public final void s(boolean z) {
        boolean z2;
        if (this.b.d() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (!z) {
            this.l.cancel();
            this.m.start();
            if (z2) {
                this.m.end();
            }
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText != null) {
            if ((editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
