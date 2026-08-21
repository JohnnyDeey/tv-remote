package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class jz extends ze implements iz, h40, hz {
    public final int i;
    public final int j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jz(int r8, java.lang.Object r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13, int r14) {
        /*
            r7 = this;
            r14 = 1
            r13 = r13 & r14
            r0 = 0
            if (r13 != r14) goto Lc
            r6 = r14
        L6:
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            goto Le
        Lc:
            r6 = r0
            goto L6
        Le:
            r1.<init>(r2, r3, r4, r5, r6)
            r1.i = r8
            r1.j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int, int):void");
    }

    @Override // defpackage.iz
    public final int b() {
        return this.i;
    }

    public final h40 d() {
        li0.a.getClass();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [h40] */
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof jz) {
                jz jzVar = (jz) obj;
                if (this.f.equals(jzVar.f) && this.g.equals(jzVar.g) && this.j == jzVar.j && this.i == jzVar.i && k20.c(this.d, jzVar.d) && c().equals(jzVar.c())) {
                    return true;
                }
                return false;
            }
            if (obj instanceof jz) {
                ?? r0 = this.c;
                if (r0 == 0) {
                    d();
                    this.c = this;
                } else {
                    this = r0;
                }
                return obj.equals(this);
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        c();
        return this.g.hashCode() + ((this.f.hashCode() + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        h40 h40Var = this.c;
        if (h40Var == null) {
            d();
            this.c = this;
            h40Var = this;
        }
        if (h40Var != this) {
            return h40Var.toString();
        }
        String str = this.f;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return qo0.r("function ", str, " (Kotlin reflection is not available)");
    }

    public jz(int i, Class cls, String str, String str2, int i2) {
        this(i, ye.c, cls, str, str2, i2, 0);
    }
}
