package defpackage;

/* loaded from: classes.dex */
public final class xk0 extends bc {
    public final i10 e;

    public xk0(vk0 vk0Var, byte[] bArr) {
        super((Object) vk0Var, false);
        int a = vk0Var.c.a();
        int i = a * 2;
        if (bArr.length == i) {
            this.e = new i10(f20.p(bArr, 0, a), f20.p(bArr, a, i));
        } else {
            c.k("public key encoding does not match parameters");
            throw null;
        }
    }
}
