package androidx.lifecycle;

import defpackage.l50;
import defpackage.p50;
import defpackage.s50;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements p50 {
    public boolean c;

    @Override // defpackage.p50
    public final void c(s50 s50Var, l50 l50Var) {
        if (l50Var == l50.ON_DESTROY) {
            this.c = false;
            s50Var.e().f(this);
        }
    }
}
