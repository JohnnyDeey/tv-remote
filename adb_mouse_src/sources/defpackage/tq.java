package defpackage;

/* loaded from: classes.dex */
public final class tq extends bc {
    public final byte[] e;
    public final byte[] f;

    public tq(rq rqVar, byte[] bArr) {
        super((Object) rqVar, false);
        this.e = f20.p(bArr, 0, 32);
        this.f = f20.p(bArr, 32, bArr.length);
    }

    public tq(rq rqVar, byte[] bArr, byte[] bArr2) {
        super((Object) rqVar, false);
        this.e = f20.e(bArr);
        this.f = f20.e(bArr2);
    }
}
