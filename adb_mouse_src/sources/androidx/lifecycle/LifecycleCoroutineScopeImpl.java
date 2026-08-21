package androidx.lifecycle;

import defpackage.dl;
import defpackage.l50;
import defpackage.ll;
import defpackage.m50;
import defpackage.mn;
import defpackage.p50;
import defpackage.s50;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl implements p50, ll {
    public final a c;
    public final dl d;

    public LifecycleCoroutineScopeImpl(a aVar, dl dlVar) {
        dlVar.getClass();
        this.c = aVar;
        this.d = dlVar;
        if (aVar.d == m50.c) {
            mn.e(dlVar, null);
        }
    }

    @Override // defpackage.ll
    public final dl b() {
        return this.d;
    }

    @Override // defpackage.p50
    public final void c(s50 s50Var, l50 l50Var) {
        a aVar = this.c;
        if (aVar.d.compareTo(m50.c) <= 0) {
            aVar.f(this);
            mn.e(this.d, null);
        }
    }
}
