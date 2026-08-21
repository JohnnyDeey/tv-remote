package defpackage;

/* loaded from: classes.dex */
public final class wk0 extends bc {
    public final i10 e;
    public final i10 f;

    public wk0(vk0 vk0Var, byte[] bArr) {
        super((Object) vk0Var, true);
        int a = vk0Var.c.a();
        int i = a * 4;
        if (bArr.length == i) {
            int i2 = a * 2;
            this.e = new i10(f20.p(bArr, 0, a), f20.p(bArr, a, i2));
            int i3 = a * 3;
            this.f = new i10(f20.p(bArr, i2, i3), f20.p(bArr, i3, i));
            return;
        }
        c.k("private key encoding does not match parameters");
        throw null;
    }

    public final byte[] getEncoded() {
        i10 i10Var = this.e;
        byte[] bArr = i10Var.a;
        byte[] bArr2 = i10Var.b;
        i10 i10Var2 = this.f;
        return f20.j(new byte[][]{bArr, bArr2, i10Var2.a, i10Var2.b});
    }

    public wk0(vk0 vk0Var, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super((Object) vk0Var, true);
        this.e = new i10(bArr, bArr2);
        this.f = new i10(bArr3, bArr4);
    }
}
