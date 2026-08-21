package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* loaded from: classes.dex */
public final class f21 extends sk0 implements xt {
    public final c21 e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;
    public volatile long j;
    public volatile ob k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f21(defpackage.e21 r8) {
        /*
            r7 = this;
            c21 r1 = r8.a
            j21 r0 = r1.b
            java.lang.String r2 = r0.e
            r3 = 1
            r7.<init>(r2, r3)
            r7.e = r1
            int r0 = r0.f
            long r2 = r8.b
            r7.j = r2
            byte[] r5 = r8.d
            r6 = 0
            if (r5 == 0) goto L23
            int r2 = r5.length
            if (r2 != r0) goto L1d
            r7.f = r5
            goto L27
        L1d:
            java.lang.String r7 = "size of secretKeySeed needs to be equal size of digest"
            defpackage.c.k(r7)
            throw r6
        L23:
            byte[] r2 = new byte[r0]
            r7.f = r2
        L27:
            byte[] r2 = r8.e
            if (r2 == 0) goto L37
            int r3 = r2.length
            if (r3 != r0) goto L31
            r7.g = r2
            goto L3b
        L31:
            java.lang.String r7 = "size of secretKeyPRF needs to be equal size of digest"
            defpackage.c.k(r7)
            throw r6
        L37:
            byte[] r2 = new byte[r0]
            r7.g = r2
        L3b:
            byte[] r4 = r8.f
            if (r4 == 0) goto L4b
            int r2 = r4.length
            if (r2 != r0) goto L45
            r7.h = r4
            goto L4f
        L45:
            java.lang.String r7 = "size of publicSeed needs to be equal size of digest"
            defpackage.c.k(r7)
            throw r6
        L4b:
            byte[] r2 = new byte[r0]
            r7.h = r2
        L4f:
            byte[] r2 = r8.g
            if (r2 == 0) goto L5f
            int r3 = r2.length
            if (r3 != r0) goto L59
            r7.i = r2
            goto L63
        L59:
            java.lang.String r7 = "size of root needs to be equal size of digest"
            defpackage.c.k(r7)
            throw r6
        L5f:
            byte[] r0 = new byte[r0]
            r7.i = r0
        L63:
            ob r0 = r8.h
            if (r0 == 0) goto L6a
        L67:
            r7.k = r0
            goto L8b
        L6a:
            long r2 = r8.b
            int r0 = r1.c
            boolean r0 = defpackage.mi0.D(r0, r2)
            if (r0 == 0) goto L80
            if (r4 == 0) goto L80
            if (r5 == 0) goto L80
            ob r0 = new ob
            long r2 = r8.b
            r0.<init>(r1, r2, r4, r5)
            goto L67
        L80:
            ob r0 = new ob
            long r1 = r8.c
            r3 = 1
            long r1 = r1 + r3
            r0.<init>(r1)
            goto L67
        L8b:
            long r0 = r8.c
            r2 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 < 0) goto La2
            ob r7 = r7.k
            long r7 = r7.d
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 != 0) goto L9c
            goto La2
        L9c:
            java.lang.String r7 = "maxIndex set but not reflected in state"
            defpackage.c.k(r7)
            throw r6
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f21.<init>(e21):void");
    }

    public final byte[] a() {
        byte[] h;
        synchronized (this) {
            try {
                c21 c21Var = this.e;
                int i = c21Var.b.f;
                int i2 = (c21Var.c + 7) / 8;
                int i3 = i2 + i;
                int i4 = i3 + i;
                int i5 = i4 + i;
                byte[] bArr = new byte[i + i5];
                mi0.g(0, bArr, mi0.Q(i2, this.j));
                mi0.g(i2, bArr, this.f);
                mi0.g(i3, bArr, this.g);
                mi0.g(i4, bArr, this.h);
                mi0.g(i5, bArr, this.i);
                try {
                    ob obVar = this.k;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(obVar);
                    objectOutputStream.flush();
                    h = f20.h(bArr, byteArrayOutputStream.toByteArray());
                } catch (IOException e) {
                    throw new IllegalStateException("error serializing bds state: " + e.getMessage(), e);
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
