package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class l8 implements Iterator, Map.Entry {
    public int c;
    public int d = -1;
    public boolean e;
    public final /* synthetic */ n8 f;

    public l8(n8 n8Var) {
        this.f = n8Var;
        this.c = n8Var.e - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.e) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i = this.d;
                n8 n8Var = this.f;
                if (k20.c(key, n8Var.f(i)) && k20.c(entry.getValue(), n8Var.i(this.d))) {
                    return true;
                }
            }
            return false;
        }
        c.o("This container does not support retaining Map.Entry objects");
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.e) {
            return this.f.f(this.d);
        }
        c.o("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.e) {
            return this.f.i(this.d);
        }
        c.o("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d < this.c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i = 0;
        if (this.e) {
            int i2 = this.d;
            n8 n8Var = this.f;
            Object f = n8Var.f(i2);
            Object i3 = n8Var.i(this.d);
            if (f == null) {
                hashCode = 0;
            } else {
                hashCode = f.hashCode();
            }
            if (i3 != null) {
                i = i3.hashCode();
            }
            return hashCode ^ i;
        }
        c.o("This container does not support retaining Map.Entry objects");
        return 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.d++;
            this.e = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.e) {
            this.f.g(this.d);
            this.d--;
            this.c--;
            this.e = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.e) {
            return this.f.h(this.d, obj);
        }
        c.o("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
