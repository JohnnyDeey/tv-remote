package defpackage;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class v {
    public final ByteArrayOutputStream a;

    public v() {
        this.a = new ByteArrayOutputStream();
    }

    public static int e(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i != 0) {
                i2++;
            } else {
                return i2;
            }
        }
    }

    public static int f(int i, boolean z) {
        return e(i) + (z ? 1 : 0) + i;
    }

    public static int g(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i != 0) {
                i2++;
            } else {
                return i2;
            }
        }
    }

    public void a(xt xtVar) {
        try {
            this.a.write(xtVar.getEncoded());
        } catch (Exception e) {
            f40.k(e.getMessage(), e);
        }
    }

    public void b(byte[] bArr) {
        try {
            this.a.write(bArr);
        } catch (Exception e) {
            f40.k(e.getMessage(), e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lm, v] */
    public lm c() {
        return new v(this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v, cn] */
    public cn d() {
        return new v(this.a);
    }

    public void h(int i) {
        ByteArrayOutputStream byteArrayOutputStream = this.a;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
    }

    public void i(int i) {
        this.a.write(i);
    }

    public void j(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }

    public void k(int i) {
        if (i < 128) {
            i(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | 128);
                j(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    public void l(i[] iVarArr) {
        for (i iVar : iVarArr) {
            iVar.c().j(this, true);
        }
    }

    public void m(int i, boolean z, byte[] bArr) {
        p(i, z);
        k(bArr.length);
        j(bArr, 0, bArr.length);
    }

    public void n(boolean z, int i, i[] iVarArr) {
        p(i, z);
        i(128);
        l(iVarArr);
        i(0);
        i(0);
    }

    public void o(int i, int i2) {
        if (i2 < 31) {
            i(i | i2);
            return;
        }
        byte[] bArr = new byte[6];
        int i3 = 5;
        bArr[5] = (byte) (i2 & 127);
        while (i2 > 127) {
            i2 >>>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        }
        int i4 = i3 - 1;
        bArr[i4] = (byte) (i | 31);
        j(bArr, i4, 6 - i4);
    }

    public void p(int i, boolean z) {
        if (z) {
            i(i);
        }
    }

    public void q(x xVar) {
        xVar.j(this, true);
    }

    public void r(x[] xVarArr) {
        for (x xVar : xVarArr) {
            xVar.j(this, true);
        }
    }

    public v(ByteArrayOutputStream byteArrayOutputStream) {
        this.a = byteArrayOutputStream;
    }
}
