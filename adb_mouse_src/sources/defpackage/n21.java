package defpackage;

/* loaded from: classes.dex */
public final class n21 extends sk0 implements xt {
    public final j21 e;
    public final int f;
    public final byte[] g;
    public final byte[] h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n21(defpackage.l3 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r7.g
            j21 r0 = (defpackage.j21) r0
            java.lang.String r1 = r0.e
            r2 = 0
            r6.<init>(r1, r2)
            r6.e = r0
            int r1 = r0.f
            java.lang.Object r3 = r7.e
            byte[] r3 = (byte[]) r3
            r4 = 0
            if (r3 == 0) goto L4a
            int r7 = r3.length
            int r0 = r1 + r1
            if (r7 != r0) goto L29
            r6.f = r2
            byte[] r7 = defpackage.mi0.q(r3, r2, r1)
            r6.g = r7
            byte[] r7 = defpackage.mi0.q(r3, r1, r1)
            r6.h = r7
            return
        L29:
            int r7 = r3.length
            int r0 = r1 + 4
            int r5 = r0 + r1
            if (r7 != r5) goto L44
            int r7 = defpackage.k20.e(r2, r3)
            r6.f = r7
            r7 = 4
            byte[] r7 = defpackage.mi0.q(r3, r7, r1)
            r6.g = r7
            byte[] r7 = defpackage.mi0.q(r3, r0, r1)
            r6.h = r7
            return
        L44:
            java.lang.String r6 = "public key has wrong size"
            defpackage.c.k(r6)
            throw r4
        L4a:
            to r0 = r0.a
            if (r0 == 0) goto L53
            int r0 = r0.a
            r6.f = r0
            goto L55
        L53:
            r6.f = r2
        L55:
            java.lang.Object r0 = r7.f
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L67
            int r2 = r0.length
            if (r2 != r1) goto L61
            r6.g = r0
            goto L6b
        L61:
            java.lang.String r6 = "length of root must be equal to length of digest"
            defpackage.c.k(r6)
            throw r4
        L67:
            byte[] r0 = new byte[r1]
            r6.g = r0
        L6b:
            java.lang.Object r7 = r7.d
            byte[] r7 = (byte[]) r7
            if (r7 == 0) goto L7d
            int r0 = r7.length
            if (r0 != r1) goto L77
            r6.h = r7
            return
        L77:
            java.lang.String r6 = "length of publicSeed must be equal to length of digest"
            defpackage.c.k(r6)
            throw r4
        L7d:
            byte[] r7 = new byte[r1]
            r6.h = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n21.<init>(l3):void");
    }

    @Override // defpackage.xt
    public final byte[] getEncoded() {
        byte[] bArr;
        int i = this.e.f;
        int i2 = 0;
        int i3 = this.f;
        if (i3 != 0) {
            bArr = new byte[i + 4 + i];
            k20.H(bArr, i3, 0);
            i2 = 4;
        } else {
            bArr = new byte[i + i];
        }
        mi0.g(i2, bArr, this.g);
        mi0.g(i2 + i, bArr, this.h);
        return bArr;
    }
}
