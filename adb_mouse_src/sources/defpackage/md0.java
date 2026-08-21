package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class md0 extends ws {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ md0(oh0 oh0Var, int i) {
        super(oh0Var);
        this.d = i;
    }

    @Override // defpackage.ws
    public final int b(View view) {
        int right;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ph0 ph0Var = (ph0) view.getLayoutParams();
                ((oh0) obj).getClass();
                right = view.getRight() + ((ph0) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) ph0Var).rightMargin;
                break;
            default:
                ph0 ph0Var2 = (ph0) view.getLayoutParams();
                ((oh0) obj).getClass();
                right = view.getBottom() + ((ph0) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) ph0Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // defpackage.ws
    public final int c(View view) {
        int A;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ph0 ph0Var = (ph0) view.getLayoutParams();
                ((oh0) obj).getClass();
                A = oh0.A(view) + ((ViewGroup.MarginLayoutParams) ph0Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) ph0Var).rightMargin;
                break;
            default:
                ph0 ph0Var2 = (ph0) view.getLayoutParams();
                ((oh0) obj).getClass();
                A = oh0.z(view) + ((ViewGroup.MarginLayoutParams) ph0Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) ph0Var2).bottomMargin;
                break;
        }
        return A + i;
    }

    @Override // defpackage.ws
    public final int d(View view) {
        int z;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ph0 ph0Var = (ph0) view.getLayoutParams();
                ((oh0) obj).getClass();
                z = oh0.z(view) + ((ViewGroup.MarginLayoutParams) ph0Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) ph0Var).bottomMargin;
                break;
            default:
                ph0 ph0Var2 = (ph0) view.getLayoutParams();
                ((oh0) obj).getClass();
                z = oh0.A(view) + ((ViewGroup.MarginLayoutParams) ph0Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) ph0Var2).rightMargin;
                break;
        }
        return z + i;
    }

    @Override // defpackage.ws
    public final int e(View view) {
        int left;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ph0 ph0Var = (ph0) view.getLayoutParams();
                ((oh0) obj).getClass();
                left = view.getLeft() - ((ph0) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) ph0Var).leftMargin;
                break;
            default:
                ph0 ph0Var2 = (ph0) view.getLayoutParams();
                ((oh0) obj).getClass();
                left = view.getTop() - ((ph0) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) ph0Var2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // defpackage.ws
    public final int f() {
        switch (this.d) {
            case 0:
                return ((oh0) this.b).n;
            default:
                return ((oh0) this.b).o;
        }
    }

    @Override // defpackage.ws
    public final int g() {
        int i;
        int F;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                oh0 oh0Var = (oh0) obj;
                i = oh0Var.n;
                F = oh0Var.F();
                break;
            default:
                oh0 oh0Var2 = (oh0) obj;
                i = oh0Var2.o;
                F = oh0Var2.D();
                break;
        }
        return i - F;
    }

    @Override // defpackage.ws
    public final int h() {
        switch (this.d) {
            case 0:
                return ((oh0) this.b).F();
            default:
                return ((oh0) this.b).D();
        }
    }

    @Override // defpackage.ws
    public final int i() {
        switch (this.d) {
            case 0:
                return ((oh0) this.b).l;
            default:
                return ((oh0) this.b).m;
        }
    }

    @Override // defpackage.ws
    public final int j() {
        switch (this.d) {
            case 0:
                return ((oh0) this.b).m;
            default:
                return ((oh0) this.b).l;
        }
    }

    @Override // defpackage.ws
    public final int k() {
        switch (this.d) {
            case 0:
                return ((oh0) this.b).E();
            default:
                return ((oh0) this.b).G();
        }
    }

    @Override // defpackage.ws
    public final int l() {
        int E;
        int F;
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                oh0 oh0Var = (oh0) obj;
                E = oh0Var.n - oh0Var.E();
                F = oh0Var.F();
                break;
            default:
                oh0 oh0Var2 = (oh0) obj;
                E = oh0Var2.o - oh0Var2.G();
                F = oh0Var2.D();
                break;
        }
        return E - F;
    }

    @Override // defpackage.ws
    public final int m(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((oh0) obj2).K(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((oh0) obj2).K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // defpackage.ws
    public final int n(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((oh0) obj2).K(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((oh0) obj2).K(view, rect2);
                return rect2.top;
        }
    }

    @Override // defpackage.ws
    public final void o(int i) {
        switch (this.d) {
            case 0:
                ((oh0) this.b).O(i);
                return;
            default:
                ((oh0) this.b).P(i);
                return;
        }
    }
}
