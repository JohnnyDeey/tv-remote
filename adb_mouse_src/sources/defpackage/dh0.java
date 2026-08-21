package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class dh0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ RecyclerView d;

    public /* synthetic */ dh0(RecyclerView recyclerView, int i) {
        this.c = i;
        this.d = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        long j;
        int i = this.c;
        RecyclerView recyclerView = this.d;
        switch (i) {
            case 0:
                if (recyclerView.v && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.t) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.y) {
                        recyclerView.x = true;
                        return;
                    } else {
                        recyclerView.m();
                        return;
                    }
                }
                return;
            default:
                kh0 kh0Var = recyclerView.M;
                if (kh0Var != null) {
                    bo boVar = (bo) kh0Var;
                    long j2 = boVar.d;
                    ArrayList arrayList = boVar.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = boVar.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = boVar.k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = boVar.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            di0 di0Var = (di0) obj;
                            View view = di0Var.a;
                            ArrayList arrayList5 = arrayList;
                            ViewPropertyAnimator animate = view.animate();
                            boVar.q.add(di0Var);
                            animate.setDuration(j2).alpha(0.0f).setListener(new wn(boVar, di0Var, animate, view)).start();
                            arrayList = arrayList5;
                            isEmpty = isEmpty;
                            isEmpty2 = isEmpty2;
                        }
                        boolean z2 = isEmpty;
                        boolean z3 = isEmpty2;
                        arrayList.clear();
                        if (!z3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList2);
                            boVar.m.add(arrayList6);
                            arrayList2.clear();
                            vn vnVar = new vn(boVar, arrayList6, 0);
                            if (!z2) {
                                View view2 = ((ao) arrayList6.get(0)).a.a;
                                WeakHashMap weakHashMap = ry0.a;
                                view2.postOnAnimationDelayed(vnVar, j2);
                            } else {
                                vnVar.run();
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList3);
                            boVar.n.add(arrayList7);
                            arrayList3.clear();
                            vn vnVar2 = new vn(boVar, arrayList7, 1);
                            if (!z2) {
                                View view3 = ((zn) arrayList7.get(0)).a.a;
                                WeakHashMap weakHashMap2 = ry0.a;
                                view3.postOnAnimationDelayed(vnVar2, j2);
                            } else {
                                vnVar2.run();
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.addAll(arrayList4);
                            boVar.l.add(arrayList8);
                            arrayList4.clear();
                            vn vnVar3 = new vn(boVar, arrayList8, 2);
                            if (z2 && z3 && isEmpty3) {
                                vnVar3.run();
                            } else {
                                long j3 = 0;
                                if (z2) {
                                    j2 = 0;
                                }
                                if (!z3) {
                                    j = boVar.e;
                                } else {
                                    j = 0;
                                }
                                if (!isEmpty3) {
                                    j3 = boVar.f;
                                }
                                long max = Math.max(j, j3) + j2;
                                z = false;
                                View view4 = ((di0) arrayList8.get(0)).a;
                                WeakHashMap weakHashMap3 = ry0.a;
                                view4.postOnAnimationDelayed(vnVar3, max);
                                recyclerView.n0 = z;
                                return;
                            }
                        }
                    }
                }
                z = false;
                recyclerView.n0 = z;
                return;
        }
    }
}
