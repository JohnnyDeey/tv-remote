package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ma1 implements ServiceConnection {
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final ka1 e;
    public ComponentName f;
    public final /* synthetic */ qa1 g;

    public ma1(qa1 qa1Var, ka1 ka1Var) {
        this.g = qa1Var;
        this.e = ka1Var;
    }

    public final jj a(String str, Executor executor) {
        try {
            Intent a = m41.a(this.g.b, this.e);
            this.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(n51.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                qa1 qa1Var = this.g;
                os osVar = qa1Var.d;
                Context context = qa1Var.b;
                ka1 ka1Var = this.e;
                boolean q = osVar.q(context, str, a, this, executor);
                this.c = q;
                if (q) {
                    qa1Var.c.sendMessageDelayed(qa1Var.c.obtainMessage(1, ka1Var), qa1Var.f);
                    jj jjVar = jj.h;
                    StrictMode.setVmPolicy(vmPolicy);
                    return jjVar;
                }
                this.b = 2;
                try {
                    qa1Var.d.o(qa1Var.b, this);
                } catch (IllegalArgumentException unused) {
                }
                jj jjVar2 = new jj(16, null, null);
                StrictMode.setVmPolicy(vmPolicy);
                return jjVar2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (g41 e) {
            return e.c;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        qa1 qa1Var = this.g;
        synchronized (qa1Var.a) {
            try {
                qa1Var.c.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        qa1 qa1Var = this.g;
        synchronized (qa1Var.a) {
            try {
                qa1Var.c.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
