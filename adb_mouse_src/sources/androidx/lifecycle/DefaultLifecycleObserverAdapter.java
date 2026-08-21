package androidx.lifecycle;

import defpackage.c;
import defpackage.co;
import defpackage.eo;
import defpackage.l50;
import defpackage.p50;
import defpackage.s50;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements p50 {
    public final co c;
    public final p50 d;

    public DefaultLifecycleObserverAdapter(co coVar, p50 p50Var) {
        this.c = coVar;
        this.d = p50Var;
    }

    @Override // defpackage.p50
    public final void c(s50 s50Var, l50 l50Var) {
        int i = eo.a[l50Var.ordinal()];
        if (i != 3) {
            if (i == 7) {
                c.k("ON_ANY must not been send by anybody");
                return;
            }
        } else {
            this.c.a();
        }
        p50 p50Var = this.d;
        if (p50Var != null) {
            p50Var.c(s50Var, l50Var);
        }
    }
}
