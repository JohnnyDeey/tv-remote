package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class uq extends zo {
    public int m;

    public uq(d01 d01Var) {
        super(d01Var);
        if (d01Var instanceof l10) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.zo
    public final void d(int i) {
        if (!this.j) {
            this.j = true;
            this.g = i;
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                xo xoVar = (xo) obj;
                xoVar.a(xoVar);
            }
        }
    }
}
