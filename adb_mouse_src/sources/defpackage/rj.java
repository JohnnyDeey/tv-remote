package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class rj {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final Object g;
    public final Object h;

    public rj(int i, int i2) {
        int i3;
        switch (i2) {
            case 2:
                this.a = i;
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            this.c = 2;
                        } else {
                            c.k(qo0.n("K: ", i, " is not supported for Crystals Kyber"));
                            throw null;
                        }
                    } else {
                        this.c = 2;
                    }
                } else {
                    this.c = 3;
                }
                int i4 = i * 384;
                this.b = i4;
                int i5 = i4 + 32;
                this.d = i5;
                this.e = i4;
                this.f = i5;
                this.h = new l3(9);
                this.g = new s70(this);
                return;
            default:
                this.g = new ik0(256);
                if (i != 2) {
                    if (i != 3) {
                        if (i == 5) {
                            this.b = 8;
                            this.c = 7;
                            this.d = 2;
                            this.e = 524288;
                        } else {
                            c.k(qo0.n("The mode ", i, "is not supported by Crystals Dilithium!"));
                            throw null;
                        }
                    } else {
                        this.b = 6;
                        this.c = 5;
                        this.d = 4;
                        this.e = 524288;
                        this.a = 128;
                        this.h = new jp0(1);
                        this.f = (this.b * 320) + 32;
                        i3 = this.e;
                        if (i3 != 131072 || i3 == 524288) {
                            return;
                        }
                        f40.f("Wrong Dilithium Gamma1!");
                        throw null;
                    }
                } else {
                    this.b = 4;
                    this.c = 4;
                    this.d = 2;
                    this.e = 131072;
                }
                this.a = 96;
                this.h = new jp0(1);
                this.f = (this.b * 320) + 32;
                i3 = this.e;
                if (i3 != 131072) {
                    return;
                }
                f40.f("Wrong Dilithium Gamma1!");
                throw null;
        }
    }

    public static boolean b(int i, int i2, int i3) {
        if (i != i2) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public boolean a(byte[] bArr) {
        int i = this.a;
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 * 384;
            int i5 = -1;
            for (int i6 = 0; i6 < 128; i6++) {
                int i7 = (i6 * 3) + i4;
                int i8 = bArr[i7] & 255;
                int i9 = bArr[i7 + 1] & 255;
                i5 = i5 & (((short) ((i8 | (i9 << 8)) & 4095)) - 3329) & (((short) ((((bArr[i7 + 2] & 255) << 4) | (i9 >> 4)) & 4095)) - 3329);
            }
            i2 &= i5;
        }
        if (i2 >= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(defpackage.ak r18, defpackage.gd r19) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj.c(ak, gd):void");
    }

    public rj(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.g = constraintLayout2;
    }
}
