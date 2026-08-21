package defpackage;

import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class l90 extends k20 {
    public final int G;

    public l90(int i) {
        super(19);
        this.G = i;
    }

    @Override // defpackage.k20
    public final float E(Object obj) {
        float[] fArr = ((m90) obj).D;
        if (fArr != null) {
            return fArr[this.G];
        }
        return 0.0f;
    }

    @Override // defpackage.k20
    public final void i0(Object obj, float f) {
        m90 m90Var = (m90) obj;
        float[] fArr = m90Var.D;
        if (fArr != null) {
            int i = this.G;
            if (fArr[i] != f) {
                fArr[i] = f;
                sf sfVar = m90Var.F;
                if (sfVar != null) {
                    float h = m90Var.h();
                    MaterialButton materialButton = (MaterialButton) sfVar.d;
                    int i2 = (int) (h * 0.11f);
                    if (materialButton.z != i2) {
                        materialButton.z = i2;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                m90Var.invalidateSelf();
            }
        }
    }
}
