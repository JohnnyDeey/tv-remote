package defpackage;

import java.io.IOException;
import java.security.SignatureException;

/* loaded from: classes.dex */
public final class ru extends IOException {
    public final /* synthetic */ SignatureException c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru(String str, SignatureException signatureException) {
        super(str);
        this.c = signatureException;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.c;
    }
}
