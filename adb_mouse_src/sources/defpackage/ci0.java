package defpackage;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ci0 implements Runnable {
    public int c;
    public int d;
    public OverScroller e;
    public Interpolator f;
    public boolean g;
    public boolean h;
    public final /* synthetic */ RecyclerView i;

    public ci0(RecyclerView recyclerView) {
        this.i = recyclerView;
        eh0 eh0Var = RecyclerView.C0;
        this.f = eh0Var;
        this.g = false;
        this.h = false;
        this.e = new OverScroller(recyclerView.getContext(), eh0Var);
    }

    public final void a() {
        if (this.g) {
            this.h = true;
            return;
        }
        RecyclerView recyclerView = this.i;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = ry0.a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i, int i2, int i3, Interpolator interpolator) {
        boolean z;
        int height;
        RecyclerView recyclerView = this.i;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.C0;
        }
        if (this.f != interpolator) {
            this.f = interpolator;
            this.e = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.d = 0;
        this.c = 0;
        recyclerView.setScrollState(2);
        this.e.startScroll(0, 0, i, i2, i4);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        RecyclerView recyclerView = this.i;
        int[] iArr = recyclerView.t0;
        if (recyclerView.o == null) {
            recyclerView.removeCallbacks(this);
            this.e.abortAnimation();
            return;
        }
        this.h = false;
        this.g = true;
        recyclerView.m();
        OverScroller overScroller = this.e;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.c;
            int i7 = currY - this.d;
            this.c = currX;
            this.d = currY;
            int[] iArr2 = recyclerView.t0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.r(i6, i7, 1, iArr2, null)) {
                i = i6 - iArr[0];
                i2 = i7 - iArr[1];
            } else {
                i = i6;
                i2 = i7;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i, i2);
            }
            if (recyclerView.n != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.Z(i, i2, iArr);
                i3 = iArr[0];
                i4 = iArr[1];
                i -= i3;
                i2 -= i4;
                d60 d60Var = recyclerView.o.e;
                if (d60Var != null && !d60Var.d && d60Var.e) {
                    int b = recyclerView.h0.b();
                    if (b == 0) {
                        d60Var.i();
                    } else if (d60Var.a >= b) {
                        d60Var.a = b - 1;
                        d60Var.g(i3, i4);
                    } else {
                        d60Var.g(i3, i4);
                    }
                }
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.q.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.t0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.s(i3, i4, i, i2, null, 1, iArr3);
            int i8 = i - iArr[0];
            int i9 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.t(i3, i4);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z = true;
            } else {
                z = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!overScroller.isFinished() && ((!z && i8 == 0) || (!z2 && i9 == 0))) {
                z3 = false;
            } else {
                z3 = true;
            }
            d60 d60Var2 = recyclerView.o.e;
            if ((d60Var2 == null || !d60Var2.d) && z3) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i8 < 0) {
                        i5 = -currVelocity;
                    } else if (i8 > 0) {
                        i5 = currVelocity;
                    } else {
                        i5 = 0;
                    }
                    if (i9 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i9 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.v();
                        if (recyclerView.I.isFinished()) {
                            recyclerView.I.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.w();
                        if (recyclerView.K.isFinished()) {
                            recyclerView.K.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.J.isFinished()) {
                            recyclerView.J.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.L.isFinished()) {
                            recyclerView.L.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = ry0.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                qz qzVar = recyclerView.g0;
                int[] iArr4 = (int[]) qzVar.d;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                qzVar.c = 0;
            } else {
                a();
                sz szVar = recyclerView.f0;
                if (szVar != null) {
                    szVar.a(recyclerView, i3, i4);
                }
            }
        }
        d60 d60Var3 = recyclerView.o.e;
        if (d60Var3 != null && d60Var3.d) {
            d60Var3.g(0, 0);
        }
        this.g = false;
        if (this.h) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = ry0.a;
            recyclerView.postOnAnimation(this);
        } else {
            recyclerView.setScrollState(0);
            recyclerView.e0(1);
        }
    }
}
