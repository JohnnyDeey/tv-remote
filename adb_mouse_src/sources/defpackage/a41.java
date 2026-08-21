package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class a41 extends b1 {
    public static final Parcelable.Creator<a41> CREATOR = new z31(1);
    public final int c;
    public final IBinder d;
    public final jj e;
    public final boolean f;
    public final boolean g;

    public a41(int i, IBinder iBinder, jj jjVar, boolean z, boolean z2) {
        this.c = i;
        this.d = iBinder;
        this.e = jjVar;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        Object ta1Var;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof a41) {
                    a41 a41Var = (a41) obj;
                    if (this.e.equals(a41Var.e)) {
                        Object obj2 = null;
                        IBinder iBinder = this.d;
                        if (iBinder == null) {
                            ta1Var = null;
                        } else {
                            int i = d2.b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof m10) {
                                ta1Var = (m10) queryLocalInterface;
                            } else {
                                ta1Var = new ta1(iBinder);
                            }
                        }
                        IBinder iBinder2 = a41Var.d;
                        if (iBinder2 != null) {
                            int i2 = d2.b;
                            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface2 instanceof m10) {
                                obj2 = (m10) queryLocalInterface2;
                            } else {
                                obj2 = new ta1(iBinder2);
                            }
                        }
                        if (f20.t(ta1Var, obj2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = oi0.J(parcel, 20293);
        oi0.F(parcel, 1, 4);
        parcel.writeInt(this.c);
        IBinder iBinder = this.d;
        if (iBinder != null) {
            int J2 = oi0.J(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            oi0.L(parcel, J2);
        }
        oi0.A(parcel, 3, this.e, i);
        oi0.F(parcel, 4, 4);
        parcel.writeInt(this.f ? 1 : 0);
        oi0.F(parcel, 5, 4);
        parcel.writeInt(this.g ? 1 : 0);
        oi0.L(parcel, J);
    }
}
