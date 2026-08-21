package defpackage;

import android.content.res.ColorStateList;
import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class vo0 implements Cloneable {
    public /* synthetic */ int[] c;
    public /* synthetic */ Object[] d;
    public /* synthetic */ int e;

    public vo0() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.c = new int[i4];
        this.d = new Object[i4];
    }

    public final void a(int i, ColorStateList colorStateList) {
        int i2 = this.e;
        if (i2 != 0 && i <= this.c[i2 - 1]) {
            b(i, colorStateList);
            return;
        }
        if (i2 >= this.c.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            this.c = Arrays.copyOf(this.c, i6);
            this.d = Arrays.copyOf(this.d, i6);
        }
        this.c[i2] = i;
        this.d[i2] = colorStateList;
        this.e = i2 + 1;
    }

    public final void b(int i, Object obj) {
        int k = wv0.k(this.e, i, this.c);
        if (k >= 0) {
            this.d[k] = obj;
            return;
        }
        int i2 = ~k;
        int i3 = this.e;
        if (i2 < i3) {
            Object[] objArr = this.d;
            if (objArr[i2] == f20.p) {
                this.c[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.c.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.c = Arrays.copyOf(this.c, i7);
            this.d = Arrays.copyOf(this.d, i7);
        }
        int i8 = this.e;
        if (i8 - i2 != 0) {
            int[] iArr = this.c;
            int i9 = i2 + 1;
            s8.u0(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.d;
            s8.v0(objArr2, objArr2, i9, i2, this.e);
        }
        this.c[i2] = i;
        this.d[i2] = obj;
        this.e++;
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        vo0 vo0Var = (vo0) clone;
        vo0Var.c = (int[]) this.c.clone();
        vo0Var.d = (Object[]) this.d.clone();
        return vo0Var;
    }

    public final String toString() {
        int i = this.e;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.e;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.c[i3]);
            sb.append('=');
            Object obj = this.d[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
