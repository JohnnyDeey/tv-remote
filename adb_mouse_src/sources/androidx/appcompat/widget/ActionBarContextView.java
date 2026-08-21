package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.c;
import defpackage.dz0;
import defpackage.f2;
import defpackage.j;
import defpackage.lz0;
import defpackage.ng0;
import defpackage.o2;
import defpackage.oa0;
import defpackage.r2;
import defpackage.r21;
import defpackage.ry0;
import defpackage.v2;
import defpackage.w90;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public final j c;
    public final Context d;
    public ActionMenuView e;
    public r2 f;
    public int g;
    public dz0 h;
    public boolean i;
    public boolean j;
    public CharSequence k;
    public CharSequence l;
    public View m;
    public View n;
    public View o;
    public LinearLayout p;
    public TextView q;
    public TextView r;
    public final int s;
    public final int t;
    public boolean u;
    public final int v;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, j] */
    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        ?? obj = new Object();
        obj.c = this;
        obj.a = false;
        this.c = obj;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.d = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.d = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ng0.d, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = r21.r(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        setBackground(drawable);
        this.s = obtainStyledAttributes.getResourceId(5, 0);
        this.t = obtainStyledAttributes.getResourceId(4, 0);
        this.g = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.v = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void a(ActionBarContextView actionBarContextView) {
        super.setVisibility(0);
    }

    public static /* synthetic */ void b(ActionBarContextView actionBarContextView, int i) {
        super.setVisibility(i);
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void c(v2 v2Var) {
        View view = this.m;
        int i = 0;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.v, (ViewGroup) this, false);
            this.m = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.m);
        }
        View findViewById = this.m.findViewById(R.id.action_mode_close_button);
        this.n = findViewById;
        findViewById.setOnClickListener(new f2(i, v2Var));
        w90 c = v2Var.c();
        r2 r2Var = this.f;
        if (r2Var != null) {
            r2Var.d();
            o2 o2Var = r2Var.v;
            if (o2Var != null && o2Var.b()) {
                o2Var.i.dismiss();
            }
        }
        r2 r2Var2 = new r2(getContext());
        this.f = r2Var2;
        r2Var2.n = true;
        r2Var2.o = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c.b(this.f, this.d);
        r2 r2Var3 = this.f;
        oa0 oa0Var = r2Var3.j;
        if (oa0Var == null) {
            oa0 oa0Var2 = (oa0) r2Var3.f.inflate(r2Var3.h, (ViewGroup) this, false);
            r2Var3.j = oa0Var2;
            oa0Var2.b(r2Var3.e);
            r2Var3.g();
        }
        oa0 oa0Var3 = r2Var3.j;
        if (oa0Var != oa0Var3) {
            ((ActionMenuView) oa0Var3).setPresenter(r2Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) oa0Var3;
        this.e = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.e, layoutParams);
    }

    public final void d() {
        int i;
        if (this.p == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.p = linearLayout;
            this.q = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.r = (TextView) this.p.findViewById(R.id.action_bar_subtitle);
            int i2 = this.s;
            if (i2 != 0) {
                this.q.setTextAppearance(getContext(), i2);
            }
            int i3 = this.t;
            if (i3 != 0) {
                this.r.setTextAppearance(getContext(), i3);
            }
        }
        this.q.setText(this.k);
        this.r.setText(this.l);
        boolean isEmpty = TextUtils.isEmpty(this.k);
        boolean isEmpty2 = TextUtils.isEmpty(this.l);
        TextView textView = this.r;
        int i4 = 8;
        if (!isEmpty2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout2 = this.p;
        if (!isEmpty || !isEmpty2) {
            i4 = 0;
        }
        linearLayout2.setVisibility(i4);
        if (this.p.getParent() == null) {
            addView(this.p);
        }
    }

    public final void e() {
        removeAllViews();
        this.o = null;
        this.e = null;
        this.f = null;
        View view = this.n;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        if (this.h != null) {
            return this.c.b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.g;
    }

    public CharSequence getSubtitle() {
        return this.l;
    }

    public CharSequence getTitle() {
        return this.k;
    }

    @Override // android.view.View
    /* renamed from: h */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            dz0 dz0Var = this.h;
            if (dz0Var != null) {
                dz0Var.b();
            }
            super.setVisibility(i);
        }
    }

    public final dz0 i(int i, long j) {
        dz0 dz0Var = this.h;
        if (dz0Var != null) {
            dz0Var.b();
        }
        j jVar = this.c;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            dz0 a = ry0.a(this);
            a.a(1.0f);
            a.c(j);
            ((ActionBarContextView) jVar.c).h = a;
            jVar.b = i;
            a.d(jVar);
            return a;
        }
        dz0 a2 = ry0.a(this);
        a2.a(0.0f);
        a2.c(j);
        ((ActionBarContextView) jVar.c).h = a2;
        jVar.b = i;
        a2.d(jVar);
        return a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, ng0.a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        r2 r2Var = this.f;
        if (r2Var != null) {
            Configuration configuration2 = r2Var.d.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i2 <= 600 && ((i2 <= 960 || i3 <= 720) && (i2 <= 720 || i3 <= 960))) {
                if (i2 < 500 && ((i2 <= 640 || i3 <= 480) && (i2 <= 480 || i3 <= 640))) {
                    if (i2 >= 360) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                } else {
                    i = 4;
                }
            } else {
                i = 5;
            }
            r2Var.r = i;
            w90 w90Var = r2Var.e;
            if (w90Var != null) {
                w90Var.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r2 r2Var = this.f;
        if (r2Var != null) {
            r2Var.d();
            o2 o2Var = this.f.v;
            if (o2Var != null && o2Var.b()) {
                o2Var.i.dismiss();
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.j = false;
        }
        if (!this.j) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.j = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.j = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3 = lz0.a;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            paddingLeft = (i3 - i) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.m;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
            if (z2) {
                i5 = marginLayoutParams.rightMargin;
            } else {
                i5 = marginLayoutParams.leftMargin;
            }
            if (z2) {
                i6 = marginLayoutParams.leftMargin;
            } else {
                i6 = marginLayoutParams.rightMargin;
            }
            if (z2) {
                i7 = paddingLeft - i5;
            } else {
                i7 = paddingLeft + i5;
            }
            int g = g(this.m, i7, paddingTop, paddingTop2, z2) + i7;
            if (z2) {
                i8 = g - i6;
            } else {
                i8 = g + i6;
            }
            paddingLeft = i8;
        }
        LinearLayout linearLayout = this.p;
        if (linearLayout != null && this.o == null && linearLayout.getVisibility() != 8) {
            paddingLeft += g(this.p, paddingLeft, paddingTop, paddingTop2, z2);
        }
        View view2 = this.o;
        if (view2 != null) {
            g(view2, paddingLeft, paddingTop, paddingTop2, z2);
        }
        if (z2) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.e;
        if (actionMenuView != null) {
            g(actionMenuView, paddingRight, paddingTop, paddingTop2, !z2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 1073741824;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (View.MeasureSpec.getMode(i2) != 0) {
                int size = View.MeasureSpec.getSize(i);
                int i6 = this.g;
                if (i6 <= 0) {
                    i6 = View.MeasureSpec.getSize(i2);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i7 = i6 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
                View view = this.m;
                if (view != null) {
                    int f = f(view, paddingLeft, makeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
                    paddingLeft = f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.e;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = f(this.e, paddingLeft, makeMeasureSpec);
                }
                LinearLayout linearLayout = this.p;
                if (linearLayout != null && this.o == null) {
                    if (this.u) {
                        this.p.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.p.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.p;
                        if (z) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        linearLayout2.setVisibility(i4);
                    } else {
                        paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                    }
                }
                View view2 = this.o;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i8 = layoutParams.width;
                    if (i8 != -2) {
                        i3 = 1073741824;
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    if (i8 >= 0) {
                        paddingLeft = Math.min(i8, paddingLeft);
                    }
                    int i9 = layoutParams.height;
                    if (i9 == -2) {
                        i5 = Integer.MIN_VALUE;
                    }
                    if (i9 >= 0) {
                        i7 = Math.min(i9, i7);
                    }
                    this.o.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(i7, i5));
                }
                if (this.g <= 0) {
                    int childCount = getChildCount();
                    int i10 = 0;
                    for (int i11 = 0; i11 < childCount; i11++) {
                        int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i10) {
                            i10 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i10);
                    return;
                }
                setMeasuredDimension(size, i6);
                return;
            }
            c.o(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        c.o(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.i = false;
        }
        if (!this.i) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.i = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.i = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.g = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.o;
        if (view2 != null) {
            removeView(view2);
        }
        this.o = view;
        if (view != null && (linearLayout = this.p) != null) {
            removeView(linearLayout);
            this.p = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.l = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.k = charSequence;
        d();
        ry0.n(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.u) {
            requestLayout();
        }
        this.u = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
