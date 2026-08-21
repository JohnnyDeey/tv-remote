package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class kh implements jh {
    public final Class a;

    static {
        List asList = Arrays.asList(ky.class, vy.class, zy.class, az.class, bz.class, cz.class, dz.class, ez.class, fz.class, gz.class, ly.class, my.class, ny.class, oy.class, py.class, qy.class, ry.class, sy.class, ty.class, uy.class, wy.class, xy.class, yy.class);
        asList.getClass();
        ArrayList arrayList = new ArrayList(ii.n0(asList));
        int i = 0;
        for (Object obj : asList) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new td0((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        q80.U(arrayList);
    }

    public kh(Class cls) {
        this.a = cls;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof kh) && f20.C(this).equals(f20.C((kh) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return f20.C(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
