package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class wx implements Parcelable {
    public static final Parcelable.Creator<wx> CREATOR = new a3(8);
    public ArrayList c;
    public ArrayList d;
    public ic[] e;
    public int f;
    public String g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.c);
        parcel.writeStringList(this.d);
        parcel.writeTypedArray(this.e, i);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeStringList(this.h);
        parcel.writeTypedList(this.i);
        parcel.writeTypedList(this.j);
    }
}
