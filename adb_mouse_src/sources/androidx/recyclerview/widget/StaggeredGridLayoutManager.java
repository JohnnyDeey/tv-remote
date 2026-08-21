package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.ai0;
import defpackage.c;
import defpackage.c50;
import defpackage.d60;
import defpackage.gp0;
import defpackage.hp0;
import defpackage.jp0;
import defpackage.kp0;
import defpackage.l9;
import defpackage.nh0;
import defpackage.oh0;
import defpackage.ph0;
import defpackage.qz;
import defpackage.ry0;
import defpackage.s70;
import defpackage.uh0;
import defpackage.wg0;
import defpackage.ws;
import defpackage.zh0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends oh0 implements zh0 {
    public final jp0 B;
    public final int C;
    public boolean D;
    public boolean E;
    public kp0 F;
    public final Rect G;
    public final gp0 H;
    public final boolean I;
    public int[] J;
    public final l9 K;
    public final int p;
    public final s70[] q;
    public final ws r;
    public final ws s;
    public final int t;
    public int u;
    public final c50 v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, c50] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        jp0 jp0Var = new jp0(0, (boolean) (0 == true ? 1 : 0));
        this.B = jp0Var;
        this.C = 2;
        this.G = new Rect();
        this.H = new gp0(this);
        this.I = true;
        this.K = new l9(13, this);
        nh0 I = oh0.I(context, attributeSet, i, i2);
        int i3 = I.a;
        if (i3 != 0 && i3 != 1) {
            c.k("invalid orientation.");
            throw null;
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            ws wsVar = this.r;
            this.r = this.s;
            this.s = wsVar;
            m0();
        }
        int i4 = I.b;
        c(null);
        if (i4 != this.p) {
            jp0Var.b();
            m0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new s70[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new s70(this, i5);
            }
            m0();
        }
        boolean z = I.c;
        c(null);
        kp0 kp0Var = this.F;
        if (kp0Var != null && kp0Var.j != z) {
            kp0Var.j = z;
        }
        this.w = z;
        m0();
        ?? obj = new Object();
        obj.a = true;
        obj.f = 0;
        obj.g = 0;
        this.v = obj;
        this.r = ws.a(this, this.t);
        this.s = ws.a(this, 1 - this.t);
    }

    public static int b1(int i, int i2, int i3) {
        int mode;
        if ((i2 == 0 && i3 == 0) || ((mode = View.MeasureSpec.getMode(i)) != Integer.MIN_VALUE && mode != 1073741824)) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    @Override // defpackage.oh0
    public final boolean A0() {
        if (this.F == null) {
            return true;
        }
        return false;
    }

    public final boolean B0() {
        int I0;
        if (v() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                I0 = J0();
                I0();
            } else {
                I0 = I0();
                J0();
            }
            if (I0 == 0 && N0() != null) {
                this.B.b();
                this.f = true;
                m0();
                return true;
            }
        }
        return false;
    }

    public final int C0(ai0 ai0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return wg0.f(ai0Var, this.r, F0(z), E0(z), this, this.I, this.x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0270, code lost:
    
        T0(r1, r7);
     */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int D0(defpackage.uh0 r25, defpackage.c50 r26, defpackage.ai0 r27) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.D0(uh0, c50, ai0):int");
    }

    public final View E0(boolean z) {
        ws wsVar = this.r;
        int k = wsVar.k();
        int g = wsVar.g();
        View view = null;
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            int e = wsVar.e(u);
            int b = wsVar.b(u);
            if (b > k && e < g) {
                if (b > g && z) {
                    if (view == null) {
                        view = u;
                    }
                } else {
                    return u;
                }
            }
        }
        return view;
    }

    public final View F0(boolean z) {
        ws wsVar = this.r;
        int k = wsVar.k();
        int g = wsVar.g();
        int v = v();
        View view = null;
        for (int i = 0; i < v; i++) {
            View u = u(i);
            int e = wsVar.e(u);
            if (wsVar.b(u) > k && e < g) {
                if (e < k && z) {
                    if (view == null) {
                        view = u;
                    }
                } else {
                    return u;
                }
            }
        }
        return view;
    }

    public final void G0(uh0 uh0Var, ai0 ai0Var, boolean z) {
        int g;
        int K0 = K0(Integer.MIN_VALUE);
        if (K0 != Integer.MIN_VALUE && (g = this.r.g() - K0) > 0) {
            int i = g - (-X0(-g, uh0Var, ai0Var));
            if (z && i > 0) {
                this.r.o(i);
            }
        }
    }

    public final void H0(uh0 uh0Var, ai0 ai0Var, boolean z) {
        int k;
        int L0 = L0(Integer.MAX_VALUE);
        if (L0 != Integer.MAX_VALUE && (k = L0 - this.r.k()) > 0) {
            int X0 = k - X0(k, uh0Var, ai0Var);
            if (z && X0 > 0) {
                this.r.o(-X0);
            }
        }
    }

    public final int I0() {
        if (v() == 0) {
            return 0;
        }
        return oh0.H(u(0));
    }

    public final int J0() {
        int v = v();
        if (v == 0) {
            return 0;
        }
        return oh0.H(u(v - 1));
    }

    public final int K0(int i) {
        int g = this.q[0].g(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int g2 = this.q[i2].g(i);
            if (g2 > g) {
                g = g2;
            }
        }
        return g;
    }

    @Override // defpackage.oh0
    public final boolean L() {
        if (this.C != 0) {
            return true;
        }
        return false;
    }

    public final int L0(int i) {
        int i2 = this.q[0].i(i);
        for (int i3 = 1; i3 < this.p; i3++) {
            int i4 = this.q[i3].i(i);
            if (i4 < i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M0(int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.M0(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View N0() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N0():android.view.View");
    }

    @Override // defpackage.oh0
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            s70 s70Var = this.q[i2];
            int i3 = s70Var.b;
            if (i3 != Integer.MIN_VALUE) {
                s70Var.b = i3 + i;
            }
            int i4 = s70Var.c;
            if (i4 != Integer.MIN_VALUE) {
                s70Var.c = i4 + i;
            }
        }
    }

    public final boolean O0() {
        if (C() == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.oh0
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            s70 s70Var = this.q[i2];
            int i3 = s70Var.b;
            if (i3 != Integer.MIN_VALUE) {
                s70Var.b = i3 + i;
            }
            int i4 = s70Var.c;
            if (i4 != Integer.MIN_VALUE) {
                s70Var.c = i4 + i;
            }
        }
    }

    public final void P0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        hp0 hp0Var = (hp0) view.getLayoutParams();
        int b1 = b1(i, ((ViewGroup.MarginLayoutParams) hp0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) hp0Var).rightMargin + rect.right);
        int b12 = b1(i2, ((ViewGroup.MarginLayoutParams) hp0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) hp0Var).bottomMargin + rect.bottom);
        if (v0(view, b1, b12, hp0Var)) {
            view.measure(b1, b12);
        }
    }

    @Override // defpackage.oh0
    public final void Q() {
        this.B.b();
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018b, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0187, code lost:
    
        if (r4 != r17.x) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0179, code lost:
    
        if (r17.x != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0189, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0(defpackage.uh0 r18, defpackage.ai0 r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q0(uh0, ai0, boolean):void");
    }

    public final boolean R0(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.t == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 == this.x) {
                return false;
            }
            return true;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.x) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != O0()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.oh0
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final void S0(int i, ai0 ai0Var) {
        int I0;
        int i2;
        if (i > 0) {
            I0 = J0();
            i2 = 1;
        } else {
            I0 = I0();
            i2 = -1;
        }
        c50 c50Var = this.v;
        c50Var.a = true;
        Z0(I0, ai0Var);
        Y0(i2);
        c50Var.c = I0 + c50Var.d;
        c50Var.b = Math.abs(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x004d, code lost:
    
        if (r0 == 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0051, code lost:
    
        if (r0 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x005b, code lost:
    
        if (O0() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0065, code lost:
    
        if (O0() == false) goto L34;
     */
    @Override // defpackage.oh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View T(android.view.View r9, int r10, defpackage.uh0 r11, defpackage.ai0 r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T(android.view.View, int, uh0, ai0):android.view.View");
    }

    public final void T0(uh0 uh0Var, c50 c50Var) {
        if (c50Var.a && !c50Var.i) {
            int i = c50Var.b;
            int i2 = c50Var.e;
            if (i == 0) {
                if (i2 == -1) {
                    U0(uh0Var, c50Var.g);
                    return;
                } else {
                    V0(uh0Var, c50Var.f);
                    return;
                }
            }
            int i3 = this.p;
            s70[] s70VarArr = this.q;
            int i4 = 1;
            if (i2 == -1) {
                int i5 = c50Var.f;
                int i6 = s70VarArr[0].i(i5);
                while (i4 < i3) {
                    int i7 = s70VarArr[i4].i(i5);
                    if (i7 > i6) {
                        i6 = i7;
                    }
                    i4++;
                }
                int i8 = i5 - i6;
                int i9 = c50Var.g;
                if (i8 >= 0) {
                    i9 -= Math.min(i8, c50Var.b);
                }
                U0(uh0Var, i9);
                return;
            }
            int i10 = c50Var.g;
            int g = s70VarArr[0].g(i10);
            while (i4 < i3) {
                int g2 = s70VarArr[i4].g(i10);
                if (g2 < g) {
                    g = g2;
                }
                i4++;
            }
            int i11 = g - c50Var.g;
            int i12 = c50Var.f;
            if (i11 >= 0) {
                i12 += Math.min(i11, c50Var.b);
            }
            V0(uh0Var, i12);
        }
    }

    @Override // defpackage.oh0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View F0 = F0(false);
            View E0 = E0(false);
            if (F0 != null && E0 != null) {
                int H = oh0.H(F0);
                int H2 = oh0.H(E0);
                if (H < H2) {
                    accessibilityEvent.setFromIndex(H);
                    accessibilityEvent.setToIndex(H2);
                } else {
                    accessibilityEvent.setFromIndex(H2);
                    accessibilityEvent.setToIndex(H);
                }
            }
        }
    }

    public final void U0(uh0 uh0Var, int i) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            ws wsVar = this.r;
            if (wsVar.e(u) >= i && wsVar.n(u) >= i) {
                hp0 hp0Var = (hp0) u.getLayoutParams();
                hp0Var.getClass();
                if (((ArrayList) hp0Var.e.f).size() != 1) {
                    s70 s70Var = hp0Var.e;
                    ArrayList arrayList = (ArrayList) s70Var.f;
                    int size = arrayList.size();
                    View view = (View) arrayList.remove(size - 1);
                    hp0 hp0Var2 = (hp0) view.getLayoutParams();
                    hp0Var2.e = null;
                    if (hp0Var2.a.h() || hp0Var2.a.k()) {
                        s70Var.d -= ((StaggeredGridLayoutManager) s70Var.g).r.c(view);
                    }
                    if (size == 1) {
                        s70Var.b = Integer.MIN_VALUE;
                    }
                    s70Var.c = Integer.MIN_VALUE;
                    j0(u, uh0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void V0(uh0 uh0Var, int i) {
        while (v() > 0) {
            View u = u(0);
            ws wsVar = this.r;
            if (wsVar.b(u) <= i && wsVar.m(u) <= i) {
                hp0 hp0Var = (hp0) u.getLayoutParams();
                hp0Var.getClass();
                if (((ArrayList) hp0Var.e.f).size() != 1) {
                    s70 s70Var = hp0Var.e;
                    ArrayList arrayList = (ArrayList) s70Var.f;
                    View view = (View) arrayList.remove(0);
                    hp0 hp0Var2 = (hp0) view.getLayoutParams();
                    hp0Var2.e = null;
                    if (arrayList.size() == 0) {
                        s70Var.c = Integer.MIN_VALUE;
                    }
                    if (hp0Var2.a.h() || hp0Var2.a.k()) {
                        s70Var.d -= ((StaggeredGridLayoutManager) s70Var.g).r.c(view);
                    }
                    s70Var.b = Integer.MIN_VALUE;
                    j0(u, uh0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void W0() {
        if (this.t != 1 && O0()) {
            this.x = !this.w;
        } else {
            this.x = this.w;
        }
    }

    @Override // defpackage.oh0
    public final void X(int i, int i2) {
        M0(i, i2, 1);
    }

    public final int X0(int i, uh0 uh0Var, ai0 ai0Var) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        S0(i, ai0Var);
        c50 c50Var = this.v;
        int D0 = D0(uh0Var, c50Var, ai0Var);
        if (c50Var.b >= D0) {
            if (i < 0) {
                i = -D0;
            } else {
                i = D0;
            }
        }
        this.r.o(-i);
        this.D = this.x;
        c50Var.b = 0;
        T0(uh0Var, c50Var);
        return i;
    }

    @Override // defpackage.oh0
    public final void Y() {
        this.B.b();
        m0();
    }

    public final void Y0(int i) {
        boolean z;
        c50 c50Var = this.v;
        c50Var.e = i;
        boolean z2 = this.x;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        c50Var.d = i2;
    }

    @Override // defpackage.oh0
    public final void Z(int i, int i2) {
        M0(i, i2, 8);
    }

    public final void Z0(int i, ai0 ai0Var) {
        int i2;
        int i3;
        int i4;
        boolean z;
        c50 c50Var = this.v;
        boolean z2 = false;
        c50Var.b = 0;
        c50Var.c = i;
        d60 d60Var = this.e;
        ws wsVar = this.r;
        if (d60Var != null && d60Var.e && (i4 = ai0Var.a) != -1) {
            boolean z3 = this.x;
            if (i4 < i) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                i2 = wsVar.l();
                i3 = 0;
            } else {
                i3 = wsVar.l();
                i2 = 0;
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.i) {
            c50Var.f = wsVar.k() - i3;
            c50Var.g = wsVar.g() + i2;
        } else {
            c50Var.g = wsVar.f() + i2;
            c50Var.f = -i3;
        }
        c50Var.h = false;
        c50Var.a = true;
        if (wsVar.i() == 0 && wsVar.f() == 0) {
            z2 = true;
        }
        c50Var.i = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if (r4 != r3.x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // defpackage.zh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF a(int r4) {
        /*
            r3 = this;
            int r0 = r3.v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.I0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r3 = 0
            return r3
        L24:
            int r3 = r3.t
            r0 = 0
            if (r3 != 0) goto L2f
            float r3 = (float) r1
            r4.x = r3
            r4.y = r0
            return r4
        L2f:
            r4.x = r0
            float r3 = (float) r1
            r4.y = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int):android.graphics.PointF");
    }

    @Override // defpackage.oh0
    public final void a0(int i, int i2) {
        M0(i, i2, 2);
    }

    public final void a1(s70 s70Var, int i, int i2) {
        int i3 = s70Var.d;
        int i4 = s70Var.e;
        BitSet bitSet = this.y;
        if (i == -1) {
            int i5 = s70Var.b;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) ((ArrayList) s70Var.f).get(0);
                hp0 hp0Var = (hp0) view.getLayoutParams();
                s70Var.b = ((StaggeredGridLayoutManager) s70Var.g).r.e(view);
                hp0Var.getClass();
                i5 = s70Var.b;
            }
            if (i5 + i3 <= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = s70Var.c;
        if (i6 == Integer.MIN_VALUE) {
            s70Var.a();
            i6 = s70Var.c;
        }
        if (i6 - i3 >= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // defpackage.oh0
    public final void b0(int i, int i2) {
        M0(i, i2, 4);
    }

    @Override // defpackage.oh0
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // defpackage.oh0
    public final void c0(uh0 uh0Var, ai0 ai0Var) {
        Q0(uh0Var, ai0Var, true);
    }

    @Override // defpackage.oh0
    public final boolean d() {
        if (this.t == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.oh0
    public final void d0(ai0 ai0Var) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // defpackage.oh0
    public final boolean e() {
        if (this.t == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.oh0
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof kp0) {
            kp0 kp0Var = (kp0) parcelable;
            this.F = kp0Var;
            if (this.z != -1) {
                kp0Var.c = -1;
                kp0Var.d = -1;
                kp0Var.f = null;
                kp0Var.e = 0;
                kp0Var.g = 0;
                kp0Var.h = null;
                kp0Var.i = null;
            }
            m0();
        }
    }

    @Override // defpackage.oh0
    public final boolean f(ph0 ph0Var) {
        return ph0Var instanceof hp0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, kp0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.os.Parcelable, java.lang.Object, kp0] */
    @Override // defpackage.oh0
    public final Parcelable f0() {
        int I0;
        View F0;
        int i;
        int k;
        int[] iArr;
        kp0 kp0Var = this.F;
        if (kp0Var != null) {
            ?? obj = new Object();
            obj.e = kp0Var.e;
            obj.c = kp0Var.c;
            obj.d = kp0Var.d;
            obj.f = kp0Var.f;
            obj.g = kp0Var.g;
            obj.h = kp0Var.h;
            obj.j = kp0Var.j;
            obj.k = kp0Var.k;
            obj.l = kp0Var.l;
            obj.i = kp0Var.i;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.j = this.w;
        obj2.k = this.D;
        obj2.l = this.E;
        jp0 jp0Var = this.B;
        if (jp0Var != null && (iArr = (int[]) jp0Var.d) != null) {
            obj2.h = iArr;
            obj2.g = iArr.length;
            obj2.i = (ArrayList) jp0Var.e;
        } else {
            obj2.g = 0;
        }
        int i2 = -1;
        if (v() > 0) {
            if (this.D) {
                I0 = J0();
            } else {
                I0 = I0();
            }
            obj2.c = I0;
            if (this.x) {
                F0 = E0(true);
            } else {
                F0 = F0(true);
            }
            if (F0 != null) {
                i2 = oh0.H(F0);
            }
            obj2.d = i2;
            int i3 = this.p;
            obj2.e = i3;
            obj2.f = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                boolean z = this.D;
                ws wsVar = this.r;
                s70[] s70VarArr = this.q;
                if (z) {
                    i = s70VarArr[i4].g(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        k = wsVar.g();
                        i -= k;
                        obj2.f[i4] = i;
                    } else {
                        obj2.f[i4] = i;
                    }
                } else {
                    i = s70VarArr[i4].i(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        k = wsVar.k();
                        i -= k;
                        obj2.f[i4] = i;
                    } else {
                        obj2.f[i4] = i;
                    }
                }
            }
            return obj2;
        }
        obj2.c = -1;
        obj2.d = -1;
        obj2.e = 0;
        return obj2;
    }

    @Override // defpackage.oh0
    public final void g0(int i) {
        if (i == 0) {
            B0();
        }
    }

    @Override // defpackage.oh0
    public final void h(int i, int i2, ai0 ai0Var, qz qzVar) {
        c50 c50Var;
        int g;
        if (this.t != 0) {
            i = i2;
        }
        if (v() != 0 && i != 0) {
            S0(i, ai0Var);
            int[] iArr = this.J;
            int i3 = this.p;
            if (iArr == null || iArr.length < i3) {
                this.J = new int[i3];
            }
            int i4 = 0;
            int i5 = 0;
            while (true) {
                c50Var = this.v;
                if (i4 >= i3) {
                    break;
                }
                int i6 = c50Var.d;
                s70[] s70VarArr = this.q;
                if (i6 == -1) {
                    int i7 = c50Var.f;
                    g = i7 - s70VarArr[i4].i(i7);
                } else {
                    g = s70VarArr[i4].g(c50Var.g) - c50Var.g;
                }
                if (g >= 0) {
                    this.J[i5] = g;
                    i5++;
                }
                i4++;
            }
            Arrays.sort(this.J, 0, i5);
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = c50Var.c;
                if (i9 >= 0 && i9 < ai0Var.b()) {
                    qzVar.a(c50Var.c, this.J[i8]);
                    c50Var.c += c50Var.d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.oh0
    public final int j(ai0 ai0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return wg0.e(ai0Var, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.oh0
    public final int k(ai0 ai0Var) {
        return C0(ai0Var);
    }

    @Override // defpackage.oh0
    public final int l(ai0 ai0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return wg0.g(ai0Var, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.oh0
    public final int m(ai0 ai0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return wg0.e(ai0Var, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.oh0
    public final int n(ai0 ai0Var) {
        return C0(ai0Var);
    }

    @Override // defpackage.oh0
    public final int n0(int i, uh0 uh0Var, ai0 ai0Var) {
        return X0(i, uh0Var, ai0Var);
    }

    @Override // defpackage.oh0
    public final int o(ai0 ai0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return wg0.g(ai0Var, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.oh0
    public final void o0(int i) {
        kp0 kp0Var = this.F;
        if (kp0Var != null && kp0Var.c != i) {
            kp0Var.f = null;
            kp0Var.e = 0;
            kp0Var.c = -1;
            kp0Var.d = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        m0();
    }

    @Override // defpackage.oh0
    public final int p0(int i, uh0 uh0Var, ai0 ai0Var) {
        return X0(i, uh0Var, ai0Var);
    }

    @Override // defpackage.oh0
    public final ph0 r() {
        if (this.t == 0) {
            return new ph0(-2, -1);
        }
        return new ph0(-1, -2);
    }

    @Override // defpackage.oh0
    public final ph0 s(Context context, AttributeSet attributeSet) {
        return new ph0(context, attributeSet);
    }

    @Override // defpackage.oh0
    public final void s0(Rect rect, int i, int i2) {
        int g;
        int g2;
        int F = F() + E();
        int D = D() + G();
        int i3 = this.t;
        int i4 = this.p;
        if (i3 == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = ry0.a;
            g2 = oh0.g(i2, height, recyclerView.getMinimumHeight());
            g = oh0.g(i, (this.u * i4) + F, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = ry0.a;
            g = oh0.g(i, width, recyclerView2.getMinimumWidth());
            g2 = oh0.g(i2, (this.u * i4) + D, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g, g2);
    }

    @Override // defpackage.oh0
    public final ph0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new ph0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new ph0(layoutParams);
    }

    @Override // defpackage.oh0
    public final void y0(RecyclerView recyclerView, int i) {
        d60 d60Var = new d60(recyclerView.getContext());
        d60Var.a = i;
        z0(d60Var);
    }
}
