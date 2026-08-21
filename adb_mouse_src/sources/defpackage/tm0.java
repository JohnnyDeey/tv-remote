package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class tm0 extends mm0 {
    public final /* synthetic */ AtomicReferenceArray e;

    public tm0(long j, tm0 tm0Var, int i) {
        super(j, tm0Var, i);
        this.e = new AtomicReferenceArray(sm0.f);
    }

    @Override // defpackage.mm0
    public final int f() {
        return sm0.f;
    }

    @Override // defpackage.mm0
    public final void g(int i, dl dlVar) {
        this.e.set(i, sm0.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
