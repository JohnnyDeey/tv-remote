package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class bo extends kh0 {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((di0) arrayList.get(size)).a.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [zn, java.lang.Object] */
    @Override // defpackage.kh0
    public final boolean a(di0 di0Var, di0 di0Var2, yb0 yb0Var, yb0 yb0Var2) {
        int i;
        int i2;
        int i3 = yb0Var.a;
        int i4 = yb0Var.b;
        if (di0Var2.o()) {
            int i5 = yb0Var.a;
            i2 = yb0Var.b;
            i = i5;
        } else {
            i = yb0Var2.a;
            i2 = yb0Var2.b;
        }
        if (di0Var == di0Var2) {
            return g(di0Var, i3, i4, i, i2);
        }
        View view = di0Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(di0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = di0Var2.a;
        l(di0Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        ?? obj = new Object();
        obj.a = di0Var;
        obj.b = di0Var2;
        obj.c = i3;
        obj.d = i4;
        obj.e = i;
        obj.f = i2;
        arrayList.add(obj);
        return true;
    }

    @Override // defpackage.kh0
    public final void d(di0 di0Var) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = di0Var.a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((ao) arrayList4.get(size)).a == di0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(di0Var);
                arrayList4.remove(size);
            }
        }
        j(this.k, di0Var);
        if (this.h.remove(di0Var)) {
            view.setAlpha(1.0f);
            c(di0Var);
        }
        if (this.i.remove(di0Var)) {
            view.setAlpha(1.0f);
            c(di0Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, di0Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((ao) arrayList6.get(size4)).a == di0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(di0Var);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(di0Var)) {
                view.setAlpha(1.0f);
                c(di0Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(di0Var);
        this.o.remove(di0Var);
        this.r.remove(di0Var);
        this.p.remove(di0Var);
        i();
    }

    @Override // defpackage.kh0
    public final void e() {
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.n;
        ArrayList arrayList3 = this.l;
        ArrayList arrayList4 = this.m;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ao aoVar = (ao) arrayList7.get(size);
            View view = aoVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(aoVar.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((di0) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            di0 di0Var = (di0) arrayList5.get(size3);
            di0Var.a.setAlpha(1.0f);
            c(di0Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            zn znVar = (zn) arrayList.get(size4);
            di0 di0Var2 = znVar.a;
            if (di0Var2 != null) {
                k(znVar, di0Var2);
            }
            di0 di0Var3 = znVar.b;
            if (di0Var3 != null) {
                k(znVar, di0Var3);
            }
        }
        arrayList.clear();
        if (!f()) {
            return;
        }
        for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
            for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                ao aoVar2 = (ao) arrayList8.get(size6);
                View view2 = aoVar2.a.a;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                c(aoVar2.a);
                arrayList8.remove(size6);
                if (arrayList8.isEmpty()) {
                    arrayList4.remove(arrayList8);
                }
            }
        }
        for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
            for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                di0 di0Var4 = (di0) arrayList9.get(size8);
                di0Var4.a.setAlpha(1.0f);
                c(di0Var4);
                arrayList9.remove(size8);
                if (arrayList9.isEmpty()) {
                    arrayList3.remove(arrayList9);
                }
            }
        }
        for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                zn znVar2 = (zn) arrayList10.get(size10);
                di0 di0Var5 = znVar2.a;
                if (di0Var5 != null) {
                    k(znVar2, di0Var5);
                }
                di0 di0Var6 = znVar2.b;
                if (di0Var6 != null) {
                    k(znVar2, di0Var6);
                }
                if (arrayList10.isEmpty()) {
                    arrayList2.remove(arrayList10);
                }
            }
        }
        h(this.q);
        h(this.p);
        h(this.o);
        h(this.r);
        ArrayList arrayList11 = this.b;
        if (arrayList11.size() <= 0) {
            arrayList11.clear();
        } else {
            arrayList11.get(0).getClass();
            c.a();
        }
    }

    @Override // defpackage.kh0
    public final boolean f() {
        if (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ao] */
    public final boolean g(di0 di0Var, int i, int i2, int i3, int i4) {
        View view = di0Var.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) di0Var.a.getTranslationY());
        l(di0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(di0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        ?? obj = new Object();
        obj.a = di0Var;
        obj.b = translationX;
        obj.c = translationY;
        obj.d = i3;
        obj.e = i4;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                arrayList.get(0).getClass();
                c.a();
            }
        }
    }

    public final void j(ArrayList arrayList, di0 di0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zn znVar = (zn) arrayList.get(size);
            if (k(znVar, di0Var) && znVar.a == null && znVar.b == null) {
                arrayList.remove(znVar);
            }
        }
    }

    public final boolean k(zn znVar, di0 di0Var) {
        if (znVar.b == di0Var) {
            znVar.b = null;
        } else if (znVar.a == di0Var) {
            znVar.a = null;
        } else {
            return false;
        }
        View view = di0Var.a;
        View view2 = di0Var.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(di0Var);
        return true;
    }

    public final void l(di0 di0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        di0Var.a.animate().setInterpolator(s);
        d(di0Var);
    }
}
