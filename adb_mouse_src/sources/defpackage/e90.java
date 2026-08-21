package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class e90 extends j5 {
    public static final int[] A = {R.attr.state_indeterminate};
    public static final int[] B = {R.attr.state_error};
    public static final int[][] C = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int D = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public final LinkedHashSet g;
    public final LinkedHashSet h;
    public ColorStateList i;
    public boolean j;
    public boolean k;
    public boolean l;
    public CharSequence m;
    public Drawable n;
    public Drawable o;
    public boolean p;
    public ColorStateList q;
    public ColorStateList r;
    public PorterDuff.Mode s;
    public int t;
    public int[] u;
    public boolean v;
    public CharSequence w;
    public CompoundButton.OnCheckedChangeListener x;
    public final t4 y;
    public final zc z;

    public e90(Context context, AttributeSet attributeSet) {
        super(r21.Q(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.g = new LinkedHashSet();
        this.h = new LinkedHashSet();
        Context context2 = getContext();
        t4 t4Var = new t4(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = pj0.a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        t4Var.c = drawable;
        drawable.setCallback(t4Var.h);
        new s4(t4Var.c.getConstantState());
        this.y = t4Var;
        this.z = new zc(this, 2);
        Context context3 = getContext();
        this.n = getButtonDrawable();
        this.q = getSuperButtonTintList();
        setSupportButtonTintList(null);
        k20.i(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = mg0.q;
        k20.j(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        b8 b8Var = new b8(context3, obtainStyledAttributes);
        this.o = b8Var.z(2);
        if (this.n != null && mn.M(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == D && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.n = r21.r(context3, R.drawable.mtrl_checkbox_button);
                this.p = true;
                if (this.o == null) {
                    this.o = r21.r(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.r = k20.v(context3, b8Var, 3);
        this.s = hi0.k(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.j = obtainStyledAttributes.getBoolean(10, false);
        this.k = obtainStyledAttributes.getBoolean(6, true);
        this.l = obtainStyledAttributes.getBoolean(9, false);
        this.m = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        b8Var.N();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.t;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.i == null) {
            int x = f20.x(this, R.attr.colorControlActivated);
            int x2 = f20.x(this, R.attr.colorError);
            int x3 = f20.x(this, R.attr.colorSurface);
            int x4 = f20.x(this, R.attr.colorOnSurface);
            this.i = new ColorStateList(C, new int[]{f20.O(x3, x2, 1.0f), f20.O(x3, x, 1.0f), f20.O(x3, x4, 0.54f), f20.O(x3, x4, 0.38f), f20.O(x3, x4, 0.38f)});
        }
        return this.i;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.q;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        g2 g2Var;
        Drawable drawable = this.n;
        ColorStateList colorStateList3 = this.q;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.n = drawable;
        Drawable drawable2 = this.o;
        ColorStateList colorStateList4 = this.r;
        PorterDuff.Mode mode = this.s;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.o = drawable2;
        if (this.p) {
            t4 t4Var = this.y;
            if (t4Var != null) {
                r4 r4Var = t4Var.d;
                Drawable drawable3 = t4Var.c;
                zc zcVar = this.z;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (zcVar.a == null) {
                        zcVar.a = new p4(zcVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(zcVar.a);
                }
                ArrayList arrayList = t4Var.g;
                if (arrayList != null && zcVar != null) {
                    arrayList.remove(zcVar);
                    if (t4Var.g.size() == 0 && (g2Var = t4Var.f) != null) {
                        r4Var.b.removeListener(g2Var);
                        t4Var.f = null;
                    }
                }
                Drawable drawable4 = t4Var.c;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (zcVar.a == null) {
                        zcVar.a = new p4(zcVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(zcVar.a);
                } else if (zcVar != null) {
                    if (t4Var.g == null) {
                        t4Var.g = new ArrayList();
                    }
                    if (!t4Var.g.contains(zcVar)) {
                        t4Var.g.add(zcVar);
                        if (t4Var.f == null) {
                            t4Var.f = new g2(1, t4Var);
                        }
                        r4Var.b.addListener(t4Var.f);
                    }
                }
            }
            Drawable drawable5 = this.n;
            if ((drawable5 instanceof AnimatedStateListDrawable) && t4Var != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, t4Var, false);
                ((AnimatedStateListDrawable) this.n).addTransition(R.id.indeterminate, R.id.unchecked, t4Var, false);
            }
        }
        Drawable drawable6 = this.n;
        if (drawable6 != null && (colorStateList2 = this.q) != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.o;
        if (drawable7 != null && (colorStateList = this.r) != null) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.n;
        Drawable drawable9 = this.o;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.n;
    }

    public Drawable getButtonIconDrawable() {
        return this.o;
    }

    public ColorStateList getButtonIconTintList() {
        return this.r;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.s;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.q;
    }

    public int getCheckedState() {
        return this.t;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.m;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.t == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.j && this.q == null && this.r == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, A);
        }
        if (this.l) {
            View.mergeDrawableStates(onCreateDrawableState, B);
        }
        int i2 = 0;
        while (true) {
            if (i2 < onCreateDrawableState.length) {
                int i3 = onCreateDrawableState[i2];
                if (i3 == 16842912) {
                    copyOf = onCreateDrawableState;
                    break;
                }
                if (i3 == 0) {
                    copyOf = (int[]) onCreateDrawableState.clone();
                    copyOf[i2] = 16842912;
                    break;
                }
                i2++;
            } else {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
        }
        this.u = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (this.k && TextUtils.isEmpty(getText()) && (buttonDrawable = getButtonDrawable()) != null) {
            int i = 1;
            if (getLayoutDirection() == 1) {
                i = -1;
            }
            int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * i;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = buttonDrawable.getBounds();
                getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.l) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.m));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d90)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d90 d90Var = (d90) parcelable;
        super.onRestoreInstanceState(d90Var.getSuperState());
        setCheckedState(d90Var.c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, d90] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.c = getCheckedState();
        return baseSavedState;
    }

    @Override // defpackage.j5, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(r21.r(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.o = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(r21.r(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.r == colorStateList) {
            return;
        }
        this.r = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.s == mode) {
            return;
        }
        this.s = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.q == colorStateList) {
            return;
        }
        this.q = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.k = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        boolean z;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.t != i) {
            this.t = i;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            super.setChecked(z);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.w == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.v) {
                this.v = true;
                LinkedHashSet linkedHashSet = this.h;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw qo0.l(it);
                    }
                }
                if (this.t != 2 && (onCheckedChangeListener = this.x) != null) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.v = false;
            }
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.m = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z) {
        if (this.l != z) {
            this.l = z;
            refreshDrawableState();
            Iterator it = this.g.iterator();
            if (!it.hasNext()) {
            } else {
                throw qo0.l(it);
            }
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.x = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.w = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.j = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // defpackage.j5, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.n = drawable;
        this.p = false;
        a();
    }
}
