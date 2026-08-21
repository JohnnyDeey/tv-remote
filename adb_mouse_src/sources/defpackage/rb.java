package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class rb implements f {
    public final c0 c;
    public dk d;

    public rb(c0 c0Var) {
        this.c = c0Var;
    }

    public static qb a(c0 c0Var) {
        dk dkVar = new dk(c0Var);
        return new qb(dkVar.e, gi0.j(dkVar));
    }

    @Override // defpackage.i
    public final x c() {
        try {
            return a(this.c);
        } catch (IOException e) {
            c.i("IOException converting stream to byte array: ", e.getMessage(), e);
            return null;
        }
    }

    @Override // defpackage.f
    public final int e() {
        return this.d.e;
    }

    @Override // defpackage.o10
    public final x f() {
        return a(this.c);
    }

    @Override // defpackage.f
    public final InputStream g() {
        dk dkVar = new dk(this.c);
        this.d = dkVar;
        return dkVar;
    }
}
