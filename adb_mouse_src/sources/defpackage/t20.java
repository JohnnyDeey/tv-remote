package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t20 implements ws0 {
    public static final byte[] h;
    public static final byte[] i;
    public final c30 c;
    public final int d;
    public final int e;
    public final int f;
    public byte[] g;

    static {
        byte[] bArr = new byte[48];
        Arrays.fill(bArr, (byte) 54);
        h = bArr;
        byte[] bArr2 = new byte[48];
        Arrays.fill(bArr2, (byte) 92);
        i = bArr2;
    }

    public t20(c30 c30Var, int i2, int i3) {
        int i4;
        this.c = c30Var;
        this.d = i2;
        this.e = i3;
        if (i2 == 20) {
            i4 = 40;
        } else {
            i4 = 48;
        }
        this.f = i4;
    }

    @Override // defpackage.ws0
    public final void a(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = ht0.a;
        int i4 = (i3 + i2) - i2;
        byte[] bArr3 = new byte[i4];
        System.arraycopy(bArr, i2, bArr3, 0, i4);
        this.g = bArr3;
        reset();
    }

    @Override // defpackage.ws0
    public final int b() {
        return this.e;
    }

    @Override // defpackage.ws0
    public final byte[] c() {
        c30 c30Var = this.c;
        MessageDigest messageDigest = c30Var.a;
        byte[] digest = messageDigest.digest();
        byte[] bArr = this.g;
        c30Var.update(bArr, 0, bArr.length);
        c30Var.update(i, 0, this.f);
        c30Var.update(digest, 0, digest.length);
        byte[] digest2 = messageDigest.digest();
        reset();
        return digest2;
    }

    @Override // defpackage.ws0
    public final int d() {
        return this.d;
    }

    @Override // defpackage.ws0
    public final void reset() {
        c30 c30Var = this.c;
        c30Var.reset();
        byte[] bArr = this.g;
        c30Var.update(bArr, 0, bArr.length);
        c30Var.update(h, 0, this.f);
    }

    @Override // defpackage.ws0
    public final void update(byte[] bArr, int i2, int i3) {
        this.c.update(bArr, i2, i3);
    }
}
