package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class lg implements xv {
    public final /* synthetic */ q30 c;
    public final /* synthetic */ rm0 d;
    public final /* synthetic */ hf0 e;
    public final /* synthetic */ cw f;

    public lg(q30 q30Var, rm0 rm0Var, hf0 hf0Var, cw cwVar) {
        this.c = q30Var;
        this.d = rm0Var;
        this.e = hf0Var;
        this.f = cwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0075, code lost:
    
        r0.y(r3, r0.e, r8.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
    
        if (r8 == r5) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.xv
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.vv r7, defpackage.qk r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.kg
            if (r0 == 0) goto L13
            r0 = r8
            kg r0 = (defpackage.kg) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            kg r0 = new kg
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.h
            int r1 = r0.j
            r2 = 0
            nw0 r3 = defpackage.nw0.a
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 != r4) goto L2c
            vv r7 = r0.g
            lg r6 = r0.f
            defpackage.hi0.p(r8)
            goto L90
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.o(r6)
            return r2
        L32:
            defpackage.hi0.p(r8)
            q30 r8 = r6.c
            if (r8 == 0) goto L45
            boolean r1 = r8.D()
            if (r1 == 0) goto L40
            goto L45
        L40:
            java.util.concurrent.CancellationException r6 = r8.v()
            throw r6
        L45:
            rm0 r8 = r6.d
            int r1 = r8.a
            r0.f = r6
            r0.g = r7
            r0.j = r4
        L4f:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.qm0.g
            int r4 = r4.getAndDecrement(r8)
            if (r4 > r1) goto L4f
            ml r5 = defpackage.ml.c
            if (r4 <= 0) goto L5d
        L5b:
            r8 = r3
            goto L8d
        L5d:
            qk r0 = defpackage.wv0.G(r0)
            ff r0 = defpackage.mn.s(r0)
            boolean r4 = r8.a(r0)     // Catch: java.lang.Throwable -> La0
            if (r4 != 0) goto L83
        L6b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.qm0.g     // Catch: java.lang.Throwable -> La0
            int r4 = r4.getAndDecrement(r8)     // Catch: java.lang.Throwable -> La0
            if (r4 > r1) goto L6b
            if (r4 <= 0) goto L7d
            nm0 r8 = r8.b     // Catch: java.lang.Throwable -> La0
            int r1 = r0.e     // Catch: java.lang.Throwable -> La0
            r0.y(r3, r1, r8)     // Catch: java.lang.Throwable -> La0
            goto L83
        L7d:
            boolean r4 = r8.a(r0)     // Catch: java.lang.Throwable -> La0
            if (r4 == 0) goto L6b
        L83:
            java.lang.Object r8 = r0.r()
            if (r8 != r5) goto L8a
            goto L8b
        L8a:
            r8 = r3
        L8b:
            if (r8 != r5) goto L5b
        L8d:
            if (r8 != r5) goto L90
            return r5
        L90:
            hf0 r8 = r6.e
            ig r0 = new ig
            cw r1 = r6.f
            rm0 r6 = r6.d
            r0.<init>(r7, r1, r6, r2)
            r6 = 3
            defpackage.r21.D(r8, r2, r0, r6)
            return r3
        La0:
            r6 = move-exception
            r0.x()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lg.i(vv, qk):java.lang.Object");
    }
}
