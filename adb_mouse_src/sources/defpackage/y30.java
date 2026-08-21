package defpackage;

import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class y30 implements au {
    public static final w30 h;
    public static final w30 i;
    public final HashMap c;
    public final HashMap d;
    public final v30 e;
    public boolean f;
    public static final v30 g = new v30(0);
    public static final x30 j = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [w30] */
    /* JADX WARN: Type inference failed for: r0v2, types: [w30] */
    /* JADX WARN: Type inference failed for: r0v3, types: [x30, java.lang.Object] */
    static {
        final int i2 = 0;
        h = new kx0() { // from class: w30
            @Override // defpackage.zt
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((lx0) obj2).b((String) obj);
                        return;
                    default:
                        ((lx0) obj2).c(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
        final int i3 = 1;
        i = new kx0() { // from class: w30
            @Override // defpackage.zt
            public final void a(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        ((lx0) obj2).b((String) obj);
                        return;
                    default:
                        ((lx0) obj2).c(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
    }

    public y30() {
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        HashMap hashMap2 = new HashMap();
        this.d = hashMap2;
        this.e = g;
        this.f = false;
        hashMap2.put(String.class, h);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, i);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, j);
        hashMap.remove(Date.class);
    }

    public final au a(Class cls, vc0 vc0Var) {
        this.c.put(cls, vc0Var);
        this.d.remove(cls);
        return this;
    }
}
