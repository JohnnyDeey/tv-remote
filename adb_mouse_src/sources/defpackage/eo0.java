package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class eo0 extends a {
    public final Bundle A;
    public final Integer B;
    public final boolean y;
    public final i6 z;

    public eo0(Context context, Looper looper, i6 i6Var, Bundle bundle, c00 c00Var, d00 d00Var) {
        super(context, looper, 44, i6Var, c00Var, d00Var);
        this.y = true;
        this.z = i6Var;
        this.A = bundle;
        this.B = (Integer) i6Var.f;
    }

    @Override // defpackage.z4
    public final int e() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.z4
    public final boolean k() {
        return this.y;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface m(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof m31) {
            return (m31) queryLocalInterface;
        }
        return new u21(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        i6 i6Var = this.z;
        boolean equals = this.c.getPackageName().equals((String) i6Var.c);
        Bundle bundle = this.A;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) i6Var.c);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.signin.service.START";
    }
}
