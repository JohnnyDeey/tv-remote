package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class fh0 {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ fh0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(j3 j3Var) {
        int i = j3Var.a;
        RecyclerView recyclerView = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        return;
                    }
                    recyclerView.o.Z(j3Var.b, j3Var.d);
                    return;
                }
                recyclerView.o.b0(j3Var.b, j3Var.d);
                return;
            }
            recyclerView.o.a0(j3Var.b, j3Var.d);
            return;
        }
        recyclerView.o.X(j3Var.b, j3Var.d);
    }

    public di0 b(int i) {
        RecyclerView recyclerView = this.a;
        int F = recyclerView.g.F();
        int i2 = 0;
        di0 di0Var = null;
        while (true) {
            if (i2 >= F) {
                break;
            }
            di0 I = RecyclerView.I(recyclerView.g.E(i2));
            if (I != null && !I.h() && I.c == i) {
                if (((ArrayList) recyclerView.g.f).contains(I.a)) {
                    di0Var = I;
                } else {
                    di0Var = I;
                    break;
                }
            }
            i2++;
        }
        if (di0Var != null) {
            if (!((ArrayList) recyclerView.g.f).contains(di0Var.a)) {
                return di0Var;
            }
        }
        return null;
    }

    public void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int F = recyclerView.g.F();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < F; i6++) {
            View E = recyclerView.g.E(i6);
            di0 I = RecyclerView.I(E);
            if (I != null && !I.o() && (i4 = I.c) >= i && i4 < i5) {
                I.a(2);
                if (obj == null) {
                    I.a(1024);
                } else if ((1024 & I.j) == 0) {
                    if (I.k == null) {
                        ArrayList arrayList = new ArrayList();
                        I.k = arrayList;
                        I.l = Collections.unmodifiableList(arrayList);
                    }
                    I.k.add(obj);
                }
                ((ph0) E.getLayoutParams()).c = true;
            }
        }
        uh0 uh0Var = recyclerView.d;
        ArrayList arrayList2 = (ArrayList) uh0Var.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            di0 di0Var = (di0) arrayList2.get(size);
            if (di0Var != null && (i3 = di0Var.c) >= i && i3 < i5) {
                di0Var.a(2);
                uh0Var.f(size);
            }
        }
        recyclerView.l0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int F = recyclerView.g.F();
        for (int i3 = 0; i3 < F; i3++) {
            di0 I = RecyclerView.I(recyclerView.g.E(i3));
            if (I != null && !I.o() && I.c >= i) {
                I.l(i2, false);
                recyclerView.h0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.d.e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            di0 di0Var = (di0) arrayList.get(i4);
            if (di0Var != null && di0Var.c >= i) {
                di0Var.l(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.k0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.a;
        int F = recyclerView.g.F();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < F; i11++) {
            di0 I = RecyclerView.I(recyclerView.g.E(i11));
            if (I != null && (i9 = I.c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    I.l(i2 - i, false);
                } else {
                    I.l(i5, false);
                }
                recyclerView.h0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.d.e;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            di0 di0Var = (di0) arrayList.get(i12);
            if (di0Var != null && (i8 = di0Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    di0Var.l(i2 - i, false);
                } else {
                    di0Var.l(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.k0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(defpackage.di0 r8, defpackage.yb0 r9, defpackage.yb0 r10) {
        /*
            r7 = this;
            r0 = 0
            r8.n(r0)
            androidx.recyclerview.widget.RecyclerView r7 = r7.a
            kh0 r0 = r7.M
            r1 = r0
            bo r1 = (defpackage.bo) r1
            if (r9 == 0) goto L1d
            r1.getClass()
            int r3 = r9.a
            int r5 = r10.a
            if (r3 != r5) goto L1f
            int r0 = r9.b
            int r2 = r10.b
            if (r0 == r2) goto L1d
            goto L1f
        L1d:
            r2 = r8
            goto L29
        L1f:
            int r4 = r9.b
            int r6 = r10.b
            r2 = r8
            boolean r8 = r1.g(r2, r3, r4, r5, r6)
            goto L38
        L29:
            r1.l(r2)
            android.view.View r8 = r2.a
            r9 = 0
            r8.setAlpha(r9)
            java.util.ArrayList r8 = r1.i
            r8.add(r2)
            r8 = 1
        L38:
            if (r8 == 0) goto L3d
            r7.S()
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fh0.f(di0, yb0, yb0):void");
    }

    public void g(di0 di0Var, yb0 yb0Var, yb0 yb0Var2) {
        int i;
        int i2;
        boolean z;
        RecyclerView recyclerView = this.a;
        recyclerView.d.k(di0Var);
        recyclerView.f(di0Var);
        di0Var.n(false);
        bo boVar = (bo) recyclerView.M;
        boVar.getClass();
        int i3 = yb0Var.a;
        int i4 = yb0Var.b;
        View view = di0Var.a;
        if (yb0Var2 == null) {
            i = view.getLeft();
        } else {
            i = yb0Var2.a;
        }
        int i5 = i;
        if (yb0Var2 == null) {
            i2 = view.getTop();
        } else {
            i2 = yb0Var2.b;
        }
        int i6 = i2;
        if (!di0Var.h() && (i3 != i5 || i4 != i6)) {
            view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
            z = boVar.g(di0Var, i3, i4, i5, i6);
        } else {
            boVar.l(di0Var);
            boVar.h.add(di0Var);
            z = true;
        }
        if (z) {
            recyclerView.S();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
