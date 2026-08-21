package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class mf extends lh0 {
    public final Paint a;
    public final List b;

    public mf() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0087. Please report as an issue. */
    @Override // defpackage.lh0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int F;
        Canvas canvas2;
        int i;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((o40) it.next()).getClass();
            ThreadLocal threadLocal = oi.a;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            int i2 = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).C0()) {
                nf nfVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (nfVar.b) {
                    case 0:
                        break;
                    default:
                        i2 = nfVar.c.G();
                        break;
                }
                float f2 = i2;
                nf nfVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (nfVar2.b) {
                    case 0:
                        i = nfVar2.c.o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = nfVar2.c;
                        i = carouselLayoutManager.o - carouselLayoutManager.D();
                        break;
                }
                float f3 = i;
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f2, 0.0f, f3, paint);
            } else {
                nf nfVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (nfVar3.b) {
                    case 0:
                        i2 = nfVar3.c.E();
                    default:
                        float f4 = i2;
                        nf nfVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                        switch (nfVar4.b) {
                            case 0:
                                CarouselLayoutManager carouselLayoutManager2 = nfVar4.c;
                                F = carouselLayoutManager2.n - carouselLayoutManager2.F();
                                break;
                            default:
                                F = nfVar4.c.n;
                                break;
                        }
                        canvas2 = canvas;
                        canvas2.drawLine(f4, 0.0f, F, 0.0f, paint);
                        break;
                }
            }
            canvas = canvas2;
        }
    }
}
