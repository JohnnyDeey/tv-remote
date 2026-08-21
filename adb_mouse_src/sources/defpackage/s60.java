package defpackage;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class s60 implements View.OnTouchListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s60(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                t60 t60Var = (t60) obj;
                p60 p60Var = t60Var.t;
                Handler handler = t60Var.x;
                q6 q6Var = t60Var.B;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && q6Var != null && q6Var.isShowing() && x >= 0 && x < q6Var.getWidth() && y >= 0 && y < q6Var.getHeight()) {
                    handler.postDelayed(p60Var, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(p60Var);
                }
                return false;
            default:
                if (!((Checkable) view).isChecked()) {
                    return false;
                }
                return ((GestureDetector) obj).onTouchEvent(motionEvent);
        }
    }
}
