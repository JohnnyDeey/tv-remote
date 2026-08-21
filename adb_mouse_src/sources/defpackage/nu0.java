package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class nu0 extends ie0 {
    public static final Parcelable.Creator<nu0> CREATOR = new a3(23);
    public boolean c;

    public nu0(Parcel parcel) {
        super(parcel);
        this.c = parcel.readInt() == 1;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public nu0() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
