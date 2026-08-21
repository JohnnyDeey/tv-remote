package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class wb implements i, o10 {
    public final /* synthetic */ int c;
    public c0 d;

    public wb(c0 c0Var) {
        this.c = 2;
        this.d = c0Var;
    }

    public static dm a(c0 c0Var) {
        try {
            nm nmVar = new nm(c0Var.o(), 1);
            nmVar.f = -1;
            return new dm(nmVar);
        } catch (IllegalArgumentException e) {
            throw new l(e, e.getMessage());
        }
    }

    @Override // defpackage.i
    public final x c() {
        switch (this.c) {
            case 0:
                try {
                    return new a0(this.d.o());
                } catch (IOException e) {
                    c.o(e.getMessage());
                    return null;
                }
            case 1:
                try {
                    return new b0(this.d.o());
                } catch (IOException e2) {
                    throw new w(0, e2, e2.getMessage());
                }
            case 2:
                try {
                    return a(this.d);
                } catch (IOException e3) {
                    throw new w(0, e3, "unable to get DER object");
                } catch (IllegalArgumentException e4) {
                    throw new w(0, e4, "unable to get DER object");
                }
            case 3:
                try {
                    return f();
                } catch (IOException e5) {
                    c.o(e5.getMessage());
                    return null;
                }
            default:
                try {
                    return f();
                } catch (IOException e6) {
                    throw new w(0, e6, e6.getMessage());
                }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [x, dn, b0] */
    @Override // defpackage.o10
    public final x f() {
        switch (this.c) {
            case 0:
                return new a0(this.d.o());
            case 1:
                return new b0(this.d.o());
            case 2:
                return a(this.d);
            case 3:
                return bn.a(this.d.o());
            default:
                j o = this.d.o();
                nm nmVar = bn.a;
                if (o.b < 1) {
                    return bn.b;
                }
                ?? b0Var = new b0(o);
                b0Var.f = -1;
                return b0Var;
        }
    }

    public /* synthetic */ wb(int i) {
        this.c = i;
    }
}
