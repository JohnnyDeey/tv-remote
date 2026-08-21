package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class g41 extends Exception {
    public final jj c;

    public g41(jj jjVar) {
        boolean z;
        if (jjVar.d != 0 && jjVar.e != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.c = jjVar;
        } else {
            c.k("ResolvableConnectionException can only be created with a connection result containing a resolution.");
            throw null;
        }
    }
}
