package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import defpackage.ai0;
import defpackage.b8;
import defpackage.bi0;
import defpackage.c;
import defpackage.ci0;
import defpackage.d60;
import defpackage.dh0;
import defpackage.di0;
import defpackage.eh0;
import defpackage.f40;
import defpackage.fh0;
import defpackage.fi0;
import defpackage.gh0;
import defpackage.ih0;
import defpackage.io0;
import defpackage.j0;
import defpackage.j3;
import defpackage.jh0;
import defpackage.jp0;
import defpackage.k3;
import defpackage.kh0;
import defpackage.lg0;
import defpackage.lh0;
import defpackage.ly0;
import defpackage.n10;
import defpackage.oh0;
import defpackage.ov;
import defpackage.ph0;
import defpackage.qh0;
import defpackage.qo0;
import defpackage.qz;
import defpackage.r70;
import defpackage.rh0;
import defpackage.ry0;
import defpackage.sh0;
import defpackage.sy0;
import defpackage.sz;
import defpackage.th0;
import defpackage.uh0;
import defpackage.vb0;
import defpackage.vh0;
import defpackage.wh0;
import defpackage.xg;
import defpackage.xh0;
import defpackage.xt0;
import defpackage.xy0;
import defpackage.yb0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] A0 = {R.attr.nestedScrollingEnabled};
    public static final Class[] B0;
    public static final eh0 C0;
    public int A;
    public boolean B;
    public final AccessibilityManager C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public jh0 H;
    public EdgeEffect I;
    public EdgeEffect J;
    public EdgeEffect K;
    public EdgeEffect L;
    public kh0 M;
    public int N;
    public int O;
    public VelocityTracker P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public qh0 V;
    public final int W;
    public final int a0;
    public final float b0;
    public final wh0 c;
    public final float c0;
    public final uh0 d;
    public boolean d0;
    public xh0 e;
    public final ci0 e0;
    public final k3 f;
    public sz f0;
    public final b8 g;
    public final qz g0;
    public final jp0 h;
    public final ai0 h0;
    public boolean i;
    public rh0 i0;
    public final dh0 j;
    public ArrayList j0;
    public final Rect k;
    public boolean k0;
    public final Rect l;
    public boolean l0;
    public final RectF m;
    public final fh0 m0;
    public gh0 n;
    public boolean n0;
    public oh0 o;
    public fi0 o0;
    public final ArrayList p;
    public final int[] p0;
    public final ArrayList q;
    public vb0 q0;
    public final ArrayList r;
    public final int[] r0;
    public ov s;
    public final int[] s0;
    public boolean t;
    public final int[] t0;
    public boolean u;
    public final ArrayList u0;
    public boolean v;
    public final dh0 v0;
    public int w;
    public boolean w0;
    public boolean x;
    public int x0;
    public boolean y;
    public int y0;
    public boolean z;
    public final fh0 z0;

    static {
        Class cls = Integer.TYPE;
        B0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        C0 = new eh0(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [jh0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [kh0, java.lang.Object, bo] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r3v14, types: [qz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [ai0, java.lang.Object] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float a;
        float a2;
        boolean z;
        int i2;
        TypedArray typedArray;
        char c;
        boolean z2;
        char c2;
        AttributeSet attributeSet2;
        int i3;
        int i4;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        this.c = new wh0(this);
        this.d = new uh0(this);
        this.h = new jp0(3);
        this.j = new dh0(this, 0);
        this.k = new Rect();
        this.l = new Rect();
        this.m = new RectF();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.w = 0;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        this.H = new Object();
        ?? obj = new Object();
        obj.a = null;
        obj.b = new ArrayList();
        obj.c = 120L;
        obj.d = 120L;
        obj.e = 250L;
        obj.f = 250L;
        obj.g = true;
        obj.h = new ArrayList();
        obj.i = new ArrayList();
        obj.j = new ArrayList();
        obj.k = new ArrayList();
        obj.l = new ArrayList();
        obj.m = new ArrayList();
        obj.n = new ArrayList();
        obj.o = new ArrayList();
        obj.p = new ArrayList();
        obj.q = new ArrayList();
        obj.r = new ArrayList();
        this.M = obj;
        this.N = 0;
        this.O = -1;
        this.b0 = Float.MIN_VALUE;
        this.c0 = Float.MIN_VALUE;
        this.d0 = true;
        this.e0 = new ci0(this);
        this.g0 = new Object();
        ?? obj2 = new Object();
        obj2.a = -1;
        obj2.b = 0;
        obj2.c = 0;
        obj2.d = 1;
        obj2.e = 0;
        obj2.f = false;
        obj2.g = false;
        obj2.h = false;
        obj2.i = false;
        obj2.j = false;
        obj2.k = false;
        this.h0 = obj2;
        this.k0 = false;
        this.l0 = false;
        fh0 fh0Var = new fh0(this);
        this.m0 = fh0Var;
        this.n0 = false;
        this.p0 = new int[2];
        this.r0 = new int[2];
        this.s0 = new int[2];
        this.t0 = new int[2];
        this.u0 = new ArrayList();
        this.v0 = new dh0(this, 1);
        this.x0 = 0;
        this.y0 = 0;
        this.z0 = new fh0(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.U = viewConfiguration.getScaledTouchSlop();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            Method method = sy0.a;
            a = n10.c(viewConfiguration);
        } else {
            a = sy0.a(viewConfiguration, context);
        }
        this.b0 = a;
        if (i5 >= 26) {
            a2 = n10.d(viewConfiguration);
        } else {
            a2 = sy0.a(viewConfiguration, context);
        }
        this.c0 = a2;
        this.W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        this.M.a = fh0Var;
        this.f = new k3(new fh0(this));
        this.g = new b8(new fh0(this));
        WeakHashMap weakHashMap = ry0.a;
        if (i5 >= 26) {
            i2 = ly0.a(this);
        } else {
            i2 = 0;
        }
        if (i2 == 0 && i5 >= 26) {
            ly0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new fi0(this));
        int[] iArr = lg0.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ry0.l(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.i = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                c = 3;
                c2 = 2;
                i3 = i;
                typedArray = obtainStyledAttributes;
                z2 = 1;
                i4 = 4;
                attributeSet2 = attributeSet;
                new ov(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(svarzee.android.apps.adb_mouse.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(svarzee.android.apps.adb_mouse.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(svarzee.android.apps.adb_mouse.R.dimen.fastscroll_margin));
            } else {
                c.k("Trying to set fast scroller without both required drawables.".concat(y()));
                throw null;
            }
        } else {
            typedArray = obtainStyledAttributes;
            c = 3;
            z2 = 1;
            c2 = 2;
            attributeSet2 = attributeSet;
            i3 = i;
            i4 = 4;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class asSubclass = Class.forName(str, false, classLoader).asSubclass(oh0.class);
                    try {
                        constructor = asSubclass.getConstructor(B0);
                        objArr = new Object[i4];
                        objArr[0] = context;
                        objArr[z2] = attributeSet2;
                        objArr[c2] = Integer.valueOf(i3);
                        objArr[c] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(z2);
                    setLayoutManager((oh0) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    f40.d(attributeSet2.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    f40.d(attributeSet2.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    f40.d(attributeSet2.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    f40.d(attributeSet2.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    f40.d(attributeSet2.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = A0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, iArr2, i3, 0);
        ry0.l(this, context, iArr2, attributeSet2, obtainStyledAttributes2, i3);
        boolean z3 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView D = D(viewGroup.getChildAt(i));
            if (D != null) {
                return D;
            }
        }
        return null;
    }

    public static di0 I(View view) {
        if (view == null) {
            return null;
        }
        return ((ph0) view.getLayoutParams()).a;
    }

    private vb0 getScrollingChildHelper() {
        if (this.q0 == null) {
            this.q0 = new vb0(this);
        }
        return this.q0;
    }

    public static void j(di0 di0Var) {
        WeakReference weakReference = di0Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != di0Var.a) {
                    Object parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            di0Var.b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View A(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A(android.view.View):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.r
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            ov r5 = (defpackage.ov) r5
            int r6 = r5.v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.e(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.d(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.m = r6
        L55:
            r5.g(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.s = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.B(android.view.MotionEvent):boolean");
    }

    public final void C(int[] iArr) {
        b8 b8Var = this.g;
        int x = b8Var.x();
        if (x == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < x; i3++) {
            di0 I = I(b8Var.w(i3));
            if (!I.o()) {
                int b = I.b();
                if (b < i) {
                    i = b;
                }
                if (b > i2) {
                    i2 = b;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final di0 E(int i) {
        di0 di0Var = null;
        if (this.D) {
            return null;
        }
        b8 b8Var = this.g;
        int F = b8Var.F();
        for (int i2 = 0; i2 < F; i2++) {
            di0 I = I(b8Var.E(i2));
            if (I != null && !I.h() && F(I) == i) {
                if (((ArrayList) b8Var.f).contains(I.a)) {
                    di0Var = I;
                } else {
                    return I;
                }
            }
        }
        return di0Var;
    }

    public final int F(di0 di0Var) {
        if ((di0Var.j & 524) == 0 && di0Var.e()) {
            int i = di0Var.c;
            ArrayList arrayList = (ArrayList) this.f.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                j3 j3Var = (j3) arrayList.get(i2);
                int i3 = j3Var.a;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 8) {
                            int i4 = j3Var.b;
                            if (i4 == i) {
                                i = j3Var.d;
                            } else {
                                if (i4 < i) {
                                    i--;
                                }
                                if (j3Var.d <= i) {
                                    i++;
                                }
                            }
                        }
                    } else {
                        int i5 = j3Var.b;
                        if (i5 <= i) {
                            int i6 = j3Var.d;
                            if (i5 + i6 <= i) {
                                i -= i6;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (j3Var.b <= i) {
                    i += j3Var.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long G(di0 di0Var) {
        if (this.n.b) {
            return di0Var.e;
        }
        return di0Var.c;
    }

    public final di0 H(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            f40.i("View ", view, " is not a direct child of ", this);
            return null;
        }
        return I(view);
    }

    public final Rect J(View view) {
        ph0 ph0Var = (ph0) view.getLayoutParams();
        boolean z = ph0Var.c;
        Rect rect = ph0Var.b;
        if (!z || (this.h0.g && (ph0Var.a.k() || ph0Var.a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.k;
            rect2.set(0, 0, 0, 0);
            ((lh0) arrayList.get(i)).a(rect2, view, this);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        ph0Var.c = false;
        return rect;
    }

    public final boolean K() {
        if (this.v && !this.D && !this.f.n()) {
            return false;
        }
        return true;
    }

    public final boolean L() {
        if (this.F > 0) {
            return true;
        }
        return false;
    }

    public final void M(int i) {
        if (this.o == null) {
            return;
        }
        setScrollState(2);
        this.o.o0(i);
        awakenScrollBars();
    }

    public final void N() {
        b8 b8Var = this.g;
        int F = b8Var.F();
        for (int i = 0; i < F; i++) {
            ((ph0) b8Var.E(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.d.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ph0 ph0Var = (ph0) ((di0) arrayList.get(i2)).a.getLayoutParams();
            if (ph0Var != null) {
                ph0Var.c = true;
            }
        }
    }

    public final void O(int i, int i2, boolean z) {
        int i3 = i + i2;
        b8 b8Var = this.g;
        int F = b8Var.F();
        for (int i4 = 0; i4 < F; i4++) {
            di0 I = I(b8Var.E(i4));
            if (I != null && !I.o()) {
                int i5 = I.c;
                ai0 ai0Var = this.h0;
                if (i5 >= i3) {
                    I.l(-i2, z);
                    ai0Var.f = true;
                } else if (i5 >= i) {
                    I.a(8);
                    I.l(-i2, z);
                    I.c = i - 1;
                    ai0Var.f = true;
                }
            }
        }
        uh0 uh0Var = this.d;
        ArrayList arrayList = (ArrayList) uh0Var.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            di0 di0Var = (di0) arrayList.get(size);
            if (di0Var != null) {
                int i6 = di0Var.c;
                if (i6 >= i3) {
                    di0Var.l(-i2, z);
                } else if (i6 >= i) {
                    di0Var.a(8);
                    uh0Var.f(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.F++;
    }

    public final void Q(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.F - 1;
        this.F = i2;
        if (i2 < 1) {
            this.F = 0;
            if (z) {
                int i3 = this.A;
                this.A = 0;
                if (i3 != 0 && (accessibilityManager = this.C) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.u0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    di0 di0Var = (di0) arrayList.get(size);
                    if (di0Var.a.getParent() == this && !di0Var.o() && (i = di0Var.q) != -1) {
                        View view = di0Var.a;
                        WeakHashMap weakHashMap = ry0.a;
                        view.setImportantForAccessibility(i);
                        di0Var.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.O) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.O = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.S = x;
            this.Q = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.T = y;
            this.R = y;
        }
    }

    public final void S() {
        if (!this.n0 && this.t) {
            WeakHashMap weakHashMap = ry0.a;
            postOnAnimation(this.v0);
            this.n0 = true;
        }
    }

    public final void T() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = this.D;
        k3 k3Var = this.f;
        boolean z6 = false;
        if (z5) {
            k3Var.u((ArrayList) k3Var.c);
            k3Var.u((ArrayList) k3Var.d);
            k3Var.a = 0;
            if (this.E) {
                this.o.Y();
            }
        }
        if (this.M != null && this.o.A0()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            k3Var.t();
        } else {
            k3Var.h();
        }
        if (!this.k0 && !this.l0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.v && this.M != null && (((z4 = this.D) || z2 || this.o.f) && (!z4 || this.n.b))) {
            z3 = true;
        } else {
            z3 = false;
        }
        ai0 ai0Var = this.h0;
        ai0Var.j = z3;
        if (z3 && z2 && !this.D && this.M != null && this.o.A0()) {
            z6 = true;
        }
        ai0Var.k = z6;
    }

    public final void U(boolean z) {
        this.E = z | this.E;
        this.D = true;
        b8 b8Var = this.g;
        int F = b8Var.F();
        for (int i = 0; i < F; i++) {
            di0 I = I(b8Var.E(i));
            if (I != null && !I.o()) {
                I.a(6);
            }
        }
        N();
        uh0 uh0Var = this.d;
        ArrayList arrayList = (ArrayList) uh0Var.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            di0 di0Var = (di0) arrayList.get(i2);
            if (di0Var != null) {
                di0Var.a(6);
                di0Var.a(1024);
            }
        }
        gh0 gh0Var = ((RecyclerView) uh0Var.h).n;
        if (gh0Var != null && gh0Var.b) {
            return;
        }
        uh0Var.e();
    }

    public final void V(di0 di0Var, yb0 yb0Var) {
        di0Var.j &= -8193;
        boolean z = this.h0.h;
        jp0 jp0Var = this.h;
        if (z && di0Var.k() && !di0Var.h() && !di0Var.o()) {
            ((r70) jp0Var.e).d(G(di0Var), di0Var);
        }
        io0 io0Var = (io0) jp0Var.d;
        xy0 xy0Var = (xy0) io0Var.get(di0Var);
        if (xy0Var == null) {
            xy0Var = xy0.a();
            io0Var.put(di0Var, xy0Var);
        }
        xy0Var.b = yb0Var;
        xy0Var.a |= 4;
    }

    public final void W(View view, View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.k;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof ph0) {
            ph0 ph0Var = (ph0) layoutParams;
            if (!ph0Var.c) {
                Rect rect2 = ph0Var.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        oh0 oh0Var = this.o;
        boolean z2 = !this.v;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        oh0Var.l0(this, view, this.k, z2, z);
    }

    public final void X() {
        VelocityTracker velocityTracker = this.P;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        e0(0);
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.L.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = ry0.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Y(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void Z(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        di0 di0Var;
        c0();
        P();
        int i5 = xt0.a;
        Trace.beginSection("RV Scroll");
        ai0 ai0Var = this.h0;
        z(ai0Var);
        uh0 uh0Var = this.d;
        if (i != 0) {
            i3 = this.o.n0(i, uh0Var, ai0Var);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.o.p0(i2, uh0Var, ai0Var);
        } else {
            i4 = 0;
        }
        Trace.endSection();
        b8 b8Var = this.g;
        int x = b8Var.x();
        for (int i6 = 0; i6 < x; i6++) {
            View w = b8Var.w(i6);
            di0 H = H(w);
            if (H != null && (di0Var = H.i) != null) {
                View view = di0Var.a;
                int left = w.getLeft();
                int top = w.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        d0(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public final void a0(int i) {
        d60 d60Var;
        if (this.y) {
            return;
        }
        setScrollState(0);
        ci0 ci0Var = this.e0;
        ci0Var.i.removeCallbacks(ci0Var);
        ci0Var.e.abortAnimation();
        oh0 oh0Var = this.o;
        if (oh0Var != null && (d60Var = oh0Var.e) != null) {
            d60Var.i();
        }
        oh0 oh0Var2 = this.o;
        if (oh0Var2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oh0Var2.o0(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        oh0 oh0Var = this.o;
        if (oh0Var != null) {
            oh0Var.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(int i, int i2, boolean z) {
        oh0 oh0Var = this.o;
        if (oh0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.y) {
            int i3 = 0;
            if (!oh0Var.d()) {
                i = 0;
            }
            if (!this.o.e()) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return;
            }
            if (z) {
                if (i != 0) {
                    i3 = 1;
                }
                if (i2 != 0) {
                    i3 |= 2;
                }
                getScrollingChildHelper().g(i3, 1);
            }
            this.e0.b(i, i2, Integer.MIN_VALUE, null);
        }
    }

    public final void c0() {
        int i = this.w + 1;
        this.w = i;
        if (i == 1 && !this.y) {
            this.x = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof ph0) && this.o.f((ph0) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        oh0 oh0Var = this.o;
        if (oh0Var != null && oh0Var.d()) {
            return this.o.j(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        oh0 oh0Var = this.o;
        if (oh0Var != null && oh0Var.d()) {
            return this.o.k(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        oh0 oh0Var = this.o;
        if (oh0Var != null && oh0Var.d()) {
            return this.o.l(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        oh0 oh0Var = this.o;
        if (oh0Var != null && oh0Var.e()) {
            return this.o.m(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        oh0 oh0Var = this.o;
        if (oh0Var != null && oh0Var.e()) {
            return this.o.n(this.h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        oh0 oh0Var = this.o;
        if (oh0Var != null && oh0Var.e()) {
            return this.o.o(this.h0);
        }
        return 0;
    }

    public final void d0(boolean z) {
        if (this.w < 1) {
            this.w = 1;
        }
        if (!z && !this.y) {
            this.x = false;
        }
        if (this.w == 1) {
            if (z && this.x && !this.y && this.o != null && this.n != null) {
                o();
            }
            if (!this.y) {
                this.x = false;
            }
        }
        this.w--;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        super.draw(canvas);
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ((lh0) arrayList.get(i3)).c(canvas, this);
        }
        EdgeEffect edgeEffect = this.I;
        boolean z5 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.i) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i2, 0.0f);
            EdgeEffect edgeEffect2 = this.I;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z = true;
            } else {
                z = false;
            }
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.i) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.J;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.i) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i, -width);
            EdgeEffect edgeEffect6 = this.K;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.i) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if (z || this.M == null || arrayList.size() <= 0 || !this.M.f()) {
            z5 = z;
        }
        if (z5) {
            WeakHashMap weakHashMap = ry0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0(int i) {
        getScrollingChildHelper().h(i);
    }

    public final void f(di0 di0Var) {
        boolean z;
        View view = di0Var.a;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.d.k(H(view));
        boolean j = di0Var.j();
        b8 b8Var = this.g;
        if (j) {
            b8Var.n(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            b8Var.m(view, -1, true);
            return;
        }
        int indexOfChild = ((fh0) b8Var.d).a.indexOfChild(view);
        if (indexOfChild >= 0) {
            ((xg) b8Var.e).h(indexOfChild);
            b8Var.H(view);
        } else {
            c.r(view, "view is not a child, cannot hide ");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0186, code lost:
    
        if (r5 < 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018e, code lost:
    
        if ((r5 * r6) <= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0196, code lost:
    
        if ((r5 * r6) >= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0160, code lost:
    
        if (r7 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0180, code lost:
    
        if (r5 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0183, code lost:
    
        if (r7 < 0) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00db  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(lh0 lh0Var) {
        oh0 oh0Var = this.o;
        if (oh0Var != null) {
            oh0Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.q;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(lh0Var);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        oh0 oh0Var = this.o;
        if (oh0Var != null) {
            return oh0Var.r();
        }
        c.o("RecyclerView has no LayoutManager".concat(y()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        oh0 oh0Var = this.o;
        if (oh0Var != null) {
            return oh0Var.s(getContext(), attributeSet);
        }
        c.o("RecyclerView has no LayoutManager".concat(y()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public gh0 getAdapter() {
        return this.n;
    }

    @Override // android.view.View
    public int getBaseline() {
        oh0 oh0Var = this.o;
        if (oh0Var != null) {
            oh0Var.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.i;
    }

    public fi0 getCompatAccessibilityDelegate() {
        return this.o0;
    }

    public jh0 getEdgeEffectFactory() {
        return this.H;
    }

    public kh0 getItemAnimator() {
        return this.M;
    }

    public int getItemDecorationCount() {
        return this.q.size();
    }

    public oh0 getLayoutManager() {
        return this.o;
    }

    public int getMaxFlingVelocity() {
        return this.a0;
    }

    public int getMinFlingVelocity() {
        return this.W;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public qh0 getOnFlingListener() {
        return this.V;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.d0;
    }

    public th0 getRecycledViewPool() {
        return this.d.c();
    }

    public int getScrollState() {
        return this.N;
    }

    public final void h(rh0 rh0Var) {
        if (this.j0 == null) {
            this.j0 = new ArrayList();
        }
        this.j0.add(rh0Var);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str == null) {
                c.o("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(y()));
                return;
            } else {
                c.o(str);
                return;
            }
        }
        if (this.G > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.t;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.y;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        b8 b8Var = this.g;
        int F = b8Var.F();
        for (int i = 0; i < F; i++) {
            di0 I = I(b8Var.E(i));
            if (!I.o()) {
                I.d = -1;
                I.g = -1;
            }
        }
        uh0 uh0Var = this.d;
        ArrayList arrayList = (ArrayList) uh0Var.c;
        ArrayList arrayList2 = (ArrayList) uh0Var.e;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            di0 di0Var = (di0) arrayList2.get(i2);
            di0Var.d = -1;
            di0Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            di0 di0Var2 = (di0) arrayList.get(i3);
            di0Var2.d = -1;
            di0Var2.g = -1;
        }
        ArrayList arrayList3 = (ArrayList) uh0Var.d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                di0 di0Var3 = (di0) ((ArrayList) uh0Var.d).get(i4);
                di0Var3.d = -1;
                di0Var3.g = -1;
            }
        }
    }

    public final void l(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.I.onRelease();
            z = this.I.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.K.onRelease();
            z |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.J.onRelease();
            z |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.L.onRelease();
            z |= this.L.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = ry0.a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        if (this.v && !this.D) {
            k3 k3Var = this.f;
            if (k3Var.n()) {
                int i = k3Var.a;
                if ((i & 4) != 0 && (i & 11) == 0) {
                    int i2 = xt0.a;
                    Trace.beginSection("RV PartialInvalidate");
                    c0();
                    P();
                    k3Var.t();
                    if (!this.x) {
                        b8 b8Var = this.g;
                        int x = b8Var.x();
                        int i3 = 0;
                        while (true) {
                            if (i3 < x) {
                                di0 I = I(b8Var.w(i3));
                                if (I != null && !I.o() && I.k()) {
                                    o();
                                    break;
                                }
                                i3++;
                            } else {
                                k3Var.g();
                                break;
                            }
                        }
                    }
                    d0(true);
                    Q(true);
                    Trace.endSection();
                    return;
                }
                if (k3Var.n()) {
                    int i4 = xt0.a;
                    Trace.beginSection("RV FullInvalidate");
                    o();
                    Trace.endSection();
                    return;
                }
                return;
            }
            return;
        }
        int i5 = xt0.a;
        Trace.beginSection("RV FullInvalidate");
        o();
        Trace.endSection();
    }

    public final void n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = ry0.a;
        setMeasuredDimension(oh0.g(i, paddingRight, getMinimumWidth()), oh0.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x035c, code lost:
    
        if (((java.util.ArrayList) r7.f).contains(getFocusedChild()) == false) goto L227;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ff  */
    /* JADX WARN: Type inference failed for: r14v7, types: [yb0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [sz, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.F = r0
            r1 = 1
            r5.t = r1
            boolean r2 = r5.v
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.v = r2
            oh0 r2 = r5.o
            if (r2 == 0) goto L21
            r2.g = r1
            r2.R(r5)
        L21:
            r5.n0 = r0
            java.lang.ThreadLocal r0 = defpackage.sz.g
            java.lang.Object r1 = r0.get()
            sz r1 = (defpackage.sz) r1
            r5.f0 = r1
            if (r1 != 0) goto L6b
            sz r1 = new sz
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.c = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f = r2
            r5.f0 = r1
            java.util.WeakHashMap r1 = defpackage.ry0.a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5d
            if (r1 == 0) goto L5d
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5d
            goto L5f
        L5d:
            r1 = 1114636288(0x42700000, float:60.0)
        L5f:
            sz r2 = r5.f0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.e = r3
            r0.set(r2)
        L6b:
            sz r0 = r5.f0
            java.util.ArrayList r0 = r0.c
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        d60 d60Var;
        super.onDetachedFromWindow();
        kh0 kh0Var = this.M;
        if (kh0Var != null) {
            kh0Var.e();
        }
        setScrollState(0);
        ci0 ci0Var = this.e0;
        ci0Var.i.removeCallbacks(ci0Var);
        ci0Var.e.abortAnimation();
        oh0 oh0Var = this.o;
        if (oh0Var != null && (d60Var = oh0Var.e) != null) {
            d60Var.i();
        }
        this.t = false;
        oh0 oh0Var2 = this.o;
        if (oh0Var2 != null) {
            oh0Var2.g = false;
            oh0Var2.S(this);
        }
        this.u0.clear();
        removeCallbacks(this.v0);
        this.h.getClass();
        do {
        } while (xy0.d.a() != null);
        sz szVar = this.f0;
        if (szVar != null) {
            szVar.c.remove(this);
            this.f0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((lh0) arrayList.get(i)).b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.y) {
            this.s = null;
            if (B(motionEvent)) {
                X();
                setScrollState(0);
                return true;
            }
            oh0 oh0Var = this.o;
            if (oh0Var != null) {
                boolean d = oh0Var.d();
                boolean e = this.o.e();
                if (this.P == null) {
                    this.P = VelocityTracker.obtain();
                }
                this.P.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked != 5) {
                                    if (actionMasked == 6) {
                                        R(motionEvent);
                                    }
                                } else {
                                    this.O = motionEvent.getPointerId(actionIndex);
                                    int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
                                    this.S = x;
                                    this.Q = x;
                                    int y = (int) (motionEvent.getY(actionIndex) + 0.5f);
                                    this.T = y;
                                    this.R = y;
                                }
                            } else {
                                X();
                                setScrollState(0);
                            }
                        } else {
                            int findPointerIndex = motionEvent.findPointerIndex(this.O);
                            if (findPointerIndex < 0) {
                                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.O + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                            if (this.N != 1) {
                                int i = x2 - this.Q;
                                int i2 = y2 - this.R;
                                if (d != 0 && Math.abs(i) > this.U) {
                                    this.S = x2;
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (e && Math.abs(i2) > this.U) {
                                    this.T = y2;
                                    z = true;
                                }
                                if (z) {
                                    setScrollState(1);
                                }
                            }
                        }
                    } else {
                        this.P.clear();
                        e0(0);
                    }
                } else {
                    if (this.z) {
                        this.z = false;
                    }
                    this.O = motionEvent.getPointerId(0);
                    int x3 = (int) (motionEvent.getX() + 0.5f);
                    this.S = x3;
                    this.Q = x3;
                    int y3 = (int) (motionEvent.getY() + 0.5f);
                    this.T = y3;
                    this.R = y3;
                    if (this.N == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        e0(1);
                    }
                    int[] iArr = this.s0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i3 = d;
                    if (e) {
                        i3 = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i3, 0);
                }
                if (this.N == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = xt0.a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.v = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        oh0 oh0Var = this.o;
        if (oh0Var == null) {
            n(i, i2);
            return;
        }
        boolean L = oh0Var.L();
        boolean z = false;
        ai0 ai0Var = this.h0;
        if (L) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.o.b.n(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.w0 = z;
            if (!z && this.n != null) {
                if (ai0Var.d == 1) {
                    p();
                }
                this.o.r0(i, i2);
                ai0Var.i = true;
                q();
                this.o.t0(i, i2);
                if (this.o.w0()) {
                    this.o.r0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    ai0Var.i = true;
                    q();
                    this.o.t0(i, i2);
                }
                this.x0 = getMeasuredWidth();
                this.y0 = getMeasuredHeight();
                return;
            }
            return;
        }
        if (this.u) {
            this.o.b.n(i, i2);
            return;
        }
        if (this.B) {
            c0();
            P();
            T();
            Q(true);
            if (ai0Var.k) {
                ai0Var.g = true;
            } else {
                this.f.h();
                ai0Var.g = false;
            }
            this.B = false;
            d0(false);
        } else if (ai0Var.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        gh0 gh0Var = this.n;
        if (gh0Var != null) {
            ai0Var.e = gh0Var.a();
        } else {
            ai0Var.e = 0;
        }
        c0();
        this.o.b.n(i, i2);
        d0(false);
        ai0Var.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof xh0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        xh0 xh0Var = (xh0) parcelable;
        this.e = xh0Var;
        super.onRestoreInstanceState(xh0Var.c);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xh0, android.os.Parcelable, j0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? j0Var = new j0(super.onSaveInstanceState());
        xh0 xh0Var = this.e;
        if (xh0Var != null) {
            j0Var.e = xh0Var.e;
            return j0Var;
        }
        oh0 oh0Var = this.o;
        if (oh0Var != null) {
            j0Var.e = oh0Var.f0();
            return j0Var;
        }
        j0Var.e = null;
        return j0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.L = null;
        this.J = null;
        this.K = null;
        this.I = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x0402, code lost:
    
        if (r2 < r5) goto L196;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020d  */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instructions count: 1189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v6, types: [yb0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [yb0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    public final void q() {
        boolean z;
        c0();
        P();
        ai0 ai0Var = this.h0;
        ai0Var.a(6);
        this.f.h();
        ai0Var.e = this.n.a();
        ai0Var.c = 0;
        if (this.e != null) {
            gh0 gh0Var = this.n;
            int C = qo0.C(gh0Var.c);
            if (C == 1 ? gh0Var.a() > 0 : C != 2) {
                Parcelable parcelable = this.e.e;
                if (parcelable != null) {
                    this.o.e0(parcelable);
                }
                this.e = null;
            }
        }
        ai0Var.g = false;
        this.o.c0(this.d, ai0Var);
        ai0Var.f = false;
        if (ai0Var.j && this.M != null) {
            z = true;
        } else {
            z = false;
        }
        ai0Var.j = z;
        ai0Var.d = 4;
        Q(true);
        d0(false);
    }

    public final boolean r(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        di0 I = I(view);
        if (I != null) {
            if (I.j()) {
                I.j &= -257;
            } else if (!I.o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + I + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        d60 d60Var = this.o.e;
        if ((d60Var == null || !d60Var.e) && !L() && view2 != null) {
            W(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.o.l0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ov) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.w == 0 && !this.y) {
            super.requestLayout();
        } else {
            this.x = true;
        }
    }

    public final void s(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        oh0 oh0Var = this.o;
        if (oh0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.y) {
            boolean d = oh0Var.d();
            boolean e = this.o.e();
            if (!d && !e) {
                return;
            }
            if (!d) {
                i = 0;
            }
            if (!e) {
                i2 = 0;
            }
            Y(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i;
        if (L()) {
            int i2 = 0;
            if (accessibilityEvent != null) {
                i = accessibilityEvent.getContentChangeTypes();
            } else {
                i = 0;
            }
            if (i != 0) {
                i2 = i;
            }
            this.A |= i2;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(fi0 fi0Var) {
        this.o0 = fi0Var;
        ry0.m(this, fi0Var);
    }

    public void setAdapter(gh0 gh0Var) {
        setLayoutFrozen(false);
        gh0 gh0Var2 = this.n;
        wh0 wh0Var = this.c;
        if (gh0Var2 != null) {
            gh0Var2.a.unregisterObserver(wh0Var);
            this.n.getClass();
        }
        kh0 kh0Var = this.M;
        if (kh0Var != null) {
            kh0Var.e();
        }
        oh0 oh0Var = this.o;
        uh0 uh0Var = this.d;
        if (oh0Var != null) {
            oh0Var.h0(uh0Var);
            this.o.i0(uh0Var);
        }
        ((ArrayList) uh0Var.c).clear();
        uh0Var.e();
        k3 k3Var = this.f;
        k3Var.u((ArrayList) k3Var.c);
        k3Var.u((ArrayList) k3Var.d);
        k3Var.a = 0;
        gh0 gh0Var3 = this.n;
        this.n = gh0Var;
        if (gh0Var != null) {
            gh0Var.a.registerObserver(wh0Var);
        }
        oh0 oh0Var2 = this.o;
        if (oh0Var2 != null) {
            oh0Var2.Q();
        }
        gh0 gh0Var4 = this.n;
        ((ArrayList) uh0Var.c).clear();
        uh0Var.e();
        th0 c = uh0Var.c();
        if (gh0Var3 != null) {
            c.b--;
        }
        if (c.b == 0) {
            SparseArray sparseArray = c.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((sh0) sparseArray.valueAt(i)).a.clear();
            }
        }
        if (gh0Var4 != null) {
            c.b++;
        }
        this.h0.f = true;
        U(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(ih0 ih0Var) {
        if (ih0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.i) {
            this.L = null;
            this.J = null;
            this.K = null;
            this.I = null;
        }
        this.i = z;
        super.setClipToPadding(z);
        if (this.v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(jh0 jh0Var) {
        jh0Var.getClass();
        this.H = jh0Var;
        this.L = null;
        this.J = null;
        this.K = null;
        this.I = null;
    }

    public void setHasFixedSize(boolean z) {
        this.u = z;
    }

    public void setItemAnimator(kh0 kh0Var) {
        kh0 kh0Var2 = this.M;
        if (kh0Var2 != null) {
            kh0Var2.e();
            this.M.a = null;
        }
        this.M = kh0Var;
        if (kh0Var != null) {
            kh0Var.a = this.m0;
        }
    }

    public void setItemViewCacheSize(int i) {
        uh0 uh0Var = this.d;
        uh0Var.a = i;
        uh0Var.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(oh0 oh0Var) {
        RecyclerView recyclerView;
        d60 d60Var;
        if (oh0Var == this.o) {
            return;
        }
        setScrollState(0);
        ci0 ci0Var = this.e0;
        ci0Var.i.removeCallbacks(ci0Var);
        ci0Var.e.abortAnimation();
        oh0 oh0Var2 = this.o;
        if (oh0Var2 != null && (d60Var = oh0Var2.e) != null) {
            d60Var.i();
        }
        oh0 oh0Var3 = this.o;
        uh0 uh0Var = this.d;
        if (oh0Var3 != null) {
            kh0 kh0Var = this.M;
            if (kh0Var != null) {
                kh0Var.e();
            }
            this.o.h0(uh0Var);
            this.o.i0(uh0Var);
            ((ArrayList) uh0Var.c).clear();
            uh0Var.e();
            if (this.t) {
                oh0 oh0Var4 = this.o;
                oh0Var4.g = false;
                oh0Var4.S(this);
            }
            this.o.u0(null);
            this.o = null;
        } else {
            ((ArrayList) uh0Var.c).clear();
            uh0Var.e();
        }
        b8 b8Var = this.g;
        ((xg) b8Var.e).g();
        ArrayList arrayList = (ArrayList) b8Var.f;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((fh0) b8Var.d).a;
            if (size < 0) {
                break;
            }
            di0 I = I((View) arrayList.get(size));
            if (I != null) {
                int i = I.p;
                if (recyclerView.L()) {
                    I.q = i;
                    recyclerView.u0.add(I);
                } else {
                    View view = I.a;
                    WeakHashMap weakHashMap = ry0.a;
                    view.setImportantForAccessibility(i);
                }
                I.p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.o = oh0Var;
        if (oh0Var != null) {
            if (oh0Var.b == null) {
                oh0Var.u0(this);
                if (this.t) {
                    oh0 oh0Var5 = this.o;
                    oh0Var5.g = true;
                    oh0Var5.R(this);
                }
            } else {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(oh0Var);
                String y = oh0Var.b.y();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(y);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        uh0Var.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            c.k("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        vb0 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = ry0.a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(qh0 qh0Var) {
        this.V = qh0Var;
    }

    @Deprecated
    public void setOnScrollListener(rh0 rh0Var) {
        this.i0 = rh0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.d0 = z;
    }

    public void setRecycledViewPool(th0 th0Var) {
        uh0 uh0Var = this.d;
        if (((th0) uh0Var.g) != null) {
            r0.b--;
        }
        uh0Var.g = th0Var;
        if (th0Var != null && ((RecyclerView) uh0Var.h).getAdapter() != null) {
            ((th0) uh0Var.g).b++;
        }
    }

    public void setScrollState(int i) {
        d60 d60Var;
        if (i != this.N) {
            this.N = i;
            if (i != 2) {
                ci0 ci0Var = this.e0;
                ci0Var.i.removeCallbacks(ci0Var);
                ci0Var.e.abortAnimation();
                oh0 oh0Var = this.o;
                if (oh0Var != null && (d60Var = oh0Var.e) != null) {
                    d60Var.i();
                }
            }
            oh0 oh0Var2 = this.o;
            if (oh0Var2 != null) {
                oh0Var2.g0(i);
            }
            rh0 rh0Var = this.i0;
            if (rh0Var != null) {
                rh0Var.a(i);
            }
            ArrayList arrayList = this.j0;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((rh0) this.j0.get(size)).a(i);
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.U = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.U = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(bi0 bi0Var) {
        this.d.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        d60 d60Var;
        if (z != this.y) {
            i("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.y = false;
                if (this.x && this.o != null && this.n != null) {
                    requestLayout();
                }
                this.x = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.y = true;
            this.z = true;
            setScrollState(0);
            ci0 ci0Var = this.e0;
            ci0Var.i.removeCallbacks(ci0Var);
            ci0Var.e.abortAnimation();
            oh0 oh0Var = this.o;
            if (oh0Var != null && (d60Var = oh0Var.e) != null) {
                d60Var.i();
            }
        }
    }

    public final void t(int i, int i2) {
        this.G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        rh0 rh0Var = this.i0;
        if (rh0Var != null) {
            rh0Var.b(this, i, i2);
        }
        ArrayList arrayList = this.j0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((rh0) this.j0.get(size)).b(this, i, i2);
            }
        }
        this.G--;
    }

    public final void u() {
        if (this.L != null) {
            return;
        }
        this.H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.L = edgeEffect;
        if (this.i) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.I != null) {
            return;
        }
        this.H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.I = edgeEffect;
        if (this.i) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.K != null) {
            return;
        }
        this.H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.K = edgeEffect;
        if (this.i) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.J != null) {
            return;
        }
        this.H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.J = edgeEffect;
        if (this.i) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.n + ", layout:" + this.o + ", context:" + getContext();
    }

    public final void z(ai0 ai0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.e0.e;
            overScroller.getFinalX();
            overScroller.getCurrX();
            ai0Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        ai0Var.getClass();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        oh0 oh0Var = this.o;
        if (oh0Var != null) {
            return oh0Var.t(layoutParams);
        }
        c.o("RecyclerView has no LayoutManager".concat(y()));
        return null;
    }

    @Deprecated
    public void setRecyclerListener(vh0 vh0Var) {
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, svarzee.android.apps.adb_mouse.R.attr.recyclerViewStyle);
    }
}
