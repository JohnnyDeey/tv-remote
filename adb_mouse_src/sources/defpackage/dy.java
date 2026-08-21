package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class dy {
    public static final cy a = cy.a;

    public static cy a(gx gxVar) {
        while (gxVar != null) {
            if (gxVar.u != null && gxVar.m) {
                gxVar.j();
            }
            gxVar = gxVar.w;
        }
        return a;
    }

    public static void b(tz0 tz0Var) {
        if (vx.F(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(tz0Var.c.getClass().getName()), tz0Var);
        }
    }

    public static final void c(gx gxVar, String str) {
        str.getClass();
        b(new tz0(gxVar, "Attempting to reuse fragment " + gxVar + " with previous ID " + str));
        a(gxVar).getClass();
    }
}
