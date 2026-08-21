package defpackage;

import java.util.concurrent.Executors;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class f8 extends hi0 {
    public static volatile f8 b;
    public final Object a;

    public f8(int i) {
        switch (i) {
            case 1:
                this.a = new Object();
                Executors.newFixedThreadPool(4, new oo());
                return;
            default:
                this.a = new f8(1);
                return;
        }
    }

    public static f8 x() {
        if (b != null) {
            return b;
        }
        synchronized (f8.class) {
            try {
                if (b == null) {
                    b = new f8(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }
}
