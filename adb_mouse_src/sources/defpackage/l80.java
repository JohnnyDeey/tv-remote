package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class l80 implements zy {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l80(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        if (r1 == null) goto L19;
     */
    @Override // defpackage.zy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r3, java.lang.Object r4) {
        /*
            r2 = this;
            int r0 = r2.c
            java.lang.Object r2 = r2.d
            switch(r0) {
                case 0: goto L78;
                default: goto L7;
            }
        L7:
            ll0 r2 = (defpackage.ll0) r2
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r0 = r3.intValue()
            bl r4 = (defpackage.bl) r4
            cl r3 = r4.getKey()
            dl r2 = r2.g
            bl r2 = r2.h(r3)
            os r1 = defpackage.os.e
            if (r3 == r1) goto L27
            if (r4 == r2) goto L24
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L3c
        L24:
            int r0 = r0 + 1
            goto L3c
        L27:
            r1 = r2
            q30 r1 = (defpackage.q30) r1
            q30 r4 = (defpackage.q30) r4
        L2c:
            r2 = 0
            if (r4 != 0) goto L31
            r4 = r2
            goto L38
        L31:
            if (r4 != r1) goto L34
            goto L38
        L34:
            boolean r3 = r4 instanceof defpackage.cm0
            if (r3 != 0) goto L66
        L38:
            if (r4 != r1) goto L41
            if (r1 != 0) goto L24
        L3c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L41:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            r3.<init>(r0)
            r3.append(r4)
            java.lang.String r4 = ", expected child of "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L66:
            cm0 r4 = (defpackage.cm0) r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.q30.d
            java.lang.Object r3 = r3.get(r4)
            vg r3 = (defpackage.vg) r3
            if (r3 == 0) goto L76
            q30 r2 = r3.getParent()
        L76:
            r4 = r2
            goto L2c
        L78:
            svarzee.android.apps.adb_mouse.MainActivity r2 = (svarzee.android.apps.adb_mouse.MainActivity) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            int r4 = svarzee.android.apps.adb_mouse.MainActivity.E
            r3.getClass()
            x2 r3 = new x2
            r4 = 9
            r3.<init>(r4, r2)
            r2.runOnUiThread(r3)
            nw0 r2 = defpackage.nw0.a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l80.g(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
