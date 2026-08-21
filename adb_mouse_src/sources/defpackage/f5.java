package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class f5 extends a implements i5 {
    public boolean w;
    public boolean x;
    public g6 z;
    public final i81 u = new i81(20, new ix(this));
    public final androidx.lifecycle.a v = new androidx.lifecycle.a(this);
    public boolean y = true;

    public f5() {
        ((l5) this.g.c).e("android:support:lifecycle", new xi(1, this));
        final int i = 0;
        g(new hk(this) { // from class: hx
            public final /* synthetic */ f5 b;

            {
                this.b = this;
            }

            @Override // defpackage.hk
            public final void accept(Object obj) {
                int i2 = i;
                f5 f5Var = this.b;
                switch (i2) {
                    case 0:
                        f5Var.u.x();
                        return;
                    default:
                        f5Var.u.x();
                        return;
                }
            }
        });
        final int i2 = 1;
        this.p.add(new hk(this) { // from class: hx
            public final /* synthetic */ f5 b;

            {
                this.b = this;
            }

            @Override // defpackage.hk
            public final void accept(Object obj) {
                int i22 = i2;
                f5 f5Var = this.b;
                switch (i22) {
                    case 0:
                        f5Var.u.x();
                        return;
                    default:
                        f5Var.u.x();
                        return;
                }
            }
        });
        h(new yi(this, 1));
        ((l5) this.g.c).e("androidx:appcompat", new d5(this));
        h(new e5(this));
    }

    public static boolean m(vx vxVar) {
        f5 f5Var;
        boolean z = false;
        for (gx gxVar : vxVar.c.j()) {
            if (gxVar != null) {
                ix ixVar = gxVar.u;
                if (ixVar == null) {
                    f5Var = null;
                } else {
                    f5Var = ixVar.w;
                }
                if (f5Var != null) {
                    z |= m(gxVar.g());
                }
                fy fyVar = gxVar.Q;
                m50 m50Var = m50.e;
                m50 m50Var2 = m50.f;
                if (fyVar != null) {
                    fyVar.f();
                    if (fyVar.e.d.compareTo(m50Var2) >= 0) {
                        androidx.lifecycle.a aVar = gxVar.Q.e;
                        aVar.c("setCurrentState");
                        aVar.e(m50Var);
                        z = true;
                    }
                }
                if (gxVar.P.d.compareTo(m50Var2) >= 0) {
                    androidx.lifecycle.a aVar2 = gxVar.P;
                    aVar2.c("setCurrentState");
                    aVar2.e(m50Var);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // androidx.activity.a, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        g6 g6Var = (g6) l();
        g6Var.v();
        ((ViewGroup) g6Var.B.findViewById(R.id.content)).addView(view, layoutParams);
        g6Var.o.a(g6Var.n.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        g6 g6Var = (g6) l();
        g6Var.P = true;
        int i9 = g6Var.T;
        if (i9 == -100) {
            i9 = s5.d;
        }
        int B = g6Var.B(context, i9);
        int i10 = 0;
        if (s5.b(context) && s5.b(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (!s5.h) {
                    s5.c.execute(new m5(context, i10));
                }
            } else {
                synchronized (s5.k) {
                    try {
                        c70 c70Var = s5.e;
                        if (c70Var == null) {
                            if (s5.f == null) {
                                s5.f = c70.a(k20.c0(context));
                            }
                            if (!s5.f.a.a.isEmpty()) {
                                s5.e = s5.f;
                            }
                        } else if (!c70Var.equals(s5.f)) {
                            c70 c70Var2 = s5.e;
                            s5.f = c70Var2;
                            k20.a0(context, c70Var2.a.a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            }
        }
        c70 o = g6.o(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(g6.s(context, B, o, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof pk) {
            try {
                ((pk) context).a(g6.s(context, B, o, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (g6.k0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i11 = configuration3.mcc;
                    int i12 = configuration4.mcc;
                    if (i11 != i12) {
                        configuration.mcc = i12;
                    }
                    int i13 = configuration3.mnc;
                    int i14 = configuration4.mnc;
                    if (i13 != i14) {
                        configuration.mnc = i14;
                    }
                    x5.a(configuration3, configuration4, configuration);
                    int i15 = configuration3.touchscreen;
                    int i16 = configuration4.touchscreen;
                    if (i15 != i16) {
                        configuration.touchscreen = i16;
                    }
                    int i17 = configuration3.keyboard;
                    int i18 = configuration4.keyboard;
                    if (i17 != i18) {
                        configuration.keyboard = i18;
                    }
                    int i19 = configuration3.keyboardHidden;
                    int i20 = configuration4.keyboardHidden;
                    if (i19 != i20) {
                        configuration.keyboardHidden = i20;
                    }
                    int i21 = configuration3.navigation;
                    int i22 = configuration4.navigation;
                    if (i21 != i22) {
                        configuration.navigation = i22;
                    }
                    int i23 = configuration3.navigationHidden;
                    int i24 = configuration4.navigationHidden;
                    if (i23 != i24) {
                        configuration.navigationHidden = i24;
                    }
                    int i25 = configuration3.orientation;
                    int i26 = configuration4.orientation;
                    if (i25 != i26) {
                        configuration.orientation = i26;
                    }
                    int i27 = configuration3.screenLayout & 15;
                    int i28 = configuration4.screenLayout & 15;
                    if (i27 != i28) {
                        configuration.screenLayout |= i28;
                    }
                    int i29 = configuration3.screenLayout & 192;
                    int i30 = configuration4.screenLayout & 192;
                    if (i29 != i30) {
                        configuration.screenLayout |= i30;
                    }
                    int i31 = configuration3.screenLayout & 48;
                    int i32 = configuration4.screenLayout & 48;
                    if (i31 != i32) {
                        configuration.screenLayout |= i32;
                    }
                    int i33 = configuration3.screenLayout & 768;
                    int i34 = configuration4.screenLayout & 768;
                    if (i33 != i34) {
                        configuration.screenLayout |= i34;
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        i = configuration3.colorMode;
                        int i35 = i & 3;
                        i2 = configuration4.colorMode;
                        if (i35 != (i2 & 3)) {
                            i7 = configuration.colorMode;
                            i8 = configuration4.colorMode;
                            configuration.colorMode = i7 | (i8 & 3);
                        }
                        i3 = configuration3.colorMode;
                        int i36 = i3 & 12;
                        i4 = configuration4.colorMode;
                        if (i36 != (i4 & 12)) {
                            i5 = configuration.colorMode;
                            i6 = configuration4.colorMode;
                            configuration.colorMode = i5 | (i6 & 12);
                        }
                    }
                    int i37 = configuration3.uiMode & 15;
                    int i38 = configuration4.uiMode & 15;
                    if (i37 != i38) {
                        configuration.uiMode |= i38;
                    }
                    int i39 = configuration3.uiMode & 48;
                    int i40 = configuration4.uiMode & 48;
                    if (i39 != i40) {
                        configuration.uiMode |= i40;
                    }
                    int i41 = configuration3.screenWidthDp;
                    int i42 = configuration4.screenWidthDp;
                    if (i41 != i42) {
                        configuration.screenWidthDp = i42;
                    }
                    int i43 = configuration3.screenHeightDp;
                    int i44 = configuration4.screenHeightDp;
                    if (i43 != i44) {
                        configuration.screenHeightDp = i44;
                    }
                    int i45 = configuration3.smallestScreenWidthDp;
                    int i46 = configuration4.smallestScreenWidthDp;
                    if (i45 != i46) {
                        configuration.smallestScreenWidthDp = i46;
                    }
                    int i47 = configuration3.densityDpi;
                    int i48 = configuration4.densityDpi;
                    if (i47 != i48) {
                        configuration.densityDpi = i48;
                    }
                }
            } else {
                configuration = null;
            }
            Configuration s = g6.s(context, B, o, configuration, true);
            pk pkVar = new pk(context, svarzee.android.apps.adb_mouse.R.style.Theme_AppCompat_Empty);
            pkVar.a(s);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = pkVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        e8.c(theme);
                    } else {
                        synchronized (r21.g) {
                            if (!r21.i) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    r21.h = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                r21.i = true;
                            }
                            Method method = r21.h;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e2) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                    r21.h = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = pkVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((g6) l()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.dj, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((g6) l()).z();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r1.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r1.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0010. Please report as an issue. */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r8, java.io.FileDescriptor r9, java.io.PrintWriter r10, java.lang.String[] r11) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f5.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        g6 g6Var = (g6) l();
        g6Var.v();
        return g6Var.n.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        Context context;
        g6 g6Var = (g6) l();
        if (g6Var.q == null) {
            g6Var.z();
            j01 j01Var = g6Var.p;
            if (j01Var != null) {
                context = j01Var.b();
            } else {
                context = g6Var.m;
            }
            g6Var.q = new oq0(context);
        }
        return g6Var.q;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = wx0.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        g6 g6Var = (g6) l();
        if (g6Var.p != null) {
            g6Var.z();
            g6Var.p.getClass();
            g6Var.A(0);
        }
    }

    public final s5 l() {
        if (this.z == null) {
            q5 q5Var = s5.c;
            this.z = new g6(this, null, this, this);
        }
        return this.z;
    }

    public final void n() {
        super.onDestroy();
        ((ix) this.u.d).v.k();
        this.v.d(l50.ON_DESTROY);
    }

    public final boolean o(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((ix) this.u.d).v.i();
        }
        return false;
    }

    @Override // androidx.activity.a, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.u.x();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.a, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g6 g6Var = (g6) l();
        if (g6Var.G && g6Var.A) {
            g6Var.z();
            j01 j01Var = g6Var.p;
            if (j01Var != null) {
                j01Var.e(j01Var.a.getResources().getBoolean(svarzee.android.apps.adb_mouse.R.bool.abc_action_bar_embed_tabs));
            }
        }
        j6 a = j6.a();
        Context context = g6Var.m;
        synchronized (a) {
            lj0 lj0Var = a.a;
            synchronized (lj0Var) {
                r70 r70Var = (r70) lj0Var.b.get(context);
                if (r70Var != null) {
                    r70Var.a();
                }
            }
        }
        g6Var.S = new Configuration(g6Var.m.getResources().getConfiguration());
        g6Var.m(false, false);
    }

    @Override // androidx.activity.a, defpackage.dj, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.v.d(l50.ON_CREATE);
        vx vxVar = ((ix) this.u.d).v;
        vxVar.E = false;
        vxVar.F = false;
        vxVar.L.h = false;
        vxVar.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((ix) this.u.d).v.f.onCreateView(null, str, context, attributeSet);
        if (onCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        n();
        l().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.activity.a, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent t;
        if (!o(i, menuItem)) {
            g6 g6Var = (g6) l();
            g6Var.z();
            j01 j01Var = g6Var.p;
            if (menuItem.getItemId() != 16908332 || j01Var == null || (((rt0) j01Var.e).b & 4) == 0 || (t = mn.t(this)) == null) {
                return false;
            }
            if (shouldUpRecreateTask(t)) {
                ArrayList arrayList = new ArrayList();
                Intent t2 = mn.t(this);
                if (t2 == null) {
                    t2 = mn.t(this);
                }
                if (t2 != null) {
                    ComponentName component = t2.getComponent();
                    if (component == null) {
                        component = t2.resolveActivity(getPackageManager());
                    }
                    int size = arrayList.size();
                    try {
                        Intent u = mn.u(this, component);
                        while (u != null) {
                            arrayList.add(size, u);
                            u = mn.u(this, u.getComponent());
                        }
                        arrayList.add(t2);
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    startActivities(intentArr, null);
                    try {
                        finishAffinity();
                    } catch (IllegalStateException unused) {
                        finish();
                    }
                } else {
                    c.o("No intents added to TaskStackBuilder; cannot startActivities");
                    return false;
                }
            } else {
                navigateUpTo(t);
                return true;
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.x = false;
        ((ix) this.u.d).v.t(5);
        this.v.d(l50.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((g6) l()).v();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        p();
        g6 g6Var = (g6) l();
        g6Var.z();
        j01 j01Var = g6Var.p;
        if (j01Var != null) {
            j01Var.t = true;
        }
    }

    @Override // androidx.activity.a, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.u.x();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        i81 i81Var = this.u;
        i81Var.x();
        super.onResume();
        this.x = true;
        ((ix) i81Var.d).v.x(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        q();
        ((g6) l()).m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.u.x();
    }

    @Override // android.app.Activity
    public final void onStop() {
        r();
        g6 g6Var = (g6) l();
        g6Var.z();
        j01 j01Var = g6Var.p;
        if (j01Var != null) {
            j01Var.t = false;
            ez0 ez0Var = j01Var.s;
            if (ez0Var != null) {
                ez0Var.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        l().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((g6) l()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void p() {
        super.onPostResume();
        this.v.d(l50.ON_RESUME);
        vx vxVar = ((ix) this.u.d).v;
        vxVar.E = false;
        vxVar.F = false;
        vxVar.L.h = false;
        vxVar.t(7);
    }

    public final void q() {
        i81 i81Var = this.u;
        i81Var.x();
        ix ixVar = (ix) i81Var.d;
        super.onStart();
        this.y = false;
        if (!this.w) {
            this.w = true;
            vx vxVar = ixVar.v;
            vxVar.E = false;
            vxVar.F = false;
            vxVar.L.h = false;
            vxVar.t(4);
        }
        ixVar.v.x(true);
        this.v.d(l50.ON_START);
        vx vxVar2 = ixVar.v;
        vxVar2.E = false;
        vxVar2.F = false;
        vxVar2.L.h = false;
        vxVar2.t(5);
    }

    public final void r() {
        i81 i81Var;
        super.onStop();
        this.y = true;
        do {
            i81Var = this.u;
        } while (m(((ix) i81Var.d).v));
        vx vxVar = ((ix) i81Var.d).v;
        vxVar.F = true;
        vxVar.L.h = true;
        vxVar.t(4);
        this.v.d(l50.ON_STOP);
    }

    @Override // androidx.activity.a, android.app.Activity
    public final void setContentView(int i) {
        j();
        l().h(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((g6) l()).U = i;
    }

    @Override // androidx.activity.a, android.app.Activity
    public void setContentView(View view) {
        j();
        l().i(view);
    }

    @Override // androidx.activity.a, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        l().j(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((ix) this.u.d).v.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
