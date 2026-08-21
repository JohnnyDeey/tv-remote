package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class p0 implements Iterator {
    public final /* synthetic */ int c;
    public int d;
    public final Object e;

    public p0(Object[] objArr) {
        this.c = 1;
        this.d = 0;
        this.e = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (this.d >= ((s0) obj).b()) {
                    return false;
                }
                return true;
            default:
                if (this.d >= ((Object[]) obj).length) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (hasNext()) {
                    int i2 = this.d;
                    this.d = i2 + 1;
                    return ((s0) obj).get(i2);
                }
                throw new NoSuchElementException();
            default:
                int i3 = this.d;
                Object[] objArr = (Object[]) obj;
                if (i3 != objArr.length) {
                    this.d = i3 + 1;
                    return objArr[i3];
                }
                throw new NoSuchElementException("Out of elements: " + this.d);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public p0(s0 s0Var) {
        this.c = 0;
        this.e = s0Var;
    }
}
