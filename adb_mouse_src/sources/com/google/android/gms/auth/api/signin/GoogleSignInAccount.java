package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a3;
import defpackage.b1;
import defpackage.c;
import defpackage.oi0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends b1 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a3(26);
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Uri h;
    public String i;
    public final long j;
    public final String k;
    public final List l;
    public final String m;
    public final String n;
    public final HashSet o = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = uri;
        this.i = str5;
        this.j = j;
        this.k = str6;
        this.l = arrayList;
        this.m = str7;
        this.n = str8;
    }

    public static GoogleSignInAccount a(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i), 1));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (!TextUtils.isEmpty(string)) {
            GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, str2, str3, str4, uri, null, parseLong, string, new ArrayList(hashSet), str5, str6);
            if (jSONObject.has("serverAuthCode")) {
                str7 = jSONObject.optString("serverAuthCode");
            }
            googleSignInAccount.i = str7;
            return googleSignInAccount;
        }
        c.k("Given String is empty or null");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof GoogleSignInAccount) {
                    GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
                    if (googleSignInAccount.k.equals(this.k)) {
                        HashSet hashSet = new HashSet(googleSignInAccount.l);
                        hashSet.addAll(googleSignInAccount.o);
                        HashSet hashSet2 = new HashSet(this.l);
                        hashSet2.addAll(this.o);
                        if (hashSet.equals(hashSet2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.k.hashCode() + 527;
        HashSet hashSet = new HashSet(this.l);
        hashSet.addAll(this.o);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = oi0.J(parcel, 20293);
        oi0.F(parcel, 1, 4);
        parcel.writeInt(this.c);
        oi0.B(parcel, 2, this.d);
        oi0.B(parcel, 3, this.e);
        oi0.B(parcel, 4, this.f);
        oi0.B(parcel, 5, this.g);
        oi0.A(parcel, 6, this.h, i);
        oi0.B(parcel, 7, this.i);
        oi0.F(parcel, 8, 8);
        parcel.writeLong(this.j);
        oi0.B(parcel, 9, this.k);
        oi0.D(parcel, 10, this.l);
        oi0.B(parcel, 11, this.m);
        oi0.B(parcel, 12, this.n);
        oi0.L(parcel, J);
    }
}
