package svarzee.android.apps.adb_mouse;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import defpackage.gr;
import defpackage.vy;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class DpadView extends View {
    public int c;
    public vy d;
    public gr e;
    public final Paint f;
    public final Paint g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;
    public final float j;
    public float k;
    public float l;
    public float m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x012e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DpadView(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: svarzee.android.apps.adb_mouse.DpadView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final gr a(float f, float f2) {
        float f3 = this.k;
        float f4 = 100.0f * f3;
        float f5 = f3 * 25.0f;
        float f6 = f - this.l;
        float f7 = this.m - f2;
        float sqrt = (float) Math.sqrt((f7 * f7) + (f6 * f6));
        if (sqrt > f4) {
            return gr.c;
        }
        if (sqrt < f5) {
            return gr.d;
        }
        if (f6 > f7 && (-f6) > f7) {
            return gr.g;
        }
        if (f6 > f7 && (-f6) < f7) {
            return gr.f;
        }
        if (f6 < f7 && (-f6) > f7) {
            return gr.h;
        }
        return gr.e;
    }

    public final vy getOnSectionClick() {
        return this.d;
    }

    public final int getTintColor() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        for (Map.Entry entry : this.i.entrySet()) {
            gr grVar = (gr) entry.getKey();
            Path path = (Path) entry.getValue();
            int i = this.c;
            Paint paint = this.f;
            paint.setColor(i);
            paint.setAlpha(255);
            canvas.drawPath(path, paint);
            if (grVar == this.e) {
                Paint paint2 = this.g;
                paint2.setAlpha(60);
                canvas.drawPath(path, paint2);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
        setMeasuredDimension(min, min);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.l = i / 2.0f;
        this.m = i2 / 2.0f;
        this.k = Math.min(i, i2) / this.j;
        Matrix matrix = new Matrix();
        float f = this.k;
        matrix.setScale(f, f);
        LinkedHashMap linkedHashMap = this.i;
        linkedHashMap.clear();
        for (Map.Entry entry : this.h.entrySet()) {
            gr grVar = (gr) entry.getKey();
            Path path = new Path((Path) entry.getValue());
            path.transform(matrix);
            linkedHashMap.put(grVar, path);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        gr grVar = gr.c;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        if (this.e != grVar) {
                            this.e = grVar;
                            invalidate();
                        }
                        return true;
                    }
                } else {
                    if (this.e != grVar && a(motionEvent.getX(), motionEvent.getY()) != this.e) {
                        this.e = grVar;
                        invalidate();
                    }
                    return true;
                }
            } else {
                gr grVar2 = this.e;
                if (grVar2 != grVar) {
                    this.e = grVar;
                    invalidate();
                    vy vyVar = this.d;
                    if (vyVar != null) {
                        vyVar.h(grVar2);
                    }
                }
                return true;
            }
        } else {
            gr a = a(motionEvent.getX(), motionEvent.getY());
            if (a != grVar) {
                this.e = a;
                performHapticFeedback(1);
                invalidate();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setOnSectionClick(vy vyVar) {
        this.d = vyVar;
    }

    public final void setTintColor(int i) {
        this.c = i;
        invalidate();
    }
}
