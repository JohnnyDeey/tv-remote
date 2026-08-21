package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class s6 extends RadioButton implements cs0 {
    public final l5 c;
    public final k3 d;
    public final o7 e;
    public m6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        zr0.a(context);
        sr0.a(this, getContext());
        l5 l5Var = new l5(this);
        this.c = l5Var;
        l5Var.d(attributeSet, R.attr.radioButtonStyle);
        k3 k3Var = new k3(this);
        this.d = k3Var;
        k3Var.o(attributeSet, R.attr.radioButtonStyle);
        o7 o7Var = new o7(this);
        this.e = o7Var;
        o7Var.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    private m6 getEmojiTextViewHelper() {
        if (this.f == null) {
            this.f = new m6(this);
        }
        return this.f;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        k3 k3Var = this.d;
        if (k3Var != null) {
            k3Var.e();
        }
        o7 o7Var = this.e;
        if (o7Var != null) {
            o7Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        k3 k3Var = this.d;
        if (k3Var != null) {
            return k3Var.l();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        k3 k3Var = this.d;
        if (k3Var != null) {
            return k3Var.m();
        }
        return null;
    }

    @Override // defpackage.cs0
    public ColorStateList getSupportButtonTintList() {
        l5 l5Var = this.c;
        if (l5Var != null) {
            return (ColorStateList) l5Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        l5 l5Var = this.c;
        if (l5Var != null) {
            return (PorterDuff.Mode) l5Var.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.e.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        k3 k3Var = this.d;
        if (k3Var != null) {
            k3Var.q();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        k3 k3Var = this.d;
        if (k3Var != null) {
            k3Var.r(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        l5 l5Var = this.c;
        if (l5Var != null) {
            if (l5Var.e) {
                l5Var.e = false;
            } else {
                l5Var.e = true;
                l5Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o7 o7Var = this.e;
        if (o7Var != null) {
            o7Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o7 o7Var = this.e;
        if (o7Var != null) {
            o7Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        k3 k3Var = this.d;
        if (k3Var != null) {
            k3Var.w(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        k3 k3Var = this.d;
        if (k3Var != null) {
            k3Var.x(mode);
        }
    }

    @Override // defpackage.cs0
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        l5 l5Var = this.c;
        if (l5Var != null) {
            l5Var.a = colorStateList;
            l5Var.c = true;
            l5Var.a();
        }
    }

    @Override // defpackage.cs0
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        l5 l5Var = this.c;
        if (l5Var != null) {
            l5Var.b = mode;
            l5Var.d = true;
            l5Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        o7 o7Var = this.e;
        o7Var.l(colorStateList);
        o7Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        o7 o7Var = this.e;
        o7Var.m(mode);
        o7Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(r21.r(getContext(), i));
    }
}
