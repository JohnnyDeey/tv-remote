package defpackage;

import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class cp0 implements qu0 {
    @Override // defpackage.qu0
    public final pu0 a(k00 k00Var, xv0 xv0Var) {
        if (xv0Var.a == Timestamp.class) {
            k00Var.getClass();
            return new dp0(k00Var.b(new xv0(Date.class)));
        }
        return null;
    }
}
