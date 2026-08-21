package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.a;
import defpackage.ae0;
import defpackage.aj;
import defpackage.aj0;
import defpackage.az0;
import defpackage.b10;
import defpackage.b8;
import defpackage.bj;
import defpackage.bz0;
import defpackage.c;
import defpackage.c3;
import defpackage.cj;
import defpackage.cj0;
import defpackage.dj;
import defpackage.e3;
import defpackage.f3;
import defpackage.gb0;
import defpackage.hb0;
import defpackage.hk;
import defpackage.id0;
import defpackage.jy;
import defpackage.ky;
import defpackage.l5;
import defpackage.l50;
import defpackage.l9;
import defpackage.m50;
import defpackage.mn;
import defpackage.nk;
import defpackage.p50;
import defpackage.px;
import defpackage.s50;
import defpackage.vj0;
import defpackage.wg0;
import defpackage.wi;
import defpackage.x2;
import defpackage.xi;
import defpackage.yi;
import defpackage.yl0;
import defpackage.zi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class a extends dj implements bz0, b10, yl0 {
    public final nk d = new nk();
    public final b8 e = new b8(new x2(4, this));
    public final androidx.lifecycle.a f;
    public final jy g;
    public az0 h;
    public b i;
    public final cj j;
    public final jy k;
    public final AtomicInteger l;
    public final zi m;
    public final CopyOnWriteArrayList n;
    public final CopyOnWriteArrayList o;
    public final CopyOnWriteArrayList p;
    public final CopyOnWriteArrayList q;
    public final CopyOnWriteArrayList r;
    public boolean s;
    public boolean t;

    /* JADX WARN: Type inference failed for: r4v0, types: [wi] */
    public a() {
        androidx.lifecycle.a aVar = new androidx.lifecycle.a(this);
        this.f = aVar;
        jy jyVar = new jy(this);
        this.g = jyVar;
        this.i = null;
        cj cjVar = new cj(this);
        this.j = cjVar;
        this.k = new jy(cjVar, (wi) new ky() { // from class: wi
            @Override // defpackage.ky
            public final Object a() {
                a.this.reportFullyDrawn();
                return null;
            }
        });
        this.l = new AtomicInteger();
        this.m = new zi(this);
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        this.s = false;
        this.t = false;
        aVar.a(new p50() { // from class: androidx.activity.ComponentActivity$2
            @Override // defpackage.p50
            public final void c(s50 s50Var, l50 l50Var) {
                View view;
                if (l50Var == l50.ON_STOP) {
                    Window window = a.this.getWindow();
                    if (window != null) {
                        view = window.peekDecorView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            }
        });
        aVar.a(new p50() { // from class: androidx.activity.ComponentActivity$3
            @Override // defpackage.p50
            public final void c(s50 s50Var, l50 l50Var) {
                if (l50Var == l50.ON_DESTROY) {
                    a.this.d.b = null;
                    if (!a.this.isChangingConfigurations()) {
                        a.this.d().a();
                    }
                    cj cjVar2 = a.this.j;
                    a aVar2 = cjVar2.f;
                    aVar2.getWindow().getDecorView().removeCallbacks(cjVar2);
                    aVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(cjVar2);
                }
            }
        });
        aVar.a(new p50() { // from class: androidx.activity.ComponentActivity$4
            @Override // defpackage.p50
            public final void c(s50 s50Var, l50 l50Var) {
                a aVar2 = a.this;
                if (aVar2.h == null) {
                    bj bjVar = (bj) aVar2.getLastNonConfigurationInstance();
                    if (bjVar != null) {
                        aVar2.h = bjVar.a;
                    }
                    if (aVar2.h == null) {
                        aVar2.h = new az0();
                    }
                }
                aVar2.f.f(this);
            }
        });
        jyVar.c();
        mn.n(this);
        ((l5) jyVar.c).e("android:support:activity-result", new xi(0, this));
        h(new yi(this, 0));
    }

    @Override // defpackage.yl0
    public final l5 a() {
        return (l5) this.g.c;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        this.j.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.b10
    public final hb0 c() {
        hb0 hb0Var = new hb0();
        LinkedHashMap linkedHashMap = (LinkedHashMap) hb0Var.b;
        if (getApplication() != null) {
            linkedHashMap.put(vj0.f, getApplication());
        }
        linkedHashMap.put(mn.h, this);
        linkedHashMap.put(mn.i, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(mn.j, getIntent().getExtras());
        }
        return hb0Var;
    }

    @Override // defpackage.bz0
    public final az0 d() {
        if (getApplication() != null) {
            if (this.h == null) {
                bj bjVar = (bj) getLastNonConfigurationInstance();
                if (bjVar != null) {
                    this.h = bjVar.a;
                }
                if (this.h == null) {
                    this.h = new az0();
                }
            }
            return this.h;
        }
        c.o("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }

    @Override // defpackage.s50
    public final androidx.lifecycle.a e() {
        return this.f;
    }

    public final void g(hk hkVar) {
        this.n.add(hkVar);
    }

    public final void h(id0 id0Var) {
        nk nkVar = this.d;
        nkVar.getClass();
        if (nkVar.b != null) {
            id0Var.a();
        }
        nkVar.a.add(id0Var);
    }

    public final b i() {
        if (this.i == null) {
            this.i = new b(new l9(2, this));
            this.f.a(new p50() { // from class: androidx.activity.ComponentActivity$6
                @Override // defpackage.p50
                public final void c(s50 s50Var, l50 l50Var) {
                    if (l50Var == l50.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                        b bVar = a.this.i;
                        OnBackInvokedDispatcher a = aj.a((a) s50Var);
                        bVar.getClass();
                        a.getClass();
                        bVar.e = a;
                        bVar.c(bVar.g);
                    }
                }
            });
        }
        return this.i;
    }

    public final void j() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final f3 k(e3 e3Var, c3 c3Var) {
        return this.m.c("activity_rq#" + this.l.getAndIncrement(), this, e3Var, c3Var);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.m.a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        i().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((hk) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.dj, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.g.d(bundle);
        nk nkVar = this.d;
        nkVar.getClass();
        nkVar.b = this;
        Iterator it = nkVar.a.iterator();
        while (it.hasNext()) {
            ((id0) it.next()).a();
        }
        super.onCreate(bundle);
        int i = cj0.d;
        aj0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.e.f).iterator();
            while (it.hasNext()) {
                ((px) it.next()).a.j();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.e.f).iterator();
            while (it.hasNext()) {
                if (((px) it.next()).a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.s = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.s = false;
            Iterator it = this.q.iterator();
            while (it.hasNext()) {
                hk hkVar = (hk) it.next();
                configuration.getClass();
                hkVar.accept(new gb0(z));
            }
        } catch (Throwable th) {
            this.s = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((hk) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.e.f).iterator();
        while (it.hasNext()) {
            ((px) it.next()).a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.t = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.t = false;
            Iterator it = this.r.iterator();
            while (it.hasNext()) {
                hk hkVar = (hk) it.next();
                configuration.getClass();
                hkVar.accept(new ae0(z));
            }
        } catch (Throwable th) {
            this.t = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            Iterator it = ((CopyOnWriteArrayList) this.e.f).iterator();
            while (it.hasNext()) {
                ((px) it.next()).a.s();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.m.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [bj, java.lang.Object] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        bj bjVar;
        az0 az0Var = this.h;
        if (az0Var == null && (bjVar = (bj) getLastNonConfigurationInstance()) != null) {
            az0Var = bjVar.a;
        }
        if (az0Var == null) {
            return null;
        }
        ?? obj = new Object();
        obj.a = az0Var;
        return obj;
    }

    @Override // defpackage.dj, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.a aVar = this.f;
        if (aVar != null) {
            aVar.c("setCurrentState");
            aVar.e(m50.e);
        }
        super.onSaveInstanceState(bundle);
        this.g.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((hk) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (wg0.r()) {
                wg0.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            jy jyVar = this.k;
            synchronized (jyVar.b) {
                try {
                    jyVar.a = true;
                    ArrayList arrayList = (ArrayList) jyVar.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((ky) obj).a();
                    }
                    ((ArrayList) jyVar.c).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        j();
        this.j.a(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        j();
        this.j.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        this.j.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.s) {
            return;
        }
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((hk) it.next()).accept(new gb0(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.t) {
            return;
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            ((hk) it.next()).accept(new ae0(z));
        }
    }
}
