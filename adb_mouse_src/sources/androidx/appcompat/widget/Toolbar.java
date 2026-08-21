package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import defpackage.ak0;
import defpackage.b8;
import defpackage.f2;
import defpackage.j0;
import defpackage.jt0;
import defpackage.kt0;
import defpackage.l9;
import defpackage.lt0;
import defpackage.lz0;
import defpackage.mt0;
import defpackage.n6;
import defpackage.ng0;
import defpackage.nn;
import defpackage.nt0;
import defpackage.o6;
import defpackage.oi0;
import defpackage.oq0;
import defpackage.ot0;
import defpackage.pt0;
import defpackage.px;
import defpackage.r2;
import defpackage.r21;
import defpackage.rt0;
import defpackage.ry0;
import defpackage.s7;
import defpackage.w90;
import defpackage.x80;
import defpackage.z90;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public CharSequence A;
    public ColorStateList B;
    public ColorStateList C;
    public boolean D;
    public boolean E;
    public final ArrayList F;
    public final ArrayList G;
    public final int[] H;
    public final b8 I;
    public ArrayList J;
    public final kt0 K;
    public rt0 L;
    public r2 M;
    public mt0 N;
    public boolean O;
    public OnBackInvokedCallback P;
    public OnBackInvokedDispatcher Q;
    public boolean R;
    public final l9 S;
    public ActionMenuView c;
    public s7 d;
    public s7 e;
    public n6 f;
    public o6 g;
    public final Drawable h;
    public final CharSequence i;
    public n6 j;
    public View k;
    public Context l;
    public int m;
    public int n;
    public int o;
    public final int p;
    public final int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public ak0 v;
    public int w;
    public int x;
    public final int y;
    public CharSequence z;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.y = 8388627;
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new int[2];
        this.I = new b8(new jt0(this, 1));
        this.J = new ArrayList();
        this.K = new kt0(this);
        this.S = new l9(15, this);
        Context context2 = getContext();
        int[] iArr = ng0.x;
        b8 J = b8.J(context2, attributeSet, iArr, R.attr.toolbarStyle);
        ry0.l(this, context, iArr, attributeSet, (TypedArray) J.d, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) J.d;
        this.n = typedArray.getResourceId(28, 0);
        this.o = typedArray.getResourceId(19, 0);
        this.y = typedArray.getInteger(0, 8388627);
        this.p = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.u = dimensionPixelOffset;
        this.t = dimensionPixelOffset;
        this.s = dimensionPixelOffset;
        this.r = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.r = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.s = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.t = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.u = dimensionPixelOffset5;
        }
        this.q = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        ak0 ak0Var = this.v;
        ak0Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            ak0Var.e = dimensionPixelSize;
            ak0Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            ak0Var.f = dimensionPixelSize2;
            ak0Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            ak0Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.w = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.x = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.h = J.z(4);
        this.i = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.l = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable z = J.z(16);
        if (z != null) {
            setNavigationIcon(z);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable z2 = J.z(11);
        if (z2 != null) {
            setLogo(z2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(J.y(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(J.y(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        J.N();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new oq0(getContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, nt0] */
    public static nt0 h() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.b = 0;
        marginLayoutParams.a = 8388627;
        return marginLayoutParams;
    }

    public static nt0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof nt0;
        if (z) {
            nt0 nt0Var = (nt0) layoutParams;
            nt0 nt0Var2 = new nt0(nt0Var);
            nt0Var2.b = 0;
            nt0Var2.b = nt0Var.b;
            return nt0Var2;
        }
        if (z) {
            nt0 nt0Var3 = new nt0((nt0) layoutParams);
            nt0Var3.b = 0;
            return nt0Var3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            nt0 nt0Var4 = new nt0(marginLayoutParams);
            nt0Var4.b = 0;
            ((ViewGroup.MarginLayoutParams) nt0Var4).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) nt0Var4).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) nt0Var4).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) nt0Var4).bottomMargin = marginLayoutParams.bottomMargin;
            return nt0Var4;
        }
        nt0 nt0Var5 = new nt0(layoutParams);
        nt0Var5.b = 0;
        return nt0Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i) {
        boolean z;
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                nt0 nt0Var = (nt0) childAt.getLayoutParams();
                if (nt0Var.b == 0 && s(childAt)) {
                    int i3 = nt0Var.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            nt0 nt0Var2 = (nt0) childAt2.getLayoutParams();
            if (nt0Var2.b == 0 && s(childAt2)) {
                int i5 = nt0Var2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        nt0 nt0Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            nt0Var = h();
        } else if (!checkLayoutParams(layoutParams)) {
            nt0Var = i(layoutParams);
        } else {
            nt0Var = (nt0) layoutParams;
        }
        nt0Var.b = 1;
        if (z && this.k != null) {
            view.setLayoutParams(nt0Var);
            this.G.add(view);
        } else {
            addView(view, nt0Var);
        }
    }

    public final void c() {
        if (this.j == null) {
            n6 n6Var = new n6(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.j = n6Var;
            n6Var.setImageDrawable(this.h);
            this.j.setContentDescription(this.i);
            nt0 h = h();
            h.a = (this.p & 112) | 8388611;
            h.b = 2;
            this.j.setLayoutParams(h);
            this.j.setOnClickListener(new f2(4, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof nt0)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ak0, java.lang.Object] */
    public final void d() {
        if (this.v == null) {
            ?? obj = new Object();
            obj.a = 0;
            obj.b = 0;
            obj.c = Integer.MIN_VALUE;
            obj.d = Integer.MIN_VALUE;
            obj.e = 0;
            obj.f = 0;
            obj.g = false;
            obj.h = false;
            this.v = obj;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView.r == null) {
            w90 w90Var = (w90) actionMenuView.getMenu();
            if (this.N == null) {
                this.N = new mt0(this);
            }
            this.c.setExpandedActionViewsExclusive(true);
            w90Var.b(this.N, this.l);
            t();
        }
    }

    public final void f() {
        if (this.c == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.c = actionMenuView;
            actionMenuView.setPopupTheme(this.m);
            this.c.setOnMenuItemClickListener(this.K);
            ActionMenuView actionMenuView2 = this.c;
            kt0 kt0Var = new kt0(this);
            actionMenuView2.getClass();
            actionMenuView2.w = kt0Var;
            nt0 h = h();
            h.a = (this.p & 112) | 8388613;
            this.c.setLayoutParams(h);
            b(this.c, false);
        }
    }

    public final void g() {
        if (this.f == null) {
            this.f = new n6(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            nt0 h = h();
            h.a = (this.p & 112) | 8388611;
            this.f.setLayoutParams(h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, nt0] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ng0.b);
        marginLayoutParams.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.b = 0;
        return marginLayoutParams;
    }

    public CharSequence getCollapseContentDescription() {
        n6 n6Var = this.j;
        if (n6Var != null) {
            return n6Var.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        n6 n6Var = this.j;
        if (n6Var != null) {
            return n6Var.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        ak0 ak0Var = this.v;
        if (ak0Var != null) {
            if (ak0Var.g) {
                return ak0Var.a;
            }
            return ak0Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.x;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        ak0 ak0Var = this.v;
        if (ak0Var != null) {
            return ak0Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        ak0 ak0Var = this.v;
        if (ak0Var != null) {
            return ak0Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        ak0 ak0Var = this.v;
        if (ak0Var != null) {
            if (ak0Var.g) {
                return ak0Var.b;
            }
            return ak0Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.w;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        w90 w90Var;
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && (w90Var = actionMenuView.r) != null && w90Var.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.x, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.w, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        o6 o6Var = this.g;
        if (o6Var != null) {
            return o6Var.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        o6 o6Var = this.g;
        if (o6Var != null) {
            return o6Var.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.c.getMenu();
    }

    public View getNavButtonView() {
        return this.f;
    }

    public CharSequence getNavigationContentDescription() {
        n6 n6Var = this.f;
        if (n6Var != null) {
            return n6Var.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        n6 n6Var = this.f;
        if (n6Var != null) {
            return n6Var.getDrawable();
        }
        return null;
    }

    public r2 getOuterActionMenuPresenter() {
        return this.M;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.c.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.l;
    }

    public int getPopupTheme() {
        return this.m;
    }

    public CharSequence getSubtitle() {
        return this.A;
    }

    public final TextView getSubtitleTextView() {
        return this.e;
    }

    public CharSequence getTitle() {
        return this.z;
    }

    public int getTitleMarginBottom() {
        return this.u;
    }

    public int getTitleMarginEnd() {
        return this.s;
    }

    public int getTitleMarginStart() {
        return this.r;
    }

    public int getTitleMarginTop() {
        return this.t;
    }

    public final TextView getTitleTextView() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, rt0] */
    public nn getWrapper() {
        boolean z;
        Drawable drawable;
        if (this.L == null) {
            ?? obj = new Object();
            obj.n = 0;
            obj.a = this;
            obj.h = getTitle();
            obj.i = getSubtitle();
            if (obj.h != null) {
                z = true;
            } else {
                z = false;
            }
            obj.g = z;
            obj.f = getNavigationIcon();
            String str = null;
            b8 J = b8.J(getContext(), null, ng0.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) J.d;
            obj.o = J.z(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.g = true;
                obj.h = text;
                if ((obj.b & 8) != 0) {
                    setTitle(text);
                    if (obj.g) {
                        ry0.n(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.i = text2;
                if ((obj.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable z2 = J.z(20);
            if (z2 != null) {
                obj.e = z2;
                obj.c();
            }
            Drawable z3 = J.z(17);
            if (z3 != null) {
                obj.d = z3;
                obj.c();
            }
            if (obj.f == null && (drawable = obj.o) != null) {
                obj.f = drawable;
                if ((obj.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            obj.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = obj.c;
                if (view != null && (obj.b & 16) != 0) {
                    removeView(view);
                }
                obj.c = inflate;
                if (inflate != null && (obj.b & 16) != 0) {
                    addView(inflate);
                }
                obj.a(obj.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.v.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.n = resourceId2;
                s7 s7Var = this.d;
                if (s7Var != null) {
                    s7Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.o = resourceId3;
                s7 s7Var2 = this.e;
                if (s7Var2 != null) {
                    s7Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            J.N();
            if (R.string.abc_action_bar_up_description != obj.n) {
                obj.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = obj.n;
                    if (i != 0) {
                        str = getContext().getString(i);
                    }
                    obj.j = str;
                    obj.b();
                }
            }
            obj.j = getNavigationContentDescription();
            setNavigationOnClickListener(new x80(obj));
            this.L = obj;
        }
        return this.L;
    }

    public final int j(View view, int i) {
        int i2;
        nt0 nt0Var = (nt0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int i3 = nt0Var.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.y & 112;
        }
        if (i3 != 48) {
            if (i3 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i5 = ((ViewGroup.MarginLayoutParams) nt0Var).topMargin;
                if (i4 < i5) {
                    i4 = i5;
                } else {
                    int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                    int i7 = ((ViewGroup.MarginLayoutParams) nt0Var).bottomMargin;
                    if (i6 < i7) {
                        i4 = Math.max(0, i4 - (i7 - i6));
                    }
                }
                return paddingTop + i4;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) nt0Var).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    public final void m() {
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.I.f).iterator();
        while (it.hasNext()) {
            ((px) it.next()).a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.J = currentMenuItems2;
    }

    public final boolean n(View view) {
        if (view.getParent() != this && !this.G.contains(view)) {
            return false;
        }
        return true;
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        nt0 nt0Var = (nt0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) nt0Var).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) nt0Var).rightMargin + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.E = false;
        }
        if (!this.E) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.E = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.E = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0285 A[LOOP:0: B:44:0x0283->B:45:0x0285, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x029d A[LOOP:1: B:48:0x029b->B:49:0x029d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02bd A[LOOP:2: B:52:0x02bb->B:53:0x02bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0310 A[LOOP:3: B:61:0x030e->B:62:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z = lz0.a;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (s(this.f)) {
            r(this.f, i, 0, i2, this.q);
            i3 = k(this.f) + this.f.getMeasuredWidth();
            i4 = Math.max(0, l(this.f) + this.f.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.f.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (s(this.j)) {
            r(this.j, i, 0, i2, this.q);
            i3 = k(this.j) + this.j.getMeasuredWidth();
            i4 = Math.max(i4, l(this.j) + this.j.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.j.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        Object[] objArr2 = objArr;
        int[] iArr = this.H;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (s(this.c)) {
            r(this.c, i, max, i2, this.q);
            i6 = k(this.c) + this.c.getMeasuredWidth();
            i4 = Math.max(i4, l(this.c) + this.c.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.c.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (s(this.k)) {
            max3 += q(this.k, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.k) + this.k.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.k.getMeasuredState());
        }
        if (s(this.g)) {
            max3 += q(this.g, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.g) + this.g.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.g.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((nt0) childAt.getLayoutParams()).b == 0 && s(childAt)) {
                max3 += q(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                i4 = max4;
            } else {
                max3 = max3;
            }
        }
        int i12 = max3;
        int i13 = this.t + this.u;
        int i14 = this.r + this.s;
        if (s(this.d)) {
            q(this.d, i, i12 + i14, i2, i13, iArr);
            int k = k(this.d) + this.d.getMeasuredWidth();
            i7 = l(this.d) + this.d.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.d.getMeasuredState());
            i9 = k;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (s(this.e)) {
            i9 = Math.max(i9, q(this.e, i, i12 + i14, i2, i13 + i7, iArr));
            i7 += l(this.e) + this.e.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i8, this.e.getMeasuredState());
        }
        int max5 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i12 + i9;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.O) {
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!s(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i10);
        }
        i10 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        w90 w90Var;
        MenuItem findItem;
        if (!(parcelable instanceof pt0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        pt0 pt0Var = (pt0) parcelable;
        super.onRestoreInstanceState(pt0Var.c);
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            w90Var = actionMenuView.r;
        } else {
            w90Var = null;
        }
        int i = pt0Var.e;
        if (i != 0 && this.N != null && w90Var != null && (findItem = w90Var.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (pt0Var.f) {
            l9 l9Var = this.S;
            removeCallbacks(l9Var);
            post(l9Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        ak0 ak0Var = this.v;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z == ak0Var.g) {
            return;
        }
        ak0Var.g = z;
        if (ak0Var.h) {
            if (z) {
                int i2 = ak0Var.d;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = ak0Var.e;
                }
                ak0Var.a = i2;
                int i3 = ak0Var.c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = ak0Var.f;
                }
                ak0Var.b = i3;
                return;
            }
            int i4 = ak0Var.c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = ak0Var.e;
            }
            ak0Var.a = i4;
            int i5 = ak0Var.d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = ak0Var.f;
            }
            ak0Var.b = i5;
            return;
        }
        ak0Var.a = ak0Var.e;
        ak0Var.b = ak0Var.f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, j0, pt0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        r2 r2Var;
        z90 z90Var;
        ?? j0Var = new j0(super.onSaveInstanceState());
        mt0 mt0Var = this.N;
        if (mt0Var != null && (z90Var = mt0Var.d) != null) {
            j0Var.e = z90Var.a;
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && (r2Var = actionMenuView.v) != null && r2Var.h()) {
            z = true;
        } else {
            z = false;
        }
        j0Var.f = z;
        return j0Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.D = false;
        }
        if (!this.D) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.D = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.D = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        nt0 nt0Var = (nt0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) nt0Var).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) nt0Var).leftMargin);
    }

    public final int q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void r(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.R != z) {
            this.R = z;
            t();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        n6 n6Var = this.j;
        if (n6Var != null) {
            n6Var.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.j.setImageDrawable(drawable);
        } else {
            n6 n6Var = this.j;
            if (n6Var != null) {
                n6Var.setImageDrawable(this.h);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.O = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.x) {
            this.x = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.w) {
            this.w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        o6 o6Var = this.g;
        if (drawable != null) {
            if (o6Var == null) {
                this.g = new o6(getContext(), null, 0);
            }
            if (!n(this.g)) {
                b(this.g, true);
            }
        } else if (o6Var != null && n(o6Var)) {
            removeView(this.g);
            this.G.remove(this.g);
        }
        o6 o6Var2 = this.g;
        if (o6Var2 != null) {
            o6Var2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.g == null) {
            this.g = new o6(getContext(), null, 0);
        }
        o6 o6Var = this.g;
        if (o6Var != null) {
            o6Var.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        n6 n6Var = this.f;
        if (n6Var != null) {
            n6Var.setContentDescription(charSequence);
            oi0.w(this.f, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.f)) {
                b(this.f, true);
            }
        } else {
            n6 n6Var = this.f;
            if (n6Var != null && n(n6Var)) {
                removeView(this.f);
                this.G.remove(this.f);
            }
        }
        n6 n6Var2 = this.f;
        if (n6Var2 != null) {
            n6Var2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.c.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.m != i) {
            this.m = i;
            if (i == 0) {
                this.l = getContext();
            } else {
                this.l = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        s7 s7Var = this.e;
        if (!isEmpty) {
            if (s7Var == null) {
                Context context = getContext();
                s7 s7Var2 = new s7(context, null);
                this.e = s7Var2;
                s7Var2.setSingleLine();
                this.e.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.o;
                if (i != 0) {
                    this.e.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.C;
                if (colorStateList != null) {
                    this.e.setTextColor(colorStateList);
                }
            }
            if (!n(this.e)) {
                b(this.e, true);
            }
        } else if (s7Var != null && n(s7Var)) {
            removeView(this.e);
            this.G.remove(this.e);
        }
        s7 s7Var3 = this.e;
        if (s7Var3 != null) {
            s7Var3.setText(charSequence);
        }
        this.A = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.C = colorStateList;
        s7 s7Var = this.e;
        if (s7Var != null) {
            s7Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        s7 s7Var = this.d;
        if (!isEmpty) {
            if (s7Var == null) {
                Context context = getContext();
                s7 s7Var2 = new s7(context, null);
                this.d = s7Var2;
                s7Var2.setSingleLine();
                this.d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.n;
                if (i != 0) {
                    this.d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.d.setTextColor(colorStateList);
                }
            }
            if (!n(this.d)) {
                b(this.d, true);
            }
        } else if (s7Var != null && n(s7Var)) {
            removeView(this.d);
            this.G.remove(this.d);
        }
        s7 s7Var3 = this.d;
        if (s7Var3 != null) {
            s7Var3.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.u = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.t = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        s7 s7Var = this.d;
        if (s7Var != null) {
            s7Var.setTextColor(colorStateList);
        }
    }

    public final void t() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a = lt0.a(this);
            mt0 mt0Var = this.N;
            int i = 0;
            if (mt0Var != null && mt0Var.d != null && a != null && isAttachedToWindow() && this.R) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.Q == null) {
                if (this.P == null) {
                    this.P = lt0.b(new jt0(this, i));
                }
                lt0.c(a, this.P);
                this.Q = a;
                return;
            }
            if (!z && (onBackInvokedDispatcher = this.Q) != null) {
                lt0.d(onBackInvokedDispatcher, this.P);
                this.Q = null;
            }
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(r21.r(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(r21.r(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(r21.r(getContext(), i));
    }

    public void setOnMenuItemClickListener(ot0 ot0Var) {
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
