package defpackage;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class cx implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float c;
    public final int d;
    public final int e;
    public final View f;
    public bx g;
    public bx h;
    public boolean i;
    public int j;
    public final int[] k = new int[2];

    public cx(View view) {
        this.f = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.c = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.d = tapTimeout;
        this.e = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        bx bxVar = this.h;
        View view = this.f;
        if (bxVar != null) {
            view.removeCallbacks(bxVar);
        }
        bx bxVar2 = this.g;
        if (bxVar2 != null) {
            view.removeCallbacks(bxVar2);
        }
    }

    public abstract bo0 b();

    public abstract boolean c();

    public boolean d() {
        bo0 b = b();
        if (b != null && b.b()) {
            b.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cx.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.i = false;
        this.j = -1;
        bx bxVar = this.g;
        if (bxVar != null) {
            this.f.removeCallbacks(bxVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
