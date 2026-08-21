package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class l71 implements Iterator {
    public int c = 0;
    public final int d;
    public final /* synthetic */ n71 e;

    public l71(n71 n71Var) {
        this.e = n71Var;
        this.d = n71Var.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < this.d) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        if (i < this.d) {
            this.c = i + 1;
            return Byte.valueOf(this.e.c(i));
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
