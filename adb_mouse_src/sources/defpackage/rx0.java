package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class rx0 extends qx0 {
    public vd0[] a;
    public String b;
    public int c;

    public rx0(rx0 rx0Var) {
        this.a = null;
        this.c = 0;
        this.b = rx0Var.b;
        vd0[] vd0VarArr = rx0Var.a;
        vd0[] vd0VarArr2 = new vd0[vd0VarArr.length];
        for (int i = 0; i < vd0VarArr.length; i++) {
            vd0VarArr2[i] = new vd0(vd0VarArr[i]);
        }
        this.a = vd0VarArr2;
    }

    public vd0[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(vd0[] vd0VarArr) {
        vd0[] vd0VarArr2 = this.a;
        if (vd0VarArr2 != null && vd0VarArr != null && vd0VarArr2.length == vd0VarArr.length) {
            for (int i = 0; i < vd0VarArr2.length; i++) {
                vd0 vd0Var = vd0VarArr2[i];
                char c = vd0Var.a;
                vd0 vd0Var2 = vd0VarArr[i];
                if (c == vd0Var2.a && vd0Var.b.length == vd0Var2.b.length) {
                }
            }
            vd0[] vd0VarArr3 = this.a;
            for (int i2 = 0; i2 < vd0VarArr.length; i2++) {
                vd0VarArr3[i2].a = vd0VarArr[i2].a;
                int i3 = 0;
                while (true) {
                    float[] fArr = vd0VarArr[i2].b;
                    if (i3 < fArr.length) {
                        vd0VarArr3[i2].b[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        vd0[] vd0VarArr4 = new vd0[vd0VarArr.length];
        for (int i4 = 0; i4 < vd0VarArr.length; i4++) {
            vd0VarArr4[i4] = new vd0(vd0VarArr[i4]);
        }
        this.a = vd0VarArr4;
    }

    public rx0() {
        this.a = null;
        this.c = 0;
    }
}
