package defpackage;

/* loaded from: classes.dex */
public final class og0 extends p {
    public b0 c;

    @Override // defpackage.p, defpackage.i
    public final x c() {
        return this.c;
    }

    public final w8 i() {
        i[] iVarArr = this.c.c;
        if (iVarArr.length == 0) {
            return null;
        }
        return w8.i(iVarArr[0]);
    }

    public final w8[] j() {
        b0 b0Var = this.c;
        int length = b0Var.c.length;
        w8[] w8VarArr = new w8[length];
        for (int i = 0; i != length; i++) {
            w8VarArr[i] = w8.i(b0Var.c[i]);
        }
        return w8VarArr;
    }
}
