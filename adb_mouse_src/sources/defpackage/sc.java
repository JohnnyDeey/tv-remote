package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class sc extends vc {
    public final char[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sc() {
        /*
            r5 = this;
            rc r0 = new rc
            java.lang.String r1 = "0123456789ABCDEF"
            char[] r1 = r1.toCharArray()
            java.lang.String r2 = "base16()"
            r0.<init>(r2, r1)
            r1 = 0
            r5.<init>(r0, r1)
            r1 = 512(0x200, float:7.17E-43)
            char[] r1 = new char[r1]
            r5.d = r1
            char[] r0 = r0.b
            int r1 = r0.length
            r2 = 16
            if (r1 != r2) goto L37
            r1 = 0
        L1f:
            r2 = 256(0x100, float:3.59E-43)
            if (r1 >= r2) goto L36
            char[] r2 = r5.d
            int r3 = r1 >>> 4
            char r3 = r0[r3]
            r2[r1] = r3
            r3 = r1 | 256(0x100, float:3.59E-43)
            r4 = r1 & 15
            char r4 = r0[r4]
            r2[r3] = r4
            int r1 = r1 + 1
            goto L1f
        L36:
            return
        L37:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sc.<init>():void");
    }

    @Override // defpackage.vc
    public final int b(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                char charAt = charSequence.charAt(i);
                rc rcVar = this.a;
                bArr[i2] = (byte) ((rcVar.a(charAt) << 4) | rcVar.a(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }
        throw new IOException("Invalid input length " + charSequence.length());
    }
}
