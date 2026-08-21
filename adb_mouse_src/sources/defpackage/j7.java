package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class j7 extends wg0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ WeakReference f;
    public final /* synthetic */ o7 g;

    public j7(o7 o7Var, int i, int i2, WeakReference weakReference) {
        this.g = o7Var;
        this.d = i;
        this.e = i2;
        this.f = weakReference;
    }

    @Override // defpackage.wg0
    public final void w(Typeface typeface) {
        int i;
        boolean z;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.d) != -1) {
            if ((this.e & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            typeface = n7.a(typeface, i, z);
        }
        o7 o7Var = this.g;
        if (o7Var.m) {
            o7Var.l = typeface;
            TextView textView = (TextView) this.f.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = o7Var.j;
                if (isAttachedToWindow) {
                    textView.post(new k7(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    @Override // defpackage.wg0
    public final void v(int i) {
    }
}
