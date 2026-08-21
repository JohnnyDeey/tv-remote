package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ua0 extends b1 {
    public static final Parcelable.Creator<ua0> CREATOR = new a3(29);
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final long g;
    public final String h;
    public final String i;
    public final int j;
    public final int k;

    public ua0(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = j;
        this.g = j2;
        this.h = str;
        this.i = str2;
        this.j = i4;
        this.k = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = oi0.J(parcel, 20293);
        oi0.F(parcel, 1, 4);
        parcel.writeInt(this.c);
        oi0.F(parcel, 2, 4);
        parcel.writeInt(this.d);
        oi0.F(parcel, 3, 4);
        parcel.writeInt(this.e);
        oi0.F(parcel, 4, 8);
        parcel.writeLong(this.f);
        oi0.F(parcel, 5, 8);
        parcel.writeLong(this.g);
        oi0.B(parcel, 6, this.h);
        oi0.B(parcel, 7, this.i);
        oi0.F(parcel, 8, 4);
        parcel.writeInt(this.j);
        oi0.F(parcel, 9, 4);
        parcel.writeInt(this.k);
        oi0.L(parcel, J);
    }
}
