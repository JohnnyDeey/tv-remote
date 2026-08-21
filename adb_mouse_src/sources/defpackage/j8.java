package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class j8 implements Iterator {
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j8(n8 n8Var, int i) {
        this(n8Var.e);
        this.f = i;
        switch (i) {
            case 1:
                this.g = n8Var;
                this(n8Var.e);
                return;
            default:
                this.g = n8Var;
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d < this.c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f;
        if (hasNext()) {
            int i = this.d;
            int i2 = this.f;
            Object obj = this.g;
            switch (i2) {
                case 0:
                    f = ((n8) obj).f(i);
                    break;
                case 1:
                    f = ((n8) obj).i(i);
                    break;
                default:
                    f = ((p8) obj).d[i];
                    break;
            }
            this.d++;
            this.e = true;
            return f;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.e) {
            int i = this.d - 1;
            this.d = i;
            int i2 = this.f;
            Object obj = this.g;
            switch (i2) {
                case 0:
                    ((n8) obj).g(i);
                    break;
                case 1:
                    ((n8) obj).g(i);
                    break;
                default:
                    ((p8) obj).b(i);
                    break;
            }
            this.c--;
            this.e = false;
            return;
        }
        c.o("Call next() before removing an element.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j8(p8 p8Var) {
        this(p8Var.e);
        this.f = 2;
        this.g = p8Var;
    }

    public j8(int i) {
        this.c = i;
    }
}
