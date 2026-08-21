package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ol0 extends rl0 implements Iterator {
    public pl0 c;
    public pl0 d;
    public final /* synthetic */ int e;

    public ol0(pl0 pl0Var, pl0 pl0Var2, int i) {
        this.e = i;
        this.c = pl0Var2;
        this.d = pl0Var;
    }

    @Override // defpackage.rl0
    public final void a(pl0 pl0Var) {
        pl0 pl0Var2;
        pl0 pl0Var3 = null;
        if (this.c == pl0Var && pl0Var == this.d) {
            this.d = null;
            this.c = null;
        }
        pl0 pl0Var4 = this.c;
        if (pl0Var4 == pl0Var) {
            switch (this.e) {
                case 0:
                    pl0Var2 = pl0Var4.f;
                    break;
                default:
                    pl0Var2 = pl0Var4.e;
                    break;
            }
            this.c = pl0Var2;
        }
        pl0 pl0Var5 = this.d;
        if (pl0Var5 == pl0Var) {
            pl0 pl0Var6 = this.c;
            if (pl0Var5 != pl0Var6 && pl0Var6 != null) {
                pl0Var3 = b(pl0Var5);
            }
            this.d = pl0Var3;
        }
    }

    public final pl0 b(pl0 pl0Var) {
        switch (this.e) {
            case 0:
                return pl0Var.e;
            default:
                return pl0Var.f;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        pl0 pl0Var;
        pl0 pl0Var2 = this.d;
        pl0 pl0Var3 = this.c;
        if (pl0Var2 != pl0Var3 && pl0Var3 != null) {
            pl0Var = b(pl0Var2);
        } else {
            pl0Var = null;
        }
        this.d = pl0Var;
        return pl0Var2;
    }
}
