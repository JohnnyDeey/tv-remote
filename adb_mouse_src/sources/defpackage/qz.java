package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class qz {
    public int a;
    public int b;
    public int c;
    public Object d;

    public qz(s sVar) {
        int b;
        if (sVar != null) {
            this.d = sVar;
            mq a = pq.a(sVar);
            String a2 = a.a();
            if (a2.equals("SHAKE128")) {
                b = 32;
            } else if (a2.equals("SHAKE256")) {
                b = 64;
            } else {
                b = a.b();
            }
            this.a = b;
            int i = 16;
            this.b = 16;
            double d = b * 8;
            int i2 = 0;
            int i3 = 16;
            int i4 = 0;
            while (true) {
                i3 >>= 1;
                if (i3 == 0) {
                    break;
                } else {
                    i4++;
                }
            }
            int ceil = (int) Math.ceil(d / i4);
            int i5 = 15 * ceil;
            int i6 = 0;
            while (true) {
                i5 >>= 1;
                if (i5 == 0) {
                    break;
                } else {
                    i6++;
                }
            }
            while (true) {
                i >>= 1;
                if (i == 0) {
                    break;
                } else {
                    i2++;
                }
            }
            int floor = ((int) Math.floor(i6 / i2)) + 1 + ceil;
            this.c = floor;
            String a3 = a.a();
            if (a3 != null) {
                if (((yz0) yz0.b.get(yz0.a(a3, b, floor))) != null) {
                    return;
                }
                c.j(a.a(), "cannot find OID for digest algorithm: ");
                throw null;
            }
            Map map = yz0.b;
            c.g("algorithmName == null");
            throw null;
        }
        c.g("treeDigest == null");
        throw null;
    }

    public void a(int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                int i3 = this.c;
                int i4 = i3 * 2;
                int[] iArr = (int[]) this.d;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.d = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i4 >= iArr.length) {
                    int[] iArr3 = new int[i3 * 4];
                    this.d = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = (int[]) this.d;
                iArr4[i4] = i;
                iArr4[i4 + 1] = i2;
                this.c++;
                return;
            }
            c.k("Pixel distance must be non-negative");
            return;
        }
        c.k("Layout positions must be non-negative");
    }

    public void b(RecyclerView recyclerView, boolean z) {
        this.c = 0;
        int[] iArr = (int[]) this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        oh0 oh0Var = recyclerView.o;
        if (recyclerView.n != null && oh0Var != null && oh0Var.i) {
            if (z) {
                if (!recyclerView.f.n()) {
                    oh0Var.i(recyclerView.n.a(), this);
                }
            } else if (!recyclerView.K()) {
                oh0Var.h(this.a, this.b, recyclerView.h0, this);
            }
            int i = this.c;
            if (i > oh0Var.j) {
                oh0Var.j = i;
                oh0Var.k = z;
                recyclerView.d.l();
            }
        }
    }
}
