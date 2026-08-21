package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class z80 extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ c90 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z80(c90 c90Var, int i, int i2) {
        super(i);
        this.F = c90Var;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(ai0 ai0Var, int[] iArr) {
        c90 c90Var = this.F;
        RecyclerView recyclerView = c90Var.d0;
        if (this.E == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = c90Var.d0.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = c90Var.d0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.oh0
    public final void y0(RecyclerView recyclerView, int i) {
        lf lfVar = new lf(recyclerView.getContext());
        lfVar.a = i;
        z0(lfVar);
    }
}
