package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class aa {
    public final xh a;
    public final HashMap b;

    public aa(xh xhVar, HashMap hashMap) {
        this.a = xhVar;
        this.b = hashMap;
    }

    public final long a(af0 af0Var, long j, int i) {
        long j2;
        long d = j - this.a.d();
        ba baVar = (ba) this.b.get(af0Var);
        long j3 = baVar.a;
        int i2 = i - 1;
        if (j3 > 1) {
            j2 = j3;
        } else {
            j2 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j3 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j2 * i2))), d), baVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof aa) {
                aa aaVar = (aa) obj;
                if (this.a.equals(aaVar.a) && this.b.equals(aaVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
