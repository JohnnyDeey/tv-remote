package defpackage;

/* loaded from: classes.dex */
public final class oq implements mq {
    public final mq a;
    public final int b;

    public oq(int i, s sVar) {
        if (sVar != null) {
            this.a = pq.a(sVar);
            this.b = i;
        } else {
            c.g("digest == null");
            throw null;
        }
    }

    @Override // defpackage.mq
    public String a() {
        return this.a.a() + "/" + (this.b * 8);
    }

    @Override // defpackage.mq
    public int b() {
        return this.b;
    }

    @Override // defpackage.mq
    public int c(int i, byte[] bArr) {
        mq mqVar = this.a;
        byte[] bArr2 = new byte[mqVar.b()];
        mqVar.c(0, bArr2);
        int i2 = this.b;
        System.arraycopy(bArr2, 0, bArr, i, i2);
        return i2;
    }

    @Override // defpackage.mq
    public void d(byte b) {
        this.a.d(b);
    }

    public byte[] e(byte[] bArr, byte[] bArr2) {
        String str;
        if (bArr.length == this.b) {
            if (bArr2.length == 32) {
                return f(3, bArr, bArr2);
            }
            str = "wrong address length";
        } else {
            str = "wrong key length";
        }
        c.k(str);
        return null;
    }

    public byte[] f(int i, byte[] bArr, byte[] bArr2) {
        long j = i;
        int i2 = this.b;
        byte[] Q = mi0.Q(i2, j);
        int length = Q.length;
        mq mqVar = this.a;
        mqVar.update(Q, 0, length);
        mqVar.update(bArr, 0, bArr.length);
        mqVar.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[i2];
        if (mqVar instanceof ik0) {
            ((ik0) mqVar).k(bArr3, 0, i2);
            return bArr3;
        }
        mqVar.c(0, bArr3);
        return bArr3;
    }

    @Override // defpackage.mq
    public void update(byte[] bArr, int i, int i2) {
        this.a.update(bArr, i, i2);
    }

    public oq(int i, mq mqVar) {
        this.a = mqVar;
        this.b = i;
    }
}
