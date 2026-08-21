package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class mh0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh0 b;

    public /* synthetic */ mh0(oh0 oh0Var, int i) {
        this.a = i;
        this.b = oh0Var;
    }

    public final int a(View view) {
        int right;
        int i;
        switch (this.a) {
            case 0:
                ph0 ph0Var = (ph0) view.getLayoutParams();
                right = view.getRight() + ((ph0) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) ph0Var).rightMargin;
                break;
            default:
                ph0 ph0Var2 = (ph0) view.getLayoutParams();
                right = view.getBottom() + ((ph0) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) ph0Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    public final int b(View view) {
        int left;
        int i;
        switch (this.a) {
            case 0:
                ph0 ph0Var = (ph0) view.getLayoutParams();
                left = view.getLeft() - ((ph0) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) ph0Var).leftMargin;
                break;
            default:
                ph0 ph0Var2 = (ph0) view.getLayoutParams();
                left = view.getTop() - ((ph0) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) ph0Var2).topMargin;
                break;
        }
        return left - i;
    }

    public final int c() {
        int i;
        int F;
        int i2 = this.a;
        oh0 oh0Var = this.b;
        switch (i2) {
            case 0:
                i = oh0Var.n;
                F = oh0Var.F();
                break;
            default:
                i = oh0Var.o;
                F = oh0Var.D();
                break;
        }
        return i - F;
    }

    public final int d() {
        int i = this.a;
        oh0 oh0Var = this.b;
        switch (i) {
            case 0:
                return oh0Var.E();
            default:
                return oh0Var.G();
        }
    }
}
