package defpackage;

/* loaded from: classes.dex */
public final class cm extends e {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cm(int i, byte[] bArr) {
        super(i, bArr);
        this.f = 0;
    }

    @Override // defpackage.x
    public final void j(v vVar, boolean z) {
        int i = this.f;
        byte[] bArr = this.c;
        switch (i) {
            case 0:
                int i2 = bArr[0] & 255;
                int length = bArr.length;
                int i3 = length - 1;
                byte b = bArr[i3];
                byte b2 = (byte) ((255 << i2) & b);
                if (b == b2) {
                    vVar.m(3, z, bArr);
                    return;
                }
                vVar.p(3, z);
                vVar.k(length);
                vVar.j(bArr, 0, i3);
                vVar.i(b2);
                return;
            default:
                vVar.m(3, z, bArr);
                return;
        }
    }

    @Override // defpackage.x
    public final boolean k() {
        switch (this.f) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override // defpackage.x
    public final int l(boolean z) {
        switch (this.f) {
            case 0:
                return v.f(this.c.length, z);
            default:
                return v.f(this.c.length, z);
        }
    }

    @Override // defpackage.e, defpackage.x
    public x o() {
        switch (this.f) {
            case 0:
                return this;
            default:
                return super.o();
        }
    }

    @Override // defpackage.e, defpackage.x
    public final x p() {
        int i = this.f;
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cm(byte[] bArr, int i, byte b) {
        super(bArr);
        this.f = i;
    }
}
