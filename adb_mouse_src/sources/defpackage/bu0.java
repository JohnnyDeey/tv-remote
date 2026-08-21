package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class bu0 implements Cloneable {
    public ArrayList m;
    public ArrayList n;
    public au0[] o;
    public static final Animator[] y = new Animator[0];
    public static final int[] z = {2, 1, 3, 4};
    public static final vj0 A = new Object();
    public static final ThreadLocal B = new ThreadLocal();
    public final String c = getClass().getName();
    public long d = -1;
    public long e = -1;
    public TimeInterpolator f = null;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public l3 i = new l3(10);
    public l3 j = new l3(10);
    public m9 k = null;
    public final int[] l = z;
    public final ArrayList p = new ArrayList();
    public Animator[] q = y;
    public int r = 0;
    public boolean s = false;
    public boolean t = false;
    public bu0 u = null;
    public ArrayList v = null;
    public ArrayList w = new ArrayList();
    public vj0 x = A;

    public static void b(l3 l3Var, View view, ju0 ju0Var) {
        n8 n8Var = (n8) l3Var.g;
        n8 n8Var2 = (n8) l3Var.f;
        SparseArray sparseArray = (SparseArray) l3Var.d;
        r70 r70Var = (r70) l3Var.e;
        n8Var.put(view, ju0Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = ry0.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (n8Var2.containsKey(transitionName)) {
                n8Var2.put(transitionName, null);
            } else {
                n8Var2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (r70Var.c) {
                    int i = r70Var.f;
                    long[] jArr = r70Var.d;
                    Object[] objArr = r70Var.e;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != wv0.k) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    r70Var.c = false;
                    r70Var.f = i2;
                }
                if (wv0.l(r70Var.d, r70Var.f, itemIdAtPosition) >= 0) {
                    View view2 = (View) r70Var.b(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        r70Var.d(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                r70Var.d(itemIdAtPosition, view);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, n8, io0] */
    public static n8 p() {
        ThreadLocal threadLocal = B;
        n8 n8Var = (n8) threadLocal.get();
        if (n8Var == null) {
            ?? io0Var = new io0(0);
            threadLocal.set(io0Var);
            return io0Var;
        }
        return n8Var;
    }

    public static boolean u(ju0 ju0Var, ju0 ju0Var2, String str) {
        Object obj = ju0Var.a.get(str);
        Object obj2 = ju0Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j) {
        this.e = j;
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.f = timeInterpolator;
    }

    public void D(vj0 vj0Var) {
        if (vj0Var == null) {
            this.x = A;
        } else {
            this.x = vj0Var;
        }
    }

    public void F(long j) {
        this.d = j;
    }

    public final void G() {
        if (this.r == 0) {
            v(this, f40.d);
            this.t = false;
        }
        this.r++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.e != -1) {
            sb.append("dur(");
            sb.append(this.e);
            sb.append(") ");
        }
        if (this.d != -1) {
            sb.append("dly(");
            sb.append(this.d);
            sb.append(") ");
        }
        if (this.f != null) {
            sb.append("interp(");
            sb.append(this.f);
            sb.append(") ");
        }
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        ArrayList arrayList2 = this.h;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(au0 au0Var) {
        if (this.v == null) {
            this.v = new ArrayList();
        }
        this.v.add(au0Var);
    }

    public void c() {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.q);
        this.q = y;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.q = animatorArr;
        v(this, f40.f);
    }

    public abstract void d(ju0 ju0Var);

    public final void e(View view, boolean z2) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                ju0 ju0Var = new ju0(view);
                if (z2) {
                    g(ju0Var);
                } else {
                    d(ju0Var);
                }
                ju0Var.c.add(this);
                f(ju0Var);
                if (z2) {
                    b(this.i, view, ju0Var);
                } else {
                    b(this.j, view, ju0Var);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    e(viewGroup.getChildAt(i), z2);
                }
            }
        }
    }

    public abstract void g(ju0 ju0Var);

    public final void h(ViewGroup viewGroup, boolean z2) {
        i(z2);
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        ArrayList arrayList2 = this.h;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z2);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                ju0 ju0Var = new ju0(findViewById);
                if (z2) {
                    g(ju0Var);
                } else {
                    d(ju0Var);
                }
                ju0Var.c.add(this);
                f(ju0Var);
                if (z2) {
                    b(this.i, findViewById, ju0Var);
                } else {
                    b(this.j, findViewById, ju0Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            ju0 ju0Var2 = new ju0(view);
            if (z2) {
                g(ju0Var2);
            } else {
                d(ju0Var2);
            }
            ju0Var2.c.add(this);
            f(ju0Var2);
            if (z2) {
                b(this.i, view, ju0Var2);
            } else {
                b(this.j, view, ju0Var2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((n8) this.i.g).clear();
            ((SparseArray) this.i.d).clear();
            ((r70) this.i.e).a();
        } else {
            ((n8) this.j.g).clear();
            ((SparseArray) this.j.d).clear();
            ((r70) this.j.e).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public bu0 clone() {
        try {
            bu0 bu0Var = (bu0) super.clone();
            bu0Var.w = new ArrayList();
            bu0Var.i = new l3(10);
            bu0Var.j = new l3(10);
            bu0Var.m = null;
            bu0Var.n = null;
            bu0Var.u = this;
            bu0Var.v = null;
            return bu0Var;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator k(ViewGroup viewGroup, ju0 ju0Var, ju0 ju0Var2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [zt0, java.lang.Object] */
    public void l(ViewGroup viewGroup, l3 l3Var, l3 l3Var2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        ju0 ju0Var;
        Animator animator;
        ju0 ju0Var2;
        n8 p = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i3 = 0;
        while (i3 < size) {
            ju0 ju0Var3 = (ju0) arrayList.get(i3);
            ju0 ju0Var4 = (ju0) arrayList2.get(i3);
            if (ju0Var3 != null && !ju0Var3.c.contains(this)) {
                ju0Var3 = null;
            }
            if (ju0Var4 != null && !ju0Var4.c.contains(this)) {
                ju0Var4 = null;
            }
            if ((ju0Var3 != null || ju0Var4 != null) && (ju0Var3 == null || ju0Var4 == null || s(ju0Var3, ju0Var4))) {
                Animator k = k(viewGroup, ju0Var3, ju0Var4);
                if (k != null) {
                    String str = this.c;
                    if (ju0Var4 != null) {
                        view = ju0Var4.b;
                        String[] q = q();
                        if (q != null && q.length > 0) {
                            ju0Var2 = new ju0(view);
                            ju0 ju0Var5 = (ju0) ((n8) l3Var2.g).get(view);
                            i = size;
                            if (ju0Var5 != null) {
                                int i4 = 0;
                                while (i4 < q.length) {
                                    String str2 = q[i4];
                                    ju0Var2.a.put(str2, ju0Var5.a.get(str2));
                                    i4++;
                                    i3 = i3;
                                    ju0Var5 = ju0Var5;
                                }
                            }
                            i2 = i3;
                            int i5 = p.e;
                            int i6 = 0;
                            while (true) {
                                if (i6 < i5) {
                                    zt0 zt0Var = (zt0) p.get((Animator) p.f(i6));
                                    if (zt0Var.c != null && zt0Var.a == view && zt0Var.b.equals(str) && zt0Var.c.equals(ju0Var2)) {
                                        animator = null;
                                        break;
                                    }
                                    i6++;
                                } else {
                                    animator = k;
                                    break;
                                }
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = k;
                            ju0Var2 = null;
                        }
                        k = animator;
                        ju0Var = ju0Var2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = ju0Var3.b;
                        ju0Var = null;
                    }
                    if (k != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        ?? obj = new Object();
                        obj.a = view;
                        obj.b = str;
                        obj.c = ju0Var;
                        obj.d = windowId;
                        obj.e = this;
                        obj.f = k;
                        p.put(k, obj);
                        this.w.add(k);
                    }
                    i3 = i2 + 1;
                    size = i;
                }
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                zt0 zt0Var2 = (zt0) p.get((Animator) this.w.get(sparseIntArray.keyAt(i7)));
                zt0Var2.f.setStartDelay(zt0Var2.f.getStartDelay() + (sparseIntArray.valueAt(i7) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.r - 1;
        this.r = i;
        if (i == 0) {
            v(this, f40.e);
            for (int i2 = 0; i2 < ((r70) this.i.e).e(); i2++) {
                View view = (View) ((r70) this.i.e).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((r70) this.j.e).e(); i3++) {
                View view2 = (View) ((r70) this.j.e).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.t = true;
        }
    }

    public final ju0 n(View view, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        m9 m9Var = this.k;
        if (m9Var != null) {
            return m9Var.n(view, z2);
        }
        if (z2) {
            arrayList = this.m;
        } else {
            arrayList = this.n;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    ju0 ju0Var = (ju0) arrayList.get(i);
                    if (ju0Var != null) {
                        if (ju0Var.b == view) {
                            break;
                        }
                        i++;
                    } else {
                        return null;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                if (z2) {
                    arrayList2 = this.n;
                } else {
                    arrayList2 = this.m;
                }
                return (ju0) arrayList2.get(i);
            }
            return null;
        }
        return null;
    }

    public final bu0 o() {
        m9 m9Var = this.k;
        if (m9Var != null) {
            return m9Var.o();
        }
        return this;
    }

    public String[] q() {
        return null;
    }

    public final ju0 r(View view, boolean z2) {
        l3 l3Var;
        m9 m9Var = this.k;
        if (m9Var != null) {
            return m9Var.r(view, z2);
        }
        if (z2) {
            l3Var = this.i;
        } else {
            l3Var = this.j;
        }
        return (ju0) ((n8) l3Var.g).get(view);
    }

    public boolean s(ju0 ju0Var, ju0 ju0Var2) {
        if (ju0Var != null && ju0Var2 != null) {
            String[] q = q();
            if (q != null) {
                for (String str : q) {
                    if (u(ju0Var, ju0Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = ju0Var.a.keySet().iterator();
                while (it.hasNext()) {
                    if (u(ju0Var, ju0Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        ArrayList arrayList2 = this.h;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return H("");
    }

    public final void v(bu0 bu0Var, f40 f40Var) {
        bu0 bu0Var2 = this.u;
        if (bu0Var2 != null) {
            bu0Var2.v(bu0Var, f40Var);
        }
        ArrayList arrayList = this.v;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.v.size();
            au0[] au0VarArr = this.o;
            if (au0VarArr == null) {
                au0VarArr = new au0[size];
            }
            this.o = null;
            au0[] au0VarArr2 = (au0[]) this.v.toArray(au0VarArr);
            for (int i = 0; i < size; i++) {
                au0 au0Var = au0VarArr2[i];
                switch (f40Var.c) {
                    case 12:
                        au0Var.e(bu0Var);
                        break;
                    case 13:
                        au0Var.d(bu0Var);
                        break;
                    case 14:
                        au0Var.f(bu0Var);
                        break;
                    case 15:
                        au0Var.b();
                        break;
                    default:
                        au0Var.c();
                        break;
                }
                au0VarArr2[i] = null;
            }
            this.o = au0VarArr2;
        }
    }

    public void w(View view) {
        if (!this.t) {
            ArrayList arrayList = this.p;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.q);
            this.q = y;
            for (int i = size - 1; i >= 0; i--) {
                Animator animator = animatorArr[i];
                animatorArr[i] = null;
                animator.pause();
            }
            this.q = animatorArr;
            v(this, f40.g);
            this.s = true;
        }
    }

    public bu0 x(au0 au0Var) {
        bu0 bu0Var;
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            if (!arrayList.remove(au0Var) && (bu0Var = this.u) != null) {
                bu0Var.x(au0Var);
            }
            if (this.v.size() == 0) {
                this.v = null;
            }
        }
        return this;
    }

    public void y(View view) {
        if (this.s) {
            if (!this.t) {
                ArrayList arrayList = this.p;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.q);
                this.q = y;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.q = animatorArr;
                v(this, f40.h);
            }
            this.s = false;
        }
    }

    public void z() {
        G();
        n8 p = p();
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (p.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new yt0(this, p));
                    long j = this.e;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.d;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new g2(5, this));
                    animator.start();
                }
            }
        }
        this.w.clear();
        m();
    }

    public void E() {
    }

    public void B(gi0 gi0Var) {
    }

    public void f(ju0 ju0Var) {
    }
}
