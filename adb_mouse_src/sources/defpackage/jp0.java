package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class jp0 implements ad0, p61 {
    public final /* synthetic */ int c;
    public Object d;
    public Object e;

    public jp0(int i) {
        this.c = i;
        switch (i) {
            case 3:
                this.d = new io0(0);
                this.e = new r70();
                return;
            case 8:
                this.d = Collections.synchronizedMap(new WeakHashMap());
                this.e = Collections.synchronizedMap(new WeakHashMap());
                return;
            case 9:
                a00 a00Var = a00.c;
                this.d = new SparseIntArray();
                this.e = a00Var;
                return;
            default:
                this.d = new j40(128);
                this.e = new ik0(256);
                return;
        }
    }

    public void a(di0 di0Var, yb0 yb0Var) {
        io0 io0Var = (io0) this.d;
        xy0 xy0Var = (xy0) io0Var.get(di0Var);
        if (xy0Var == null) {
            xy0Var = xy0.a();
            io0Var.put(di0Var, xy0Var);
        }
        xy0Var.c = yb0Var;
        xy0Var.a |= 8;
    }

    public void b() {
        int[] iArr = (int[]) this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.e = null;
    }

    public void c(int i) {
        int[] iArr = (int[]) this.d;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.d;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View d(int i, int i2, int i3, int i4) {
        int i5;
        View u;
        dy0 dy0Var = (dy0) this.e;
        mh0 mh0Var = (mh0) this.d;
        int d = mh0Var.d();
        int c = mh0Var.c();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            switch (mh0Var.a) {
                case 0:
                    u = mh0Var.b.u(i);
                    break;
                default:
                    u = mh0Var.b.u(i);
                    break;
            }
            int b = mh0Var.b(u);
            int a = mh0Var.a(u);
            dy0Var.b = d;
            dy0Var.c = c;
            dy0Var.d = b;
            dy0Var.e = a;
            if (i3 != 0) {
                dy0Var.a = i3;
                if (dy0Var.a()) {
                    return u;
                }
            }
            if (i4 != 0) {
                dy0Var.a = i4;
                if (dy0Var.a()) {
                    view = u;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean e(View view) {
        dy0 dy0Var = (dy0) this.e;
        mh0 mh0Var = (mh0) this.d;
        int d = mh0Var.d();
        int c = mh0Var.c();
        int b = mh0Var.b(view);
        int a = mh0Var.a(view);
        dy0Var.b = d;
        dy0Var.c = c;
        dy0Var.d = b;
        dy0Var.e = a;
        dy0Var.a = 24579;
        return dy0Var.a();
    }

    public void f(int i, int i2) {
        int[] iArr = (int[]) this.d;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = (int[]) this.d;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill((int[]) this.d, i, i3, -1);
            ArrayList arrayList = (ArrayList) this.e;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ip0 ip0Var = (ip0) ((ArrayList) this.e).get(size);
                    int i4 = ip0Var.c;
                    if (i4 >= i) {
                        ip0Var.c = i4 + i2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    @Override // defpackage.ad0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.m11 g(android.view.View r18, defpackage.m11 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r3 = r0.d
            yd r3 = (defpackage.yd) r3
            java.lang.Object r0 = r0.e
            jz0 r0 = (defpackage.jz0) r0
            int r4 = r0.a
            int r5 = r0.b
            int r0 = r0.c
            i11 r6 = r2.a
            r7 = 519(0x207, float:7.27E-43)
            d20 r7 = r6.h(r7)
            r8 = 32
            d20 r6 = r6.h(r8)
            java.lang.Object r8 = r3.b
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r8
            int r9 = r7.b
            int r10 = r7.c
            int r11 = r7.a
            r8.w = r9
            int r9 = r1.getLayoutDirection()
            r13 = 1
            if (r9 != r13) goto L37
            r9 = r13
            goto L38
        L37:
            r9 = 0
        L38:
            int r14 = r1.getPaddingBottom()
            int r15 = r1.getPaddingLeft()
            int r16 = r1.getPaddingRight()
            boolean r12 = r8.o
            if (r12 == 0) goto L4f
            int r14 = r2.a()
            r8.v = r14
            int r14 = r14 + r0
        L4f:
            boolean r0 = r8.p
            if (r0 == 0) goto L5a
            if (r9 == 0) goto L57
            r0 = r5
            goto L58
        L57:
            r0 = r4
        L58:
            int r15 = r0 + r11
        L5a:
            boolean r0 = r8.q
            if (r0 == 0) goto L64
            if (r9 == 0) goto L61
            goto L62
        L61:
            r4 = r5
        L62:
            int r16 = r4 + r10
        L64:
            r0 = r16
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            boolean r5 = r8.s
            if (r5 == 0) goto L78
            int r5 = r4.leftMargin
            if (r5 == r11) goto L78
            r4.leftMargin = r11
            r5 = r13
            goto L79
        L78:
            r5 = 0
        L79:
            boolean r9 = r8.t
            if (r9 == 0) goto L84
            int r9 = r4.rightMargin
            if (r9 == r10) goto L84
            r4.rightMargin = r10
            r5 = r13
        L84:
            boolean r9 = r8.u
            if (r9 == 0) goto L91
            int r9 = r4.topMargin
            int r7 = r7.b
            if (r9 == r7) goto L91
            r4.topMargin = r7
            goto L92
        L91:
            r13 = r5
        L92:
            if (r13 == 0) goto L97
            r1.setLayoutParams(r4)
        L97:
            int r4 = r1.getPaddingTop()
            r1.setPadding(r15, r4, r0, r14)
            boolean r0 = r3.a
            if (r0 == 0) goto La6
            int r1 = r6.d
            r8.m = r1
        La6:
            if (r12 != 0) goto Lac
            if (r0 == 0) goto Lab
            goto Lac
        Lab:
            return r2
        Lac:
            r8.I()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp0.g(android.view.View, m11):m11");
    }

    public void h(int i, int i2) {
        int[] iArr = (int[]) this.d;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = (int[]) this.d;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = (int[]) this.d;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            ArrayList arrayList = (ArrayList) this.e;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ip0 ip0Var = (ip0) ((ArrayList) this.e).get(size);
                    int i4 = ip0Var.c;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            ((ArrayList) this.e).remove(size);
                        } else {
                            ip0Var.c = i4 - i2;
                        }
                    }
                }
            }
        }
    }

    public yb0 i(di0 di0Var, int i) {
        xy0 xy0Var;
        yb0 yb0Var;
        io0 io0Var = (io0) this.d;
        int d = io0Var.d(di0Var);
        if (d >= 0 && (xy0Var = (xy0) io0Var.i(d)) != null) {
            int i2 = xy0Var.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                xy0Var.a = i3;
                if (i == 4) {
                    yb0Var = xy0Var.b;
                } else if (i == 8) {
                    yb0Var = xy0Var.c;
                } else {
                    c.k("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    io0Var.g(d);
                    xy0Var.a = 0;
                    xy0Var.b = null;
                    xy0Var.c = null;
                    xy0.d.c(xy0Var);
                }
                return yb0Var;
            }
        }
        return null;
    }

    public void j(di0 di0Var) {
        xy0 xy0Var = (xy0) ((io0) this.d).get(di0Var);
        if (xy0Var == null) {
            return;
        }
        xy0Var.a &= -2;
    }

    public void k(di0 di0Var) {
        r70 r70Var = (r70) this.e;
        int e = r70Var.e() - 1;
        while (true) {
            if (e < 0) {
                break;
            }
            if (di0Var == r70Var.f(e)) {
                Object[] objArr = r70Var.e;
                Object obj = objArr[e];
                Object obj2 = wv0.k;
                if (obj != obj2) {
                    objArr[e] = obj2;
                    r70Var.c = true;
                }
            } else {
                e--;
            }
        }
        xy0 xy0Var = (xy0) ((io0) this.d).remove(di0Var);
        if (xy0Var != null) {
            xy0Var.a = 0;
            xy0Var.b = null;
            xy0Var.c = null;
            xy0.d.c(xy0Var);
        }
    }

    public void l(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.d)) {
            hashMap = new HashMap((Map) this.d);
        }
        synchronized (((Map) this.e)) {
            hashMap2 = new HashMap((Map) this.e);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                c.a();
                return;
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((zq0) entry2.getKey()).a(new b5(status));
            }
        }
    }

    public void m(g91 g91Var) {
        try {
            t(g91Var, (t91) this.d);
        } catch (Throwable th) {
            m51.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void n(g91 g91Var, int i, long j) {
        try {
            s91 s91Var = (s91) ((t91) this.d).l();
            s91Var.b();
            t91.D((t91) s91Var.d, i);
            t91 t91Var = (t91) s91Var.a();
            this.d = t91Var;
            if (j != 0) {
                s91 s91Var2 = (s91) t91Var.l();
                s91Var2.b();
                t91.F((t91) s91Var2.d, j);
                t91Var = (t91) s91Var2.a();
            }
            t(g91Var, t91Var);
        } catch (Throwable th) {
            m51.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void o(g91 g91Var, long j, boolean z) {
        try {
            f91 f91Var = (f91) g91Var.l();
            w91 w91Var = (w91) g91Var.v().l();
            w91Var.b();
            z91.r((z91) w91Var.d, z);
            f91Var.b();
            g91.q((g91) f91Var.d, (z91) w91Var.a());
            g91 g91Var2 = (g91) f91Var.a();
            t91 t91Var = (t91) this.d;
            if (j != 0) {
                s91 s91Var = (s91) t91Var.l();
                s91Var.b();
                t91.F((t91) s91Var.d, j);
                t91Var = (t91) s91Var.a();
            }
            t(g91Var2, t91Var);
        } catch (Throwable th) {
            m51.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void p(g91 g91Var, int i, long j, boolean z) {
        try {
            s91 s91Var = (s91) ((t91) this.d).l();
            s91Var.b();
            t91.D((t91) s91Var.d, i);
            this.d = (t91) s91Var.a();
            f91 f91Var = (f91) g91Var.l();
            w91 w91Var = (w91) g91Var.v().l();
            w91Var.b();
            z91.r((z91) w91Var.d, z);
            f91Var.b();
            g91.q((g91) f91Var.d, (z91) w91Var.a());
            g91 g91Var2 = (g91) f91Var.a();
            t91 t91Var = (t91) this.d;
            if (j != 0) {
                s91 s91Var2 = (s91) t91Var.l();
                s91Var2.b();
                t91.F((t91) s91Var2.d, j);
                t91Var = (t91) s91Var2.a();
            }
            t(g91Var2, t91Var);
        } catch (Throwable th) {
            m51.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void q(p91 p91Var) {
        try {
            aa1 r = ba1.r();
            r.c((t91) this.d);
            r.b();
            ba1.u((ba1) r.d, p91Var);
            ((yd) this.e).c((ba1) r.a());
        } catch (Throwable th) {
            m51.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void r(ea1 ea1Var) {
        try {
            yd ydVar = (yd) this.e;
            aa1 r = ba1.r();
            r.c((t91) this.d);
            r.b();
            ba1.w((ba1) r.d, ea1Var);
            ydVar.c((ba1) r.a());
        } catch (Throwable th) {
            m51.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void s(fa1 fa1Var) {
        if (fa1Var == null) {
            return;
        }
        try {
            aa1 r = ba1.r();
            r.c((t91) this.d);
            r.b();
            ba1.q((ba1) r.d, fa1Var);
            ((yd) this.e).c((ba1) r.a());
        } catch (Throwable th) {
            m51.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void t(g91 g91Var, t91 t91Var) {
        if (g91Var == null) {
            return;
        }
        try {
            aa1 r = ba1.r();
            r.c(t91Var);
            r.b();
            ba1.s((ba1) r.d, g91Var);
            ((yd) this.e).c((ba1) r.a());
        } catch (Throwable th) {
            m51.i("BillingLogger", "Unable to log.", th);
        }
    }

    public String toString() {
        switch (this.c) {
            case 5:
                return "Bounds{lower=" + ((d20) this.d) + " upper=" + ((d20) this.e) + "}";
            default:
                return super.toString();
        }
    }

    public void u(m91 m91Var, t91 t91Var) {
        if (m91Var == null) {
            return;
        }
        try {
            aa1 r = ba1.r();
            r.c(t91Var);
            r.b();
            ba1.t((ba1) r.d, m91Var);
            ((yd) this.e).c((ba1) r.a());
        } catch (Throwable th) {
            m51.i("BillingLogger", "Unable to log.", th);
        }
    }

    public /* synthetic */ jp0(int i, boolean z) {
        this.c = i;
    }

    public /* synthetic */ jp0(Object obj, int i, Object obj2) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }

    public /* synthetic */ jp0(Object obj, Object obj2, int i, boolean z) {
        this.c = i;
        this.e = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yd] */
    /* JADX WARN: Type inference failed for: r1v2, types: [os, java.lang.Object] */
    public jp0(Context context, t91 t91Var) {
        b8 c;
        bu buVar;
        ?? obj;
        Set set;
        this.c = 12;
        ?? obj2 = new Object();
        try {
            lu0.b(context);
            c = lu0.a().c(ne.e);
            buVar = new bu("proto");
            obj = new Object();
            set = (Set) c.d;
        } catch (Throwable unused) {
            obj2.a = true;
        }
        if (set.contains(buVar)) {
            obj2.b = new b8((ca) c.e, buVar, (os) obj, (lu0) c.f);
            this.e = obj2;
            this.d = t91Var;
            return;
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", buVar, set));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, dy0] */
    public jp0(mh0 mh0Var) {
        this.c = 2;
        this.d = mh0Var;
        ?? obj = new Object();
        obj.a = 0;
        this.e = obj;
    }
}
