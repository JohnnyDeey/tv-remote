package defpackage;

import android.os.Bundle;
import androidx.activity.a;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class yi implements id0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ yi(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.id0
    public final void a() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                Bundle c = ((l5) aVar.g.c).c("android:support:activity-result");
                if (c != null) {
                    zi ziVar = aVar.m;
                    HashMap hashMap = ziVar.b;
                    HashMap hashMap2 = ziVar.a;
                    Bundle bundle = ziVar.g;
                    ArrayList<Integer> integerArrayList = c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ziVar.d = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        bundle.putAll(c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                            String str = stringArrayList.get(i2);
                            if (hashMap.containsKey(str)) {
                                Integer num = (Integer) hashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    hashMap2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            hashMap2.put(num2, str2);
                            ziVar.b.put(str2, num2);
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ix ixVar = (ix) ((f5) aVar).u.d;
                ixVar.v.b(ixVar, ixVar, null);
                return;
        }
    }
}
