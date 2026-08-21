package defpackage;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class r8 extends pu0 {
    public static final q8 b = new q8();
    public final ru0 a;

    public r8(k00 k00Var, pu0 pu0Var, Class cls) {
        this.a = new ru0(k00Var, pu0Var, cls);
    }

    @Override // defpackage.pu0
    public final void b(g40 g40Var, Object obj) {
        if (obj == null) {
            g40Var.i();
            return;
        }
        g40Var.b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.a.b(g40Var, Array.get(obj, i));
        }
        g40Var.e();
    }
}
