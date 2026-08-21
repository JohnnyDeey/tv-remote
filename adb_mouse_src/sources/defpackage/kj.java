package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class kj extends b1 {
    public static final Parcelable.Creator<kj> CREATOR = new z31(8);
    public final wj0 c;
    public final boolean d;
    public final boolean e;
    public final int[] f;
    public final int g;
    public final int[] h;

    public kj(wj0 wj0Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.c = wj0Var;
        this.d = z;
        this.e = z2;
        this.f = iArr;
        this.g = i;
        this.h = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = oi0.J(parcel, 20293);
        oi0.A(parcel, 1, this.c, i);
        oi0.F(parcel, 2, 4);
        parcel.writeInt(this.d ? 1 : 0);
        oi0.F(parcel, 3, 4);
        parcel.writeInt(this.e ? 1 : 0);
        int[] iArr = this.f;
        if (iArr != null) {
            int J2 = oi0.J(parcel, 4);
            parcel.writeIntArray(iArr);
            oi0.L(parcel, J2);
        }
        oi0.F(parcel, 5, 4);
        parcel.writeInt(this.g);
        int[] iArr2 = this.h;
        if (iArr2 != null) {
            int J3 = oi0.J(parcel, 6);
            parcel.writeIntArray(iArr2);
            oi0.L(parcel, J3);
        }
        oi0.L(parcel, J);
    }
}
