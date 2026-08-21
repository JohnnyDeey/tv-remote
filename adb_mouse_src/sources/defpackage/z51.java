package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class z51 {
    public static final z51 d = new z51();
    public final Runnable a;
    public final Executor b;
    public z51 c;

    public z51() {
        this.a = null;
        this.b = null;
    }

    public z51(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
