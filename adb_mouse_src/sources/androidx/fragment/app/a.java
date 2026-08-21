package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.b;
import defpackage.ay;
import defpackage.az0;
import defpackage.b70;
import defpackage.c;
import defpackage.cy;
import defpackage.dx;
import defpackage.dy;
import defpackage.f5;
import defpackage.fx;
import defpackage.fy;
import defpackage.gx;
import defpackage.ix;
import defpackage.l3;
import defpackage.l50;
import defpackage.m50;
import defpackage.no;
import defpackage.of;
import defpackage.os;
import defpackage.p50;
import defpackage.qo0;
import defpackage.qx;
import defpackage.r6;
import defpackage.rl;
import defpackage.ry0;
import defpackage.s50;
import defpackage.tz0;
import defpackage.vo0;
import defpackage.vx;
import defpackage.xo0;
import defpackage.xx;
import defpackage.yx;
import defpackage.yy0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class a {
    public final r6 a;
    public final l3 b;
    public final gx c;
    public boolean d = false;
    public int e = -1;

    public a(r6 r6Var, l3 l3Var, ClassLoader classLoader, qx qxVar, ay ayVar) {
        this.a = r6Var;
        this.b = l3Var;
        gx a = qxVar.a(ayVar.c);
        Bundle bundle = ayVar.l;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.K(bundle);
        a.g = ayVar.d;
        a.o = ayVar.e;
        a.q = true;
        a.x = ayVar.f;
        a.y = ayVar.g;
        a.z = ayVar.h;
        a.C = ayVar.i;
        a.n = ayVar.j;
        a.B = ayVar.k;
        a.A = ayVar.m;
        a.O = m50.values()[ayVar.n];
        Bundle bundle2 = ayVar.o;
        if (bundle2 != null) {
            a.d = bundle2;
        } else {
            a.d = new Bundle();
        }
        this.c = a;
        if (vx.F(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    public final void a() {
        boolean F = vx.F(3);
        gx gxVar = this.c;
        if (F) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + gxVar);
        }
        Bundle bundle = gxVar.d;
        gxVar.v.L();
        gxVar.c = 3;
        gxVar.E = false;
        gxVar.r();
        if (gxVar.E) {
            if (vx.F(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + gxVar);
            }
            View view = gxVar.G;
            if (view != null) {
                Bundle bundle2 = gxVar.d;
                SparseArray<Parcelable> sparseArray = gxVar.e;
                if (sparseArray != null) {
                    view.restoreHierarchyState(sparseArray);
                    gxVar.e = null;
                }
                if (gxVar.G != null) {
                    gxVar.Q.f.d(gxVar.f);
                    gxVar.f = null;
                }
                gxVar.E = false;
                gxVar.D(bundle2);
                if (gxVar.E) {
                    if (gxVar.G != null) {
                        gxVar.Q.b(l50.ON_CREATE);
                    }
                } else {
                    throw new AndroidRuntimeException(qo0.p("Fragment ", gxVar, " did not call through to super.onViewStateRestored()"));
                }
            }
            gxVar.d = null;
            vx vxVar = gxVar.v;
            vxVar.E = false;
            vxVar.F = false;
            vxVar.L.h = false;
            vxVar.t(4);
            this.a.j(false);
            return;
        }
        throw new AndroidRuntimeException(qo0.p("Fragment ", gxVar, " did not call through to super.onActivityCreated()"));
    }

    public final void b() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.b.g;
        gx gxVar = this.c;
        ViewGroup viewGroup = gxVar.F;
        int i = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(gxVar);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        gx gxVar2 = (gx) arrayList.get(indexOf);
                        if (gxVar2.F == viewGroup && (view = gxVar2.G) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    gx gxVar3 = (gx) arrayList.get(i2);
                    if (gxVar3.F == viewGroup && (view2 = gxVar3.G) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        gxVar.F.addView(gxVar.G, i);
    }

    public final void c() {
        boolean F = vx.F(3);
        gx gxVar = this.c;
        if (F) {
            Log.d("FragmentManager", "moveto ATTACHED: " + gxVar);
        }
        gx gxVar2 = gxVar.i;
        a aVar = null;
        l3 l3Var = this.b;
        if (gxVar2 != null) {
            a aVar2 = (a) ((HashMap) l3Var.d).get(gxVar2.g);
            if (aVar2 != null) {
                gxVar.j = gxVar.i.g;
                gxVar.i = null;
                aVar = aVar2;
            } else {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(gxVar);
                gx gxVar3 = gxVar.i;
                sb.append(" declared target fragment ");
                sb.append(gxVar3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
        } else {
            String str = gxVar.j;
            if (str != null && (aVar = (a) ((HashMap) l3Var.d).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(gxVar);
                sb2.append(" declared target fragment ");
                c.o(qo0.s(sb2, gxVar.j, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (aVar != null) {
            aVar.k();
        }
        vx vxVar = gxVar.t;
        gxVar.u = vxVar.t;
        gxVar.w = vxVar.v;
        r6 r6Var = this.a;
        r6Var.p(false);
        ArrayList arrayList = gxVar.T;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((dx) obj).a();
        }
        arrayList.clear();
        gxVar.v.b(gxVar.u, gxVar.b(), gxVar);
        gxVar.c = 0;
        gxVar.E = false;
        gxVar.t(gxVar.u.t);
        if (gxVar.E) {
            Iterator it = gxVar.t.m.iterator();
            while (it.hasNext()) {
                ((yx) it.next()).b();
            }
            vx vxVar2 = gxVar.v;
            vxVar2.E = false;
            vxVar2.F = false;
            vxVar2.L.h = false;
            vxVar2.t(0);
            r6Var.k(false);
            return;
        }
        throw new AndroidRuntimeException(qo0.p("Fragment ", gxVar, " did not call through to super.onAttach()"));
    }

    public final int d() {
        int i;
        xo0 xo0Var;
        gx gxVar = this.c;
        if (gxVar.t == null) {
            return gxVar.c;
        }
        int i2 = this.e;
        int ordinal = gxVar.O.ordinal();
        int i3 = 0;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i2 = Math.min(i2, -1);
                    }
                } else {
                    i2 = Math.min(i2, 5);
                }
            } else {
                i2 = Math.min(i2, 1);
            }
        } else {
            i2 = Math.min(i2, 0);
        }
        if (gxVar.o) {
            boolean z = gxVar.p;
            int i4 = this.e;
            if (z) {
                i2 = Math.max(i4, 2);
                View view = gxVar.G;
                if (view != null && view.getParent() == null) {
                    i2 = Math.min(i2, 2);
                }
            } else {
                i2 = i4 < 4 ? Math.min(i2, gxVar.c) : Math.min(i2, 1);
            }
        }
        if (!gxVar.m) {
            i2 = Math.min(i2, 1);
        }
        ViewGroup viewGroup = gxVar.F;
        if (viewGroup != null) {
            no f = no.f(viewGroup, gxVar.j().D());
            xo0 d = f.d(gxVar);
            if (d != null) {
                i = d.b;
            } else {
                i = 0;
            }
            ArrayList arrayList = f.c;
            int size = arrayList.size();
            while (true) {
                if (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    xo0Var = (xo0) obj;
                    gx gxVar2 = xo0Var.c;
                    gxVar2.getClass();
                    if (gxVar2 == gxVar && !xo0Var.f) {
                        break;
                    }
                } else {
                    xo0Var = null;
                    break;
                }
            }
            if (xo0Var != null && (i == 0 || i == 1)) {
                i3 = xo0Var.b;
            } else {
                i3 = i;
            }
        }
        if (i3 == 2) {
            i2 = Math.min(i2, 6);
        } else if (i3 == 3) {
            i2 = Math.max(i2, 3);
        } else if (gxVar.n) {
            if (gxVar.q()) {
                i2 = Math.min(i2, 1);
            } else {
                i2 = Math.min(i2, -1);
            }
        }
        if (gxVar.H && gxVar.c < 5) {
            i2 = Math.min(i2, 4);
        }
        if (vx.F(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i2 + " for " + gxVar);
        }
        return i2;
    }

    public final void e() {
        Parcelable parcelable;
        boolean F = vx.F(3);
        final gx gxVar = this.c;
        if (F) {
            Log.d("FragmentManager", "moveto CREATED: " + gxVar);
        }
        boolean z = gxVar.M;
        Bundle bundle = gxVar.d;
        if (!z) {
            r6 r6Var = this.a;
            r6Var.q(false);
            Bundle bundle2 = gxVar.d;
            gxVar.v.L();
            gxVar.c = 1;
            gxVar.E = false;
            gxVar.P.a(new p50() { // from class: androidx.fragment.app.Fragment$6
                @Override // defpackage.p50
                public final void c(s50 s50Var, l50 l50Var) {
                    View view;
                    if (l50Var == l50.ON_STOP && (view = gx.this.G) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
            gxVar.S.d(bundle2);
            gxVar.u(bundle2);
            gxVar.M = true;
            if (gxVar.E) {
                gxVar.P.d(l50.ON_CREATE);
                r6Var.l(false);
                return;
            }
            throw new AndroidRuntimeException(qo0.p("Fragment ", gxVar, " did not call through to super.onCreate()"));
        }
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            gxVar.v.R(parcelable);
            vx vxVar = gxVar.v;
            vxVar.E = false;
            vxVar.F = false;
            vxVar.L.h = false;
            vxVar.t(1);
        }
        gxVar.c = 1;
    }

    public final void f() {
        String str;
        gx gxVar = this.c;
        if (gxVar.o) {
            return;
        }
        if (vx.F(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + gxVar);
        }
        LayoutInflater y = gxVar.y(gxVar.d);
        gxVar.L = y;
        ViewGroup viewGroup = gxVar.F;
        if (viewGroup == null) {
            int i = gxVar.y;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) gxVar.t.u.N(i);
                    if (viewGroup == null) {
                        if (!gxVar.q) {
                            try {
                                str = gxVar.k().getResourceName(gxVar.y);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(gxVar.y) + " (" + str + ") for fragment " + gxVar);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        cy cyVar = dy.a;
                        dy.b(new tz0(gxVar, "Attempting to add fragment " + gxVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                        dy.a(gxVar).getClass();
                    }
                } else {
                    c.k(qo0.p("Cannot create fragment ", gxVar, " for a container view with no id"));
                    return;
                }
            } else {
                viewGroup = null;
            }
        }
        gxVar.F = viewGroup;
        gxVar.E(y, viewGroup, gxVar.d);
        View view = gxVar.G;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            gxVar.G.setTag(R.id.fragment_container_view_tag, gxVar);
            if (viewGroup != null) {
                b();
            }
            if (gxVar.A) {
                gxVar.G.setVisibility(8);
            }
            View view2 = gxVar.G;
            WeakHashMap weakHashMap = ry0.a;
            boolean isAttachedToWindow = view2.isAttachedToWindow();
            View view3 = gxVar.G;
            if (isAttachedToWindow) {
                view3.requestApplyInsets();
            } else {
                view3.addOnAttachStateChangeListener(new of(2, view3));
            }
            gxVar.C(gxVar.d);
            gxVar.v.t(2);
            this.a.v(false);
            int visibility = gxVar.G.getVisibility();
            gxVar.f().j = gxVar.G.getAlpha();
            if (gxVar.F != null && visibility == 0) {
                View findFocus = gxVar.G.findFocus();
                if (findFocus != null) {
                    gxVar.f().k = findFocus;
                    if (vx.F(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + gxVar);
                    }
                }
                gxVar.G.setAlpha(0.0f);
            }
        }
        gxVar.c = 2;
    }

    public final void g() {
        boolean z;
        boolean z2;
        boolean z3;
        gx d;
        boolean F = vx.F(3);
        gx gxVar = this.c;
        if (F) {
            Log.d("FragmentManager", "movefrom CREATED: " + gxVar);
        }
        int i = 0;
        if (gxVar.n && !gxVar.q()) {
            z = true;
        } else {
            z = false;
        }
        l3 l3Var = this.b;
        if (z) {
        }
        if (!z) {
            xx xxVar = (xx) l3Var.f;
            if (xxVar.c.containsKey(gxVar.g) && xxVar.f) {
                z3 = xxVar.g;
            } else {
                z3 = true;
            }
            if (!z3) {
                String str = gxVar.j;
                if (str != null && (d = l3Var.d(str)) != null && d.C) {
                    gxVar.i = d;
                }
                gxVar.c = 0;
                return;
            }
        }
        ix ixVar = gxVar.u;
        if (ixVar != null) {
            z2 = ((xx) l3Var.f).g;
        } else {
            f5 f5Var = ixVar.t;
            if (f5Var != null) {
                z2 = !f5Var.isChangingConfigurations();
            } else {
                z2 = true;
            }
        }
        if (z || z2) {
            ((xx) l3Var.f).b(gxVar);
        }
        gxVar.v.k();
        gxVar.P.d(l50.ON_DESTROY);
        gxVar.c = 0;
        gxVar.E = false;
        gxVar.M = false;
        gxVar.E = true;
        if (gxVar.E) {
            this.a.m(false);
            ArrayList g = l3Var.g();
            int size = g.size();
            while (i < size) {
                Object obj = g.get(i);
                i++;
                a aVar = (a) obj;
                if (aVar != null) {
                    gx gxVar2 = aVar.c;
                    if (gxVar.g.equals(gxVar2.j)) {
                        gxVar2.i = gxVar;
                        gxVar2.j = null;
                    }
                }
            }
            String str2 = gxVar.j;
            if (str2 != null) {
                gxVar.i = l3Var.d(str2);
            }
            l3Var.o(this);
            return;
        }
        throw new AndroidRuntimeException(qo0.p("Fragment ", gxVar, " did not call through to super.onDestroy()"));
    }

    public final void h() {
        b70 b70Var;
        View view;
        gx gxVar = this.c;
        if (vx.F(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + gxVar);
        }
        ViewGroup viewGroup = gxVar.F;
        if (viewGroup != null && (view = gxVar.G) != null) {
            viewGroup.removeView(view);
        }
        gxVar.v.t(1);
        if (gxVar.G != null) {
            fy fyVar = gxVar.Q;
            fyVar.f();
            if (fyVar.e.d.compareTo(m50.e) >= 0) {
                gxVar.Q.b(l50.ON_DESTROY);
            }
        }
        gxVar.c = 1;
        gxVar.E = false;
        gxVar.w();
        if (gxVar.E) {
            az0 d = gxVar.d();
            d.getClass();
            rl rlVar = rl.c;
            rlVar.getClass();
            String canonicalName = b70.class.getCanonicalName();
            if (canonicalName != null) {
                String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
                LinkedHashMap linkedHashMap = d.a;
                yy0 yy0Var = (yy0) linkedHashMap.get(concat);
                if (b70.class.isInstance(yy0Var)) {
                    yy0Var.getClass();
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll((LinkedHashMap) rlVar.b);
                    linkedHashMap2.put(os.g, concat);
                    try {
                        b70Var = new b70();
                    } catch (AbstractMethodError unused) {
                        b70Var = new b70();
                    }
                    yy0Var = b70Var;
                    yy0 yy0Var2 = (yy0) linkedHashMap.put(concat, yy0Var);
                    if (yy0Var2 != null) {
                        yy0Var2.a();
                    }
                }
                vo0 vo0Var = ((b70) yy0Var).c;
                if (vo0Var.e <= 0) {
                    gxVar.r = false;
                    this.a.w(false);
                    gxVar.F = null;
                    gxVar.G = null;
                    gxVar.Q = null;
                    b bVar = gxVar.R;
                    bVar.getClass();
                    b.a("setValue");
                    bVar.g++;
                    bVar.e = null;
                    bVar.c(null);
                    gxVar.p = false;
                    return;
                }
                vo0Var.d[0].getClass();
                c.a();
                return;
            }
            c.k("Local and anonymous classes can not be ViewModels");
            return;
        }
        throw new AndroidRuntimeException(qo0.p("Fragment ", gxVar, " did not call through to super.onDestroyView()"));
    }

    public final void i() {
        boolean z;
        boolean F = vx.F(3);
        gx gxVar = this.c;
        if (F) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + gxVar);
        }
        gxVar.c = -1;
        gxVar.E = false;
        gxVar.x();
        gxVar.L = null;
        if (gxVar.E) {
            vx vxVar = gxVar.v;
            if (!vxVar.G) {
                vxVar.k();
                gxVar.v = new vx();
            }
            this.a.n(false);
            gxVar.c = -1;
            gxVar.u = null;
            gxVar.w = null;
            gxVar.t = null;
            if (!gxVar.n || gxVar.q()) {
                xx xxVar = (xx) this.b.f;
                if (xxVar.c.containsKey(gxVar.g) && xxVar.f) {
                    z = xxVar.g;
                } else {
                    z = true;
                }
                if (!z) {
                    return;
                }
            }
            if (vx.F(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + gxVar);
            }
            gxVar.o();
            return;
        }
        throw new AndroidRuntimeException(qo0.p("Fragment ", gxVar, " did not call through to super.onDetach()"));
    }

    public final void j() {
        gx gxVar = this.c;
        if (gxVar.o && gxVar.p && !gxVar.r) {
            if (vx.F(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + gxVar);
            }
            LayoutInflater y = gxVar.y(gxVar.d);
            gxVar.L = y;
            gxVar.E(y, null, gxVar.d);
            View view = gxVar.G;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                gxVar.G.setTag(R.id.fragment_container_view_tag, gxVar);
                if (gxVar.A) {
                    gxVar.G.setVisibility(8);
                }
                gxVar.C(gxVar.d);
                gxVar.v.t(2);
                this.a.v(false);
                gxVar.c = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        l3 l3Var = this.b;
        boolean z = this.d;
        gx gxVar = this.c;
        if (z) {
            if (vx.F(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + gxVar);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int d = d();
                int i = gxVar.c;
                if (d != i) {
                    if (d > i) {
                        switch (i + 1) {
                            case 0:
                                c();
                                break;
                            case 1:
                                e();
                                break;
                            case 2:
                                j();
                                f();
                                break;
                            case 3:
                                a();
                                break;
                            case 4:
                                if (gxVar.G != null && (viewGroup3 = gxVar.F) != null) {
                                    no f = no.f(viewGroup3, gxVar.j().D());
                                    int b = qo0.b(gxVar.G.getVisibility());
                                    if (vx.F(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + gxVar);
                                    }
                                    f.a(b, 2, this);
                                }
                                gxVar.c = 4;
                                break;
                            case 5:
                                p();
                                break;
                            case 6:
                                gxVar.c = 6;
                                break;
                            case 7:
                                n();
                                break;
                        }
                    } else {
                        switch (i - 1) {
                            case -1:
                                i();
                                break;
                            case 0:
                                g();
                                break;
                            case 1:
                                h();
                                gxVar.c = 1;
                                break;
                            case 2:
                                gxVar.p = false;
                                gxVar.c = 2;
                                break;
                            case 3:
                                if (vx.F(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + gxVar);
                                }
                                if (gxVar.G != null && gxVar.e == null) {
                                    o();
                                }
                                if (gxVar.G != null && (viewGroup2 = gxVar.F) != null) {
                                    no f2 = no.f(viewGroup2, gxVar.j().D());
                                    if (vx.F(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + gxVar);
                                    }
                                    f2.a(1, 3, this);
                                }
                                gxVar.c = 3;
                                break;
                            case 4:
                                q();
                                break;
                            case 5:
                                gxVar.c = 5;
                                break;
                            case 6:
                                l();
                                break;
                        }
                    }
                    z2 = true;
                } else {
                    if (!z2 && i == -1 && gxVar.n && !gxVar.q()) {
                        if (vx.F(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + gxVar);
                        }
                        ((xx) l3Var.f).b(gxVar);
                        l3Var.o(this);
                        if (vx.F(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + gxVar);
                        }
                        gxVar.o();
                    }
                    if (gxVar.K) {
                        if (gxVar.G != null && (viewGroup = gxVar.F) != null) {
                            no f3 = no.f(viewGroup, gxVar.j().D());
                            if (gxVar.A) {
                                if (vx.F(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + gxVar);
                                }
                                f3.a(3, 1, this);
                            } else {
                                if (vx.F(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + gxVar);
                                }
                                f3.a(2, 1, this);
                            }
                        }
                        vx vxVar = gxVar.t;
                        if (vxVar != null && gxVar.m && vx.G(gxVar)) {
                            vxVar.D = true;
                        }
                        gxVar.K = false;
                        gxVar.v.n();
                    }
                    this.d = false;
                    return;
                }
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void l() {
        boolean F = vx.F(3);
        gx gxVar = this.c;
        if (F) {
            Log.d("FragmentManager", "movefrom RESUMED: " + gxVar);
        }
        gxVar.v.t(5);
        if (gxVar.G != null) {
            gxVar.Q.b(l50.ON_PAUSE);
        }
        gxVar.P.d(l50.ON_PAUSE);
        gxVar.c = 6;
        gxVar.E = true;
        this.a.o(false);
    }

    public final void m(ClassLoader classLoader) {
        gx gxVar = this.c;
        Bundle bundle = gxVar.d;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            gxVar.e = gxVar.d.getSparseParcelableArray("android:view_state");
            gxVar.f = gxVar.d.getBundle("android:view_registry_state");
            String string = gxVar.d.getString("android:target_state");
            gxVar.j = string;
            if (string != null) {
                gxVar.k = gxVar.d.getInt("android:target_req_state", 0);
            }
            boolean z = gxVar.d.getBoolean("android:user_visible_hint", true);
            gxVar.I = z;
            if (!z) {
                gxVar.H = true;
            }
        }
    }

    public final void n() {
        View view;
        String str;
        boolean F = vx.F(3);
        gx gxVar = this.c;
        if (F) {
            Log.d("FragmentManager", "moveto RESUMED: " + gxVar);
        }
        fx fxVar = gxVar.J;
        if (fxVar == null) {
            view = null;
        } else {
            view = fxVar.k;
        }
        if (view != null) {
            if (view != gxVar.G) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != gxVar.G) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (vx.F(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb.append(str);
                sb.append(" on Fragment ");
                sb.append(gxVar);
                sb.append(" resulting in focused view ");
                sb.append(gxVar.G.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        gxVar.f().k = null;
        gxVar.v.L();
        gxVar.v.x(true);
        gxVar.c = 7;
        gxVar.E = false;
        gxVar.E = true;
        if (gxVar.E) {
            androidx.lifecycle.a aVar = gxVar.P;
            l50 l50Var = l50.ON_RESUME;
            aVar.d(l50Var);
            if (gxVar.G != null) {
                gxVar.Q.e.d(l50Var);
            }
            vx vxVar = gxVar.v;
            vxVar.E = false;
            vxVar.F = false;
            vxVar.L.h = false;
            vxVar.t(7);
            this.a.r(false);
            gxVar.d = null;
            gxVar.e = null;
            gxVar.f = null;
            return;
        }
        throw new AndroidRuntimeException(qo0.p("Fragment ", gxVar, " did not call through to super.onResume()"));
    }

    public final void o() {
        gx gxVar = this.c;
        if (gxVar.G != null) {
            if (vx.F(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + gxVar + " with view " + gxVar.G);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            gxVar.G.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                gxVar.e = sparseArray;
            }
            Bundle bundle = new Bundle();
            gxVar.Q.f.e(bundle);
            if (!bundle.isEmpty()) {
                gxVar.f = bundle;
            }
        }
    }

    public final void p() {
        boolean F = vx.F(3);
        gx gxVar = this.c;
        if (F) {
            Log.d("FragmentManager", "moveto STARTED: " + gxVar);
        }
        gxVar.v.L();
        gxVar.v.x(true);
        gxVar.c = 5;
        gxVar.E = false;
        gxVar.A();
        if (gxVar.E) {
            androidx.lifecycle.a aVar = gxVar.P;
            l50 l50Var = l50.ON_START;
            aVar.d(l50Var);
            if (gxVar.G != null) {
                gxVar.Q.e.d(l50Var);
            }
            vx vxVar = gxVar.v;
            vxVar.E = false;
            vxVar.F = false;
            vxVar.L.h = false;
            vxVar.t(5);
            this.a.t(false);
            return;
        }
        throw new AndroidRuntimeException(qo0.p("Fragment ", gxVar, " did not call through to super.onStart()"));
    }

    public final void q() {
        boolean F = vx.F(3);
        gx gxVar = this.c;
        if (F) {
            Log.d("FragmentManager", "movefrom STARTED: " + gxVar);
        }
        vx vxVar = gxVar.v;
        vxVar.F = true;
        vxVar.L.h = true;
        vxVar.t(4);
        if (gxVar.G != null) {
            gxVar.Q.b(l50.ON_STOP);
        }
        gxVar.P.d(l50.ON_STOP);
        gxVar.c = 4;
        gxVar.E = false;
        gxVar.B();
        if (gxVar.E) {
            this.a.u(false);
            return;
        }
        throw new AndroidRuntimeException(qo0.p("Fragment ", gxVar, " did not call through to super.onStop()"));
    }

    public a(r6 r6Var, l3 l3Var, gx gxVar) {
        this.a = r6Var;
        this.b = l3Var;
        this.c = gxVar;
    }

    public a(r6 r6Var, l3 l3Var, gx gxVar, ay ayVar) {
        this.a = r6Var;
        this.b = l3Var;
        this.c = gxVar;
        gxVar.e = null;
        gxVar.f = null;
        gxVar.s = 0;
        gxVar.p = false;
        gxVar.m = false;
        gx gxVar2 = gxVar.i;
        gxVar.j = gxVar2 != null ? gxVar2.g : null;
        gxVar.i = null;
        Bundle bundle = ayVar.o;
        if (bundle != null) {
            gxVar.d = bundle;
        } else {
            gxVar.d = new Bundle();
        }
    }
}
