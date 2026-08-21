package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class gw0 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final l3 b;
    public volatile int c = 0;

    public gw0(l3 l3Var, int i) {
        this.b = l3Var;
        this.a = i;
    }

    public final int a(int i) {
        ra0 b = b();
        int a = b.a(16);
        if (a != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) b.d;
            int i2 = a + b.a;
            return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [xq0, java.lang.Object] */
    public final ra0 b() {
        ThreadLocal threadLocal = d;
        ra0 ra0Var = (ra0) threadLocal.get();
        ra0 ra0Var2 = ra0Var;
        if (ra0Var == null) {
            ?? xq0Var = new xq0();
            threadLocal.set(xq0Var);
            ra0Var2 = xq0Var;
        }
        sa0 sa0Var = (sa0) this.b.g;
        int a = sa0Var.a(6);
        if (a != 0) {
            int i = a + sa0Var.a;
            int i2 = (this.a * 4) + ((ByteBuffer) sa0Var.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) sa0Var.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) sa0Var.d;
            ra0Var2.d = byteBuffer;
            if (byteBuffer != null) {
                ra0Var2.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                ra0Var2.b = i4;
                ra0Var2.c = ((ByteBuffer) ra0Var2.d).getShort(i4);
                return ra0Var2;
            }
            ra0Var2.a = 0;
            ra0Var2.b = 0;
            ra0Var2.c = 0;
        }
        return ra0Var2;
    }

    public final String toString() {
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        ra0 b = b();
        int a = b.a(4);
        if (a != 0) {
            i = ((ByteBuffer) b.d).getInt(a + b.a);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        ra0 b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i3 = a2 + b2.a;
            i2 = ((ByteBuffer) b2.d).getInt(((ByteBuffer) b2.d).getInt(i3) + i3);
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(Integer.toHexString(a(i4)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
