package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class d41 extends BroadcastReceiver {
    public boolean a;
    public final boolean b;
    public final /* synthetic */ a31 c;

    public d41(a31 a31Var, boolean z) {
        this.c = a31Var;
        this.b = z;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        int i;
        try {
            if (this.a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (true != this.b) {
                    i = 4;
                } else {
                    i = 2;
                }
                context.registerReceiver(this, intentFilter, i);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context) {
        if (this.a) {
            context.unregisterReceiver(this);
            this.a = false;
        } else {
            m51.h("BillingBroadcastManager", "Receiver is not registered.");
        }
    }

    public final void c(Bundle bundle, td tdVar, int i, q91 q91Var, long j, boolean z) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            a31 a31Var = this.c;
            if (byteArray != null) {
                ((jp0) ((p61) a31Var.f)).o(g91.u(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j, z);
            } else {
                ((jp0) ((p61) a31Var.f)).o(o61.b(23, i, tdVar, null, q91Var), j, z);
            }
        } catch (Throwable unused) {
            m51.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        q91 q91Var;
        int i;
        td e;
        long j;
        td tdVar;
        int intValue;
        int i2;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        q91 q91Var2 = q91.LOCAL_PURCHASES_UPDATED_ACTION;
        q91 q91Var3 = q91.PURCHASES_UPDATED_ACTION;
        q91 q91Var4 = q91.ALTERNATIVE_BILLING_ACTION;
        if (hashCode != -1484087650) {
            if (hashCode != -337612916) {
                if (hashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    q91Var = q91Var4;
                }
                q91Var = q91.BROADCAST_ACTION_UNSPECIFIED;
            } else {
                if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                    q91Var = q91Var2;
                }
                q91Var = q91.BROADCAST_ACTION_UNSPECIFIED;
            }
        } else {
            if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                q91Var = q91Var3;
            }
            q91Var = q91.BROADCAST_ACTION_UNSPECIFIED;
        }
        if (q91Var.equals(q91Var2) || q91Var.equals(q91Var4)) {
            i = 2;
        } else {
            if (q91Var.equals(q91Var3)) {
                i2 = 32;
            } else {
                i2 = 1;
            }
            i = i2;
        }
        Bundle extras = intent.getExtras();
        a31 a31Var = this.c;
        if (extras == null) {
            m51.h("BillingBroadcastManager", "Bundle is null.");
            p61 p61Var = (p61) a31Var.f;
            td tdVar2 = v61.f;
            ((jp0) p61Var).m(o61.b(11, i, tdVar2, null, q91Var));
            rd rdVar = (rd) a31Var.e;
            if (rdVar != null) {
                rdVar.B(tdVar2, null);
                return;
            }
            return;
        }
        if (i == 2) {
            int i3 = m51.a;
            sd a = td.a();
            a.b = m51.a("BillingBroadcastManager", intent.getExtras());
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                m51.h("BillingBroadcastManager", "Unexpected null bundle received!");
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    m51.g("BillingBroadcastManager", "getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK");
                } else if (obj instanceof Integer) {
                    intValue = ((Integer) obj).intValue();
                    a.c = intValue;
                    a.d = m51.f("BillingBroadcastManager", intent.getExtras());
                    e = a.a();
                } else {
                    m51.h("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                }
            }
            intValue = 0;
            a.c = intValue;
            a.d = m51.f("BillingBroadcastManager", intent.getExtras());
            e = a.a();
        } else {
            e = m51.e(intent, "BillingBroadcastManager");
        }
        long j2 = extras.getLong("billingClientTransactionId", 0L);
        boolean z = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!q91Var.equals(q91Var3) && !q91Var.equals(q91Var2)) {
            if (q91Var.equals(q91Var4)) {
                if (e.a != 0) {
                    c(extras, e, i, q91Var, j2, z);
                    rd rdVar2 = (rd) a31Var.e;
                    f51 f51Var = i51.d;
                    rdVar2.B(e, p51.g);
                    return;
                }
                a31Var.getClass();
                m51.h("BillingBroadcastManager", "No valid alternative billing listener is registered.");
                p61 p61Var2 = (p61) a31Var.f;
                td tdVar3 = v61.f;
                ((jp0) p61Var2).o(o61.b(141, i, tdVar3, null, q91Var), j2, z);
                rd rdVar3 = (rd) a31Var.e;
                f51 f51Var2 = i51.d;
                rdVar3.B(tdVar3, p51.g);
                return;
            }
            return;
        }
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            j = 0;
            Purchase j3 = m51.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
            if (j3 == null) {
                m51.g("BillingHelper", "Couldn't find single purchase data as well.");
                arrayList = null;
            } else {
                arrayList.add(j3);
            }
        } else {
            j = 0;
            m51.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i4 = 0; i4 < stringArrayList.size() && i4 < stringArrayList2.size(); i4++) {
                Purchase j4 = m51.j(stringArrayList.get(i4), stringArrayList2.get(i4));
                if (j4 != null) {
                    arrayList.add(j4);
                }
            }
        }
        if (e.a == 0) {
            p61 p61Var3 = (p61) a31Var.f;
            m91 c = o61.c(i, q91Var);
            jp0 jp0Var = (jp0) p61Var3;
            jp0Var.getClass();
            try {
                h91 h91Var = (h91) c.l();
                w91 w91Var = (w91) c.s().l();
                w91Var.b();
                z91.r((z91) w91Var.d, z);
                h91Var.b();
                m91.u((m91) h91Var.d, (z91) w91Var.a());
                m91 m91Var = (m91) h91Var.a();
                t91 t91Var = (t91) jp0Var.d;
                if (j2 != j) {
                    s91 s91Var = (s91) t91Var.l();
                    s91Var.b();
                    t91.F((t91) s91Var.d, j2);
                    t91Var = (t91) s91Var.a();
                }
                jp0Var.u(m91Var, t91Var);
            } catch (Throwable th) {
                m51.i("BillingLogger", "Unable to log.", th);
            }
            tdVar = e;
        } else {
            tdVar = e;
            c(extras, tdVar, i, q91Var, j2, z);
        }
        ((rd) a31Var.e).B(tdVar, arrayList);
    }
}
