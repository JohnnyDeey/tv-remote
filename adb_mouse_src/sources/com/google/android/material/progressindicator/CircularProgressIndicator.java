package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import defpackage.ad;
import defpackage.c;
import defpackage.ch;
import defpackage.d6;
import defpackage.eh;
import defpackage.ep;
import defpackage.gh;
import defpackage.hh;
import defpackage.nr;
import defpackage.pj0;
import defpackage.t10;
import defpackage.ux0;
import defpackage.vx0;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class CircularProgressIndicator extends ad {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [t10, nr, java.lang.Object, android.graphics.drawable.Drawable] */
    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d6 ehVar;
        hh hhVar = this.c;
        ch chVar = new ch(hhVar);
        Context context2 = getContext();
        if (hhVar.o == 1) {
            ehVar = new gh(context2, hhVar);
        } else {
            ehVar = new eh(hhVar);
        }
        ?? nrVar = new nr(context2, hhVar);
        nrVar.p = chVar;
        nrVar.q = ehVar;
        ehVar.a = nrVar;
        Resources resources = context2.getResources();
        vx0 vx0Var = new vx0();
        ThreadLocal threadLocal = pj0.a;
        vx0Var.c = resources.getDrawable(R.drawable.ic_mtrl_arrow_circle, null);
        new ux0(vx0Var.c.getConstantState());
        nrVar.r = vx0Var;
        setIndeterminateDrawable(nrVar);
        setProgressDrawable(new ep(getContext(), hhVar, chVar));
        this.j = true;
    }

    public int getIndeterminateAnimationType() {
        return this.c.o;
    }

    public int getIndicatorDirection() {
        return this.c.r;
    }

    public int getIndicatorInset() {
        return this.c.q;
    }

    public int getIndicatorSize() {
        return this.c.p;
    }

    public void setIndeterminateAnimationType(int i) {
        d6 ehVar;
        hh hhVar = this.c;
        if (hhVar.o == i) {
            return;
        }
        if (b() && isIndeterminate()) {
            c.o("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        hhVar.o = i;
        hhVar.b();
        if (i == 1) {
            ehVar = new gh(getContext(), hhVar);
        } else {
            ehVar = new eh(hhVar);
        }
        t10 indeterminateDrawable = getIndeterminateDrawable();
        indeterminateDrawable.q = ehVar;
        ehVar.a = indeterminateDrawable;
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().q.l(this.m);
        }
        invalidate();
    }

    public void setIndicatorDirection(int i) {
        this.c.r = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        hh hhVar = this.c;
        if (hhVar.q != i) {
            hhVar.q = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        hh hhVar = this.c;
        if (hhVar.p != max) {
            hhVar.p = max;
            hhVar.b();
            requestLayout();
            invalidate();
        }
    }

    @Override // defpackage.ad
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        this.c.b();
    }
}
