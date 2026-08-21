package defpackage;

import android.util.StateSet;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class qp0 {
    public int a;
    public on0 b;
    public int[][] c;
    public on0[] d;
    public pp0 e;
    public pp0 f;
    public pp0 g;
    public pp0 h;

    public qp0(on0 on0Var) {
        b();
        a(StateSet.WILD_CARD, on0Var);
    }

    public final void a(int[] iArr, on0 on0Var) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = on0Var;
        }
        int[][] iArr2 = this.c;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.c = iArr3;
            on0[] on0VarArr = new on0[i2];
            System.arraycopy(this.d, 0, on0VarArr, 0, i);
            this.d = on0VarArr;
        }
        int[][] iArr4 = this.c;
        int i3 = this.a;
        iArr4[i3] = iArr;
        this.d[i3] = on0Var;
        this.a = i3 + 1;
    }

    public final void b() {
        this.b = new on0();
        this.c = new int[10];
        this.d = new on0[10];
    }
}
