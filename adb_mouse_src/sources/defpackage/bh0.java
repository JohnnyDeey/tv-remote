package defpackage;

/* loaded from: classes.dex */
public final class bh0 {
    public long b = 0;
    public boolean a = false;

    public synchronized long a(short s) {
        long j;
        if (!this.a) {
            j = this.b;
            long j2 = 1 + j;
            this.b = j2;
            if (j2 == 0) {
                this.a = true;
            }
        } else {
            throw new us0(s, "Sequence numbers exhausted", null);
        }
        return j;
    }

    public synchronized void b() {
        this.b = 0L;
        this.a = false;
    }
}
