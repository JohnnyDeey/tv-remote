package defpackage;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class uh0 {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public uh0(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f = Collections.unmodifiableList(arrayList);
        this.a = 2;
        this.b = 2;
    }

    public void a(di0 di0Var, boolean z) {
        f1 f1Var;
        RecyclerView.j(di0Var);
        View view = di0Var.a;
        RecyclerView recyclerView = (RecyclerView) this.h;
        fi0 fi0Var = recyclerView.o0;
        if (fi0Var != null) {
            f1 j = fi0Var.j();
            if (j instanceof ei0) {
                f1Var = (f1) ((ei0) j).e.remove(view);
            } else {
                f1Var = null;
            }
            ry0.m(view, f1Var);
        }
        if (z) {
            ArrayList arrayList = recyclerView.p;
            if (arrayList.size() <= 0) {
                if (recyclerView.h0 != null) {
                    recyclerView.h.k(di0Var);
                }
            } else {
                arrayList.get(0).getClass();
                c.a();
                return;
            }
        }
        di0Var.s = null;
        di0Var.r = null;
        th0 c = c();
        c.getClass();
        int i = di0Var.f;
        ArrayList arrayList2 = c.a(i).a;
        if (((sh0) c.a.get(i)).b <= arrayList2.size()) {
            return;
        }
        di0Var.m();
        arrayList2.add(di0Var);
    }

    public int b(int i) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        ai0 ai0Var = recyclerView.h0;
        if (i >= 0 && i < ai0Var.b()) {
            if (!ai0Var.g) {
                return i;
            }
            return recyclerView.f.k(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + ai0Var.b() + recyclerView.y());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, th0] */
    public th0 c() {
        if (((th0) this.g) == null) {
            ?? obj = new Object();
            obj.a = new SparseArray();
            obj.b = 0;
            this.g = obj;
        }
        return (th0) this.g;
    }

    public View d(int i) {
        return j(i, Long.MAX_VALUE).a;
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.A0;
        qz qzVar = ((RecyclerView) this.h).g0;
        int[] iArr2 = (int[]) qzVar.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        qzVar.c = 0;
    }

    public void f(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        a((di0) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        di0 I = RecyclerView.I(view);
        if (I.j()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (I.i()) {
            I.n.k(I);
        } else if (I.p()) {
            I.j &= -33;
        }
        h(I);
        if (recyclerView.M != null && !I.g()) {
            recyclerView.M.d(I);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(defpackage.di0 r12) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh0.h(di0):void");
    }

    public void i(View view) {
        kh0 kh0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        di0 I = RecyclerView.I(view);
        if ((I.j & 12) == 0 && I.k() && (kh0Var = recyclerView.M) != null) {
            bo boVar = (bo) kh0Var;
            if (I.c().isEmpty() && boVar.g && !I.f()) {
                if (((ArrayList) this.d) == null) {
                    this.d = new ArrayList();
                }
                I.n = this;
                I.o = true;
                ((ArrayList) this.d).add(I);
                return;
            }
        }
        if (I.f() && !I.h() && !recyclerView.n.b) {
            c.k("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.y()));
            return;
        }
        I.n = this;
        I.o = false;
        ((ArrayList) this.c).add(I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:255:0x0441, code lost:
    
        if (r12.f() == false) goto L241;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0569 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x009e  */
    /* JADX WARN: Type inference failed for: r3v32, types: [yb0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.di0 j(int r27, long r28) {
        /*
            Method dump skipped, instructions count: 1440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh0.j(int, long):di0");
    }

    public void k(di0 di0Var) {
        if (di0Var.o) {
            ((ArrayList) this.d).remove(di0Var);
        } else {
            ((ArrayList) this.c).remove(di0Var);
        }
        di0Var.n = null;
        di0Var.o = false;
        di0Var.j &= -33;
    }

    public void l() {
        int i;
        ArrayList arrayList = (ArrayList) this.e;
        oh0 oh0Var = ((RecyclerView) this.h).o;
        if (oh0Var != null) {
            i = oh0Var.j;
        } else {
            i = 0;
        }
        this.b = this.a + i;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            f(size);
        }
    }

    public uh0(j21 j21Var) {
        this.a = 0;
        this.b = -1;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.c = j21Var;
    }
}
