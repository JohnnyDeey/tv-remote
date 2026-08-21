package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class d6 {
    public Object a;
    public Object b;

    public d6() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new or());
    }

    public static float h(int i, int i2, int i3) {
        return mn.l((i - i2) / i3, 0.0f, 1.0f);
    }

    public abstract void c();

    public void d() {
        c6 c6Var = (c6) this.a;
        if (c6Var != null) {
            try {
                ((g6) this.b).m.unregisterReceiver(c6Var);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public void e() {
        xo0 xo0Var = (xo0) this.a;
        hf hfVar = (hf) this.b;
        HashSet hashSet = xo0Var.e;
        if (hashSet.remove(hfVar) && hashSet.isEmpty()) {
            xo0Var.b();
        }
    }

    public abstract IntentFilter f();

    public abstract int g();

    public MenuItem i(MenuItem menuItem) {
        if (menuItem instanceof pq0) {
            pq0 pq0Var = (pq0) menuItem;
            if (((io0) this.b) == null) {
                this.b = new io0(0);
            }
            MenuItem menuItem2 = (MenuItem) ((io0) this.b).get(pq0Var);
            if (menuItem2 == null) {
                da0 da0Var = new da0((Context) this.a, pq0Var);
                ((io0) this.b).put(pq0Var, da0Var);
                return da0Var;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public abstract void j();

    public abstract void k();

    public abstract void l(zc zcVar);

    public abstract void m();

    public void n() {
        d();
        IntentFilter f = f();
        if (f.countActions() == 0) {
            return;
        }
        if (((c6) this.a) == null) {
            this.a = new c6(this);
        }
        ((g6) this.b).m.registerReceiver((c6) this.a, f);
    }

    public abstract void o();

    public abstract void p();

    public d6(Context context) {
        this.a = context;
    }

    public d6(xo0 xo0Var, hf hfVar) {
        this.a = xo0Var;
        this.b = hfVar;
    }

    public d6(g6 g6Var) {
        this.b = g6Var;
    }
}
