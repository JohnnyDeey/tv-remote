package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class n01 extends WindowInsetsAnimation$Callback {
    public final e20 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public n01(e20 e20Var) {
        super(0);
        this.d = new HashMap();
        this.a = e20Var;
    }

    public final q01 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        q01 q01Var = (q01) hashMap.get(windowInsetsAnimation);
        if (q01Var == null) {
            q01 q01Var2 = new q01(0, null, 0L);
            q01Var2.a = new o01(windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, q01Var2);
            return q01Var2;
        }
        return q01Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        ((View) this.a.d).setTranslationY(0.0f);
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        e20 e20Var = this.a;
        View view = (View) e20Var.d;
        int[] iArr = (int[]) e20Var.e;
        view.getLocationOnScreen(iArr);
        e20Var.a = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j = j1.j(list.get(size));
            q01 a = a(j);
            fraction = j.getFraction();
            a.a.d(fraction);
            this.c.add(a);
        }
        m11 g = m11.g(null, windowInsets);
        this.a.b(g, this.b);
        return g.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        d20 c = d20.c(lowerBound);
        upperBound = bounds.getUpperBound();
        d20 c2 = d20.c(upperBound);
        e20 e20Var = this.a;
        View view = (View) e20Var.d;
        int[] iArr = (int[]) e20Var.e;
        view.getLocationOnScreen(iArr);
        int i = e20Var.a - iArr[1];
        e20Var.b = i;
        view.setTranslationY(i);
        j1.n();
        return j1.h(c.d(), c2.d());
    }
}
