package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class si {
    public final Object a;
    public final cf b;
    public final az c;
    public final Object d;
    public final Throwable e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ si(java.lang.Object r3, defpackage.cf r4, defpackage.az r5, java.util.concurrent.CancellationException r6, int r7) {
        /*
            r2 = this;
            r0 = r7 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r7 & 4
            if (r0 == 0) goto Lb
            r5 = r1
        Lb:
            r7 = r7 & 16
            if (r7 == 0) goto L11
            r7 = r1
            goto L12
        L11:
            r7 = r6
        L12:
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si.<init>(java.lang.Object, cf, az, java.util.concurrent.CancellationException, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static si a(si siVar, cf cfVar, CancellationException cancellationException, int i) {
        Object obj = siVar.a;
        if ((i & 2) != 0) {
            cfVar = siVar.b;
        }
        cf cfVar2 = cfVar;
        az azVar = siVar.c;
        Object obj2 = siVar.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = siVar.e;
        }
        return new si(obj, cfVar2, azVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si)) {
            return false;
        }
        si siVar = (si) obj;
        if (k20.c(this.a, siVar.a) && k20.c(this.b, siVar.b) && k20.c(this.c, siVar.c) && k20.c(this.d, siVar.d) && k20.c(this.e, siVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        cf cfVar = this.b;
        if (cfVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cfVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        az azVar = this.c;
        if (azVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = azVar.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Throwable th = this.e;
        if (th != null) {
            i = th.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public si(Object obj, cf cfVar, az azVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = cfVar;
        this.c = azVar;
        this.d = obj2;
        this.e = th;
    }
}
