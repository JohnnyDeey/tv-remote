package defpackage;

import android.provider.Settings;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class t10 extends nr {
    public ch p;
    public d6 q;
    public vx0 r;

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t10.draw(android.graphics.Canvas):void");
    }

    @Override // defpackage.nr
    public final boolean e(boolean z, boolean z2, boolean z3) {
        vx0 vx0Var;
        boolean e = super.e(z, z2, z3);
        if (this.e != null && Settings.Global.getFloat(this.c.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (vx0Var = this.r) != null) {
            return vx0Var.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.q.c();
        }
        if (z && z3) {
            this.q.o();
        }
        return e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.p.g();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.p.g();
    }
}
