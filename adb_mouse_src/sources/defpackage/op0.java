package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class op0 extends LinearLayout {
    public final TextInputLayout c;
    public final s7 d;
    public CharSequence e;
    public final CheckableImageButton f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public int i;
    public ImageView.ScaleType j;
    public View.OnLongClickListener k;
    public boolean l;

    public op0(TextInputLayout textInputLayout, b8 b8Var) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.c = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f = checkableImageButton;
        s7 s7Var = new s7(getContext(), null);
        this.d = s7Var;
        if (k20.M(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.k;
        checkableImageButton.setOnClickListener(null);
        r21.I(checkableImageButton, onLongClickListener);
        this.k = null;
        checkableImageButton.setOnLongClickListener(null);
        r21.I(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) b8Var.d;
        if (typedArray.hasValue(70)) {
            this.g = k20.v(getContext(), b8Var, 70);
        }
        if (typedArray.hasValue(71)) {
            this.h = hi0.k(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(b8Var.z(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.i) {
                this.i = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(69)) {
                ImageView.ScaleType h = r21.h(typedArray.getInt(69, -1));
                this.j = h;
                checkableImageButton.setScaleType(h);
            }
            s7Var.setVisibility(8);
            s7Var.setId(R.id.textinput_prefix_text);
            s7Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            s7Var.setAccessibilityLiveRegion(1);
            s7Var.setTextAppearance(typedArray.getResourceId(61, 0));
            if (typedArray.hasValue(62)) {
                s7Var.setTextColor(b8Var.y(62));
            }
            CharSequence text2 = typedArray.getText(60);
            this.e = TextUtils.isEmpty(text2) ? null : text2;
            s7Var.setText(text2);
            e();
            addView(checkableImageButton);
            addView(s7Var);
            return;
        }
        c.k("startIconSize cannot be less than 0");
        throw null;
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.f;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        return this.d.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.g;
            PorterDuff.Mode mode = this.h;
            TextInputLayout textInputLayout = this.c;
            r21.b(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            r21.G(textInputLayout, checkableImageButton, this.g);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.k;
        checkableImageButton.setOnClickListener(null);
        r21.I(checkableImageButton, onLongClickListener);
        this.k = null;
        checkableImageButton.setOnLongClickListener(null);
        r21.I(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z) {
        boolean z2;
        CheckableImageButton checkableImageButton = this.f;
        int i = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            if (!z) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.c.g;
        if (editText == null) {
            return;
        }
        if (this.f.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            paddingStart = editText.getPaddingStart();
        }
        this.d.setPaddingRelative(paddingStart, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i;
        int i2 = 8;
        if (this.e != null && !this.l) {
            i = 0;
        } else {
            i = 8;
        }
        if (this.f.getVisibility() == 0 || i == 0) {
            i2 = 0;
        }
        setVisibility(i2);
        this.d.setVisibility(i);
        this.c.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
