package defpackage;

/* loaded from: classes.dex */
public abstract class bn {
    public static final nm a;
    public static final dn b;

    /* JADX WARN: Type inference failed for: r0v1, types: [dn, b0] */
    static {
        nm nmVar = new nm(1);
        nmVar.f = -1;
        a = nmVar;
        ?? b0Var = new b0();
        b0Var.f = -1;
        b = b0Var;
    }

    public static nm a(j jVar) {
        if (jVar.b < 1) {
            return a;
        }
        nm nmVar = new nm(jVar, 1);
        nmVar.f = -1;
        return nmVar;
    }
}
