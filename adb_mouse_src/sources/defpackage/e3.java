package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class e3 extends k20 {
    public final /* synthetic */ int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(int i) {
        super(9);
        this.G = i;
    }

    @Override // defpackage.k20
    public d3 D(Context context, Object obj) {
        boolean z;
        int checkPermission;
        switch (this.G) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new d3(vt.c);
                }
                int length = strArr.length;
                int i = 0;
                while (true) {
                    z = true;
                    if (i < length) {
                        String str = strArr[i];
                        if (str != null) {
                            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                                if (new jc0(context).a.areNotificationsEnabled()) {
                                    checkPermission = 0;
                                } else {
                                    checkPermission = -1;
                                }
                            } else {
                                checkPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
                            }
                            if (checkPermission != 0) {
                                z = false;
                            }
                            if (!z) {
                                z = false;
                            } else {
                                i++;
                            }
                        } else {
                            c.g("permission must be non-null");
                        }
                    }
                }
                if (z) {
                    int S = q80.S(strArr.length);
                    if (S < 16) {
                        S = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(S);
                    for (String str2 : strArr) {
                        linkedHashMap.put(str2, Boolean.TRUE);
                    }
                    return new d3(linkedHashMap);
                }
                return null;
            default:
                return super.D(context, obj);
        }
    }

    @Override // defpackage.k20
    public final Object Z(int i, Intent intent) {
        boolean z;
        switch (this.G) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            if (i2 == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            arrayList.add(Boolean.valueOf(z));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArrayExtra) {
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(ii.n0(arrayList2), ii.n0(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new td0(it.next(), it2.next()));
                        }
                        return q80.U(arrayList3);
                    }
                }
                return vt.c;
            case 1:
                return new b3(i, intent);
            case 2:
                return new b3(i, intent);
            default:
                return new b3(i, intent);
        }
    }

    @Override // defpackage.k20
    public final Intent m(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.G) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                putExtra.getClass();
                return putExtra;
            case 1:
                Intent intent = (Intent) obj;
                intent.getClass();
                return intent;
            case 2:
                j20 j20Var = (j20) obj;
                j20Var.getClass();
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", j20Var);
                putExtra2.getClass();
                return putExtra2;
            default:
                j20 j20Var2 = (j20) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = j20Var2.d;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = j20Var2.c;
                        intentSender.getClass();
                        j20Var2 = new j20(intentSender, null, j20Var2.e, j20Var2.f);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", j20Var2);
                if (vx.F(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent2);
                }
                return intent2;
        }
    }
}
