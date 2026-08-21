package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import defpackage.ai0;
import defpackage.c;
import defpackage.ds;
import defpackage.lf;
import defpackage.mf;
import defpackage.mg0;
import defpackage.nf;
import defpackage.oh0;
import defpackage.ph0;
import defpackage.qo0;
import defpackage.uh0;
import defpackage.zh0;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends oh0 implements zh0 {
    public final ds p;
    public nf q;
    public final View.OnLayoutChangeListener r;

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new mf();
        this.r = new View.OnLayoutChangeListener() { // from class: kf
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new x2(2, CarouselLayoutManager.this));
            }
        };
        this.p = new ds();
        m0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mg0.c);
            obtainStyledAttributes.getInt(0, 0);
            m0();
            E0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public final float B0(float f, float f2) {
        if (D0()) {
            return f - f2;
        }
        return f + f2;
    }

    public final boolean C0() {
        if (this.q.a == 0) {
            return true;
        }
        return false;
    }

    public final boolean D0() {
        if (C0() && C() == 1) {
            return true;
        }
        return false;
    }

    public final void E0(int i) {
        nf nfVar;
        if (i != 0 && i != 1) {
            c.k(qo0.m("invalid orientation:", i));
            return;
        }
        c(null);
        nf nfVar2 = this.q;
        if (nfVar2 != null && i == nfVar2.a) {
            return;
        }
        if (i != 0) {
            if (i == 1) {
                nfVar = new nf(this, 0);
            } else {
                c.k("invalid orientation");
                return;
            }
        } else {
            nfVar = new nf(this, 1);
        }
        this.q = nfVar;
        m0();
    }

    @Override // defpackage.oh0
    public final boolean L() {
        return true;
    }

    @Override // defpackage.oh0
    public final void R(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        ds dsVar = this.p;
        float f = dsVar.a;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        dsVar.a = f;
        float f2 = dsVar.b;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        dsVar.b = f2;
        m0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    @Override // defpackage.oh0
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x003b, code lost:
    
        if (r7 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0045, code lost:
    
        if (D0() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0049, code lost:
    
        if (r7 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0052, code lost:
    
        if (D0() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // defpackage.oh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View T(android.view.View r5, int r6, defpackage.uh0 r7, defpackage.ai0 r8) {
        /*
            r4 = this;
            int r7 = r4.v()
            r8 = 0
            if (r7 != 0) goto L9
            goto L96
        L9:
            nf r7 = r4.q
            int r7 = r7.a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L47
            r3 = 2
            if (r6 == r3) goto L3d
            r3 = 17
            if (r6 == r3) goto L4c
            r3 = 33
            if (r6 == r3) goto L49
            r3 = 66
            if (r6 == r3) goto L3f
            r3 = 130(0x82, float:1.82E-43)
            if (r6 == r3) goto L3b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown focus request:"
            r7.<init>(r3)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "CarouselLayoutManager"
            android.util.Log.d(r7, r6)
        L39:
            r6 = r0
            goto L55
        L3b:
            if (r7 != r2) goto L39
        L3d:
            r6 = r2
            goto L55
        L3f:
            if (r7 != 0) goto L39
            boolean r6 = r4.D0()
            if (r6 == 0) goto L3d
        L47:
            r6 = r1
            goto L55
        L49:
            if (r7 != r2) goto L39
            goto L47
        L4c:
            if (r7 != 0) goto L39
            boolean r6 = r4.D0()
            if (r6 == 0) goto L47
            goto L3d
        L55:
            if (r6 != r0) goto L58
            goto L96
        L58:
            r7 = 0
            if (r6 != r1) goto L8b
            int r5 = defpackage.oh0.H(r5)
            if (r5 != 0) goto L62
            goto L96
        L62:
            android.view.View r5 = r4.u(r7)
            int r5 = defpackage.oh0.H(r5)
            int r5 = r5 - r2
            if (r5 < 0) goto L7a
            int r6 = r4.B()
            if (r5 < r6) goto L74
            goto L7a
        L74:
            nf r4 = r4.q
            r4.a()
            throw r8
        L7a:
            boolean r5 = r4.D0()
            if (r5 == 0) goto L86
            int r5 = r4.v()
            int r7 = r5 + (-1)
        L86:
            android.view.View r4 = r4.u(r7)
            return r4
        L8b:
            int r5 = defpackage.oh0.H(r5)
            int r6 = r4.B()
            int r6 = r6 - r2
            if (r5 != r6) goto L97
        L96:
            return r8
        L97:
            int r5 = r4.v()
            int r5 = r5 - r2
            android.view.View r5 = r4.u(r5)
            int r5 = defpackage.oh0.H(r5)
            int r5 = r5 + r2
            if (r5 < 0) goto Lb4
            int r6 = r4.B()
            if (r5 < r6) goto Lae
            goto Lb4
        Lae:
            nf r4 = r4.q
            r4.a()
            throw r8
        Lb4:
            boolean r5 = r4.D0()
            if (r5 == 0) goto Lbb
            goto Lc1
        Lbb:
            int r5 = r4.v()
            int r7 = r5 + (-1)
        Lc1:
            android.view.View r4 = r4.u(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.T(android.view.View, int, uh0, ai0):android.view.View");
    }

    @Override // defpackage.oh0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(oh0.H(u(0)));
            accessibilityEvent.setToIndex(oh0.H(u(v() - 1)));
        }
    }

    @Override // defpackage.oh0
    public final void X(int i, int i2) {
        B();
    }

    @Override // defpackage.oh0
    public final void Y() {
        B();
    }

    @Override // defpackage.zh0
    public final PointF a(int i) {
        return null;
    }

    @Override // defpackage.oh0
    public final void a0(int i, int i2) {
        B();
    }

    @Override // defpackage.oh0
    public final void c0(uh0 uh0Var, ai0 ai0Var) {
        int i;
        if (ai0Var.b() > 0) {
            if (C0()) {
                i = this.n;
            } else {
                i = this.o;
            }
            if (i > 0.0f) {
                D0();
                uh0Var.d(0);
                c.o("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        h0(uh0Var);
    }

    @Override // defpackage.oh0
    public final boolean d() {
        return C0();
    }

    @Override // defpackage.oh0
    public final void d0(ai0 ai0Var) {
        if (v() == 0) {
            return;
        }
        oh0.H(u(0));
    }

    @Override // defpackage.oh0
    public final boolean e() {
        return !C0();
    }

    @Override // defpackage.oh0
    public final int j(ai0 ai0Var) {
        v();
        return 0;
    }

    @Override // defpackage.oh0
    public final int k(ai0 ai0Var) {
        return 0;
    }

    @Override // defpackage.oh0
    public final int l(ai0 ai0Var) {
        return 0;
    }

    @Override // defpackage.oh0
    public final boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.oh0
    public final int m(ai0 ai0Var) {
        v();
        return 0;
    }

    @Override // defpackage.oh0
    public final int n(ai0 ai0Var) {
        return 0;
    }

    @Override // defpackage.oh0
    public final int n0(int i, uh0 uh0Var, ai0 ai0Var) {
        if (!C0() || v() == 0 || i == 0) {
            return 0;
        }
        uh0Var.d(0);
        c.o("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.oh0
    public final int o(ai0 ai0Var) {
        return 0;
    }

    @Override // defpackage.oh0
    public final int p0(int i, uh0 uh0Var, ai0 ai0Var) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        uh0Var.d(0);
        c.o("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.oh0
    public final ph0 r() {
        return new ph0(-2, -2);
    }

    @Override // defpackage.oh0
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (C0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // defpackage.oh0
    public final void y0(RecyclerView recyclerView, int i) {
        lf lfVar = new lf(this, recyclerView.getContext());
        lfVar.a = i;
        z0(lfVar);
    }

    public CarouselLayoutManager() {
        ds dsVar = new ds();
        new mf();
        this.r = new View.OnLayoutChangeListener() { // from class: kf
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new x2(2, CarouselLayoutManager.this));
            }
        };
        this.p = dsVar;
        m0();
        E0(0);
    }

    @Override // defpackage.oh0
    public final void o0(int i) {
    }
}
