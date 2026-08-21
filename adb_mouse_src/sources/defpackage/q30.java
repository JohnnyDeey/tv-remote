package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class q30 implements bl {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(q30.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(q30.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public q30(boolean z) {
        qt qtVar;
        if (z) {
            qtVar = k20.o;
        } else {
            qtVar = k20.n;
        }
        this._state$volatile = qtVar;
    }

    public static wg H(g70 g70Var) {
        while (g70Var.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g70.d;
            g70 f = g70Var.f();
            if (f == null) {
                Object obj = atomicReferenceFieldUpdater.get(g70Var);
                while (true) {
                    g70Var = (g70) obj;
                    if (!g70Var.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(g70Var);
                }
            } else {
                g70Var = f;
            }
        }
        while (true) {
            g70Var = g70Var.h();
            if (!g70Var.i()) {
                if (g70Var instanceof wg) {
                    return (wg) g70Var;
                }
                if (g70Var instanceof cc0) {
                    return null;
                }
            }
        }
    }

    public static String O(Object obj) {
        if (obj instanceof p30) {
            p30 p30Var = (p30) obj;
            if (p30Var.e()) {
                return "Cancelling";
            }
            if (p30.d.get(p30Var) == 0) {
                return "Active";
            }
            return "Completing";
        }
        if (obj instanceof q10) {
            if (((q10) obj).b()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof ui) {
            return "Cancelled";
        }
        return "Completed";
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (r4 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [wg, g70, n30, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, dr] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v8, types: [cc0, g70] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.q30 r8) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.q30.d
            dc0 r1 = defpackage.dc0.c
            if (r8 != 0) goto La
            r0.set(r7, r1)
            return
        La:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.q30.c
            java.lang.Object r3 = r2.get(r8)
            int r3 = r8.N(r3)
            if (r3 == 0) goto L1a
            r4 = 1
            if (r3 == r4) goto L1a
            goto La
        L1a:
            wg r3 = new wg
            r3.<init>(r7)
            r3.f = r8
        L21:
            java.lang.Object r4 = r2.get(r8)
            boolean r5 = r4 instanceof defpackage.qt
            if (r5 == 0) goto L43
            r5 = r4
            qt r5 = (defpackage.qt) r5
            boolean r6 = r5.c
            if (r6 == 0) goto L3f
        L30:
            boolean r5 = r2.compareAndSet(r8, r4, r3)
            if (r5 == 0) goto L38
            goto L9b
        L38:
            java.lang.Object r5 = r2.get(r8)
            if (r5 == r4) goto L30
            goto L21
        L3f:
            r8.L(r5)
            goto L21
        L43:
            boolean r5 = r4 instanceof defpackage.q10
            r6 = 0
            if (r5 == 0) goto L87
            r5 = r4
            q10 r5 = (defpackage.q10) r5
            cc0 r5 = r5.d()
            if (r5 != 0) goto L57
            n30 r4 = (defpackage.n30) r4
            r8.M(r4)
            goto L21
        L57:
            r4 = 7
            boolean r4 = r5.e(r3, r4)
            if (r4 == 0) goto L5f
            goto L9b
        L5f:
            r4 = 3
            boolean r4 = r5.e(r3, r4)
            java.lang.Object r8 = r2.get(r8)
            boolean r5 = r8 instanceof defpackage.p30
            if (r5 == 0) goto L73
            p30 r8 = (defpackage.p30) r8
            java.lang.Throwable r6 = r8.c()
            goto L7f
        L73:
            boolean r5 = r8 instanceof defpackage.ui
            if (r5 == 0) goto L7a
            ui r8 = (defpackage.ui) r8
            goto L7b
        L7a:
            r8 = r6
        L7b:
            if (r8 == 0) goto L7f
            java.lang.Throwable r6 = r8.a
        L7f:
            r3.l(r6)
            if (r4 == 0) goto L85
            goto L9b
        L85:
            r3 = r1
            goto L9b
        L87:
            java.lang.Object r8 = r2.get(r8)
            boolean r4 = r8 instanceof defpackage.ui
            if (r4 == 0) goto L92
            ui r8 = (defpackage.ui) r8
            goto L93
        L92:
            r8 = r6
        L93:
            if (r8 == 0) goto L97
            java.lang.Throwable r6 = r8.a
        L97:
            r3.l(r6)
            goto L85
        L9b:
            r0.set(r7, r3)
            java.lang.Object r8 = r2.get(r7)
            boolean r8 = r8 instanceof defpackage.q10
            if (r8 != 0) goto Lac
            r3.a()
            r0.set(r7, r1)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q30.B(q30):void");
    }

    public final dr C(boolean z, n30 n30Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        dc0 dc0Var;
        boolean z2;
        Throwable th;
        ui uiVar;
        boolean e;
        p30 p30Var;
        Throwable th2;
        n30Var.f = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = c;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof qt;
            dc0Var = dc0.c;
            z2 = true;
            th = null;
            if (z3) {
                qt qtVar = (qt) obj;
                if (qtVar.c) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, n30Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                L(qtVar);
            } else if (obj instanceof q10) {
                q10 q10Var = (q10) obj;
                cc0 d2 = q10Var.d();
                if (d2 == null) {
                    M((n30) obj);
                } else {
                    if (n30Var.k()) {
                        if (q10Var instanceof p30) {
                            p30Var = (p30) q10Var;
                        } else {
                            p30Var = null;
                        }
                        if (p30Var != null) {
                            th2 = p30Var.c();
                        } else {
                            th2 = null;
                        }
                        if (th2 == null) {
                            e = d2.e(n30Var, 5);
                        } else if (z) {
                            n30Var.l(th2);
                            return dc0Var;
                        }
                    } else {
                        e = d2.e(n30Var, 1);
                    }
                    if (e) {
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            return n30Var;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof ui) {
                uiVar = (ui) obj2;
            } else {
                uiVar = null;
            }
            if (uiVar != null) {
                th = uiVar.a;
            }
            n30Var.l(th);
        }
        return dc0Var;
    }

    public boolean D() {
        Object obj = c.get(this);
        if ((obj instanceof q10) && ((q10) obj).b()) {
            return true;
        }
        return false;
    }

    public boolean E() {
        return false;
    }

    public final Object F(bq bqVar) {
        nw0 nw0Var;
        while (true) {
            Object obj = c.get(this);
            boolean z = obj instanceof q10;
            nw0Var = nw0.a;
            if (!z) {
                dl dlVar = bqVar.d;
                dlVar.getClass();
                q30 q30Var = (q30) dlVar.h(os.e);
                if (q30Var != null && !q30Var.D()) {
                    throw q30Var.v();
                }
            } else if (N(obj) >= 0) {
                int i = 1;
                ff ffVar = new ff(wv0.G(bqVar), 1);
                ffVar.s();
                ffVar.u(new cf(i, mn.A(this, true, new ug(i, ffVar))));
                Object r = ffVar.r();
                ml mlVar = ml.c;
                if (r != mlVar) {
                    r = nw0Var;
                }
                if (r == mlVar) {
                    return r;
                }
            }
        }
        return nw0Var;
    }

    public final Object G(Object obj) {
        Object P;
        ui uiVar;
        do {
            P = P(c.get(this), obj);
            if (P == k20.i) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof ui) {
                    uiVar = (ui) obj;
                } else {
                    uiVar = null;
                }
                if (uiVar != null) {
                    th = uiVar.a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (P == k20.k);
        return P;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, vi] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, q30] */
    public final void I(cc0 cc0Var, Throwable th) {
        cc0Var.e(new k60(4), 4);
        Object obj = g70.c.get(cc0Var);
        obj.getClass();
        g70 g70Var = (g70) obj;
        ?? r1 = 0;
        while (!g70Var.equals(cc0Var)) {
            if ((g70Var instanceof n30) && ((n30) g70Var).k()) {
                try {
                    ((n30) g70Var).l(th);
                } catch (Throwable th2) {
                    if (r1 != 0) {
                        mn.a(r1, th2);
                    } else {
                        r1 = new RuntimeException("Exception in completion handler " + g70Var + " for " + ((Object) this), th2);
                    }
                }
            }
            g70Var = g70Var.h();
            r1 = r1;
        }
        if (r1 != 0) {
            A(r1);
        }
        p(th);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g70, cc0] */
    public final void L(qt qtVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? g70Var = new g70();
        p10 p10Var = g70Var;
        if (!qtVar.c) {
            p10Var = new p10(g70Var);
        }
        do {
            atomicReferenceFieldUpdater = c;
            if (atomicReferenceFieldUpdater.compareAndSet(this, qtVar, p10Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == qtVar);
    }

    public final void M(n30 n30Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        g70 g70Var = new g70();
        n30Var.getClass();
        g70.d.set(g70Var, n30Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g70.c;
        atomicReferenceFieldUpdater2.set(g70Var, n30Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(n30Var) != n30Var) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(n30Var, n30Var, g70Var)) {
                if (atomicReferenceFieldUpdater2.get(n30Var) != n30Var) {
                    break;
                }
            }
            g70Var.g(n30Var);
        }
        g70 h = n30Var.h();
        do {
            atomicReferenceFieldUpdater = c;
            if (atomicReferenceFieldUpdater.compareAndSet(this, n30Var, h)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == n30Var);
    }

    public final int N(Object obj) {
        boolean z = obj instanceof qt;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        if (z) {
            if (!((qt) obj).c) {
                qt qtVar = k20.o;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qtVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        return -1;
                    }
                }
                return 1;
            }
            return 0;
        }
        if (obj instanceof p10) {
            cc0 cc0Var = ((p10) obj).c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, cc0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        return 0;
    }

    public final Object P(Object obj, Object obj2) {
        Object obj3;
        p30 p30Var;
        boolean z;
        ui uiVar;
        if (!(obj instanceof q10)) {
            return k20.i;
        }
        if (((obj instanceof qt) || (obj instanceof n30)) && !(obj instanceof wg) && !(obj2 instanceof ui)) {
            q10 q10Var = (q10) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            if (obj2 instanceof q10) {
                obj3 = new r10((q10) obj2);
            } else {
                obj3 = obj2;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, q10Var, obj3)) {
                if (atomicReferenceFieldUpdater.get(this) != q10Var) {
                    return k20.k;
                }
            }
            J(obj2);
            s(q10Var, obj2);
            return obj2;
        }
        q10 q10Var2 = (q10) obj;
        cc0 y = y(q10Var2);
        if (y == null) {
            return k20.k;
        }
        Throwable th = null;
        if (q10Var2 instanceof p30) {
            p30Var = (p30) q10Var2;
        } else {
            p30Var = null;
        }
        if (p30Var == null) {
            p30Var = new p30(y, null);
        }
        synchronized (p30Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = p30.d;
            if (atomicIntegerFieldUpdater.get(p30Var) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return k20.i;
            }
            atomicIntegerFieldUpdater.set(p30Var, 1);
            if (p30Var != q10Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = c;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, q10Var2, p30Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != q10Var2) {
                        return k20.k;
                    }
                }
            }
            boolean e = p30Var.e();
            if (obj2 instanceof ui) {
                uiVar = (ui) obj2;
            } else {
                uiVar = null;
            }
            if (uiVar != null) {
                p30Var.a(uiVar.a);
            }
            Throwable c2 = p30Var.c();
            if (!e) {
                th = c2;
            }
            if (th != null) {
                I(y, th);
            }
            wg H = H(y);
            if (H != null && Q(p30Var, H, obj2)) {
                return k20.j;
            }
            y.e(new k60(2), 2);
            wg H2 = H(y);
            if (H2 != null && Q(p30Var, H2, obj2)) {
                return k20.j;
            }
            return u(p30Var, obj2);
        }
    }

    public final boolean Q(p30 p30Var, wg wgVar, Object obj) {
        while (mn.A(wgVar.g, false, new o30(this, p30Var, wgVar, obj)) == dc0.c) {
            wgVar = H(wgVar);
            if (wgVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.dl
    public final Object f(Object obj, zy zyVar) {
        return zyVar.g(obj, this);
    }

    @Override // defpackage.dl
    public final dl g(dl dlVar) {
        return wv0.Q(this, dlVar);
    }

    @Override // defpackage.bl
    public final cl getKey() {
        return os.e;
    }

    @Override // defpackage.dl
    public final bl h(cl clVar) {
        clVar.getClass();
        if (k20.c(os.e, clVar)) {
            return this;
        }
        return null;
    }

    public void j(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new k30(q(), null, this);
        }
        o(cancellationException);
    }

    @Override // defpackage.dl
    public final dl k(cl clVar) {
        clVar.getClass();
        if (k20.c(os.e, clVar)) {
            return st.c;
        }
        return this;
    }

    public void m(Object obj) {
        l(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        r0 = defpackage.k20.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 != defpackage.k20.j) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e7, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r0 = P(r0, new defpackage.ui(t(r10), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r0 == defpackage.k20.k) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r0 != defpackage.k20.i) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        r4 = defpackage.q30.c;
        r5 = r4.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if ((r5 instanceof defpackage.p30) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if ((r5 instanceof defpackage.q10) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r1 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        r1 = t(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        r6 = (defpackage.q10) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (x() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        if (r6.b() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c2, code lost:
    
        r4 = P(r5, new defpackage.ui(r1, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cd, code lost:
    
        if (r4 == defpackage.k20.i) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
    
        if (r4 == defpackage.k20.k) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = defpackage.q30.c.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d5, code lost:
    
        defpackage.c.t(r5, "Cannot happen in ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a3, code lost:
    
        r7 = y(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        if (r7 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00aa, code lost:
    
        r8 = new defpackage.p30(r7, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        if (r4.compareAndSet(r9, r6, r8) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r0 instanceof defpackage.q10) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bf, code lost:
    
        if (r4.get(r9) == r6) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b5, code lost:
    
        I(r7, r1);
        r10 = defpackage.k20.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x005f, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00db, code lost:
    
        r10 = defpackage.k20.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x004e, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x005a, code lost:
    
        if (defpackage.p30.f.get((defpackage.p30) r5) != defpackage.k20.m) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x005c, code lost:
    
        r10 = defpackage.k20.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x005e, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0064, code lost:
    
        r4 = ((defpackage.p30) r5).e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x006b, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006d, code lost:
    
        r1 = t(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if ((r0 instanceof defpackage.p30) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0071, code lost:
    
        ((defpackage.p30) r5).a(r1);
        r10 = ((defpackage.p30) r5).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x007e, code lost:
    
        if (r4 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0080, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0081, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0082, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0084, code lost:
    
        I(((defpackage.p30) r5).c, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x008b, code lost:
    
        r10 = defpackage.k20.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e0, code lost:
    
        if (r0 != defpackage.k20.i) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e5, code lost:
    
        if (r0 != defpackage.k20.j) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ea, code lost:
    
        if (r0 != defpackage.k20.l) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ec, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ed, code lost:
    
        l(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f0, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (defpackage.p30.d.get((defpackage.p30) r0) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q30.n(java.lang.Object):boolean");
    }

    public void o(CancellationException cancellationException) {
        n(cancellationException);
    }

    public final boolean p(Throwable th) {
        if (!E()) {
            boolean z = th instanceof CancellationException;
            vg vgVar = (vg) d.get(this);
            if (vgVar != null && vgVar != dc0.c) {
                if (!vgVar.c(th) && !z) {
                    return false;
                }
                return true;
            }
            return z;
        }
        return true;
    }

    public String q() {
        return "Job was cancelled";
    }

    public boolean r(Throwable th) {
        if (!(th instanceof CancellationException)) {
            if (n(th) && w()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [vi, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, vi] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, q30] */
    public final void s(q10 q10Var, Object obj) {
        ui uiVar;
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        vg vgVar = (vg) atomicReferenceFieldUpdater.get(this);
        if (vgVar != null) {
            vgVar.a();
            atomicReferenceFieldUpdater.set(this, dc0.c);
        }
        ?? r1 = 0;
        if (obj instanceof ui) {
            uiVar = (ui) obj;
        } else {
            uiVar = null;
        }
        if (uiVar != null) {
            th = uiVar.a;
        } else {
            th = null;
        }
        if (q10Var instanceof n30) {
            try {
                ((n30) q10Var).l(th);
                return;
            } catch (Throwable th2) {
                A(new RuntimeException("Exception in completion handler " + q10Var + " for " + ((Object) this), th2));
                return;
            }
        }
        cc0 d2 = q10Var.d();
        if (d2 != null) {
            d2.e(new k60(1), 1);
            Object obj2 = g70.c.get(d2);
            obj2.getClass();
            g70 g70Var = (g70) obj2;
            while (!g70Var.equals(d2)) {
                if (g70Var instanceof n30) {
                    try {
                        ((n30) g70Var).l(th);
                    } catch (Throwable th3) {
                        if (r1 != 0) {
                            mn.a(r1, th3);
                        } else {
                            r1 = new RuntimeException("Exception in completion handler " + g70Var + " for " + ((Object) this), th3);
                        }
                    }
                }
                g70Var = g70Var.h();
                r1 = r1;
            }
            if (r1 != 0) {
                A(r1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable t(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        q30 q30Var = (q30) obj;
        Object obj2 = c.get(q30Var);
        CancellationException cancellationException2 = null;
        if (obj2 instanceof p30) {
            cancellationException = ((p30) obj2).c();
        } else if (obj2 instanceof ui) {
            cancellationException = ((ui) obj2).a;
        } else if (!(obj2 instanceof q10)) {
            cancellationException = null;
        } else {
            c.t(obj2, "Cannot be cancelling child in this state: ");
            return null;
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            return new k30("Parent job is ".concat(O(obj2)), cancellationException, q30Var);
        }
        return cancellationException2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + O(c.get(this)) + '}');
        sb.append('@');
        sb.append(mn.r(this));
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object u(p30 p30Var, Object obj) {
        ui uiVar;
        Throwable th;
        Object obj2;
        Throwable th2 = null;
        if (obj instanceof ui) {
            uiVar = (ui) obj;
        } else {
            uiVar = null;
        }
        if (uiVar != null) {
            th = uiVar.a;
        } else {
            th = null;
        }
        synchronized (p30Var) {
            p30Var.e();
            ArrayList f = p30Var.f(th);
            if (f.isEmpty()) {
                if (p30Var.e()) {
                    th2 = new k30(q(), null, this);
                }
            } else {
                int size = f.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj3 = f.get(i);
                    i++;
                    if (!(((Throwable) obj3) instanceof CancellationException)) {
                        th2 = obj3;
                        break;
                    }
                }
                th2 = th2;
                if (th2 == null) {
                    th2 = (Throwable) f.get(0);
                }
            }
            if (th2 != null && f.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f.size()));
                int size2 = f.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj4 = f.get(i2);
                    i2++;
                    Throwable th3 = (Throwable) obj4;
                    if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        mn.a(th2, th3);
                    }
                }
            }
        }
        if (th2 != null && th2 != th) {
            obj = new ui(th2, false);
        }
        if (th2 != null && (p(th2) || z(th2))) {
            obj.getClass();
            ui.b.compareAndSet((ui) obj, 0, 1);
        }
        J(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        if (obj instanceof q10) {
            obj2 = new r10((q10) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, p30Var, obj2) && atomicReferenceFieldUpdater.get(this) == p30Var) {
        }
        s(p30Var, obj);
        return obj;
    }

    public final CancellationException v() {
        Object obj = c.get(this);
        CancellationException cancellationException = null;
        if (obj instanceof p30) {
            Throwable c2 = ((p30) obj).c();
            if (c2 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c2 instanceof CancellationException) {
                    cancellationException = (CancellationException) c2;
                }
                if (cancellationException == null) {
                    return new k30(concat, c2, this);
                }
                return cancellationException;
            }
            c.t(this, "Job is still new or active: ");
            return null;
        }
        if (!(obj instanceof q10)) {
            if (obj instanceof ui) {
                Throwable th = ((ui) obj).a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new k30(q(), th, this);
                }
                return cancellationException;
            }
            return new k30(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        c.t(this, "Job is still new or active: ");
        return null;
    }

    public boolean w() {
        return true;
    }

    public boolean x() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [g70, cc0] */
    public final cc0 y(q10 q10Var) {
        cc0 d2 = q10Var.d();
        if (d2 == null) {
            if (q10Var instanceof qt) {
                return new g70();
            }
            if (q10Var instanceof n30) {
                M((n30) q10Var);
                return null;
            }
            c.t(q10Var, "State should have list: ");
            return null;
        }
        return d2;
    }

    public boolean z(Throwable th) {
        return false;
    }

    public void K() {
    }

    public void A(vi viVar) {
        throw viVar;
    }

    public void J(Object obj) {
    }

    public void l(Object obj) {
    }
}
