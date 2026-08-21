package defpackage;

import android.database.Observable;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class hh0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((wh0) ((Observable) this).mObservers.get(size)).a;
            recyclerView.i(null);
            recyclerView.h0.f = true;
            recyclerView.U(true);
            if (!recyclerView.f.n()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void c(int i, int i2, Preference preference) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            wh0 wh0Var = (wh0) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = wh0Var.a;
            recyclerView.i(null);
            k3 k3Var = recyclerView.f;
            ArrayList arrayList = (ArrayList) k3Var.c;
            if (i2 >= 1) {
                arrayList.add(k3Var.p(preference, 4, i, i2));
                k3Var.a = 4 | k3Var.a;
                if (arrayList.size() == 1) {
                    int[] iArr = RecyclerView.A0;
                    RecyclerView recyclerView2 = wh0Var.a;
                    if (recyclerView2.u && recyclerView2.t) {
                        dh0 dh0Var = recyclerView2.j;
                        WeakHashMap weakHashMap = ry0.a;
                        recyclerView2.postOnAnimation(dh0Var);
                    } else {
                        recyclerView2.B = true;
                        recyclerView2.requestLayout();
                    }
                }
            }
        }
    }
}
