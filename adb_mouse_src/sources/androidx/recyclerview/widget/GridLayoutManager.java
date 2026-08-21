package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.ai0;
import defpackage.b60;
import defpackage.c;
import defpackage.h00;
import defpackage.oh0;
import defpackage.ph0;
import defpackage.qo0;
import defpackage.qz;
import defpackage.r6;
import defpackage.ry0;
import defpackage.s1;
import defpackage.uh0;
import defpackage.z50;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final r6 K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new r6(18);
        this.L = new Rect();
        m1(oh0.I(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.oh0
    public final boolean A0() {
        if (this.z == null && !this.E) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(ai0 ai0Var, b60 b60Var, qz qzVar) {
        int i;
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && (i = b60Var.d) >= 0 && i < ai0Var.b() && i2 > 0; i3++) {
            qzVar.a(b60Var.d, Math.max(0, b60Var.g));
            this.K.getClass();
            i2--;
            b60Var.d += b60Var.e;
        }
    }

    @Override // defpackage.oh0
    public final int J(uh0 uh0Var, ai0 ai0Var) {
        if (this.p == 0) {
            return this.F;
        }
        if (ai0Var.b() < 1) {
            return 0;
        }
        return i1(ai0Var.b() - 1, uh0Var, ai0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View O0(uh0 uh0Var, ai0 ai0Var, boolean z, boolean z2) {
        int i;
        int i2;
        int v = v();
        int i3 = 1;
        if (z2) {
            i2 = v() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = v;
            i2 = 0;
        }
        int b = ai0Var.b();
        H0();
        int k = this.r.k();
        int g = this.r.g();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View u = u(i2);
            int H = oh0.H(u);
            if (H >= 0 && H < b && j1(H, uh0Var, ai0Var) == 0) {
                if (((ph0) u.getLayoutParams()).a.h()) {
                    if (view2 == null) {
                        view2 = u;
                    }
                } else {
                    if (this.r.e(u) < g && this.r.b(u) >= k) {
                        return u;
                    }
                    if (view == null) {
                        view = u;
                    }
                }
            }
            i2 += i3;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        if (r13 == r10) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        if (r13 == r9) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0021, code lost:
    
        if (((java.util.ArrayList) r22.a.f).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.oh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View T(android.view.View r23, int r24, defpackage.uh0 r25, defpackage.ai0 r26) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.T(android.view.View, int, uh0, ai0):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U0(defpackage.uh0 r19, defpackage.ai0 r20, defpackage.b60 r21, defpackage.a60 r22) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.U0(uh0, ai0, b60, a60):void");
    }

    @Override // defpackage.oh0
    public final void V(uh0 uh0Var, ai0 ai0Var, View view, s1 s1Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = s1Var.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof h00)) {
            W(view, s1Var);
            return;
        }
        h00 h00Var = (h00) layoutParams;
        int i1 = i1(h00Var.a.b(), uh0Var, ai0Var);
        int i = this.p;
        int i2 = h00Var.e;
        int i3 = h00Var.f;
        if (i == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i1, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i1, 1, i2, i3, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(uh0 uh0Var, ai0 ai0Var, z50 z50Var, int i) {
        boolean z;
        n1();
        if (ai0Var.b() > 0 && !ai0Var.g) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            int j1 = j1(z50Var.b, uh0Var, ai0Var);
            if (z) {
                while (j1 > 0) {
                    int i2 = z50Var.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    z50Var.b = i3;
                    j1 = j1(i3, uh0Var, ai0Var);
                }
            } else {
                int b = ai0Var.b() - 1;
                int i4 = z50Var.b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int j12 = j1(i5, uh0Var, ai0Var);
                    if (j12 <= j1) {
                        break;
                    }
                    i4 = i5;
                    j1 = j12;
                }
                z50Var.b = i4;
            }
        }
        g1();
    }

    @Override // defpackage.oh0
    public final void X(int i, int i2) {
        r6 r6Var = this.K;
        r6Var.E();
        ((SparseIntArray) r6Var.e).clear();
    }

    @Override // defpackage.oh0
    public final void Y() {
        r6 r6Var = this.K;
        r6Var.E();
        ((SparseIntArray) r6Var.e).clear();
    }

    @Override // defpackage.oh0
    public final void Z(int i, int i2) {
        r6 r6Var = this.K;
        r6Var.E();
        ((SparseIntArray) r6Var.e).clear();
    }

    @Override // defpackage.oh0
    public final void a0(int i, int i2) {
        r6 r6Var = this.K;
        r6Var.E();
        ((SparseIntArray) r6Var.e).clear();
    }

    @Override // defpackage.oh0
    public final void b0(int i, int i2) {
        r6 r6Var = this.K;
        r6Var.E();
        ((SparseIntArray) r6Var.e).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void b1(boolean z) {
        if (!z) {
            super.b1(false);
        } else {
            c.q("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.oh0
    public final void c0(uh0 uh0Var, ai0 ai0Var) {
        boolean z = ai0Var.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int v = v();
            for (int i = 0; i < v; i++) {
                h00 h00Var = (h00) u(i).getLayoutParams();
                int b = h00Var.a.b();
                sparseIntArray2.put(b, h00Var.f);
                sparseIntArray.put(b, h00Var.e);
            }
        }
        super.c0(uh0Var, ai0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.oh0
    public final void d0(ai0 ai0Var) {
        super.d0(ai0Var);
        this.E = false;
    }

    @Override // defpackage.oh0
    public final boolean f(ph0 ph0Var) {
        return ph0Var instanceof h00;
    }

    public final void f1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 > 0 && i3 - i4 < i6) {
                i2 = i5 + 1;
                i4 -= i3;
            } else {
                i2 = i5;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    public final void g1() {
        View[] viewArr = this.H;
        if (viewArr != null && viewArr.length == this.F) {
            return;
        }
        this.H = new View[this.F];
    }

    public final int h1(int i, int i2) {
        if (this.p == 1 && T0()) {
            int[] iArr = this.G;
            int i3 = this.F;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.G;
        return iArr2[i2 + i] - iArr2[i];
    }

    public final int i1(int i, uh0 uh0Var, ai0 ai0Var) {
        boolean z = ai0Var.g;
        r6 r6Var = this.K;
        if (!z) {
            int i2 = this.F;
            r6Var.getClass();
            return r6.D(i, i2);
        }
        int b = uh0Var.b(i);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        int i3 = this.F;
        r6Var.getClass();
        return r6.D(b, i3);
    }

    public final int j1(int i, uh0 uh0Var, ai0 ai0Var) {
        boolean z = ai0Var.g;
        r6 r6Var = this.K;
        if (!z) {
            int i2 = this.F;
            r6Var.getClass();
            return i % i2;
        }
        int i3 = this.J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b = uh0Var.b(i);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        int i4 = this.F;
        r6Var.getClass();
        return b % i4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.oh0
    public final int k(ai0 ai0Var) {
        return E0(ai0Var);
    }

    public final int k1(int i, uh0 uh0Var, ai0 ai0Var) {
        boolean z = ai0Var.g;
        r6 r6Var = this.K;
        if (!z) {
            r6Var.getClass();
            return 1;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (uh0Var.b(i) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        r6Var.getClass();
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.oh0
    public final int l(ai0 ai0Var) {
        return F0(ai0Var);
    }

    public final void l1(View view, int i, boolean z) {
        int i2;
        int i3;
        boolean v0;
        h00 h00Var = (h00) view.getLayoutParams();
        Rect rect = h00Var.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) h00Var).topMargin + ((ViewGroup.MarginLayoutParams) h00Var).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) h00Var).leftMargin + ((ViewGroup.MarginLayoutParams) h00Var).rightMargin;
        int h1 = h1(h00Var.e, h00Var.f);
        if (this.p == 1) {
            i3 = oh0.w(false, h1, i, i5, ((ViewGroup.MarginLayoutParams) h00Var).width);
            i2 = oh0.w(true, this.r.l(), this.m, i4, ((ViewGroup.MarginLayoutParams) h00Var).height);
        } else {
            int w = oh0.w(false, h1, i, i4, ((ViewGroup.MarginLayoutParams) h00Var).height);
            int w2 = oh0.w(true, this.r.l(), this.l, i5, ((ViewGroup.MarginLayoutParams) h00Var).width);
            i2 = w;
            i3 = w2;
        }
        ph0 ph0Var = (ph0) view.getLayoutParams();
        if (z) {
            v0 = x0(view, i3, i2, ph0Var);
        } else {
            v0 = v0(view, i3, i2, ph0Var);
        }
        if (v0) {
            view.measure(i3, i2);
        }
    }

    public final void m1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i >= 1) {
            this.F = i;
            this.K.E();
            m0();
            return;
        }
        c.k(qo0.m("Span count should be at least 1. Provided ", i));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.oh0
    public final int n(ai0 ai0Var) {
        return E0(ai0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.oh0
    public final int n0(int i, uh0 uh0Var, ai0 ai0Var) {
        n1();
        g1();
        return super.n0(i, uh0Var, ai0Var);
    }

    public final void n1() {
        int D;
        int G;
        if (this.p == 1) {
            D = this.n - F();
            G = E();
        } else {
            D = this.o - D();
            G = G();
        }
        f1(D - G);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.oh0
    public final int o(ai0 ai0Var) {
        return F0(ai0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.oh0
    public final int p0(int i, uh0 uh0Var, ai0 ai0Var) {
        n1();
        g1();
        return super.p0(i, uh0Var, ai0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.oh0
    public final ph0 r() {
        if (this.p == 0) {
            return new h00(-2, -1);
        }
        return new h00(-1, -2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ph0, h00] */
    @Override // defpackage.oh0
    public final ph0 s(Context context, AttributeSet attributeSet) {
        ?? ph0Var = new ph0(context, attributeSet);
        ph0Var.e = -1;
        ph0Var.f = 0;
        return ph0Var;
    }

    @Override // defpackage.oh0
    public final void s0(Rect rect, int i, int i2) {
        int g;
        int g2;
        if (this.G == null) {
            super.s0(rect, i, i2);
        }
        int F = F() + E();
        int D = D() + G();
        if (this.p == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = ry0.a;
            g2 = oh0.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            g = oh0.g(i, iArr[iArr.length - 1] + F, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = ry0.a;
            g = oh0.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            g2 = oh0.g(i2, iArr2[iArr2.length - 1] + D, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g, g2);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ph0, h00] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ph0, h00] */
    @Override // defpackage.oh0
    public final ph0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? ph0Var = new ph0((ViewGroup.MarginLayoutParams) layoutParams);
            ph0Var.e = -1;
            ph0Var.f = 0;
            return ph0Var;
        }
        ?? ph0Var2 = new ph0(layoutParams);
        ph0Var2.e = -1;
        ph0Var2.f = 0;
        return ph0Var2;
    }

    @Override // defpackage.oh0
    public final int x(uh0 uh0Var, ai0 ai0Var) {
        if (this.p == 1) {
            return this.F;
        }
        if (ai0Var.b() < 1) {
            return 0;
        }
        return i1(ai0Var.b() - 1, uh0Var, ai0Var) + 1;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new r6(18);
        this.L = new Rect();
        m1(i);
    }
}
