package defpackage;

/* loaded from: classes.dex */
public final class no0 extends u8 {
    public final byte[] d;
    public final mo0 e;

    public no0(mo0 mo0Var, byte[] bArr) {
        super(true);
        this.d = f20.e(bArr);
        this.e = mo0Var;
    }

    public final mo0 a() {
        return this.e;
    }

    public final byte[] getEncoded() {
        return f20.e(this.d);
    }
}
