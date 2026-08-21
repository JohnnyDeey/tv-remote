package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ug extends n30 {
    public final /* synthetic */ int g;
    public final Object h;

    public /* synthetic */ ug(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    @Override // defpackage.n30
    public final boolean k() {
        switch (this.g) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override // defpackage.n30
    public final void l(Throwable th) {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                ff ffVar = (ff) obj;
                CancellationException v = j().v();
                if (ffVar.v()) {
                    qk qkVar = ffVar.f;
                    qkVar.getClass();
                    vq vqVar = (vq) qkVar;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vq.j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater.get(vqVar);
                        ce ceVar = mn.c;
                        if (k20.c(obj2, ceVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(vqVar, ceVar, v)) {
                                if (atomicReferenceFieldUpdater.get(vqVar) != ceVar) {
                                    break;
                                }
                            }
                            return;
                        } else {
                            if (obj2 instanceof Throwable) {
                                return;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(vqVar, obj2, null)) {
                                if (atomicReferenceFieldUpdater.get(vqVar) != obj2) {
                                    break;
                                }
                            }
                        }
                    }
                }
                ffVar.n(v);
                if (!ffVar.v()) {
                    ffVar.p();
                    return;
                }
                return;
            case 1:
                ((ff) obj).e(nw0.a);
                return;
            default:
                ((m30) obj).h(th);
                return;
        }
    }
}
