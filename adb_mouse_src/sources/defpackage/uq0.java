package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class uq0 implements Serializable {
    public cd0 c;
    public volatile Object d = g00.g;
    public final Object e = this;

    public uq0(cd0 cd0Var) {
        this.c = cd0Var;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.d;
        g00 g00Var = g00.g;
        if (obj2 != g00Var) {
            return obj2;
        }
        synchronized (this.e) {
            obj = this.d;
            if (obj == g00Var) {
                cd0 cd0Var = this.c;
                cd0Var.getClass();
                obj = cd0Var.a();
                this.d = obj;
                this.c = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.d != g00.g) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
