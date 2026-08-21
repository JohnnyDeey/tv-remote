package defpackage;

import java.security.PrivilegedExceptionAction;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes.dex */
public final class kz implements PrivilegedExceptionAction {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte[] b;

    public kz(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        return (AlgorithmParameterSpec) mz.a.newInstance(Integer.valueOf(this.a), this.b);
    }
}
