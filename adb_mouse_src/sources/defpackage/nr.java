package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class nr extends Drawable implements Animatable {
    public static final bg o = new bg(Float.class, "growFraction", 9);
    public final Context c;
    public final hh d;
    public ObjectAnimator f;
    public ObjectAnimator g;
    public ArrayList i;
    public boolean j;
    public float k;
    public int m;
    public final float h = -1.0f;
    public final Paint l = new Paint();
    public final Rect n = new Rect();
    public y4 e = new Object();

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, y4] */
    public nr(Context context, hh hhVar) {
        this.c = context;
        this.d = hhVar;
        setAlpha(255);
    }

    public final float b() {
        hh hhVar = this.d;
        if (hhVar.g != 0 || hhVar.h != 0) {
            return this.k;
        }
        return 1.0f;
    }

    public final float c() {
        int i;
        float f = this.h;
        if (f > 0.0f) {
            return f;
        }
        boolean z = this instanceof ep;
        hh hhVar = this.d;
        if (hhVar.a(z) && hhVar.m != 0) {
            y4 y4Var = this.e;
            ContentResolver contentResolver = this.c.getContentResolver();
            y4Var.getClass();
            float f2 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            if (f2 > 0.0f) {
                if (z) {
                    i = hhVar.j;
                } else {
                    i = hhVar.k;
                }
                int i2 = (int) (((i * 1000.0f) / hhVar.m) * f2);
                float uptimeMillis = ((float) (SystemClock.uptimeMillis() % i2)) / i2;
                if (uptimeMillis < 0.0f) {
                    return (uptimeMillis % 1.0f) + 1.0f;
                }
                return uptimeMillis;
            }
        }
        return 0.0f;
    }

    public final boolean d(boolean z, boolean z2, boolean z3) {
        boolean z4;
        y4 y4Var = this.e;
        ContentResolver contentResolver = this.c.getContentResolver();
        y4Var.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z3 && f > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        return e(z, z2, z4);
    }

    public boolean e(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        boolean z4;
        ObjectAnimator objectAnimator3 = this.f;
        bg bgVar = o;
        if (objectAnimator3 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, bgVar, 0.0f, 1.0f);
            this.f = ofFloat;
            ofFloat.setDuration(500L);
            this.f.setInterpolator(x4.b);
            ObjectAnimator objectAnimator4 = this.f;
            if (objectAnimator4 != null && objectAnimator4.isRunning()) {
                c.k("Cannot set showAnimator while the current showAnimator is running.");
                return false;
            }
            this.f = objectAnimator4;
            objectAnimator4.addListener(new mr(this, 0));
        }
        if (this.g == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, bgVar, 1.0f, 0.0f);
            this.g = ofFloat2;
            ofFloat2.setDuration(500L);
            this.g.setInterpolator(x4.b);
            ObjectAnimator objectAnimator5 = this.g;
            if (objectAnimator5 != null && objectAnimator5.isRunning()) {
                c.k("Cannot set hideAnimator while the current hideAnimator is running.");
                return false;
            }
            this.g = objectAnimator5;
            objectAnimator5.addListener(new mr(this, 1));
        }
        if (isVisible() || z) {
            if (z) {
                objectAnimator = this.f;
            } else {
                objectAnimator = this.g;
            }
            if (z) {
                objectAnimator2 = this.g;
            } else {
                objectAnimator2 = this.f;
            }
            if (!z3) {
                if (objectAnimator2.isRunning()) {
                    boolean z5 = this.j;
                    this.j = true;
                    new ValueAnimator[]{objectAnimator2}[0].cancel();
                    this.j = z5;
                }
                if (objectAnimator.isRunning()) {
                    objectAnimator.end();
                } else {
                    boolean z6 = this.j;
                    this.j = true;
                    new ValueAnimator[]{objectAnimator}[0].end();
                    this.j = z6;
                }
                return super.setVisible(z, false);
            }
            if (!objectAnimator.isRunning()) {
                if (z && !super.setVisible(z, false)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                hh hhVar = this.d;
                if (!z ? hhVar.h != 0 : hhVar.g != 0) {
                    if (!z2 && objectAnimator.isPaused()) {
                        objectAnimator.resume();
                        return z4;
                    }
                    objectAnimator.start();
                    return z4;
                }
                boolean z7 = this.j;
                this.j = true;
                new ValueAnimator[]{objectAnimator}[0].end();
                this.j = z7;
                return z4;
            }
        }
        return false;
    }

    public final void f(zc zcVar) {
        ArrayList arrayList = this.i;
        if (arrayList != null && arrayList.contains(zcVar)) {
            this.i.remove(zcVar);
            if (this.i.isEmpty()) {
                this.i = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.f;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.g;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.m = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.l.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return d(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        e(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        e(false, true, false);
    }
}
