package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class j01 implements i2 {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public nn e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public i01 i;
    public i01 j;
    public r6 k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public ez0 s;
    public boolean t;
    public boolean u;
    public final h01 v;
    public final h01 w;
    public final sb0 x;

    public j01(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new h01(this, 0);
        this.w = new h01(this, 1);
        this.x = new sb0(this);
        View decorView = activity.getWindow().getDecorView();
        c(decorView);
        if (!z2) {
            this.g = decorView.findViewById(R.id.content);
        }
    }

    public final void a(boolean z2) {
        dz0 i;
        dz0 dz0Var;
        long j;
        boolean z3 = this.q;
        if (z2) {
            if (!z3) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                f(false);
            }
        } else if (z3) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            f(false);
        }
        boolean isLaidOut = this.d.isLaidOut();
        nn nnVar = this.e;
        if (isLaidOut) {
            if (z2) {
                rt0 rt0Var = (rt0) nnVar;
                i = ry0.a(rt0Var.a);
                i.a(0.0f);
                i.c(100L);
                i.d(new qt0(rt0Var, 4));
                dz0Var = this.f.i(0, 200L);
            } else {
                rt0 rt0Var2 = (rt0) nnVar;
                dz0 a = ry0.a(rt0Var2.a);
                a.a(1.0f);
                a.c(200L);
                a.d(new qt0(rt0Var2, 0));
                i = this.f.i(8, 100L);
                dz0Var = a;
            }
            ez0 ez0Var = new ez0();
            ArrayList arrayList = ez0Var.a;
            arrayList.add(i);
            View view = (View) i.a.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = (View) dz0Var.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            arrayList.add(dz0Var);
            ez0Var.b();
            return;
        }
        if (z2) {
            ((rt0) nnVar).a.setVisibility(4);
            this.f.setVisibility(0);
        } else {
            ((rt0) nnVar).a.setVisibility(0);
            this.f.setVisibility(8);
        }
    }

    public final Context b() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(svarzee.android.apps.adb_mouse.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    public final void c(View view) {
        String str;
        nn wrapper;
        boolean z2;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(svarzee.android.apps.adb_mouse.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(svarzee.android.apps.adb_mouse.R.id.action_bar);
        if (findViewById instanceof nn) {
            wrapper = (nn) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(svarzee.android.apps.adb_mouse.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(svarzee.android.apps.adb_mouse.R.id.action_bar_container);
        this.d = actionBarContainer;
        nn nnVar = this.e;
        if (nnVar != null && this.f != null && actionBarContainer != null) {
            Context context = ((rt0) nnVar).a.getContext();
            this.a = context;
            if ((((rt0) this.e).b & 4) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.h = true;
            }
            int i = context.getApplicationInfo().targetSdkVersion;
            this.e.getClass();
            e(context.getResources().getBoolean(svarzee.android.apps.adb_mouse.R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, ng0.a, svarzee.android.apps.adb_mouse.R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
                if (actionBarOverlayLayout2.i) {
                    this.u = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    c.o("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                    return;
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = ry0.a;
                actionBarContainer2.setElevation(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        c.o(j01.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void d(boolean z2) {
        int i;
        if (!this.h) {
            if (z2) {
                i = 4;
            } else {
                i = 0;
            }
            rt0 rt0Var = (rt0) this.e;
            int i2 = rt0Var.b;
            this.h = true;
            rt0Var.a((i & 4) | (i2 & (-5)));
        }
    }

    public final void e(boolean z2) {
        if (!z2) {
            ((rt0) this.e).getClass();
            this.d.setTabContainer(null);
        } else {
            this.d.setTabContainer(null);
            ((rt0) this.e).getClass();
        }
        this.e.getClass();
        ((rt0) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean z4 = this.p;
        if (!this.q && z4) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z5 = this.r;
        cp cpVar = null;
        sb0 sb0Var = this.x;
        View view = this.g;
        if (z3) {
            if (!z5) {
                this.r = true;
                ez0 ez0Var = this.s;
                if (ez0Var != null) {
                    ez0Var.a();
                }
                this.d.setVisibility(0);
                int i = this.n;
                h01 h01Var = this.w;
                if (i == 0 && (this.t || z2)) {
                    this.d.setTranslationY(0.0f);
                    float f = -this.d.getHeight();
                    if (z2) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f -= r12[1];
                    }
                    this.d.setTranslationY(f);
                    ez0 ez0Var2 = new ez0();
                    dz0 a = ry0.a(this.d);
                    a.e(0.0f);
                    View view2 = (View) a.a.get();
                    if (view2 != null) {
                        if (sb0Var != null) {
                            cpVar = new cp(sb0Var, view2);
                        }
                        view2.animate().setUpdateListener(cpVar);
                    }
                    boolean z6 = ez0Var2.e;
                    ArrayList arrayList = ez0Var2.a;
                    if (!z6) {
                        arrayList.add(a);
                    }
                    if (this.o && view != null) {
                        view.setTranslationY(f);
                        dz0 a2 = ry0.a(view);
                        a2.e(0.0f);
                        if (!ez0Var2.e) {
                            arrayList.add(a2);
                        }
                    }
                    boolean z7 = ez0Var2.e;
                    if (!z7) {
                        ez0Var2.c = z;
                    }
                    if (!z7) {
                        ez0Var2.b = 250L;
                    }
                    if (!z7) {
                        ez0Var2.d = h01Var;
                    }
                    this.s = ez0Var2;
                    ez0Var2.b();
                } else {
                    this.d.setAlpha(1.0f);
                    this.d.setTranslationY(0.0f);
                    if (this.o && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    h01Var.a();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = ry0.a;
                    actionBarOverlayLayout.requestApplyInsets();
                    return;
                }
                return;
            }
            return;
        }
        if (z5) {
            this.r = false;
            ez0 ez0Var3 = this.s;
            if (ez0Var3 != null) {
                ez0Var3.a();
            }
            int i2 = this.n;
            h01 h01Var2 = this.v;
            if (i2 == 0 && (this.t || z2)) {
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                ez0 ez0Var4 = new ez0();
                float f2 = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                dz0 a3 = ry0.a(this.d);
                a3.e(f2);
                View view3 = (View) a3.a.get();
                if (view3 != null) {
                    if (sb0Var != null) {
                        cpVar = new cp(sb0Var, view3);
                    }
                    view3.animate().setUpdateListener(cpVar);
                }
                boolean z8 = ez0Var4.e;
                ArrayList arrayList2 = ez0Var4.a;
                if (!z8) {
                    arrayList2.add(a3);
                }
                if (this.o && view != null) {
                    dz0 a4 = ry0.a(view);
                    a4.e(f2);
                    if (!ez0Var4.e) {
                        arrayList2.add(a4);
                    }
                }
                boolean z9 = ez0Var4.e;
                if (!z9) {
                    ez0Var4.c = y;
                }
                if (!z9) {
                    ez0Var4.b = 250L;
                }
                if (!z9) {
                    ez0Var4.d = h01Var2;
                }
                this.s = ez0Var4;
                ez0Var4.b();
                return;
            }
            h01Var2.a();
        }
    }

    public j01(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new h01(this, 0);
        this.w = new h01(this, 1);
        this.x = new sb0(this);
        c(dialog.getWindow().getDecorView());
    }
}
