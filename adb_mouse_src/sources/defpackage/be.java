package defpackage;

import java.security.PrivilegedAction;
import java.security.Provider;

/* loaded from: classes.dex */
public final class be implements PrivilegedAction {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ de d;

    public be(de deVar, String str, String str2, String str3) {
        this.d = deVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Provider.Service service;
        String str = this.a;
        String str2 = this.b;
        de deVar = this.d;
        service = super/*java.security.Provider*/.getService(str, str2);
        if (service != null && service.getClassName() != null) {
            deVar.c.put(this.c, service);
            deVar.remove(service.getType() + "." + service.getAlgorithm());
            deVar.putService(service);
            return service;
        }
        return null;
    }
}
