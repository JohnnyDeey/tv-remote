package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class t21 extends b1 {
    public static final Parcelable.Creator<t21> CREATOR = new a3(25);
    public final int c;
    public final int d;
    public final Intent e;

    public t21(int i, int i2, Intent intent) {
        this.c = i;
        this.d = i2;
        this.e = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = oi0.J(parcel, 20293);
        oi0.F(parcel, 1, 4);
        parcel.writeInt(this.c);
        oi0.F(parcel, 2, 4);
        parcel.writeInt(this.d);
        oi0.A(parcel, 3, this.e, i);
        oi0.L(parcel, J);
    }
}
