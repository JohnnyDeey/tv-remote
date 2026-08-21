package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class zl extends k90 {
    public final RectF r;

    public zl(zl zlVar) {
        super(zlVar);
        this.r = zlVar.r;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m90, am, android.graphics.drawable.Drawable] */
    @Override // defpackage.k90, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ?? m90Var = new m90(this);
        m90Var.I = this;
        m90Var.invalidateSelf();
        return m90Var;
    }

    public zl(on0 on0Var, RectF rectF) {
        super(on0Var);
        this.r = rectF;
    }
}
