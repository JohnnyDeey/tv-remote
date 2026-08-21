package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class cs extends k20 {
    public final /* synthetic */ int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cs(int i) {
        super(19);
        this.G = i;
    }

    @Override // defpackage.k20
    public final float E(Object obj) {
        switch (this.G) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getScaleX();
            case 2:
                return ((View) obj).getScaleY();
            case 3:
                return ((View) obj).getRotation();
            case 4:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }

    @Override // defpackage.k20
    public final void i0(Object obj, float f) {
        switch (this.G) {
            case 0:
                ((View) obj).setAlpha(f);
                return;
            case 1:
                ((View) obj).setScaleX(f);
                return;
            case 2:
                ((View) obj).setScaleY(f);
                return;
            case 3:
                ((View) obj).setRotation(f);
                return;
            case 4:
                ((View) obj).setRotationX(f);
                return;
            default:
                ((View) obj).setRotationY(f);
                return;
        }
    }
}
