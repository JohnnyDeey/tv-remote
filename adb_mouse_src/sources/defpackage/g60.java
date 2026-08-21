package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class g60 implements Iterator {
    public i60 c;
    public i60 d = null;
    public int e;
    public final /* synthetic */ j60 f;
    public final /* synthetic */ int g;

    public g60(j60 j60Var, int i) {
        this.g = i;
        this.f = j60Var;
        this.c = j60Var.h.f;
        this.e = j60Var.g;
    }

    public final Object a() {
        return b();
    }

    public final i60 b() {
        i60 i60Var = this.c;
        j60 j60Var = this.f;
        if (i60Var != j60Var.h) {
            if (j60Var.g == this.e) {
                this.c = i60Var.f;
                this.d = i60Var;
                return i60Var;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c != this.f.h) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.g) {
            case 1:
                return b().h;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        i60 i60Var = this.d;
        if (i60Var != null) {
            j60 j60Var = this.f;
            j60Var.c(i60Var, true);
            this.d = null;
            this.e = j60Var.g;
            return;
        }
        throw new IllegalStateException();
    }
}
