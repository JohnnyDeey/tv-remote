package defpackage;

import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class w50 extends InputStream {
    public final InputStream c;
    public final int d;

    public w50(int i, InputStream inputStream) {
        this.c = inputStream;
        this.d = i;
    }

    public final void a() {
        InputStream inputStream = this.c;
        if (inputStream instanceof s10) {
            s10 s10Var = (s10) inputStream;
            s10Var.h = true;
            s10Var.b();
        }
    }
}
