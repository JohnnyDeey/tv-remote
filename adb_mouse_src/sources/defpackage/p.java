package defpackage;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public abstract class p implements i, xt {
    @Override // defpackage.i
    public abstract x c();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return c().m(((i) obj).c());
    }

    @Override // defpackage.xt
    public final byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        x c = c();
        c.getClass();
        c.j(new v(byteArrayOutputStream), true);
        return byteArrayOutputStream.toByteArray();
    }

    public final byte[] h() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        x c = c();
        c.getClass();
        new v(byteArrayOutputStream).q(c);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return c().hashCode();
    }
}
