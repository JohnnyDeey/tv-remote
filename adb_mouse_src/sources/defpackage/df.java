package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class df extends mi0 {
    public final Typeface d;
    public final i81 e;
    public boolean f;

    public df(i81 i81Var, Typeface typeface) {
        this.d = typeface;
        this.e = i81Var;
    }

    @Override // defpackage.mi0
    public final void I(int i) {
        if (!this.f) {
            di diVar = (di) this.e.d;
            if (diVar.l(this.d)) {
                diVar.j(false);
            }
        }
    }

    @Override // defpackage.mi0
    public final void J(Typeface typeface, boolean z) {
        if (!this.f) {
            di diVar = (di) this.e.d;
            if (diVar.l(typeface)) {
                diVar.j(false);
            }
        }
    }
}
