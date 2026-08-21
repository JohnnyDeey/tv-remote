package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class j20 implements Parcelable {
    public static final Parcelable.Creator<j20> CREATOR = new a3(10);
    public final IntentSender c;
    public final Intent d;
    public final int e;
    public final int f;

    public j20(IntentSender intentSender, Intent intent, int i, int i2) {
        intentSender.getClass();
        this.c = intentSender;
        this.d = intent;
        this.e = i;
        this.f = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }
}
