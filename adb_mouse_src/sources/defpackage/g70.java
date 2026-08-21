package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class g70 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(g70.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(g70.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(g70.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(g70 g70Var, int i) {
        while (true) {
            g70 f = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            if (f == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    f = (g70) obj;
                    if (!f.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f);
                }
            }
            if (f instanceof k60) {
                if ((((k60) f).f & i) == 0 && f.e(g70Var, i)) {
                    return true;
                }
                return false;
            }
            atomicReferenceFieldUpdater.set(g70Var, f);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = c;
            atomicReferenceFieldUpdater2.set(g70Var, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(f, this, g70Var)) {
                if (atomicReferenceFieldUpdater2.get(f) != this) {
                    break;
                }
            }
            g70Var.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((defpackage.zi0) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x001c, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.g70 f() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.g70.d
            java.lang.Object r1 = r0.get(r9)
            g70 r1 = (defpackage.g70) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.g70.c
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            goto L1c
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
        L1c:
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.i()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof defpackage.zi0
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            zi0 r6 = (defpackage.zi0) r6
            g70 r6 = r6.a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            g70 r3 = (defpackage.g70) r3
            goto Lb
        L4b:
            r6.getClass()
            r4 = r6
            g70 r4 = (defpackage.g70) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g70.f():g70");
    }

    public final void g(g70 g70Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            g70 g70Var2 = (g70) atomicReferenceFieldUpdater.get(g70Var);
            if (c.get(this) != g70Var) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(g70Var, g70Var2, this)) {
                if (atomicReferenceFieldUpdater.get(g70Var) != g70Var2) {
                    break;
                }
            }
            if (i()) {
                g70Var.f();
                return;
            }
            return;
        }
    }

    public final g70 h() {
        zi0 zi0Var;
        Object obj = c.get(this);
        if (obj instanceof zi0) {
            zi0Var = (zi0) obj;
        } else {
            zi0Var = null;
        }
        if (zi0Var != null) {
            return zi0Var.a;
        }
        obj.getClass();
        return (g70) obj;
    }

    public boolean i() {
        return c.get(this) instanceof zi0;
    }

    public String toString() {
        return new f70(this) + '@' + mn.r(this);
    }
}
