package androidx.activity;

import defpackage.ef;
import defpackage.gd0;
import defpackage.hd0;
import defpackage.l50;
import defpackage.ox;
import defpackage.p50;
import defpackage.s50;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements p50, ef {
    public final androidx.lifecycle.a c;
    public final ox d;
    public gd0 e;
    public final /* synthetic */ b f;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(b bVar, androidx.lifecycle.a aVar, ox oxVar) {
        oxVar.getClass();
        this.f = bVar;
        this.c = aVar;
        this.d = oxVar;
        aVar.a(this);
    }

    @Override // defpackage.p50
    public final void c(s50 s50Var, l50 l50Var) {
        if (l50Var == l50.ON_START) {
            b bVar = this.f;
            bVar.getClass();
            ox oxVar = this.d;
            oxVar.getClass();
            bVar.b.addLast(oxVar);
            gd0 gd0Var = new gd0(bVar, oxVar);
            oxVar.b.add(gd0Var);
            bVar.d();
            oxVar.c = new hd0(0, bVar, b.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 1);
            this.e = gd0Var;
            return;
        }
        if (l50Var == l50.ON_STOP) {
            gd0 gd0Var2 = this.e;
            if (gd0Var2 != null) {
                gd0Var2.cancel();
                return;
            }
            return;
        }
        if (l50Var == l50.ON_DESTROY) {
            cancel();
        }
    }

    @Override // defpackage.ef
    public final void cancel() {
        this.c.f(this);
        ox oxVar = this.d;
        oxVar.getClass();
        oxVar.b.remove(this);
        gd0 gd0Var = this.e;
        if (gd0Var != null) {
            gd0Var.cancel();
        }
        this.e = null;
    }
}
