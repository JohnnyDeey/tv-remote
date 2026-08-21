package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public class zb implements i, o10 {
    public final int c;
    public final int d;
    public final c0 e;

    public zb(int i, int i2, c0 c0Var) {
        this.c = i;
        this.d = i2;
        this.e = c0Var;
    }

    @Override // defpackage.i
    public final x c() {
        try {
            return f();
        } catch (IOException e) {
            throw new w(e.getMessage(), 0);
        }
    }

    public x f() {
        return this.e.n(this.c, this.d);
    }
}
