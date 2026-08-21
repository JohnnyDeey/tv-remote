package defpackage;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class bp0 extends pu0 {
    public static final a b = new a();
    public final SimpleDateFormat a;

    /* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
    /* loaded from: classes.dex */
    public class a implements qu0 {
        @Override // defpackage.qu0
        public final pu0 a(k00 k00Var, xv0 xv0Var) {
            if (xv0Var.a == Time.class) {
                return new bp0(0);
            }
            return null;
        }
    }

    private bp0() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // defpackage.pu0
    public final void b(g40 g40Var, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            g40Var.i();
            return;
        }
        synchronized (this) {
            format = this.a.format((Date) time);
        }
        g40Var.q(format);
    }

    public /* synthetic */ bp0(int i) {
        this();
    }
}
