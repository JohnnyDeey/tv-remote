package defpackage;

/* loaded from: classes.dex */
public final class me {
    public byte[] a;
    public int b = 0;
    public int c = 0;
    public boolean d = false;

    public me(int i) {
        byte[] bArr;
        if (i == 0) {
            bArr = ht0.e;
        } else {
            bArr = new byte[i];
        }
        this.a = bArr;
    }

    public static int b(int i) {
        int i2 = i | (i >> 1);
        int i3 = i2 | (i2 >> 2);
        int i4 = i3 | (i3 >> 4);
        int i5 = i4 | (i4 >> 8);
        return (i5 | (i5 >> 16)) + 1;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (!this.d) {
            int i3 = this.c;
            if (i3 == 0) {
                if (i2 > this.a.length) {
                    this.a = new byte[b(i2 | 256)];
                }
            } else {
                if (this.b + i3 + i2 > this.a.length) {
                    int b = b(i3 + i2);
                    byte[] bArr2 = this.a;
                    if (b > bArr2.length) {
                        byte[] bArr3 = new byte[b];
                        System.arraycopy(bArr2, this.b, bArr3, 0, this.c);
                        this.a = bArr3;
                    } else {
                        System.arraycopy(bArr2, this.b, bArr2, 0, this.c);
                    }
                }
                System.arraycopy(bArr, i, this.a, this.b + this.c, i2);
                this.c += i2;
                return;
            }
            this.b = 0;
            System.arraycopy(bArr, i, this.a, this.b + this.c, i2);
            this.c += i2;
            return;
        }
        c.o("Cannot add data to read-only buffer");
    }

    public final void c(byte[] bArr, int i, int i2) {
        if (bArr.length - i >= i2) {
            if (this.c >= i2) {
                System.arraycopy(this.a, this.b, bArr, i, i2);
                int i3 = this.c;
                if (i2 <= i3) {
                    this.c = i3 - i2;
                    this.b += i2;
                    return;
                } else {
                    c.h("Cannot remove ", i2, " bytes, only got ", this.c);
                    return;
                }
            }
            c.o("Not enough data to read");
            return;
        }
        throw new IllegalArgumentException("Buffer size of " + bArr.length + " is too small for a read of " + i2 + " bytes");
    }

    public final void d() {
        int i = this.c;
        if (i == 0) {
            this.a = ht0.e;
        } else {
            int b = b(i);
            byte[] bArr = this.a;
            if (b < bArr.length) {
                byte[] bArr2 = new byte[b];
                System.arraycopy(bArr, this.b, bArr2, 0, this.c);
                this.a = bArr2;
            } else {
                return;
            }
        }
        this.b = 0;
    }
}
