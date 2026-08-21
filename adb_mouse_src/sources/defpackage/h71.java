package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class h71 {
    protected transient int zza;

    public abstract void a(p71 p71Var);

    public final byte[] b() {
        try {
            int d = d();
            byte[] bArr = new byte[d];
            p71 p71Var = new p71(d, bArr);
            a(p71Var);
            if (d - p71Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            f40.k(qo0.r("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public abstract int c(u81 u81Var);

    public abstract int d();
}
