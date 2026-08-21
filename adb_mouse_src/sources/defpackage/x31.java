package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class x31 extends b1 {
    public static final Parcelable.Creator<x31> CREATOR = new z31(0);
    public final int c;
    public final Account d;
    public final int e;
    public final GoogleSignInAccount f;

    public x31(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.c = i;
        this.d = account;
        this.e = i2;
        this.f = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = oi0.J(parcel, 20293);
        oi0.F(parcel, 1, 4);
        parcel.writeInt(this.c);
        oi0.A(parcel, 2, this.d, i);
        oi0.F(parcel, 3, 4);
        parcel.writeInt(this.e);
        oi0.A(parcel, 4, this.f, i);
        oi0.L(parcel, J);
    }
}
