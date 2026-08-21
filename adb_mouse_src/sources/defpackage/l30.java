package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class l30 extends q30 {
    public final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l30() {
        super(true);
        wg wgVar;
        wg wgVar2;
        boolean z = true;
        B(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q30.d;
        vg vgVar = (vg) atomicReferenceFieldUpdater.get(this);
        if (vgVar instanceof wg) {
            wgVar = (wg) vgVar;
        } else {
            wgVar = null;
        }
        if (wgVar != null) {
            q30 j = wgVar.j();
            while (!j.w()) {
                vg vgVar2 = (vg) atomicReferenceFieldUpdater.get(j);
                if (vgVar2 instanceof wg) {
                    wgVar2 = (wg) vgVar2;
                } else {
                    wgVar2 = null;
                }
                if (wgVar2 != null) {
                    j = wgVar2.j();
                }
            }
            this.e = z;
        }
        z = false;
        this.e = z;
    }

    @Override // defpackage.q30
    public final boolean w() {
        return this.e;
    }

    @Override // defpackage.q30
    public final boolean x() {
        return true;
    }
}
