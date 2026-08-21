package defpackage;

/* loaded from: classes.dex */
public final class ik0 extends j40 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik0(int i) {
        super(i);
        if (i != 128 && i != 256) {
            c.k(qo0.n("'bitStrength' ", i, " not supported for SHAKE"));
            throw null;
        }
    }

    @Override // defpackage.mq
    public final String a() {
        return "SHAKE" + this.e;
    }

    @Override // defpackage.j40, defpackage.mq
    public final int b() {
        return this.e / 4;
    }

    @Override // defpackage.mq
    public final int c(int i, byte[] bArr) {
        int i2 = this.e / 4;
        k(bArr, i, i2);
        return i2;
    }

    @Override // defpackage.j40
    public final ce h() {
        return new ce(a(), 3);
    }

    public final void k(byte[] bArr, int i, int i2) {
        l(bArr, i, i2);
        i(this.e);
    }

    public final void l(byte[] bArr, int i, int i2) {
        if (!this.f) {
            g(15, 4);
        }
        j(i, i2 * 8, bArr);
    }
}
