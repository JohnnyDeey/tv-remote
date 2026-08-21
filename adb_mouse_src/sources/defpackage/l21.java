package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* loaded from: classes.dex */
public final class l21 extends sk0 implements xt {
    public final j21 e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;
    public volatile nb j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l21(defpackage.uh0 r12) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l21.<init>(uh0):void");
    }

    public final byte[] a() {
        byte[] h;
        synchronized (this) {
            try {
                int i = this.e.f;
                int i2 = i + 4;
                int i3 = i2 + i;
                int i4 = i3 + i;
                byte[] bArr = new byte[i + i4];
                k20.H(bArr, this.j.k, 0);
                mi0.g(4, bArr, this.f);
                mi0.g(i2, bArr, this.g);
                mi0.g(i3, bArr, this.h);
                mi0.g(i4, bArr, this.i);
                try {
                    nb nbVar = this.j;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(nbVar);
                    objectOutputStream.flush();
                    h = f20.h(bArr, byteArrayOutputStream.toByteArray());
                } catch (IOException e) {
                    throw new RuntimeException("error serializing bds state: " + e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }

    @Override // defpackage.xt
    public final byte[] getEncoded() {
        byte[] a;
        synchronized (this) {
            a = a();
        }
        return a;
    }
}
