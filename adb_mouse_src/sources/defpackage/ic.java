package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ic implements Parcelable {
    public static final Parcelable.Creator<ic> CREATOR = new a3(2);
    public final int[] c;
    public final ArrayList d;
    public final int[] e;
    public final int[] f;
    public final int g;
    public final String h;
    public final int i;
    public final int j;
    public final CharSequence k;
    public final int l;
    public final CharSequence m;
    public final ArrayList n;
    public final ArrayList o;
    public final boolean p;

    public ic(hc hcVar) {
        String str;
        int size = hcVar.a.size();
        this.c = new int[size * 6];
        if (hcVar.g) {
            this.d = new ArrayList(size);
            this.e = new int[size];
            this.f = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                ey eyVar = (ey) hcVar.a.get(i2);
                int i3 = i + 1;
                this.c[i] = eyVar.a;
                ArrayList arrayList = this.d;
                gx gxVar = eyVar.b;
                if (gxVar != null) {
                    str = gxVar.g;
                } else {
                    str = null;
                }
                arrayList.add(str);
                int[] iArr = this.c;
                iArr[i3] = eyVar.c ? 1 : 0;
                iArr[i + 2] = eyVar.d;
                iArr[i + 3] = eyVar.e;
                int i4 = i + 5;
                iArr[i + 4] = eyVar.f;
                i += 6;
                iArr[i4] = eyVar.g;
                this.e[i2] = eyVar.h.ordinal();
                this.f[i2] = eyVar.i.ordinal();
            }
            this.g = hcVar.f;
            this.h = hcVar.i;
            this.i = hcVar.s;
            this.j = hcVar.j;
            this.k = hcVar.k;
            this.l = hcVar.l;
            this.m = hcVar.m;
            this.n = hcVar.n;
            this.o = hcVar.o;
            this.p = hcVar.p;
            return;
        }
        c.o("Not on back stack");
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.c);
        parcel.writeStringList(this.d);
        parcel.writeIntArray(this.e);
        parcel.writeIntArray(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeInt(this.l);
        TextUtils.writeToParcel(this.m, parcel, 0);
        parcel.writeStringList(this.n);
        parcel.writeStringList(this.o);
        parcel.writeInt(this.p ? 1 : 0);
    }

    public ic(Parcel parcel) {
        this.c = parcel.createIntArray();
        this.d = parcel.createStringArrayList();
        this.e = parcel.createIntArray();
        this.f = parcel.createIntArray();
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.k = (CharSequence) creator.createFromParcel(parcel);
        this.l = parcel.readInt();
        this.m = (CharSequence) creator.createFromParcel(parcel);
        this.n = parcel.createStringArrayList();
        this.o = parcel.createStringArrayList();
        this.p = parcel.readInt() != 0;
    }
}
