package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class g10 extends ak {
    public ak[] q0 = new ak[4];
    public int r0 = 0;

    public final void R(int i, c01 c01Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            ak akVar = this.q0[i2];
            ArrayList arrayList2 = c01Var.a;
            if (!arrayList2.contains(akVar)) {
                arrayList2.add(akVar);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            mn.o(this.q0[i3], i, arrayList, c01Var);
        }
    }

    public void S() {
    }
}
