package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class e00 implements Handler.Callback {
    public static final Status o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status p = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object q = new Object();
    public static e00 r;
    public long a;
    public boolean b;
    public er0 c;
    public u31 d;
    public final Context e;
    public final a00 f;
    public final jp0 g;
    public final AtomicInteger h;
    public final AtomicInteger i;
    public final ConcurrentHashMap j;
    public final p8 k;
    public final p8 l;
    public final y31 m;
    public volatile boolean n;

    /* JADX WARN: Type inference failed for: r2v5, types: [y31, android.os.Handler] */
    public e00(Context context, Looper looper) {
        a00 a00Var = a00.c;
        this.a = 10000L;
        this.b = false;
        this.h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.k = new p8(0);
        this.l = new p8(0);
        this.n = true;
        this.e = context;
        ?? handler = new Handler(looper, this);
        Looper.getMainLooper();
        this.m = handler;
        this.f = a00Var;
        this.g = new jp0(9);
        PackageManager packageManager = context.getPackageManager();
        if (f20.v == null) {
            f20.v = Boolean.valueOf(k20.K() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (f20.v.booleanValue()) {
            this.n = false;
        }
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static Status b(c5 c5Var, jj jjVar) {
        return new Status(17, "API: " + ((String) c5Var.b.e) + " is not available on this device. Connection failed with: " + String.valueOf(jjVar), jjVar.e, jjVar);
    }

    public static e00 d(Context context) {
        e00 e00Var;
        HandlerThread handlerThread;
        synchronized (q) {
            if (r == null) {
                synchronized (qa1.g) {
                    try {
                        handlerThread = qa1.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            qa1.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = qa1.i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = a00.b;
                r = new e00(applicationContext, looper);
            }
            e00Var = r;
        }
        return e00Var;
    }

    public final boolean a(jj jjVar, int i) {
        PendingIntent pendingIntent;
        boolean booleanValue;
        boolean isInstantApp;
        boolean z;
        PendingIntent pendingIntent2;
        Boolean bool;
        a00 a00Var = this.f;
        Context context = this.e;
        a00Var.getClass();
        synchronized (f20.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f20.a;
            pendingIntent = null;
            if (context2 != null && (bool = f20.b) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            f20.b = null;
            if (k20.K()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f20.b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f20.b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f20.b = Boolean.FALSE;
                }
            }
            f20.a = applicationContext;
            booleanValue = f20.b.booleanValue();
        }
        if (booleanValue) {
            return false;
        }
        int i2 = jjVar.d;
        if (i2 != 0 && jjVar.e != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            pendingIntent2 = jjVar.e;
        } else {
            Intent a = a00Var.a(i2, context, null);
            if (a != null) {
                pendingIntent = PendingIntent.getActivity(context, 0, a, 201326592);
            }
            pendingIntent2 = pendingIntent;
        }
        if (pendingIntent2 == null) {
            return false;
        }
        int i3 = jjVar.d;
        int i4 = GoogleApiActivity.d;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent2);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        a00Var.f(context, i3, PendingIntent.getActivity(context, 0, intent, v31.a | 134217728));
        return true;
    }

    public final y21 c(u31 u31Var) {
        c5 c5Var = u31Var.e;
        ConcurrentHashMap concurrentHashMap = this.j;
        y21 y21Var = (y21) concurrentHashMap.get(c5Var);
        if (y21Var == null) {
            y21Var = new y21(this, u31Var);
            concurrentHashMap.put(c5Var, y21Var);
        }
        if (y21Var.b.k()) {
            this.l.add(c5Var);
        }
        y21Var.m();
        return y21Var;
    }

    public final void e(jj jjVar, int i) {
        if (!a(jjVar, i)) {
            y31 y31Var = this.m;
            y31Var.sendMessage(y31Var.obtainMessage(5, i, 0, jjVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        if (r0 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0116, code lost:
    
        if (r0 != 0) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:219:0x038b  */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, vj0] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, vj0] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e00.handleMessage(android.os.Message):boolean");
    }
}
