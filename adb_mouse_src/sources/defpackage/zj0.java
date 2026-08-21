package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class zj0 extends f20 {
    @Override // defpackage.f20
    public final void z(yn0 yn0Var, float f, float f2) {
        float f3 = f2 * f;
        yn0Var.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        un0 un0Var = new un0(0.0f, 0.0f, f4, f4);
        un0Var.f = 180.0f;
        un0Var.g = 90.0f;
        yn0Var.f.add(un0Var);
        sn0 sn0Var = new sn0(un0Var);
        yn0Var.a(180.0f);
        yn0Var.g.add(sn0Var);
        yn0Var.d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        yn0Var.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        yn0Var.c = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
