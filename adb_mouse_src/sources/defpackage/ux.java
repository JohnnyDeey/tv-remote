package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ux implements tx {
    public final int a;
    public final /* synthetic */ vx b;

    public ux(vx vxVar, int i) {
        this.b = vxVar;
        this.a = i;
    }

    @Override // defpackage.tx
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        vx vxVar = this.b;
        gx gxVar = vxVar.w;
        int i = this.a;
        if (gxVar != null && i < 0 && gxVar.g().N(-1, 0)) {
            return false;
        }
        return vxVar.O(arrayList, arrayList2, i, 1);
    }
}
