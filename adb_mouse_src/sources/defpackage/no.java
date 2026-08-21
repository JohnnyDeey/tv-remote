package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class no {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d = false;
    public boolean e = false;

    public no(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static no f(ViewGroup viewGroup, vj0 vj0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof no) {
            return (no) tag;
        }
        vj0Var.getClass();
        no noVar = new no(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, noVar);
        return noVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, hf] */
    public final void a(int i, int i2, a aVar) {
        synchronized (this.b) {
            try {
                ?? obj = new Object();
                xo0 d = d(aVar.c);
                if (d != null) {
                    d.c(i, i2);
                    return;
                }
                xo0 xo0Var = new xo0(i, i2, aVar, obj);
                this.b.add(xo0Var);
                xo0Var.d.add(new wo0(this, xo0Var, 0));
                xo0Var.d.add(new wo0(this, xo0Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.Object, hf] */
    /* JADX WARN: Type inference failed for: r10v28, types: [java.lang.Object, hf] */
    /* JADX WARN: Type inference failed for: r15v7, types: [d6, lo, java.lang.Object] */
    public final void b(ArrayList arrayList, boolean z) {
        boolean z2;
        int i;
        ViewGroup viewGroup;
        boolean z3;
        boolean z4;
        ArrayList arrayList2 = arrayList;
        boolean z5 = z;
        int size = arrayList2.size();
        xo0 xo0Var = null;
        xo0 xo0Var2 = null;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            xo0 xo0Var3 = (xo0) obj;
            int c = qo0.c(xo0Var3.c.G);
            int C = qo0.C(xo0Var3.a);
            if (C != 0) {
                if (C != 1) {
                    if (C != 2 && C != 3) {
                    }
                } else if (c != 2) {
                    xo0Var2 = xo0Var3;
                }
            }
            if (c == 2 && xo0Var == null) {
                xo0Var = xo0Var3;
            }
        }
        if (vx.F(2)) {
            Log.v("FragmentManager", "Executing operations from " + xo0Var + " to " + xo0Var2);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList2);
        gx gxVar = ((xo0) arrayList2.get(arrayList2.size() - 1)).c;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            fx fxVar = ((xo0) obj2).c.J;
            fx fxVar2 = gxVar.J;
            fxVar.b = fxVar2.b;
            fxVar.c = fxVar2.c;
            fxVar.d = fxVar2.d;
            fxVar.e = fxVar2.e;
        }
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            xo0 xo0Var4 = (xo0) obj3;
            ?? obj4 = new Object();
            xo0Var4.d();
            HashSet hashSet = xo0Var4.e;
            hashSet.add(obj4);
            ?? d6Var = new d6(xo0Var4, obj4);
            d6Var.d = false;
            d6Var.c = z5;
            arrayList3.add(d6Var);
            ?? obj5 = new Object();
            xo0Var4.d();
            hashSet.add(obj5);
            if (!z5 ? xo0Var4 == xo0Var2 : xo0Var4 == xo0Var) {
                z4 = true;
            } else {
                z4 = false;
            }
            d6 d6Var2 = new d6(xo0Var4, obj5);
            int i5 = xo0Var4.a;
            gx gxVar2 = xo0Var4.c;
            if (i5 == 2) {
                if (z) {
                    fx fxVar3 = gxVar2.J;
                } else {
                    gxVar2.getClass();
                }
                if (z) {
                    fx fxVar4 = gxVar2.J;
                } else {
                    fx fxVar5 = gxVar2.J;
                }
            } else if (z) {
                fx fxVar6 = gxVar2.J;
            } else {
                gxVar2.getClass();
            }
            if (z4) {
                if (z) {
                    fx fxVar7 = gxVar2.J;
                } else {
                    gxVar2.getClass();
                }
            }
            arrayList4.add(d6Var2);
            xo0Var4.d.add(new m61(this, arrayList5, xo0Var4));
            arrayList2 = arrayList;
            z5 = z;
        }
        HashMap hashMap = new HashMap();
        int size4 = arrayList4.size();
        int i6 = 0;
        while (i6 < size4) {
            Object obj6 = arrayList4.get(i6);
            i6++;
            xo0 xo0Var5 = (xo0) ((mo) obj6).a;
            if (qo0.c(xo0Var5.c.G) != xo0Var5.a) {
            }
        }
        int size5 = arrayList4.size();
        int i7 = 0;
        while (i7 < size5) {
            Object obj7 = arrayList4.get(i7);
            i7++;
            mo moVar = (mo) obj7;
            hashMap.put((xo0) moVar.a, Boolean.FALSE);
            moVar.e();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup2 = this.a;
        Context context = viewGroup2.getContext();
        ArrayList arrayList6 = new ArrayList();
        int size6 = arrayList3.size();
        boolean z6 = false;
        int i8 = 0;
        while (i8 < size6) {
            Object obj8 = arrayList3.get(i8);
            int i9 = i8 + 1;
            lo loVar = (lo) obj8;
            boolean z7 = containsValue;
            xo0 xo0Var6 = (xo0) loVar.a;
            ArrayList arrayList7 = arrayList3;
            int c2 = qo0.c(xo0Var6.c.G);
            int i10 = xo0Var6.a;
            int i11 = size6;
            if (c2 == i10 || (c2 != 2 && i10 != 2)) {
                z2 = z6;
                i = i9;
                viewGroup = viewGroup2;
                loVar.e();
            } else {
                r6 q = loVar.q(context);
                if (q == null) {
                    loVar.e();
                } else {
                    Animator animator = (Animator) q.e;
                    if (animator == null) {
                        arrayList6.add(loVar);
                    } else {
                        xo0 xo0Var7 = (xo0) loVar.a;
                        gx gxVar3 = xo0Var7.c;
                        z2 = z6;
                        i = i9;
                        if (Boolean.TRUE.equals(hashMap.get(xo0Var7))) {
                            if (vx.F(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + gxVar3 + " as this Fragment was involved in a Transition.");
                            }
                            loVar.e();
                            viewGroup = viewGroup2;
                        } else {
                            if (xo0Var7.a == 3) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                arrayList5.remove(xo0Var7);
                            }
                            View view = gxVar3.G;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new jo(viewGroup3, view, z3, xo0Var7, loVar));
                            animator.setTarget(view);
                            animator.start();
                            if (vx.F(2)) {
                                Log.v("FragmentManager", "Animator from operation " + xo0Var7 + " has started.");
                            }
                            ((hf) loVar.b).a(new r6(animator, xo0Var7, 11, false));
                            size6 = i11;
                            containsValue = z7;
                            viewGroup2 = viewGroup3;
                            arrayList3 = arrayList7;
                            i8 = i;
                            z6 = true;
                        }
                    }
                }
                z2 = z6;
                i = i9;
                viewGroup = viewGroup2;
            }
            size6 = i11;
            containsValue = z7;
            viewGroup2 = viewGroup;
            arrayList3 = arrayList7;
            i8 = i;
            z6 = z2;
        }
        boolean z8 = containsValue;
        boolean z9 = z6;
        ViewGroup viewGroup4 = viewGroup2;
        int size7 = arrayList6.size();
        int i12 = 0;
        while (i12 < size7) {
            Object obj9 = arrayList6.get(i12);
            i12++;
            lo loVar2 = (lo) obj9;
            xo0 xo0Var8 = (xo0) loVar2.a;
            gx gxVar4 = xo0Var8.c;
            if (z8) {
                if (vx.F(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + gxVar4 + " as Animations cannot run alongside Transitions.");
                }
                loVar2.e();
            } else if (z9) {
                if (vx.F(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + gxVar4 + " as Animations cannot run alongside Animators.");
                }
                loVar2.e();
            } else {
                View view2 = gxVar4.G;
                r6 q2 = loVar2.q(context);
                q2.getClass();
                Animation animation = (Animation) q2.d;
                animation.getClass();
                int i13 = size7;
                if (xo0Var8.a != 1) {
                    view2.startAnimation(animation);
                    loVar2.e();
                } else {
                    viewGroup4.startViewTransition(view2);
                    jx jxVar = new jx(animation, viewGroup4, view2);
                    jxVar.setAnimationListener(new ko(xo0Var8, viewGroup4, view2, loVar2));
                    view2.startAnimation(jxVar);
                    if (vx.F(2)) {
                        Log.v("FragmentManager", "Animation from operation " + xo0Var8 + " has started.");
                    }
                }
                ViewGroup viewGroup5 = viewGroup4;
                ((hf) loVar2.b).a(new l3(view2, viewGroup5, loVar2, xo0Var8, 4));
                size7 = i13;
                viewGroup4 = viewGroup5;
            }
        }
        int size8 = arrayList5.size();
        int i14 = 0;
        while (i14 < size8) {
            Object obj10 = arrayList5.get(i14);
            i14++;
            xo0 xo0Var9 = (xo0) obj10;
            qo0.a(xo0Var9.c.G, xo0Var9.a);
        }
        arrayList5.clear();
        if (vx.F(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + xo0Var + " to " + xo0Var2);
        }
    }

    public final void c() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = ry0.a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.c);
                    this.c.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        xo0 xo0Var = (xo0) obj;
                        if (vx.F(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + xo0Var);
                        }
                        xo0Var.a();
                        if (!xo0Var.g) {
                            this.c.add(xo0Var);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    if (vx.F(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((xo0) obj2).d();
                    }
                    b(arrayList2, this.d);
                    this.d = false;
                    if (vx.F(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final xo0 d(gx gxVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xo0 xo0Var = (xo0) obj;
            gx gxVar2 = xo0Var.c;
            gxVar2.getClass();
            if (gxVar2 == gxVar && !xo0Var.f) {
                return xo0Var;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (vx.F(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = ry0.a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            try {
                g();
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((xo0) obj).d();
                }
                ArrayList arrayList2 = new ArrayList(this.c);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    xo0 xo0Var = (xo0) obj2;
                    if (vx.F(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(xo0Var);
                        Log.v("FragmentManager", sb.toString());
                    }
                    xo0Var.a();
                }
                ArrayList arrayList3 = new ArrayList(this.b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    xo0 xo0Var2 = (xo0) obj3;
                    if (vx.F(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(xo0Var2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    xo0Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xo0 xo0Var = (xo0) obj;
            if (xo0Var.b == 2) {
                xo0Var.c(qo0.b(xo0Var.c.I().getVisibility()), 1);
            }
        }
    }
}
