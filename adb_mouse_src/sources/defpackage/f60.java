package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class f60 implements Iterator {
    public final String c;
    public int d;
    public int e;
    public int f;
    public int g;

    public f60(String str) {
        this.c = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2 = this.d;
        if (i2 != 0) {
            if (i2 != 1) {
                return false;
            }
            return true;
        }
        int i3 = 2;
        if (this.g < 0) {
            this.d = 2;
            return false;
        }
        String str = this.c;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.e; i4 < length2; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                if (charAt != '\r' || (i = i4 + 1) >= str.length() || str.charAt(i) != '\n') {
                    i3 = 1;
                }
                length = i4;
                this.d = 1;
                this.g = i3;
                this.f = length;
                return true;
            }
        }
        i3 = -1;
        this.d = 1;
        this.g = i3;
        this.f = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.d = 0;
            int i = this.f;
            int i2 = this.e;
            this.e = this.g + i;
            return this.c.subSequence(i2, i).toString();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
