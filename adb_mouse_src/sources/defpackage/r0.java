package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class r0 extends s0 implements RandomAccess {
    public final s0 c;
    public final int d;
    public final int e;

    public r0(s0 s0Var, int i, int i2) {
        this.c = s0Var;
        this.d = i;
        r21.g(i, i2, s0Var.b());
        this.e = i2 - i;
    }

    @Override // defpackage.s0
    public final int b() {
        return this.e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.e;
        if (i >= 0 && i < i2) {
            return this.c.get(this.d + i);
        }
        c.m(qo0.o("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // defpackage.s0, java.util.List
    public final List subList(int i, int i2) {
        r21.g(i, i2, this.e);
        int i3 = this.d;
        return new r0(this.c, i + i3, i3 + i2);
    }
}
