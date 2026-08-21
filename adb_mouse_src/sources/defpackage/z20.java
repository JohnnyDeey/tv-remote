package defpackage;

import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;

/* loaded from: classes.dex */
public abstract class z20 implements et0, it0 {
    public final /* synthetic */ int c;
    public final rd d;
    public final Key e;
    public final short f;
    public final String g;

    public z20(rd rdVar, PrivateKey privateKey, short s, String str, int i) {
        this.c = i;
        switch (i) {
            case 1:
                if (privateKey != null) {
                    this.d = rdVar;
                    this.e = privateKey;
                    this.f = s;
                    this.g = str;
                    return;
                }
                c.g("privateKey");
                throw null;
            default:
                if (privateKey != null) {
                    this.d = rdVar;
                    this.e = privateKey;
                    this.f = s;
                    this.g = str;
                    return;
                }
                c.g("privateKey");
                throw null;
        }
    }

    @Override // defpackage.et0
    public byte[] d(go0 go0Var, byte[] bArr) {
        switch (this.c) {
            case 0:
                rd rdVar = this.d;
                if (go0Var != null && go0Var.b != this.f) {
                    c.p(go0Var, "Invalid algorithm: ");
                    return null;
                }
                try {
                    Signature n = ((sb0) rdVar.c).n(this.g);
                    n.initSign((PrivateKey) this.e, (SecureRandom) rdVar.d);
                    if (go0Var == null) {
                        n.update(bArr, 16, 20);
                    } else {
                        n.update(bArr, 0, bArr.length);
                    }
                    return n.sign();
                } catch (GeneralSecurityException e) {
                    f40.a(80, e, null);
                    return null;
                }
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.et0
    public u20 h(go0 go0Var) {
        switch (this.c) {
            case 0:
                return null;
            default:
                if (go0Var != null && go0Var.b == this.f && go0Var.a == 8) {
                    return this.d.u(this.g, null, (PrivateKey) this.e, false);
                }
                c.p(go0Var, "Invalid algorithm: ");
                return null;
        }
    }

    @Override // defpackage.it0
    public boolean k(r6 r6Var, byte[] bArr) {
        go0 go0Var = (go0) r6Var.d;
        if (go0Var != null && go0Var.b != this.f) {
            c.p(go0Var, "Invalid algorithm: ");
            return false;
        }
        try {
            Signature n = ((sb0) this.d.c).n(this.g);
            n.initVerify((PublicKey) this.e);
            if (go0Var == null) {
                n.update(bArr, 16, 20);
            } else {
                n.update(bArr, 0, bArr.length);
            }
            return n.verify((byte[]) r6Var.e);
        } catch (GeneralSecurityException e) {
            f40.j("unable to process signature: ", e.getMessage(), e);
            return false;
        }
    }

    public ft0 l(r6 r6Var) {
        return null;
    }

    public z20(rd rdVar, PublicKey publicKey, short s, String str) {
        this.c = 2;
        if (rdVar == null) {
            c.g("crypto");
            throw null;
        }
        if (publicKey == null) {
            c.g("publicKey");
            throw null;
        }
        this.d = rdVar;
        this.e = publicKey;
        this.f = s;
        this.g = str;
    }
}
