package defpackage;

import android.database.Observable;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class gh0 {
    public final hh0 a = new Observable();
    public boolean b = false;
    public final int c = 1;

    public abstract int a();

    public long b(int i) {
        return -1L;
    }

    public int c(int i) {
        return 0;
    }

    public abstract void d(di0 di0Var, int i);

    public abstract di0 e(ViewGroup viewGroup, int i);

    public final void f(boolean z) {
        if (!this.a.a()) {
            this.b = z;
        } else {
            c.o("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
    }
}
