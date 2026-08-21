package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class jc implements Parcelable {
    public static final Parcelable.Creator<jc> CREATOR = new a3(3);
    public final ArrayList c;
    public final ArrayList d;

    public jc(Parcel parcel) {
        this.c = parcel.createStringArrayList();
        this.d = parcel.createTypedArrayList(ic.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.c);
        parcel.writeTypedList(this.d);
    }
}
