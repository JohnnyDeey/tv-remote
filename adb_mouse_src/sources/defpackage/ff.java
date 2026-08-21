package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ff extends xq implements nl, a01, qk {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(ff.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(ff.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(ff.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final qk f;
    public final dl g;

    public ff(qk qkVar, int i2) {
        super(i2);
        this.f = qkVar;
        this.g = qkVar.d();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = w2.a;
    }

    public static Object A(fc0 fc0Var, Object obj, int i2, az azVar) {
        cf cfVar;
        if (obj instanceof ui) {
            return obj;
        }
        if (i2 != 1 && i2 != 2) {
            return obj;
        }
        if (azVar == null && !(fc0Var instanceof cf)) {
            return obj;
        }
        if (fc0Var instanceof cf) {
            cfVar = (cf) fc0Var;
        } else {
            cfVar = null;
        }
        return new si(obj, cfVar, azVar, (CancellationException) null, 16);
    }

    public static void w(fc0 fc0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + fc0Var + ", already has " + obj).toString());
    }

    public final ce B(Object obj, az azVar) {
        ce ceVar = r21.a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof fc0) {
                Object A = A((fc0) obj2, obj, this.e, azVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, A)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!v()) {
                    p();
                }
                return ceVar;
            }
            return null;
        }
    }

    @Override // defpackage.a01
    public final void a(mm0 mm0Var, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = h;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                c.o("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        u(mm0Var);
    }

    @Override // defpackage.xq
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof fc0)) {
                if (!(obj instanceof ui)) {
                    if (obj instanceof si) {
                        si siVar = (si) obj;
                        if (siVar.e == null) {
                            si a = si.a(siVar, null, cancellationException, 15);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    cancellationException2 = cancellationException;
                                }
                            }
                            cf cfVar = siVar.b;
                            if (cfVar != null) {
                                k(cfVar, cancellationException);
                            }
                            az azVar = siVar.c;
                            if (azVar != null) {
                                l(azVar, cancellationException, siVar.a);
                                return;
                            }
                            return;
                        }
                        c.o("Must be called at most once");
                        return;
                    }
                    cancellationException2 = cancellationException;
                    si siVar2 = new si(obj, (cf) null, (az) null, cancellationException2, 14);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, siVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    return;
                    cancellationException = cancellationException2;
                } else {
                    return;
                }
            } else {
                c.o("Not completed");
                return;
            }
        }
    }

    @Override // defpackage.nl
    public final nl c() {
        qk qkVar = this.f;
        if (qkVar instanceof nl) {
            return (nl) qkVar;
        }
        return null;
    }

    @Override // defpackage.qk
    public final dl d() {
        return this.g;
    }

    @Override // defpackage.qk
    public final void e(Object obj) {
        Throwable a = tj0.a(obj);
        if (a != null) {
            obj = new ui(a, false);
        }
        y(obj, this.e, null);
    }

    @Override // defpackage.xq
    public final qk f() {
        return this.f;
    }

    @Override // defpackage.xq
    public final Throwable g(Object obj) {
        Throwable g = super.g(obj);
        if (g != null) {
            return g;
        }
        return null;
    }

    @Override // defpackage.xq
    public final Object h(Object obj) {
        if (obj instanceof si) {
            return ((si) obj).a;
        }
        return obj;
    }

    @Override // defpackage.xq
    public final Object j() {
        return i.get(this);
    }

    public final void k(cf cfVar, Throwable th) {
        try {
            switch (cfVar.a) {
                case 0:
                    ((x00) cfVar.b).h(th);
                    return;
                default:
                    ((dr) cfVar.b).a();
                    return;
            }
        } catch (Throwable th2) {
            f20.J(this.g, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(az azVar, Throwable th, Object obj) {
        dl dlVar = this.g;
        try {
            azVar.f(th, obj, dlVar);
        } catch (Throwable th2) {
            f20.J(dlVar, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(mm0 mm0Var, Throwable th) {
        dl dlVar = this.g;
        int i2 = h.get(this) & 536870911;
        if (i2 != 536870911) {
            try {
                mm0Var.g(i2, dlVar);
                return;
            } catch (Throwable th2) {
                f20.J(dlVar, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        c.o("The index for Segment.onCancellation(..) is broken");
    }

    public final void n(Throwable th) {
        boolean z;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof fc0)) {
                return;
            }
            if (!(obj instanceof cf) && !(obj instanceof mm0)) {
                z = false;
            } else {
                z = true;
            }
            jf jfVar = new jf(this, th, z);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, jfVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            fc0 fc0Var = (fc0) obj;
            if (fc0Var instanceof cf) {
                k((cf) obj, th);
            } else if (fc0Var instanceof mm0) {
                m((mm0) obj, th);
            }
            if (!v()) {
                p();
            }
            q(this.e);
            return;
        }
    }

    public final void o() {
        q(this.e);
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        dr drVar = (dr) atomicReferenceFieldUpdater.get(this);
        if (drVar == null) {
            return;
        }
        drVar.a();
        atomicReferenceFieldUpdater.set(this, dc0.c);
    }

    public final void q(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        boolean z;
        boolean z2;
        do {
            atomicIntegerFieldUpdater = h;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 == 1) {
                    boolean z3 = false;
                    if (i2 == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    qk qkVar = this.f;
                    if (!z && (qkVar instanceof vq)) {
                        if (i2 != 1 && i2 != 2) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        int i5 = this.e;
                        if (i5 == 1 || i5 == 2) {
                            z3 = true;
                        }
                        if (z2 == z3) {
                            vq vqVar = (vq) qkVar;
                            gl glVar = vqVar.f;
                            dl d = vqVar.g.d();
                            if (glVar.c(d)) {
                                glVar.b(d, this);
                                return;
                            }
                            pu a = tr0.a();
                            if (a.e >= 4294967296L) {
                                h8 h8Var = a.g;
                                if (h8Var == null) {
                                    h8Var = new h8();
                                    a.g = h8Var;
                                }
                                h8Var.addLast(this);
                                return;
                            }
                            a.n(true);
                            try {
                                r21.H(this, qkVar, true);
                                do {
                                } while (a.q());
                            } finally {
                                try {
                                    return;
                                } finally {
                                }
                            }
                            return;
                        }
                    }
                    r21.H(this, qkVar, z);
                    return;
                }
                c.o("Already resumed");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        q30 q30Var;
        boolean v = v();
        do {
            atomicIntegerFieldUpdater = h;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 2) {
                    if (v) {
                        x();
                    }
                    Object obj = i.get(this);
                    if (!(obj instanceof ui)) {
                        int i4 = this.e;
                        if ((i4 == 1 || i4 == 2) && (q30Var = (q30) this.g.h(os.e)) != null && !q30Var.D()) {
                            CancellationException v2 = q30Var.v();
                            b(v2);
                            throw v2;
                        }
                        return h(obj);
                    }
                    throw ((ui) obj).a;
                }
                c.o("Already suspended");
                return null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((dr) j.get(this)) == null) {
            t();
        }
        if (v) {
            x();
        }
        return ml.c;
    }

    public final void s() {
        dr t = t();
        if (t != null && !(i.get(this) instanceof fc0)) {
            t.a();
            j.set(this, dc0.c);
        }
    }

    public final dr t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        q30 q30Var = (q30) this.g.h(os.e);
        if (q30Var == null) {
            return null;
        }
        dr A = mn.A(q30Var, true, new ug(0, this));
        do {
            atomicReferenceFieldUpdater = j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, A)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return A;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(mn.S(this.f));
        sb.append("){");
        Object obj = i.get(this);
        if (obj instanceof fc0) {
            str = "Active";
        } else if (obj instanceof jf) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(mn.r(this));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a0, code lost:
    
        w(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(defpackage.fc0 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ff.i
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof defpackage.w2
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto L97
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof defpackage.cf
            r3 = 0
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof defpackage.mm0
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof defpackage.ui
            if (r1 == 0) goto L4d
            r0 = r2
            ui r0 = (defpackage.ui) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.ui.b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L49
            boolean r1 = r2 instanceof defpackage.jf
            if (r1 == 0) goto L97
            java.lang.Throwable r0 = r0.a
            boolean r1 = r8 instanceof defpackage.cf
            if (r1 == 0) goto L43
            cf r8 = (defpackage.cf) r8
            r7.k(r8, r0)
            return
        L43:
            mm0 r8 = (defpackage.mm0) r8
            r7.m(r8, r0)
            return
        L49:
            w(r8, r2)
            throw r3
        L4d:
            boolean r1 = r2 instanceof defpackage.si
            if (r1 == 0) goto L80
            r1 = r2
            si r1 = (defpackage.si) r1
            cf r4 = r1.b
            if (r4 != 0) goto L7c
            boolean r4 = r8 instanceof defpackage.mm0
            if (r4 == 0) goto L5d
            goto L97
        L5d:
            r4 = r8
            cf r4 = (defpackage.cf) r4
            java.lang.Throwable r5 = r1.e
            if (r5 == 0) goto L68
            r7.k(r4, r5)
            return
        L68:
            r5 = 29
            si r1 = defpackage.si.a(r1, r4, r3, r5)
        L6e:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L75
            goto L97
        L75:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L6e
            goto L0
        L7c:
            w(r8, r2)
            throw r3
        L80:
            boolean r1 = r8 instanceof defpackage.mm0
            if (r1 == 0) goto L85
            goto L97
        L85:
            r3 = r8
            cf r3 = (defpackage.cf) r3
            si r1 = new si
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L91:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L98
        L97:
            return
        L98:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L91
            goto L0
        La0:
            w(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff.u(fc0):void");
    }

    public final boolean v() {
        if (this.e == 2) {
            qk qkVar = this.f;
            qkVar.getClass();
            if (vq.j.get((vq) qkVar) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void x() {
        vq vqVar;
        qk qkVar = this.f;
        Throwable th = null;
        if (qkVar instanceof vq) {
            vqVar = (vq) qkVar;
        } else {
            vqVar = null;
        }
        if (vqVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vq.j;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(vqVar);
                ce ceVar = mn.c;
                if (obj != ceVar) {
                    if (!(obj instanceof Throwable)) {
                        c.t(obj, "Inconsistent state ");
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(vqVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(vqVar) != obj) {
                            c.k("Failed requirement.");
                            return;
                        }
                    }
                    th = (Throwable) obj;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(vqVar, ceVar, this)) {
                    if (atomicReferenceFieldUpdater.get(vqVar) != ceVar) {
                        break;
                    }
                }
            }
            if (th != null) {
                p();
                n(th);
            }
        }
    }

    public final void y(Object obj, int i2, az azVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof fc0) {
                Object A = A((fc0) obj2, obj, i2, azVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, A)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!v()) {
                    p();
                }
                q(i2);
                return;
            }
            if (obj2 instanceof jf) {
                jf jfVar = (jf) obj2;
                if (jf.c.compareAndSet(jfVar, 0, 1)) {
                    if (azVar != null) {
                        l(azVar, jfVar.a, obj);
                        return;
                    }
                    return;
                }
            }
            c.t(obj, "Already resumed, but proposed with update ");
            return;
        }
    }

    public final void z(gl glVar) {
        vq vqVar;
        gl glVar2;
        int i2;
        qk qkVar = this.f;
        if (qkVar instanceof vq) {
            vqVar = (vq) qkVar;
        } else {
            vqVar = null;
        }
        if (vqVar != null) {
            glVar2 = vqVar.f;
        } else {
            glVar2 = null;
        }
        if (glVar2 == glVar) {
            i2 = 4;
        } else {
            i2 = this.e;
        }
        y(nw0.a, i2, null);
    }
}
