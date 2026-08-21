package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.b8;
import defpackage.c;
import defpackage.ff0;
import defpackage.gf0;
import defpackage.l50;
import defpackage.n50;
import defpackage.o50;
import defpackage.ut;
import defpackage.x10;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements x10 {
    @Override // defpackage.x10
    public final List a() {
        return ut.c;
    }

    @Override // defpackage.x10
    public final Object b(Context context) {
        context.getClass();
        b8 C = b8.C(context);
        C.getClass();
        if (((HashSet) C.e).contains(ProcessLifecycleInitializer.class)) {
            if (!o50.a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new n50());
            }
            gf0 gf0Var = gf0.k;
            gf0Var.getClass();
            gf0Var.g = new Handler();
            gf0Var.h.d(l50.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            applicationContext2.getClass();
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new ff0(gf0Var));
            return gf0Var;
        }
        c.o("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        return null;
    }
}
