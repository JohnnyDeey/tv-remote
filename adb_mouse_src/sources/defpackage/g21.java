package defpackage;

/* loaded from: classes.dex */
public final class g21 extends p {
    public final byte[] c;
    public final byte[] d;

    public g21(byte[] bArr, byte[] bArr2) {
        this.c = f20.e(bArr);
        this.d = f20.e(bArr2);
    }

    @Override // defpackage.p, defpackage.i
    public final x c() {
        j jVar = new j();
        jVar.d(new o(0L));
        jVar.d(new t(this.c));
        jVar.d(new t(this.d));
        nm nmVar = new nm(jVar, 0);
        nmVar.f = -1;
        return nmVar;
    }
}
