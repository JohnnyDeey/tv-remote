package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class gj0 implements Runnable {
    public final /* synthetic */ int c = 0;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ gj0(n61 n61Var, dg0 dg0Var, qd qdVar) {
        this.d = n61Var;
        this.e = dg0Var;
        this.f = qdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.c) {
            case 0:
                try {
                    obj = ((qw) this.d).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f).post(new m61((rw) this.e, 9, obj));
                return;
            case 1:
                m01.h((View) this.d, (jp0) this.e);
                ((ValueAnimator) this.f).start();
                return;
            default:
                n61.F((n61) this.d, (dg0) this.e, (qd) this.f);
                return;
        }
    }

    public /* synthetic */ gj0() {
    }

    public gj0(View view, q01 q01Var, jp0 jp0Var, ValueAnimator valueAnimator) {
        this.d = view;
        this.e = jp0Var;
        this.f = valueAnimator;
    }
}
