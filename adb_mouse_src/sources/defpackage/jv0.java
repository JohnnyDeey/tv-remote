package defpackage;

import java.util.Calendar;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class jv0 extends pu0 {
    @Override // defpackage.pu0
    public final void b(g40 g40Var, Object obj) {
        if (((Calendar) obj) == null) {
            g40Var.i();
            return;
        }
        g40Var.c();
        g40Var.g("year");
        g40Var.o(r4.get(1));
        g40Var.g("month");
        g40Var.o(r4.get(2));
        g40Var.g("dayOfMonth");
        g40Var.o(r4.get(5));
        g40Var.g("hourOfDay");
        g40Var.o(r4.get(11));
        g40Var.g("minute");
        g40Var.o(r4.get(12));
        g40Var.g("second");
        g40Var.o(r4.get(13));
        g40Var.f();
    }
}
