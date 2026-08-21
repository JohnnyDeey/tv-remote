package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ql0 extends rl0 implements Iterator {
    public pl0 c;
    public boolean d = true;
    public final /* synthetic */ sl0 e;

    public ql0(sl0 sl0Var) {
        this.e = sl0Var;
    }

    @Override // defpackage.rl0
    public final void a(pl0 pl0Var) {
        boolean z;
        pl0 pl0Var2 = this.c;
        if (pl0Var == pl0Var2) {
            pl0 pl0Var3 = pl0Var2.f;
            this.c = pl0Var3;
            if (pl0Var3 == null) {
                z = true;
            } else {
                z = false;
            }
            this.d = z;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d) {
            if (this.e.c != null) {
                return true;
            }
            return false;
        }
        pl0 pl0Var = this.c;
        if (pl0Var != null && pl0Var.e != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        pl0 pl0Var;
        if (this.d) {
            this.d = false;
            this.c = this.e.c;
        } else {
            pl0 pl0Var2 = this.c;
            if (pl0Var2 != null) {
                pl0Var = pl0Var2.e;
            } else {
                pl0Var = null;
            }
            this.c = pl0Var;
        }
        return this.c;
    }
}
