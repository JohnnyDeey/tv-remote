package defpackage;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class s7 extends TextView {
    public final k3 c;
    public final o7 d;
    public final r6 e;
    public m6 f;
    public boolean g;
    public i81 h;
    public Future i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zr0.a(context);
        this.g = false;
        this.h = null;
        sr0.a(this, getContext());
        k3 k3Var = new k3(this);
        this.c = k3Var;
        k3Var.o(attributeSet, i);
        o7 o7Var = new o7(this);
        this.d = o7Var;
        o7Var.f(attributeSet, i);
        o7Var.b();
        r6 r6Var = new r6(6, false);
        r6Var.d = this;
        this.e = r6Var;
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private m6 getEmojiTextViewHelper() {
        if (this.f == null) {
            this.f = new m6(this);
        }
        return this.f;
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
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        o7 o7Var = this.d;
        if (o7Var != null) {
            return o7Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return oi0.y(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public p7 getSuperCaller() {
        if (this.h == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.h = new r7(this);
            } else if (i >= 28) {
                this.h = new q7(this);
            } else if (i >= 26) {
                this.h = new i81(5, this);
            }
        }
        return this.h;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.i;
        if (future != null) {
            try {
                this.i = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    oi0.j(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        r6 r6Var;
        if (Build.VERSION.SDK_INT < 28 && (r6Var = this.e) != null) {
            TextClassifier textClassifier = (TextClassifier) r6Var.e;
            if (textClassifier == null) {
                return i7.a((TextView) r6Var.d);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public ge0 getTextMetricsParamsCompat() {
        return oi0.j(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.d.getClass();
        o7.h(editorInfo, onCreateInputConnection, this);
        wv0.M(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        o7 o7Var = this.d;
        if (o7Var != null && !lz0.c) {
            o7Var.i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.i;
        if (future != null) {
            try {
                this.i = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    oi0.j(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = r21.r(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = r21.r(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = r21.r(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = r21.r(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        o7 o7Var = this.d;
        if (o7Var != null) {
            o7Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = r21.r(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = r21.r(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = r21.r(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = r21.r(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        o7 o7Var = this.d;
        if (o7Var != null) {
            o7Var.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().l(i);
        } else {
            oi0.t(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i);
        } else {
            oi0.u(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().o(i, f);
        } else if (i2 >= 34) {
            p1.h(this, i, f);
        } else {
            oi0.v(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(he0 he0Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        oi0.j(this);
        throw null;
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
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o7 o7Var = this.d;
        if (o7Var != null) {
            o7Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        r6 r6Var;
        if (Build.VERSION.SDK_INT < 28 && (r6Var = this.e) != null) {
            r6Var.e = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<he0> future) {
        this.i = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(ge0 ge0Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = ge0Var.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(ge0Var.a);
        setBreakStrategy(ge0Var.c);
        setHyphenationFrequency(ge0Var.d);
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.g) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            mi0 mi0Var = zv0.a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i);
            } else {
                c.k("Context cannot be null");
                return;
            }
        } else {
            typeface2 = null;
        }
        this.g = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.g = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        oi0.v(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        o7 o7Var = this.d;
        if (o7Var != null) {
            o7Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        o7 o7Var = this.d;
        if (o7Var != null) {
            o7Var.b();
        }
    }

    public s7(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
