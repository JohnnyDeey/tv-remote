package defpackage;

/* loaded from: classes.dex */
public final class de0 {
    public final /* synthetic */ int a;
    public final b8[] b;

    public de0(rj rjVar, int i) {
        this.a = i;
        int i2 = 0;
        switch (i) {
            case 1:
                int i3 = rjVar.c;
                this.b = new b8[i3];
                while (i2 < i3) {
                    this.b[i2] = new b8(rjVar);
                    i2++;
                }
                return;
            default:
                int i4 = rjVar.b;
                this.b = new b8[i4];
                while (i2 < i4) {
                    this.b[i2] = new b8(rjVar);
                    i2++;
                }
                return;
        }
    }

    public void a() {
        int i = 0;
        while (true) {
            b8[] b8VarArr = this.b;
            if (i < b8VarArr.length) {
                b8 b8Var = b8VarArr[i];
                for (int i2 = 0; i2 < 256; i2++) {
                    int[] iArr = (int[]) b8Var.d;
                    int i3 = iArr[i2];
                    iArr[i2] = i3 + ((i3 >> 31) & 8380417);
                }
                b8Var.getClass();
                i++;
            } else {
                return;
            }
        }
    }

    public void b() {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            b8[] b8VarArr = this.b;
            if (i3 < b8VarArr.length) {
                b8 b8Var = b8VarArr[i3];
                int[] iArr = (int[]) b8Var.d;
                int D = f20.D(i2, iArr.length);
                int[] iArr2 = new int[D];
                System.arraycopy(iArr, i2, iArr2, i2, Math.min(iArr.length, D));
                int i4 = 1;
                int i5 = 256;
                while (i4 < 256) {
                    for (int i6 = i2; i6 < 256; i6 = i + i4) {
                        i5--;
                        int i7 = wv0.l[i5] * (-1);
                        i = i6;
                        while (i < i6 + i4) {
                            int i8 = iArr2[i];
                            int i9 = i + i4;
                            iArr2[i] = iArr2[i9] + i8;
                            int i10 = i8 - iArr2[i9];
                            iArr2[i9] = i10;
                            iArr2[i9] = hi0.i(i7 * i10);
                            i++;
                        }
                    }
                    i4 <<= 1;
                    i2 = 0;
                }
                for (int i11 = 0; i11 < 256; i11++) {
                    iArr2[i11] = hi0.i(iArr2[i11] * 41978);
                }
                b8Var.d = iArr2;
                i3++;
                i2 = 0;
            } else {
                return;
            }
        }
    }

    public void c() {
        int i;
        int i2 = 0;
        while (true) {
            b8[] b8VarArr = this.b;
            if (i2 < b8VarArr.length) {
                b8 b8Var = b8VarArr[i2];
                int[] iArr = (int[]) b8Var.d;
                int D = f20.D(0, iArr.length);
                int[] iArr2 = new int[D];
                System.arraycopy(iArr, 0, iArr2, 0, Math.min(iArr.length, D));
                int i3 = 0;
                for (int i4 = 128; i4 > 0; i4 >>>= 1) {
                    for (int i5 = 0; i5 < 256; i5 = i + i4) {
                        i3++;
                        int i6 = wv0.l[i3];
                        i = i5;
                        while (i < i5 + i4) {
                            int i7 = hi0.i(i6 * iArr2[r11]);
                            iArr2[i + i4] = iArr2[i] - i7;
                            iArr2[i] = iArr2[i] + i7;
                            i++;
                        }
                    }
                }
                b8Var.d = iArr2;
                i2++;
            } else {
                return;
            }
        }
    }

    public void d(de0 de0Var) {
        int i = 0;
        while (true) {
            b8[] b8VarArr = this.b;
            if (i < b8VarArr.length) {
                b8 b8Var = b8VarArr[i];
                b8 b8Var2 = de0Var.b[i];
                int[] iArr = (int[]) b8Var.d;
                int[] iArr2 = (int[]) b8Var2.d;
                for (int i2 = 0; i2 < 256; i2++) {
                    int i3 = iArr[i2];
                    int i4 = i3 + 4095;
                    iArr[i2] = i4 >> 13;
                    iArr2[i2] = i3 - (i4 & (-8192));
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void e() {
        int i = 0;
        while (true) {
            b8[] b8VarArr = this.b;
            if (i < b8VarArr.length) {
                b8 b8Var = b8VarArr[i];
                for (int i2 = 0; i2 < 256; i2++) {
                    int[] iArr = (int[]) b8Var.d;
                    int i3 = iArr[i2];
                    iArr[i2] = i3 - (((4194304 + i3) >> 23) * 8380417);
                }
                b8Var.getClass();
                i++;
            } else {
                return;
            }
        }
    }

    public final String toString() {
        int i = this.a;
        int i2 = 0;
        b8[] b8VarArr = this.b;
        switch (i) {
            case 0:
                String str = "[";
                while (i2 < b8VarArr.length) {
                    str = str + i2 + " " + b8VarArr[i2].toString();
                    if (i2 != b8VarArr.length - 1) {
                        str = str.concat(",\n");
                    }
                    i2++;
                }
                return str.concat("]");
            default:
                String str2 = "\n[";
                while (i2 < b8VarArr.length) {
                    str2 = str2 + "Inner Matrix " + i2 + " " + b8VarArr[i2].toString();
                    if (i2 != b8VarArr.length - 1) {
                        str2 = str2.concat(",\n");
                    }
                    i2++;
                }
                return str2.concat("]");
        }
    }
}
