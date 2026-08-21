package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class p81 implements u81 {
    public final h71 a;
    public final g00 b;

    public p81(g00 g00Var, h71 h71Var) {
        vj0 vj0Var = u71.a;
        this.b = g00Var;
        this.a = h71Var;
    }

    @Override // defpackage.u81
    public final void a(Object obj) {
        this.b.getClass();
        x81 x81Var = ((x71) obj).zzc;
        if (x81Var.e) {
            x81Var.e = false;
        }
        vj0 vj0Var = u71.a;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.u81
    public final void b(Object obj, Object obj2) {
        v81.p(obj, obj2);
    }

    @Override // defpackage.u81
    public final x71 c() {
        h71 h71Var = this.a;
        if (h71Var instanceof x71) {
            return ((x71) h71Var).n();
        }
        w71 w71Var = (w71) ((x71) h71Var).j(5);
        boolean h = w71Var.d.h();
        x71 x71Var = w71Var.d;
        if (!h) {
            return x71Var;
        }
        x71Var.p();
        return w71Var.d;
    }

    @Override // defpackage.u81
    public final int d(x71 x71Var) {
        return x71Var.zzc.hashCode();
    }

    @Override // defpackage.u81
    public final void e(Object obj, byte[] bArr, int i, int i2, k71 k71Var) {
        x71 x71Var = (x71) obj;
        if (x71Var.zzc == x81.f) {
            x71Var.zzc = x81.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.u81
    public final boolean f(x71 x71Var, x71 x71Var2) {
        if (!x71Var.zzc.equals(x71Var2.zzc)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.u81
    public final int g(h71 h71Var) {
        x81 x81Var = ((x71) h71Var).zzc;
        int i = x81Var.d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < x81Var.a; i3++) {
                int i4 = x81Var.b[i3] >>> 3;
                n71 n71Var = (n71) x81Var.c[i3];
                int n = p71.n(8);
                int n2 = p71.n(i4) + p71.n(16);
                int n3 = p71.n(24);
                int e = n71Var.e();
                i2 += n + n + n2 + qo0.i(e, e, n3);
            }
            x81Var.d = i2;
            return i2;
        }
        return i;
    }

    @Override // defpackage.u81
    public final boolean h(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.u81
    public final void i(Object obj, sb0 sb0Var) {
        obj.getClass();
        throw new ClassCastException();
    }
}
