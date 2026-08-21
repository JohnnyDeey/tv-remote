package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class lv extends sl0 {
    public final HashMap g = new HashMap();

    @Override // defpackage.sl0
    public final pl0 b(Object obj) {
        return (pl0) this.g.get(obj);
    }

    @Override // defpackage.sl0
    public final Object c(Object obj) {
        Object c = super.c(obj);
        this.g.remove(obj);
        return c;
    }
}
