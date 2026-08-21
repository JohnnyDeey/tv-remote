package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class xq extends yq0 {
    public int e;

    public xq(int i) {
        super(0L, false);
        this.e = i;
    }

    public abstract qk f();

    public Throwable g(Object obj) {
        ui uiVar;
        if (obj instanceof ui) {
            uiVar = (ui) obj;
        } else {
            uiVar = null;
        }
        if (uiVar == null) {
            return null;
        }
        return uiVar.a;
    }

    public final void i(Throwable th) {
        f20.J(f().d(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (defpackage.q30) r5.h(defpackage.os.e);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            qk r0 = r11.f()     // Catch: java.lang.Throwable -> L1f
            r0.getClass()     // Catch: java.lang.Throwable -> L1f
            vq r0 = (defpackage.vq) r0     // Catch: java.lang.Throwable -> L1f
            rk r1 = r0.g     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.i     // Catch: java.lang.Throwable -> L1f
            dl r2 = r1.d()     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = defpackage.wv0.c0(r2, r0)     // Catch: java.lang.Throwable -> L1f
            ce r3 = defpackage.wv0.n     // Catch: java.lang.Throwable -> L1f
            r4 = 0
            if (r0 == r3) goto L22
            kw0 r3 = defpackage.r21.O(r1, r2, r0)     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r0 = move-exception
            goto L8c
        L22:
            r3 = r4
        L23:
            dl r5 = r1.d()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r6 = r11.j()     // Catch: java.lang.Throwable -> L46
            java.lang.Throwable r7 = r11.g(r6)     // Catch: java.lang.Throwable -> L46
            if (r7 != 0) goto L48
            int r8 = r11.e     // Catch: java.lang.Throwable -> L46
            r9 = 1
            if (r8 == r9) goto L3b
            r10 = 2
            if (r8 != r10) goto L3a
            goto L3b
        L3a:
            r9 = 0
        L3b:
            if (r9 == 0) goto L48
            os r4 = defpackage.os.e     // Catch: java.lang.Throwable -> L46
            bl r4 = r5.h(r4)     // Catch: java.lang.Throwable -> L46
            q30 r4 = (defpackage.q30) r4     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r1 = move-exception
            goto L80
        L48:
            if (r4 == 0) goto L60
            boolean r5 = r4.D()     // Catch: java.lang.Throwable -> L46
            if (r5 != 0) goto L60
            java.util.concurrent.CancellationException r4 = r4.v()     // Catch: java.lang.Throwable -> L46
            r11.b(r4)     // Catch: java.lang.Throwable -> L46
            sj0 r5 = new sj0     // Catch: java.lang.Throwable -> L46
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L46
            r1.e(r5)     // Catch: java.lang.Throwable -> L46
            goto L72
        L60:
            if (r7 == 0) goto L6b
            sj0 r4 = new sj0     // Catch: java.lang.Throwable -> L46
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L46
            r1.e(r4)     // Catch: java.lang.Throwable -> L46
            goto L72
        L6b:
            java.lang.Object r4 = r11.h(r6)     // Catch: java.lang.Throwable -> L46
            r1.e(r4)     // Catch: java.lang.Throwable -> L46
        L72:
            if (r3 == 0) goto L7c
            boolean r1 = r3.U()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L7b
            goto L7c
        L7b:
            return
        L7c:
            defpackage.wv0.W(r2, r0)     // Catch: java.lang.Throwable -> L1f
            return
        L80:
            if (r3 == 0) goto L88
            boolean r3 = r3.U()     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L8b
        L88:
            defpackage.wv0.W(r2, r0)     // Catch: java.lang.Throwable -> L1f
        L8b:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L8c:
            r11.i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xq.run():void");
    }

    public void b(CancellationException cancellationException) {
    }

    public Object h(Object obj) {
        return obj;
    }
}
