package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import defpackage.c;
import defpackage.d20;
import defpackage.ez0;
import defpackage.g2;
import defpackage.h2;
import defpackage.i11;
import defpackage.i2;
import defpackage.j01;
import defpackage.j2;
import defpackage.jy0;
import defpackage.k2;
import defpackage.la0;
import defpackage.m11;
import defpackage.mt0;
import defpackage.nn;
import defpackage.r01;
import defpackage.r2;
import defpackage.r21;
import defpackage.rt0;
import defpackage.ry0;
import defpackage.s01;
import defpackage.t01;
import defpackage.u01;
import defpackage.v01;
import defpackage.w01;
import defpackage.w90;
import defpackage.wb0;
import defpackage.x01;
import defpackage.xb0;
import defpackage.y01;
import defpackage.yb0;
import java.util.WeakHashMap;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements wb0, xb0 {
    public static final int[] E = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final m11 F;
    public static final Rect G;
    public final h2 A;
    public final h2 B;
    public final yb0 C;
    public final k2 D;
    public int c;
    public int d;
    public ContentFrameLayout e;
    public ActionBarContainer f;
    public nn g;
    public Drawable h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public final Rect o;
    public final Rect p;
    public final Rect q;
    public final Rect r;
    public m11 s;
    public m11 t;
    public m11 u;
    public m11 v;
    public i2 w;
    public OverScroller x;
    public ViewPropertyAnimator y;
    public final g2 z;

    static {
        y01 r01Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            r01Var = new x01();
        } else if (i >= 35) {
            r01Var = new w01();
        } else if (i >= 34) {
            r01Var = new v01();
        } else if (i >= 31) {
            r01Var = new u01();
        } else if (i >= 30) {
            r01Var = new t01();
        } else if (i >= 29) {
            r01Var = new s01();
        } else {
            r01Var = new r01();
        }
        r01Var.h(d20.b(0, 1, 0, 1));
        F = r01Var.b();
        G = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [yb0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [k2, android.view.View] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        m11 m11Var = m11.b;
        this.s = m11Var;
        this.t = m11Var;
        this.u = m11Var;
        this.v = m11Var;
        this.z = new g2(0, this);
        this.A = new h2(this, 0);
        this.B = new h2(this, 1);
        i(context);
        this.C = new Object();
        ?? view = new View(context);
        view.setWillNotDraw(true);
        this.D = view;
        addView(view);
    }

    public static boolean g(View view, Rect rect, boolean z) {
        boolean z2;
        j2 j2Var = (j2) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) j2Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) j2Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) j2Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) j2Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) j2Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) j2Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) j2Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) j2Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.wb0
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.wb0
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof j2;
    }

    @Override // defpackage.xb0
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.h != null) {
            if (this.f.getVisibility() == 0) {
                i = (int) (this.f.getTranslationY() + this.f.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.h.setBounds(0, i, getWidth(), this.h.getIntrinsicHeight() + i);
            this.h.draw(canvas);
        }
    }

    @Override // defpackage.wb0
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.wb0
    public final boolean f(View view, View view2, int i, int i2) {
        if (i2 == 0 && onStartNestedScroll(view, view2, i)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        yb0 yb0Var = this.C;
        return yb0Var.b | yb0Var.a;
    }

    public CharSequence getTitle() {
        k();
        return ((rt0) this.g).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.A);
        removeCallbacks(this.B);
        ViewPropertyAnimator viewPropertyAnimator = this.y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(E);
        boolean z = false;
        this.c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.h = drawable;
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        this.x = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i != 2) {
            if (i != 5) {
                if (i != 109) {
                    return;
                }
                setOverlayMode(true);
                return;
            } else {
                ((rt0) this.g).getClass();
                Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                return;
            }
        }
        ((rt0) this.g).getClass();
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void k() {
        nn wrapper;
        if (this.e == null) {
            this.e = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof nn) {
                wrapper = (nn) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                c.o("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                return;
            }
            this.g = wrapper;
        }
    }

    public final void l(Menu menu, la0 la0Var) {
        k();
        rt0 rt0Var = (rt0) this.g;
        Toolbar toolbar = rt0Var.a;
        if (rt0Var.m == null) {
            rt0Var.m = new r2(toolbar.getContext());
        }
        r2 r2Var = rt0Var.m;
        r2Var.g = la0Var;
        w90 w90Var = (w90) menu;
        if (w90Var != null || toolbar.c != null) {
            toolbar.f();
            w90 w90Var2 = toolbar.c.r;
            if (w90Var2 == w90Var) {
                return;
            }
            if (w90Var2 != null) {
                w90Var2.r(toolbar.M);
                w90Var2.r(toolbar.N);
            }
            if (toolbar.N == null) {
                toolbar.N = new mt0(toolbar);
            }
            r2Var.s = true;
            Context context = toolbar.l;
            if (w90Var != null) {
                w90Var.b(r2Var, context);
                w90Var.b(toolbar.N, toolbar.l);
            } else {
                r2Var.i(context, null);
                toolbar.N.i(toolbar.l, null);
                r2Var.g();
                toolbar.N.g();
            }
            toolbar.c.setPopupTheme(toolbar.m);
            toolbar.c.setPresenter(r2Var);
            toolbar.M = r2Var;
            toolbar.t();
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        m11 g = m11.g(this, windowInsets);
        boolean g2 = g(this.f, new Rect(g.b(), g.d(), g.c(), g.a()), false);
        WeakHashMap weakHashMap = ry0.a;
        Rect rect = this.o;
        jy0.b(this, g, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        i11 i11Var = g.a;
        m11 p = i11Var.p(i, i2, i3, i4);
        this.s = p;
        boolean z = true;
        if (!this.t.equals(p)) {
            this.t = this.s;
            g2 = true;
        }
        Rect rect2 = this.p;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z = g2;
        }
        if (z) {
            requestLayout();
        }
        return i11Var.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = ry0.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                j2 j2Var = (j2) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) j2Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) j2Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0125  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.k && z) {
            this.x.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.x.getFinalY() > this.f.getHeight()) {
                h();
                this.B.run();
            } else {
                h();
                this.A.run();
            }
            this.l = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.m + i2;
        this.m = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        j01 j01Var;
        ez0 ez0Var;
        this.C.a = i;
        this.m = getActionBarHideOffset();
        h();
        i2 i2Var = this.w;
        if (i2Var != null && (ez0Var = (j01Var = (j01) i2Var).s) != null) {
            ez0Var.a();
            j01Var.s = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) != 0 && this.f.getVisibility() == 0) {
            return this.k;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.k && !this.l) {
            if (this.m <= this.f.getHeight()) {
                h();
                postDelayed(this.A, 600L);
            } else {
                h();
                postDelayed(this.B, 600L);
            }
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z2;
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.n ^ i;
        this.n = i;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        i2 i2Var = this.w;
        if (i2Var != null) {
            j01 j01Var = (j01) i2Var;
            j01Var.o = !z2;
            if (!z && z2) {
                if (!j01Var.p) {
                    j01Var.p = true;
                    j01Var.f(true);
                }
            } else if (j01Var.p) {
                j01Var.p = false;
                j01Var.f(true);
            }
        }
        if ((i2 & 256) != 0 && this.w != null) {
            WeakHashMap weakHashMap = ry0.a;
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.d = i;
        i2 i2Var = this.w;
        if (i2Var != null) {
            ((j01) i2Var).n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f.setTranslationY(-Math.max(0, Math.min(i, this.f.getHeight())));
    }

    public void setActionBarVisibilityCallback(i2 i2Var) {
        this.w = i2Var;
        if (getWindowToken() != null) {
            ((j01) this.w).n = this.d;
            int i = this.n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = ry0.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.k) {
            this.k = z;
            if (!z) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        Drawable drawable;
        k();
        rt0 rt0Var = (rt0) this.g;
        if (i != 0) {
            drawable = r21.r(rt0Var.a.getContext(), i);
        } else {
            drawable = null;
        }
        rt0Var.d = drawable;
        rt0Var.c();
    }

    public void setLogo(int i) {
        Drawable drawable;
        k();
        rt0 rt0Var = (rt0) this.g;
        if (i != 0) {
            drawable = r21.r(rt0Var.a.getContext(), i);
        } else {
            drawable = null;
        }
        rt0Var.e = drawable;
        rt0Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.i = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((rt0) this.g).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        rt0 rt0Var = (rt0) this.g;
        if (!rt0Var.g) {
            Toolbar toolbar = rt0Var.a;
            rt0Var.h = charSequence;
            if ((rt0Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (rt0Var.g) {
                    ry0.n(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        rt0 rt0Var = (rt0) this.g;
        rt0Var.d = drawable;
        rt0Var.c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.wb0
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
    }
}
