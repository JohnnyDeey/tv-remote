package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class o00 extends View {
    public boolean c;

    public o00(Context context) {
        super(context);
        this.c = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.c = z;
    }

    public void setGuidelineBegin(int i) {
        qj qjVar = (qj) getLayoutParams();
        if (this.c && qjVar.a == i) {
            return;
        }
        qjVar.a = i;
        setLayoutParams(qjVar);
    }

    public void setGuidelineEnd(int i) {
        qj qjVar = (qj) getLayoutParams();
        if (this.c && qjVar.b == i) {
            return;
        }
        qjVar.b = i;
        setLayoutParams(qjVar);
    }

    public void setGuidelinePercent(float f) {
        qj qjVar = (qj) getLayoutParams();
        if (this.c && qjVar.c == f) {
            return;
        }
        qjVar.c = f;
        setLayoutParams(qjVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
