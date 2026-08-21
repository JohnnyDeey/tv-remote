package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class m9 extends bu0 {
    public ArrayList C;
    public boolean D;
    public int E;
    public boolean F;
    public int G;

    @Override // defpackage.bu0
    public final void A(long j) {
        ArrayList arrayList;
        this.e = j;
        if (j >= 0 && (arrayList = this.C) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bu0) this.C.get(i)).A(j);
            }
        }
    }

    @Override // defpackage.bu0
    public final void B(gi0 gi0Var) {
        this.G |= 8;
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((bu0) this.C.get(i)).B(gi0Var);
        }
    }

    @Override // defpackage.bu0
    public final void C(TimeInterpolator timeInterpolator) {
        this.G |= 1;
        ArrayList arrayList = this.C;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bu0) this.C.get(i)).C(timeInterpolator);
            }
        }
        this.f = timeInterpolator;
    }

    @Override // defpackage.bu0
    public final void D(vj0 vj0Var) {
        super.D(vj0Var);
        this.G |= 4;
        if (this.C != null) {
            for (int i = 0; i < this.C.size(); i++) {
                ((bu0) this.C.get(i)).D(vj0Var);
            }
        }
    }

    @Override // defpackage.bu0
    public final void E() {
        this.G |= 2;
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((bu0) this.C.get(i)).E();
        }
    }

    @Override // defpackage.bu0
    public final void F(long j) {
        this.d = j;
    }

    @Override // defpackage.bu0
    public final String H(String str) {
        String H = super.H(str);
        for (int i = 0; i < this.C.size(); i++) {
            H = H + "\n" + ((bu0) this.C.get(i)).H(str.concat("  "));
        }
        return H;
    }

    public final void I(bu0 bu0Var) {
        this.C.add(bu0Var);
        bu0Var.k = this;
        long j = this.e;
        if (j >= 0) {
            bu0Var.A(j);
        }
        if ((this.G & 1) != 0) {
            bu0Var.C(this.f);
        }
        if ((this.G & 2) != 0) {
            bu0Var.E();
        }
        if ((this.G & 4) != 0) {
            bu0Var.D(this.x);
        }
        if ((this.G & 8) != 0) {
            bu0Var.B(null);
        }
    }

    @Override // defpackage.bu0
    public final void c() {
        super.c();
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((bu0) this.C.get(i)).c();
        }
    }

    @Override // defpackage.bu0
    public final void d(ju0 ju0Var) {
        View view = ju0Var.b;
        if (t(view)) {
            ArrayList arrayList = this.C;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                bu0 bu0Var = (bu0) obj;
                if (bu0Var.t(view)) {
                    bu0Var.d(ju0Var);
                    ju0Var.c.add(bu0Var);
                }
            }
        }
    }

    @Override // defpackage.bu0
    public final void f(ju0 ju0Var) {
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((bu0) this.C.get(i)).f(ju0Var);
        }
    }

    @Override // defpackage.bu0
    public final void g(ju0 ju0Var) {
        View view = ju0Var.b;
        if (t(view)) {
            ArrayList arrayList = this.C;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                bu0 bu0Var = (bu0) obj;
                if (bu0Var.t(view)) {
                    bu0Var.g(ju0Var);
                    ju0Var.c.add(bu0Var);
                }
            }
        }
    }

    @Override // defpackage.bu0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final bu0 clone() {
        m9 m9Var = (m9) super.clone();
        m9Var.C = new ArrayList();
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            bu0 clone = ((bu0) this.C.get(i)).clone();
            m9Var.C.add(clone);
            clone.k = m9Var;
        }
        return m9Var;
    }

    @Override // defpackage.bu0
    public final void l(ViewGroup viewGroup, l3 l3Var, l3 l3Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.d;
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            bu0 bu0Var = (bu0) this.C.get(i);
            if (j > 0 && (this.D || i == 0)) {
                long j2 = bu0Var.d;
                if (j2 > 0) {
                    bu0Var.F(j2 + j);
                } else {
                    bu0Var.F(j);
                }
            }
            bu0Var.l(viewGroup, l3Var, l3Var2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.bu0
    public final void w(View view) {
        super.w(view);
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((bu0) this.C.get(i)).w(view);
        }
    }

    @Override // defpackage.bu0
    public final bu0 x(au0 au0Var) {
        super.x(au0Var);
        return this;
    }

    @Override // defpackage.bu0
    public final void y(View view) {
        super.y(view);
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((bu0) this.C.get(i)).y(view);
        }
    }

    @Override // defpackage.bu0
    public final void z() {
        ArrayList arrayList;
        if (this.C.isEmpty()) {
            G();
            m();
            return;
        }
        gu0 gu0Var = new gu0();
        gu0Var.b = this;
        ArrayList arrayList2 = this.C;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((bu0) obj).a(gu0Var);
        }
        this.E = this.C.size();
        if (!this.D) {
            int i3 = 1;
            while (true) {
                int size2 = this.C.size();
                arrayList = this.C;
                if (i3 >= size2) {
                    break;
                }
                ((bu0) arrayList.get(i3 - 1)).a(new gu0((bu0) this.C.get(i3)));
                i3++;
            }
            bu0 bu0Var = (bu0) arrayList.get(0);
            if (bu0Var != null) {
                bu0Var.z();
                return;
            }
            return;
        }
        ArrayList arrayList3 = this.C;
        int size3 = arrayList3.size();
        while (i < size3) {
            Object obj2 = arrayList3.get(i);
            i++;
            ((bu0) obj2).z();
        }
    }
}
