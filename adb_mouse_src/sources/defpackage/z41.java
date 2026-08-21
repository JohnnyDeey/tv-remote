package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class z41 {
    public static final hi0 a;

    static {
        y41 y41Var;
        try {
            SystemClock.elapsedRealtimeNanos();
            y41Var = new y41(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            y41Var = new y41(1);
        }
        a = y41Var;
    }
}
