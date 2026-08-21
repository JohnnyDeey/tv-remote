package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class wj0 extends b1 {
    public static final Parcelable.Creator<wj0> CREATOR = new z31(3);
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;

    public wj0(int i, boolean z, boolean z2, int i2, int i3) {
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = i2;
        this.g = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = oi0.J(parcel, 20293);
        oi0.F(parcel, 1, 4);
        parcel.writeInt(this.c);
        oi0.F(parcel, 2, 4);
        parcel.writeInt(this.d ? 1 : 0);
        oi0.F(parcel, 3, 4);
        parcel.writeInt(this.e ? 1 : 0);
        oi0.F(parcel, 4, 4);
        parcel.writeInt(this.f);
        oi0.F(parcel, 5, 4);
        parcel.writeInt(this.g);
        oi0.L(parcel, J);
    }
}
