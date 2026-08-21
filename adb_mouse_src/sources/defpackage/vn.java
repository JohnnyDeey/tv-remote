package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class vn implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ bo e;

    public /* synthetic */ vn(bo boVar, ArrayList arrayList, int i) {
        this.c = i;
        this.e = boVar;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        char c;
        int i = this.c;
        int i2 = 0;
        ArrayList arrayList = this.d;
        switch (i) {
            case 0:
                int size = arrayList.size();
                while (true) {
                    bo boVar = this.e;
                    if (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ao aoVar = (ao) obj;
                        di0 di0Var = aoVar.a;
                        int i3 = aoVar.b;
                        int i4 = aoVar.c;
                        int i5 = aoVar.d;
                        int i6 = aoVar.e;
                        boVar.getClass();
                        View view2 = di0Var.a;
                        int i7 = i5 - i3;
                        int i8 = i6 - i4;
                        if (i7 != 0) {
                            view2.animate().translationX(0.0f);
                        }
                        if (i8 != 0) {
                            view2.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view2.animate();
                        boVar.p.add(di0Var);
                        animate.setDuration(boVar.e).setListener(new xn(boVar, di0Var, i7, view2, i8, animate)).start();
                    } else {
                        arrayList.clear();
                        boVar.m.remove(arrayList);
                        return;
                    }
                }
            case 1:
                int size2 = arrayList.size();
                while (true) {
                    bo boVar2 = this.e;
                    if (i2 < size2) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        zn znVar = (zn) obj2;
                        ArrayList arrayList2 = boVar2.r;
                        long j = boVar2.f;
                        di0 di0Var2 = znVar.a;
                        View view3 = null;
                        if (di0Var2 == null) {
                            view = null;
                        } else {
                            view = di0Var2.a;
                        }
                        di0 di0Var3 = znVar.b;
                        if (di0Var3 != null) {
                            view3 = di0Var3.a;
                        }
                        View view4 = view3;
                        if (view != null) {
                            ViewPropertyAnimator duration = view.animate().setDuration(j);
                            arrayList2.add(znVar.a);
                            duration.translationX(znVar.e - znVar.c);
                            duration.translationY(znVar.f - znVar.d);
                            duration.alpha(0.0f).setListener(new yn(boVar2, znVar, duration, view, 0)).start();
                        }
                        if (view4 != null) {
                            ViewPropertyAnimator animate2 = view4.animate();
                            arrayList2.add(znVar.b);
                            c = 0;
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new yn(boVar2, znVar, animate2, view4, 1)).start();
                        } else {
                            c = 0;
                        }
                    } else {
                        arrayList.clear();
                        boVar2.n.remove(arrayList);
                        return;
                    }
                }
            default:
                int size3 = arrayList.size();
                while (true) {
                    bo boVar3 = this.e;
                    if (i2 < size3) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        di0 di0Var4 = (di0) obj3;
                        boVar3.getClass();
                        View view5 = di0Var4.a;
                        ViewPropertyAnimator animate3 = view5.animate();
                        boVar3.o.add(di0Var4);
                        animate3.alpha(1.0f).setDuration(boVar3.c).setListener(new wn(boVar3, di0Var4, view5, animate3)).start();
                    } else {
                        arrayList.clear();
                        boVar3.l.remove(arrayList);
                        return;
                    }
                }
        }
    }
}
