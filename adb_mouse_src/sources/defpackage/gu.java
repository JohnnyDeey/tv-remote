package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class gu extends LinearLayout {
    public final TextInputLayout c;
    public final FrameLayout d;
    public final CheckableImageButton e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public View.OnLongClickListener h;
    public final CheckableImageButton i;
    public final fu j;
    public int k;
    public final LinkedHashSet l;
    public ColorStateList m;
    public PorterDuff.Mode n;
    public int o;
    public ImageView.ScaleType p;
    public View.OnLongClickListener q;
    public CharSequence r;
    public final s7 s;
    public boolean t;
    public EditText u;
    public final AccessibilityManager v;
    public AccessibilityManager.TouchExplorationStateChangeListener w;
    public final du x;

    public gu(TextInputLayout textInputLayout, b8 b8Var) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.k = 0;
        this.l = new LinkedHashSet();
        this.x = new du(this);
        eu euVar = new eu(this);
        this.v = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.c = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a = a(this, from, R.id.text_input_error_icon);
        this.e = a;
        CheckableImageButton a2 = a(frameLayout, from, R.id.text_input_end_icon);
        this.i = a2;
        this.j = new fu(this, b8Var);
        s7 s7Var = new s7(getContext(), null);
        this.s = s7Var;
        TypedArray typedArray = (TypedArray) b8Var.d;
        if (typedArray.hasValue(38)) {
            this.f = k20.v(getContext(), b8Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.g = hi0.k(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(b8Var.z(37));
        }
        a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a.setImportantForAccessibility(2);
        a.setClickable(false);
        a.setPressable(false);
        a.setCheckable(false);
        a.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.m = k20.v(getContext(), b8Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.n = hi0.k(typedArray.getInt(33, -1), null);
            }
        }
        int i = 1;
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a2.getContentDescription() != (text = typedArray.getText(27))) {
                a2.setContentDescription(text);
            }
            a2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.m = k20.v(getContext(), b8Var, 55);
            }
            if (typedArray.hasValue(56)) {
                this.n = hi0.k(typedArray.getInt(56, -1), null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (a2.getContentDescription() != text2) {
                a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.o) {
                this.o = dimensionPixelSize;
                a2.setMinimumWidth(dimensionPixelSize);
                a2.setMinimumHeight(dimensionPixelSize);
                a.setMinimumWidth(dimensionPixelSize);
                a.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(31)) {
                ImageView.ScaleType h = r21.h(typedArray.getInt(31, -1));
                this.p = h;
                a2.setScaleType(h);
                a.setScaleType(h);
            }
            s7Var.setVisibility(8);
            s7Var.setId(R.id.textinput_suffix_text);
            s7Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            s7Var.setAccessibilityLiveRegion(1);
            s7Var.setTextAppearance(typedArray.getResourceId(73, 0));
            if (typedArray.hasValue(74)) {
                s7Var.setTextColor(b8Var.y(74));
            }
            CharSequence text3 = typedArray.getText(72);
            this.r = TextUtils.isEmpty(text3) ? null : text3;
            s7Var.setText(text3);
            n();
            frameLayout.addView(a2);
            addView(s7Var);
            addView(frameLayout);
            addView(a);
            textInputLayout.h0.add(euVar);
            if (textInputLayout.g != null) {
                euVar.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new of(i, this));
            return;
        }
        c.k("endIconSize cannot be less than 0");
        throw null;
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (k20.M(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final hu b() {
        hu xlVar;
        int i = this.k;
        fu fuVar = this.j;
        SparseArray sparseArray = fuVar.a;
        hu huVar = (hu) sparseArray.get(i);
        if (huVar == null) {
            gu guVar = fuVar.b;
            if (i != -1) {
                int i2 = 1;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                xlVar = new bs(guVar);
                            } else {
                                c.k(qo0.m("Invalid end icon mode: ", i));
                                return null;
                            }
                        } else {
                            xlVar = new th(guVar);
                        }
                    } else {
                        xlVar = new ud0(guVar, fuVar.d);
                    }
                } else {
                    xlVar = new xl(guVar, i2);
                }
            } else {
                xlVar = new xl(guVar, 0);
            }
            sparseArray.append(i, xlVar);
            return xlVar;
        }
        return huVar;
    }

    public final int c() {
        int marginStart;
        if (!d() && !e()) {
            marginStart = 0;
        } else {
            CheckableImageButton checkableImageButton = this.i;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        }
        return this.s.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        if (this.d.getVisibility() == 0 && this.i.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.e.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean z3;
        hu b = b();
        boolean j = b.j();
        CheckableImageButton checkableImageButton = this.i;
        boolean z4 = true;
        if (j && (z3 = checkableImageButton.f) != b.k()) {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        } else {
            z2 = false;
        }
        if ((b instanceof bs) && (isActivated = checkableImageButton.isActivated()) != ((bs) b).l) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z4 = z2;
        }
        if (!z && !z4) {
            return;
        }
        r21.G(this.c, checkableImageButton, this.m);
    }

    public final void g(int i) {
        boolean z;
        Drawable drawable;
        if (this.k == i) {
            return;
        }
        hu b = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.w;
        AccessibilityManager accessibilityManager = this.v;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        CharSequence charSequence = null;
        this.w = null;
        b.r();
        this.k = i;
        Iterator it = this.l.iterator();
        if (!it.hasNext()) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            h(z);
            hu b2 = b();
            int i2 = this.j.c;
            if (i2 == 0) {
                i2 = b2.d();
            }
            if (i2 != 0) {
                drawable = r21.r(getContext(), i2);
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.i;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.c;
            if (drawable != null) {
                r21.b(textInputLayout, checkableImageButton, this.m, this.n);
                r21.G(textInputLayout, checkableImageButton, this.m);
            }
            int c = b2.c();
            if (c != 0) {
                charSequence = getResources().getText(c);
            }
            if (checkableImageButton.getContentDescription() != charSequence) {
                checkableImageButton.setContentDescription(charSequence);
            }
            checkableImageButton.setCheckable(b2.j());
            if (b2.i(textInputLayout.getBoxBackgroundMode())) {
                b2.q();
                AccessibilityManager.TouchExplorationStateChangeListener h = b2.h();
                this.w = h;
                if (h != null && accessibilityManager != null && isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(this.w);
                }
                View.OnClickListener f = b2.f();
                View.OnLongClickListener onLongClickListener = this.q;
                checkableImageButton.setOnClickListener(f);
                r21.I(checkableImageButton, onLongClickListener);
                EditText editText = this.u;
                if (editText != null) {
                    b2.l(editText);
                    j(b2);
                }
                r21.b(textInputLayout, checkableImageButton, this.m, this.n);
                f(true);
                return;
            }
            c.h("The current box background mode ", textInputLayout.getBoxBackgroundMode(), " is not supported by the end icon mode ", i);
            return;
        }
        throw qo0.l(it);
    }

    public final void h(boolean z) {
        int i;
        if (d() != z) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            this.i.setVisibility(i);
            k();
            m();
            this.c.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.e;
        checkableImageButton.setImageDrawable(drawable);
        l();
        r21.b(this.c, checkableImageButton, this.f, this.g);
    }

    public final void j(hu huVar) {
        if (this.u != null) {
            if (huVar.e() != null) {
                this.u.setOnFocusChangeListener(huVar.e());
            }
            if (huVar.g() != null) {
                this.i.setOnFocusChangeListener(huVar.g());
            }
        }
    }

    public final void k() {
        int i;
        boolean z;
        int i2 = 8;
        if (this.i.getVisibility() == 0 && !e()) {
            i = 0;
        } else {
            i = 8;
        }
        this.d.setVisibility(i);
        if (this.r != null && !this.t) {
            z = false;
        } else {
            z = 8;
        }
        if (d() || e() || !z) {
            i2 = 0;
        }
        setVisibility(i2);
    }

    public final void l() {
        int i;
        CheckableImageButton checkableImageButton = this.e;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.c;
        if (drawable != null && textInputLayout.m.q && textInputLayout.o()) {
            i = 0;
        } else {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        k();
        m();
        if (this.k != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.c;
        if (textInputLayout.g == null) {
            return;
        }
        if (!d() && !e()) {
            i = textInputLayout.g.getPaddingEnd();
        } else {
            i = 0;
        }
        this.s.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.g.getPaddingTop(), i, textInputLayout.g.getPaddingBottom());
    }

    public final void n() {
        int i;
        s7 s7Var = this.s;
        int visibility = s7Var.getVisibility();
        boolean z = false;
        if (this.r != null && !this.t) {
            i = 0;
        } else {
            i = 8;
        }
        if (visibility != i) {
            hu b = b();
            if (i == 0) {
                z = true;
            }
            b.o(z);
        }
        k();
        s7Var.setVisibility(i);
        this.c.s();
    }
}
