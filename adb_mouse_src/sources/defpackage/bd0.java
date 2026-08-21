package defpackage;

import androidx.activity.b;
import java.util.ListIterator;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class bd0 extends b50 implements vy {
    public final /* synthetic */ int d;
    public final /* synthetic */ b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bd0(b bVar, int i) {
        super(1);
        this.d = i;
        this.e = bVar;
    }

    @Override // defpackage.vy
    public final Object h(Object obj) {
        int i = this.d;
        nw0 nw0Var = nw0.a;
        Object obj2 = null;
        b bVar = this.e;
        switch (i) {
            case 0:
                ((gc) obj).getClass();
                h8 h8Var = bVar.b;
                ListIterator listIterator = h8Var.listIterator(h8Var.e);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object previous = listIterator.previous();
                        if (((ox) previous).a) {
                            obj2 = previous;
                        }
                    }
                }
                bVar.c = (ox) obj2;
                return nw0Var;
            default:
                ((gc) obj).getClass();
                h8 h8Var2 = bVar.b;
                ListIterator listIterator2 = h8Var2.listIterator(h8Var2.e);
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        Object previous2 = listIterator2.previous();
                        if (((ox) previous2).a) {
                            obj2 = previous2;
                        }
                    }
                }
                return nw0Var;
        }
    }
}
