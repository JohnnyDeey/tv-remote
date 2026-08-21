package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class pv extends b1 {
    public static final Parcelable.Creator<pv> CREATOR = new z31(4);
    public final String c;
    public final int d;
    public final long e;
    public final boolean f;

    public pv(String str, int i, long j, boolean z) {
        this.c = str;
        this.d = i;
        this.e = j;
        this.f = z;
    }

    public final long a() {
        long j = this.e;
        if (j == -1) {
            return this.d;
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pv) {
            pv pvVar = (pv) obj;
            if (f20.t(this.c, pvVar.c) && a() == pvVar.a() && this.f == pvVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Long.valueOf(a()), Boolean.valueOf(this.f)});
    }

    public final String toString() {
        r6 r6Var = new r6(this);
        r6Var.e(this.c, "name");
        r6Var.e(Long.valueOf(a()), "version");
        r6Var.e(Boolean.valueOf(this.f), "is_fully_rolled_out");
        return r6Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = oi0.J(parcel, 20293);
        oi0.B(parcel, 1, this.c);
        oi0.F(parcel, 2, 4);
        parcel.writeInt(this.d);
        long a = a();
        oi0.F(parcel, 3, 8);
        parcel.writeLong(a);
        oi0.F(parcel, 4, 4);
        parcel.writeInt(this.f ? 1 : 0);
        oi0.L(parcel, J);
    }
}
