package defpackage;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class fu {
    public final SparseArray a = new SparseArray();
    public final gu b;
    public final int c;
    public final int d;

    public fu(gu guVar, b8 b8Var) {
        this.b = guVar;
        TypedArray typedArray = (TypedArray) b8Var.d;
        this.c = typedArray.getResourceId(28, 0);
        this.d = typedArray.getResourceId(53, 0);
    }
}
