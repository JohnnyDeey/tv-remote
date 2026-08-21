package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class j70 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(j70.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(j70.class, "_state$volatile");
    public static final ce g = new ce("REMOVE_FROZEN", 2);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    public j70(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            if ((i & i2) == 0) {
                return;
            }
            c.o("Check failed.");
            throw null;
        }
        c.o("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                if ((2305843009213693952L & j) != 0) {
                    return 2;
                }
                return 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) != (i & i3)) {
                boolean z = this.b;
                AtomicReferenceArray atomicReferenceArray = this.d;
                if (!z && atomicReferenceArray.get(i2 & i3) != null) {
                    int i4 = this.a;
                    if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                        return 1;
                    }
                } else {
                    j70 j70Var = this;
                    if (f.compareAndSet(j70Var, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i2 & i3, obj);
                        j70 j70Var2 = j70Var;
                        while ((atomicLongFieldUpdater.get(j70Var2) & 1152921504606846976L) != 0) {
                            j70Var2 = j70Var2.c();
                            AtomicReferenceArray atomicReferenceArray2 = j70Var2.d;
                            int i5 = j70Var2.c & i2;
                            Object obj2 = atomicReferenceArray2.get(i5);
                            if ((obj2 instanceof i70) && ((i70) obj2).a == i2) {
                                atomicReferenceArray2.set(i5, obj);
                            } else {
                                j70Var2 = null;
                            }
                            if (j70Var2 == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                    this = j70Var;
                }
            } else {
                return 1;
            }
        }
    }

    public final boolean b() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            j70 j70Var = this;
            if (atomicLongFieldUpdater.compareAndSet(j70Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = j70Var;
        }
    }

    public final j70 c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        j70 j70Var;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                j70Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            j70Var = this;
            if (atomicLongFieldUpdater.compareAndSet(j70Var, j, j2)) {
                j = j2;
                break;
            }
            this = j70Var;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            j70 j70Var2 = (j70) atomicReferenceFieldUpdater.get(j70Var);
            if (j70Var2 != null) {
                return j70Var2;
            }
            j70 j70Var3 = new j70(j70Var.a * 2, j70Var.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = j70Var.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = j70Var.d.get(i4);
                if (obj == null) {
                    obj = new i70(i);
                }
                j70Var3.d.set(j70Var3.c & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(j70Var3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(j70Var, null, j70Var3) && atomicReferenceFieldUpdater.get(j70Var) == null) {
            }
        }
    }

    public final Object d() {
        j70 j70Var = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(j70Var);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = j70Var.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = j70Var.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = j70Var.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof i70) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (f.compareAndSet(j70Var, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                j70Var = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(j70Var);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            j70Var = j70Var.c();
                        } else {
                            j70 j70Var2 = j70Var;
                            if (f.compareAndSet(j70Var2, j3, (j3 & (-1073741824)) | j2)) {
                                j70Var2.d.set(i4 & j70Var2.c, null);
                                j70Var = null;
                            } else {
                                j70Var = j70Var2;
                            }
                        }
                        if (j70Var == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
