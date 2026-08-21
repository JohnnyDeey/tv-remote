package defpackage;

import androidx.lifecycle.b;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class a70 {
    public final i81 c;
    public boolean d;
    public int e = -1;
    public final /* synthetic */ b f;

    public a70(b bVar, i81 i81Var) {
        this.f = bVar;
        this.c = i81Var;
    }

    public final void b(boolean z) {
        int i;
        if (z != this.d) {
            this.d = z;
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            b bVar = this.f;
            int i2 = bVar.c;
            bVar.c = i + i2;
            if (!bVar.d) {
                bVar.d = true;
                while (true) {
                    try {
                        int i3 = bVar.c;
                        if (i2 == i3) {
                            break;
                        } else {
                            i2 = i3;
                        }
                    } finally {
                        bVar.d = false;
                    }
                }
            }
            if (this.d) {
                bVar.c(this);
            }
        }
    }

    public abstract boolean e();

    public void d() {
    }
}
