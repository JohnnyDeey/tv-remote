package defpackage;

import java.util.Hashtable;

/* loaded from: classes.dex */
public final class v11 extends p implements h {
    public static final ib h = ib.x;
    public boolean c;
    public int d;
    public mn e;
    public og0[] f;
    public nm g;

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0145, code lost:
    
        defpackage.c.k("badly formatted directory string");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0148, code lost:
    
        throw null;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r7v5, types: [og0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [b0, om] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v11() {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v11.<init>():void");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [v11, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [og0, java.lang.Object] */
    public static v11 i(Object obj) {
        nm nmVar;
        og0 og0Var;
        b0 b0Var;
        boolean z;
        if (obj instanceof v11) {
            return (v11) obj;
        }
        if (obj == null) {
            return null;
        }
        a0 s = a0.s(obj);
        ?? obj2 = new Object();
        int size = s.size();
        obj2.e = h;
        obj2.f = new og0[size];
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            i t = s.t(i);
            if (t instanceof og0) {
                og0Var = (og0) t;
            } else if (t != null) {
                if (t instanceof b0) {
                    b0Var = (b0) t;
                } else {
                    x c = t.c();
                    if (c instanceof b0) {
                        b0Var = (b0) c;
                    } else {
                        c.k("unknown object in getInstance: ".concat(t.getClass().getName()));
                        return null;
                    }
                }
                ?? obj3 = new Object();
                obj3.c = b0Var;
                og0Var = obj3;
            } else {
                og0Var = null;
            }
            if (og0Var == t) {
                z = true;
            } else {
                z = false;
            }
            z2 &= z;
            obj2.f[i] = og0Var;
        }
        if (z2) {
            nmVar = (nm) s.o();
        } else {
            nmVar = new nm(obj2.f, 0);
        }
        obj2.g = nmVar;
        return obj2;
    }

    @Override // defpackage.p, defpackage.i
    public final x c() {
        return this.g;
    }

    @Override // defpackage.p
    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof v11) || (obj instanceof a0)) {
                if (this.g.m(((i) obj).c())) {
                    return true;
                }
                try {
                    mn mnVar = this.e;
                    v11 i = i(obj);
                    mnVar.getClass();
                    return mn.b(this, i);
                } catch (Exception unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.p
    public final int hashCode() {
        if (this.c) {
            return this.d;
        }
        this.c = true;
        this.e.getClass();
        og0[] og0VarArr = (og0[]) this.f.clone();
        int i = 0;
        for (int i2 = 0; i2 != og0VarArr.length; i2++) {
            og0 og0Var = og0VarArr[i2];
            if (og0Var.c.c.length > 1) {
                w8[] j = og0Var.j();
                for (int i3 = 0; i3 != j.length; i3++) {
                    i = (i ^ f20.K(j[i3].c.c)) ^ wv0.m(j[i3].d).hashCode();
                }
            } else {
                i = (i ^ f20.K(og0Var.i().c.c)) ^ wv0.m(og0VarArr[i2].i().d).hashCode();
            }
        }
        this.d = i;
        return i;
    }

    public final String toString() {
        ib ibVar = (ib) this.e;
        ibVar.getClass();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (og0 og0Var : (og0[]) this.f.clone()) {
            if (z) {
                z = false;
            } else {
                sb.append(',');
            }
            Hashtable hashtable = ibVar.m;
            if (og0Var.c.c.length > 1) {
                w8[] j = og0Var.j();
                boolean z2 = true;
                for (int i = 0; i != j.length; i++) {
                    if (z2) {
                        z2 = false;
                    } else {
                        sb.append('+');
                    }
                    wv0.h(sb, j[i], hashtable);
                }
            } else if (og0Var.i() != null) {
                wv0.h(sb, og0Var.i(), hashtable);
            }
        }
        return sb.toString();
    }

    public v11(mn mnVar, og0[] og0VarArr) {
        this.e = mnVar;
        og0[] og0VarArr2 = (og0[]) og0VarArr.clone();
        this.f = og0VarArr2;
        this.g = new nm(og0VarArr2, 0);
    }
}
