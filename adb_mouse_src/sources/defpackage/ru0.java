package defpackage;

import java.lang.reflect.Type;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ru0 extends pu0 {
    public final k00 a;
    public final pu0 b;
    public final Type c;

    public ru0(k00 k00Var, pu0 pu0Var, Type type) {
        this.a = k00Var;
        this.b = pu0Var;
        this.c = type;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if ((r0 instanceof defpackage.ti0) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // defpackage.pu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.g40 r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.lang.reflect.Type r0 = r3.c
            if (r5 == 0) goto L11
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto Lc
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L11
        Lc:
            java.lang.Class r1 = r5.getClass()
            goto L12
        L11:
            r1 = r0
        L12:
            pu0 r2 = r3.b
            if (r1 == r0) goto L3d
            xv0 r0 = new xv0
            r0.<init>(r1)
            k00 r3 = r3.a
            pu0 r3 = r3.b(r0)
            boolean r0 = r3 instanceof defpackage.ti0
            if (r0 != 0) goto L26
            goto L3c
        L26:
            r0 = r2
        L27:
            boolean r1 = r0 instanceof defpackage.zm0
            if (r1 == 0) goto L37
            r1 = r0
            zm0 r1 = (defpackage.zm0) r1
            pu0 r1 = r1.c()
            if (r1 != r0) goto L35
            goto L37
        L35:
            r0 = r1
            goto L27
        L37:
            boolean r0 = r0 instanceof defpackage.ti0
            if (r0 != 0) goto L3c
            goto L3d
        L3c:
            r2 = r3
        L3d:
            r2.b(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ru0.b(g40, java.lang.Object):void");
    }
}
