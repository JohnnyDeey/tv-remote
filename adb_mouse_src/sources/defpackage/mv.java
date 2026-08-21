package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class mv extends rh0 {
    public final /* synthetic */ ov a;

    public mv(ov ovVar) {
        this.a = ovVar;
    }

    @Override // defpackage.rh0
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        ov ovVar = this.a;
        int i3 = ovVar.a;
        int computeVerticalScrollRange = ovVar.s.computeVerticalScrollRange();
        int i4 = ovVar.r;
        if (computeVerticalScrollRange - i4 > 0 && i4 >= i3) {
            z = true;
        } else {
            z = false;
        }
        ovVar.t = z;
        int computeHorizontalScrollRange = ovVar.s.computeHorizontalScrollRange();
        int i5 = ovVar.q;
        if (computeHorizontalScrollRange - i5 > 0 && i5 >= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        ovVar.u = z2;
        boolean z3 = ovVar.t;
        if (!z3 && !z2) {
            if (ovVar.v != 0) {
                ovVar.g(0);
                return;
            }
            return;
        }
        if (z3) {
            float f = i4;
            ovVar.l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            ovVar.k = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
        }
        if (ovVar.u) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i5;
            ovVar.o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            ovVar.n = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
        }
        int i6 = ovVar.v;
        if (i6 != 0 && i6 != 1) {
            return;
        }
        ovVar.g(1);
    }
}
