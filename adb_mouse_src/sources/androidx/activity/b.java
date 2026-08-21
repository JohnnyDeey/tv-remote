package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import defpackage.bd0;
import defpackage.cd0;
import defpackage.cq;
import defpackage.dd0;
import defpackage.fd0;
import defpackage.h8;
import defpackage.hd0;
import defpackage.m50;
import defpackage.ox;
import defpackage.pp;
import defpackage.s50;
import defpackage.vx;
import java.util.Iterator;
import java.util.ListIterator;
import svarzee.android.apps.adb_mouse.MainActivity;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class b {
    public final Runnable a;
    public final h8 b = new h8();
    public ox c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public b(Runnable runnable) {
        OnBackInvokedCallback a;
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                a = fd0.a.a(new bd0(this, 0), new bd0(this, 1), new cd0(0, this), new cd0(1, this));
            } else {
                a = dd0.a.a(new cd0(2, this));
            }
            this.d = a;
        }
    }

    public final void a(s50 s50Var, ox oxVar) {
        oxVar.getClass();
        androidx.lifecycle.a e = s50Var.e();
        if (e.d == m50.c) {
            return;
        }
        oxVar.b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, e, oxVar));
        d();
        oxVar.c = new hd0(0, this, b.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 0);
    }

    public final void b() {
        Object obj;
        h8 h8Var = this.b;
        ListIterator listIterator = h8Var.listIterator(h8Var.e);
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((ox) obj).a) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ox oxVar = (ox) obj;
        this.c = null;
        if (oxVar != null) {
            switch (oxVar.d) {
                case 0:
                    vx vxVar = (vx) oxVar.e;
                    vxVar.x(true);
                    if (vxVar.h.a) {
                        vxVar.M();
                        return;
                    } else {
                        vxVar.g.b();
                        return;
                    }
                default:
                    cq cqVar = ((MainActivity) oxVar.e).A;
                    pp ppVar = new pp(4);
                    cqVar.getClass();
                    cqVar.a.i(ppVar);
                    return;
            }
        }
        this.a.run();
    }

    public final void c(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.d) != null) {
            dd0 dd0Var = dd0.a;
            if (z && !this.f) {
                dd0Var.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f = true;
            } else if (!z && this.f) {
                dd0Var.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f = false;
            }
        }
    }

    public final void d() {
        boolean z = this.g;
        boolean z2 = false;
        h8 h8Var = this.b;
        if (h8Var == null || !h8Var.isEmpty()) {
            Iterator<E> it = h8Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((ox) it.next()).a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 != z && Build.VERSION.SDK_INT >= 33) {
            c(z2);
        }
    }
}
