package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class xe implements Parcelable {
    public static final Parcelable.Creator<xe> CREATOR = new a3(4);
    public final wa0 c;
    public final wa0 d;
    public final jn e;
    public final wa0 f;
    public final int g;
    public final int h;
    public final int i;

    public xe(wa0 wa0Var, wa0 wa0Var2, jn jnVar, wa0 wa0Var3, int i) {
        Objects.requireNonNull(wa0Var, "start cannot be null");
        Objects.requireNonNull(wa0Var2, "end cannot be null");
        Objects.requireNonNull(jnVar, "validator cannot be null");
        this.c = wa0Var;
        this.d = wa0Var2;
        this.f = wa0Var3;
        this.g = i;
        this.e = jnVar;
        if (wa0Var3 != null && wa0Var.c.compareTo(wa0Var3.c) > 0) {
            c.k("start Month cannot be after current Month");
            throw null;
        }
        if (wa0Var3 != null && wa0Var3.c.compareTo(wa0Var2.c) > 0) {
            c.k("current Month cannot be after end Month");
            throw null;
        }
        if (i >= 0 && i <= dx0.c(null).getMaximum(7)) {
            this.i = wa0Var.d(wa0Var2) + 1;
            this.h = (wa0Var2.e - wa0Var.e) + 1;
        } else {
            c.k("firstDayOfWeek is not valid");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe)) {
            return false;
        }
        xe xeVar = (xe) obj;
        if (this.c.equals(xeVar.c) && this.d.equals(xeVar.d) && Objects.equals(this.f, xeVar.f) && this.g == xeVar.g && this.e.equals(xeVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, this.f, Integer.valueOf(this.g), this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f, 0);
        parcel.writeParcelable(this.e, 0);
        parcel.writeInt(this.g);
    }
}
