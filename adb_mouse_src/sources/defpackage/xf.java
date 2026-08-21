package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes.dex */
public final class xf extends p {
    public a0 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xf] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, xu] */
    public static xf i(x xVar) {
        o oVar;
        int i;
        boolean z;
        boolean z2;
        xf xfVar;
        xu xuVar;
        g gVar;
        t q;
        xf xfVar2 = null;
        if (xVar == null) {
            return null;
        }
        a0 s = a0.s(xVar);
        ?? obj = new Object();
        obj.c = s;
        int i2 = 3;
        if (s.size() == 3) {
            i t = s.t(0);
            int i3 = 2;
            if (!(t instanceof wq0) && t != null) {
                a0 s2 = a0.s(t);
                if (s2.t(0) instanceof yb) {
                    oVar = (o) o.e.d((yb) s2.t(0), true);
                    i = 0;
                } else {
                    oVar = new o(0L);
                    i = -1;
                }
                if (oVar.r(0)) {
                    z2 = false;
                    z = true;
                } else if (oVar.r(1)) {
                    z = false;
                    z2 = true;
                } else if (oVar.r(2)) {
                    z = false;
                    z2 = false;
                } else {
                    c.k("version number not recognised");
                    return null;
                }
                o.q(s2.t(i + 1));
                k4.i(s2.t(i + 2));
                v11.i(s2.t(i + 3));
                i t2 = s2.t(i + 4);
                if (!(t2 instanceof ix0) && t2 != null) {
                    a0 s3 = a0.s(t2);
                    int size = s3.size();
                    if (size == 2) {
                        wr0.i(s3.t(0));
                        wr0.i(s3.t(1));
                    } else {
                        c.k(qo0.m("Bad sequence size: ", size));
                        return null;
                    }
                }
                v11.i(s2.t(i + 5));
                int i4 = i + 6;
                hq0.i(s2.t(i4));
                int size2 = (s2.size() - i4) - 1;
                if (size2 != 0 && z) {
                    c.k("version 1 certificate contains extra data");
                    return null;
                }
                while (size2 > 0) {
                    yb ybVar = (yb) s2.t(i4 + size2);
                    int i5 = ybVar.e;
                    d dVar = e.d;
                    if (i5 != 1 && i5 != i3) {
                        if (i5 == i2) {
                            if (!z2) {
                                a0 a0Var = (a0) a0.d.d(ybVar, true);
                                if (a0Var != null) {
                                    a0 s4 = a0.s(a0Var);
                                    Hashtable hashtable = new Hashtable();
                                    Vector vector = new Vector();
                                    Enumeration u = s4.u();
                                    while (u.hasMoreElements()) {
                                        Object nextElement = u.nextElement();
                                        int i6 = xu.f;
                                        xf xfVar3 = xfVar2;
                                        if (nextElement instanceof xu) {
                                            xuVar = (xu) nextElement;
                                        } else if (nextElement != null) {
                                            a0 s5 = a0.s(nextElement);
                                            ?? obj2 = new Object();
                                            if (s5.size() == i3) {
                                                obj2.c = s.u(s5.t(0));
                                                obj2.d = false;
                                                q = t.q(s5.t(1));
                                            } else if (s5.size() == 3) {
                                                obj2.c = s.u(s5.t(0));
                                                Object t3 = s5.t(1);
                                                if (t3 != null && !(t3 instanceof g)) {
                                                    if (t3 instanceof byte[]) {
                                                        try {
                                                            x n = x.n((byte[]) t3);
                                                            if (g.class.isInstance(n)) {
                                                                gVar = (g) n;
                                                            } else {
                                                                throw new IllegalStateException("unexpected object: ".concat(n.getClass().getName()));
                                                            }
                                                        } catch (IOException e) {
                                                            c.j(e.getMessage(), "failed to construct boolean from byte[]: ");
                                                            return xfVar3;
                                                        }
                                                    } else {
                                                        c.k("illegal object in getInstance: ".concat(t3.getClass().getName()));
                                                        return xfVar3;
                                                    }
                                                } else {
                                                    gVar = (g) t3;
                                                }
                                                obj2.d = gVar.r();
                                                q = t.q(s5.t(2));
                                            } else {
                                                f40.h("Bad sequence size: ", s5.size());
                                                return xfVar3;
                                            }
                                            obj2.e = q;
                                            xuVar = obj2;
                                        } else {
                                            xuVar = xfVar3;
                                        }
                                        s sVar = xuVar.c;
                                        if (hashtable.containsKey(sVar) && !qf0.b("org.bouncycastle.x509.ignore_repeated_extensions")) {
                                            c.r(sVar, "repeated extension found: ");
                                            return xfVar3;
                                        }
                                        hashtable.put(sVar, xuVar);
                                        vector.addElement(sVar);
                                        xfVar2 = xfVar3;
                                        i3 = 2;
                                    }
                                }
                                xfVar = xfVar2;
                            } else {
                                xf xfVar4 = xfVar2;
                                c.k("version 2 certificate cannot contain extensions");
                                return xfVar4;
                            }
                        } else {
                            xf xfVar5 = xfVar2;
                            f40.h("Unknown tag encountered in structure: ", ybVar.e);
                            return xfVar5;
                        }
                    } else {
                        xfVar = xfVar2;
                    }
                    size2--;
                    xfVar2 = xfVar;
                    i2 = 3;
                    i3 = 2;
                }
            }
            k4.i(s.t(1));
            e.s(s.t(2));
            return obj;
        }
        c.k("sequence wrong size for a certificate");
        return null;
    }

    @Override // defpackage.p, defpackage.i
    public final x c() {
        return this.c;
    }
}
