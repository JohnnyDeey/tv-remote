package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.b8;
import defpackage.ca;
import defpackage.cf0;
import defpackage.cx0;
import defpackage.lu0;
import defpackage.p5;
import defpackage.xw0;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int c = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        lu0.b(getApplicationContext());
        b8 a = ca.a();
        a.S(string);
        a.f = cf0.b(i);
        if (string2 != null) {
            a.e = Base64.decode(string2, 0);
        }
        cx0 cx0Var = lu0.a().d;
        cx0Var.e.execute(new xw0(cx0Var, a.o(), i2, new p5(this, 1, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
