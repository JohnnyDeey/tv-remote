package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class i0 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ i0(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return j0.d;
                }
                c.o("superState must be null");
                return null;
            case 1:
                return new ae(parcel, classLoader);
            case 2:
                return new tg(parcel, classLoader);
            case 3:
                return new xk(parcel, classLoader);
            case 4:
                return new u80(parcel, classLoader);
            case 5:
                return new xh0(parcel, classLoader);
            case 6:
                return new do0(parcel, classLoader);
            case 7:
                return new or0(parcel, classLoader);
            default:
                return new pt0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new j0[i];
            case 1:
                return new ae[i];
            case 2:
                return new tg[i];
            case 3:
                return new xk[i];
            case 4:
                return new u80[i];
            case 5:
                return new xh0[i];
            case 6:
                return new do0[i];
            case 7:
                return new or0[i];
            default:
                return new pt0[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return j0.d;
                }
                c.o("superState must be null");
                return null;
            case 1:
                return new ae(parcel, null);
            case 2:
                return new tg(parcel, null);
            case 3:
                return new xk(parcel, null);
            case 4:
                return new u80(parcel, null);
            case 5:
                return new xh0(parcel, null);
            case 6:
                return new do0(parcel, null);
            case 7:
                return new or0(parcel, null);
            default:
                return new pt0(parcel, null);
        }
    }
}
