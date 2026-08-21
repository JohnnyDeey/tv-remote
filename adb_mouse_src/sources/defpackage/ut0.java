package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ut0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static ut0 m;
    public static ut0 n;
    public final View c;
    public final CharSequence d;
    public final int e;
    public final tt0 f;
    public final tt0 g;
    public int h;
    public int i;
    public vt0 j;
    public boolean k;
    public boolean l;

    /* JADX WARN: Type inference failed for: r0v0, types: [tt0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [tt0] */
    public ut0(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        final int i = 0;
        this.f = new Runnable(this) { // from class: tt0
            public final /* synthetic */ ut0 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ut0 ut0Var = this.d;
                switch (i2) {
                    case 0:
                        ut0Var.c(false);
                        return;
                    default:
                        ut0Var.a();
                        return;
                }
            }
        };
        final int i2 = 1;
        this.g = new Runnable(this) { // from class: tt0
            public final /* synthetic */ ut0 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ut0 ut0Var = this.d;
                switch (i22) {
                    case 0:
                        ut0Var.c(false);
                        return;
                    default:
                        ut0Var.a();
                        return;
                }
            }
        };
        this.c = view;
        this.d = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = sy0.a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = zq.h(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.e = scaledTouchSlop;
        this.l = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(ut0 ut0Var) {
        ut0 ut0Var2 = m;
        if (ut0Var2 != null) {
            ut0Var2.c.removeCallbacks(ut0Var2.f);
        }
        m = ut0Var;
        if (ut0Var != null) {
            ut0Var.c.postDelayed(ut0Var.f, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        ut0 ut0Var = n;
        View view = this.c;
        if (ut0Var == this) {
            n = null;
            vt0 vt0Var = this.j;
            if (vt0Var != null) {
                View view2 = (View) vt0Var.d;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) vt0Var.c).getSystemService("window")).removeView(view2);
                }
                this.j = null;
                this.l = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (m == this) {
            b(null);
        }
        view.removeCallbacks(this.g);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [vt0, java.lang.Object] */
    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.c;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        ut0 ut0Var = n;
        if (ut0Var != null) {
            ut0Var.a();
        }
        n = this;
        this.k = z;
        Context context = view.getContext();
        ?? obj = new Object();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        obj.f = layoutParams;
        obj.g = new Rect();
        obj.h = new int[2];
        obj.i = new int[2];
        obj.c = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        obj.d = inflate;
        obj.e = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(vt0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
        View view2 = (View) obj.d;
        Context context2 = (Context) obj.c;
        this.j = obj;
        int i7 = this.h;
        int i8 = this.i;
        boolean z3 = this.k;
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.f;
        if (view2.getParent() != null && view2.getParent() != null) {
            ((WindowManager) context2.getSystemService("window")).removeView(view2);
        }
        ((TextView) obj.e).setText(this.d);
        int[] iArr = (int[]) obj.i;
        int[] iArr2 = (int[]) obj.h;
        Rect rect = (Rect) obj.g;
        layoutParams2.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i7 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i8 + dimensionPixelOffset2;
            i = i8 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i = 0;
        }
        layoutParams2.gravity = 49;
        Resources resources = context2.getResources();
        if (z3) {
            i2 = R.dimen.tooltip_y_offset_touch;
        } else {
            i2 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i2);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
        int i9 = i7;
        if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
            Context context3 = view.getContext();
            while (true) {
                if (!(context3 instanceof ContextWrapper)) {
                    break;
                }
                if (context3 instanceof Activity) {
                    rootView = ((Activity) context3).getWindow().getDecorView();
                    break;
                }
                context3 = ((ContextWrapper) context3).getBaseContext();
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            i5 = 1;
        } else {
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = context2.getResources();
                i5 = 1;
                i3 = i;
                z2 = z3;
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i6 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i6 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i4 = 0;
                rect.set(0, i6, displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else {
                i3 = i;
                z2 = z3;
                i4 = 0;
                i5 = 1;
            }
            rootView.getLocationOnScreen(iArr);
            view.getLocationOnScreen(iArr2);
            int i10 = iArr2[i4] - iArr[i4];
            iArr2[i4] = i10;
            iArr2[i5] = iArr2[i5] - iArr[i5];
            layoutParams2.x = (i10 + i9) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, i4);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i11 = iArr2[i5];
            int i12 = ((i11 + i3) - dimensionPixelOffset3) - measuredHeight;
            int i13 = i11 + height + dimensionPixelOffset3;
            if (z2) {
                if (i12 >= 0) {
                    layoutParams2.y = i12;
                } else {
                    layoutParams2.y = i13;
                }
            } else if (measuredHeight + i13 <= rect.height()) {
                layoutParams2.y = i13;
            } else {
                layoutParams2.y = i12;
            }
        }
        ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
        view.addOnAttachStateChangeListener(this);
        if (this.k) {
            j2 = 2500;
        } else {
            WeakHashMap weakHashMap = ry0.a;
            if ((view.getWindowSystemUiVisibility() & 1) == i5) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j2 = j - longPressTimeout;
        }
        tt0 tt0Var = this.g;
        view.removeCallbacks(tt0Var);
        view.postDelayed(tt0Var, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.i) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            vt0 r4 = r3.j
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.k
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.c
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.l = r4
            r3.a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            vt0 r4 = r3.j
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.l
            if (r1 != 0) goto L66
            int r1 = r3.h
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.e
            if (r1 > r2) goto L66
            int r1 = r3.i
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.h = r4
            r3.i = r5
            r3.l = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut0.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.h = view.getWidth() / 2;
        this.i = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
