package defpackage;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class l9 implements Runnable {
    public final /* synthetic */ int c;
    public Object d;

    public l9(v21 v21Var, f61 f61Var) {
        this.c = 20;
        this.d = f61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r2 r2Var;
        u61 u61Var;
        y51 y51Var;
        switch (this.c) {
            case 0:
                x60 x60Var = (x60) this.d;
                wr wrVar = x60Var.e;
                k9 k9Var = x60Var.c;
                if (x60Var.q) {
                    if (x60Var.o) {
                        x60Var.o = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        k9Var.e = currentAnimationTimeMillis;
                        k9Var.g = -1L;
                        k9Var.f = currentAnimationTimeMillis;
                        k9Var.h = 0.5f;
                    }
                    if ((k9Var.g > 0 && AnimationUtils.currentAnimationTimeMillis() > k9Var.g + k9Var.i) || !x60Var.e()) {
                        x60Var.q = false;
                        return;
                    }
                    if (x60Var.p) {
                        x60Var.p = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        wrVar.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (k9Var.f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a = k9Var.a(currentAnimationTimeMillis2);
                        long j = currentAnimationTimeMillis2 - k9Var.f;
                        k9Var.f = currentAnimationTimeMillis2;
                        x60Var.s.scrollListBy((int) (((float) j) * ((a * 4.0f) + ((-4.0f) * a * a)) * k9Var.d));
                        WeakHashMap weakHashMap = ry0.a;
                        wrVar.postOnAnimation(this);
                        return;
                    }
                    f40.f("Cannot compute scroll delta before calling start()");
                    return;
                }
                return;
            case 1:
                b bVar = (b) this.d;
                bVar.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) bVar.e;
                ty0 ty0Var = bottomSheetBehavior.O;
                if (ty0Var != null && ty0Var.f()) {
                    bVar.a(bVar.b);
                    return;
                } else {
                    if (bottomSheetBehavior.N == 2) {
                        bottomSheetBehavior.C(bVar.b);
                        return;
                    }
                    return;
                }
            case 2:
                try {
                    a.f((a) this.d);
                    return;
                } catch (IllegalStateException e) {
                    if (TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        return;
                    } else {
                        throw e;
                    }
                } catch (NullPointerException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
            case 3:
                ko koVar = (ko) this.d;
                koVar.b.endViewTransition(koVar.c);
                koVar.d.e();
                return;
            case 4:
                kq kqVar = (kq) this.d;
                kqVar.X.onDismiss(kqVar.f0);
                return;
            case 5:
                wr wrVar2 = (wr) this.d;
                wrVar2.n = null;
                wrVar2.drawableStateChanged();
                return;
            case 6:
                ((qs) this.d).R();
                return;
            case 7:
                ov ovVar = (ov) this.d;
                ValueAnimator valueAnimator = ovVar.z;
                int i = ovVar.A;
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                } else {
                    valueAnimator.cancel();
                }
                ovVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 8:
                ((vx) this.d).x(true);
                return;
            case 9:
                RecyclerView recyclerView = ((qe0) this.d).Y;
                recyclerView.focusableViewAvailable(recyclerView);
                return;
            case 10:
                ((te0) this.d).j();
                return;
            case 11:
                try {
                    ((Runnable) this.d).run();
                    return;
                } catch (Exception e3) {
                    wv0.x("Executor", "Background execution failure.", e3);
                    return;
                }
            case 12:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.d;
                if (searchView$SearchAutoComplete.h) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.h = false;
                    return;
                }
                return;
            case 13:
                ((StaggeredGridLayoutManager) this.d).B0();
                return;
            case 14:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.d).e.i;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 15:
                ActionMenuView actionMenuView = ((Toolbar) this.d).c;
                if (actionMenuView != null && (r2Var = actionMenuView.v) != null) {
                    r2Var.l();
                    return;
                }
                return;
            case 16:
                ((ty0) this.d).n(0);
                return;
            case 17:
                ((y21) this.d).h();
                return;
            case 18:
                z4 z4Var = ((y21) ((sb0) this.d).c).b;
                z4Var.c(z4Var.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 19:
                ((i31) this.d).h.a(new jj(4, null, null));
                return;
            case 20:
                throw null;
            case 21:
                j51 j51Var = (j51) this.d;
                md mdVar = j51Var.d;
                mdVar.p(0);
                td tdVar = v61.i;
                mdVar.o(24, tdVar);
                j51Var.c(tdVar);
                return;
            default:
                x61 x61Var = (x61) this.d;
                if (x61Var != null && (u61Var = x61Var.j) != null) {
                    this.d = null;
                    if (u61Var.isDone()) {
                        Object obj = x61Var.c;
                        if (obj == null) {
                            if (u61Var.isDone()) {
                                if (e61.i.L(x61Var, null, x61.g(u61Var))) {
                                    x61.i(x61Var);
                                    return;
                                }
                                return;
                            }
                            w51 w51Var = new w51(x61Var, u61Var);
                            if (e61.i.L(x61Var, null, w51Var)) {
                                try {
                                    u61Var.a(w51Var, j61.c);
                                    return;
                                } catch (Throwable th) {
                                    try {
                                        y51Var = new y51(th);
                                    } catch (Error | Exception unused) {
                                        y51Var = y51.b;
                                    }
                                    e61.i.L(x61Var, w51Var, y51Var);
                                    return;
                                }
                            }
                            obj = x61Var.c;
                        }
                        if (obj instanceof v51) {
                            u61Var.cancel(((v51) obj).a);
                            return;
                        }
                        return;
                    }
                    try {
                        ScheduledFuture scheduledFuture = x61Var.k;
                        x61Var.k = null;
                        String str = "Timed out";
                        if (scheduledFuture != null) {
                            try {
                                long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                                if (abs > 10) {
                                    str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                                }
                            } catch (Throwable th2) {
                                if (e61.i.L(x61Var, null, new y51(new TimeoutException(str)))) {
                                    x61.i(x61Var);
                                }
                                throw th2;
                            }
                        }
                        if (e61.i.L(x61Var, null, new y51(new TimeoutException(str + ": " + u61Var.toString())))) {
                            x61.i(x61Var);
                        }
                        return;
                    } finally {
                        u61Var.cancel(true);
                    }
                }
                return;
        }
    }

    public /* synthetic */ l9(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }
}
