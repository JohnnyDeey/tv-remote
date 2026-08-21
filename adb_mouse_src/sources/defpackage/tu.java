package defpackage;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class tu implements qu0, Cloneable {
    public static final tu e = new tu();
    public final List c;
    public final List d;

    public tu() {
        List list = Collections.EMPTY_LIST;
        this.c = list;
        this.d = list;
    }

    @Override // defpackage.qu0
    public final pu0 a(k00 k00Var, xv0 xv0Var) {
        Class cls = xv0Var.a;
        boolean b = b(cls, true);
        boolean b2 = b(cls, false);
        if (!b && !b2) {
            return null;
        }
        return new su(this, b, k00Var, xv0Var);
    }

    public final boolean b(Class cls, boolean z) {
        List list;
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            oi0 oi0Var = ri0.a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        if (z) {
            list = this.c;
        } else {
            list = this.d;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        throw qo0.l(it);
    }

    public final Object clone() {
        try {
            return (tu) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }
}
