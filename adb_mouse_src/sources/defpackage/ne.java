package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ne {
    public static final String c;
    public static final Set d;
    public static final ne e;
    public final String a;
    public final String b;

    static {
        String h = hi0.h("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = h;
        hi0.h("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        hi0.h("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new bu("proto"), new bu("json"))));
        e = new ne(h, null);
    }

    public ne(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static ne a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        String str2 = null;
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str3 = split[0];
                if (!str3.isEmpty()) {
                    String str4 = split[1];
                    if (!str4.isEmpty()) {
                        str2 = str4;
                    }
                    return new ne(str3, str2);
                }
                c.k("Missing endpoint in CCTDestination extras");
                return null;
            }
            c.k("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        c.k("Version marker missing from extras");
        return null;
    }
}
