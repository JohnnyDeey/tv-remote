package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class yk implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ yk(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                WeakHashMap weakHashMap = ry0.a;
                float z3 = ((View) obj).getZ();
                float z4 = ((View) obj2).getZ();
                if (z3 > z4) {
                    return -1;
                }
                if (z3 < z4) {
                    return 1;
                }
                return 0;
            case 1:
                rz rzVar = (rz) obj;
                rz rzVar2 = (rz) obj2;
                RecyclerView recyclerView = rzVar.d;
                if (recyclerView == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (rzVar2.d == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z != z2) {
                    if (recyclerView == null) {
                        return 1;
                    }
                } else {
                    boolean z5 = rzVar.a;
                    if (z5 != rzVar2.a) {
                        if (!z5) {
                            return 1;
                        }
                    } else {
                        int i = rzVar2.b - rzVar.b;
                        if (i == 0) {
                            int i2 = rzVar.c - rzVar2.c;
                            if (i2 == 0) {
                                return 0;
                            }
                            return i2;
                        }
                        return i;
                    }
                }
                return -1;
            case 2:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 3:
                return ((ro0) obj).d - ((ro0) obj2).d;
            default:
                return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }
}
