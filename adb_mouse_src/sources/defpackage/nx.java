package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class nx implements c3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vx b;

    public /* synthetic */ nx(vx vxVar, int i) {
        this.a = i;
        this.b = vxVar;
    }

    @Override // defpackage.c3
    public final void a(Object obj) {
        int i;
        int i2 = this.a;
        vx vxVar = this.b;
        switch (i2) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (((Boolean) arrayList.get(i3)).booleanValue()) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    iArr[i3] = i;
                }
                sx sxVar = (sx) vxVar.C.pollFirst();
                if (sxVar == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = sxVar.c;
                if (vxVar.c.e(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            case 1:
                b3 b3Var = (b3) obj;
                sx sxVar2 = (sx) vxVar.C.pollFirst();
                if (sxVar2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String str2 = sxVar2.c;
                int i4 = sxVar2.d;
                gx e = vxVar.c.e(str2);
                if (e == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    return;
                }
                e.s(i4, b3Var.c, b3Var.d);
                return;
            default:
                b3 b3Var2 = (b3) obj;
                sx sxVar3 = (sx) vxVar.C.pollFirst();
                if (sxVar3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str3 = sxVar3.c;
                int i5 = sxVar3.d;
                gx e2 = vxVar.c.e(str3);
                if (e2 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    return;
                }
                e2.s(i5, b3Var2.c, b3Var2.d);
                return;
        }
    }
}
