package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.a60;
import defpackage.ai0;
import defpackage.b60;
import defpackage.c;
import defpackage.c60;
import defpackage.d60;
import defpackage.di0;
import defpackage.nh0;
import defpackage.oh0;
import defpackage.ph0;
import defpackage.qo0;
import defpackage.qz;
import defpackage.uh0;
import defpackage.wg0;
import defpackage.ws;
import defpackage.z50;
import defpackage.zh0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class LinearLayoutManager extends oh0 implements zh0 {
    public final z50 A;
    public final a60 B;
    public final int C;
    public final int[] D;
    public int p;
    public b60 q;
    public ws r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public c60 z;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, a60] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new z50();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        nh0 I = oh0.I(context, attributeSet, i, i2);
        a1(I.a);
        boolean z = I.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            m0();
        }
        b1(I.d);
    }

    @Override // defpackage.oh0
    public boolean A0() {
        if (this.z == null && this.s == this.v) {
            return true;
        }
        return false;
    }

    public void B0(ai0 ai0Var, int[] iArr) {
        int i;
        int i2;
        if (ai0Var.a != -1) {
            i = this.r.l();
        } else {
            i = 0;
        }
        if (this.q.f == -1) {
            i2 = 0;
        } else {
            i2 = i;
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public void C0(ai0 ai0Var, b60 b60Var, qz qzVar) {
        int i = b60Var.d;
        if (i >= 0 && i < ai0Var.b()) {
            qzVar.a(i, Math.max(0, b60Var.g));
        }
    }

    public final int D0(ai0 ai0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        ws wsVar = this.r;
        boolean z = !this.w;
        return wg0.e(ai0Var, wsVar, K0(z), J0(z), this, this.w);
    }

    public final int E0(ai0 ai0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        ws wsVar = this.r;
        boolean z = !this.w;
        return wg0.f(ai0Var, wsVar, K0(z), J0(z), this, this.w, this.u);
    }

    public final int F0(ai0 ai0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        ws wsVar = this.r;
        boolean z = !this.w;
        return wg0.g(ai0Var, wsVar, K0(z), J0(z), this, this.w);
    }

    public final int G0(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.p == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.p == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.p == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.p == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.p != 1 && T0()) {
                return -1;
            }
            return 1;
        }
        if (this.p == 1 || !T0()) {
            return -1;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, b60] */
    public final void H0() {
        if (this.q == null) {
            ?? obj = new Object();
            obj.a = true;
            obj.h = 0;
            obj.i = 0;
            obj.k = null;
            this.q = obj;
        }
    }

    public final int I0(uh0 uh0Var, b60 b60Var, ai0 ai0Var, boolean z) {
        int i;
        int i2 = b60Var.c;
        int i3 = b60Var.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                b60Var.g = i3 + i2;
            }
            W0(uh0Var, b60Var);
        }
        int i4 = b60Var.c + b60Var.h;
        while (true) {
            if ((!b60Var.l && i4 <= 0) || (i = b60Var.d) < 0 || i >= ai0Var.b()) {
                break;
            }
            a60 a60Var = this.B;
            a60Var.a = 0;
            a60Var.b = false;
            a60Var.c = false;
            a60Var.d = false;
            U0(uh0Var, ai0Var, b60Var, a60Var);
            if (!a60Var.b) {
                int i5 = b60Var.b;
                int i6 = a60Var.a;
                b60Var.b = (b60Var.f * i6) + i5;
                if (!a60Var.c || b60Var.k != null || !ai0Var.g) {
                    b60Var.c -= i6;
                    i4 -= i6;
                }
                int i7 = b60Var.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    b60Var.g = i8;
                    int i9 = b60Var.c;
                    if (i9 < 0) {
                        b60Var.g = i8 + i9;
                    }
                    W0(uh0Var, b60Var);
                }
                if (z && a60Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - b60Var.c;
    }

    public final View J0(boolean z) {
        if (this.u) {
            return N0(0, v(), z);
        }
        return N0(v() - 1, -1, z);
    }

    public final View K0(boolean z) {
        if (this.u) {
            return N0(v() - 1, -1, z);
        }
        return N0(0, v(), z);
    }

    @Override // defpackage.oh0
    public final boolean L() {
        return true;
    }

    public final int L0() {
        View N0 = N0(v() - 1, -1, false);
        if (N0 == null) {
            return -1;
        }
        return oh0.H(N0);
    }

    public final View M0(int i, int i2) {
        int i3;
        int i4;
        H0();
        if (i2 > i || i2 < i) {
            if (this.r.e(u(i)) < this.r.k()) {
                i3 = 16644;
                i4 = 16388;
            } else {
                i3 = 4161;
                i4 = 4097;
            }
            if (this.p == 0) {
                return this.c.d(i, i2, i3, i4);
            }
            return this.d.d(i, i2, i3, i4);
        }
        return u(i);
    }

    public final View N0(int i, int i2, boolean z) {
        int i3;
        H0();
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (this.p == 0) {
            return this.c.d(i, i2, i3, 320);
        }
        return this.d.d(i, i2, i3, 320);
    }

    public View O0(uh0 uh0Var, ai0 ai0Var, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        H0();
        int v = v();
        if (z2) {
            i2 = v() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = v;
            i2 = 0;
            i3 = 1;
        }
        int b = ai0Var.b();
        int k = this.r.k();
        int g = this.r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View u = u(i2);
            int H = oh0.H(u);
            int e = this.r.e(u);
            int b2 = this.r.b(u);
            if (H >= 0 && H < b) {
                if (((ph0) u.getLayoutParams()).a.h()) {
                    if (view3 == null) {
                        view3 = u;
                    }
                } else {
                    if (b2 <= k && e < k) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (e >= g && b2 > g) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z3 && !z4) {
                        return u;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = u;
                        }
                        view2 = u;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = u;
                        }
                        view2 = u;
                    }
                }
            }
            i2 += i3;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    public final int P0(int i, uh0 uh0Var, ai0 ai0Var, boolean z) {
        int g;
        int g2 = this.r.g() - i;
        if (g2 > 0) {
            int i2 = -Z0(-g2, uh0Var, ai0Var);
            int i3 = i + i2;
            if (z && (g = this.r.g() - i3) > 0) {
                this.r.o(g);
                return g + i2;
            }
            return i2;
        }
        return 0;
    }

    public final int Q0(int i, uh0 uh0Var, ai0 ai0Var, boolean z) {
        int k;
        int k2 = i - this.r.k();
        if (k2 > 0) {
            int i2 = -Z0(k2, uh0Var, ai0Var);
            int i3 = i + i2;
            if (z && (k = i3 - this.r.k()) > 0) {
                this.r.o(-k);
                return i2 - k;
            }
            return i2;
        }
        return 0;
    }

    public final View R0() {
        int v;
        if (this.u) {
            v = 0;
        } else {
            v = v() - 1;
        }
        return u(v);
    }

    public final View S0() {
        int i;
        if (this.u) {
            i = v() - 1;
        } else {
            i = 0;
        }
        return u(i);
    }

    @Override // defpackage.oh0
    public View T(View view, int i, uh0 uh0Var, ai0 ai0Var) {
        int G0;
        View M0;
        View R0;
        Y0();
        if (v() != 0 && (G0 = G0(i)) != Integer.MIN_VALUE) {
            H0();
            c1(G0, (int) (this.r.l() * 0.33333334f), false, ai0Var);
            b60 b60Var = this.q;
            b60Var.g = Integer.MIN_VALUE;
            b60Var.a = false;
            I0(uh0Var, b60Var, ai0Var, true);
            boolean z = this.u;
            if (G0 == -1) {
                if (z) {
                    M0 = M0(v() - 1, -1);
                } else {
                    M0 = M0(0, v());
                }
            } else if (z) {
                M0 = M0(0, v());
            } else {
                M0 = M0(v() - 1, -1);
            }
            if (G0 == -1) {
                R0 = S0();
            } else {
                R0 = R0();
            }
            if (R0.hasFocusable()) {
                if (M0 != null) {
                    return R0;
                }
            } else {
                return M0;
            }
        }
        return null;
    }

    public final boolean T0() {
        if (C() == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.oh0
    public final void U(AccessibilityEvent accessibilityEvent) {
        int H;
        super.U(accessibilityEvent);
        if (v() > 0) {
            View N0 = N0(0, v(), false);
            if (N0 == null) {
                H = -1;
            } else {
                H = oh0.H(N0);
            }
            accessibilityEvent.setFromIndex(H);
            accessibilityEvent.setToIndex(L0());
        }
    }

    public void U0(uh0 uh0Var, ai0 ai0Var, b60 b60Var, a60 a60Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        View b = b60Var.b(uh0Var);
        if (b == null) {
            a60Var.b = true;
            return;
        }
        ph0 ph0Var = (ph0) b.getLayoutParams();
        List list = b60Var.k;
        boolean z3 = this.u;
        int i5 = b60Var.f;
        if (list == null) {
            if (i5 == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                b(b, -1, false);
            } else {
                b(b, 0, false);
            }
        } else {
            if (i5 == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                b(b, -1, true);
            } else {
                b(b, 0, true);
            }
        }
        ph0 ph0Var2 = (ph0) b.getLayoutParams();
        Rect J = this.b.J(b);
        int i6 = J.left + J.right;
        int i7 = J.top + J.bottom;
        int w = oh0.w(d(), this.n, this.l, F() + E() + ((ViewGroup.MarginLayoutParams) ph0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) ph0Var2).rightMargin + i6, ((ViewGroup.MarginLayoutParams) ph0Var2).width);
        int w2 = oh0.w(e(), this.o, this.m, D() + G() + ((ViewGroup.MarginLayoutParams) ph0Var2).topMargin + ((ViewGroup.MarginLayoutParams) ph0Var2).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) ph0Var2).height);
        if (v0(b, w, w2, ph0Var2)) {
            b.measure(w, w2);
        }
        a60Var.a = this.r.c(b);
        if (this.p == 1) {
            if (T0()) {
                i4 = this.n - F();
                i2 = i4 - this.r.d(b);
            } else {
                int E = E();
                i4 = this.r.d(b) + E;
                i2 = E;
            }
            int i8 = b60Var.f;
            i3 = b60Var.b;
            int i9 = a60Var.a;
            if (i8 == -1) {
                int i10 = i3 - i9;
                i = i3;
                i3 = i10;
            } else {
                i = i9 + i3;
            }
        } else {
            int G = G();
            int d = this.r.d(b) + G;
            int i11 = b60Var.f;
            int i12 = b60Var.b;
            int i13 = a60Var.a;
            if (i11 == -1) {
                int i14 = i12 - i13;
                i4 = i12;
                i3 = G;
                i = d;
                i2 = i14;
            } else {
                int i15 = i12 + i13;
                i = d;
                i2 = i12;
                i3 = G;
                i4 = i15;
            }
        }
        oh0.N(b, i2, i3, i4, i);
        if (ph0Var.a.h() || ph0Var.a.k()) {
            a60Var.c = true;
        }
        a60Var.d = b.hasFocusable();
    }

    public final void W0(uh0 uh0Var, b60 b60Var) {
        if (b60Var.a && !b60Var.l) {
            int i = b60Var.g;
            int i2 = b60Var.i;
            if (b60Var.f == -1) {
                int v = v();
                if (i >= 0) {
                    int f = (this.r.f() - i) + i2;
                    if (this.u) {
                        for (int i3 = 0; i3 < v; i3++) {
                            View u = u(i3);
                            if (this.r.e(u) < f || this.r.n(u) < f) {
                                X0(uh0Var, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = v - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View u2 = u(i5);
                        if (this.r.e(u2) < f || this.r.n(u2) < f) {
                            X0(uh0Var, i4, i5);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i >= 0) {
                int i6 = i - i2;
                int v2 = v();
                if (this.u) {
                    int i7 = v2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View u3 = u(i8);
                        if (this.r.b(u3) > i6 || this.r.m(u3) > i6) {
                            X0(uh0Var, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < v2; i9++) {
                    View u4 = u(i9);
                    if (this.r.b(u4) > i6 || this.r.m(u4) > i6) {
                        X0(uh0Var, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    public final void X0(uh0 uh0Var, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    View u = u(i3);
                    k0(i3);
                    uh0Var.g(u);
                }
                return;
            }
            while (i > i2) {
                View u2 = u(i);
                k0(i);
                uh0Var.g(u2);
                i--;
            }
        }
    }

    public final void Y0() {
        if (this.p != 1 && T0()) {
            this.u = !this.t;
        } else {
            this.u = this.t;
        }
    }

    public final int Z0(int i, uh0 uh0Var, ai0 ai0Var) {
        int i2;
        if (v() != 0 && i != 0) {
            H0();
            this.q.a = true;
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            int abs = Math.abs(i);
            c1(i2, abs, true, ai0Var);
            b60 b60Var = this.q;
            int I0 = I0(uh0Var, b60Var, ai0Var, false) + b60Var.g;
            if (I0 >= 0) {
                if (abs > I0) {
                    i = i2 * I0;
                }
                this.r.o(-i);
                this.q.j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.zh0
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < oh0.H(u(0))) {
            z = true;
        }
        if (z != this.u) {
            i2 = -1;
        }
        if (this.p == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    public final void a1(int i) {
        if (i != 0 && i != 1) {
            c.k(qo0.m("invalid orientation:", i));
            return;
        }
        c(null);
        if (i == this.p && this.r != null) {
            return;
        }
        ws a = ws.a(this, i);
        this.r = a;
        this.A.a = a;
        this.p = i;
        m0();
    }

    public void b1(boolean z) {
        c(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        m0();
    }

    @Override // defpackage.oh0
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // defpackage.oh0
    public void c0(uh0 uh0Var, ai0 ai0Var) {
        View view;
        int i;
        View view2;
        View O0;
        boolean z;
        boolean z2;
        int l;
        int i2;
        boolean z3;
        boolean z4;
        int e;
        int l2;
        int i3;
        boolean z5;
        int i4;
        int i5;
        ?? r4;
        List list;
        boolean z6;
        int i6;
        int i7;
        int P0;
        int i8;
        View q;
        int e2;
        int i9;
        int i10;
        int i11 = -1;
        if ((this.z != null || this.x != -1) && ai0Var.b() == 0) {
            h0(uh0Var);
            return;
        }
        c60 c60Var = this.z;
        if (c60Var != null && (i10 = c60Var.c) >= 0) {
            this.x = i10;
        }
        H0();
        boolean z7 = false;
        this.q.a = false;
        Y0();
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.a.f).contains(view)) {
            view = null;
        }
        z50 z50Var = this.A;
        if (z50Var.e && this.x == -1 && this.z == null) {
            if (view != null && (this.r.e(view) >= this.r.g() || this.r.b(view) <= this.r.k())) {
                z50Var.b(view, oh0.H(view));
            }
        } else {
            z50Var.c();
            z50Var.d = this.u ^ this.v;
            if (!ai0Var.g && (i2 = this.x) != -1) {
                if (i2 >= 0 && i2 < ai0Var.b()) {
                    int i12 = this.x;
                    z50Var.b = i12;
                    c60 c60Var2 = this.z;
                    if (c60Var2 != null && c60Var2.c >= 0) {
                        boolean z8 = c60Var2.e;
                        z50Var.d = z8;
                        ws wsVar = this.r;
                        if (z8) {
                            z50Var.c = wsVar.g() - this.z.d;
                        } else {
                            z50Var.c = wsVar.k() + this.z.d;
                        }
                    } else if (this.y == Integer.MIN_VALUE) {
                        View q2 = q(i12);
                        if (q2 != null) {
                            if (this.r.c(q2) > this.r.l()) {
                                z50Var.a();
                            } else {
                                int e3 = this.r.e(q2) - this.r.k();
                                ws wsVar2 = this.r;
                                if (e3 < 0) {
                                    z50Var.c = wsVar2.k();
                                    z50Var.d = false;
                                } else if (wsVar2.g() - this.r.b(q2) < 0) {
                                    z50Var.c = this.r.g();
                                    z50Var.d = true;
                                } else {
                                    boolean z9 = z50Var.d;
                                    ws wsVar3 = this.r;
                                    if (z9) {
                                        int b = wsVar3.b(q2);
                                        ws wsVar4 = this.r;
                                        if (Integer.MIN_VALUE == wsVar4.a) {
                                            l2 = 0;
                                        } else {
                                            l2 = wsVar4.l() - wsVar4.a;
                                        }
                                        e = l2 + b;
                                    } else {
                                        e = wsVar3.e(q2);
                                    }
                                    z50Var.c = e;
                                }
                            }
                        } else {
                            if (v() > 0) {
                                if (this.x < oh0.H(u(0))) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3 == this.u) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                z50Var.d = z4;
                            }
                            z50Var.a();
                        }
                    } else {
                        boolean z10 = this.u;
                        z50Var.d = z10;
                        ws wsVar5 = this.r;
                        if (z10) {
                            z50Var.c = wsVar5.g() - this.y;
                        } else {
                            z50Var.c = wsVar5.k() + this.y;
                        }
                    }
                    z50Var.e = true;
                } else {
                    this.x = -1;
                    this.y = Integer.MIN_VALUE;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.a.f).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    ph0 ph0Var = (ph0) view2.getLayoutParams();
                    if (!ph0Var.a.h() && ph0Var.a.b() >= 0 && ph0Var.a.b() < ai0Var.b()) {
                        z50Var.b(view2, oh0.H(view2));
                        z50Var.e = true;
                    }
                }
                boolean z11 = this.s;
                boolean z12 = this.v;
                if (z11 == z12 && (O0 = O0(uh0Var, ai0Var, z50Var.d, z12)) != null) {
                    int H = oh0.H(O0);
                    boolean z13 = z50Var.d;
                    ws wsVar6 = z50Var.a;
                    if (z13) {
                        int b2 = wsVar6.b(O0);
                        ws wsVar7 = z50Var.a;
                        if (Integer.MIN_VALUE == wsVar7.a) {
                            l = 0;
                        } else {
                            l = wsVar7.l() - wsVar7.a;
                        }
                        z50Var.c = l + b2;
                    } else {
                        z50Var.c = wsVar6.e(O0);
                    }
                    z50Var.b = H;
                    if (!ai0Var.g && A0()) {
                        int e4 = this.r.e(O0);
                        int b3 = this.r.b(O0);
                        int k = this.r.k();
                        int g = this.r.g();
                        if (b3 <= k && e4 < k) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (e4 >= g && b3 > g) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z || z2) {
                            if (z50Var.d) {
                                k = g;
                            }
                            z50Var.c = k;
                        }
                    }
                    z50Var.e = true;
                }
            }
            z50Var.a();
            if (this.v) {
                i = ai0Var.b() - 1;
            } else {
                i = 0;
            }
            z50Var.b = i;
            z50Var.e = true;
        }
        b60 b60Var = this.q;
        if (b60Var.j >= 0) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        b60Var.f = i3;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(ai0Var, iArr);
        int k2 = this.r.k() + Math.max(0, iArr[0]);
        int h = this.r.h() + Math.max(0, iArr[1]);
        if (ai0Var.g && (i8 = this.x) != -1 && this.y != Integer.MIN_VALUE && (q = q(i8)) != null) {
            boolean z14 = this.u;
            ws wsVar8 = this.r;
            if (z14) {
                i9 = wsVar8.g() - this.r.b(q);
                e2 = this.y;
            } else {
                e2 = wsVar8.e(q) - this.r.k();
                i9 = this.y;
            }
            int i13 = i9 - e2;
            if (i13 > 0) {
                k2 += i13;
            } else {
                h -= i13;
            }
        }
        boolean z15 = z50Var.d;
        boolean z16 = this.u;
        if (!z15 ? !z16 : z16) {
            i11 = 1;
        }
        V0(uh0Var, ai0Var, z50Var, i11);
        p(uh0Var);
        b60 b60Var2 = this.q;
        if (this.r.i() == 0 && this.r.f() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        b60Var2.l = z5;
        this.q.getClass();
        this.q.i = 0;
        boolean z17 = z50Var.d;
        int i14 = z50Var.b;
        if (z17) {
            e1(i14, z50Var.c);
            b60 b60Var3 = this.q;
            b60Var3.h = k2;
            I0(uh0Var, b60Var3, ai0Var, false);
            b60 b60Var4 = this.q;
            i5 = b60Var4.b;
            int i15 = b60Var4.d;
            int i16 = b60Var4.c;
            if (i16 > 0) {
                h += i16;
            }
            d1(z50Var.b, z50Var.c);
            b60 b60Var5 = this.q;
            b60Var5.h = h;
            b60Var5.d += b60Var5.e;
            I0(uh0Var, b60Var5, ai0Var, false);
            b60 b60Var6 = this.q;
            i4 = b60Var6.b;
            int i17 = b60Var6.c;
            if (i17 > 0) {
                e1(i15, i5);
                b60 b60Var7 = this.q;
                b60Var7.h = i17;
                I0(uh0Var, b60Var7, ai0Var, false);
                i5 = this.q.b;
            }
        } else {
            d1(i14, z50Var.c);
            b60 b60Var8 = this.q;
            b60Var8.h = h;
            I0(uh0Var, b60Var8, ai0Var, false);
            b60 b60Var9 = this.q;
            i4 = b60Var9.b;
            int i18 = b60Var9.d;
            int i19 = b60Var9.c;
            if (i19 > 0) {
                k2 += i19;
            }
            e1(z50Var.b, z50Var.c);
            b60 b60Var10 = this.q;
            b60Var10.h = k2;
            b60Var10.d += b60Var10.e;
            I0(uh0Var, b60Var10, ai0Var, false);
            b60 b60Var11 = this.q;
            int i20 = b60Var11.b;
            int i21 = b60Var11.c;
            if (i21 > 0) {
                d1(i18, i4);
                b60 b60Var12 = this.q;
                b60Var12.h = i21;
                I0(uh0Var, b60Var12, ai0Var, false);
                i4 = this.q.b;
            }
            i5 = i20;
        }
        if (v() > 0) {
            if (this.u ^ this.v) {
                int P02 = P0(i4, uh0Var, ai0Var, true);
                i6 = i5 + P02;
                i7 = i4 + P02;
                P0 = Q0(i6, uh0Var, ai0Var, false);
            } else {
                int Q0 = Q0(i5, uh0Var, ai0Var, true);
                i6 = i5 + Q0;
                i7 = i4 + Q0;
                P0 = P0(i7, uh0Var, ai0Var, false);
            }
            i5 = i6 + P0;
            i4 = i7 + P0;
        }
        if (ai0Var.k && v() != 0 && !ai0Var.g && A0()) {
            List list2 = (List) uh0Var.f;
            int size = list2.size();
            int H2 = oh0.H(u(0));
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            while (i22 < size) {
                di0 di0Var = (di0) list2.get(i22);
                boolean h2 = di0Var.h();
                View view3 = di0Var.a;
                if (!h2) {
                    if (di0Var.b() < H2) {
                        z6 = true;
                    } else {
                        z6 = z7;
                    }
                    boolean z18 = this.u;
                    ws wsVar9 = this.r;
                    if (z6 != z18) {
                        i23 += wsVar9.c(view3);
                    } else {
                        i24 += wsVar9.c(view3);
                    }
                }
                i22++;
                z7 = false;
            }
            this.q.k = list2;
            if (i23 > 0) {
                e1(oh0.H(S0()), i5);
                b60 b60Var13 = this.q;
                b60Var13.h = i23;
                r4 = 0;
                b60Var13.c = 0;
                b60Var13.a(null);
                I0(uh0Var, this.q, ai0Var, false);
            } else {
                r4 = 0;
            }
            if (i24 > 0) {
                d1(oh0.H(R0()), i4);
                b60 b60Var14 = this.q;
                b60Var14.h = i24;
                b60Var14.c = r4;
                list = null;
                b60Var14.a(null);
                I0(uh0Var, this.q, ai0Var, r4);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (!ai0Var.g) {
            ws wsVar10 = this.r;
            wsVar10.a = wsVar10.l();
        } else {
            z50Var.c();
        }
        this.s = this.v;
    }

    public final void c1(int i, int i2, boolean z, ai0 ai0Var) {
        boolean z2;
        int i3;
        int k;
        b60 b60Var = this.q;
        boolean z3 = false;
        int i4 = 1;
        if (this.r.i() == 0 && this.r.f() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        b60Var.l = z2;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(ai0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i == 1) {
            z3 = true;
        }
        b60 b60Var2 = this.q;
        if (z3) {
            i3 = max2;
        } else {
            i3 = max;
        }
        b60Var2.h = i3;
        if (!z3) {
            max = max2;
        }
        b60Var2.i = max;
        if (z3) {
            b60Var2.h = this.r.h() + i3;
            View R0 = R0();
            b60 b60Var3 = this.q;
            if (this.u) {
                i4 = -1;
            }
            b60Var3.e = i4;
            int H = oh0.H(R0);
            b60 b60Var4 = this.q;
            b60Var3.d = H + b60Var4.e;
            b60Var4.b = this.r.b(R0);
            k = this.r.b(R0) - this.r.g();
        } else {
            View S0 = S0();
            b60 b60Var5 = this.q;
            b60Var5.h = this.r.k() + b60Var5.h;
            b60 b60Var6 = this.q;
            if (!this.u) {
                i4 = -1;
            }
            b60Var6.e = i4;
            int H2 = oh0.H(S0);
            b60 b60Var7 = this.q;
            b60Var6.d = H2 + b60Var7.e;
            b60Var7.b = this.r.e(S0);
            k = (-this.r.e(S0)) + this.r.k();
        }
        b60 b60Var8 = this.q;
        b60Var8.c = i2;
        if (z) {
            b60Var8.c = i2 - k;
        }
        b60Var8.g = k;
    }

    @Override // defpackage.oh0
    public final boolean d() {
        if (this.p == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.oh0
    public void d0(ai0 ai0Var) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.c();
    }

    public final void d1(int i, int i2) {
        int i3;
        this.q.c = this.r.g() - i2;
        b60 b60Var = this.q;
        if (this.u) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        b60Var.e = i3;
        b60Var.d = i;
        b60Var.f = 1;
        b60Var.b = i2;
        b60Var.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.oh0
    public final boolean e() {
        if (this.p == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.oh0
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof c60) {
            c60 c60Var = (c60) parcelable;
            this.z = c60Var;
            if (this.x != -1) {
                c60Var.c = -1;
            }
            m0();
        }
    }

    public final void e1(int i, int i2) {
        int i3;
        this.q.c = i2 - this.r.k();
        b60 b60Var = this.q;
        b60Var.d = i;
        if (this.u) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        b60Var.e = i3;
        b60Var.f = -1;
        b60Var.b = i2;
        b60Var.g = Integer.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, c60] */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.os.Parcelable, java.lang.Object, c60] */
    @Override // defpackage.oh0
    public final Parcelable f0() {
        c60 c60Var = this.z;
        if (c60Var != null) {
            ?? obj = new Object();
            obj.c = c60Var.c;
            obj.d = c60Var.d;
            obj.e = c60Var.e;
            return obj;
        }
        ?? obj2 = new Object();
        if (v() > 0) {
            H0();
            boolean z = this.s ^ this.u;
            obj2.e = z;
            if (z) {
                View R0 = R0();
                obj2.d = this.r.g() - this.r.b(R0);
                obj2.c = oh0.H(R0);
                return obj2;
            }
            View S0 = S0();
            obj2.c = oh0.H(S0);
            obj2.d = this.r.e(S0) - this.r.k();
            return obj2;
        }
        obj2.c = -1;
        return obj2;
    }

    @Override // defpackage.oh0
    public final void h(int i, int i2, ai0 ai0Var, qz qzVar) {
        int i3;
        if (this.p != 0) {
            i = i2;
        }
        if (v() != 0 && i != 0) {
            H0();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            c1(i3, Math.abs(i), true, ai0Var);
            C0(ai0Var, this.q, qzVar);
        }
    }

    @Override // defpackage.oh0
    public final void i(int i, qz qzVar) {
        boolean z;
        int i2;
        c60 c60Var = this.z;
        int i3 = -1;
        if (c60Var != null && (i2 = c60Var.c) >= 0) {
            z = c60Var.e;
        } else {
            Y0();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            qzVar.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // defpackage.oh0
    public final int j(ai0 ai0Var) {
        return D0(ai0Var);
    }

    @Override // defpackage.oh0
    public int k(ai0 ai0Var) {
        return E0(ai0Var);
    }

    @Override // defpackage.oh0
    public int l(ai0 ai0Var) {
        return F0(ai0Var);
    }

    @Override // defpackage.oh0
    public final int m(ai0 ai0Var) {
        return D0(ai0Var);
    }

    @Override // defpackage.oh0
    public int n(ai0 ai0Var) {
        return E0(ai0Var);
    }

    @Override // defpackage.oh0
    public int n0(int i, uh0 uh0Var, ai0 ai0Var) {
        if (this.p == 1) {
            return 0;
        }
        return Z0(i, uh0Var, ai0Var);
    }

    @Override // defpackage.oh0
    public int o(ai0 ai0Var) {
        return F0(ai0Var);
    }

    @Override // defpackage.oh0
    public final void o0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        c60 c60Var = this.z;
        if (c60Var != null) {
            c60Var.c = -1;
        }
        m0();
    }

    @Override // defpackage.oh0
    public int p0(int i, uh0 uh0Var, ai0 ai0Var) {
        if (this.p == 0) {
            return 0;
        }
        return Z0(i, uh0Var, ai0Var);
    }

    @Override // defpackage.oh0
    public final View q(int i) {
        int v = v();
        if (v == 0) {
            return null;
        }
        int H = i - oh0.H(u(0));
        if (H >= 0 && H < v) {
            View u = u(H);
            if (oh0.H(u) == i) {
                return u;
            }
        }
        return super.q(i);
    }

    @Override // defpackage.oh0
    public ph0 r() {
        return new ph0(-2, -2);
    }

    @Override // defpackage.oh0
    public final boolean w0() {
        if (this.m != 1073741824 && this.l != 1073741824) {
            int v = v();
            for (int i = 0; i < v; i++) {
                ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.oh0
    public void y0(RecyclerView recyclerView, int i) {
        d60 d60Var = new d60(recyclerView.getContext());
        d60Var.a = i;
        z0(d60Var);
    }

    @Override // defpackage.oh0
    public final void S(RecyclerView recyclerView) {
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, a60] */
    public LinearLayoutManager(int i) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new z50();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        a1(i);
        c(null);
        if (this.t) {
            this.t = false;
            m0();
        }
    }

    public void V0(uh0 uh0Var, ai0 ai0Var, z50 z50Var, int i) {
    }
}
