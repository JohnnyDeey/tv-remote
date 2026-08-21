package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class q61 extends w21 {
    public a b;
    public final int c;

    public q61(a aVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.b = aVar;
        this.c = i;
    }

    @Override // defpackage.w21
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                i91 i91Var = (i91) l51.a(parcel, i91.CREATOR);
                l51.b(parcel);
                a aVar = this.b;
                wv0.q(aVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                wv0.p(i91Var);
                aVar.u = i91Var;
                Bundle bundle = i91Var.c;
                wv0.q(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
                a aVar2 = this.b;
                int i2 = this.c;
                aVar2.getClass();
                q71 q71Var = new q71(aVar2, readInt, readStrongBinder, bundle);
                w41 w41Var = aVar2.e;
                w41Var.sendMessage(w41Var.obtainMessage(1, i2, -1, q71Var));
                this.b = null;
            } else {
                parcel.readInt();
                l51.b(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            Bundle bundle2 = (Bundle) l51.a(parcel, Bundle.CREATOR);
            l51.b(parcel);
            wv0.q(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar3 = this.b;
            int i3 = this.c;
            aVar3.getClass();
            q71 q71Var2 = new q71(aVar3, readInt2, readStrongBinder2, bundle2);
            w41 w41Var2 = aVar3.e;
            w41Var2.sendMessage(w41Var2.obtainMessage(1, i3, -1, q71Var2));
            this.b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
