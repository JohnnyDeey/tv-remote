package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class u60 extends ie0 {
    public static final Parcelable.Creator<u60> CREATOR = new a3(12);
    public String c;

    public u60(Parcel parcel) {
        super(parcel);
        this.c = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.c);
    }

    public u60() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
