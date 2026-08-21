package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ei extends pu0 {
    public final /* synthetic */ int a;
    public final Object b;

    public ei(fi fiVar, ru0 ru0Var, ru0 ru0Var2) {
        this.a = 1;
        this.b = ru0Var2;
    }

    @Override // defpackage.pu0
    public final void b(g40 g40Var, Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    g40Var.i();
                    return;
                }
                g40Var.b();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((ru0) obj2).b(g40Var, it.next());
                }
                g40Var.e();
                return;
            case 1:
                Map map = (Map) obj;
                ru0 ru0Var = (ru0) obj2;
                if (map == null) {
                    g40Var.i();
                    return;
                }
                g40Var.c();
                for (Map.Entry entry : map.entrySet()) {
                    g40Var.g(String.valueOf(entry.getKey()));
                    ru0Var.b(g40Var, entry.getValue());
                }
                g40Var.f();
                return;
            default:
                ((lv0) obj2).e.b(g40Var, obj);
                return;
        }
    }

    public /* synthetic */ ei(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
