package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class f31 {
    public final int a;

    public f31(int i) {
        this.a = i;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(y21 y21Var);

    public abstract pv[] b(y21 y21Var);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(y21 y21Var);

    public abstract void f(jp0 jp0Var, boolean z);
}
