package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class kt {
    public int a = 1;
    public final ta0 b;
    public ta0 c;
    public ta0 d;
    public int e;
    public int f;

    public kt(ta0 ta0Var) {
        this.b = ta0Var;
        this.c = ta0Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        ra0 b = this.c.b.b();
        int a = b.a(6);
        if ((a != 0 && ((ByteBuffer) b.d).get(a + b.a) != 0) || this.e == 65039) {
            return true;
        }
        return false;
    }
}
