package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class rz0 extends qz0 {
    @Override // defpackage.mi0
    public final float B(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // defpackage.mi0
    public final void N(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.qz0
    public final void k0(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.qz0
    public final void l0(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.qz0
    public final void m0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.qz0
    public final void n0(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}
