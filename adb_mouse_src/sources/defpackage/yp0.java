package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AccessController;

/* loaded from: classes.dex */
public abstract class yp0 {
    public static final String a;

    static {
        try {
            try {
                a = (String) AccessController.doPrivileged(new lz(2));
            } catch (Exception unused) {
                a = String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
            a = "\n";
        }
    }

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    public static byte[] b(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static String c(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) (c + ' ');
                z = true;
            }
        }
        if (z) {
            return new String(charArray);
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        r10 = "invalid UTF-16 low surrogate";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        defpackage.c.o(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(char[] r10, int r11, java.io.ByteArrayOutputStream r12) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp0.d(char[], int, java.io.ByteArrayOutputStream):void");
    }

    public static byte[] e(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            d(charArray, length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            c.o("cannot encode string to byte array!");
            return null;
        }
    }

    public static String f(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) (c - ' ');
                z = true;
            }
        }
        if (z) {
            return new String(charArray);
        }
        return str;
    }
}
