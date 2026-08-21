package defpackage;

import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class qd {
    public final /* synthetic */ rd a;

    public /* synthetic */ qd(rd rdVar) {
        this.a = rdVar;
    }

    public void a(td tdVar, List list) {
        tdVar.getClass();
        list.getClass();
        if (tdVar.a == 0) {
            boolean z = false;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Purchase purchase = (Purchase) it.next();
                    purchase.getClass();
                    if (rd.A(purchase)) {
                        z = true;
                        break;
                    }
                }
            }
            Boolean valueOf = Boolean.valueOf(z);
            rd rdVar = this.a;
            if (valueOf.equals((Boolean) rdVar.f)) {
                return;
            }
            rdVar.f = Boolean.valueOf(z);
            ((f5) rdVar.c).runOnUiThread(new pd(rdVar, z));
            return;
        }
        Log.e("BillingManager", "Failed to query purchases: " + tdVar.c);
    }
}
