package defpackage;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class kc0 implements qu0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ pu0 d;

    public /* synthetic */ kc0(pu0 pu0Var, int i) {
        this.c = i;
        this.d = pu0Var;
    }

    @Override // defpackage.qu0
    public final pu0 a(k00 k00Var, xv0 xv0Var) {
        int i = this.c;
        pu0 pu0Var = this.d;
        switch (i) {
            case 0:
                if (xv0Var.a != Number.class) {
                    return null;
                }
                return (lc0) pu0Var;
            default:
                Class cls = xv0Var.a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (jv0) pu0Var;
        }
    }

    public String toString() {
        switch (this.c) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((jv0) this.d) + "]";
            default:
                return super.toString();
        }
    }
}
