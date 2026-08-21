package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.b8;
import defpackage.ca;
import defpackage.cf0;
import defpackage.cx0;
import defpackage.lu0;
import defpackage.xw0;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        lu0.b(context);
        b8 a2 = ca.a();
        a2.S(queryParameter);
        a2.f = cf0.b(intValue);
        if (queryParameter2 != null) {
            a2.e = Base64.decode(queryParameter2, 0);
        }
        cx0 cx0Var = lu0.a().d;
        cx0Var.e.execute(new xw0(cx0Var, a2.o(), i, new Object()));
    }
}
