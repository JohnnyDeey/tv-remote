package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class yo0 {
    public static final cs n = new cs(1);
    public static final cs o = new cs(2);
    public static final cs p = new cs(3);
    public static final cs q = new cs(4);
    public static final cs r = new cs(5);
    public static final cs s = new cs(0);
    public final Object d;
    public final k20 e;
    public final float h;
    public zo0 k;
    public float l;
    public boolean m;
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean c = false;
    public boolean f = false;
    public long g = 0;
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();

    public yo0(Object obj, k20 k20Var) {
        this.d = obj;
        this.e = k20Var;
        if (k20Var != p && k20Var != q && k20Var != r) {
            if (k20Var == s) {
                this.h = 0.00390625f;
            } else if (k20Var != n && k20Var != o) {
                this.h = 1.0f;
            } else {
                this.h = 0.002f;
            }
        } else {
            this.h = 0.1f;
        }
        this.k = null;
        this.l = Float.MAX_VALUE;
        this.m = false;
    }

    public static w4 b() {
        ThreadLocal threadLocal = w4.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new w4(new r6(2)));
        }
        return (w4) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, u4] */
    public final void a(float f) {
        float durationScale;
        if (this.f) {
            this.l = f;
            return;
        }
        if (this.k == null) {
            this.k = new zo0(f);
        }
        zo0 zo0Var = this.k;
        double d = f;
        zo0Var.i = d;
        double d2 = (float) d;
        if (d2 <= 3.4028234663852886E38d) {
            if (d2 >= -3.4028234663852886E38d) {
                double abs = Math.abs(this.h * 0.75f);
                zo0Var.d = abs;
                zo0Var.e = abs * 62.5d;
                r6 r6Var = b().e;
                r6Var.getClass();
                if (Thread.currentThread() == ((Looper) r6Var.e).getThread()) {
                    boolean z = this.f;
                    if (!z && !z) {
                        int i = 1;
                        this.f = true;
                        if (!this.c) {
                            this.b = this.e.E(this.d);
                        }
                        float f2 = this.b;
                        if (f2 <= Float.MAX_VALUE && f2 >= -3.4028235E38f) {
                            w4 b = b();
                            ArrayList arrayList = b.b;
                            if (arrayList.size() == 0) {
                                ((Choreographer) b.e.d).postFrameCallback(new v4(b.d));
                                if (Build.VERSION.SDK_INT >= 33) {
                                    durationScale = ValueAnimator.getDurationScale();
                                    b.g = durationScale;
                                    if (b.h == null) {
                                        b.h = new r6(i, b);
                                    }
                                    final r6 r6Var2 = b.h;
                                    if (((u4) r6Var2.d) == null) {
                                        ?? r0 = new ValueAnimator.DurationScaleChangeListener() { // from class: u4
                                            @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                                            public final void onChanged(float f3) {
                                                ((w4) r6.this.e).g = f3;
                                            }
                                        };
                                        r6Var2.d = r0;
                                        ValueAnimator.registerDurationScaleChangeListener(r0);
                                    }
                                }
                            }
                            if (!arrayList.contains(this)) {
                                arrayList.add(this);
                                return;
                            }
                            return;
                        }
                        c.k("Starting value need to be in between min value and max value");
                        return;
                    }
                    return;
                }
                throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
            }
            c.q("Final position of the spring cannot be less than the min value.");
            return;
        }
        c.q("Final position of the spring cannot be greater than the max value.");
    }

    public final void c(float f) {
        this.e.i0(this.d, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i < arrayList.size()) {
                if (arrayList.get(i) == null) {
                    i++;
                } else {
                    arrayList.get(i).getClass();
                    c.a();
                    return;
                }
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
        }
    }

    public final void d() {
        if (this.k.b > 0.0d) {
            r6 r6Var = b().e;
            r6Var.getClass();
            if (Thread.currentThread() == ((Looper) r6Var.e).getThread()) {
                if (this.f) {
                    this.m = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        c.q("Spring animations can only come to an end when there is damping");
    }
}
