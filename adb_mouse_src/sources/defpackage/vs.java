package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class vs extends mn {
    public final /* synthetic */ ld l;

    public vs(ld ldVar) {
        this.l = ldVar;
    }

    @Override // defpackage.mn
    public final void F(Throwable th) {
        ((zs) this.l.a).d(th);
    }

    @Override // defpackage.mn
    public final void G(l3 l3Var) {
        Set<int[]> A;
        ld ldVar = this.l;
        ldVar.c = l3Var;
        l3 l3Var2 = (l3) ldVar.c;
        zs zsVar = (zs) ldVar.a;
        g00 g00Var = zsVar.g;
        tn tnVar = zsVar.i;
        if (Build.VERSION.SDK_INT >= 34) {
            A = dt.a();
        } else {
            A = f20.A();
        }
        ldVar.b = new b8(l3Var2, g00Var, tnVar, A);
        zs zsVar2 = (zs) ldVar.a;
        ArrayList arrayList = new ArrayList();
        zsVar2.a.writeLock().lock();
        try {
            zsVar2.c = 1;
            arrayList.addAll(zsVar2.b);
            zsVar2.b.clear();
            zsVar2.a.writeLock().unlock();
            zsVar2.d.post(new af(arrayList, zsVar2.c, (Throwable) null));
        } catch (Throwable th) {
            zsVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
