package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* loaded from: classes.dex */
public final class df0 extends p {
    public o c;
    public k4 d;
    public t e;
    public b0 f;
    public e g;

    public df0(k4 k4Var, byte[] bArr, b0 b0Var, byte[] bArr2) {
        BigInteger bigInteger;
        cm cmVar;
        if (bArr2 != null) {
            bigInteger = kd.b;
        } else {
            bigInteger = kd.a;
        }
        this.c = new o(bigInteger);
        this.d = k4Var;
        this.e = new t(bArr);
        this.f = b0Var;
        if (bArr2 == null) {
            cmVar = null;
        } else {
            cmVar = new cm(0, bArr2);
        }
        this.g = cmVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, df0] */
    public static df0 i(Object obj) {
        if (obj instanceof df0) {
            return (df0) obj;
        }
        if (obj != null) {
            a0 s = a0.s(obj);
            ?? obj2 = new Object();
            Enumeration u = s.u();
            o q = o.q(u.nextElement());
            obj2.c = q;
            int t = q.t();
            if (t >= 0 && t <= 1) {
                obj2.d = k4.i(u.nextElement());
                obj2.e = t.q(u.nextElement());
                int i = -1;
                while (u.hasMoreElements()) {
                    yb ybVar = (yb) u.nextElement();
                    int i2 = ybVar.e;
                    if (i2 > i) {
                        if (i2 != 0) {
                            if (i2 == 1) {
                                if (t >= 1) {
                                    obj2.g = (e) e.d.d(ybVar, false);
                                } else {
                                    c.k("'publicKey' requires version v2(1) or later");
                                    return null;
                                }
                            } else {
                                c.k("unknown optional field in private key info");
                                return null;
                            }
                        } else {
                            obj2.f = (b0) b0.e.d(ybVar, false);
                        }
                        i = i2;
                    } else {
                        c.k("invalid optional field in private key info");
                        return null;
                    }
                }
                return obj2;
            }
            c.k("invalid version for private key info");
        }
        return null;
    }

    @Override // defpackage.p, defpackage.i
    public final x c() {
        j jVar = new j(5);
        jVar.d(this.c);
        jVar.d(this.d);
        jVar.d(this.e);
        b0 b0Var = this.f;
        if (b0Var != null) {
            jVar.d(new yb(false, 0, (i) b0Var, 1));
        }
        e eVar = this.g;
        if (eVar != null) {
            jVar.d(new yb(false, 1, (i) eVar, 1));
        }
        nm nmVar = new nm(jVar, 0);
        nmVar.f = -1;
        return nmVar;
    }

    public final x j() {
        return x.n(this.e.c);
    }

    public df0(k4 k4Var, x xVar, b0 b0Var) {
        this(k4Var, xVar, b0Var, (byte[]) null);
    }

    public df0(k4 k4Var, p pVar, b0 b0Var, byte[] bArr) {
        this(k4Var, pVar.c().h(), b0Var, bArr);
    }
}
