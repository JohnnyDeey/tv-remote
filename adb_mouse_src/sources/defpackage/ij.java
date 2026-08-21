package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ij extends he {
    public final fe m;

    public ij(int i, fe feVar) {
        super(i);
        String str;
        String P;
        this.m = feVar;
        if (feVar != fe.c) {
            if (i >= 1) {
                return;
            }
            f40.b(qo0.n("Buffered channel capacity must be at least 1, but ", i, " was specified"));
            throw null;
        }
        StringBuilder sb = new StringBuilder("This implementation does not support suspension for senders, use ");
        li0.a.getClass();
        if (!he.class.isAnonymousClass()) {
            if (he.class.isLocalClass()) {
                str = he.class.getSimpleName();
                Method enclosingMethod = he.class.getEnclosingMethod();
                if (enclosingMethod == null) {
                    Constructor<?> enclosingConstructor = he.class.getEnclosingConstructor();
                    if (enclosingConstructor == null) {
                        int indexOf = str.indexOf(36, 0);
                        if (indexOf != -1) {
                            str = str.substring(indexOf + 1, str.length());
                        }
                    } else {
                        str = fq0.O(str, enclosingConstructor.getName() + '$');
                    }
                } else {
                    str = fq0.O(str, enclosingMethod.getName() + '$');
                }
            } else if (he.class.isArray()) {
                Class<?> componentType = he.class.getComponentType();
                if (componentType.isPrimitive() && (P = mn.P(componentType.getName())) != null) {
                    str = P.concat("Array");
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "Array";
                }
            } else {
                str = mn.P(he.class.getName());
                if (str == null) {
                    str = he.class.getSimpleName();
                }
            }
        } else {
            str = null;
        }
        f40.b(qo0.s(sb, str, " instead"));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            fe r1 = r15.m
            fe r2 = defpackage.fe.e
            nw0 r8 = defpackage.nw0.a
            if (r1 != r2) goto L17
            java.lang.Object r0 = super.i(r16)
            boolean r1 = r0 instanceof defpackage.og
            if (r1 == 0) goto L16
            boolean r1 = r0 instanceof defpackage.ng
            if (r1 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r0
        L17:
            ce r6 = defpackage.je.d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.he.h
            java.lang.Object r1 = r1.get(r15)
            pg r1 = (defpackage.pg) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.he.d
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.s(r2, r7)
            int r9 = defpackage.je.b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            pg r2 = defpackage.he.b(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r0 = r15.o()
            ng r1 = new ng
            r1.<init>(r0)
            return r1
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = defpackage.he.d(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb5
            r3 = 1
            if (r12 == r3) goto Lb4
            r3 = 2
            r13 = 0
            if (r12 == r3) goto L8f
            r2 = 3
            if (r12 == r2) goto L89
            r2 = 4
            if (r12 == r2) goto L72
            r2 = 5
            if (r12 == r2) goto L6e
            goto L21
        L6e:
            r1.a()
            goto L21
        L72:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.he.e
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7f
            r1.a()
        L7f:
            java.lang.Throwable r0 = r15.o()
            ng r1 = new ng
            r1.<init>(r0)
            return r1
        L89:
            java.lang.String r0 = "unexpected"
            defpackage.c.o(r0)
            return r13
        L8f:
            if (r7 == 0) goto L9e
            r1.h()
            java.lang.Throwable r0 = r15.o()
            ng r1 = new ng
            r1.<init>(r0)
            return r1
        L9e:
            boolean r3 = r6 instanceof defpackage.a01
            if (r3 == 0) goto La5
            r13 = r6
            a01 r13 = (defpackage.a01) r13
        La5:
            if (r13 == 0) goto Lac
            int r12 = r2 + r9
            r13.a(r1, r12)
        Lac:
            long r3 = r1.c
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.k(r3)
        Lb4:
            return r8
        Lb5:
            r1.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij.C(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // defpackage.he, defpackage.um0
    public final Object a(qk qkVar, Object obj) {
        if (!(C(obj, true) instanceof ng)) {
            return nw0.a;
        }
        throw o();
    }

    @Override // defpackage.he, defpackage.um0
    public final Object i(Object obj) {
        return C(obj, false);
    }

    @Override // defpackage.he
    public final boolean t() {
        if (this.m == fe.d) {
            return true;
        }
        return false;
    }
}
