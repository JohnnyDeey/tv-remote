package defpackage;

import android.app.job.JobParameters;
import android.graphics.Typeface;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class p5 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p5(Object obj, int i, Object obj2) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                q5 q5Var = (q5) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    q5Var.a();
                }
            case 1:
                int i2 = JobInfoSchedulerService.c;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                return;
            default:
                ((wg0) obj2).w((Typeface) obj);
                return;
        }
    }
}
