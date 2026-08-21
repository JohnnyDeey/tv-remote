package defpackage;

import java.util.Hashtable;

/* loaded from: classes.dex */
public final class yf {
    public final r6 a;
    public final Hashtable b;

    public yf(r6 r6Var, Hashtable hashtable) {
        if (r6Var != null) {
            this.a = r6Var;
            this.b = hashtable;
        } else {
            c.g("'certificate' cannot be null");
            throw null;
        }
    }
}
