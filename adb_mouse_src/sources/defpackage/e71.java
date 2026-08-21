package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class e71 {
    public static final e71 b;
    public static final e71 c;
    public final Throwable a;

    static {
        if (na1.f) {
            c = null;
            b = null;
        } else {
            c = new e71(null);
            b = new e71(null);
        }
    }

    public e71(CancellationException cancellationException) {
        this.a = cancellationException;
    }
}
