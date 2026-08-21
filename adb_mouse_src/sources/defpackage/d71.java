package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class d71 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ a b;

    public d71(a aVar, int i) {
        this.b = aVar;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c41 c41Var;
        int i;
        int i2;
        a aVar = this.b;
        if (iBinder == null) {
            synchronized (aVar.f) {
                i = aVar.m;
            }
            if (i == 3) {
                aVar.t = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            w41 w41Var = aVar.e;
            w41Var.sendMessage(w41Var.obtainMessage(i2, aVar.v.get(), 16));
            return;
        }
        synchronized (aVar.g) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof c41)) {
                    c41Var = (c41) queryLocalInterface;
                } else {
                    c41Var = new c41(iBinder);
                }
                aVar.h = c41Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        a aVar2 = this.b;
        int i3 = this.a;
        aVar2.getClass();
        b81 b81Var = new b81(aVar2, 0, null);
        w41 w41Var2 = aVar2.e;
        w41Var2.sendMessage(w41Var2.obtainMessage(7, i3, -1, b81Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a aVar = this.b;
        synchronized (aVar.g) {
            aVar.h = null;
        }
        a aVar2 = this.b;
        int i = this.a;
        w41 w41Var = aVar2.e;
        w41Var.sendMessage(w41Var.obtainMessage(6, i, 1));
    }
}
