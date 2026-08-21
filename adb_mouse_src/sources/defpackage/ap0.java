package defpackage;

import java.sql.Date;
import java.text.SimpleDateFormat;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ap0 extends pu0 {
    public static final a b = new a();
    public final SimpleDateFormat a;

    /* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
    /* loaded from: classes.dex */
    public class a implements qu0 {
        @Override // defpackage.qu0
        public final pu0 a(k00 k00Var, xv0 xv0Var) {
            if (xv0Var.a == Date.class) {
                return new ap0(0);
            }
            return null;
        }
    }

    private ap0() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // defpackage.pu0
    public final void b(g40 g40Var, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            g40Var.i();
            return;
        }
        synchronized (this) {
            format = this.a.format((java.util.Date) date);
        }
        g40Var.q(format);
    }

    public /* synthetic */ ap0(int i) {
        this();
    }
}
