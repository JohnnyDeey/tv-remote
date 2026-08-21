package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class lj implements vm0 {
    public final AtomicReference a;

    public lj(ym0 ym0Var) {
        this.a = new AtomicReference(ym0Var);
    }

    @Override // defpackage.vm0
    public final Iterator iterator() {
        vm0 vm0Var = (vm0) this.a.getAndSet(null);
        if (vm0Var != null) {
            return vm0Var.iterator();
        }
        c.o("This sequence can be consumed only once.");
        return null;
    }
}
