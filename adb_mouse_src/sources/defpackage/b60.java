package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class b60 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int b;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((di0) this.k.get(i2)).a;
            ph0 ph0Var = (ph0) view3.getLayoutParams();
            if (view3 != view && !ph0Var.a.h() && (b = (ph0Var.a.b() - this.d) * this.e) >= 0 && b < i) {
                view2 = view3;
                if (b == 0) {
                    break;
                } else {
                    i = b;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((ph0) view2.getLayoutParams()).a.b();
        }
    }

    public final View b(uh0 uh0Var) {
        List list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((di0) this.k.get(i)).a;
                ph0 ph0Var = (ph0) view.getLayoutParams();
                if (!ph0Var.a.h() && this.d == ph0Var.a.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View d = uh0Var.d(this.d);
        this.d += this.e;
        return d;
    }
}
