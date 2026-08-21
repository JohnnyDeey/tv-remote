package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class t31 extends b1 {
    public static final Parcelable.Creator<t31> CREATOR = new a3(28);
    public final int c;
    public final jj d;
    public final a41 e;

    public t31(int i, jj jjVar, a41 a41Var) {
        this.c = i;
        this.d = jjVar;
        this.e = a41Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = oi0.J(parcel, 20293);
        oi0.F(parcel, 1, 4);
        parcel.writeInt(this.c);
        oi0.A(parcel, 2, this.d, i);
        oi0.A(parcel, 3, this.e, i);
        oi0.L(parcel, J);
    }
}
