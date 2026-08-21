package defpackage;

/* loaded from: classes.dex */
public final class hk0 extends j40 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk0(int i) {
        super(i);
        if (i != 224 && i != 256 && i != 384 && i != 512) {
            c.k(qo0.n("'bitLength' ", i, " not supported for SHA-3"));
            throw null;
        }
    }

    @Override // defpackage.mq
    public final String a() {
        return "SHA3-" + this.e;
    }

    @Override // defpackage.mq
    public final int c(int i, byte[] bArr) {
        g(2, 2);
        j(i, this.e, bArr);
        i(this.e);
        return b();
    }
}
