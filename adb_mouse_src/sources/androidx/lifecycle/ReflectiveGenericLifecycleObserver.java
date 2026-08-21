package androidx.lifecycle;

import defpackage.l50;
import defpackage.mh;
import defpackage.oh;
import defpackage.p50;
import defpackage.r50;
import defpackage.s50;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements p50 {
    public final r50 c;
    public final mh d;

    public ReflectiveGenericLifecycleObserver(r50 r50Var) {
        this.c = r50Var;
        oh ohVar = oh.c;
        Class<?> cls = r50Var.getClass();
        mh mhVar = (mh) ohVar.a.get(cls);
        this.d = mhVar == null ? ohVar.a(cls, null) : mhVar;
    }

    @Override // defpackage.p50
    public final void c(s50 s50Var, l50 l50Var) {
        HashMap hashMap = this.d.a;
        List list = (List) hashMap.get(l50Var);
        r50 r50Var = this.c;
        mh.a(list, s50Var, l50Var, r50Var);
        mh.a((List) hashMap.get(l50.ON_ANY), s50Var, l50Var, r50Var);
    }
}
