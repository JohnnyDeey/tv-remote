package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ta0 {
    public final SparseArray a;
    public gw0 b;

    public ta0(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(gw0 gw0Var, int i, int i2) {
        ta0 ta0Var;
        int a = gw0Var.a(i);
        SparseArray sparseArray = this.a;
        if (sparseArray == null) {
            ta0Var = null;
        } else {
            ta0Var = (ta0) sparseArray.get(a);
        }
        if (ta0Var == null) {
            ta0Var = new ta0(1);
            sparseArray.put(gw0Var.a(i), ta0Var);
        }
        if (i2 > i) {
            ta0Var.a(gw0Var, i + 1, i2);
        } else {
            ta0Var.b = gw0Var;
        }
    }
}
