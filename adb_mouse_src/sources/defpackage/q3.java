package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class q3 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public q3(String str, int i, int i2, int i3, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        byte[] bytes = str.getBytes(qg.a);
        bytes.getClass();
        if (bytes.length == 4) {
            return;
        }
        c.k("Command must be exactly 4 bytes");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q3) {
                q3 q3Var = (q3) obj;
                if (!this.a.equals(q3Var.a) || this.b != q3Var.b || this.c != q3Var.c || this.d != q3Var.d || this.e != q3Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((Integer.hashCode(this.d) + ((Integer.hashCode(this.c) + ((Integer.hashCode(this.b) + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Charset charset = qg.a;
        String str = this.a;
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (~bytes[i]);
        }
        return String.format("MessageHeader[command=%s, arg0=0x%08X, arg1=0x%08X, data_length=%s, data_checksum=0x%08X, magic=0x%08X]", Arrays.copyOf(new Object[]{str, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getInt())}, 6));
    }
}
