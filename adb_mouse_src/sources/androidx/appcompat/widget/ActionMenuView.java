package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import defpackage.i81;
import defpackage.kt0;
import defpackage.lz0;
import defpackage.o2;
import defpackage.oa0;
import defpackage.q2;
import defpackage.r2;
import defpackage.s2;
import defpackage.t2;
import defpackage.u2;
import defpackage.v90;
import defpackage.w90;
import defpackage.x50;
import defpackage.y50;
import defpackage.z90;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class ActionMenuView extends y50 implements v90, oa0 {
    public final int A;
    public u2 B;
    public w90 r;
    public Context s;
    public int t;
    public boolean u;
    public r2 v;
    public kt0 w;
    public boolean x;
    public int y;
    public final int z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.z = (int) (56.0f * f);
        this.A = (int) (f * 4.0f);
        this.s = context;
        this.t = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, t2] */
    public static t2 j() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, t2] */
    public static t2 k(ViewGroup.LayoutParams layoutParams) {
        t2 t2Var;
        if (layoutParams != null) {
            if (layoutParams instanceof t2) {
                t2 t2Var2 = (t2) layoutParams;
                ?? layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) t2Var2);
                layoutParams2.a = t2Var2.a;
                t2Var = layoutParams2;
            } else {
                t2Var = new LinearLayout.LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) t2Var).gravity <= 0) {
                ((LinearLayout.LayoutParams) t2Var).gravity = 16;
            }
            return t2Var;
        }
        return j();
    }

    @Override // defpackage.v90
    public final boolean a(z90 z90Var) {
        return this.r.q(z90Var, null, 0);
    }

    @Override // defpackage.oa0
    public final void b(w90 w90Var) {
        this.r = w90Var;
    }

    @Override // defpackage.y50, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t2;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.y50
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ x50 generateDefaultLayoutParams() {
        return j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x50, android.widget.LinearLayout$LayoutParams] */
    @Override // defpackage.y50
    /* renamed from: g */
    public final x50 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // defpackage.y50, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.y50, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, la0] */
    public Menu getMenu() {
        if (this.r == null) {
            Context context = getContext();
            w90 w90Var = new w90(context);
            this.r = w90Var;
            w90Var.e = new i81(3, this);
            r2 r2Var = new r2(context);
            this.v = r2Var;
            r2Var.n = true;
            r2Var.o = true;
            r2Var.g = new Object();
            this.r.b(r2Var, this.s);
            r2 r2Var2 = this.v;
            r2Var2.j = this;
            this.r = r2Var2.e;
        }
        return this.r;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        r2 r2Var = this.v;
        q2 q2Var = r2Var.k;
        if (q2Var != null) {
            return q2Var.getDrawable();
        }
        if (r2Var.m) {
            return r2Var.l;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.t;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // defpackage.y50
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ x50 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof s2)) {
            z = ((s2) childAt).a();
        }
        if (i > 0 && (childAt2 instanceof s2)) {
            return ((s2) childAt2).b() | z;
        }
        return z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r2 r2Var = this.v;
        if (r2Var != null) {
            r2Var.g();
            if (this.v.h()) {
                this.v.d();
                this.v.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r2 r2Var = this.v;
        if (r2Var != null) {
            r2Var.d();
            o2 o2Var = r2Var.v;
            if (o2Var != null && o2Var.b()) {
                o2Var.i.dismiss();
            }
        }
    }

    @Override // defpackage.y50, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int width;
        int i6;
        if (!this.x) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = lz0.a;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                t2 t2Var = (t2) childAt.getLayoutParams();
                if (t2Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) t2Var).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) t2Var).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) t2Var).leftMargin) + ((LinearLayout.LayoutParams) t2Var).rightMargin;
                    l(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        if (i15 > 0) {
            i5 = paddingRight / i15;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (z2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                t2 t2Var2 = (t2) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !t2Var2.a) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) t2Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) t2Var2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            t2 t2Var3 = (t2) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !t2Var3.a) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) t2Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) t2Var3).rightMargin + max + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.y50, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        ?? r11;
        boolean z4;
        int i7;
        int i8;
        ActionMenuItemView actionMenuItemView;
        boolean z5;
        int i9;
        boolean z6;
        w90 w90Var;
        boolean z7 = this.x;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.x = z;
        if (z7 != z) {
            this.y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.x && (w90Var = this.r) != null && size != this.y) {
            this.y = size;
            w90Var.p(true);
        }
        int childCount = getChildCount();
        if (this.x && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int size3 = View.MeasureSpec.getSize(i2);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
            int i10 = size2 - paddingRight;
            int i11 = this.z;
            int i12 = i10 / i11;
            int i13 = i10 % i11;
            if (i12 == 0) {
                setMeasuredDimension(i10, 0);
                return;
            }
            int i14 = (i13 / i12) + i11;
            int childCount2 = getChildCount();
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            boolean z8 = false;
            int i19 = 0;
            long j = 0;
            while (true) {
                i3 = this.A;
                if (i18 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i18);
                int i20 = size3;
                int i21 = paddingBottom;
                if (childAt.getVisibility() == 8) {
                    i8 = i14;
                } else {
                    boolean z9 = childAt instanceof ActionMenuItemView;
                    i16++;
                    if (z9) {
                        childAt.setPadding(i3, 0, i3, 0);
                    }
                    t2 t2Var = (t2) childAt.getLayoutParams();
                    t2Var.f = false;
                    t2Var.c = 0;
                    t2Var.b = 0;
                    t2Var.d = false;
                    ((LinearLayout.LayoutParams) t2Var).leftMargin = 0;
                    ((LinearLayout.LayoutParams) t2Var).rightMargin = 0;
                    if (z9 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    t2Var.e = z4;
                    if (t2Var.a) {
                        i7 = 1;
                    } else {
                        i7 = i12;
                    }
                    t2 t2Var2 = (t2) childAt.getLayoutParams();
                    int i22 = i12;
                    i8 = i14;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i21, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z9) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && !TextUtils.isEmpty(actionMenuItemView.getText())) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z10 = z5;
                    if (i7 > 0 && (!z5 || i7 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i8 * i7, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i9 = measuredWidth / i8;
                        if (measuredWidth % i8 != 0) {
                            i9++;
                        }
                        if (z10 && i9 < 2) {
                            i9 = 2;
                        }
                    } else {
                        i9 = 0;
                    }
                    if (!t2Var2.a && z10) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    t2Var2.d = z6;
                    t2Var2.b = i9;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i9 * i8, 1073741824), makeMeasureSpec);
                    i17 = Math.max(i17, i9);
                    if (t2Var.d) {
                        i19++;
                    }
                    if (t2Var.a) {
                        z8 = true;
                    }
                    i12 = i22 - i9;
                    i15 = Math.max(i15, childAt.getMeasuredHeight());
                    if (i9 == 1) {
                        j |= 1 << i18;
                    }
                }
                i18++;
                size3 = i20;
                paddingBottom = i21;
                i14 = i8;
            }
            int i23 = size3;
            int i24 = i12;
            int i25 = i14;
            if (z8 && i16 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i26 = i24;
            boolean z11 = false;
            while (i19 > 0 && i26 > 0) {
                int i27 = Integer.MAX_VALUE;
                long j2 = 0;
                int i28 = 0;
                int i29 = 0;
                while (i29 < childCount2) {
                    int i30 = i15;
                    t2 t2Var3 = (t2) getChildAt(i29).getLayoutParams();
                    boolean z12 = z2;
                    if (t2Var3.d) {
                        int i31 = t2Var3.b;
                        if (i31 < i27) {
                            j2 = 1 << i29;
                            i27 = i31;
                            i28 = 1;
                        } else if (i31 == i27) {
                            j2 |= 1 << i29;
                            i28++;
                        }
                    }
                    i29++;
                    z2 = z12;
                    i15 = i30;
                }
                i4 = i15;
                boolean z13 = z2;
                j |= j2;
                if (i28 > i26) {
                    break;
                }
                int i32 = i27 + 1;
                int i33 = 0;
                while (i33 < childCount2) {
                    View childAt2 = getChildAt(i33);
                    t2 t2Var4 = (t2) childAt2.getLayoutParams();
                    boolean z14 = z8;
                    long j3 = 1 << i33;
                    if ((j2 & j3) == 0) {
                        if (t2Var4.b == i32) {
                            j |= j3;
                        }
                    } else {
                        if (z13 && t2Var4.e) {
                            r11 = 1;
                            r11 = 1;
                            if (i26 == 1) {
                                childAt2.setPadding(i3 + i25, 0, i3, 0);
                            }
                        } else {
                            r11 = 1;
                        }
                        t2Var4.b += r11;
                        t2Var4.f = r11;
                        i26--;
                    }
                    i33++;
                    z8 = z14;
                }
                z2 = z13;
                i15 = i4;
                z11 = true;
            }
            i4 = i15;
            if (!z8 && i16 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i26 > 0 && j != 0 && (i26 < i16 - 1 || z3 || i17 > 1)) {
                float bitCount = Long.bitCount(j);
                if (!z3) {
                    if ((j & 1) != 0 && !((t2) getChildAt(0).getLayoutParams()).e) {
                        bitCount -= 0.5f;
                    }
                    int i34 = childCount2 - 1;
                    if ((j & (1 << i34)) != 0 && !((t2) getChildAt(i34).getLayoutParams()).e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i6 = (int) ((i26 * i25) / bitCount);
                } else {
                    i6 = 0;
                }
                boolean z15 = z11;
                for (int i35 = 0; i35 < childCount2; i35++) {
                    if ((j & (1 << i35)) != 0) {
                        View childAt3 = getChildAt(i35);
                        t2 t2Var5 = (t2) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            t2Var5.c = i6;
                            t2Var5.f = true;
                            if (i35 == 0 && !t2Var5.e) {
                                ((LinearLayout.LayoutParams) t2Var5).leftMargin = (-i6) / 2;
                            }
                            z15 = true;
                        } else if (t2Var5.a) {
                            t2Var5.c = i6;
                            t2Var5.f = true;
                            ((LinearLayout.LayoutParams) t2Var5).rightMargin = (-i6) / 2;
                            z15 = true;
                        } else {
                            if (i35 != 0) {
                                ((LinearLayout.LayoutParams) t2Var5).leftMargin = i6 / 2;
                            }
                            if (i35 != childCount2 - 1) {
                                ((LinearLayout.LayoutParams) t2Var5).rightMargin = i6 / 2;
                            }
                        }
                    }
                }
                z11 = z15;
            }
            if (z11) {
                for (int i36 = 0; i36 < childCount2; i36++) {
                    View childAt4 = getChildAt(i36);
                    t2 t2Var6 = (t2) childAt4.getLayoutParams();
                    if (t2Var6.f) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((t2Var6.b * i25) + t2Var6.c, 1073741824), childMeasureSpec);
                    }
                }
            }
            if (mode != 1073741824) {
                i5 = i4;
            } else {
                i5 = i23;
            }
            setMeasuredDimension(i10, i5);
            return;
        }
        for (int i37 = 0; i37 < childCount; i37++) {
            t2 t2Var7 = (t2) getChildAt(i37).getLayoutParams();
            ((LinearLayout.LayoutParams) t2Var7).rightMargin = 0;
            ((LinearLayout.LayoutParams) t2Var7).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.v.s = z;
    }

    public void setOnMenuItemClickListener(u2 u2Var) {
        this.B = u2Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        r2 r2Var = this.v;
        q2 q2Var = r2Var.k;
        if (q2Var != null) {
            q2Var.setImageDrawable(drawable);
        } else {
            r2Var.m = true;
            r2Var.l = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.u = z;
    }

    public void setPopupTheme(int i) {
        if (this.t != i) {
            this.t = i;
            if (i == 0) {
                this.s = getContext();
            } else {
                this.s = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(r2 r2Var) {
        this.v = r2Var;
        r2Var.j = this;
        this.r = r2Var.e;
    }

    @Override // defpackage.y50, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }
}
