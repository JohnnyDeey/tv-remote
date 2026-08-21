package defpackage;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class c20 implements View.OnTouchListener {
    public final Dialog c;
    public final int d;
    public final int e;
    public final int f;

    public c20(Dialog dialog, Rect rect) {
        this.c = dialog;
        this.d = rect.left;
        this.e = rect.top;
        this.f = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.d;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.e, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            float f = (-this.f) - 1;
            obtain.setLocation(f, f);
        }
        view.performClick();
        return this.c.onTouchEvent(obtain);
    }
}
