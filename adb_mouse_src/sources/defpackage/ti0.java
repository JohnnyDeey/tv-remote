package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class ti0 extends pu0 {
    public final vi0 a;

    public ti0(vi0 vi0Var) {
        this.a = vi0Var;
    }

    @Override // defpackage.pu0
    public final void b(g40 g40Var, Object obj) {
        if (obj == null) {
            g40Var.i();
            return;
        }
        g40Var.c();
        try {
            Iterator it = this.a.a.iterator();
            while (it.hasNext()) {
                ((si0) it.next()).a(g40Var, obj);
            }
            g40Var.f();
        } catch (IllegalAccessException e) {
            oi0 oi0Var = ri0.a;
            f40.k("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }
}
