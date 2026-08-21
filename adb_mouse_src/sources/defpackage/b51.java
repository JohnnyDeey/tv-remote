package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class b51 {
    public final hi0 a;
    public boolean b;
    public long c;
    public long d;

    public b51(hi0 hi0Var) {
        if (hi0Var != null) {
            this.a = hi0Var;
        } else {
            c.g("ticker");
            throw null;
        }
    }

    public final void a() {
        if (!this.b) {
            this.b = true;
            this.d = this.a.q();
        } else {
            c.o("This stopwatch is already running.");
        }
    }

    public final String toString() {
        long j;
        TimeUnit timeUnit;
        String str;
        if (this.b) {
            j = (this.a.q() - this.d) + this.c;
        } else {
            j = this.c;
        }
        long j2 = j / 86400000000000L;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (j2 > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (j / 3600000000000L > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (j / 60000000000L > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (j / 1000000000 > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (j / 1000000 > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (j / 1000 > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = timeUnit2;
        }
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(j / timeUnit2.convert(1L, timeUnit)));
        switch (a51.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return format + " " + str;
    }
}
