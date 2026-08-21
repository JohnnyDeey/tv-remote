package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v40 extends t40 {
    public static final u40 n;
    public static final u40[] o;
    public final byte[] d;
    public final y40 e;
    public final r40 f;
    public final int g;
    public final byte[] h;
    public final WeakHashMap i;
    public final int j;
    public final mq k;
    public int l;
    public w40 m;

    static {
        u40 u40Var = new u40(1);
        n = u40Var;
        u40[] u40VarArr = new u40[129];
        o = u40VarArr;
        u40VarArr[1] = u40Var;
        int i = 2;
        while (true) {
            u40[] u40VarArr2 = o;
            if (i < u40VarArr2.length) {
                u40VarArr2[i] = new u40(i);
                i++;
            } else {
                return;
            }
        }
    }

    public v40(y40 y40Var, r40 r40Var, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        this.e = y40Var;
        this.f = r40Var;
        this.l = i;
        this.d = f20.e(bArr);
        this.g = i2;
        this.h = f20.e(bArr2);
        this.j = 1 << (y40Var.c + 1);
        this.i = new WeakHashMap();
        this.k = wv0.u(y40Var.b, y40Var.d);
    }

    public static v40 e(Object obj) {
        Throwable th;
        if (obj instanceof v40) {
            return (v40) obj;
        }
        DataInputStream dataInputStream = null;
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() == 0) {
                y40 y40Var = (y40) y40.e.get(Integer.valueOf(dataInputStream2.readInt()));
                r40 r40Var = (r40) r40.g.get(Integer.valueOf(dataInputStream2.readInt()));
                byte[] bArr = new byte[16];
                dataInputStream2.readFully(bArr);
                int readInt = dataInputStream2.readInt();
                int readInt2 = dataInputStream2.readInt();
                int readInt3 = dataInputStream2.readInt();
                if (readInt3 >= 0) {
                    if (readInt3 <= dataInputStream2.available()) {
                        byte[] bArr2 = new byte[readInt3];
                        dataInputStream2.readFully(bArr2);
                        return new v40(y40Var, r40Var, readInt, bArr, readInt2, bArr2);
                    }
                    throw new IOException("secret length exceeded " + dataInputStream2.available());
                }
                c.o("secret length less than zero");
                return null;
            }
            c.o("expected version 0 lms private key");
            return null;
        }
        if (obj instanceof byte[]) {
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    v40 e = e(dataInputStream3);
                    dataInputStream3.close();
                    return e;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream3;
                    if (dataInputStream != null) {
                        dataInputStream.close();
                        throw th;
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            if (obj instanceof InputStream) {
                return e(gi0.j((InputStream) obj));
            }
            c.r(obj, "cannot parse ");
            return null;
        }
    }

    public final byte[] a(int i) {
        byte[] bArr;
        byte b;
        byte b2;
        byte b3;
        byte b4;
        mq u;
        ByteArrayOutputStream byteArrayOutputStream;
        boolean z;
        int i2 = 1 << this.e.c;
        byte[] bArr2 = this.d;
        mq mqVar = this.k;
        if (i >= i2) {
            byte[] e = f20.e(bArr2);
            mqVar.update(e, 0, e.length);
            k20.s0(i, mqVar);
            mqVar.d((byte) -126);
            mqVar.d((byte) -126);
            byte[] e2 = f20.e(bArr2);
            int i3 = i - i2;
            byte[] e3 = f20.e(this.h);
            r40 r40Var = this.f;
            mq A = wv0.A(r40Var);
            s sVar = r40Var.f;
            int i4 = r40Var.b;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream2.write(e2);
                b = (byte) (i3 >>> 24);
                byteArrayOutputStream2.write(b);
                b2 = (byte) (i3 >>> 16);
                byteArrayOutputStream2.write(b2);
                b3 = (byte) (i3 >>> 8);
                byteArrayOutputStream2.write(b3);
                b4 = (byte) i3;
                byteArrayOutputStream2.write(b4);
                byteArrayOutputStream2.write(-128);
                byteArrayOutputStream2.write(-128);
                while (true) {
                    bArr = null;
                    if (byteArrayOutputStream2.size() >= 22) {
                        break;
                    }
                    byteArrayOutputStream2.write(0);
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                A.update(byteArray, 0, byteArray.length);
                u = wv0.u(i4, sVar);
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e4) {
                e = e4;
                bArr = null;
            }
            try {
                byteArrayOutputStream.write(e2);
                byteArrayOutputStream.write(b);
                byteArrayOutputStream.write(b2);
                byteArrayOutputStream.write(b3);
                byteArrayOutputStream.write(b4);
                int b5 = u.b() + 23;
                while (byteArrayOutputStream.size() < b5) {
                    byteArrayOutputStream.write(0);
                }
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                e20 e20Var = new e20(e2, e3, wv0.u(i4, sVar));
                e20Var.a = i3;
                e20Var.b = 0;
                int i5 = r40Var.d;
                int i6 = (1 << r40Var.c) - 1;
                for (int i7 = 0; i7 < i5; i7++) {
                    if (i7 < i5 - 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    e20Var.a(23, z, byteArray2);
                    short s = (short) i7;
                    byteArray2[20] = (byte) (s >>> 8);
                    byteArray2[21] = (byte) s;
                    for (int i8 = 0; i8 < i6; i8++) {
                        byteArray2[22] = (byte) i8;
                        u.update(byteArray2, 0, byteArray2.length);
                        u.c(23, byteArray2);
                    }
                    A.update(byteArray2, 23, i4);
                }
                int b6 = A.b();
                byte[] bArr3 = new byte[b6];
                A.c(0, bArr3);
                mqVar.update(bArr3, 0, b6);
                byte[] bArr4 = new byte[mqVar.b()];
                mqVar.c(0, bArr4);
                return bArr4;
            } catch (Exception e5) {
                e = e5;
                f40.k(e.getMessage(), e);
                return bArr;
            }
        }
        int i9 = i * 2;
        byte[] b7 = b(i9);
        byte[] b8 = b(i9 + 1);
        byte[] e6 = f20.e(bArr2);
        mqVar.update(e6, 0, e6.length);
        k20.s0(i, mqVar);
        mqVar.d((byte) -125);
        mqVar.d((byte) -125);
        mqVar.update(b7, 0, b7.length);
        mqVar.update(b8, 0, b8.length);
        byte[] bArr5 = new byte[mqVar.b()];
        mqVar.c(0, bArr5);
        return bArr5;
    }

    public final byte[] b(int i) {
        u40 u40Var;
        if (i < this.j) {
            if (i < 129) {
                u40Var = o[i];
            } else {
                u40Var = new u40(i);
            }
            return c(u40Var);
        }
        return a(i);
    }

    public final byte[] c(u40 u40Var) {
        synchronized (this.i) {
            try {
                byte[] bArr = (byte[]) this.i.get(u40Var);
                if (bArr != null) {
                    return bArr;
                }
                byte[] a = a(u40Var.a);
                this.i.put(u40Var, a);
                return a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized int d() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v40.class != obj.getClass()) {
            return false;
        }
        v40 v40Var = (v40) obj;
        if (this.l != v40Var.l || this.g != v40Var.g || !Arrays.equals(this.d, v40Var.d)) {
            return false;
        }
        y40 y40Var = v40Var.e;
        y40 y40Var2 = this.e;
        if (y40Var2 == null ? y40Var != null : !y40Var2.equals(y40Var)) {
            return false;
        }
        r40 r40Var = v40Var.f;
        r40 r40Var2 = this.f;
        if (r40Var2 == null ? r40Var != null : !r40Var2.equals(r40Var)) {
            return false;
        }
        if (Arrays.equals(this.h, v40Var.h)) {
            return true;
        }
        return false;
    }

    public final w40 f() {
        w40 w40Var;
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new w40(this.e, this.f, c(n), this.d);
                }
                w40Var = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return w40Var;
    }

    @Override // defpackage.xt
    public final byte[] getEncoded() {
        v vVar = new v();
        vVar.h(0);
        vVar.h(this.e.a);
        vVar.h(this.f.a);
        vVar.b(this.d);
        vVar.h(this.l);
        vVar.h(this.g);
        byte[] bArr = this.h;
        vVar.h(bArr.length);
        vVar.b(bArr);
        return vVar.a.toByteArray();
    }

    public final int hashCode() {
        int i;
        int K = (f20.K(this.d) + (this.l * 31)) * 31;
        int i2 = 0;
        y40 y40Var = this.e;
        if (y40Var != null) {
            i = y40Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = (K + i) * 31;
        r40 r40Var = this.f;
        if (r40Var != null) {
            i2 = r40Var.hashCode();
        }
        return f20.K(this.h) + ((((i3 + i2) * 31) + this.g) * 31);
    }
}
