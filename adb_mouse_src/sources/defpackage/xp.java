package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class xp extends qq0 implements zy {
    public final /* synthetic */ int g = 0;
    public int h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp(String str, int i, qk qkVar) {
        super(qkVar);
        this.i = str;
        this.h = i;
    }

    @Override // defpackage.zy
    public final Object g(Object obj, Object obj2) {
        int i = this.g;
        nw0 nw0Var = nw0.a;
        ll llVar = (ll) obj;
        qk qkVar = (qk) obj2;
        switch (i) {
            case 0:
                ((xp) j(qkVar, llVar)).l(nw0Var);
                return ml.c;
            default:
                return ((xp) j(qkVar, llVar)).l(nw0Var);
        }
    }

    @Override // defpackage.rk
    public final qk j(qk qkVar, Object obj) {
        switch (this.g) {
            case 0:
                return new xp((cq) this.i, qkVar);
            default:
                return new xp((String) this.i, this.h, qkVar);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, y3] */
    @Override // defpackage.rk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.g
            java.lang.Object r1 = r6.i
            r2 = 0
            switch(r0) {
                case 0: goto L3b;
                default: goto L8;
            }
        L8:
            java.lang.String r1 = (java.lang.String) r1
            defpackage.hi0.p(r7)
            y3 r7 = new y3     // Catch: java.lang.Exception -> L23
            r7.<init>()     // Catch: java.lang.Exception -> L23
            int r6 = r6.h     // Catch: java.lang.Exception -> L23
            r0 = 400(0x190, float:5.6E-43)
            r3 = 15000(0x3a98, float:2.102E-41)
            r7.e(r1, r6, r0, r3)     // Catch: java.lang.Throwable -> L25
            r7.c()     // Catch: java.lang.Throwable -> L25
            r7.close()     // Catch: java.lang.Exception -> L23
            r2 = r1
            goto L3a
        L23:
            r6 = move-exception
            goto L31
        L25:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L27
        L27:
            r0 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L2c
            goto L30
        L2c:
            r7 = move-exception
            defpackage.mn.a(r6, r7)     // Catch: java.lang.Exception -> L23
        L30:
            throw r0     // Catch: java.lang.Exception -> L23
        L31:
            java.lang.String r7 = "ERR"
            java.lang.String r6 = defpackage.mn.Q(r6)
            android.util.Log.e(r7, r6)
        L3a:
            return r2
        L3b:
            int r0 = r6.h
            r3 = 1
            if (r0 == 0) goto L4c
            if (r0 != r3) goto L46
            defpackage.hi0.p(r7)
            goto L83
        L46:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.o(r6)
            goto L82
        L4c:
            defpackage.hi0.p(r7)
        L4f:
            r6.h = r3
            ff r7 = new ff
            qk r0 = defpackage.wv0.G(r6)
            r7.<init>(r0, r3)
            r7.s()
            dl r0 = r7.g
            g00 r4 = defpackage.g00.e
            bl r0 = r0.h(r4)
            boolean r4 = r0 instanceof defpackage.wo
            if (r4 == 0) goto L6c
            wo r0 = (defpackage.wo) r0
            goto L6d
        L6c:
            r0 = r2
        L6d:
            if (r0 != 0) goto L71
            wo r0 = defpackage.sn.a
        L71:
            r0.a(r7)
            java.lang.Object r7 = r7.r()
            ml r0 = defpackage.ml.c
            if (r7 != r0) goto L7d
            goto L7f
        L7d:
            nw0 r7 = defpackage.nw0.a
        L7f:
            if (r7 != r0) goto L83
            r2 = r0
        L82:
            return r2
        L83:
            r7 = r1
            cq r7 = (defpackage.cq) r7
            r7.getClass()
            he r7 = r7.a
            r7.getClass()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.he.d
            long r4 = r0.get(r7)
            boolean r4 = r7.s(r4, r3)
            if (r4 == 0) goto L9b
            goto La1
        L9b:
            boolean r4 = r7.q()
            if (r4 == 0) goto La3
        La1:
            r0 = 0
            goto Lac
        La3:
            long r4 = r0.get(r7)
            boolean r0 = r7.s(r4, r3)
            r0 = r0 ^ r3
        Lac:
            if (r0 == 0) goto L4f
            tp r0 = defpackage.tp.a
            r7.i(r0)
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp(cq cqVar, qk qkVar) {
        super(qkVar);
        this.i = cqVar;
    }
}
