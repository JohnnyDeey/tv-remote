package defpackage;

import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class vc {
    public static final tc c = new tc("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    public final rc a;
    public final Character b;

    static {
        new tc("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new vc("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new vc("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        new sc();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vc(defpackage.rc r3, java.lang.Character r4) {
        /*
            r2 = this;
            r2.<init>()
            r2.a = r3
            if (r4 == 0) goto L17
            char r0 = r4.charValue()
            byte[] r3 = r3.g
            int r1 = r3.length
            if (r0 >= r1) goto L17
            r3 = r3[r0]
            r0 = -1
            if (r3 == r0) goto L17
            r3 = 0
            goto L18
        L17:
            r3 = 1
        L18:
            if (r3 == 0) goto L1d
            r2.b = r4
            return
        L1d:
            java.lang.Object[] r2 = new java.lang.Object[]{r4}
            java.lang.String r3 = "Padding character %s was already in alphabet"
            java.lang.String r2 = defpackage.mi0.G(r3, r2)
            defpackage.c.k(r2)
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vc.<init>(rc, java.lang.Character):void");
    }

    public final byte[] a(String str) {
        try {
            int length = (int) (((this.a.d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int b = b(bArr, c(str));
            if (b == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[b];
            System.arraycopy(bArr, 0, bArr2, 0, b);
            return bArr2;
        } catch (uc e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) {
        CharSequence c2 = c(charSequence);
        int length = c2.length();
        rc rcVar = this.a;
        boolean[] zArr = rcVar.h;
        int i = rcVar.d;
        int i2 = rcVar.e;
        if (zArr[length % i2]) {
            int i3 = 0;
            for (int i4 = 0; i4 < c2.length(); i4 += i2) {
                long j = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < i2; i6++) {
                    j <<= i;
                    if (i4 + i6 < c2.length()) {
                        j |= rcVar.a(c2.charAt(i5 + i4));
                        i5++;
                    }
                }
                int i7 = rcVar.f;
                int i8 = (i7 * 8) - (i5 * i);
                int i9 = (i7 - 1) * 8;
                while (i9 >= i8) {
                    bArr[i3] = (byte) ((j >>> i9) & 255);
                    i9 -= 8;
                    i3++;
                }
            }
            return i3;
        }
        throw new IOException("Invalid input length " + c2.length());
    }

    public final CharSequence c(CharSequence charSequence) {
        Character ch = this.b;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == charValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vc) {
            vc vcVar = (vc) obj;
            if (this.a.equals(vcVar.a) && Objects.equals(this.b, vcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        rc rcVar = this.a;
        sb.append(rcVar);
        if (8 % rcVar.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public vc(String str, String str2) {
        this(new rc(str, str2.toCharArray()), (Character) '=');
    }
}
