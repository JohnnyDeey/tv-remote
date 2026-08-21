package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class y6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y6(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                h7 h7Var = (h7) obj;
                if (!h7Var.getInternalPopup().b()) {
                    h7Var.h.n(h7Var.getTextDirection(), h7Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = h7Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            case 1:
                e7 e7Var = (e7) obj;
                h7 h7Var2 = e7Var.I;
                if (h7Var2.isAttachedToWindow() && h7Var2.getGlobalVisibleRect(e7Var.G)) {
                    e7Var.s();
                    e7Var.d();
                    return;
                } else {
                    e7Var.dismiss();
                    return;
                }
            case 2:
                rf rfVar = (rf) obj;
                ArrayList arrayList = rfVar.j;
                if (rfVar.b() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((qf) arrayList.get(0)).a.A) {
                        View view = rfVar.q;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((qf) obj2).a.d();
                            }
                            return;
                        }
                        rfVar.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                np0 np0Var = (np0) obj;
                ka0 ka0Var = np0Var.j;
                if (np0Var.b() && !ka0Var.A) {
                    View view2 = np0Var.o;
                    if (view2 != null && view2.isShown()) {
                        ka0Var.d();
                        return;
                    } else {
                        np0Var.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
