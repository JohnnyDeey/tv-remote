package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class p31 extends b1 {
    public static final Parcelable.Creator<p31> CREATOR = new a3(27);
    public final List c;
    public final String d;

    public p31(ArrayList arrayList, String str) {
        this.c = arrayList;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = oi0.J(parcel, 20293);
        List<String> list = this.c;
        if (list != null) {
            int J2 = oi0.J(parcel, 1);
            parcel.writeStringList(list);
            oi0.L(parcel, J2);
        }
        oi0.B(parcel, 2, this.d);
        oi0.L(parcel, J);
    }
}
