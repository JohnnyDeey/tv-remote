package defpackage;

import java.util.BitSet;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class mv0 extends pu0 {
    @Override // defpackage.pu0
    public final void b(g40 g40Var, Object obj) {
        BitSet bitSet = (BitSet) obj;
        g40Var.b();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            g40Var.o(bitSet.get(i) ? 1L : 0L);
        }
        g40Var.e();
    }
}
