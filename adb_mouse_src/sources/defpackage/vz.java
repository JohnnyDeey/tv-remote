package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class vz extends b1 {
    public static final Parcelable.Creator<vz> CREATOR = new z31(9);
    public static final Scope[] q = new Scope[0];
    public static final pv[] r = new pv[0];
    public final int c;
    public final int d;
    public final int e;
    public String f;
    public IBinder g;
    public Scope[] h;
    public Bundle i;
    public Account j;
    public pv[] k;
    public pv[] l;
    public final boolean m;
    public final int n;
    public final boolean o;
    public final String p;

    public vz(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, pv[] pvVarArr, pv[] pvVarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? q : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        pv[] pvVarArr3 = r;
        pvVarArr = pvVarArr == null ? pvVarArr3 : pvVarArr;
        pvVarArr2 = pvVarArr2 == null ? pvVarArr3 : pvVarArr2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f = "com.google.android.gms";
        } else {
            this.f = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i5 = d2.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface ta1Var = queryLocalInterface instanceof m10 ? (m10) queryLocalInterface : new ta1(iBinder);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        account2 = ((ta1) ta1Var).a();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    }
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.j = account2;
        } else {
            this.g = iBinder;
            this.j = account;
        }
        this.h = scopeArr;
        this.i = bundle;
        this.k = pvVarArr;
        this.l = pvVarArr2;
        this.m = z;
        this.n = i4;
        this.o = z2;
        this.p = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        z31.a(this, parcel, i);
    }
}
