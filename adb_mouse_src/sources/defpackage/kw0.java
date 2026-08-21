package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class kw0 extends cm0 {
    public final ThreadLocal g;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kw0(defpackage.dl r3, defpackage.n20 r4) {
        /*
            r2 = this;
            lw0 r0 = defpackage.lw0.c
            bl r1 = r3.h(r0)
            if (r1 != 0) goto Ld
            dl r0 = r3.g(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.g = r0
            dl r4 = r4.d
            r4.getClass()
            g00 r0 = defpackage.g00.e
            bl r4 = r4.h(r0)
            boolean r4 = r4 instanceof defpackage.gl
            if (r4 != 0) goto L32
            r4 = 0
            java.lang.Object r4 = defpackage.wv0.c0(r3, r4)
            defpackage.wv0.W(r3, r4)
            r2.V(r3, r4)
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw0.<init>(dl, n20):void");
    }

    public final boolean U() {
        boolean z;
        if (this.threadLocalIsSet && this.g.get() == null) {
            z = true;
        } else {
            z = false;
        }
        this.g.remove();
        return !z;
    }

    public final void V(dl dlVar, Object obj) {
        this.threadLocalIsSet = true;
        this.g.set(new td0(dlVar, obj));
    }

    @Override // defpackage.cm0, defpackage.q30
    public final void m(Object obj) {
        if (this.threadLocalIsSet) {
            td0 td0Var = (td0) this.g.get();
            if (td0Var != null) {
                wv0.W((dl) td0Var.c, td0Var.d);
            }
            this.g.remove();
        }
        Object d0 = k20.d0(obj);
        rk rkVar = this.f;
        dl d = rkVar.d();
        kw0 kw0Var = null;
        Object c0 = wv0.c0(d, null);
        if (c0 != wv0.n) {
            kw0Var = r21.O(rkVar, d, c0);
        }
        try {
            this.f.e(d0);
            if (kw0Var != null && !kw0Var.U()) {
                return;
            }
            wv0.W(d, c0);
        } catch (Throwable th) {
            if (kw0Var == null || kw0Var.U()) {
                wv0.W(d, c0);
            }
            throw th;
        }
    }
}
