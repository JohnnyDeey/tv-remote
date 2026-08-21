package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class h20 implements Iterator {
    public final int c;
    public final int d;
    public boolean e;
    public int f;

    public h20(int i, int i2, int i3) {
        this.c = i3;
        this.d = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.e = z;
        this.f = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f;
        if (i == this.d) {
            if (this.e) {
                this.e = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f = this.c + i;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
