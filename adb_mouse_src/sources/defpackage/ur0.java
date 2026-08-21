package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class ur0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(ur0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public nu[] a;

    public final void a(nu nuVar) {
        nuVar.d((ou) this);
        nu[] nuVarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (nuVarArr == null) {
            nuVarArr = new nu[4];
            this.a = nuVarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= nuVarArr.length) {
            nuVarArr = (nu[]) Arrays.copyOf(nuVarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = nuVarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        nuVarArr[i] = nuVar;
        nuVar.d = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nu b(int r9) {
        /*
            r8 = this;
            nu[] r0 = r8.a
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.ur0.b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            r4.getClass()
            r5 = r0[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            nu[] r5 = r8.a
            r5.getClass()
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            r6.getClass()
            r7 = r5[r4]
            r7.getClass()
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            r4.getClass()
            r5 = r5[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            r9.getClass()
            r2 = 0
            r9.d(r2)
            r9.d = r3
            int r8 = r1.get(r8)
            r0[r8] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur0.b(int):nu");
    }

    public final void c(int i) {
        while (i > 0) {
            nu[] nuVarArr = this.a;
            nuVarArr.getClass();
            int i2 = (i - 1) / 2;
            nu nuVar = nuVarArr[i2];
            nuVar.getClass();
            nu nuVar2 = nuVarArr[i];
            nuVar2.getClass();
            if (nuVar.compareTo(nuVar2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        nu[] nuVarArr = this.a;
        nuVarArr.getClass();
        nu nuVar = nuVarArr[i2];
        nuVar.getClass();
        nu nuVar2 = nuVarArr[i];
        nuVar2.getClass();
        nuVarArr[i] = nuVar;
        nuVarArr[i2] = nuVar2;
        nuVar.d = i;
        nuVar2.d = i2;
    }
}
