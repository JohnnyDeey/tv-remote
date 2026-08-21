package com.google.android.material.timepicker;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.mg0;
import defpackage.wv0;
import defpackage.x4;
import defpackage.zh;
import java.util.ArrayList;
import svarzee.android.apps.adb_mouse.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class ClockHandView extends View {
    public static final /* synthetic */ int p = 0;
    public final ValueAnimator c;
    public boolean d;
    public final ArrayList e;
    public final int f;
    public final float g;
    public final Paint h;
    public final RectF i;
    public final int j;
    public float k;
    public boolean l;
    public double m;
    public int n;
    public int o;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.c = valueAnimator;
        this.e = new ArrayList();
        Paint paint = new Paint();
        this.h = paint;
        this.i = new RectF();
        this.o = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mg0.g, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        wv0.U(context, R.attr.motionDurationLong2, 200);
        wv0.V(context, R.attr.motionEasingEmphasizedInterpolator, x4.b);
        this.n = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.j = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.g = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.p;
                ClockHandView.this.b(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new AnimatorListenerAdapter());
    }

    public final void a(float f) {
        this.c.cancel();
        b(f);
    }

    public final void b(float f) {
        float f2 = f % 360.0f;
        this.k = f2;
        this.m = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.o;
        int i2 = this.n;
        if (i == 2) {
            i2 = Math.round(i2 * 0.66f);
        }
        float f3 = width;
        float f4 = i2;
        float cos = (((float) Math.cos(this.m)) * f4) + f3;
        float sin = (f4 * ((float) Math.sin(this.m))) + height;
        float f5 = this.f;
        this.i.set(cos - f5, sin - f5, cos + f5, sin + f5);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ClockFaceView clockFaceView = (ClockFaceView) ((zh) obj);
            if (Math.abs(clockFaceView.I - f2) > 0.001f) {
                clockFaceView.I = f2;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.o;
        int i2 = this.n;
        if (i == 2) {
            i2 = Math.round(i2 * 0.66f);
        }
        float f = width;
        float f2 = i2;
        float cos = (((float) Math.cos(this.m)) * f2) + f;
        float f3 = height;
        float sin = (f2 * ((float) Math.sin(this.m))) + f3;
        Paint paint = this.h;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f, paint);
        double sin2 = Math.sin(this.m);
        paint.setStrokeWidth(this.j);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.m) * r3)), height + ((int) (r3 * sin2)), paint);
        canvas.drawCircle(f, f3, this.g, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.c.isRunning()) {
            a(this.k);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z2 = false;
                z = false;
            } else {
                z2 = this.l;
                if (this.d) {
                    if (((float) Math.hypot(x - (getWidth() / 2), y - (getHeight() / 2))) <= Math.round(this.n * 0.66f) + TypedValue.applyDimension(1, 12.0f, getContext().getResources().getDisplayMetrics())) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    this.o = i;
                }
                z = false;
            }
        } else {
            this.l = false;
            z = true;
            z2 = false;
        }
        boolean z5 = this.l;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i2 = degrees + 90;
        if (i2 < 0) {
            i2 = degrees + 450;
        }
        float f = i2;
        if (this.k != f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z || !z3) {
            if (z3 || z2) {
                a(f);
            }
            this.l = z5 | z4;
            return true;
        }
        z4 = true;
        this.l = z5 | z4;
        return true;
    }
}
