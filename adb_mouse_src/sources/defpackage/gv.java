package defpackage;

/* loaded from: classes.dex */
public final class gv extends p {
    public byte[] c;

    public gv(byte[] bArr) {
        this.c = bArr;
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
