package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class j0 implements Parcelable {
    public final Parcelable c;
    public static final h0 d = new j0();
    public static final Parcelable.Creator<j0> CREATOR = new i0(0);

    public j0(Parcelable parcelable) {
        if (parcelable != null) {
            this.c = parcelable == d ? null : parcelable;
        } else {
            c.k("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
    }

    public j0() {
        this.c = null;
    }

    public j0(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.c = readParcelable == null ? d : readParcelable;
    }
}
