package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class u5 implements ad0, ik, la0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ g6 d;

    public /* synthetic */ u5(g6 g6Var, int i) {
        this.c = i;
        this.d = g6Var;
    }

    @Override // defpackage.la0
    public void a(w90 w90Var, boolean z) {
        boolean z2;
        int i;
        f6 f6Var;
        int i2 = this.c;
        g6 g6Var = this.d;
        switch (i2) {
            case 2:
                g6Var.q(w90Var);
                return;
            default:
                w90 k = w90Var.k();
                int i3 = 0;
                if (k != w90Var) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    w90Var = k;
                }
                f6[] f6VarArr = g6Var.M;
                if (f6VarArr != null) {
                    i = f6VarArr.length;
                } else {
                    i = 0;
                }
                while (true) {
                    if (i3 < i) {
                        f6Var = f6VarArr[i3];
                        if (f6Var == null || f6Var.h != w90Var) {
                            i3++;
                        }
                    } else {
                        f6Var = null;
                    }
                }
                if (f6Var != null) {
                    if (z2) {
                        g6Var.p(f6Var.a, f6Var, k);
                        g6Var.r(f6Var, true);
                        return;
                    } else {
                        g6Var.r(f6Var, z);
                        return;
                    }
                }
                return;
        }
    }

    @Override // defpackage.ad0
    public m11 g(View view, m11 m11Var) {
        int i;
        int i2;
        boolean z;
        m11 m11Var2;
        y01 r01Var;
        int b;
        int c;
        boolean z2;
        int color;
        int d = m11Var.d();
        g6 g6Var = this.d;
        Context context = g6Var.m;
        int d2 = m11Var.d();
        ActionBarContextView actionBarContextView = g6Var.w;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) g6Var.w.getLayoutParams();
            boolean z3 = true;
            if (g6Var.w.isShown()) {
                if (g6Var.d0 == null) {
                    g6Var.d0 = new Rect();
                    g6Var.e0 = new Rect();
                }
                Rect rect = g6Var.d0;
                Rect rect2 = g6Var.e0;
                rect.set(m11Var.b(), m11Var.d(), m11Var.c(), m11Var.a());
                ViewGroup viewGroup = g6Var.B;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = lz0.a;
                    iz0.a(viewGroup, rect, rect2);
                } else {
                    if (!lz0.a) {
                        lz0.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            lz0.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                lz0.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = lz0.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i3 = rect.top;
                int i4 = rect.left;
                int i5 = rect.right;
                ViewGroup viewGroup2 = g6Var.B;
                WeakHashMap weakHashMap = ry0.a;
                m11 a = ky0.a(viewGroup2);
                if (a == null) {
                    b = 0;
                } else {
                    b = a.b();
                }
                if (a == null) {
                    c = 0;
                } else {
                    c = a.c();
                }
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 > 0 && g6Var.D == null) {
                    View view2 = new View(context);
                    g6Var.D = view2;
                    i2 = 8;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c;
                    g6Var.B.addView(g6Var.D, -1, layoutParams);
                } else {
                    i2 = 8;
                    View view3 = g6Var.D;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c;
                            g6Var.D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = g6Var.D;
                if (view4 == null) {
                    z3 = false;
                }
                if (z3 && view4.getVisibility() != 0) {
                    View view5 = g6Var.D;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        color = context.getColor(R.color.abc_decor_view_status_guard_light);
                    } else {
                        color = context.getColor(R.color.abc_decor_view_status_guard);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!g6Var.I && z3) {
                    d2 = 0;
                }
                i = 0;
                z = z3;
                z3 = z2;
            } else {
                i2 = 8;
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z = false;
                } else {
                    z = false;
                    z3 = false;
                }
            }
            if (z3) {
                g6Var.w.setLayoutParams(marginLayoutParams);
            }
        } else {
            i = 0;
            i2 = 8;
            z = false;
        }
        View view6 = g6Var.D;
        if (view6 != null) {
            if (z) {
                i2 = i;
            }
            view6.setVisibility(i2);
        }
        if (d != d2) {
            int b2 = m11Var.b();
            int c2 = m11Var.c();
            int a2 = m11Var.a();
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 36) {
                r01Var = new x01(m11Var);
            } else if (i8 >= 35) {
                r01Var = new w01(m11Var);
            } else if (i8 >= 34) {
                r01Var = new v01(m11Var);
            } else if (i8 >= 31) {
                r01Var = new u01(m11Var);
            } else if (i8 >= 30) {
                r01Var = new t01(m11Var);
            } else if (i8 >= 29) {
                r01Var = new s01(m11Var);
            } else {
                r01Var = new r01(m11Var);
            }
            r01Var.h(d20.b(b2, d2, c2, a2));
            m11Var2 = r01Var.b();
        } else {
            m11Var2 = m11Var;
        }
        WeakHashMap weakHashMap2 = ry0.a;
        WindowInsets f = m11Var2.f();
        if (f != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(f);
            if (!onApplyWindowInsets.equals(f)) {
                return m11.g(view, onApplyWindowInsets);
            }
            return m11Var2;
        }
        return m11Var2;
    }

    @Override // defpackage.la0
    public boolean p(w90 w90Var) {
        Window.Callback callback;
        int i = this.c;
        g6 g6Var = this.d;
        switch (i) {
            case 2:
                Window.Callback callback2 = g6Var.n.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, w90Var);
                }
                return true;
            default:
                if (w90Var == w90Var.k() && g6Var.G && (callback = g6Var.n.getCallback()) != null && !g6Var.R) {
                    callback.onMenuOpened(108, w90Var);
                }
                return true;
        }
    }
}
