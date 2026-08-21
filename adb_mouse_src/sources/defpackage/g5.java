package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class g5 extends AutoCompleteTextView {
    public static final int[] f = {R.attr.popupBackground};
    public final k3 c;
    public final o7 d;
    public final r6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, svarzee.android.apps.adb_mouse.R.attr.autoCompleteTextViewStyle);
        zr0.a(context);
        sr0.a(this, getContext());
        b8 J = b8.J(getContext(), attributeSet, f, svarzee.android.apps.adb_mouse.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) J.d).hasValue(0)) {
            setDropDownBackgroundDrawable(J.z(0));
        }
        J.N();
        k3 k3Var = new k3(this);
        this.c = k3Var;
        k3Var.o(attributeSet, svarzee.android.apps.adb_mouse.R.attr.autoCompleteTextViewStyle);
        o7 o7Var = new o7(this);
        this.d = o7Var;
        o7Var.f(attributeSet, svarzee.android.apps.adb_mouse.R.attr.autoCompleteTextViewStyle);
        o7Var.b();
        r6 r6Var = new r6(this, 5);
        this.e = r6Var;
        r6Var.F(attributeSet, svarzee.android.apps.adb_mouse.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener A = r6Var.A(keyListener);
            if (A != keyListener) {
                super.setKeyListener(A);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        wv0.M(editorInfo, onCreateInputConnection, this);
        return this.e.G(onCreateInputConnection, editorInfo);
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
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o7 o7Var = this.d;
        if (o7Var != null) {
            o7Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o7 o7Var = this.d;
        if (o7Var != null) {
            o7Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(oi0.z(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(r21.r(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.e.L(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.A(keyListener));
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
}
