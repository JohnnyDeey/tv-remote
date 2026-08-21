package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class d60 {
    public int a = -1;
    public RecyclerView b;
    public oh0 c;
    public boolean d;
    public boolean e;
    public View f;
    public final yh0 g;
    public boolean h;
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public PointF k;
    public final DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    /* JADX WARN: Type inference failed for: r1v0, types: [yh0, java.lang.Object] */
    public d60(Context context) {
        ?? obj = new Object();
        obj.d = -1;
        obj.f = false;
        obj.g = 0;
        obj.a = 0;
        obj.b = 0;
        obj.c = Integer.MIN_VALUE;
        obj.e = null;
        this.g = obj;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                c.k("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                return 0;
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    public int b(View view, int i) {
        oh0 oh0Var = this.c;
        if (oh0Var != null && oh0Var.d()) {
            ph0 ph0Var = (ph0) view.getLayoutParams();
            return a((view.getLeft() - ((ph0) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) ph0Var).leftMargin, view.getRight() + ((ph0) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) ph0Var).rightMargin, oh0Var.E(), oh0Var.n - oh0Var.F(), i);
        }
        return 0;
    }

    public int c(View view, int i) {
        oh0 oh0Var = this.c;
        if (oh0Var != null && oh0Var.e()) {
            ph0 ph0Var = (ph0) view.getLayoutParams();
            return a((view.getTop() - ((ph0) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) ph0Var).topMargin, view.getBottom() + ((ph0) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) ph0Var).bottomMargin, oh0Var.G(), oh0Var.o - oh0Var.D(), i);
        }
        return 0;
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.m) {
            this.n = d(this.l);
            this.m = true;
        }
        return (int) Math.ceil(abs * this.n);
    }

    public PointF f(int i) {
        Object obj = this.c;
        if (obj instanceof zh0) {
            return ((zh0) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + zh0.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i2) {
        PointF f;
        RecyclerView recyclerView = this.b;
        int i3 = -1;
        if (this.a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f == null && this.c != null && (f = f(this.a)) != null) {
            float f2 = f.x;
            if (f2 != 0.0f || f.y != 0.0f) {
                recyclerView.Z((int) Math.signum(f2), (int) Math.signum(f.y), null);
            }
        }
        boolean z = false;
        this.d = false;
        View view = this.f;
        yh0 yh0Var = this.g;
        if (view != null) {
            this.b.getClass();
            di0 I = RecyclerView.I(view);
            if (I != null) {
                i3 = I.b();
            }
            if (i3 == this.a) {
                View view2 = this.f;
                ai0 ai0Var = recyclerView.h0;
                h(view2, yh0Var);
                yh0Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            ai0 ai0Var2 = recyclerView.h0;
            if (this.b.o.v() == 0) {
                i();
            } else {
                int i4 = this.o;
                int i5 = i4 - i;
                if (i4 * i5 <= 0) {
                    i5 = 0;
                }
                this.o = i5;
                int i6 = this.p;
                int i7 = i6 - i2;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                this.p = i7;
                if (i5 == 0 && i7 == 0) {
                    PointF f3 = f(this.a);
                    if (f3 != null) {
                        if (f3.x != 0.0f || f3.y != 0.0f) {
                            float f4 = f3.y;
                            float sqrt = (float) Math.sqrt((f4 * f4) + (r10 * r10));
                            float f5 = f3.x / sqrt;
                            f3.x = f5;
                            float f6 = f3.y / sqrt;
                            f3.y = f6;
                            this.k = f3;
                            this.o = (int) (f5 * 10000.0f);
                            this.p = (int) (f6 * 10000.0f);
                            int e = e(10000);
                            yh0Var.a = (int) (this.o * 1.2f);
                            yh0Var.b = (int) (this.p * 1.2f);
                            yh0Var.c = (int) (e * 1.2f);
                            yh0Var.e = this.i;
                            yh0Var.f = true;
                        }
                    }
                    yh0Var.d = this.a;
                    i();
                }
            }
            if (yh0Var.d >= 0) {
                z = true;
            }
            yh0Var.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.e0.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(android.view.View r7, defpackage.yh0 r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.k
            r1 = 0
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r3
            goto L16
        L13:
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            int r0 = r6.b(r7, r0)
            android.graphics.PointF r5 = r6.k
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r1 = r3
            goto L2a
        L29:
            r1 = r2
        L2a:
            int r7 = r6.c(r7, r1)
            int r1 = r0 * r0
            int r2 = r7 * r7
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r6.e(r1)
            double r1 = (double) r1
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r4
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            r8.a = r0
            r8.b = r7
            r8.c = r1
            android.view.animation.DecelerateInterpolator r6 = r6.j
            r8.e = r6
            r8.f = r3
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d60.h(android.view.View, yh0):void");
    }

    public final void i() {
        if (!this.e) {
            return;
        }
        this.e = false;
        this.p = 0;
        this.o = 0;
        this.k = null;
        this.b.h0.a = -1;
        this.f = null;
        this.a = -1;
        this.d = false;
        oh0 oh0Var = this.c;
        if (oh0Var.e == this) {
            oh0Var.e = null;
        }
        this.c = null;
        this.b = null;
    }
}
