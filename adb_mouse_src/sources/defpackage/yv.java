package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class yv extends rk {
    public /* synthetic */ Object f;
    public int g;
    public final /* synthetic */ zv h;
    public xv i;
    public Iterator j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(zv zvVar, rk rkVar) {
        super(rkVar);
        this.h = zvVar;
    }

    @Override // defpackage.rk
    public final Object l(Object obj) {
        this.f = obj;
        this.g |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
