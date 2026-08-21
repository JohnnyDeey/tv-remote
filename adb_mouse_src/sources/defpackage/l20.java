package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class l20 extends n30 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(l20.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final m30 g;

    public l20(m30 m30Var) {
        this.g = m30Var;
    }

    @Override // defpackage.n30
    public final boolean k() {
        return true;
    }

    @Override // defpackage.n30
    public final void l(Throwable th) {
        if (h.compareAndSet(this, 0, 1)) {
            this.g.h(th);
        }
    }
}
