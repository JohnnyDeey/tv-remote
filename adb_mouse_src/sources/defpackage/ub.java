package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class ub implements u {
    public final /* synthetic */ int c = 1;
    public Object d;

    public ub(c0 c0Var) {
        this.d = c0Var;
    }

    public static tb a(c0 c0Var) {
        return new tb(gi0.j(new ek(c0Var)), null);
    }

    @Override // defpackage.u
    public final InputStream b() {
        switch (this.c) {
            case 0:
                return new ek((c0) this.d);
            default:
                return (vo) this.d;
        }
    }

    @Override // defpackage.i
    public final x c() {
        switch (this.c) {
            case 0:
                try {
                    return a((c0) this.d);
                } catch (IOException e) {
                    c.i("IOException converting stream to byte array: ", e.getMessage(), e);
                    return null;
                }
            default:
                try {
                    return f();
                } catch (IOException e2) {
                    c.i("IOException converting stream to byte array: ", e2.getMessage(), e2);
                    return null;
                }
        }
    }

    @Override // defpackage.o10
    public final x f() {
        switch (this.c) {
            case 0:
                return a((c0) this.d);
            default:
                return new t(((vo) this.d).b());
        }
    }

    public /* synthetic */ ub() {
    }
}
