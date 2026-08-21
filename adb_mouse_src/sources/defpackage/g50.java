package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class g50 extends mi0 {
    public final /* synthetic */ int d;
    public final SideSheetBehavior e;

    public /* synthetic */ g50(SideSheetBehavior sideSheetBehavior, int i) {
        this.d = i;
        this.e = sideSheetBehavior;
    }

    @Override // defpackage.mi0
    public final int A() {
        switch (this.d) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // defpackage.mi0
    public final boolean C(float f) {
        switch (this.d) {
            case 0:
                if (f > 0.0f) {
                    return true;
                }
                return false;
            default:
                if (f < 0.0f) {
                    return true;
                }
                return false;
        }
    }

    @Override // defpackage.mi0
    public final boolean E(View view) {
        switch (this.d) {
            case 0:
                if (view.getRight() >= (t() - v()) / 2) {
                    return false;
                }
                return true;
            default:
                if (view.getLeft() <= (t() + this.e.m) / 2) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.mi0
    public final boolean F(float f, float f2) {
        switch (this.d) {
            case 0:
                if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f) {
                    return true;
                }
                return false;
            default:
                if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f) {
                    return true;
                }
                return false;
        }
    }

    @Override // defpackage.mi0
    public final boolean O(View view, float f) {
        int i = this.d;
        SideSheetBehavior sideSheetBehavior = this.e;
        switch (i) {
            case 0:
                if (Math.abs((f * sideSheetBehavior.k) + view.getLeft()) <= 0.5f) {
                    return false;
                }
                return true;
            default:
                if (Math.abs((f * sideSheetBehavior.k) + view.getRight()) <= 0.5f) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.mi0
    public final void R(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.d;
        SideSheetBehavior sideSheetBehavior = this.e;
        switch (i3) {
            case 0:
                if (i <= sideSheetBehavior.m) {
                    marginLayoutParams.leftMargin = i2;
                    return;
                }
                return;
            default:
                int i4 = sideSheetBehavior.m;
                if (i <= i4) {
                    marginLayoutParams.rightMargin = i4 - i;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.mi0
    public final int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.d) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.mi0
    public final float d(int i) {
        switch (this.d) {
            case 0:
                float v = v();
                return (i - v) / (t() - v);
            default:
                float f = this.e.m;
                return (f - i) / (f - t());
        }
    }

    @Override // defpackage.mi0
    public final int t() {
        int i = this.d;
        SideSheetBehavior sideSheetBehavior = this.e;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.o);
        }
    }

    @Override // defpackage.mi0
    public final int v() {
        int i = this.d;
        SideSheetBehavior sideSheetBehavior = this.e;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.mi0
    public final int w() {
        int i = this.d;
        SideSheetBehavior sideSheetBehavior = this.e;
        switch (i) {
            case 0:
                return sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.mi0
    public final int x() {
        switch (this.d) {
            case 0:
                return -this.e.l;
            default:
                return t();
        }
    }

    @Override // defpackage.mi0
    public final int y(View view) {
        int i = this.d;
        SideSheetBehavior sideSheetBehavior = this.e;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.o;
            default:
                return view.getLeft() - sideSheetBehavior.o;
        }
    }

    @Override // defpackage.mi0
    public final int z(CoordinatorLayout coordinatorLayout) {
        switch (this.d) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }
}
