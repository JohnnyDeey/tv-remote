package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class z01 extends i11 {
    public static boolean m = false;
    public static Method n;
    public static Class o;
    public static Field p;
    public static Field q;
    public final WindowInsets c;
    public d20[] d;
    public d20 e;
    public m11 f;
    public d20 g;
    public int h;
    public int i;
    public int j;
    public Rect[][] k;
    public Rect[][] l;

    public z01(m11 m11Var, WindowInsets windowInsets) {
        super(m11Var);
        this.e = null;
        this.k = new Rect[10];
        this.l = new Rect[10];
        this.c = windowInsets;
    }

    private static List<Rect> A(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[oi0.m(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        if (rectArr3 == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(rectArr3);
    }

    private Rect[] B(d20 d20Var) {
        ArrayList arrayList = new ArrayList();
        int i = d20Var.a;
        int i2 = d20Var.d;
        int i3 = d20Var.c;
        int i4 = d20Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, d20Var.a, this.i));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.j, i4));
        }
        if (i3 != 0) {
            int i5 = this.j;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.i));
        }
        if (i2 != 0) {
            int i6 = this.i;
            arrayList.add(new Rect(0, i6 - i2, this.j, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    @SuppressLint({"WrongConstant"})
    private d20 C(int i, boolean z) {
        d20 d20Var = d20.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                d20Var = d20.a(d20Var, D(i2, z));
            }
        }
        return d20Var;
    }

    private d20 F() {
        m11 m11Var = this.f;
        if (m11Var != null) {
            return m11Var.a.j();
        }
        return d20.e;
    }

    private d20 G(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!m) {
                H();
            }
            Method method = n;
            if (method != null && o != null && p != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) p.get(q.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return d20.b(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }
        c.q("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void H() {
        try {
            n = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            o = cls;
            p = cls.getDeclaredField("mVisibleInsets");
            q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            p.setAccessible(true);
            q.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        m = true;
    }

    public static boolean J(int i, int i2) {
        if ((i & 6) == (i2 & 6)) {
            return true;
        }
        return false;
    }

    private cr z(View view) {
        Display display;
        int i;
        int i2;
        int i3;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.r()) {
            return cr.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        int i4 = 0;
        yj0 w = mn.w(display, 0);
        yj0 w2 = mn.w(display, 1);
        yj0 w3 = mn.w(display, 2);
        yj0 w4 = mn.w(display, 3);
        int i5 = point.x;
        int i6 = point.y;
        if (w != null) {
            i = w.b;
        } else {
            i = 0;
        }
        if (w2 != null) {
            i2 = w2.b;
        } else {
            i2 = 0;
        }
        if (w3 != null) {
            i3 = w3.b;
        } else {
            i3 = 0;
        }
        if (w4 != null) {
            i4 = w4.b;
        }
        return cr.a(i5, i6, false, i, i2, i3, i4);
    }

    public d20 D(int i, boolean z) {
        int i2;
        ar g;
        int i3;
        int i4;
        int i5;
        d20 d20Var = d20.e;
        int i6 = 0;
        if (i != 1) {
            d20 d20Var2 = null;
            if (i != 2) {
                if (i != 8) {
                    if (i != 16) {
                        if (i != 32) {
                            if (i != 64) {
                                if (i == 128) {
                                    m11 m11Var = this.f;
                                    if (m11Var != null) {
                                        g = m11Var.a.g();
                                    } else {
                                        g = g();
                                    }
                                    if (g != null) {
                                        int i7 = Build.VERSION.SDK_INT;
                                        if (i7 >= 28) {
                                            i3 = zq.e(g.a);
                                        } else {
                                            i3 = 0;
                                        }
                                        if (i7 >= 28) {
                                            i4 = zq.g(g.a);
                                        } else {
                                            i4 = 0;
                                        }
                                        if (i7 >= 28) {
                                            i5 = zq.f(g.a);
                                        } else {
                                            i5 = 0;
                                        }
                                        if (i7 >= 28) {
                                            i6 = zq.d(g.a);
                                        }
                                        return d20.b(i3, i4, i5, i6);
                                    }
                                }
                            } else {
                                return m();
                            }
                        } else {
                            return i();
                        }
                    } else {
                        return k();
                    }
                } else {
                    d20[] d20VarArr = this.d;
                    if (d20VarArr != null) {
                        d20Var2 = d20VarArr[oi0.m(8)];
                    }
                    if (d20Var2 != null) {
                        return d20Var2;
                    }
                    d20 l = l();
                    d20 F = F();
                    int i8 = l.d;
                    if (i8 > F.d) {
                        return d20.b(0, 0, 0, i8);
                    }
                    d20 d20Var3 = this.g;
                    if (d20Var3 != null && !d20Var3.equals(d20Var) && (i2 = this.g.d) > F.d) {
                        return d20.b(0, 0, 0, i2);
                    }
                }
            } else {
                if (z) {
                    d20 F2 = F();
                    d20 j = j();
                    return d20.b(Math.max(F2.a, j.a), 0, Math.max(F2.c, j.c), Math.max(F2.d, j.d));
                }
                if ((this.h & 2) == 0) {
                    d20 l2 = l();
                    m11 m11Var2 = this.f;
                    if (m11Var2 != null) {
                        d20Var2 = m11Var2.a.j();
                    }
                    int i9 = l2.d;
                    if (d20Var2 != null) {
                        i9 = Math.min(i9, d20Var2.d);
                    }
                    return d20.b(l2.a, 0, l2.c, i9);
                }
            }
        } else {
            if (z) {
                return d20.b(0, Math.max(F().b, l().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return d20.b(0, l().b, 0, 0);
            }
        }
        return d20Var;
    }

    public d20 E(int i) {
        return C(i, true);
    }

    public void I(d20 d20Var) {
        this.g = d20Var;
    }

    @Override // defpackage.i11
    public void d(View view) {
        this.j = view.getWidth();
        this.i = view.getHeight();
        d20 G = G(view);
        if (G == null) {
            G = d20.e;
        }
        I(G);
    }

    @Override // defpackage.i11
    public List<Rect> e(int i) {
        return A(this.k, i);
    }

    @Override // defpackage.i11
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        z01 z01Var = (z01) obj;
        if (!Objects.equals(this.g, z01Var.g) || !J(this.h, z01Var.h)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.i11
    public List<Rect> f(int i) {
        return A(this.l, i);
    }

    @Override // defpackage.i11
    public d20 h(int i) {
        return C(i, false);
    }

    @Override // defpackage.i11
    public final d20 l() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = d20.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.i11
    public void n(View view) {
        z(view);
    }

    @Override // defpackage.i11
    @SuppressLint({"WrongConstant"})
    public void o() {
        for (int i = 1; i <= 512; i <<= 1) {
            int m2 = oi0.m(i);
            this.k[m2] = B(h(i));
            if (i != 8) {
                this.l[m2] = B(E(i));
            }
        }
    }

    @Override // defpackage.i11
    public m11 p(int i, int i2, int i3, int i4) {
        y01 r01Var;
        m11 g = m11.g(null, this.c);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            r01Var = new x01(g);
        } else if (i5 >= 35) {
            r01Var = new w01(g);
        } else if (i5 >= 34) {
            r01Var = new v01(g);
        } else if (i5 >= 31) {
            r01Var = new u01(g);
        } else if (i5 >= 30) {
            r01Var = new t01(g);
        } else if (i5 >= 29) {
            r01Var = new s01(g);
        } else {
            r01Var = new r01(g);
        }
        r01Var.h(m11.e(l(), i, i2, i3, i4));
        r01Var.f(m11.e(j(), i, i2, i3, i4));
        return r01Var.b();
    }

    @Override // defpackage.i11
    public boolean r() {
        return this.c.isRound();
    }

    @Override // defpackage.i11
    public void t(d20[] d20VarArr) {
        this.d = d20VarArr;
    }

    @Override // defpackage.i11
    public void u(m11 m11Var) {
        this.f = m11Var;
    }

    @Override // defpackage.i11
    public void w(int i) {
        this.h = i;
    }

    @Override // defpackage.i11
    public void x(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.k = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.i11
    public void y(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.i11
    public void s(cr crVar) {
    }
}
