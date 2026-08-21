package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import java.util.ArrayList;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class gh extends d6 {
    public static final kv k = x4.b;
    public static final int[] l = {0, 1500, 3000, 4500};
    public static final float[] m = {0.1f, 0.87f};
    public static final bg n = new bg(Float.class, "animationFraction", 7);
    public static final bg o = new bg(Float.class, "completeEndFraction", 8);
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final TimeInterpolator e;
    public final hh f;
    public float h;
    public float i;
    public int g = 0;
    public zc j = null;

    public gh(Context context, hh hhVar) {
        this.f = hhVar;
        this.e = wv0.V(context, R.attr.motionEasingStandardInterpolator, k);
    }

    @Override // defpackage.d6
    public final void c() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.d6
    public final void j() {
        q();
        ObjectAnimator objectAnimator = this.c;
        hh hhVar = this.f;
        objectAnimator.setDuration(hhVar.n * 6000.0f);
        this.d.setDuration(hhVar.n * 500.0f);
        this.g = 0;
        ((or) ((ArrayList) this.b).get(0)).c = hhVar.e[0];
        this.i = 0.0f;
    }

    @Override // defpackage.d6
    public final void l(zc zcVar) {
        this.j = zcVar;
    }

    @Override // defpackage.d6
    public final void m() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (((t10) this.a).isVisible()) {
                this.d.start();
            } else {
                c();
            }
        }
    }

    @Override // defpackage.d6
    public final void o() {
        q();
        this.g = 0;
        ((or) ((ArrayList) this.b).get(0)).c = this.f.e[0];
        this.i = 0.0f;
        this.c.start();
    }

    @Override // defpackage.d6
    public final void p() {
        this.j = null;
    }

    public final void q() {
        ObjectAnimator objectAnimator = this.c;
        hh hhVar = this.f;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, n, 0.0f, 1.0f);
            this.c = ofFloat;
            ofFloat.setDuration(hhVar.n * 6000.0f);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new fh(this, 0));
        }
        if (this.d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, o, 0.0f, 1.0f);
            this.d = ofFloat2;
            ofFloat2.setDuration(hhVar.n * 500.0f);
            this.d.addListener(new fh(this, 1));
        }
    }
}
