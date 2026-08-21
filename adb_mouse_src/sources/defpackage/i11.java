package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class i11 {
    public static final m11 b;
    public final m11 a;

    static {
        y01 r01Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            r01Var = new x01();
        } else if (i >= 35) {
            r01Var = new w01();
        } else if (i >= 34) {
            r01Var = new v01();
        } else if (i >= 31) {
            r01Var = new u01();
        } else if (i >= 30) {
            r01Var = new t01();
        } else if (i >= 29) {
            r01Var = new s01();
        } else {
            r01Var = new r01();
        }
        b = r01Var.b().a.a().a.b().a.c();
    }

    public i11(m11 m11Var) {
        this.a = m11Var;
    }

    public m11 a() {
        return this.a;
    }

    public m11 b() {
        return this.a;
    }

    public m11 c() {
        return this.a;
    }

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i11)) {
            return false;
        }
        i11 i11Var = (i11) obj;
        if (r() == i11Var.r() && q() == i11Var.q() && Objects.equals(l(), i11Var.l()) && Objects.equals(j(), i11Var.j()) && Objects.equals(g(), i11Var.g())) {
            return true;
        }
        return false;
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public ar g() {
        return null;
    }

    public d20 h(int i) {
        return d20.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(r()), Boolean.valueOf(q()), l(), j(), g());
    }

    public d20 i() {
        return l();
    }

    public d20 j() {
        return d20.e;
    }

    public d20 k() {
        return l();
    }

    public d20 l() {
        return d20.e;
    }

    public d20 m() {
        return l();
    }

    public m11 p(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean q() {
        return false;
    }

    public boolean r() {
        return false;
    }

    public void o() {
    }

    public void d(View view) {
    }

    public void n(View view) {
    }

    public void s(cr crVar) {
    }

    public void t(d20[] d20VarArr) {
    }

    public void u(m11 m11Var) {
    }

    public void v(d20 d20Var) {
    }

    public void w(int i) {
    }

    public void x(Rect[][] rectArr) {
    }

    public void y(Rect[][] rectArr) {
    }
}
