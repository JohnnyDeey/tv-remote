package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class i91 extends b1 {
    public static final Parcelable.Creator<i91> CREATOR = new z31(7);
    public Bundle c;
    public pv[] d;
    public int e;
    public kj f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = oi0.J(parcel, 20293);
        Bundle bundle = this.c;
        if (bundle != null) {
            int J2 = oi0.J(parcel, 1);
            parcel.writeBundle(bundle);
            oi0.L(parcel, J2);
        }
        oi0.C(parcel, 2, this.d, i);
        int i2 = this.e;
        oi0.F(parcel, 3, 4);
        parcel.writeInt(i2);
        oi0.A(parcel, 4, this.f, i);
        oi0.L(parcel, J);
    }
}
