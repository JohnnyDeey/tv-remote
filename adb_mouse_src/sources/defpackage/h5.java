package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class h5 extends Button {
    public final k3 c;
    public final o7 d;
    public m6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zr0.a(context);
        sr0.a(this, getContext());
        k3 k3Var = new k3(this);
        this.c = k3Var;
        k3Var.o(attributeSet, i);
        o7 o7Var = new o7(this);
        this.d = o7Var;
        o7Var.f(attributeSet, i);
        o7Var.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private m6 getEmojiTextViewHelper() {
        if (this.e == null) {
            this.e = new m6(this);
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        k3 k3Var = this.c;
        if (k3Var != null) {
            k3Var.e();
        }
        o7 o7Var = this.d;
        if (o7Var != null) {
            o7Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (lz0.c) {
            return super.getAutoSizeMaxTextSize();
        }
        o7 o7Var = this.d;
        if (o7Var != null) {
            return Math.round(o7Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (lz0.c) {
            return super.getAutoSizeMinTextSize();
        }
        o7 o7Var = this.d;
        if (o7Var != null) {
            return Math.round(o7Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (lz0.c) {
            return super.getAutoSizeStepGranularity();
        }
        o7 o7Var = this.d;
        if (o7Var != null) {
            return Math.round(o7Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (lz0.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        o7 o7Var = this.d;
        if (o7Var != null) {
            return o7Var.i.f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (lz0.c) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        o7 o7Var = this.d;
        if (o7Var == null) {
            return 0;
        }
        return o7Var.i.a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return oi0.y(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        k3 k3Var = this.c;
        if (k3Var != null) {
            return k3Var.l();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        k3 k3Var = this.c;
        if (k3Var != null) {
            return k3Var.m();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.d.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        o7 o7Var = this.d;
        if (o7Var != null && !lz0.c) {
            o7Var.i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        o7 o7Var = this.d;
        if (o7Var != null) {
            x7 x7Var = o7Var.i;
            if (!lz0.c && x7Var.f()) {
                x7Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (lz0.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        o7 o7Var = this.d;
        if (o7Var != null) {
            o7Var.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (lz0.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        o7 o7Var = this.d;
        if (o7Var != null) {
            o7Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (lz0.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        o7 o7Var = this.d;
        if (o7Var != null) {
            o7Var.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        k3 k3Var = this.c;
        if (k3Var != null) {
            k3Var.q();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        k3 k3Var = this.c;
        if (k3Var != null) {
            k3Var.r(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(oi0.z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        o7 o7Var = this.d;
        if (o7Var != null) {
            o7Var.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        k3 k3Var = this.c;
        if (k3Var != null) {
            k3Var.w(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        k3 k3Var = this.c;
        if (k3Var != null) {
            k3Var.x(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        o7 o7Var = this.d;
        o7Var.l(colorStateList);
        o7Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        o7 o7Var = this.d;
        o7Var.m(mode);
        o7Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o7 o7Var = this.d;
        if (o7Var != null) {
            o7Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = lz0.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        o7 o7Var = this.d;
        if (o7Var != null) {
            x7 x7Var = o7Var.i;
            if (!z && !x7Var.f()) {
                x7Var.g(i, f);
            }
        }
    }
}
