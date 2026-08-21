package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ae extends j0 {
    public static final Parcelable.Creator<ae> CREATOR = new i0(1);
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public ae(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z;
        boolean z2;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.h = z2;
        this.i = parcel.readInt() == 1;
    }

    @Override // defpackage.j0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
    }

    public ae(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.e = bottomSheetBehavior.N;
        this.f = bottomSheetBehavior.e;
        this.g = bottomSheetBehavior.b;
        this.h = bottomSheetBehavior.I;
        this.i = bottomSheetBehavior.J;
    }
}
