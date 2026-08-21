package defpackage;

import java.security.spec.KeySpec;

/* loaded from: classes.dex */
public final class a80 implements KeySpec {
    public final byte[] c;
    public final byte[] d;
    public final x70 e;
    public final boolean f;

    public a80(x70 x70Var, byte[] bArr) {
        if (bArr.length == 64) {
            this.f = true;
            this.e = x70Var;
            this.c = f20.e(bArr);
            this.d = null;
            return;
        }
        c.k("incorrect length for seed");
        throw null;
    }

    public a80(x70 x70Var, byte[] bArr, byte[] bArr2) {
        this.f = false;
        this.e = x70Var;
        this.c = f20.e(bArr);
        this.d = f20.e(bArr2);
    }
}
