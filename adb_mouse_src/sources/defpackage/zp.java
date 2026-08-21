package defpackage;

import android.util.Log;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.a;
import java.security.KeyPair;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class zp extends qq0 implements zy {
    public final /* synthetic */ int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp(cq cqVar, KeyPair keyPair, qk qkVar) {
        super(qkVar);
        this.g = 0;
        this.h = cqVar;
        this.i = keyPair;
    }

    @Override // defpackage.zy
    public final Object g(Object obj, Object obj2) {
        int i = this.g;
        nw0 nw0Var = nw0.a;
        switch (i) {
            case 0:
                ((zp) j((qk) obj2, (ll) obj)).l(nw0Var);
                return nw0Var;
            case 1:
                ((zp) j((qk) obj2, (String) obj)).l(nw0Var);
                return nw0Var;
            default:
                return ((zp) j((qk) obj2, (ll) obj)).l(nw0Var);
        }
    }

    @Override // defpackage.rk
    public final qk j(qk qkVar, Object obj) {
        int i = this.g;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                return new zp((cq) this.h, (KeyPair) obj2, qkVar);
            case 1:
                zp zpVar = new zp((in0) obj2, qkVar, 1);
                zpVar.h = obj;
                return zpVar;
            default:
                zp zpVar2 = new zp((LifecycleCoroutineScopeImpl) obj2, qkVar, 2);
                zpVar2.h = obj;
                return zpVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, y3] */
    @Override // defpackage.rk
    public final Object l(Object obj) {
        String str;
        int i;
        mn b;
        switch (this.g) {
            case 0:
                hi0.p(obj);
                ?? obj2 = new Object();
                try {
                    str = ((cq) this.h).o;
                    i = ((cq) this.h).p;
                    obj2.e(str, i, 2000, 30000);
                    b = obj2.b((KeyPair) this.i);
                } catch (Exception e) {
                    Log.e("ERR", mn.Q(e));
                    obj2.close();
                }
                if (b.equals(w3.l)) {
                    obj2.d((KeyPair) this.i);
                    if (k20.c(((cq) this.h).o, str) && ((cq) this.h).p == i) {
                        cq.a((cq) this.h);
                        ((cq) this.h).e.c(obj2);
                        cq cqVar = (cq) this.h;
                        cqVar.b.c(cqVar.e);
                        cq cqVar2 = (cq) this.h;
                        cqVar2.c.b(cqVar2.e);
                        cq cqVar3 = (cq) this.h;
                        cqVar3.d.b(cqVar3.e);
                        ((cq) this.h).l.g(str, new Integer(i));
                        cq cqVar4 = (cq) this.h;
                        jp jpVar = new jp(str, i, gp.l);
                        cqVar4.getClass();
                        cqVar4.n = jpVar;
                    } else {
                        obj2.close();
                    }
                    return nw0.a;
                }
                throw new IllegalStateException("Unexpected connection status " + b);
            case 1:
                String str2 = (String) this.h;
                hi0.p(obj);
                ((in0) this.i).h(str2);
                return nw0.a;
            default:
                hi0.p(obj);
                ll llVar = (ll) this.h;
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) this.i;
                a aVar = lifecycleCoroutineScopeImpl.c;
                if (aVar.d.compareTo(m50.d) >= 0) {
                    aVar.a(lifecycleCoroutineScopeImpl);
                } else {
                    mn.e(llVar.b(), null);
                }
                return nw0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp(Object obj, qk qkVar, int i) {
        super(qkVar);
        this.g = i;
        this.i = obj;
    }
}
