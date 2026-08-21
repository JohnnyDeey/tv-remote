package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class u80 extends j0 {
    public static final Parcelable.Creator<u80> CREATOR = new i0(4);
    public boolean e;

    public u80(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            u80.class.getClassLoader();
        }
        this.e = parcel.readInt() == 1;
    }

    @Override // defpackage.j0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
