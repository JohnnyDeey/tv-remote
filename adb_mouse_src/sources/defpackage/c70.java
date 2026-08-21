package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class c70 {
    public static final c70 b = new c70(new d70(new LocaleList(new Locale[0])));
    public final d70 a;

    public c70(d70 d70Var) {
        this.a = d70Var;
    }

    public static c70 a(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                localeArr[i] = Locale.forLanguageTag(split[i]);
            }
            return new c70(new d70(new LocaleList(localeArr)));
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c70) {
            if (this.a.equals(((c70) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
