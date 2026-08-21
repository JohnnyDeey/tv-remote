package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class pb implements Serializable, Cloneable {
    public i21 c;
    public final int d;
    public int e;
    public int f;
    public boolean g = false;
    public boolean h = false;

    public pb(int i) {
        this.d = i;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pb clone() {
        pb pbVar = new pb(this.d);
        pbVar.c = this.c;
        pbVar.e = this.e;
        pbVar.f = this.f;
        pbVar.g = this.g;
        pbVar.h = this.h;
        return pbVar;
    }

    public final int b() {
        if (this.g && !this.h) {
            return this.e;
        }
        return Integer.MAX_VALUE;
    }
}
