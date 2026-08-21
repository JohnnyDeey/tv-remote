package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class l61 implements ServiceConnection {
    public final /* synthetic */ n61 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7, types: [v41] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ?? u21Var;
        m51.g("BillingClientTesting", "Billing Override Service connected.");
        n61 n61Var = this.a;
        int i = u41.b;
        if (iBinder == null) {
            u21Var = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
            if (queryLocalInterface instanceof v41) {
                u21Var = (v41) queryLocalInterface;
            } else {
                u21Var = new u21(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 1);
            }
        }
        n61Var.E = u21Var;
        n61Var.D = 2;
        n61Var.E(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        m51.h("BillingClientTesting", "Billing Override Service disconnected.");
        n61 n61Var = this.a;
        n61Var.E = null;
        n61Var.D = 0;
    }
}
