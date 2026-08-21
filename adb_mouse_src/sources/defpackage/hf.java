package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class hf {
    public boolean a;
    public gf b;
    public boolean c;

    public final void a(gf gfVar) {
        synchronized (this) {
            while (this.c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.b != gfVar) {
                this.b = gfVar;
                if (this.a) {
                    gfVar.onCancel();
                }
            }
        }
    }
}
