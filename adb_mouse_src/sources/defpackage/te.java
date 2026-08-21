package defpackage;

/* loaded from: classes.dex */
public final class te extends p {
    public byte[] c;

    public te(byte[] bArr) {
        this.c = bArr;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [te, java.lang.Object] */
    public static te i(i iVar) {
        if (iVar instanceof te) {
            return (te) iVar;
        }
        if (iVar != null) {
            a0 s = a0.s(iVar);
            ?? obj = new Object();
            obj.c = f20.e(t.q(s.t(0)).c);
            return obj;
        }
        return null;
    }

    @Override // defpackage.p, defpackage.i
    public final x c() {
        j jVar = new j();
        jVar.d(new t(this.c));
        nm nmVar = new nm(jVar, 0);
        nmVar.f = -1;
        return nmVar;
    }
}
