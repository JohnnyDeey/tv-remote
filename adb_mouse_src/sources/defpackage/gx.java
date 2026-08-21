package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.a;
import androidx.lifecycle.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class gx implements ComponentCallbacks, View.OnCreateContextMenuListener, s50, bz0, b10, yl0 {
    public static final Object V = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean E;
    public ViewGroup F;
    public View G;
    public boolean H;
    public fx J;
    public boolean K;
    public LayoutInflater L;
    public boolean M;
    public String N;
    public a P;
    public fy Q;
    public jy S;
    public final ArrayList T;
    public final dx U;
    public Bundle d;
    public SparseArray e;
    public Bundle f;
    public Bundle h;
    public gx i;
    public int k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public vx t;
    public ix u;
    public gx w;
    public int x;
    public int y;
    public String z;
    public int c = -1;
    public String g = UUID.randomUUID().toString();
    public String j = null;
    public Boolean l = null;
    public vx v = new vx();
    public final boolean D = true;
    public boolean I = true;
    public m50 O = m50.g;
    public final b R = new b();

    public gx() {
        new AtomicInteger();
        this.T = new ArrayList();
        this.U = new dx(this);
        n();
    }

    public void A() {
        this.E = true;
    }

    public void B() {
        this.E = true;
    }

    public void D(Bundle bundle) {
        this.E = true;
    }

    public void E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.v.L();
        this.r = true;
        this.Q = new fy(this, d());
        View v = v(layoutInflater, viewGroup);
        this.G = v;
        fy fyVar = this.Q;
        if (v != null) {
            fyVar.f();
            View view = this.G;
            fy fyVar2 = this.Q;
            view.getClass();
            view.setTag(R.id.view_tree_lifecycle_owner, fyVar2);
            View view2 = this.G;
            fy fyVar3 = this.Q;
            view2.getClass();
            view2.setTag(R.id.view_tree_view_model_store_owner, fyVar3);
            View view3 = this.G;
            fy fyVar4 = this.Q;
            view3.getClass();
            view3.setTag(R.id.view_tree_saved_state_registry_owner, fyVar4);
            b bVar = this.R;
            fy fyVar5 = this.Q;
            bVar.getClass();
            b.a("setValue");
            bVar.g++;
            bVar.e = fyVar5;
            bVar.c(null);
            return;
        }
        if (fyVar.e == null) {
            this.Q = null;
        } else {
            c.o("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public final LayoutInflater F() {
        LayoutInflater y = y(null);
        this.L = y;
        return y;
    }

    public final f5 G() {
        f5 f5Var;
        ix ixVar = this.u;
        if (ixVar == null) {
            f5Var = null;
        } else {
            f5Var = ixVar.s;
        }
        if (f5Var != null) {
            return f5Var;
        }
        c.o(qo0.p("Fragment ", this, " not attached to an activity."));
        return null;
    }

    public final Context H() {
        Context h = h();
        if (h != null) {
            return h;
        }
        c.o(qo0.p("Fragment ", this, " not attached to a context."));
        return null;
    }

    public final View I() {
        View view = this.G;
        if (view != null) {
            return view;
        }
        c.o(qo0.p("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public final void J(int i, int i2, int i3, int i4) {
        if (this.J == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().b = i;
        f().c = i2;
        f().d = i3;
        f().e = i4;
    }

    public final void K(Bundle bundle) {
        vx vxVar = this.t;
        if (vxVar != null && (vxVar.E || vxVar.F)) {
            c.o("Fragment already added and state has been saved");
        } else {
            this.h = bundle;
        }
    }

    public final void L(gx gxVar) {
        vx vxVar;
        if (gxVar != null) {
            cy cyVar = dy.a;
            dy.b(new tz0(this, "Attempting to set target fragment " + gxVar + " with request code 0 for fragment " + this));
            dy.a(this).getClass();
        }
        vx vxVar2 = this.t;
        if (gxVar != null) {
            vxVar = gxVar.t;
        } else {
            vxVar = null;
        }
        if (vxVar2 != null && vxVar != null && vxVar2 != vxVar) {
            c.k(qo0.p("Fragment ", gxVar, " must share the same FragmentManager to be set as a target fragment"));
            return;
        }
        for (gx gxVar2 = gxVar; gxVar2 != null; gxVar2 = gxVar2.m(false)) {
            if (gxVar2 == this) {
                throw new IllegalArgumentException("Setting " + gxVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (gxVar == null) {
            this.j = null;
            this.i = null;
        } else if (this.t != null && gxVar.t != null) {
            this.j = gxVar.g;
            this.i = null;
        } else {
            this.j = null;
            this.i = gxVar;
        }
        this.k = 0;
    }

    @Override // defpackage.yl0
    public final l5 a() {
        return (l5) this.S.c;
    }

    public wv0 b() {
        return new ex(this);
    }

    @Override // defpackage.b10
    public final hb0 c() {
        Application application;
        Context applicationContext = H().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && vx.F(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + H().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        hb0 hb0Var = new hb0();
        LinkedHashMap linkedHashMap = (LinkedHashMap) hb0Var.b;
        if (application != null) {
            linkedHashMap.put(vj0.f, application);
        }
        linkedHashMap.put(mn.h, this);
        linkedHashMap.put(mn.i, this);
        Bundle bundle = this.h;
        if (bundle != null) {
            linkedHashMap.put(mn.j, bundle);
        }
        return hb0Var;
    }

    @Override // defpackage.bz0
    public final az0 d() {
        if (this.t != null) {
            if (i() != 1) {
                HashMap hashMap = this.t.L.e;
                az0 az0Var = (az0) hashMap.get(this.g);
                if (az0Var == null) {
                    az0 az0Var2 = new az0();
                    hashMap.put(this.g, az0Var2);
                    return az0Var2;
                }
                return az0Var;
            }
            c.o("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        c.o("Can't access ViewModels from detached fragment");
        return null;
    }

    @Override // defpackage.s50
    public final a e() {
        return this.P;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fx, java.lang.Object] */
    public final fx f() {
        if (this.J == null) {
            ?? obj = new Object();
            Object obj2 = V;
            obj.g = obj2;
            obj.h = obj2;
            obj.i = obj2;
            obj.j = 1.0f;
            obj.k = null;
            this.J = obj;
        }
        return this.J;
    }

    public final vx g() {
        if (this.u != null) {
            return this.v;
        }
        c.o(qo0.p("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public final Context h() {
        ix ixVar = this.u;
        if (ixVar == null) {
            return null;
        }
        return ixVar.t;
    }

    public final int i() {
        m50 m50Var = this.O;
        if (m50Var != m50.d && this.w != null) {
            return Math.min(m50Var.ordinal(), this.w.i());
        }
        return m50Var.ordinal();
    }

    public final vx j() {
        vx vxVar = this.t;
        if (vxVar != null) {
            return vxVar;
        }
        c.o(qo0.p("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public final Resources k() {
        return H().getResources();
    }

    public final String l(int i) {
        return k().getString(i);
    }

    public final gx m(boolean z) {
        String str;
        if (z) {
            cy cyVar = dy.a;
            dy.b(new tz0(this, "Attempting to get target fragment from fragment " + this));
            dy.a(this).getClass();
        }
        gx gxVar = this.i;
        if (gxVar != null) {
            return gxVar;
        }
        vx vxVar = this.t;
        if (vxVar != null && (str = this.j) != null) {
            return vxVar.c.d(str);
        }
        return null;
    }

    public final void n() {
        this.P = new a(this);
        this.S = new jy(this);
        ArrayList arrayList = this.T;
        dx dxVar = this.U;
        if (!arrayList.contains(dxVar)) {
            if (this.c >= 0) {
                dxVar.a();
            } else {
                arrayList.add(dxVar);
            }
        }
    }

    public final void o() {
        n();
        this.N = this.g;
        this.g = UUID.randomUUID().toString();
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.s = 0;
        this.t = null;
        this.v = new vx();
        this.u = null;
        this.x = 0;
        this.y = 0;
        this.z = null;
        this.A = false;
        this.B = false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.E = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        G().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.E = true;
    }

    public final boolean p() {
        boolean p;
        if (!this.A) {
            vx vxVar = this.t;
            if (vxVar != null) {
                gx gxVar = this.w;
                vxVar.getClass();
                if (gxVar == null) {
                    p = false;
                } else {
                    p = gxVar.p();
                }
                if (p) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean q() {
        if (this.s > 0) {
            return true;
        }
        return false;
    }

    public void r() {
        this.E = true;
    }

    public void s(int i, int i2, Intent intent) {
        if (vx.F(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void t(Context context) {
        f5 f5Var;
        this.E = true;
        ix ixVar = this.u;
        if (ixVar == null) {
            f5Var = null;
        } else {
            f5Var = ixVar.s;
        }
        if (f5Var != null) {
            this.E = true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.g);
        if (this.x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.x));
        }
        if (this.z != null) {
            sb.append(" tag=");
            sb.append(this.z);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(Bundle bundle) {
        Parcelable parcelable;
        this.E = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.v.R(parcelable);
            vx vxVar = this.v;
            vxVar.E = false;
            vxVar.F = false;
            vxVar.L.h = false;
            vxVar.t(1);
        }
        vx vxVar2 = this.v;
        if (vxVar2.s >= 1) {
            return;
        }
        vxVar2.E = false;
        vxVar2.F = false;
        vxVar2.L.h = false;
        vxVar2.t(1);
    }

    public View v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void w() {
        this.E = true;
    }

    public void x() {
        this.E = true;
    }

    public LayoutInflater y(Bundle bundle) {
        ix ixVar = this.u;
        if (ixVar != null) {
            f5 f5Var = ixVar.w;
            LayoutInflater cloneInContext = f5Var.getLayoutInflater().cloneInContext(f5Var);
            cloneInContext.setFactory2(this.v.f);
            return cloneInContext;
        }
        c.o("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        return null;
    }

    public abstract void z(Bundle bundle);

    public void C(Bundle bundle) {
    }
}
