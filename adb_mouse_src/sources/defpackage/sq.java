package defpackage;

/* loaded from: classes.dex */
public final class sq extends bc {
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;
    public final byte[] j;
    public final byte[] k;

    public sq(rq rqVar, byte[] bArr, tq tqVar) {
        super((Object) rqVar, true);
        int i;
        char c;
        int i2;
        int i3 = rqVar.a;
        new ik0(256);
        int i4 = 96;
        if (i3 != 2) {
            i = 5;
            if (i3 != 3) {
                if (i3 == 5) {
                    i2 = 8;
                    i = 7;
                } else {
                    c.k(qo0.n("The mode ", i3, "is not supported by Crystals Dilithium!"));
                    throw null;
                }
            } else {
                i2 = 6;
                i4 = 128;
            }
            c = 0;
        } else {
            i = 4;
            c = 0;
            i2 = 4;
        }
        new j40(128);
        new ik0(256);
        if (c == 0 || c == 0) {
            this.e = f20.p(bArr, 0, 32);
            this.f = f20.p(bArr, 32, 64);
            this.g = f20.p(bArr, 64, 128);
            int i5 = (i * i4) + 128;
            this.h = f20.p(bArr, 128, i5);
            int i6 = (i4 * i2) + i5;
            this.i = f20.p(bArr, i5, i6);
            this.j = f20.p(bArr, i6, (i2 * 416) + i6);
            if (tqVar != null) {
                this.k = f20.e(tqVar.f);
                return;
            } else {
                this.k = null;
                return;
            }
        }
        f40.f("Wrong Dilithium Gamma1!");
        throw null;
    }

    public sq(rq rqVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super((Object) rqVar, true);
        this.e = f20.e(bArr);
        this.f = f20.e(bArr2);
        this.g = f20.e(bArr3);
        this.h = f20.e(bArr4);
        this.i = f20.e(bArr5);
        this.j = f20.e(bArr6);
        this.k = f20.e(bArr7);
    }
}
