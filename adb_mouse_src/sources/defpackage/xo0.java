package defpackage;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class xo0 {
    public int a;
    public int b;
    public final gx c;
    public final ArrayList d;
    public final HashSet e;
    public boolean f;
    public boolean g;
    public final a h;

    public xo0(int i, int i2, a aVar, hf hfVar) {
        gx gxVar = aVar.c;
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = false;
        this.g = false;
        this.a = i;
        this.b = i2;
        this.c = gxVar;
        hfVar.a(new sb0(this));
        this.h = aVar;
    }

    public final void a() {
        HashSet hashSet = this.e;
        if (!this.f) {
            this.f = true;
            if (hashSet.isEmpty()) {
                b();
                return;
            }
            ArrayList arrayList = new ArrayList(hashSet);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                hf hfVar = (hf) obj;
                synchronized (hfVar) {
                    try {
                        if (!hfVar.a) {
                            hfVar.a = true;
                            hfVar.c = true;
                            gf gfVar = hfVar.b;
                            if (gfVar != null) {
                                try {
                                    gfVar.onCancel();
                                } catch (Throwable th) {
                                    synchronized (hfVar) {
                                        hfVar.c = false;
                                        hfVar.notifyAll();
                                        throw th;
                                    }
                                }
                            }
                            synchronized (hfVar) {
                                hfVar.c = false;
                                hfVar.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }

    public final void b() {
        if (!this.g) {
            if (vx.F(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        int C = qo0.C(i2);
        gx gxVar = this.c;
        if (C != 0) {
            if (C != 1) {
                if (C == 2) {
                    if (vx.F(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + gxVar + " mFinalState = " + qo0.E(this.a) + " -> REMOVED. mLifecycleImpact  = " + qo0.D(this.b) + " to REMOVING.");
                    }
                    this.a = 1;
                    this.b = 3;
                    return;
                }
                return;
            }
            if (this.a == 1) {
                if (vx.F(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + gxVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + qo0.D(this.b) + " to ADDING.");
                }
                this.a = 2;
                this.b = 2;
                return;
            }
            return;
        }
        if (this.a != 1) {
            if (vx.F(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + gxVar + " mFinalState = " + qo0.E(this.a) + " -> " + qo0.E(i) + ". ");
            }
            this.a = i;
        }
    }

    public final void d() {
        float f;
        int i = this.b;
        a aVar = this.h;
        if (i == 2) {
            gx gxVar = aVar.c;
            View findFocus = gxVar.G.findFocus();
            if (findFocus != null) {
                gxVar.f().k = findFocus;
                if (vx.F(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + gxVar);
                }
            }
            View I = this.c.I();
            if (I.getParent() == null) {
                aVar.b();
                I.setAlpha(0.0f);
            }
            if (I.getAlpha() == 0.0f && I.getVisibility() == 0) {
                I.setVisibility(4);
            }
            fx fxVar = gxVar.J;
            if (fxVar == null) {
                f = 1.0f;
            } else {
                f = fxVar.j;
            }
            I.setAlpha(f);
            return;
        }
        if (i == 3) {
            gx gxVar2 = aVar.c;
            View I2 = gxVar2.I();
            if (vx.F(2)) {
                Log.v("FragmentManager", "Clearing focus " + I2.findFocus() + " on view " + I2 + " for Fragment " + gxVar2);
            }
            I2.clearFocus();
        }
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + qo0.E(this.a) + "} {mLifecycleImpact = " + qo0.D(this.b) + "} {mFragment = " + this.c + "}";
    }
}
