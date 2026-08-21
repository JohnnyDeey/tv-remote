package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class i00 extends pu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pu0 b;

    public /* synthetic */ i00(pu0 pu0Var, int i) {
        this.a = i;
        this.b = pu0Var;
    }

    @Override // defpackage.pu0
    public final void b(g40 g40Var, Object obj) {
        int i = this.a;
        pu0 pu0Var = this.b;
        switch (i) {
            case 0:
                pu0Var.b(g40Var, Long.valueOf(((AtomicLong) obj).get()));
                return;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                g40Var.b();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    pu0Var.b(g40Var, Long.valueOf(atomicLongArray.get(i2)));
                }
                g40Var.e();
                return;
        }
    }
}
