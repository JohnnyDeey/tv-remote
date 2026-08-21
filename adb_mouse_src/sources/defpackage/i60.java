package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class i60 implements Map.Entry {
    public i60 c;
    public i60 d;
    public i60 e;
    public i60 f;
    public i60 g;
    public final Object h;
    public final boolean i;
    public Object j;
    public int k;

    public i60(boolean z, i60 i60Var, Object obj, i60 i60Var2, i60 i60Var3) {
        this.c = i60Var;
        this.h = obj;
        this.i = z;
        this.k = 1;
        this.f = i60Var2;
        this.g = i60Var3;
        i60Var3.f = this;
        i60Var2.g = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.h;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.j;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.h;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.j;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.h;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.j;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.i) {
            c.g("value == null");
            return null;
        }
        Object obj2 = this.j;
        this.j = obj;
        return obj2;
    }

    public final String toString() {
        return this.h + "=" + this.j;
    }

    public i60(boolean z) {
        this.h = null;
        this.i = z;
        this.g = this;
        this.f = this;
    }
}
