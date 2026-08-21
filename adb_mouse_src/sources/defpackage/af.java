package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class af implements Runnable {
    public final /* synthetic */ int c;
    public final int d;
    public final Object e;

    public af(List list, int i, Throwable th) {
        this.c = 1;
        mn.k(list, "initCallbacks cannot be null");
        this.e = new ArrayList(list);
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        int i2 = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                wg0 wg0Var = (wg0) ((sb0) obj).c;
                if (wg0Var != null) {
                    wg0Var.v(i2);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 != 1) {
                    while (i3 < size) {
                        ((xs) arrayList.get(i3)).a();
                        i3++;
                    }
                    return;
                } else {
                    while (i3 < size) {
                        ((xs) arrayList.get(i3)).b();
                        i3++;
                    }
                    return;
                }
            case 2:
                RecyclerView recyclerView = ((c90) obj).d0;
                if (!recyclerView.y) {
                    oh0 oh0Var = recyclerView.o;
                    if (oh0Var == null) {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        return;
                    } else {
                        oh0Var.y0(recyclerView, i2);
                        return;
                    }
                }
                return;
            default:
                ((y21) obj).i(i2);
                return;
        }
    }

    public /* synthetic */ af(int i, int i2, Object obj) {
        this.c = i2;
        this.e = obj;
        this.d = i;
    }
}
