package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class p41 extends u21 implements r41 {
    public final int c(int i, String str, String str2, Bundle bundle) {
        Parcel a = a();
        a.writeInt(i);
        a.writeString(str);
        a.writeString(str2);
        int i2 = s41.a;
        a.writeInt(1);
        bundle.writeToParcel(a, 0);
        Parcel b = b(a, 10);
        int readInt = b.readInt();
        b.recycle();
        return readInt;
    }

    public final Bundle d(String str, String str2, String str3) {
        Parcel a = a();
        a.writeInt(3);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        a.writeString(null);
        Parcel b = b(a, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) s41.a(b);
        b.recycle();
        return bundle;
    }

    public final Bundle e(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel a = a();
        a.writeInt(i);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        a.writeString(null);
        int i2 = s41.a;
        a.writeInt(1);
        bundle.writeToParcel(a, 0);
        Parcel b = b(a, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) s41.a(b);
        b.recycle();
        return bundle2;
    }

    public final Bundle f(String str, String str2) {
        Parcel a = a();
        a.writeInt(3);
        a.writeString(str);
        a.writeString("subs");
        a.writeString(str2);
        Parcel b = b(a, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) s41.a(b);
        b.recycle();
        return bundle;
    }

    public final Bundle g(int i, String str, String str2, Bundle bundle) {
        Parcel a = a();
        a.writeInt(i);
        a.writeString(str);
        a.writeString("subs");
        a.writeString(str2);
        int i2 = s41.a;
        a.writeInt(1);
        bundle.writeToParcel(a, 0);
        Parcel b = b(a, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) s41.a(b);
        b.recycle();
        return bundle2;
    }

    public final Bundle h(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel a = a();
        a.writeInt(i);
        a.writeString(str);
        a.writeString(str2);
        int i2 = s41.a;
        a.writeInt(1);
        bundle.writeToParcel(a, 0);
        a.writeInt(1);
        bundle2.writeToParcel(a, 0);
        Parcel b = b(a, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) s41.a(b);
        b.recycle();
        return bundle3;
    }
}
