package defpackage;

import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class t3 extends po {
    public final /* synthetic */ rd g;
    public final /* synthetic */ KeyPair h;
    public final /* synthetic */ byte[] i;
    public final /* synthetic */ u3 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(rd rdVar, KeyPair keyPair, byte[] bArr, u3 u3Var) {
        super(rdVar);
        this.g = rdVar;
        this.h = keyPair;
        this.i = bArr;
        this.j = u3Var;
    }

    @Override // defpackage.po
    public final l3 b() {
        return new l3(this, this.g, this.h, this.i, 1);
    }

    @Override // defpackage.po
    public final int[] d() {
        return new int[]{4865, 4866, 4867};
    }

    @Override // defpackage.po
    public final xf0[] e() {
        return new xf0[]{xf0.g};
    }

    @Override // defpackage.po
    public final void f() {
        byte[] e;
        js0 js0Var = this.b;
        im0 b = js0Var.b();
        if (b != null) {
            if (b.y) {
                if (ht0.A(b.H)) {
                    i30 i30Var = b.m;
                    if (i30Var != null) {
                        int i = b.g;
                        byte[] bArr = ht0.e;
                        try {
                            c30 q = js0Var.a.q(i);
                            MessageDigest messageDigest = q.a;
                            byte[] digest = messageDigest.digest();
                            im0 b2 = js0Var.b();
                            i30 n = ht0.n(b2.g, b2.h, i30Var, "adb-label\u0000", digest);
                            if (bArr.length > 0) {
                                q.update(bArr, 0, bArr.length);
                                digest = messageDigest.digest();
                            }
                            e = r21.A(i, 64, n, "exporter", digest).e();
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    } else {
                        c.o("Export of key material only available from notifyHandshakeComplete()");
                        return;
                    }
                } else {
                    byte[] h = f20.h(b.r, b.s);
                    i30 i30Var2 = b.o;
                    if (i30Var2 != null) {
                        e = i30Var2.c(b.f, 64, "adb-label\u0000", h).e();
                    } else {
                        c.o("Export of key material only available from notifyHandshakeComplete()");
                        return;
                    }
                }
                e.getClass();
                this.j.e = e;
                return;
            }
            c.o("Export of key material requires extended_master_secret");
            return;
        }
        c.o("Export of key material unavailable before handshake completion");
    }
}
