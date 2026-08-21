package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ep extends nr {
    public static final dp A = new dp(0);
    public final ch p;
    public final zo0 q;
    public final yo0 r;
    public final or s;
    public float t;
    public boolean u;
    public final ValueAnimator v;
    public ValueAnimator w;
    public TimeInterpolator x;
    public TimeInterpolator y;
    public TimeInterpolator z;

    public ep(Context context, final hh hhVar, ch chVar) {
        super(context, hhVar);
        this.u = false;
        this.p = chVar;
        or orVar = new or();
        this.s = orVar;
        orVar.g = true;
        zo0 zo0Var = new zo0();
        this.q = zo0Var;
        zo0Var.a(1.0f);
        zo0Var.b(50.0f);
        yo0 yo0Var = new yo0(this, A);
        this.r = yo0Var;
        yo0Var.k = zo0Var;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.v = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bp
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                hh hhVar2 = hhVar;
                if (hhVar2.a(true) && hhVar2.m != 0) {
                    ep epVar = ep.this;
                    if (epVar.isVisible()) {
                        epVar.invalidateSelf();
                    }
                }
            }
        });
        if (hhVar.a(true) && hhVar.m != 0) {
            valueAnimator.start();
        }
        if (this.k != 1.0f) {
            this.k = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.n)) {
            canvas.save();
            Rect bounds = getBounds();
            float b = b();
            ObjectAnimator objectAnimator = this.f;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                z = true;
            } else {
                z = false;
            }
            ObjectAnimator objectAnimator2 = this.g;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.p.b(canvas, bounds, b, z, z2);
            float c = c();
            or orVar = this.s;
            orVar.e = c;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.l;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            hh hhVar = this.d;
            orVar.c = hhVar.e[0];
            int i = hhVar.i;
            if (i > 0) {
                this.p.f(canvas, paint, orVar.b, 1.0f, hhVar.f, this.m, (int) ((mn.l(orVar.b, 0.0f, 0.01f) * i) / 0.01f));
            } else {
                this.p.f(canvas, paint, 0.0f, 1.0f, hhVar.f, this.m, 0);
            }
            int i2 = this.m;
            ch chVar = this.p;
            chVar.e(canvas, paint, orVar, i2);
            int i3 = hhVar.e[0];
            chVar.getClass();
            canvas.restore();
        }
    }

    @Override // defpackage.nr
    public final boolean e(boolean z, boolean z2, boolean z3) {
        boolean e = super.e(z, z2, z3);
        y4 y4Var = this.e;
        ContentResolver contentResolver = this.c.getContentResolver();
        y4Var.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.u = true;
            return e;
        }
        this.u = false;
        this.q.b(50.0f / f);
        return e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.p.g();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.p.g();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.r.d();
        this.s.b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        float f;
        float f2 = i;
        if (f2 >= 1000.0f && f2 <= 9000.0f) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        boolean z = this.u;
        or orVar = this.s;
        yo0 yo0Var = this.r;
        if (z) {
            yo0Var.d();
            orVar.b = f2 / 10000.0f;
            invalidateSelf();
            orVar.d = f;
            invalidateSelf();
            return true;
        }
        yo0Var.b = orVar.b * 10000.0f;
        yo0Var.c = true;
        yo0Var.a(f2);
        return true;
    }
}
