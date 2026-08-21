package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class tc extends vc {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tc(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            r0 = 61
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            rc r1 = new rc
            char[] r4 = r4.toCharArray()
            r1.<init>(r3, r4)
            r2.<init>(r1, r0)
            char[] r2 = r1.b
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L1a
            return
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc.<init>(java.lang.String, java.lang.String):void");
    }

    @Override // defpackage.vc
    public final int b(byte[] bArr, CharSequence charSequence) {
        CharSequence c = c(charSequence);
        int length = c.length();
        rc rcVar = this.a;
        if (rcVar.h[length % rcVar.e]) {
            int i = 0;
            int i2 = 0;
            while (i < c.length()) {
                int i3 = i + 2;
                int a = (rcVar.a(c.charAt(i + 1)) << 12) | (rcVar.a(c.charAt(i)) << 18);
                int i4 = i2 + 1;
                bArr[i2] = (byte) (a >>> 16);
                if (i3 < c.length()) {
                    int i5 = i + 3;
                    int a2 = a | (rcVar.a(c.charAt(i3)) << 6);
                    int i6 = i2 + 2;
                    bArr[i4] = (byte) ((a2 >>> 8) & 255);
                    if (i5 < c.length()) {
                        i += 4;
                        i2 += 3;
                        bArr[i6] = (byte) ((a2 | rcVar.a(c.charAt(i5))) & 255);
                    } else {
                        i2 = i6;
                        i = i5;
                    }
                } else {
                    i2 = i4;
                    i = i3;
                }
            }
            return i2;
        }
        throw new IOException("Invalid input length " + c.length());
    }

    public final void d(Appendable appendable, byte[] bArr, int i) {
        rc rcVar;
        int i2 = 0;
        r21.f(0, i, bArr.length);
        int i3 = i;
        int i4 = 0;
        while (true) {
            rcVar = this.a;
            if (i3 < 3) {
                break;
            }
            int i5 = i4 + 2;
            int i6 = ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4] & 255) << 16);
            i4 += 3;
            int i7 = i6 | (bArr[i5] & 255);
            char[] cArr = rcVar.b;
            char[] cArr2 = rcVar.b;
            char c = cArr[i7 >>> 18];
            StringBuilder sb = (StringBuilder) appendable;
            sb.append(c);
            sb.append(cArr2[(i7 >>> 12) & 63]);
            sb.append(cArr2[(i7 >>> 6) & 63]);
            sb.append(cArr2[i7 & 63]);
            i3 -= 3;
        }
        if (i4 < i) {
            int i8 = i - i4;
            StringBuilder sb2 = (StringBuilder) appendable;
            r21.f(i4, i4 + i8, bArr.length);
            int i9 = rcVar.f;
            int i10 = rcVar.d;
            if (i8 <= i9) {
                long j = 0;
                for (int i11 = 0; i11 < i8; i11++) {
                    j = (j | (bArr[i4 + i11] & 255)) << 8;
                }
                int i12 = ((i8 + 1) * 8) - i10;
                while (i2 < i8 * 8) {
                    sb2.append(rcVar.b[((int) (j >>> (i12 - i2))) & rcVar.c]);
                    i2 += i10;
                }
                Character ch = this.b;
                if (ch != null) {
                    while (i2 < rcVar.f * 8) {
                        sb2.append(ch.charValue());
                        i2 += i10;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException();
        }
    }
}
