package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class th0 {
    public SparseArray a;
    public int b;

    public final sh0 a(int i) {
        SparseArray sparseArray = this.a;
        sh0 sh0Var = (sh0) sparseArray.get(i);
        if (sh0Var == null) {
            sh0 sh0Var2 = new sh0();
            sparseArray.put(i, sh0Var2);
            return sh0Var2;
        }
        return sh0Var;
    }
}
