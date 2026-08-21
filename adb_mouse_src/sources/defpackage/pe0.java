package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class pe0 extends lh0 {
    public Drawable a;
    public int b;
    public boolean c = true;
    public final /* synthetic */ qe0 d;

    public pe0(qe0 qe0Var) {
        this.d = qe0Var;
    }

    @Override // defpackage.lh0
    public final void a(Rect rect, View view, RecyclerView recyclerView) {
        if (d(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // defpackage.lh0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        if (this.a != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (d(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.a.setBounds(0, height, width, this.b + height);
                    this.a.draw(canvas);
                }
            }
        }
    }

    public final boolean d(View view, RecyclerView recyclerView) {
        di0 H = recyclerView.H(view);
        if ((H instanceof xe0) && ((xe0) H).y) {
            boolean z = this.c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild < recyclerView.getChildCount() - 1) {
                di0 H2 = recyclerView.H(recyclerView.getChildAt(indexOfChild + 1));
                if ((H2 instanceof xe0) && ((xe0) H2).x) {
                    return true;
                }
                return false;
            }
            return z;
        }
        return false;
    }
}
