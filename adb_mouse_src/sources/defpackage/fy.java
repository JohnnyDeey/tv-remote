package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.a;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class fy implements b10, yl0, bz0 {
    public final gx c;
    public final az0 d;
    public a e = null;
    public jy f = null;

    public fy(gx gxVar, az0 az0Var) {
        this.c = gxVar;
        this.d = az0Var;
    }

    @Override // defpackage.yl0
    public final l5 a() {
        f();
        return (l5) this.f.c;
    }

    public final void b(l50 l50Var) {
        this.e.d(l50Var);
    }

    @Override // defpackage.b10
    public final hb0 c() {
        Application application;
        gx gxVar = this.c;
        Context applicationContext = gxVar.H().getApplicationContext();
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
        hb0 hb0Var = new hb0();
        LinkedHashMap linkedHashMap = (LinkedHashMap) hb0Var.b;
        if (application != null) {
            linkedHashMap.put(vj0.f, application);
        }
        linkedHashMap.put(mn.h, this);
        linkedHashMap.put(mn.i, this);
        Bundle bundle = gxVar.h;
        if (bundle != null) {
            linkedHashMap.put(mn.j, bundle);
        }
        return hb0Var;
    }

    @Override // defpackage.bz0
    public final az0 d() {
        f();
        return this.d;
    }

    @Override // defpackage.s50
    public final a e() {
        f();
        return this.e;
    }

    public final void f() {
        if (this.e == null) {
            this.e = new a(this);
            jy jyVar = new jy(this);
            this.f = jyVar;
            jyVar.c();
            mn.n(this);
        }
    }
}
