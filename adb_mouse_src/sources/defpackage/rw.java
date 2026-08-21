package defpackage;

import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class rw implements hk {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hk
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                sw swVar = (sw) obj;
                if (swVar == null) {
                    swVar = new sw(-3);
                }
                ((r6) this.b).J(swVar);
                return;
            case 1:
                sw swVar2 = (sw) obj;
                synchronized (tw.c) {
                    try {
                        io0 io0Var = tw.d;
                        ArrayList arrayList = (ArrayList) io0Var.get((String) this.b);
                        if (arrayList != null) {
                            io0Var.remove((String) this.b);
                            for (int i = 0; i < arrayList.size(); i++) {
                                ((hk) arrayList.get(i)).accept(swVar2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            default:
                td tdVar = (td) obj;
                ArrayList arrayList2 = new ArrayList();
                new ArrayList();
                rd rdVar = ((qd) this.b).a;
                tdVar.getClass();
                if (tdVar.a == 0) {
                    if (!arrayList2.isEmpty()) {
                        rdVar.e = (kf0) arrayList2.get(0);
                        return;
                    }
                    return;
                }
                Log.e("BillingManager", "Failed to query product details: " + tdVar.c);
                return;
        }
    }
}
