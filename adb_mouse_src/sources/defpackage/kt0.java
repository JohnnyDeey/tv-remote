package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class kt0 implements u2, u90 {
    public final /* synthetic */ Toolbar c;

    public /* synthetic */ kt0(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.u90
    public boolean d(w90 w90Var, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.u90
    public void k(w90 w90Var) {
        Toolbar toolbar = this.c;
        r2 r2Var = toolbar.c.v;
        if (r2Var != null && r2Var.h()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.I.f).iterator();
        while (it.hasNext()) {
            ((px) it.next()).a.s();
        }
    }
}
