package defpackage;

import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class su0 extends pu0 {
    @Override // defpackage.pu0
    public final void b(g40 g40Var, Object obj) {
        g40Var.b();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i = 0; i < length; i++) {
            g40Var.o(r5.get(i));
        }
        g40Var.e();
    }
}
