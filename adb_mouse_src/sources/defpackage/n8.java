package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class n8 extends io0 implements Map {
    public h60 f;
    public k8 g;
    public m8 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(io0 io0Var) {
        super(0);
        int i = io0Var.e;
        b(this.e + i);
        if (this.e == 0) {
            if (i > 0) {
                s8.u0(0, 0, i, io0Var.c, this.c);
                s8.v0(io0Var.d, this.d, 0, 0, i << 1);
                this.e = i;
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            put(io0Var.f(i2), io0Var.i(i2));
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h60 h60Var = this.f;
        if (h60Var == null) {
            h60 h60Var2 = new h60(this, 2);
            this.f = h60Var2;
            return h60Var2;
        }
        return h60Var;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.e;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        if (i != this.e) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        k8 k8Var = this.g;
        if (k8Var == null) {
            k8 k8Var2 = new k8(this);
            this.g = k8Var2;
            return k8Var2;
        }
        return k8Var;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.e);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        m8 m8Var = this.h;
        if (m8Var == null) {
            m8 m8Var2 = new m8(this);
            this.h = m8Var2;
            return m8Var2;
        }
        return m8Var;
    }
}
