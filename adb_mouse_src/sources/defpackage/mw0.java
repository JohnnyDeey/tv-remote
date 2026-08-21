package defpackage;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class mw0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public mw0(String str) {
        int i;
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.c = optString;
        if (jSONObject.has("statusCode")) {
            i = jSONObject.optInt("statusCode");
        } else {
            i = 0;
        }
        this.d = i;
        if (!TextUtils.isEmpty(optString)) {
            jSONObject.optString("serializedDocid");
        } else {
            c.k("Product type cannot be empty.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw0)) {
            return false;
        }
        return TextUtils.equals(this.a, ((mw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UnfetchedProduct{productId='" + this.b + "', productType='" + this.c + "', statusCode=" + this.d + "}";
    }
}
