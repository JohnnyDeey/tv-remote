package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class q71 extends b41 {
    public final IBinder g;
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q71(a aVar, int i, IBinder iBinder, Bundle bundle) {
        super(aVar, i, bundle);
        this.h = aVar;
        this.g = iBinder;
    }

    @Override // defpackage.b41
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            wv0.p(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            a aVar = this.h;
            if (!aVar.r().equals(interfaceDescriptor)) {
                String r = aVar.r();
                StringBuilder sb = new StringBuilder(r.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(r);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface m = aVar.m(iBinder);
            if (m == null || (!aVar.u(2, 4, m) && !aVar.u(3, 4, m))) {
                return false;
            }
            aVar.s = null;
            sb0 sb0Var = aVar.n;
            if (sb0Var != null) {
                ((c00) sb0Var.c).c();
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // defpackage.b41
    public final void b(jj jjVar) {
        sb0 sb0Var = this.h.o;
        if (sb0Var != null) {
            ((d00) sb0Var.c).b(jjVar);
        }
        System.currentTimeMillis();
    }
}
