package defpackage;

import android.graphics.Rect;
import java.util.Comparator;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class jw implements Comparator {
    public final Rect a = new Rect();
    public final Rect b = new Rect();
    public final boolean c;
    public final vj0 d;

    public jw(vj0 vj0Var, boolean z) {
        this.c = z;
        this.d = vj0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.d.getClass();
        Rect rect = this.a;
        ((s1) obj).f(rect);
        Rect rect2 = this.b;
        ((s1) obj2).f(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i >= i2) {
            if (i <= i2) {
                int i3 = rect.left;
                int i4 = rect2.left;
                boolean z = this.c;
                if (i3 < i4) {
                    if (!z) {
                        return -1;
                    }
                    return 1;
                }
                if (i3 > i4) {
                    if (z) {
                        return -1;
                    }
                    return 1;
                }
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 >= i6) {
                    if (i5 <= i6) {
                        int i7 = rect.right;
                        int i8 = rect2.right;
                        if (i7 < i8) {
                            if (!z) {
                                return -1;
                            }
                            return 1;
                        }
                        if (i7 > i8) {
                            if (z) {
                                return -1;
                            }
                            return 1;
                        }
                        return 0;
                    }
                    return 1;
                }
                return -1;
            }
            return 1;
        }
        return -1;
    }
}
