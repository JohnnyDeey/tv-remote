package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class x40 implements xt {
    public final int c;
    public final s40 d;
    public final y40 e;
    public final byte[][] f;

    public x40(int i, s40 s40Var, y40 y40Var, byte[][] bArr) {
        this.c = i;
        this.d = s40Var;
        this.e = y40Var;
        this.f = bArr;
    }

    public static x40 a(Object obj) {
        if (obj instanceof x40) {
            return (x40) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            int readInt = dataInputStream.readInt();
            s40 a = s40.a(obj);
            y40 y40Var = (y40) y40.e.get(Integer.valueOf(dataInputStream.readInt()));
            int i = y40Var.c;
            byte[][] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                byte[] bArr2 = new byte[y40Var.b];
                bArr[i2] = bArr2;
                dataInputStream.readFully(bArr2);
            }
            return new x40(readInt, a, y40Var, bArr);
        }
        DataInputStream dataInputStream2 = null;
        if (obj instanceof byte[]) {
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    x40 a2 = a(dataInputStream3);
                    dataInputStream3.close();
                    return a2;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream2 = dataInputStream3;
                    if (dataInputStream2 != null) {
                        dataInputStream2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (obj instanceof InputStream) {
                return a(gi0.j((InputStream) obj));
            }
            c.r(obj, "cannot parse ");
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r1 != null) goto L28;
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
            if (r4 == 0) goto L3e
            java.lang.Class<x40> r1 = defpackage.x40.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L10
            goto L3e
        L10:
            x40 r4 = (defpackage.x40) r4
            int r1 = r3.c
            int r2 = r4.c
            if (r1 == r2) goto L19
            goto L3e
        L19:
            s40 r1 = r4.d
            s40 r2 = r3.d
            if (r2 == 0) goto L26
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L29
            goto L3e
        L26:
            if (r1 == 0) goto L29
            goto L3e
        L29:
            y40 r1 = r4.e
            y40 r2 = r3.e
            if (r2 == 0) goto L32
            if (r2 == r1) goto L35
            return r0
        L32:
            if (r1 == 0) goto L35
            goto L3e
        L35:
            byte[][] r3 = r3.f
            byte[][] r4 = r4.f
            boolean r3 = java.util.Arrays.deepEquals(r3, r4)
            return r3
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x40.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.xt
    public final byte[] getEncoded() {
        v vVar = new v();
        vVar.h(this.c);
        vVar.b(this.d.getEncoded());
        vVar.h(this.e.a);
        byte[][] bArr = this.f;
        try {
            int length = bArr.length;
            int i = 0;
            while (true) {
                ByteArrayOutputStream byteArrayOutputStream = vVar.a;
                if (i < length) {
                    byteArrayOutputStream.write(bArr[i]);
                    i++;
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Exception e) {
            f40.k(e.getMessage(), e);
            return null;
        }
    }

    public final int hashCode() {
        int i;
        int i2 = this.c * 31;
        int i3 = 0;
        s40 s40Var = this.d;
        if (s40Var != null) {
            i = s40Var.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        y40 y40Var = this.e;
        if (y40Var != null) {
            i3 = y40Var.hashCode();
        }
        return Arrays.deepHashCode(this.f) + ((i4 + i3) * 31);
    }
}
