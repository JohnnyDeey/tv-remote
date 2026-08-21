package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class h11 extends f11 {
    public h11(m11 m11Var, WindowInsets windowInsets) {
        super(m11Var, windowInsets);
    }

    @Override // defpackage.z01, defpackage.i11
    public List<Rect> e(int i) {
        List<Rect> boundingRects;
        boundingRects = this.c.getBoundingRects(l11.a(i));
        return boundingRects;
    }

    @Override // defpackage.z01, defpackage.i11
    public List<Rect> f(int i) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.c.getBoundingRectsIgnoringVisibility(l11.a(i));
        return boundingRectsIgnoringVisibility;
    }

    @Override // defpackage.z01, defpackage.i11
    public void o() {
    }
}
