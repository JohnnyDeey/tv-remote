package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class mj {
    public int b;
    public boolean c;
    public final ak d;
    public final int e;
    public mj f;
    public ro0 i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public mj(ak akVar, int i) {
        this.d = akVar;
        this.e = i;
    }

    public final void a(mj mjVar, int i) {
        b(mjVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(mj mjVar, int i, int i2, boolean z) {
        if (mjVar == null) {
            j();
            return true;
        }
        if (!z && !i(mjVar)) {
            return false;
        }
        this.f = mjVar;
        if (mjVar.a == null) {
            mjVar.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, c01 c01Var, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                mn.o(((mj) it.next()).d, i, arrayList, c01Var);
            }
        }
    }

    public final int d() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }

    public final int e() {
        mj mjVar;
        if (this.d.g0 == 8) {
            return 0;
        }
        int i = this.h;
        if (i != Integer.MIN_VALUE && (mjVar = this.f) != null && mjVar.d.g0 == 8) {
            return i;
        }
        return this.g;
    }

    public final mj f() {
        int i = this.e;
        int C = qo0.C(i);
        ak akVar = this.d;
        switch (C) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return akVar.K;
            case 2:
                return akVar.L;
            case 3:
                return akVar.I;
            case 4:
                return akVar.J;
            default:
                throw new AssertionError(qo0.B(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((mj) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(defpackage.mj r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L5
            goto L65
        L5:
            ak r1 = r10.d
            int r10 = r10.e
            r2 = 6
            int r3 = r9.e
            r4 = 1
            if (r10 != r3) goto L1c
            if (r3 != r2) goto L63
            boolean r10 = r1.E
            if (r10 == 0) goto L65
            ak r9 = r9.d
            boolean r9 = r9.E
            if (r9 != 0) goto L63
            goto L65
        L1c:
            int r9 = defpackage.qo0.C(r3)
            r5 = 4
            r6 = 2
            r7 = 9
            r8 = 8
            switch(r9) {
                case 0: goto L65;
                case 1: goto L53;
                case 2: goto L3f;
                case 3: goto L53;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L33;
                case 7: goto L65;
                case 8: goto L65;
                default: goto L29;
            }
        L29:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r10 = defpackage.qo0.B(r3)
            r9.<init>(r10)
            throw r9
        L33:
            if (r10 == r2) goto L65
            if (r10 == r8) goto L65
            if (r10 == r7) goto L65
            goto L63
        L3a:
            if (r10 == r6) goto L65
            if (r10 != r5) goto L63
            goto L65
        L3f:
            r9 = 3
            if (r10 == r9) goto L48
            r9 = 5
            if (r10 != r9) goto L46
            goto L48
        L46:
            r9 = r0
            goto L49
        L48:
            r9 = r4
        L49:
            boolean r1 = r1 instanceof defpackage.p00
            if (r1 == 0) goto L52
            if (r9 != 0) goto L63
            if (r10 != r7) goto L65
            goto L63
        L52:
            return r9
        L53:
            if (r10 == r6) goto L5a
            if (r10 != r5) goto L58
            goto L5a
        L58:
            r9 = r0
            goto L5b
        L5a:
            r9 = r4
        L5b:
            boolean r1 = r1 instanceof defpackage.p00
            if (r1 == 0) goto L64
            if (r9 != 0) goto L63
            if (r10 != r8) goto L65
        L63:
            return r4
        L64:
            return r9
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj.i(mj):boolean");
    }

    public final void j() {
        HashSet hashSet;
        mj mjVar = this.f;
        if (mjVar != null && (hashSet = mjVar.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        ro0 ro0Var = this.i;
        if (ro0Var == null) {
            this.i = new ro0(1);
        } else {
            ro0Var.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.h0 + ":" + qo0.B(this.e);
    }
}
