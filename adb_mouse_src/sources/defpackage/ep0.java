package defpackage;

import defpackage.ap0;
import defpackage.bp0;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class ep0 {
    public static final boolean a;
    public static final ap0.a b;
    public static final bp0.a c;
    public static final cp0 d;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = ap0.b;
            c = bp0.b;
            d = dp0.b;
        } else {
            b = null;
            c = null;
            d = null;
        }
    }
}
