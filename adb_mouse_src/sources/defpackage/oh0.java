package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class oh0 {
    public b8 a;
    public RecyclerView b;
    public final jp0 c;
    public final jp0 d;
    public d60 e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public oh0() {
        mh0 mh0Var = new mh0(this, 0);
        mh0 mh0Var2 = new mh0(this, 1);
        this.c = new jp0(mh0Var);
        this.d = new jp0(mh0Var2);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((ph0) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((ph0) view.getLayoutParams()).a.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nh0, java.lang.Object] */
    public static nh0 I(Context context, AttributeSet attributeSet, int i, int i2) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lg0.a, i, i2);
        obj.a = obtainStyledAttributes.getInt(0, 1);
        obj.b = obtainStyledAttributes.getInt(10, 1);
        obj.c = obtainStyledAttributes.getBoolean(9, false);
        obj.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean M(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i) {
                return false;
            }
            return true;
        }
        if (size < i) {
            return false;
        }
        return true;
    }

    public static void N(View view, int i, int i2, int i3, int i4) {
        ph0 ph0Var = (ph0) view.getLayoutParams();
        Rect rect = ph0Var.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) ph0Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) ph0Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) ph0Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) ph0Var).bottomMargin);
    }

    public static int g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oh0.w(boolean, int, int, int, int):int");
    }

    public static int z(View view) {
        Rect rect = ((ph0) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public boolean A0() {
        return false;
    }

    public final int B() {
        gh0 gh0Var;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            gh0Var = recyclerView.getAdapter();
        } else {
            gh0Var = null;
        }
        if (gh0Var != null) {
            return gh0Var.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = ry0.a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(uh0 uh0Var, ai0 ai0Var) {
        return -1;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((ph0) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.m;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int x = recyclerView.g.x();
            for (int i2 = 0; i2 < x; i2++) {
                recyclerView.g.w(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int x = recyclerView.g.x();
            for (int i2 = 0; i2 < x; i2++) {
                recyclerView.g.w(i2).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, uh0 uh0Var, ai0 ai0Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        uh0 uh0Var = recyclerView.d;
        if (accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            gh0 gh0Var = this.b.n;
            if (gh0Var != null) {
                accessibilityEvent.setItemCount(gh0Var.a());
            }
        }
    }

    public final void W(View view, s1 s1Var) {
        di0 I = RecyclerView.I(view);
        if (I != null && !I.h()) {
            b8 b8Var = this.a;
            if (!((ArrayList) b8Var.f).contains(I.a)) {
                RecyclerView recyclerView = this.b;
                V(recyclerView.d, recyclerView.h0, view, s1Var);
            }
        }
    }

    public final void b(View view, int i, boolean z) {
        int i2;
        di0 I = RecyclerView.I(view);
        if (!z && !I.h()) {
            this.b.h.j(I);
        } else {
            io0 io0Var = (io0) this.b.h.d;
            xy0 xy0Var = (xy0) io0Var.get(I);
            if (xy0Var == null) {
                xy0Var = xy0.a();
                io0Var.put(I, xy0Var);
            }
            xy0Var.a |= 1;
        }
        ph0 ph0Var = (ph0) view.getLayoutParams();
        if (!I.p() && !I.i()) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            b8 b8Var = this.a;
            int i3 = -1;
            if (parent == recyclerView) {
                xg xgVar = (xg) b8Var.e;
                int indexOfChild = ((fh0) b8Var.d).a.indexOfChild(view);
                if (indexOfChild == -1 || xgVar.d(indexOfChild)) {
                    i2 = -1;
                } else {
                    i2 = indexOfChild - xgVar.b(indexOfChild);
                }
                if (i == -1) {
                    i = this.a.x();
                }
                if (i2 != -1) {
                    if (i2 != i) {
                        oh0 oh0Var = this.b.o;
                        View u = oh0Var.u(i2);
                        if (u != null) {
                            oh0Var.u(i2);
                            oh0Var.a.r(i2);
                            ph0 ph0Var2 = (ph0) u.getLayoutParams();
                            di0 I2 = RecyclerView.I(u);
                            boolean h = I2.h();
                            RecyclerView recyclerView2 = oh0Var.b;
                            if (h) {
                                io0 io0Var2 = (io0) recyclerView2.h.d;
                                xy0 xy0Var2 = (xy0) io0Var2.get(I2);
                                if (xy0Var2 == null) {
                                    xy0Var2 = xy0.a();
                                    io0Var2.put(I2, xy0Var2);
                                }
                                xy0Var2.a = 1 | xy0Var2.a;
                            } else {
                                recyclerView2.h.j(I2);
                            }
                            oh0Var.a.n(u, i, ph0Var2, I2.h());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + oh0Var.b.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.y());
                }
            } else {
                b8Var.m(view, i, false);
                ph0Var.c = true;
                d60 d60Var = this.e;
                if (d60Var != null && d60Var.e) {
                    d60Var.b.getClass();
                    di0 I3 = RecyclerView.I(view);
                    if (I3 != null) {
                        i3 = I3.b();
                    }
                    if (i3 == d60Var.a) {
                        d60Var.f = view;
                    }
                }
            }
        } else {
            if (I.i()) {
                I.n.k(I);
            } else {
                I.j &= -33;
            }
            this.a.n(view, i, view.getLayoutParams(), false);
        }
        if (ph0Var.d) {
            I.a.invalidate();
            ph0Var.d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(uh0 uh0Var, ai0 ai0Var);

    public abstract boolean d();

    public abstract void d0(ai0 ai0Var);

    public abstract boolean e();

    public boolean f(ph0 ph0Var) {
        if (ph0Var != null) {
            return true;
        }
        return false;
    }

    public Parcelable f0() {
        return null;
    }

    public final void h0(uh0 uh0Var) {
        for (int v = v() - 1; v >= 0; v--) {
            if (!RecyclerView.I(u(v)).o()) {
                View u = u(v);
                k0(v);
                uh0Var.g(u);
            }
        }
    }

    public final void i0(uh0 uh0Var) {
        ArrayList arrayList;
        int size = ((ArrayList) uh0Var.c).size();
        int i = size - 1;
        while (true) {
            arrayList = (ArrayList) uh0Var.c;
            if (i < 0) {
                break;
            }
            View view = ((di0) arrayList.get(i)).a;
            di0 I = RecyclerView.I(view);
            if (!I.o()) {
                I.n(false);
                if (I.j()) {
                    this.b.removeDetachedView(view, false);
                }
                kh0 kh0Var = this.b.M;
                if (kh0Var != null) {
                    kh0Var.d(I);
                }
                I.n(true);
                di0 I2 = RecyclerView.I(view);
                I2.n = null;
                I2.o = false;
                I2.j &= -33;
                uh0Var.h(I2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) uh0Var.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int j(ai0 ai0Var);

    public final void j0(View view, uh0 uh0Var) {
        b8 b8Var = this.a;
        fh0 fh0Var = (fh0) b8Var.d;
        int indexOfChild = fh0Var.a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((xg) b8Var.e).f(indexOfChild)) {
                b8Var.U(view);
            }
            fh0Var.h(indexOfChild);
        }
        uh0Var.g(view);
    }

    public abstract int k(ai0 ai0Var);

    public final void k0(int i) {
        if (u(i) != null) {
            b8 b8Var = this.a;
            int D = b8Var.D(i);
            fh0 fh0Var = (fh0) b8Var.d;
            View childAt = fh0Var.a.getChildAt(D);
            if (childAt != null) {
                if (((xg) b8Var.e).f(D)) {
                    b8Var.U(childAt);
                }
                fh0Var.h(D);
            }
        }
    }

    public abstract int l(ai0 ai0Var);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.E()
            int r1 = r8.G()
            int r2 = r8.n
            int r3 = r8.F()
            int r2 = r2 - r3
            int r3 = r8.o
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.C()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.E()
            int r2 = r8.G()
            int r3 = r8.n
            int r4 = r8.F()
            int r3 = r3 - r4
            int r4 = r8.o
            int r5 = r8.D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.b
            android.graphics.Rect r5 = r5.k
            r8.y(r13, r5)
            int r8 = r5.left
            int r8 = r8 - r11
            if (r8 >= r3) goto Lb3
            int r8 = r5.right
            int r8 = r8 - r11
            if (r8 <= r1) goto Lb3
            int r8 = r5.top
            int r8 = r8 - r10
            if (r8 >= r4) goto Lb3
            int r8 = r5.bottom
            int r8 = r8 - r10
            if (r8 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            return r7
        Lba:
            r9.b0(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oh0.l0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int m(ai0 ai0Var);

    public final void m0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int n(ai0 ai0Var);

    public abstract int n0(int i, uh0 uh0Var, ai0 ai0Var);

    public abstract int o(ai0 ai0Var);

    public abstract void o0(int i);

    public final void p(uh0 uh0Var) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            di0 I = RecyclerView.I(u);
            if (!I.o()) {
                if (I.f() && !I.h() && !this.b.n.b) {
                    k0(v);
                    uh0Var.h(I);
                } else {
                    u(v);
                    this.a.r(v);
                    uh0Var.i(u);
                    this.b.h.j(I);
                }
            }
        }
    }

    public abstract int p0(int i, uh0 uh0Var, ai0 ai0Var);

    public View q(int i) {
        int v = v();
        for (int i2 = 0; i2 < v; i2++) {
            View u = u(i2);
            di0 I = RecyclerView.I(u);
            if (I != null && I.b() == i && !I.o() && (this.b.h0.g || !I.h())) {
                return u;
            }
        }
        return null;
    }

    public final void q0(RecyclerView recyclerView) {
        r0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract ph0 r();

    public final void r0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.A0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.A0;
        }
    }

    public ph0 s(Context context, AttributeSet attributeSet) {
        return new ph0(context, attributeSet);
    }

    public void s0(Rect rect, int i, int i2) {
        int F = F() + E() + rect.width();
        int D = D() + G() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = ry0.a;
        this.b.setMeasuredDimension(g(i, F, recyclerView.getMinimumWidth()), g(i2, D, this.b.getMinimumHeight()));
    }

    public ph0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ph0) {
            return new ph0((ph0) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new ph0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new ph0(layoutParams);
    }

    public final void t0(int i, int i2) {
        int v = v();
        if (v == 0) {
            this.b.n(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < v; i7++) {
            View u = u(i7);
            Rect rect = this.b.k;
            y(u, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.k.set(i6, i4, i3, i5);
        s0(this.b.k, i, i2);
    }

    public final View u(int i) {
        b8 b8Var = this.a;
        if (b8Var != null) {
            return b8Var.w(i);
        }
        return null;
    }

    public final void u0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.g;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public final int v() {
        b8 b8Var = this.a;
        if (b8Var != null) {
            return b8Var.x();
        }
        return 0;
    }

    public final boolean v0(View view, int i, int i2, ph0 ph0Var) {
        if (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) ph0Var).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) ph0Var).height)) {
            return false;
        }
        return true;
    }

    public boolean w0() {
        return false;
    }

    public int x(uh0 uh0Var, ai0 ai0Var) {
        return -1;
    }

    public final boolean x0(View view, int i, int i2, ph0 ph0Var) {
        if (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) ph0Var).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) ph0Var).height)) {
            return false;
        }
        return true;
    }

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.A0;
        ph0 ph0Var = (ph0) view.getLayoutParams();
        Rect rect2 = ph0Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) ph0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) ph0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) ph0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) ph0Var).bottomMargin);
    }

    public abstract void y0(RecyclerView recyclerView, int i);

    public final void z0(d60 d60Var) {
        d60 d60Var2 = this.e;
        if (d60Var2 != null && d60Var != d60Var2 && d60Var2.e) {
            d60Var2.i();
        }
        this.e = d60Var;
        RecyclerView recyclerView = this.b;
        ci0 ci0Var = recyclerView.e0;
        ci0Var.i.removeCallbacks(ci0Var);
        ci0Var.e.abortAnimation();
        if (d60Var.h) {
            Log.w("RecyclerView", "An instance of " + d60Var.getClass().getSimpleName() + " was started more than once. Each instance of" + d60Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        d60Var.b = recyclerView;
        d60Var.c = this;
        int i = d60Var.a;
        if (i != -1) {
            recyclerView.h0.a = i;
            d60Var.e = true;
            d60Var.d = true;
            d60Var.f = recyclerView.o.q(i);
            d60Var.b.e0.a();
            d60Var.h = true;
            return;
        }
        c.k("Invalid target position");
    }

    public void Q() {
    }

    public void Y() {
    }

    public void R(RecyclerView recyclerView) {
    }

    public void e0(Parcelable parcelable) {
    }

    public void g0(int i) {
    }

    public void X(int i, int i2) {
    }

    public void Z(int i, int i2) {
    }

    public void a0(int i, int i2) {
    }

    public void b0(int i, int i2) {
    }

    public void i(int i, qz qzVar) {
    }

    public void V(uh0 uh0Var, ai0 ai0Var, View view, s1 s1Var) {
    }

    public void h(int i, int i2, ai0 ai0Var, qz qzVar) {
    }
}
