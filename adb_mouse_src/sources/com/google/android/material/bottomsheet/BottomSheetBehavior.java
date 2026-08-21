package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ae;
import defpackage.b;
import defpackage.c;
import defpackage.e1;
import defpackage.e20;
import defpackage.f1;
import defpackage.f61;
import defpackage.jp0;
import defpackage.jy0;
import defpackage.k20;
import defpackage.k7;
import defpackage.k90;
import defpackage.l01;
import defpackage.m01;
import defpackage.m1;
import defpackage.m90;
import defpackage.mg0;
import defpackage.n01;
import defpackage.on0;
import defpackage.qo0;
import defpackage.ry0;
import defpackage.sk;
import defpackage.ty0;
import defpackage.vk;
import defpackage.wv0;
import defpackage.xd;
import defpackage.yd;
import defpackage.zd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends sk {
    public final b A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public final boolean L;
    public boolean M;
    public int N;
    public ty0 O;
    public boolean P;
    public int Q;
    public boolean R;
    public final float S;
    public int T;
    public int U;
    public int V;
    public WeakReference W;
    public WeakReference X;
    public final ArrayList Y;
    public VelocityTracker Z;
    public final int a;
    public int a0;
    public boolean b;
    public int b0;
    public final float c;
    public boolean c0;
    public final int d;
    public HashMap d0;
    public int e;
    public final SparseIntArray e0;
    public boolean f;
    public final zd f0;
    public int g;
    public final int h;
    public final m90 i;
    public final ColorStateList j;
    public final int k;
    public final int l;
    public int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final on0 y;
    public boolean z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 0;
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new b(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.b0 = -1;
        this.e0 = new SparseIntArray();
        this.f0 = new zd(this, i2);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mg0.b);
        if (obtainStyledAttributes.hasValue(3)) {
            this.j = k20.w(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(22)) {
            this.y = on0.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        on0 on0Var = this.y;
        if (on0Var != null) {
            m90 m90Var = new m90(on0Var);
            this.i = m90Var;
            m90Var.k(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.B = ofFloat;
        ofFloat.setDuration(500L);
        this.B.addUpdateListener(new xd(i2, this));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(10);
        if (peekValue != null && (i = peekValue.data) == -1) {
            A(i);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        boolean z = obtainStyledAttributes.getBoolean(9, false);
        if (this.I != z) {
            this.I = z;
            if (!z && this.N == 5) {
                B(4);
            }
            F();
        }
        this.n = obtainStyledAttributes.getBoolean(14, false);
        boolean z2 = obtainStyledAttributes.getBoolean(7, true);
        if (this.b != z2) {
            this.b = z2;
            if (this.W != null) {
                r();
            }
            C((this.b && this.N == 6) ? 3 : this.N);
            G(this.N, true);
            F();
        }
        this.J = obtainStyledAttributes.getBoolean(13, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.L = obtainStyledAttributes.getBoolean(5, true);
        this.a = obtainStyledAttributes.getInt(11, 0);
        float f = obtainStyledAttributes.getFloat(8, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.F = f;
            if (this.W != null) {
                this.E = (int) ((1.0f - f) * this.V);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i3 = peekValue2.data;
                if (i3 >= 0) {
                    this.C = i3;
                    G(this.N, true);
                } else {
                    c.k("offset must be greater than or equal to 0");
                    throw null;
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    G(this.N, true);
                } else {
                    c.k("offset must be greater than or equal to 0");
                    throw null;
                }
            }
            this.d = obtainStyledAttributes.getInt(12, 500);
            this.o = obtainStyledAttributes.getBoolean(18, false);
            this.p = obtainStyledAttributes.getBoolean(19, false);
            this.q = obtainStyledAttributes.getBoolean(20, false);
            this.r = obtainStyledAttributes.getBoolean(21, true);
            this.s = obtainStyledAttributes.getBoolean(15, false);
            this.t = obtainStyledAttributes.getBoolean(16, false);
            this.u = obtainStyledAttributes.getBoolean(17, false);
            this.x = obtainStyledAttributes.getBoolean(24, true);
            obtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        c.k("ratio must be a float value between 0 and 1");
        throw null;
    }

    public static View v(View view) {
        if (view.getVisibility() == 0) {
            if (view.isNestedScrollingEnabled()) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View v = v(viewGroup.getChildAt(i));
                    if (v != null) {
                        return v;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static int w(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
    }

    public final void A(int i) {
        boolean z = this.f;
        if (i == -1) {
            if (!z) {
                this.f = true;
            } else {
                return;
            }
        } else {
            if (!z && this.e == i) {
                return;
            }
            this.f = false;
            this.e = Math.max(0, i);
        }
        I();
    }

    public final void B(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2) {
            if (!this.I && i == 5) {
                Log.w("BottomSheetBehavior", "Cannot set state: " + i);
                return;
            }
            if (i == 6 && this.b && y(i) <= this.D) {
                i2 = 3;
            } else {
                i2 = i;
            }
            WeakReference weakReference = this.W;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.W.get();
                k7 k7Var = new k7(this, view, i2);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                    view.post(k7Var);
                    return;
                } else {
                    k7Var.run();
                    return;
                }
            }
            C(i);
            return;
        }
        StringBuilder sb = new StringBuilder("STATE_");
        if (i == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(qo0.s(sb, str, " should not be set externally."));
    }

    public final void C(int i) {
        if (this.N != i) {
            this.N = i;
            if (i != 4 && i != 3 && i != 6) {
                boolean z = this.I;
            }
            WeakReference weakReference = this.W;
            if (weakReference == null || ((View) weakReference.get()) == null) {
                return;
            }
            if (i == 3) {
                H(true);
            } else if (i == 6 || i == 5 || i == 4) {
                H(false);
            }
            G(i, true);
            ArrayList arrayList = this.Y;
            if (arrayList.size() <= 0) {
                F();
            } else {
                arrayList.get(0).getClass();
                c.a();
            }
        }
    }

    public final boolean D(View view, float f) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        if (Math.abs(((f * this.S) + view.getTop()) - this.G) / t() > 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        C(2);
        G(r4, true);
        r2.A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.y(r4)
            ty0 r1 = r2.O
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.r
            if (r5 == 0) goto L30
            r5 = 0
            r1.r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.C(r3)
            r3 = 1
            r2.G(r4, r3)
            b r2 = r2.A
            r2.a(r4)
            return
        L40:
            r2.C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, boolean):void");
    }

    public final void F() {
        View view;
        int i;
        boolean z;
        f1 f1Var;
        WeakReference weakReference = this.W;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            ry0.j(view, 524288);
            ry0.h(view, 0);
            ry0.j(view, 262144);
            ry0.h(view, 0);
            ry0.j(view, 1048576);
            ry0.h(view, 0);
            SparseIntArray sparseIntArray = this.e0;
            int i2 = sparseIntArray.get(0, -1);
            if (i2 != -1) {
                ry0.j(view, i2);
                ry0.h(view, 0);
                sparseIntArray.delete(0);
            }
            int i3 = 6;
            if (!this.b && this.N != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                f61 f61Var = new f61(i3, this);
                ArrayList f = ry0.f(view);
                int i4 = 0;
                while (true) {
                    if (i4 < f.size()) {
                        if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((m1) f.get(i4)).a).getLabel())) {
                            i = ((m1) f.get(i4)).a();
                            break;
                        }
                        i4++;
                    } else {
                        int i5 = 0;
                        int i6 = -1;
                        while (true) {
                            int[] iArr = ry0.d;
                            if (i5 >= 32 || i6 != -1) {
                                break;
                            }
                            int i7 = iArr[i5];
                            boolean z2 = true;
                            for (int i8 = 0; i8 < f.size(); i8++) {
                                if (((m1) f.get(i8)).a() != i7) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                z2 &= z;
                            }
                            if (z2) {
                                i6 = i7;
                            }
                            i5++;
                        }
                        i = i6;
                    }
                }
                if (i != -1) {
                    m1 m1Var = new m1(null, i, string, f61Var, null);
                    View.AccessibilityDelegate d = ry0.d(view);
                    if (d == null) {
                        f1Var = null;
                    } else if (d instanceof e1) {
                        f1Var = ((e1) d).a;
                    } else {
                        f1Var = new f1(d);
                    }
                    if (f1Var == null) {
                        f1Var = new f1();
                    }
                    ry0.m(view, f1Var);
                    ry0.j(view, m1Var.a());
                    ry0.f(view).add(m1Var);
                    ry0.h(view, 0);
                }
                sparseIntArray.put(0, i);
            }
            if (this.I) {
                int i9 = 5;
                if (this.N != 5) {
                    ry0.k(view, m1.j, new f61(i9, this));
                }
            }
            int i10 = this.N;
            int i11 = 4;
            int i12 = 3;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 == 6) {
                        ry0.k(view, m1.i, new f61(i11, this));
                        ry0.k(view, m1.h, new f61(i12, this));
                        return;
                    }
                    return;
                }
                if (this.b) {
                    i3 = 3;
                }
                ry0.k(view, m1.h, new f61(i3, this));
                return;
            }
            if (this.b) {
                i3 = 4;
            }
            ry0.k(view, m1.i, new f61(i3, this));
        }
    }

    public final void G(int i, boolean z) {
        boolean z2;
        m90 m90Var;
        if (i != 2) {
            if (this.N == 3 && (this.x || z())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.z != z2 && (m90Var = this.i) != null) {
                this.z = z2;
                ValueAnimator valueAnimator = this.B;
                float f = 1.0f;
                if (z && valueAnimator != null) {
                    if (valueAnimator.isRunning()) {
                        valueAnimator.reverse();
                        return;
                    }
                    float f2 = m90Var.d.j;
                    if (z2) {
                        f = s();
                    }
                    valueAnimator.setFloatValues(f2, f);
                    valueAnimator.start();
                    return;
                }
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                if (this.z) {
                    f = s();
                }
                k90 k90Var = m90Var.d;
                if (k90Var.j != f) {
                    k90Var.j = f;
                    m90Var.h = true;
                    m90Var.i = true;
                    m90Var.invalidateSelf();
                }
            }
        }
    }

    public final void H(boolean z) {
        WeakReference weakReference = this.W;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.d0 == null) {
                        this.d0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.W.get() && z) {
                        this.d0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z) {
                    this.d0 = null;
                }
            }
        }
    }

    public final void I() {
        View view;
        if (this.W != null) {
            r();
            if (this.N == 4 && (view = (View) this.W.get()) != null) {
                view.requestLayout();
            }
        }
    }

    @Override // defpackage.sk
    public final void c(vk vkVar) {
        this.W = null;
        this.O = null;
    }

    @Override // defpackage.sk
    public final void e() {
        this.W = null;
        this.O = null;
    }

    @Override // defpackage.sk
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        View view2;
        int i;
        ty0 ty0Var;
        if (view.isShown() && this.K) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.a0 = -1;
                this.b0 = -1;
                VelocityTracker velocityTracker = this.Z;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.Z = null;
                }
            }
            if (this.Z == null) {
                this.Z = VelocityTracker.obtain();
            }
            this.Z.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.c0 = false;
                    this.a0 = -1;
                    if (this.P) {
                        this.P = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                this.b0 = y;
                if (this.N != 2) {
                    WeakReference weakReference = this.X;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.o(view2, x, y)) {
                        this.a0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.c0 = true;
                    }
                }
                if (this.a0 == -1 && !coordinatorLayout.o(view, x, this.b0)) {
                    z = true;
                } else {
                    z = false;
                }
                this.P = z;
            }
            if (this.P || (ty0Var = this.O) == null || !ty0Var.p(motionEvent)) {
                WeakReference weakReference2 = this.X;
                if (weakReference2 != null) {
                    view3 = (View) weakReference2.get();
                }
                if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i = this.b0) == -1 || Math.abs(i - motionEvent.getY()) <= this.O.b) {
                    return false;
                }
            }
            return true;
        }
        this.P = true;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [jz0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    @Override // defpackage.sk
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        boolean z;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 4;
        if (this.W == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29 && !this.n && !this.f) {
                z = true;
            } else {
                z = false;
            }
            if (this.o || this.p || this.q || this.s || this.t || this.u || z) {
                yd ydVar = new yd(this, z);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                ?? obj = new Object();
                obj.a = paddingStart;
                obj.b = paddingEnd;
                obj.c = paddingBottom;
                jp0 jp0Var = new jp0(ydVar, i2, obj);
                WeakHashMap weakHashMap = ry0.a;
                jy0.c(view, jp0Var);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new Object());
                }
            }
            e20 e20Var = new e20(view);
            WeakHashMap weakHashMap2 = ry0.a;
            if (i3 >= 30) {
                view.setWindowInsetsAnimationCallback(new n01(e20Var));
            } else {
                PathInterpolator pathInterpolator = m01.e;
                l01 l01Var = new l01(view, e20Var);
                view.setTag(R.id.tag_window_insets_animation_callback, l01Var);
                if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
                    view.setOnApplyWindowInsetsListener(l01Var);
                }
            }
            this.W = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            wv0.U(context, R.attr.motionDurationMedium2, 300);
            wv0.U(context, R.attr.motionDurationShort3, 150);
            wv0.U(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            m90 m90Var = this.i;
            if (m90Var != null) {
                view.setBackground(m90Var);
                float f = this.H;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                m90Var.m(f);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new ty0(coordinatorLayout.getContext(), coordinatorLayout, this.f0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int i4 = this.V;
        int i5 = i4 - height;
        int i6 = this.w;
        if (i5 < i6) {
            boolean z2 = this.r;
            int i7 = this.l;
            if (z2) {
                if (i7 != -1) {
                    i4 = Math.min(i4, i7);
                }
                this.T = i4;
            } else {
                int i8 = i4 - i6;
                if (i7 != -1) {
                    i8 = Math.min(i8, i7);
                }
                this.T = i8;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * this.V);
        r();
        int i9 = this.N;
        if (i9 == 3) {
            int x = x();
            WeakHashMap weakHashMap3 = ry0.a;
            view.offsetTopAndBottom(x);
        } else if (i9 == 6) {
            int i10 = this.E;
            WeakHashMap weakHashMap4 = ry0.a;
            view.offsetTopAndBottom(i10);
        } else if (this.I && i9 == 5) {
            int i11 = this.V;
            WeakHashMap weakHashMap5 = ry0.a;
            view.offsetTopAndBottom(i11);
        } else if (i9 == 4) {
            int i12 = this.G;
            WeakHashMap weakHashMap6 = ry0.a;
            view.offsetTopAndBottom(i12);
        } else if (i9 == 1 || i9 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap7 = ry0.a;
            view.offsetTopAndBottom(top2);
        }
        G(this.N, false);
        this.X = new WeakReference(v(view));
        ArrayList arrayList = this.Y;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        c.a();
        return false;
    }

    @Override // defpackage.sk
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.k, marginLayoutParams.width), w(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.sk
    public final boolean i(View view) {
        WeakReference weakReference = this.X;
        if (weakReference != null && view == weakReference.get() && this.N != 3 && !this.M) {
            return true;
        }
        return false;
    }

    @Override // defpackage.sk
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        View view3;
        if (i3 != 1) {
            WeakReference weakReference = this.X;
            if (weakReference != null) {
                view3 = (View) weakReference.get();
            } else {
                view3 = null;
            }
            if (view2 == view3) {
                int top = view.getTop();
                int i4 = top - i2;
                boolean z = this.K;
                boolean z2 = this.L;
                if (i2 > 0) {
                    if (!this.R && !z2 && view2 == view3 && view2.canScrollVertically(1)) {
                        this.M = true;
                        return;
                    }
                    if (i4 < x()) {
                        int x = top - x();
                        iArr[1] = x;
                        WeakHashMap weakHashMap = ry0.a;
                        view.offsetTopAndBottom(-x);
                        C(3);
                    } else if (z) {
                        iArr[1] = i2;
                        WeakHashMap weakHashMap2 = ry0.a;
                        view.offsetTopAndBottom(-i2);
                        C(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0) {
                    boolean canScrollVertically = view2.canScrollVertically(-1);
                    if (!this.R && !z2 && view2 == view3 && canScrollVertically) {
                        this.M = true;
                        return;
                    }
                    if (!canScrollVertically) {
                        int i5 = this.G;
                        if (i4 > i5 && !this.I) {
                            int i6 = top - i5;
                            iArr[1] = i6;
                            WeakHashMap weakHashMap3 = ry0.a;
                            view.offsetTopAndBottom(-i6);
                            C(4);
                        } else {
                            if (!z) {
                                return;
                            }
                            iArr[1] = i2;
                            WeakHashMap weakHashMap4 = ry0.a;
                            view.offsetTopAndBottom(-i2);
                            C(1);
                        }
                    }
                }
                u(view.getTop());
                this.Q = i2;
                this.R = true;
                this.M = false;
            }
        }
    }

    @Override // defpackage.sk
    public final void m(View view, Parcelable parcelable) {
        ae aeVar = (ae) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = aeVar.f;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = aeVar.g;
            }
            if (i == -1 || (i & 4) == 4) {
                this.I = aeVar.h;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = aeVar.i;
            }
        }
        int i2 = aeVar.e;
        if (i2 != 1 && i2 != 2) {
            this.N = i2;
        } else {
            this.N = 4;
        }
    }

    @Override // defpackage.sk
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new ae(this);
    }

    @Override // defpackage.sk
    public final boolean o(View view, int i, int i2) {
        this.Q = 0;
        this.R = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.D) < java.lang.Math.abs(r5 - r3.G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.E) < java.lang.Math.abs(r5 - r3.G)) goto L50;
     */
    @Override // defpackage.sk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.x()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.C(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.X
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.R
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.Q
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.Z
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.Z
            int r0 = r3.a0
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.D(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.Q
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.b
            if (r2 == 0) goto L74
            int r6 = r3.D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.E
            if (r5 >= r2) goto L83
            int r0 = r3.G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.E(r4, r1, r5)
            r3.R = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(android.view.View, android.view.View, int):void");
    }

    @Override // defpackage.sk
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.N;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        ty0 ty0Var = this.O;
        boolean z = this.K;
        if (ty0Var != null && (z || i == 1)) {
            ty0Var.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.a0 = -1;
            this.b0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (this.O != null && ((z || this.N == 1) && actionMasked == 2 && !this.P)) {
            float abs = Math.abs(this.b0 - motionEvent.getY());
            ty0 ty0Var2 = this.O;
            if (abs > ty0Var2.b) {
                ty0Var2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.P;
    }

    public final void r() {
        int t = t();
        boolean z = this.b;
        int i = this.V;
        if (z) {
            this.G = Math.max(i - t, this.D);
        } else {
            this.G = i - t;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float s() {
        /*
            r5 = this;
            r0 = 0
            m90 r1 = r5.i
            if (r1 == 0) goto L85
            java.lang.ref.WeakReference r2 = r5.W
            if (r2 == 0) goto L85
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L85
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L85
            java.lang.ref.WeakReference r2 = r5.W
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            boolean r5 = r5.z()
            if (r5 == 0) goto L85
            android.view.WindowInsets r5 = r2.getRootWindowInsets()
            if (r5 == 0) goto L85
            float[] r2 = r1.D
            if (r2 == 0) goto L31
            r3 = 3
            r2 = r2[r3]
            goto L3f
        L31:
            k90 r2 = r1.d
            on0 r2 = r2.a
            al r2 = r2.e
            android.graphics.RectF r3 = r1.g()
            float r2 = r2.a(r3)
        L3f:
            android.view.RoundedCorner r3 = defpackage.wd.o(r5)
            if (r3 == 0) goto L54
            int r3 = defpackage.wd.d(r3)
            float r3 = (float) r3
            int r4 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r4 <= 0) goto L54
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L54
            float r3 = r3 / r2
            goto L55
        L54:
            r3 = r0
        L55:
            float[] r2 = r1.D
            if (r2 == 0) goto L5d
            r1 = 0
            r1 = r2[r1]
            goto L6b
        L5d:
            k90 r2 = r1.d
            on0 r2 = r2.a
            al r2 = r2.f
            android.graphics.RectF r1 = r1.g()
            float r1 = r2.a(r1)
        L6b:
            android.view.RoundedCorner r5 = defpackage.wd.u(r5)
            if (r5 == 0) goto L80
            int r5 = defpackage.wd.d(r5)
            float r5 = (float) r5
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L80
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L80
            float r0 = r5 / r1
        L80:
            float r5 = java.lang.Math.max(r3, r0)
            return r5
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.s():float");
    }

    public final int t() {
        int i;
        int i2;
        int i3;
        if (this.f) {
            i = Math.min(Math.max(this.g, this.V - ((this.U * 9) / 16)), this.T);
            i2 = this.v;
        } else {
            if (!this.n && !this.o && (i3 = this.m) > 0) {
                return Math.max(this.e, i3 + this.h);
            }
            i = this.e;
            i2 = this.v;
        }
        return i + i2;
    }

    public final void u(int i) {
        if (((View) this.W.get()) != null) {
            ArrayList arrayList = this.Y;
            if (!arrayList.isEmpty()) {
                int i2 = this.G;
                if (i <= i2 && i2 != x()) {
                    x();
                }
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    c.a();
                }
            }
        }
    }

    public final int x() {
        int i;
        if (this.b) {
            return this.D;
        }
        if (this.r) {
            i = 0;
        } else {
            i = this.w;
        }
        return Math.max(this.C, i);
    }

    public final int y(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return this.E;
                    }
                    c.k(qo0.m("Invalid state to get top offset: ", i));
                    return 0;
                }
                return this.V;
            }
            return this.G;
        }
        return x();
    }

    public final boolean z() {
        WeakReference weakReference = this.W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.W.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new b(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.b0 = -1;
        this.e0 = new SparseIntArray();
        this.f0 = new zd(this, 0);
    }

    @Override // defpackage.sk
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
