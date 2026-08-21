package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class kx implements View.OnAttachStateChangeListener {
    public final /* synthetic */ a c;
    public final /* synthetic */ lx d;

    public kx(lx lxVar, a aVar) {
        this.d = lxVar;
        this.c = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        a aVar = this.c;
        gx gxVar = aVar.c;
        aVar.k();
        no.f((ViewGroup) gxVar.G.getParent(), this.d.c.D()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
