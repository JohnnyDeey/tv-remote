package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.c;
import defpackage.ee0;
import defpackage.fe0;
import defpackage.hg0;
import defpackage.i81;
import defpackage.io0;
import defpackage.j0;
import defpackage.jy0;
import defpackage.l3;
import defpackage.m11;
import defpackage.ry0;
import defpackage.sk;
import defpackage.tk;
import defpackage.uk;
import defpackage.vk;
import defpackage.wb0;
import defpackage.wk;
import defpackage.wy0;
import defpackage.xb0;
import defpackage.xk;
import defpackage.yb0;
import defpackage.yk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements wb0, xb0 {
    public static final String v;
    public static final Class[] w;
    public static final ThreadLocal x;
    public static final yk y;
    public static final fe0 z;
    public final ArrayList c;
    public final l3 d;
    public final ArrayList e;
    public final ArrayList f;
    public final int[] g;
    public final int[] h;
    public boolean i;
    public boolean j;
    public final int[] k;
    public View l;
    public View m;
    public wk n;
    public boolean o;
    public m11 p;
    public boolean q;
    public Drawable r;
    public ViewGroup.OnHierarchyChangeListener s;
    public i81 t;
    public final yb0 u;

    static {
        String str;
        Package r0 = CoordinatorLayout.class.getPackage();
        if (r0 != null) {
            str = r0.getName();
        } else {
            str = null;
        }
        v = str;
        y = new yk(0);
        w = new Class[]{Context.class, AttributeSet.class};
        x = new ThreadLocal();
        z = new fe0();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [yb0, java.lang.Object] */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.c = new ArrayList();
        this.d = new l3(5);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new int[2];
        this.h = new int[2];
        this.u = new Object();
        int[] iArr = hg0.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.k = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.k[i] = (int) (r1[i] * f);
            }
        }
        this.r = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new uk(this));
        WeakHashMap weakHashMap = ry0.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) z.a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void l(int i, Rect rect, Rect rect2, vk vkVar, int i2, int i3) {
        int width;
        int height;
        int i4 = vkVar.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = vkVar.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            if (i8 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            if (i9 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i6 != 1) {
            if (i6 != 5) {
                width -= i2;
            }
        } else {
            width -= i2 / 2;
        }
        if (i7 != 16) {
            if (i7 != 80) {
                height -= i3;
            }
        } else {
            height -= i3 / 2;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public static vk n(View view) {
        vk vkVar = (vk) view.getLayoutParams();
        if (!vkVar.b) {
            tk tkVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                tkVar = (tk) cls.getAnnotation(tk.class);
                if (tkVar != null) {
                    break;
                }
            }
            if (tkVar != null) {
                try {
                    sk skVar = (sk) tkVar.value().getDeclaredConstructor(null).newInstance(null);
                    sk skVar2 = vkVar.a;
                    if (skVar2 != skVar) {
                        if (skVar2 != null) {
                            skVar2.e();
                        }
                        vkVar.a = skVar;
                        vkVar.b = true;
                        if (skVar != null) {
                            skVar.c(vkVar);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + tkVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            vkVar.b = true;
        }
        return vkVar;
    }

    public static void u(View view, int i) {
        vk vkVar = (vk) view.getLayoutParams();
        int i2 = vkVar.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = ry0.a;
            view.offsetLeftAndRight(i - i2);
            vkVar.i = i;
        }
    }

    public static void v(View view, int i) {
        vk vkVar = (vk) view.getLayoutParams();
        int i2 = vkVar.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = ry0.a;
            view.offsetTopAndBottom(i - i2);
            vkVar.j = i;
        }
    }

    @Override // defpackage.wb0
    public final void a(View view, View view2, int i, int i2) {
        yb0 yb0Var = this.u;
        if (i2 == 1) {
            yb0Var.b = i;
        } else {
            yb0Var.a = i;
        }
        this.m = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((vk) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // defpackage.wb0
    public final void b(View view, int i) {
        yb0 yb0Var = this.u;
        if (i == 1) {
            yb0Var.b = 0;
        } else {
            yb0Var.a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            vk vkVar = (vk) childAt.getLayoutParams();
            if (vkVar.a(i)) {
                sk skVar = vkVar.a;
                if (skVar != null) {
                    skVar.p(childAt, view, i);
                }
                if (i != 0) {
                    if (i == 1) {
                        vkVar.n = false;
                    }
                } else {
                    vkVar.m = false;
                }
            }
        }
        this.m = null;
    }

    @Override // defpackage.wb0
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
        sk skVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                vk vkVar = (vk) childAt.getLayoutParams();
                if (vkVar.a(i3) && (skVar = vkVar.a) != null) {
                    int[] iArr2 = this.g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    skVar.j(this, childAt, view, i, i2, iArr2, i3);
                    if (i > 0) {
                        min = Math.max(i4, iArr2[0]);
                    } else {
                        min = Math.min(i4, iArr2[0]);
                    }
                    i4 = min;
                    if (i2 > 0) {
                        min2 = Math.max(i5, iArr2[1]);
                    } else {
                        min2 = Math.min(i5, iArr2[1]);
                    }
                    i5 = min2;
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof vk) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.xb0
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        sk skVar;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        boolean z2 = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                vk vkVar = (vk) childAt.getLayoutParams();
                if (vkVar.a(i5) && (skVar = vkVar.a) != null) {
                    int[] iArr2 = this.g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    skVar.k(this, childAt, i2, i3, i4, iArr2);
                    if (i3 > 0) {
                        i6 = Math.max(i6, iArr2[0]);
                    } else {
                        i6 = Math.min(i6, iArr2[0]);
                    }
                    if (i4 > 0) {
                        i7 = Math.max(i7, iArr2[1]);
                    } else {
                        i7 = Math.min(i7, iArr2[1]);
                    }
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z2) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        sk skVar = ((vk) view.getLayoutParams()).a;
        if (skVar != null) {
            skVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z2;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.r;
        if (drawable != null && drawable.isStateful()) {
            z2 = drawable.setState(drawableState);
        } else {
            z2 = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // defpackage.wb0
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        d(view, i, i2, i3, i4, 0, this.h);
    }

    @Override // defpackage.wb0
    public final boolean f(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                vk vkVar = (vk) childAt.getLayoutParams();
                sk skVar = vkVar.a;
                if (skVar != null) {
                    boolean o = skVar.o(childAt, i, i2);
                    z2 |= o;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            vkVar.n = o;
                        }
                    } else {
                        vkVar.m = o;
                    }
                } else if (i2 != 0) {
                    if (i2 == 1) {
                        vkVar.n = false;
                    }
                } else {
                    vkVar.m = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new vk();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof vk) {
            return new vk((vk) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new vk((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new vk(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.c);
    }

    public final m11 getLastWindowInsets() {
        return this.p;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        yb0 yb0Var = this.u;
        return yb0Var.b | yb0Var.a;
    }

    public Drawable getStatusBarBackground() {
        return this.r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(vk vkVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) vkVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) vkVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) vkVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) vkVar).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final void i(View view, Rect rect, boolean z2) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z2) {
                k(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public final ArrayList j(View view) {
        io0 io0Var = (io0) this.d.d;
        int i = io0Var.e;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) io0Var.i(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(io0Var.f(i2));
            }
        }
        ArrayList arrayList3 = this.f;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = wy0.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = wy0.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        wy0.a(this, view, matrix);
        ThreadLocal threadLocal3 = wy0.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i) {
        int[] iArr = this.k;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i, int i2) {
        fe0 fe0Var = z;
        Rect g = g();
        k(view, g);
        try {
            return g.contains(i, i2);
        } finally {
            g.setEmpty();
            fe0Var.c(g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.o) {
            if (this.n == null) {
                this.n = new wk(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.n);
        }
        if (this.p == null) {
            WeakHashMap weakHashMap = ry0.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.j = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.o && this.n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.n);
        }
        View view = this.m;
        if (view != null) {
            b(view, 0);
        }
        this.j = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.q && this.r != null) {
            m11 m11Var = this.p;
            if (m11Var != null) {
                i = m11Var.d();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.r.setBounds(0, 0, getWidth(), i);
                this.r.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return r;
        }
        t(true);
        return r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        sk skVar;
        WeakHashMap weakHashMap = ry0.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((skVar = ((vk) view.getLayoutParams()).a) == null || !skVar.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0189  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                vk vkVar = (vk) childAt.getLayoutParams();
                if (vkVar.a(0)) {
                    sk skVar = vkVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        sk skVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                vk vkVar = (vk) childAt.getLayoutParams();
                if (vkVar.a(0) && (skVar = vkVar.a) != null) {
                    z2 |= skVar.i(view);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        c(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        e(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof xk)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        xk xkVar = (xk) parcelable;
        super.onRestoreInstanceState(xkVar.c);
        SparseArray sparseArray = xkVar.e;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            sk skVar = n(childAt).a;
            if (id != -1 && skVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                skVar.m(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xk, android.os.Parcelable, j0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n;
        ?? j0Var = new j0(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            sk skVar = ((vk) childAt.getLayoutParams()).a;
            if (id != -1 && skVar != null && (n = skVar.n(childAt)) != null) {
                sparseArray.append(id, n);
            }
        }
        j0Var.e = sparseArray;
        return j0Var;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.l
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.l
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            vk r6 = (defpackage.vk) r6
            sk r6 = r6.a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.l
            boolean r6 = r6.q(r7, r1)
        L2a:
            android.view.View r7 = r0.l
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.t(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r23) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i) {
        Rect g;
        Rect g2;
        int i2;
        vk vkVar = (vk) view.getLayoutParams();
        View view2 = vkVar.k;
        if (view2 == null && vkVar.f != -1) {
            c.o("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        fe0 fe0Var = z;
        if (view2 != null) {
            g = g();
            g2 = g();
            try {
                k(view2, g);
                vk vkVar2 = (vk) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, g, g2, vkVar2, measuredWidth, measuredHeight);
                h(vkVar2, g2, measuredWidth, measuredHeight);
                view.layout(g2.left, g2.top, g2.right, g2.bottom);
                return;
            } finally {
                g.setEmpty();
                fe0Var.c(g);
                g2.setEmpty();
                fe0Var.c(g2);
            }
        }
        int i3 = vkVar.e;
        if (i3 >= 0) {
            vk vkVar3 = (vk) view.getLayoutParams();
            int i4 = vkVar3.c;
            if (i4 == 0) {
                i4 = 8388661;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
            int i5 = absoluteGravity & 7;
            int i6 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i == 1) {
                i3 = width - i3;
            }
            int m = m(i3) - measuredWidth2;
            if (i5 != 1) {
                if (i5 == 5) {
                    m += measuredWidth2;
                }
            } else {
                m += measuredWidth2 / 2;
            }
            if (i6 != 16) {
                if (i6 != 80) {
                    i2 = 0;
                } else {
                    i2 = measuredHeight2;
                }
            } else {
                i2 = measuredHeight2 / 2;
            }
            int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) vkVar3).leftMargin, Math.min(m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) vkVar3).rightMargin));
            int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) vkVar3).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) vkVar3).bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        vk vkVar4 = (vk) view.getLayoutParams();
        g = g();
        g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) vkVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) vkVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) vkVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) vkVar4).bottomMargin);
        if (this.p != null) {
            WeakHashMap weakHashMap = ry0.a;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                g.left = this.p.b() + g.left;
                g.top = this.p.d() + g.top;
                g.right -= this.p.c();
                g.bottom -= this.p.a();
            }
        }
        g2 = g();
        int i7 = vkVar4.c;
        if ((i7 & 7) == 0) {
            i7 |= 8388611;
        }
        if ((i7 & 112) == 0) {
            i7 |= 48;
        }
        Gravity.apply(i7, view.getMeasuredWidth(), view.getMeasuredHeight(), g, g2, i);
        view.layout(g2.left, g2.top, g2.right, g2.bottom);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.e;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i3);
            } else {
                i2 = i3;
            }
            arrayList.add(getChildAt(i2));
        }
        yk ykVar = y;
        if (ykVar != null) {
            Collections.sort(arrayList, ykVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            sk skVar = ((vk) view.getLayoutParams()).a;
            if (z2 && actionMasked != 0) {
                if (skVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i != 0) {
                        if (i == 1) {
                            skVar.q(view, motionEvent2);
                        }
                    } else {
                        skVar.f(this, view, motionEvent2);
                    }
                }
            } else if (!z2 && skVar != null) {
                if (i != 0) {
                    if (i == 1) {
                        z2 = skVar.q(view, motionEvent);
                    }
                } else {
                    z2 = skVar.f(this, view, motionEvent);
                }
                if (z2) {
                    this.l = view;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        sk skVar = ((vk) view.getLayoutParams()).a;
        if (skVar != null) {
            skVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2 && !this.i) {
            t(false);
            this.i = true;
        }
    }

    public final void s() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        l3 l3Var = this.d;
        io0 io0Var = (io0) l3Var.d;
        ee0 ee0Var = (ee0) l3Var.g;
        io0 io0Var2 = (io0) l3Var.d;
        int i = io0Var.e;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) io0Var.i(i2);
            if (arrayList2 != null) {
                arrayList2.clear();
                ee0Var.c(arrayList2);
            }
        }
        io0Var.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            vk n = n(childAt);
            int i4 = n.f;
            if (i4 == -1) {
                n.l = null;
                n.k = null;
            } else {
                View view = n.k;
                if (view != null && view.getId() == i4) {
                    View view2 = n.k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent != null && parent != childAt) {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        } else {
                            n.l = null;
                            n.k = null;
                        }
                    }
                    n.l = view2;
                }
                View findViewById = findViewById(i4);
                n.k = findViewById;
                if (findViewById != null) {
                    if (findViewById == this) {
                        if (isInEditMode()) {
                            n.l = null;
                            n.k = null;
                        } else {
                            c.o("View can not be anchored to the the parent CoordinatorLayout");
                            return;
                        }
                    } else {
                        for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 == childAt) {
                                if (isInEditMode()) {
                                    n.l = null;
                                    n.k = null;
                                } else {
                                    c.o("Anchor must not be a descendant of the anchored view");
                                    return;
                                }
                            } else {
                                if (parent2 instanceof View) {
                                    findViewById = parent2;
                                }
                            }
                        }
                        n.l = findViewById;
                    }
                } else if (isInEditMode()) {
                    n.l = null;
                    n.k = null;
                } else {
                    throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i4) + " to anchor view " + childAt);
                }
            }
            if (!io0Var2.containsKey(childAt)) {
                io0Var2.put(childAt, null);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i3) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2 != n.l) {
                        WeakHashMap weakHashMap = ry0.a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((vk) childAt2.getLayoutParams()).g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n.h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            sk skVar = n.a;
                            if (skVar != null) {
                                skVar.b(childAt);
                            }
                        }
                    }
                    if (!io0Var2.containsKey(childAt2) && !io0Var2.containsKey(childAt2)) {
                        io0Var2.put(childAt2, null);
                    }
                    if (io0Var2.containsKey(childAt2) && io0Var2.containsKey(childAt)) {
                        ArrayList arrayList3 = (ArrayList) io0Var2.get(childAt2);
                        if (arrayList3 == null) {
                            arrayList3 = (ArrayList) ee0Var.a();
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            io0Var2.put(childAt2, arrayList3);
                        }
                        arrayList3.add(childAt);
                    } else {
                        c.k("All nodes must be present in the graph before being added as an edge");
                        return;
                    }
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) l3Var.e;
        arrayList4.clear();
        HashSet hashSet = (HashSet) l3Var.f;
        hashSet.clear();
        int i6 = io0Var2.e;
        for (int i7 = 0; i7 < i6; i7++) {
            l3Var.c(io0Var2.f(i7), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.s = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z2;
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.r = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.r.setState(getDrawableState());
                }
                Drawable drawable4 = this.r;
                WeakHashMap weakHashMap = ry0.a;
                drawable4.setLayoutDirection(getLayoutDirection());
                Drawable drawable5 = this.r;
                if (getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawable5.setVisible(z2, false);
                this.r.setCallback(this);
            }
            WeakHashMap weakHashMap2 = ry0.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = getContext().getDrawable(i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z2;
        super.setVisibility(i);
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable = this.r;
        if (drawable != null && drawable.isVisible() != z2) {
            this.r.setVisible(z2, false);
        }
    }

    public final void t(boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            sk skVar = ((vk) childAt.getLayoutParams()).a;
            if (skVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    skVar.f(this, childAt, obtain);
                } else {
                    skVar.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((vk) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.l = null;
        this.i = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.r) {
            return false;
        }
        return true;
    }

    public final void w() {
        WeakHashMap weakHashMap = ry0.a;
        if (getFitsSystemWindows()) {
            if (this.t == null) {
                this.t = new i81(15, this);
            }
            jy0.c(this, this.t);
            setSystemUiVisibility(1280);
            return;
        }
        jy0.c(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new vk(getContext(), attributeSet);
    }
}
