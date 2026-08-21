package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class sz implements Runnable {
    public static final ThreadLocal g = new ThreadLocal();
    public static final yk h = new yk(1);
    public ArrayList c;
    public long d;
    public long e;
    public ArrayList f;

    public static di0 c(RecyclerView recyclerView, int i, long j) {
        int F = recyclerView.g.F();
        for (int i2 = 0; i2 < F; i2++) {
            di0 I = RecyclerView.I(recyclerView.g.E(i2));
            if (I.c == i && !I.f()) {
                return null;
            }
        }
        uh0 uh0Var = recyclerView.d;
        try {
            recyclerView.P();
            di0 j2 = uh0Var.j(i, j);
            if (j2 != null) {
                if (j2.e() && !j2.f()) {
                    uh0Var.g(j2.a);
                } else {
                    uh0Var.a(j2, false);
                }
            }
            recyclerView.Q(false);
            return j2;
        } catch (Throwable th) {
            recyclerView.Q(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.t && this.d == 0) {
            this.d = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        qz qzVar = recyclerView.g0;
        qzVar.a = i;
        qzVar.b = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j) {
        rz rzVar;
        RecyclerView recyclerView;
        long j2;
        RecyclerView recyclerView2;
        rz rzVar2;
        boolean z;
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = this.c;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            qz qzVar = recyclerView3.g0;
            if (windowVisibility == 0) {
                qzVar.b(recyclerView3, false);
                i += qzVar.c;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                qz qzVar2 = recyclerView4.g0;
                int abs = Math.abs(qzVar2.b) + Math.abs(qzVar2.a);
                for (int i5 = 0; i5 < qzVar2.c * 2; i5 += 2) {
                    if (i3 >= arrayList.size()) {
                        Object obj = new Object();
                        arrayList.add(obj);
                        rzVar2 = obj;
                    } else {
                        rzVar2 = (rz) arrayList.get(i3);
                    }
                    int[] iArr = (int[]) qzVar2.d;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    rzVar2.a = z;
                    rzVar2.b = abs;
                    rzVar2.c = i6;
                    rzVar2.d = recyclerView4;
                    rzVar2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList, h);
        for (int i7 = 0; i7 < arrayList.size() && (recyclerView = (rzVar = (rz) arrayList.get(i7)).d) != null; i7++) {
            if (rzVar.a) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j;
            }
            di0 c = c(recyclerView, rzVar.e, j2);
            if (c != null && c.b != null && c.e() && !c.f() && (recyclerView2 = (RecyclerView) c.b.get()) != null) {
                if (recyclerView2.D && recyclerView2.g.F() != 0) {
                    uh0 uh0Var = recyclerView2.d;
                    kh0 kh0Var = recyclerView2.M;
                    if (kh0Var != null) {
                        kh0Var.e();
                    }
                    oh0 oh0Var = recyclerView2.o;
                    if (oh0Var != null) {
                        oh0Var.h0(uh0Var);
                        recyclerView2.o.i0(uh0Var);
                    }
                    ((ArrayList) uh0Var.c).clear();
                    uh0Var.e();
                }
                qz qzVar3 = recyclerView2.g0;
                qzVar3.b(recyclerView2, true);
                if (qzVar3.c != 0) {
                    try {
                        int i8 = xt0.a;
                        Trace.beginSection("RV Nested Prefetch");
                        ai0 ai0Var = recyclerView2.h0;
                        gh0 gh0Var = recyclerView2.n;
                        ai0Var.d = 1;
                        ai0Var.e = gh0Var.a();
                        ai0Var.g = false;
                        ai0Var.h = false;
                        ai0Var.i = false;
                        for (int i9 = 0; i9 < qzVar3.c * 2; i9 += 2) {
                            c(recyclerView2, ((int[]) qzVar3.d)[i9], j);
                        }
                        Trace.endSection();
                        rzVar.a = false;
                        rzVar.b = 0;
                        rzVar.c = 0;
                        rzVar.d = null;
                        rzVar.e = 0;
                    } catch (Throwable th) {
                        int i10 = xt0.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            rzVar.a = false;
            rzVar.b = 0;
            rzVar.c = 0;
            rzVar.d = null;
            rzVar.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.c;
        try {
            int i = xt0.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j) + this.e);
                }
            }
            this.d = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.d = 0L;
            int i3 = xt0.a;
            Trace.endSection();
            throw th;
        }
    }
}
