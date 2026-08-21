package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class su extends pu0 {
    public volatile pu0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ k00 c;
    public final /* synthetic */ xv0 d;
    public final /* synthetic */ tu e;

    public su(tu tuVar, boolean z, k00 k00Var, xv0 xv0Var) {
        this.e = tuVar;
        this.b = z;
        this.c = k00Var;
        this.d = xv0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005e, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082 A[SYNTHETIC] */
    @Override // defpackage.pu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.g40 r11, java.lang.Object r12) {
        /*
            r10 = this;
            boolean r0 = r10.b
            if (r0 == 0) goto L8
            r11.i()
            return
        L8:
            pu0 r0 = r10.a
            if (r0 != 0) goto L91
            k00 r0 = r10.c
            tu r1 = r10.e
            xv0 r2 = r10.d
            t30 r3 = r0.d
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap r4 = r3.d
            s30 r5 = defpackage.t30.e
            r6 = 1
            if (r1 != r5) goto L1f
            goto L60
        L1f:
            java.lang.Class r5 = r2.a
            java.lang.Object r7 = r4.get(r5)
            qu0 r7 = (defpackage.qu0) r7
            if (r7 == 0) goto L2c
            if (r7 != r1) goto L61
            goto L60
        L2c:
            java.lang.Class<r30> r7 = defpackage.r30.class
            java.lang.annotation.Annotation r7 = r5.getAnnotation(r7)
            r30 r7 = (defpackage.r30) r7
            if (r7 != 0) goto L37
            goto L61
        L37:
            java.lang.Class r7 = r7.value()
            java.lang.Class<qu0> r8 = defpackage.qu0.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 != 0) goto L44
            goto L61
        L44:
            g00 r8 = r3.c
            xv0 r9 = new xv0
            r9.<init>(r7)
            uc0 r7 = r8.e(r9, r6)
            java.lang.Object r7 = r7.b()
            qu0 r7 = (defpackage.qu0) r7
            java.lang.Object r4 = r4.putIfAbsent(r5, r7)
            qu0 r4 = (defpackage.qu0) r4
            if (r4 == 0) goto L5e
            r7 = r4
        L5e:
            if (r7 != r1) goto L61
        L60:
            r1 = r3
        L61:
            java.util.List r3 = r0.e
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L68:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L82
            java.lang.Object r5 = r3.next()
            qu0 r5 = (defpackage.qu0) r5
            if (r4 != 0) goto L7a
            if (r5 != r1) goto L68
            r4 = r6
            goto L68
        L7a:
            pu0 r5 = r5.a(r0, r2)
            if (r5 == 0) goto L68
            r0 = r5
            goto L88
        L82:
            if (r4 != 0) goto L8b
            pu0 r0 = r0.b(r2)
        L88:
            r10.a = r0
            goto L91
        L8b:
            java.lang.String r10 = "GSON cannot serialize or deserialize "
            defpackage.c.r(r2, r10)
            return
        L91:
            r0.b(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.su.b(g40, java.lang.Object):void");
    }
}
