package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.ak;
import defpackage.g10;
import defpackage.gg0;
import defpackage.uz0;
import defpackage.wv;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class Flow extends uz0 {
    public final wv l;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, gd] */
    /* JADX WARN: Type inference failed for: r8v1, types: [g10, wv] */
    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new int[32];
        this.i = new HashMap();
        this.e = context;
        super.g(attributeSet);
        ?? g10Var = new g10();
        g10Var.s0 = 0;
        g10Var.t0 = 0;
        g10Var.u0 = 0;
        g10Var.v0 = 0;
        g10Var.w0 = 0;
        g10Var.x0 = 0;
        g10Var.y0 = false;
        g10Var.z0 = 0;
        g10Var.A0 = 0;
        g10Var.B0 = new Object();
        g10Var.C0 = null;
        g10Var.D0 = -1;
        g10Var.E0 = -1;
        g10Var.F0 = -1;
        g10Var.G0 = -1;
        g10Var.H0 = -1;
        g10Var.I0 = -1;
        g10Var.J0 = 0.5f;
        g10Var.K0 = 0.5f;
        g10Var.L0 = 0.5f;
        g10Var.M0 = 0.5f;
        g10Var.N0 = 0.5f;
        g10Var.O0 = 0.5f;
        g10Var.P0 = 0;
        g10Var.Q0 = 0;
        g10Var.R0 = 2;
        g10Var.S0 = 2;
        g10Var.T0 = 0;
        g10Var.U0 = -1;
        g10Var.V0 = 0;
        g10Var.W0 = new ArrayList();
        g10Var.X0 = null;
        g10Var.Y0 = null;
        g10Var.Z0 = null;
        g10Var.b1 = 0;
        this.l = g10Var;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, gg0.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.l.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    wv wvVar = this.l;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    wvVar.s0 = dimensionPixelSize;
                    wvVar.t0 = dimensionPixelSize;
                    wvVar.u0 = dimensionPixelSize;
                    wvVar.v0 = dimensionPixelSize;
                } else if (index == 18) {
                    wv wvVar2 = this.l;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    wvVar2.u0 = dimensionPixelSize2;
                    wvVar2.w0 = dimensionPixelSize2;
                    wvVar2.x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.l.v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.l.w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.l.s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.l.x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.l.t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.l.T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.l.D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.l.E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.l.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.l.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.l.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.l.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.l.J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.l.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.l.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.l.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.l.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.l.K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.l.R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.l.S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.l.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.l.Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.l.U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f = this.l;
        i();
    }

    @Override // defpackage.oj
    public final void h(ak akVar, boolean z) {
        wv wvVar = this.l;
        int i = wvVar.u0;
        if (i <= 0 && wvVar.v0 <= 0) {
            return;
        }
        if (z) {
            wvVar.w0 = wvVar.v0;
            wvVar.x0 = i;
        } else {
            wvVar.w0 = i;
            wvVar.x0 = wvVar.v0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0732  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v46 */
    @Override // defpackage.uz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.wv r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.j(wv, int, int):void");
    }

    @Override // defpackage.oj, android.view.View
    public final void onMeasure(int i, int i2) {
        j(this.l, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.l.L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.l.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.l.M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.l.G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.l.R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.l.J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.l.P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.l.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.l.N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.l.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.l.O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.l.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.l.U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.l.V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        wv wvVar = this.l;
        wvVar.s0 = i;
        wvVar.t0 = i;
        wvVar.u0 = i;
        wvVar.v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.l.t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.l.w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.l.x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.l.s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.l.S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.l.K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.l.Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.l.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.l.T0 = i;
        requestLayout();
    }
}
