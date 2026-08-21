package defpackage;

/* loaded from: classes.dex */
public final class xu extends p {
    public static final /* synthetic */ int f = 0;
    public s c;
    public boolean d;
    public t e;

    static {
        new s("2.5.29.9").v();
        new s("2.5.29.14").v();
        new s("2.5.29.15").v();
        new s("2.5.29.16").v();
        new s("2.5.29.17").v();
        new s("2.5.29.18").v();
        new s("2.5.29.19").v();
        new s("2.5.29.20").v();
        new s("2.5.29.21").v();
        new s("2.5.29.23").v();
        new s("2.5.29.24").v();
        new s("2.5.29.27").v();
        new s("2.5.29.28").v();
        new s("2.5.29.29").v();
        new s("2.5.29.30").v();
        new s("2.5.29.31").v();
        new s("2.5.29.32").v();
        new s("2.5.29.33").v();
        new s("2.5.29.35").v();
        new s("2.5.29.36").v();
        new s("2.5.29.37").v();
        new s("2.5.29.46").v();
        new s("2.5.29.54").v();
        new s("1.3.6.1.5.5.7.1.1").v();
        new s("1.3.6.1.5.5.7.1.11").v();
        new s("1.3.6.1.5.5.7.1.12").v();
        new s("1.3.6.1.5.5.7.1.2").v();
        new s("1.3.6.1.5.5.7.1.3").v();
        new s("1.3.6.1.5.5.7.1.4").v();
        new s("2.5.29.56").v();
        new s("2.5.29.55").v();
        new s("2.5.29.60").v();
        new s("2.5.29.72").v();
        new s("2.5.29.73").v();
        new s("2.5.29.74").v();
        new s("2.16.840.1.114027.80.6.1");
    }

    @Override // defpackage.p, defpackage.i
    public final x c() {
        j jVar = new j(3);
        jVar.d(this.c);
        if (this.d) {
            jVar.d(g.e);
        }
        jVar.d(this.e);
        nm nmVar = new nm(jVar, 0);
        nmVar.f = -1;
        return nmVar;
    }

    @Override // defpackage.p
    public final boolean equals(Object obj) {
        if (!(obj instanceof xu)) {
            return false;
        }
        xu xuVar = (xu) obj;
        if (!xuVar.c.m(this.c) || !xuVar.e.m(this.e) || xuVar.d != this.d) {
            return false;
        }
        return true;
    }

    @Override // defpackage.p
    public final int hashCode() {
        s sVar = this.c;
        boolean z = this.d;
        t tVar = this.e;
        if (z) {
            return f20.K(tVar.c) ^ f20.K(sVar.c);
        }
        return ~(f20.K(tVar.c) ^ f20.K(sVar.c));
    }
}
