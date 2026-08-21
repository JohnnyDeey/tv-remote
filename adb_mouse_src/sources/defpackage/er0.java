package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class er0 extends b1 {
    public static final Parcelable.Creator<er0> CREATOR = new a3(24);
    public final int c;
    public List d;

    public er0(int i, List list) {
        this.c = i;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = oi0.J(parcel, 20293);
        oi0.F(parcel, 1, 4);
        parcel.writeInt(this.c);
        oi0.D(parcel, 2, this.d);
        oi0.L(parcel, J);
    }
}
