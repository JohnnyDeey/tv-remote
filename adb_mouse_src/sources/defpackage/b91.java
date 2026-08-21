package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class b91 {
    public final /* synthetic */ int a;
    public final Object b;

    public b91() {
        this.a = 2;
        this.b = new LinkedHashMap();
    }

    public void a(x xVar) {
        if (((Class) this.b).isInstance(xVar)) {
            return;
        }
        c.o("unexpected object: ".concat(xVar.getClass().getName()));
    }

    public x b(a0 a0Var) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    public x c(km kmVar) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    public x d(yb ybVar, boolean z) {
        String str;
        a0 a0Var;
        x b;
        wv0.n(ybVar);
        int i = ybVar.c;
        i iVar = ybVar.f;
        if (z) {
            if (ybVar.r()) {
                b = iVar.c();
                a(b);
                a(b);
                return b;
            }
            str = "object implicit - explicit expected.";
            c.o(str);
            return null;
        }
        int i2 = 1;
        if (1 != i) {
            x c = iVar.c();
            if (i != 3) {
                if (i != 4) {
                    a(c);
                    b = c;
                } else if (c instanceof a0) {
                    b = b((a0) c);
                } else {
                    b = c((km) c);
                }
            } else {
                switch (ybVar.g) {
                    case 0:
                        a0Var = new a0(c);
                        break;
                    case 1:
                        nm nmVar = new nm(c, 0);
                        nmVar.f = -1;
                        a0Var = nmVar;
                        break;
                    default:
                        nm nmVar2 = new nm(c, i2);
                        nmVar2.f = -1;
                        a0Var = nmVar2;
                        break;
                }
                b = b(a0Var);
            }
            a(b);
            return b;
        }
        str = "object explicit - implicit expected.";
        c.o(str);
        return null;
    }

    public abstract double e(long j, Object obj);

    public boolean equals(Object obj) {
        switch (this.a) {
            case 1:
                if (this == obj) {
                    return true;
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    public abstract float f(long j, Object obj);

    public abstract void g(Object obj, long j, boolean z);

    public abstract void h(Object obj, long j, byte b);

    public abstract void i(Object obj, long j, double d);

    public abstract void j(Object obj, long j, float f);

    public abstract boolean k(long j, Object obj);

    public /* synthetic */ b91(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
