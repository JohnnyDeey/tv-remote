package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class g6 extends s5 implements u90, LayoutInflater.Factory2 {
    public static final io0 i0 = new io0(0);
    public static final int[] j0 = {R.attr.windowBackground};
    public static final boolean k0 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A;
    public ViewGroup B;
    public TextView C;
    public View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public f6[] M;
    public f6 N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public Configuration S;
    public final int T;
    public int U;
    public int V;
    public boolean W;
    public b6 X;
    public b6 Y;
    public boolean Z;
    public int a0;
    public boolean c0;
    public Rect d0;
    public Rect e0;
    public a8 f0;
    public OnBackInvokedDispatcher g0;
    public OnBackInvokedCallback h0;
    public final Object l;
    public final Context m;
    public Window n;
    public a6 o;
    public j01 p;
    public oq0 q;
    public CharSequence r;
    public ActionBarOverlayLayout s;
    public u5 t;
    public u5 u;
    public v2 v;
    public ActionBarContextView w;
    public PopupWindow x;
    public t5 y;
    public dz0 z = null;
    public final t5 b0 = new t5(this, 0);

    public g6(Context context, Window window, i5 i5Var, Object obj) {
        f5 f5Var = null;
        this.T = -100;
        this.m = context;
        this.l = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof f5) {
                        f5Var = (f5) context;
                        break;
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
            if (f5Var != null) {
                this.T = ((g6) f5Var.l()).T;
            }
        }
        if (this.T == -100) {
            String name = this.l.getClass().getName();
            io0 io0Var = i0;
            Integer num = (Integer) io0Var.get(name);
            if (num != null) {
                this.T = num.intValue();
                io0Var.remove(this.l.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        j6.d();
    }

    public static c70 o(Context context) {
        c70 c70Var;
        c70 c70Var2;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 33 || (c70Var = s5.e) == null) {
            return null;
        }
        d70 d70Var = c70Var.a;
        c70 b = x5.b(context.getApplicationContext().getResources().getConfiguration());
        if (d70Var.a.isEmpty()) {
            c70Var2 = c70.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i = 0; i < b.a.a.size() + d70Var.a.size(); i++) {
                if (i < d70Var.a.size()) {
                    locale = d70Var.a.get(i);
                } else {
                    locale = b.a.a.get(i - d70Var.a.size());
                }
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
            }
            c70Var2 = new c70(new d70(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        if (c70Var2.a.a.isEmpty()) {
            return b;
        }
        return c70Var2;
    }

    public static Configuration s(Context context, int i, c70 c70Var, Configuration configuration, boolean z) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i2 = 32;
            }
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c70Var != null) {
            x5.d(configuration2, c70Var);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.a0 = (1 << i) | this.a0;
        if (!this.Z) {
            View decorView = this.n.getDecorView();
            WeakHashMap weakHashMap = ry0.a;
            decorView.postOnAnimation(this.b0);
            this.Z = true;
        }
    }

    public final int B(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            if (this.Y == null) {
                                this.Y = new b6(this, context);
                            }
                            return this.Y.g();
                        }
                        c.o("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        return 0;
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return x(context).g();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean C() {
        nn nnVar;
        mt0 mt0Var;
        z90 z90Var;
        boolean z = this.O;
        this.O = false;
        f6 y = y(0);
        if (y.m) {
            if (!z) {
                r(y, true);
                return true;
            }
        } else {
            v2 v2Var = this.v;
            if (v2Var != null) {
                v2Var.a();
                return true;
            }
            z();
            j01 j01Var = this.p;
            if (j01Var == null || (nnVar = j01Var.e) == null || (mt0Var = ((rt0) nnVar).a.N) == null || mt0Var.d == null) {
                return false;
            }
            mt0 mt0Var2 = ((rt0) nnVar).a.N;
            if (mt0Var2 == null) {
                z90Var = null;
            } else {
                z90Var = mt0Var2.d;
            }
            if (z90Var != null) {
                z90Var.collapseActionView();
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0176, code lost:
    
        if (r2.h.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(defpackage.f6 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6.D(f6, android.view.KeyEvent):void");
    }

    public final boolean E(f6 f6Var, int i, KeyEvent keyEvent) {
        w90 w90Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!f6Var.k && !F(f6Var, keyEvent)) || (w90Var = f6Var.h) == null) {
            return false;
        }
        return w90Var.performShortcut(i, keyEvent, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cb, code lost:
    
        if (r13.h == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F(defpackage.f6 r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6.F(f6, android.view.KeyEvent):boolean");
    }

    public final void G() {
        if (!this.A) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.g0 != null && (y(0).m || this.v != null)) {
                z = true;
            }
            if (z && this.h0 == null) {
                this.h0 = z5.b(this.g0, this);
            } else if (!z && (onBackInvokedCallback = this.h0) != null) {
                z5.c(this.g0, onBackInvokedCallback);
                this.h0 = null;
            }
        }
    }

    @Override // defpackage.s5
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.m);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof g6)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.s5
    public final void c() {
        String str;
        this.P = true;
        m(false, true);
        w();
        Object obj = this.l;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = mn.v(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                j01 j01Var = this.p;
                if (j01Var == null) {
                    this.c0 = true;
                } else {
                    j01Var.d(true);
                }
            }
            synchronized (s5.j) {
                s5.f(this);
                s5.i.add(new WeakReference(this));
            }
        }
        this.S = new Configuration(this.m.getResources().getConfiguration());
        this.Q = true;
    }

    @Override // defpackage.u90
    public final boolean d(w90 w90Var, MenuItem menuItem) {
        int i;
        f6 f6Var;
        Window.Callback callback = this.n.getCallback();
        if (callback != null && !this.R) {
            w90 k = w90Var.k();
            f6[] f6VarArr = this.M;
            if (f6VarArr != null) {
                i = f6VarArr.length;
            } else {
                i = 0;
            }
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    f6Var = f6VarArr[i2];
                    if (f6Var != null && f6Var.h == k) {
                        break;
                    }
                    i2++;
                } else {
                    f6Var = null;
                    break;
                }
            }
            if (f6Var != null) {
                return callback.onMenuItemSelected(f6Var.a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.s5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.l
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.s5.j
            monitor-enter(r0)
            defpackage.s5.f(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.Z
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.n
            android.view.View r0 = r0.getDecorView()
            t5 r1 = r3.b0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.R = r0
            int r0 = r3.T
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.l
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            io0 r0 = defpackage.g6.i0
            java.lang.Object r1 = r3.l
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            io0 r0 = defpackage.g6.i0
            java.lang.Object r1 = r3.l
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            b6 r0 = r3.X
            if (r0 == 0) goto L63
            r0.d()
        L63:
            b6 r3 = r3.Y
            if (r3 == 0) goto L6a
            r3.d()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6.e():void");
    }

    @Override // defpackage.s5
    public final boolean g(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.K && i == 108) {
            return false;
        }
        if (this.G && i == 1) {
            this.G = false;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    if (i != 10) {
                        if (i != 108) {
                            if (i != 109) {
                                return this.n.requestFeature(i);
                            }
                            G();
                            this.H = true;
                            return true;
                        }
                        G();
                        this.G = true;
                        return true;
                    }
                    G();
                    this.I = true;
                    return true;
                }
                G();
                this.F = true;
                return true;
            }
            G();
            this.E = true;
            return true;
        }
        G();
        this.K = true;
        return true;
    }

    @Override // defpackage.s5
    public final void h(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.m).inflate(i, viewGroup);
        this.o.a(this.n.getCallback());
    }

    @Override // defpackage.s5
    public final void i(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.o.a(this.n.getCallback());
    }

    @Override // defpackage.s5
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.o.a(this.n.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // defpackage.u90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.w90 r6) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6.k(w90):void");
    }

    @Override // defpackage.s5
    public final void l(CharSequence charSequence) {
        this.r = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.s;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        j01 j01Var = this.p;
        if (j01Var != null) {
            rt0 rt0Var = (rt0) j01Var.e;
            if (!rt0Var.g) {
                Toolbar toolbar = rt0Var.a;
                rt0Var.h = charSequence;
                if ((rt0Var.b & 8) != 0) {
                    toolbar.setTitle(charSequence);
                    if (rt0Var.g) {
                        ry0.n(toolbar.getRootView(), charSequence);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6.m(boolean, boolean):boolean");
    }

    public final void n(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.n == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof a6)) {
                a6 a6Var = new a6(this, callback);
                this.o = a6Var;
                window.setCallback(a6Var);
                Context context = this.m;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    j6 a = j6.a();
                    synchronized (a) {
                        drawable = a.a.d(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.n = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.g0) == null) {
                    Object obj = this.l;
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.h0) != null) {
                        z5.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.h0 = null;
                    }
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.g0 = z5.a(activity);
                            H();
                            return;
                        }
                    }
                    this.g0 = null;
                    H();
                    return;
                }
                return;
            }
            c.o("AppCompat has already installed itself into the Window");
            return;
        }
        c.o("AppCompat has already installed itself into the Window");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x010e, code lost:
    
        if (r10.equals("ImageButton") == false) goto L24;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(int i, f6 f6Var, w90 w90Var) {
        if (w90Var == null) {
            if (f6Var == null && i >= 0) {
                f6[] f6VarArr = this.M;
                if (i < f6VarArr.length) {
                    f6Var = f6VarArr[i];
                }
            }
            if (f6Var != null) {
                w90Var = f6Var.h;
            }
        }
        if ((f6Var == null || f6Var.m) && !this.R) {
            a6 a6Var = this.o;
            Window.Callback callback = this.n.getCallback();
            a6Var.getClass();
            try {
                a6Var.f = true;
                callback.onPanelClosed(i, w90Var);
            } finally {
                a6Var.f = false;
            }
        }
    }

    public final void q(w90 w90Var) {
        r2 r2Var;
        if (this.L) {
            return;
        }
        this.L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.s;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((rt0) actionBarOverlayLayout.g).a.c;
        if (actionMenuView != null && (r2Var = actionMenuView.v) != null) {
            r2Var.d();
            o2 o2Var = r2Var.v;
            if (o2Var != null && o2Var.b()) {
                o2Var.i.dismiss();
            }
        }
        Window.Callback callback = this.n.getCallback();
        if (callback != null && !this.R) {
            callback.onPanelClosed(108, w90Var);
        }
        this.L = false;
    }

    public final void r(f6 f6Var, boolean z) {
        e6 e6Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        r2 r2Var;
        if (z && f6Var.a == 0 && (actionBarOverlayLayout = this.s) != null) {
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((rt0) actionBarOverlayLayout.g).a.c;
            if (actionMenuView != null && (r2Var = actionMenuView.v) != null && r2Var.h()) {
                q(f6Var.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.m.getSystemService("window");
        if (windowManager != null && f6Var.m && (e6Var = f6Var.e) != null) {
            windowManager.removeView(e6Var);
            if (z) {
                p(f6Var.a, f6Var, null);
            }
        }
        f6Var.k = false;
        f6Var.l = false;
        f6Var.m = false;
        f6Var.f = null;
        f6Var.n = true;
        if (this.N == f6Var) {
            this.N = null;
        }
        if (f6Var.a == 0) {
            H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r6.d() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00fa, code lost:
    
        if (r6.l() != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6.t(android.view.KeyEvent):boolean");
    }

    public final void u(int i) {
        f6 y = y(i);
        if (y.h != null) {
            Bundle bundle = new Bundle();
            y.h.t(bundle);
            if (bundle.size() > 0) {
                y.p = bundle;
            }
            y.h.w();
            y.h.clear();
        }
        y.o = true;
        y.n = true;
        if ((i == 108 || i == 0) && this.s != null) {
            f6 y2 = y(0);
            y2.k = false;
            F(y2, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.A) {
            Context context2 = this.m;
            int[] iArr = ng0.j;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                int i = 0;
                int i2 = 1;
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    g(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    g(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    g(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    g(10);
                }
                this.J = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                w();
                this.n.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.K) {
                    if (this.J) {
                        viewGroup = (ViewGroup) from.inflate(svarzee.android.apps.adb_mouse.R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.H = false;
                        this.G = false;
                    } else if (this.G) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(svarzee.android.apps.adb_mouse.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new pk(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(svarzee.android.apps.adb_mouse.R.layout.abc_screen_toolbar, (ViewGroup) null);
                        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(svarzee.android.apps.adb_mouse.R.id.decor_content_parent);
                        this.s = actionBarOverlayLayout;
                        actionBarOverlayLayout.setWindowCallback(this.n.getCallback());
                        if (this.H) {
                            this.s.j(109);
                        }
                        if (this.E) {
                            this.s.j(2);
                        }
                        if (this.F) {
                            this.s.j(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.I ? (ViewGroup) from.inflate(svarzee.android.apps.adb_mouse.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(svarzee.android.apps.adb_mouse.R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    u5 u5Var = new u5(this, i);
                    WeakHashMap weakHashMap = ry0.a;
                    jy0.c(viewGroup, u5Var);
                    if (this.s == null) {
                        this.C = (TextView) viewGroup.findViewById(svarzee.android.apps.adb_mouse.R.id.title);
                    }
                    boolean z = lz0.a;
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, null);
                    } catch (IllegalAccessException e) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e2) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(svarzee.android.apps.adb_mouse.R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.n.findViewById(R.id.content);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(R.id.content);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.n.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new u5(this, i2));
                    this.B = viewGroup;
                    Object obj = this.l;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.r;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = this.s;
                        if (actionBarOverlayLayout2 != null) {
                            actionBarOverlayLayout2.setWindowTitle(charSequence);
                        } else {
                            j01 j01Var = this.p;
                            if (j01Var != null) {
                                rt0 rt0Var = (rt0) j01Var.e;
                                if (!rt0Var.g) {
                                    Toolbar toolbar = rt0Var.a;
                                    rt0Var.h = charSequence;
                                    if ((rt0Var.b & 8) != 0) {
                                        toolbar.setTitle(charSequence);
                                        if (rt0Var.g) {
                                            ry0.n(toolbar.getRootView(), charSequence);
                                        }
                                    }
                                }
                            } else {
                                TextView textView = this.C;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.B.findViewById(R.id.content);
                    View decorView = this.n.getDecorView();
                    contentFrameLayout2.i.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.A = true;
                    f6 y = y(0);
                    if (!this.R && y.h == null) {
                        A(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.G + ", windowActionBarOverlay: " + this.H + ", android:windowIsFloating: " + this.J + ", windowActionModeOverlay: " + this.I + ", windowNoTitle: " + this.K + " }");
            }
            obtainStyledAttributes.recycle();
            c.o("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void w() {
        if (this.n == null) {
            Object obj = this.l;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.n != null) {
            return;
        }
        c.o("We have not been given a Window");
    }

    public final d6 x(Context context) {
        if (this.X == null) {
            if (b8.i == null) {
                Context applicationContext = context.getApplicationContext();
                b8.i = new b8(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.X = new b6(this, b8.i);
        }
        return this.X;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r2 <= r5) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [f6, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.f6 y(int r5) {
        /*
            r4 = this;
            f6[] r0 = r4.M
            r1 = 0
            if (r0 == 0) goto L8
            int r2 = r0.length
            if (r2 > r5) goto L15
        L8:
            int r2 = r5 + 1
            f6[] r2 = new defpackage.f6[r2]
            if (r0 == 0) goto L12
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L12:
            r4.M = r2
            r0 = r2
        L15:
            r4 = r0[r5]
            if (r4 != 0) goto L24
            f6 r4 = new f6
            r4.<init>()
            r4.a = r5
            r4.n = r1
            r0[r5] = r4
        L24:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6.y(int):f6");
    }

    public final void z() {
        v();
        if (this.G && this.p == null) {
            Object obj = this.l;
            if (obj instanceof Activity) {
                this.p = new j01((Activity) obj, this.H);
            } else if (obj instanceof Dialog) {
                this.p = new j01((Dialog) obj);
            }
            j01 j01Var = this.p;
            if (j01Var != null) {
                j01Var.d(this.c0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
