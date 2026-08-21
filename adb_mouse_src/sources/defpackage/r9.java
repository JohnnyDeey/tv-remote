package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class r9 extends ql {
    public final Context a;
    public final xh b;
    public final xh c;
    public final String d;

    public r9(Context context, xh xhVar, xh xhVar2, String str) {
        if (context != null) {
            this.a = context;
            if (xhVar != null) {
                this.b = xhVar;
                if (xhVar2 != null) {
                    this.c = xhVar2;
                    if (str != null) {
                        this.d = str;
                        return;
                    } else {
                        c.g("Null backendName");
                        throw null;
                    }
                }
                c.g("Null monotonicClock");
                throw null;
            }
            c.g("Null wallClock");
            throw null;
        }
        c.g("Null applicationContext");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ql) {
            r9 r9Var = (r9) ((ql) obj);
            if (this.a.equals(r9Var.a) && this.b.equals(r9Var.b) && this.c.equals(r9Var.c) && this.d.equals(r9Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return qo0.s(sb, this.d, "}");
    }
}
