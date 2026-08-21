package androidx.lifecycle;

import android.os.Bundle;
import defpackage.f40;
import defpackage.l50;
import defpackage.p50;
import defpackage.s50;
import defpackage.tl0;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements p50 {
    public final tl0 c;

    public SavedStateHandleAttacher(tl0 tl0Var) {
        this.c = tl0Var;
    }

    @Override // defpackage.p50
    public final void c(s50 s50Var, l50 l50Var) {
        if (l50Var == l50.ON_CREATE) {
            s50Var.e().f(this);
            tl0 tl0Var = this.c;
            if (!tl0Var.b) {
                Bundle c = tl0Var.a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = tl0Var.c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (c != null) {
                    bundle.putAll(c);
                }
                tl0Var.c = bundle;
                tl0Var.b = true;
                return;
            }
            return;
        }
        f40.l(l50Var, "Next event must be ON_CREATE, it was ");
    }
}
