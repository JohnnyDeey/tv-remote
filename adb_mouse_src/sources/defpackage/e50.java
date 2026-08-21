package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e50 implements Enumeration {
    public n a;
    public x b;

    public final x a() {
        try {
            return this.a.f();
        } catch (IOException e) {
            throw new w(0, e, "malformed ASN.1: " + e);
        }
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        x xVar = this.b;
        if (xVar != null) {
            this.b = a();
            return xVar;
        }
        throw new NoSuchElementException();
    }
}
