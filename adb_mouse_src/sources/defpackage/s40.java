package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s40 implements xt {
    public final r40 c;
    public final byte[] d;
    public final byte[] e;

    public s40(r40 r40Var, byte[] bArr, byte[] bArr2) {
        this.c = r40Var;
        this.d = bArr;
        this.e = bArr2;
    }

    public static s40 a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof s40) {
            return (s40) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            r40 r40Var = (r40) r40.g.get(Integer.valueOf(dataInputStream2.readInt()));
            byte[] bArr = new byte[r40Var.b];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[r40Var.d * r40Var.b];
            dataInputStream2.readFully(bArr2);
            return new s40(r40Var, bArr, bArr2);
        }
        DataInputStream dataInputStream3 = null;
        if (obj instanceof byte[]) {
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
            }
            try {
                s40 a = a(dataInputStream);
                dataInputStream.close();
                return a;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream3 = dataInputStream;
                if (dataInputStream3 != null) {
                    dataInputStream3.close();
                }
                throw th;
            }
        }
        if (obj instanceof InputStream) {
            return a(gi0.j((InputStream) obj));
        }
        c.r(obj, "cannot parse ");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001b, code lost:
    
        if (r1 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            if (r3 != r4) goto L4
            r3 = 1
            return r3
        L4:
            r0 = 0
            if (r4 == 0) goto L32
            java.lang.Class<s40> r1 = defpackage.s40.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L10
            goto L32
        L10:
            s40 r4 = (defpackage.s40) r4
            r40 r1 = r4.c
            r40 r2 = r3.c
            if (r2 == 0) goto L1b
            if (r2 == r1) goto L1e
            return r0
        L1b:
            if (r1 == 0) goto L1e
            goto L32
        L1e:
            byte[] r1 = r3.d
            byte[] r2 = r4.d
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 != 0) goto L29
            goto L32
        L29:
            byte[] r3 = r3.e
            byte[] r4 = r4.e
            boolean r3 = java.util.Arrays.equals(r3, r4)
            return r3
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s40.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.xt
    public final byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.c.a;
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write((byte) i);
        try {
            byteArrayOutputStream.write(this.d);
            byteArrayOutputStream.write(this.e);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            f40.k(e.getMessage(), e);
            return null;
        }
    }

    public final int hashCode() {
        int i;
        r40 r40Var = this.c;
        if (r40Var != null) {
            i = r40Var.hashCode();
        } else {
            i = 0;
        }
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.e) + ((hashCode + (i * 31)) * 31);
    }
}
