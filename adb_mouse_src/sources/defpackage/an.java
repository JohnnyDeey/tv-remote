package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class an implements f {
    public final vo c;
    public int d = 0;

    public an(vo voVar) {
        this.c = voVar;
    }

    @Override // defpackage.i
    public final x c() {
        try {
            return f();
        } catch (IOException e) {
            c.i("IOException converting stream to byte array: ", e.getMessage(), e);
            return null;
        }
    }

    @Override // defpackage.f
    public final int e() {
        return this.d;
    }

    @Override // defpackage.o10
    public final x f() {
        return e.q(this.c.b());
    }

    @Override // defpackage.f
    public final InputStream g() {
        String str;
        vo voVar = this.c;
        int i = voVar.f;
        if (i >= 1) {
            int read = voVar.read();
            this.d = read;
            if (read > 0) {
                if (i >= 2) {
                    if (read > 7) {
                        str = "pad bits cannot be greater than 7 or less than 0";
                    }
                } else {
                    str = "zero length data with non-zero pad bits";
                }
            }
            return voVar;
        }
        str = "content octets cannot be empty";
        c.o(str);
        return null;
    }
}
