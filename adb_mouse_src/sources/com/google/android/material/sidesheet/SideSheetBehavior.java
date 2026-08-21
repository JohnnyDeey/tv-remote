package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import defpackage.b;
import defpackage.c;
import defpackage.c2;
import defpackage.do0;
import defpackage.g50;
import defpackage.k0;
import defpackage.k20;
import defpackage.m1;
import defpackage.m90;
import defpackage.mg0;
import defpackage.mi0;
import defpackage.nn0;
import defpackage.on0;
import defpackage.qo0;
import defpackage.ry0;
import defpackage.sk;
import defpackage.ty0;
import defpackage.vk;
import defpackage.wv0;
import defpackage.zd;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends sk {
    public mi0 a;
    public final m90 b;
    public final ColorStateList c;
    public final on0 d;
    public final b e;
    public final float f;
    public final boolean g;
    public int h;
    public ty0 i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public int t;
    public final LinkedHashSet u;
    public final zd v;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new b(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new zd(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mg0.B);
        if (obtainStyledAttributes.hasValue(3)) {
            this.c = k20.w(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = on0.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        on0 on0Var = this.d;
        if (on0Var != null) {
            m90 m90Var = new m90(on0Var);
            this.b = m90Var;
            m90Var.k(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.sk
    public final void c(vk vkVar) {
        this.p = null;
        this.i = null;
    }

    @Override // defpackage.sk
    public final void e() {
        this.p = null;
        this.i = null;
    }

    @Override // defpackage.sk
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ty0 ty0Var;
        VelocityTracker velocityTracker;
        if ((view.isShown() || ry0.e(view) != null) && this.g) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.s) != null) {
                velocityTracker.recycle();
                this.s = null;
            }
            if (this.s == null) {
                this.s = VelocityTracker.obtain();
            }
            this.s.addMovement(motionEvent);
            if (actionMasked != 0) {
                if ((actionMasked == 1 || actionMasked == 3) && this.j) {
                    this.j = false;
                    return false;
                }
            } else {
                this.t = (int) motionEvent.getX();
            }
            if (!this.j && (ty0Var = this.i) != null && ty0Var.p(motionEvent)) {
                return true;
            }
            return false;
        }
        this.j = true;
        return false;
    }

    @Override // defpackage.sk
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View view2;
        View view3;
        int i3;
        int y;
        int i4;
        View findViewById;
        int i5;
        int i6 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.p;
        m90 m90Var = this.b;
        int i7 = 0;
        if (weakReference == null) {
            this.p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            wv0.U(context, R.attr.motionDurationMedium2, 300);
            wv0.U(context, R.attr.motionDurationShort3, 150);
            wv0.U(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (m90Var != null) {
                view.setBackground(m90Var);
                float f = this.f;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                m90Var.m(f);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = ry0.a;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            if (this.h == 5) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (ry0.e(view) == null) {
                ry0.n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (Gravity.getAbsoluteGravity(((vk) view.getLayoutParams()).c, i) == 3) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        mi0 mi0Var = this.a;
        if (mi0Var == null || mi0Var.A() != i2) {
            vk vkVar = null;
            on0 on0Var = this.d;
            if (i2 == 0) {
                this.a = new g50(this, i6);
                if (on0Var != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof vk)) {
                        vkVar = (vk) view3.getLayoutParams();
                    }
                    if (vkVar == null || ((ViewGroup.MarginLayoutParams) vkVar).rightMargin <= 0) {
                        nn0 f2 = on0Var.f();
                        f2.f = new k0(0.0f);
                        f2.g = new k0(0.0f);
                        on0 a = f2.a();
                        if (m90Var != null) {
                            m90Var.setShapeAppearanceModel(a);
                        }
                    }
                }
            } else if (i2 == 1) {
                this.a = new g50(this, i7);
                if (on0Var != null) {
                    WeakReference weakReference3 = this.p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof vk)) {
                        vkVar = (vk) view2.getLayoutParams();
                    }
                    if (vkVar == null || ((ViewGroup.MarginLayoutParams) vkVar).leftMargin <= 0) {
                        nn0 f3 = on0Var.f();
                        f3.e = new k0(0.0f);
                        f3.h = new k0(0.0f);
                        on0 a2 = f3.a();
                        if (m90Var != null) {
                            m90Var.setShapeAppearanceModel(a2);
                        }
                    }
                }
            } else {
                c.k(qo0.n("Invalid sheet edge position value: ", i2, ". Must be 0 or 1."));
                return false;
            }
        }
        if (this.i == null) {
            this.i = new ty0(coordinatorLayout.getContext(), coordinatorLayout, this.v);
        }
        int y2 = this.a.y(view);
        coordinatorLayout.q(view, i);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.z(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            i3 = this.a.b(marginLayoutParams);
        } else {
            i3 = 0;
        }
        this.o = i3;
        int i8 = this.h;
        if (i8 != 1 && i8 != 2) {
            if (i8 != 3) {
                if (i8 == 5) {
                    y = this.a.v();
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.h);
                }
            } else {
                y = 0;
            }
        } else {
            y = y2 - this.a.y(view);
        }
        WeakHashMap weakHashMap2 = ry0.a;
        view.offsetLeftAndRight(y);
        if (this.q == null && (i4 = this.r) != -1 && (findViewById = coordinatorLayout.findViewById(i4)) != null) {
            this.q = new WeakReference(findViewById);
        }
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                c.a();
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.sk
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.sk
    public final void m(View view, Parcelable parcelable) {
        int i = ((do0) parcelable).e;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // defpackage.sk
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new do0(this);
    }

    @Override // defpackage.sk
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.j && s()) {
            float abs = Math.abs(this.t - motionEvent.getX());
            ty0 ty0Var = this.i;
            if (abs > ty0Var.b) {
                ty0Var.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void r(int i) {
        View view;
        int i2;
        if (this.h != i) {
            this.h = i;
            WeakReference weakReference = this.p;
            if (weakReference == null || (view = (View) weakReference.get()) == null) {
                return;
            }
            if (this.h == 5) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            if (view.getVisibility() != i2) {
                view.setVisibility(i2);
            }
            Iterator it = this.u.iterator();
            if (!it.hasNext()) {
                u();
                return;
            }
            throw qo0.l(it);
        }
    }

    public final boolean s() {
        if (this.i != null) {
            if (this.g || this.h == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        r(2);
        r2.e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L17
            r0 = 5
            if (r4 != r0) goto Ld
            mi0 r0 = r2.a
            int r0 = r0.v()
            goto L1d
        Ld:
            java.lang.String r2 = "Invalid state to get outer edge offset: "
            java.lang.String r2 = defpackage.qo0.m(r2, r4)
            defpackage.c.k(r2)
            return
        L17:
            mi0 r0 = r2.a
            int r0 = r0.t()
        L1d:
            ty0 r1 = r2.i
            if (r1 == 0) goto L55
            if (r5 == 0) goto L2e
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L55
            goto L4b
        L2e:
            int r5 = r3.getTop()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L49
            int r5 = r1.a
            if (r5 != 0) goto L49
            android.view.View r5 = r1.r
            if (r5 == 0) goto L49
            r5 = 0
            r1.r = r5
        L49:
            if (r3 == 0) goto L55
        L4b:
            r3 = 2
            r2.r(r3)
            b r2 = r2.e
            r2.a(r4)
            return
        L55:
            r2.r(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            ry0.j(view, 262144);
            ry0.h(view, 0);
            ry0.j(view, 1048576);
            ry0.h(view, 0);
            final int i = 5;
            if (this.h != 5) {
                ry0.k(view, m1.j, new c2() { // from class: co0
                    @Override // defpackage.c2
                    public final boolean a(View view2) {
                        String str;
                        int i2 = i;
                        int i3 = 1;
                        if (i2 != 1 && i2 != 2) {
                            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                            WeakReference weakReference2 = sideSheetBehavior.p;
                            if (weakReference2 != null && weakReference2.get() != null) {
                                View view3 = (View) sideSheetBehavior.p.get();
                                oj0 oj0Var = new oj0(i2, i3, sideSheetBehavior);
                                ViewParent parent = view3.getParent();
                                if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                                    view3.post(oj0Var);
                                    return true;
                                }
                                oj0Var.run();
                                return true;
                            }
                            sideSheetBehavior.r(i2);
                            return true;
                        }
                        StringBuilder sb = new StringBuilder("STATE_");
                        if (i2 == 1) {
                            str = "DRAGGING";
                        } else {
                            str = "SETTLING";
                        }
                        throw new IllegalArgumentException(qo0.s(sb, str, " should not be set externally."));
                    }
                });
            }
            final int i2 = 3;
            if (this.h != 3) {
                ry0.k(view, m1.h, new c2() { // from class: co0
                    @Override // defpackage.c2
                    public final boolean a(View view2) {
                        String str;
                        int i22 = i2;
                        int i3 = 1;
                        if (i22 != 1 && i22 != 2) {
                            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                            WeakReference weakReference2 = sideSheetBehavior.p;
                            if (weakReference2 != null && weakReference2.get() != null) {
                                View view3 = (View) sideSheetBehavior.p.get();
                                oj0 oj0Var = new oj0(i22, i3, sideSheetBehavior);
                                ViewParent parent = view3.getParent();
                                if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                                    view3.post(oj0Var);
                                    return true;
                                }
                                oj0Var.run();
                                return true;
                            }
                            sideSheetBehavior.r(i22);
                            return true;
                        }
                        StringBuilder sb = new StringBuilder("STATE_");
                        if (i22 == 1) {
                            str = "DRAGGING";
                        } else {
                            str = "SETTLING";
                        }
                        throw new IllegalArgumentException(qo0.s(sb, str, " should not be set externally."));
                    }
                });
            }
        }
    }

    public SideSheetBehavior() {
        this.e = new b(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new zd(this, 1);
    }
}
