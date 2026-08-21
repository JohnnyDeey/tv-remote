package defpackage;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class c30 implements xs0 {
    public final MessageDigest a;

    public c30(MessageDigest messageDigest) {
        this.a = messageDigest;
    }

    @Override // defpackage.xs0
    public final byte[] a() {
        return this.a.digest();
    }

    @Override // defpackage.xs0
    public final xs0 b() {
        try {
            return new c30((MessageDigest) this.a.clone());
        } catch (CloneNotSupportedException unused) {
            c.q("unable to clone digest");
            return null;
        }
    }

    @Override // defpackage.xs0
    public final void reset() {
        this.a.reset();
    }

    @Override // defpackage.xs0
    public final void update(byte[] bArr, int i, int i2) {
        this.a.update(bArr, i, i2);
    }
}
