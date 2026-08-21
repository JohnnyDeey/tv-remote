package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.a;
import defpackage.b8;
import defpackage.co;
import defpackage.gj;
import defpackage.hn;
import defpackage.s50;
import defpackage.ws;
import defpackage.x10;
import defpackage.zs;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements x10 {
    @Override // defpackage.x10
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [pw, ws] */
    @Override // defpackage.x10
    public final Object b(Context context) {
        Object obj;
        ?? wsVar = new ws(new hn(context, 1));
        wsVar.a = 1;
        if (zs.k == null) {
            synchronized (zs.j) {
                try {
                    if (zs.k == null) {
                        zs.k = new zs(wsVar);
                    }
                } finally {
                }
            }
        }
        b8 C = b8.C(context);
        C.getClass();
        synchronized (b8.h) {
            try {
                obj = ((HashMap) C.d).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = C.t(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final a e = ((s50) obj).e();
        e.a(new co(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
            @Override // defpackage.co
            public final void a() {
                Handler handler;
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = gj.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new Object(), 500L);
                e.f(this);
            }
        });
        return Boolean.TRUE;
    }
}
