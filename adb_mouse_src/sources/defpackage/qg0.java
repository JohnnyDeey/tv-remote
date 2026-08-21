package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class qg0 {
    public static final byte[] a;
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;

    static {
        s sVar = kb0.a;
        k4 k4Var = new k4(sVar);
        s sVar2 = kb0.b;
        k4 k4Var2 = new k4(sVar2);
        s sVar3 = kb0.c;
        k4 k4Var3 = new k4(sVar3);
        im imVar = im.c;
        k4 k4Var4 = new k4(sVar, imVar);
        k4 k4Var5 = new k4(sVar2, imVar);
        k4 k4Var6 = new k4(sVar3, imVar);
        s sVar4 = od0.c;
        k4 k4Var7 = new k4(sVar4, k4Var);
        k4 k4Var8 = new k4(sVar4, k4Var2);
        k4 k4Var9 = new k4(sVar4, k4Var3);
        k4 k4Var10 = new k4(sVar4, k4Var4);
        k4 k4Var11 = new k4(sVar4, k4Var5);
        k4 k4Var12 = new k4(sVar4, k4Var6);
        o oVar = new o(r21.u(4));
        o oVar2 = new o(r21.u(5));
        o oVar3 = new o(r21.u(6));
        o oVar4 = pg0.j;
        try {
            a = new pg0(k4Var, k4Var7, oVar, oVar4).h();
            b = new pg0(k4Var2, k4Var8, oVar2, oVar4).h();
            c = new pg0(k4Var3, k4Var9, oVar3, oVar4).h();
            d = new pg0(k4Var4, k4Var10, oVar, oVar4).h();
            e = new pg0(k4Var5, k4Var11, oVar2, oVar4).h();
            f = new pg0(k4Var6, k4Var12, oVar3, oVar4).h();
        } catch (IOException e2) {
            c.o(e2.getMessage());
        }
    }
}
