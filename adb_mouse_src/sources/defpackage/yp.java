package defpackage;

import android.util.Log;
import java.security.KeyPair;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class yp extends qq0 implements zy {
    public final /* synthetic */ cq g;
    public final /* synthetic */ qp h;
    public final /* synthetic */ KeyPair i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp(cq cqVar, qp qpVar, KeyPair keyPair, qk qkVar) {
        super(qkVar);
        this.g = cqVar;
        this.h = qpVar;
        this.i = keyPair;
    }

    @Override // defpackage.zy
    public final Object g(Object obj, Object obj2) {
        yp ypVar = (yp) j((qk) obj2, (ll) obj);
        nw0 nw0Var = nw0.a;
        ypVar.l(nw0Var);
        return nw0Var;
    }

    @Override // defpackage.rk
    public final qk j(qk qkVar, Object obj) {
        return new yp(this.g, this.h, this.i, qkVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable, java.lang.Object, u3] */
    @Override // defpackage.rk
    public final Object l(Object obj) {
        hi0.p(obj);
        o3 o3Var = new o3(1);
        ?? obj2 = new Object();
        try {
            try {
                String str = this.g.o;
                int i = this.g.p;
                obj2.a(str, this.h.b);
                o3Var.d = obj2;
                o3Var.d(this.h.a, this.i);
                this.g.c(new up(str, i));
            } catch (Exception e) {
                Log.e("ERR", mn.Q(e));
            }
            return nw0.a;
        } finally {
            o3Var.close();
        }
    }
}
