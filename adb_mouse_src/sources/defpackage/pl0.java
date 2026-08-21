package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class pl0 implements Map.Entry {
    public final Object c;
    public final Object d;
    public pl0 e;
    public pl0 f;

    public pl0(Object obj, Object obj2) {
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof pl0) {
                pl0 pl0Var = (pl0) obj;
                if (this.c.equals(pl0Var.c) && this.d.equals(pl0Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.d.hashCode() ^ this.c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.c + "=" + this.d;
    }
}
