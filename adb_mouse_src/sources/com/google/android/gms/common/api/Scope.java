package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.b1;
import defpackage.c;
import defpackage.oi0;
import defpackage.z31;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class Scope extends b1 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new z31(5);
    public final int c;
    public final String d;

    public Scope(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            this.c = i;
            this.d = str;
        } else {
            c.k("scopeUri must not be null or empty");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.d.equals(((Scope) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = oi0.J(parcel, 20293);
        oi0.F(parcel, 1, 4);
        parcel.writeInt(this.c);
        oi0.B(parcel, 2, this.d);
        oi0.L(parcel, J);
    }
}
