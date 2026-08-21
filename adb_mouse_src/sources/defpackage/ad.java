package defpackage;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.Arrays;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class ad extends ProgressBar {
    public final hh c;
    public int d;
    public final boolean e;
    public final int f;
    public y4 g;
    public boolean h;
    public int i;
    public boolean j;
    public final yc k;
    public final yc l;
    public final zc m;
    public final zc n;

    /* JADX WARN: Type inference failed for: r11v0, types: [hh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, y4] */
    public ad(Context context, AttributeSet attributeSet) {
        super(r21.Q(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, R.attr.circularProgressIndicatorStyle);
        this.h = false;
        this.i = 4;
        this.k = new yc(this, 0);
        this.l = new yc(this, 1);
        this.m = new zc(this, 0);
        this.n = new zc(this, 1);
        Context context2 = getContext();
        ?? obj = new Object();
        obj.e = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        k20.i(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = mg0.a;
        k20.j(context2, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        obj.a = k20.y(context2, obtainStyledAttributes, 10, dimensionPixelSize);
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null) {
            int i = peekValue.type;
            if (i == 5) {
                obj.b = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, obtainStyledAttributes.getResources().getDisplayMetrics()), obj.a / 2);
                obj.d = false;
            } else if (i == 6) {
                obj.c = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                obj.d = true;
            }
        }
        obj.g = obtainStyledAttributes.getInt(6, 0);
        obj.h = obtainStyledAttributes.getInt(1, 0);
        obj.i = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        int abs = Math.abs(obtainStyledAttributes.getDimensionPixelSize(13, 0));
        obj.j = Math.abs(obtainStyledAttributes.getDimensionPixelSize(14, abs));
        obj.k = Math.abs(obtainStyledAttributes.getDimensionPixelSize(15, abs));
        obj.l = Math.abs(obtainStyledAttributes.getDimensionPixelSize(11, 0));
        obj.m = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        obj.n = obtainStyledAttributes.getFloat(2, 1.0f);
        if (!obtainStyledAttributes.hasValue(3)) {
            obj.e = new int[]{f20.w(context2, R.attr.colorPrimary, -1)};
        } else if (obtainStyledAttributes.peekValue(3).type != 1) {
            obj.e = new int[]{obtainStyledAttributes.getColor(3, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(obtainStyledAttributes.getResourceId(3, -1));
            obj.e = intArray;
            if (intArray.length == 0) {
                c.k("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        if (obtainStyledAttributes.hasValue(8)) {
            obj.f = obtainStyledAttributes.getColor(8, -1);
        } else {
            obj.f = obj.e[0];
            TypedArray obtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            obj.f = f20.g(obj.f, (int) (f * 255.0f));
        }
        obtainStyledAttributes.recycle();
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        k20.i(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr2 = mg0.e;
        k20.j(context2, attributeSet, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        obj.o = obtainStyledAttributes3.getInt(0, 0);
        obj.p = Math.max(k20.y(context2, obtainStyledAttributes3, 4, dimensionPixelSize2), obj.a * 2);
        obj.q = k20.y(context2, obtainStyledAttributes3, 3, dimensionPixelSize3);
        obj.r = obtainStyledAttributes3.getInt(2, 0);
        obj.s = obtainStyledAttributes3.getBoolean(1, true);
        obtainStyledAttributes3.recycle();
        obj.b();
        this.c = obj;
        k20.i(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        k20.j(context2, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        obtainStyledAttributes4.getInt(7, -1);
        this.f = Math.min(obtainStyledAttributes4.getInt(5, -1), 1000);
        obtainStyledAttributes4.recycle();
        this.g = new Object();
        this.e = true;
    }

    private qr getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() != null) {
                return getIndeterminateDrawable().p;
            }
            return null;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().p;
    }

    public final void a(int i) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.d = i;
                this.h = true;
                if (getIndeterminateDrawable().isVisible()) {
                    y4 y4Var = this.g;
                    ContentResolver contentResolver = getContext().getContentResolver();
                    y4Var.getClass();
                    if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                        getIndeterminateDrawable().q.m();
                        return;
                    }
                }
                this.m.a(getIndeterminateDrawable());
                return;
            }
            return;
        }
        super.setProgress(i);
        if (getProgressDrawable() != null) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    public final boolean b() {
        if (isAttachedToWindow() && getWindowVisibility() == 0) {
            View view = this;
            while (view.getVisibility() == 0) {
                Object parent = view.getParent();
                if (parent == null) {
                    if (getWindowVisibility() == 0) {
                        return true;
                    }
                    return false;
                }
                if (!(parent instanceof View)) {
                    return true;
                }
                view = (View) parent;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.c.h;
    }

    @Override // android.widget.ProgressBar
    public t10 getIndeterminateDrawable() {
        return (t10) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.c.e;
    }

    public int getIndicatorTrackGapSize() {
        return this.c.i;
    }

    @Override // android.widget.ProgressBar
    public ep getProgressDrawable() {
        return (ep) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.c.g;
    }

    public int getTrackColor() {
        return this.c.f;
    }

    public int getTrackCornerRadius() {
        return this.c.b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.c.c;
    }

    public int getTrackThickness() {
        return this.c.a;
    }

    public int getWaveAmplitude() {
        return this.c.l;
    }

    public int getWaveSpeed() {
        return this.c.m;
    }

    public int getWavelengthDeterminate() {
        return this.c.j;
    }

    public int getWavelengthIndeterminate() {
        return this.c.k;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().q.l(this.m);
        }
        ep progressDrawable = getProgressDrawable();
        zc zcVar = this.n;
        if (progressDrawable != null) {
            ep progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.i == null) {
                progressDrawable2.i = new ArrayList();
            }
            if (!progressDrawable2.i.contains(zcVar)) {
                progressDrawable2.i.add(zcVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            t10 indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.i == null) {
                indeterminateDrawable.i = new ArrayList();
            }
            if (!indeterminateDrawable.i.contains(zcVar)) {
                indeterminateDrawable.i.add(zcVar);
            }
        }
        if (b()) {
            if (this.f > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.l);
        removeCallbacks(this.k);
        ((nr) getCurrentDrawable()).d(false, false, false);
        t10 indeterminateDrawable = getIndeterminateDrawable();
        zc zcVar = this.n;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().f(zcVar);
            getIndeterminateDrawable().q.p();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().f(zcVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getCurrentDrawingDelegate().a();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        int g;
        int g2;
        try {
            qr currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            if (((ch) currentDrawingDelegate).g() < 0) {
                g = View.getDefaultSize(getSuggestedMinimumWidth(), i);
            } else {
                g = ((ch) currentDrawingDelegate).g() + getPaddingLeft() + getPaddingRight();
            }
            if (((ch) currentDrawingDelegate).g() < 0) {
                g2 = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
            } else {
                g2 = ((ch) currentDrawingDelegate).g() + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(g, g2);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!this.e) {
            return;
        }
        ((nr) getCurrentDrawable()).d(b(), false, z);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (!this.e) {
            return;
        }
        ((nr) getCurrentDrawable()).d(b(), false, false);
    }

    public void setAnimatorDurationScaleProvider(y4 y4Var) {
        this.g = y4Var;
        if (getProgressDrawable() != null) {
            getProgressDrawable().e = y4Var;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().e = y4Var;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.c.h = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            nr nrVar = (nr) getCurrentDrawable();
            if (nrVar != null) {
                nrVar.d(false, false, false);
            }
            super.setIndeterminate(z);
            nr nrVar2 = (nr) getCurrentDrawable();
            if (nrVar2 != null) {
                nrVar2.d(b(), false, false);
            }
            if ((nrVar2 instanceof t10) && b()) {
                ((t10) nrVar2).q.o();
            }
            this.h = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f) {
        hh hhVar = this.c;
        if (hhVar.n != f) {
            hhVar.n = f;
            getIndeterminateDrawable().q.j();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof t10) {
            ((nr) drawable).d(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else if (!this.j) {
            super.setIndeterminateDrawable(drawable);
        } else {
            c.k("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{f20.w(getContext(), R.attr.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.c.e = iArr;
            getIndeterminateDrawable().q.j();
            invalidate();
        }
    }

    public void setIndicatorTrackGapSize(int i) {
        hh hhVar = this.c;
        if (hhVar.i != i) {
            hhVar.i = i;
            hhVar.b();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        a(i);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable instanceof ep) {
            ep epVar = (ep) drawable;
            epVar.d(false, false, false);
            super.setProgressDrawable(epVar);
            epVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
            return;
        }
        if (!this.j) {
            super.setProgressDrawable(drawable);
        } else {
            c.k("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.c.g = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        hh hhVar = this.c;
        if (hhVar.f != i) {
            hhVar.f = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        hh hhVar = this.c;
        if (hhVar.b != i) {
            hhVar.b = Math.min(i, hhVar.a / 2);
            hhVar.d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f) {
        hh hhVar = this.c;
        if (hhVar.c != f) {
            hhVar.c = Math.min(f, 0.5f);
            hhVar.d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        hh hhVar = this.c;
        if (hhVar.a != i) {
            hhVar.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            c.k("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        } else {
            this.i = i;
        }
    }

    public void setWaveAmplitude(int i) {
        hh hhVar = this.c;
        if (hhVar.l != i) {
            hhVar.l = Math.abs(i);
            requestLayout();
        }
    }

    public void setWaveSpeed(int i) {
        boolean z;
        hh hhVar = this.c;
        hhVar.m = i;
        ep progressDrawable = getProgressDrawable();
        if (hhVar.m != 0) {
            z = true;
        } else {
            z = false;
        }
        ValueAnimator valueAnimator = progressDrawable.v;
        if (z && !valueAnimator.isRunning()) {
            valueAnimator.start();
        } else if (!z && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
    }

    public void setWavelength(int i) {
        setWavelengthDeterminate(i);
        setWavelengthIndeterminate(i);
    }

    public void setWavelengthDeterminate(int i) {
        hh hhVar = this.c;
        if (hhVar.j != i) {
            hhVar.j = Math.abs(i);
            if (!isIndeterminate()) {
                requestLayout();
            }
        }
    }

    public void setWavelengthIndeterminate(int i) {
        hh hhVar = this.c;
        if (hhVar.k != i) {
            hhVar.k = Math.abs(i);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }
}
