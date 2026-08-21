package defpackage;

import android.util.Log;
import java.security.KeyPair;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class aq extends qq0 implements zy {
    public final /* synthetic */ y3 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ int i;
    public final /* synthetic */ KeyPair j;
    public final /* synthetic */ cq k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(y3 y3Var, String str, int i, KeyPair keyPair, cq cqVar, qk qkVar) {
        super(qkVar);
        this.g = y3Var;
        this.h = str;
        this.i = i;
        this.j = keyPair;
        this.k = cqVar;
    }

    @Override // defpackage.zy
    public final Object g(Object obj, Object obj2) {
        aq aqVar = (aq) j((qk) obj2, (ll) obj);
        nw0 nw0Var = nw0.a;
        aqVar.l(nw0Var);
        return nw0Var;
    }

    @Override // defpackage.rk
    public final qk j(qk qkVar, Object obj) {
        return new aq(this.g, this.h, this.i, this.j, this.k, qkVar);
    }

    @Override // defpackage.rk
    public final Object l(Object obj) {
        hi0.p(obj);
        try {
            this.g.e(this.h, this.i, 2000, 2000);
            mn b = this.g.b(this.j);
            if (b.equals(v3.l)) {
                this.k.e.c(this.g);
                cq cqVar = this.k;
                cqVar.b.c(cqVar.e);
                cq cqVar2 = this.k;
                cqVar2.c.b(cqVar2.e);
                cq cqVar3 = this.k;
                cqVar3.d.b(cqVar3.e);
                this.k.l.g(this.h, new Integer(this.i));
                cq cqVar4 = this.k;
                jp jpVar = new jp(this.h, this.i, gp.l);
                cqVar4.getClass();
                cqVar4.n = jpVar;
            } else if (b.equals(x3.l)) {
                this.k.j.g(this.h, new Integer(this.i));
                cq cqVar5 = this.k;
                jp jpVar2 = new jp(this.h, this.i, rp.l);
                cqVar5.getClass();
                cqVar5.n = jpVar2;
            } else if (b.equals(w3.l)) {
                this.k.k.g(this.h, new Integer(this.i));
                cq cqVar6 = this.k;
                jp jpVar3 = new jp(this.h, this.i, mp.l);
                cqVar6.getClass();
                cqVar6.n = jpVar3;
            } else {
                throw new RuntimeException();
            }
        } catch (Exception e) {
            Log.e("ERR", mn.Q(e));
            if (k20.c(this.k.o, this.h) && this.k.p == this.i) {
                this.k.m.g(this.h, new Integer(this.i));
                cq cqVar7 = this.k;
                jp jpVar4 = new jp(this.h, this.i, ip.l);
                cqVar7.getClass();
                cqVar7.n = jpVar4;
            }
        }
        return nw0.a;
    }
}
