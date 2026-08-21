package defpackage;

/* loaded from: classes.dex */
public final class h21 extends sk0 implements xt {
    public final c21 e;
    public final int f;
    public final byte[] g;
    public final byte[] h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h21(defpackage.l3 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r7.g
            c21 r0 = (defpackage.c21) r0
            j21 r1 = r0.b
            java.lang.String r2 = r1.e
            r3 = 0
            r6.<init>(r2, r3)
            r6.e = r0
            int r1 = r1.f
            java.lang.Object r2 = r7.e
            byte[] r2 = (byte[]) r2
            r4 = 0
            if (r2 == 0) goto L4c
            int r7 = r2.length
            int r0 = r1 + r1
            if (r7 != r0) goto L2b
            r6.f = r3
            byte[] r7 = defpackage.mi0.q(r2, r3, r1)
            r6.g = r7
            byte[] r7 = defpackage.mi0.q(r2, r1, r1)
            r6.h = r7
            return
        L2b:
            int r7 = r2.length
            int r0 = r1 + 4
            int r5 = r0 + r1
            if (r7 != r5) goto L46
            int r7 = defpackage.k20.e(r3, r2)
            r6.f = r7
            r7 = 4
            byte[] r7 = defpackage.mi0.q(r2, r7, r1)
            r6.g = r7
            byte[] r7 = defpackage.mi0.q(r2, r0, r1)
            r6.h = r7
            return
        L46:
            java.lang.String r6 = "public key has wrong size"
            defpackage.c.k(r6)
            throw r4
        L4c:
            so r0 = r0.a
            if (r0 == 0) goto L55
            int r0 = r0.a
            r6.f = r0
            goto L57
        L55:
            r6.f = r3
        L57:
            java.lang.Object r0 = r7.f
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L69
            int r2 = r0.length
            if (r2 != r1) goto L63
            r6.g = r0
            goto L6d
        L63:
            java.lang.String r6 = "length of root must be equal to length of digest"
            defpackage.c.k(r6)
            throw r4
        L69:
            byte[] r0 = new byte[r1]
            r6.g = r0
        L6d:
            java.lang.Object r7 = r7.d
            byte[] r7 = (byte[]) r7
            if (r7 == 0) goto L7f
            int r0 = r7.length
            if (r0 != r1) goto L79
            r6.h = r7
            return
        L79:
            java.lang.String r6 = "length of publicSeed must be equal to length of digest"
            defpackage.c.k(r6)
            throw r4
        L7f:
            byte[] r7 = new byte[r1]
            r6.h = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h21.<init>(l3):void");
    }

    public final byte[] a() {
        byte[] bArr;
        int i = this.e.b.f;
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

    @Override // defpackage.xt
    public final byte[] getEncoded() {
        return a();
    }
}
