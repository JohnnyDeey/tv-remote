package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class hh {
    public int a;
    public int b;
    public float c;
    public boolean d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public float n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;

    public final boolean a(boolean z) {
        if (this.l > 0) {
            if (z || this.k <= 0) {
                if (z && this.j > 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void b() {
        if (this.i >= 0) {
            return;
        }
        c.k("indicatorTrackGapSize must be >= 0.");
    }
}
