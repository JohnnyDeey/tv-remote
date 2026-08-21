package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ay implements Parcelable {
    public static final Parcelable.Creator<ay> CREATOR = new a3(9);
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;
    public final int g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final Bundle l;
    public final boolean m;
    public final int n;
    public Bundle o;

    public ay(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.c = parcel.readString();
        this.d = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readString();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.i = z2;
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.j = z3;
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.k = z4;
        this.l = parcel.readBundle();
        this.m = parcel.readInt() != 0;
        this.o = parcel.readBundle();
        this.n = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.c);
        sb.append(" (");
        sb.append(this.d);
        sb.append(")}:");
        if (this.e) {
            sb.append(" fromLayout");
        }
        int i = this.g;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.h;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.i) {
            sb.append(" retainInstance");
        }
        if (this.j) {
            sb.append(" removing");
        }
        if (this.k) {
            sb.append(" detached");
        }
        if (this.m) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeBundle(this.l);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeBundle(this.o);
        parcel.writeInt(this.n);
    }

    public ay(gx gxVar) {
        this.c = gxVar.getClass().getName();
        this.d = gxVar.g;
        this.e = gxVar.o;
        this.f = gxVar.x;
        this.g = gxVar.y;
        this.h = gxVar.z;
        this.i = gxVar.C;
        this.j = gxVar.n;
        this.k = gxVar.B;
        this.l = gxVar.h;
        this.m = gxVar.A;
        this.n = gxVar.O.ordinal();
    }
}
