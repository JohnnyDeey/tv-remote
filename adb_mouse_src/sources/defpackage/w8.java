package defpackage;

/* loaded from: classes.dex */
public final class w8 extends p {
    public s c;
    public i d;

    public w8(s sVar, i iVar) {
        this.c = sVar;
        this.d = iVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [w8, java.lang.Object] */
    public static w8 i(i iVar) {
        if (iVar instanceof w8) {
            return (w8) iVar;
        }
        if (iVar != null) {
            a0 s = a0.s(iVar);
            ?? obj = new Object();
            obj.c = (s) s.t(0);
            obj.d = s.t(1);
            return obj;
        }
        c.k("null value in getInstance()");
        return null;
    }

    @Override // defpackage.p, defpackage.i
    public final x c() {
        return new nm(this.c, this.d);
    }
}
