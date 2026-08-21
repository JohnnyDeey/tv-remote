package defpackage;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class z implements Enumeration {
    public int a = 0;
    public final /* synthetic */ a0 b;

    public z(a0 a0Var) {
        this.b = a0Var;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        if (this.a < this.b.c.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        int i = this.a;
        i[] iVarArr = this.b.c;
        if (i < iVarArr.length) {
            this.a = i + 1;
            return iVarArr[i];
        }
        throw new NoSuchElementException();
    }
}
