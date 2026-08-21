package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class db0 extends ie0 {
    public static final Parcelable.Creator<db0> CREATOR = new a3(15);
    public HashSet c;

    public db0(Parcel parcel) {
        super(parcel);
        int readInt = parcel.readInt();
        this.c = new HashSet();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Collections.addAll(this.c, strArr);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c.size());
        HashSet hashSet = this.c;
        parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
    }

    public db0() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
