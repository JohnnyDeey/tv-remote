package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class x5 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static c70 b(Configuration configuration) {
        return c70.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(c70 c70Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c70Var.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, c70 c70Var) {
        configuration.setLocales(LocaleList.forLanguageTags(c70Var.a.a.toLanguageTags()));
    }
}
