package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ge implements a01 {
    public Object c = je.p;
    public ff d;
    public final /* synthetic */ he e;

    public ge(he heVar) {
        this.e = heVar;
    }

    @Override // defpackage.a01
    public final void a(mm0 mm0Var, int i) {
        ff ffVar = this.d;
        if (ffVar != null) {
            ffVar.a(mm0Var, i);
        }
    }

    public final Object b(rk rkVar) {
        pg pgVar;
        Boolean bool;
        pg pgVar2;
        Object obj = this.c;
        boolean z = true;
        if (obj == je.p || obj == je.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = he.i;
            he heVar = this.e;
            pg pgVar3 = (pg) atomicReferenceFieldUpdater.get(heVar);
            while (true) {
                if (heVar.s(he.d.get(heVar), true)) {
                    this.c = je.l;
                    Throwable n = heVar.n();
                    if (n == null) {
                        z = false;
                    } else {
                        int i = fp0.a;
                        throw n;
                    }
                } else {
                    long andIncrement = he.e.getAndIncrement(heVar);
                    long j = je.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (pgVar3.c != j2) {
                        pg m = heVar.m(j2, pgVar3);
                        if (m == null) {
                            continue;
                        } else {
                            pgVar = m;
                        }
                    } else {
                        pgVar = pgVar3;
                    }
                    Object A = heVar.A(pgVar, i2, andIncrement, null);
                    ce ceVar = je.m;
                    if (A != ceVar) {
                        ce ceVar2 = je.o;
                        if (A == ceVar2) {
                            if (andIncrement < heVar.p()) {
                                pgVar.a();
                            }
                            pgVar3 = pgVar;
                        } else {
                            if (A == je.n) {
                                ff s = mn.s(wv0.G(rkVar));
                                try {
                                    this.d = s;
                                    Object A2 = heVar.A(pgVar, i2, andIncrement, this);
                                    if (A2 == ceVar) {
                                        a(pgVar, i2);
                                    } else {
                                        if (A2 == ceVar2) {
                                            if (andIncrement < heVar.p()) {
                                                pgVar.a();
                                            }
                                            pg pgVar4 = (pg) he.i.get(heVar);
                                            while (true) {
                                                if (heVar.s(he.d.get(heVar), true)) {
                                                    ff ffVar = this.d;
                                                    ffVar.getClass();
                                                    this.d = null;
                                                    this.c = je.l;
                                                    Throwable n2 = heVar.n();
                                                    if (n2 == null) {
                                                        ffVar.e(Boolean.FALSE);
                                                    } else {
                                                        ffVar.e(new sj0(n2));
                                                    }
                                                } else {
                                                    long andIncrement2 = he.e.getAndIncrement(heVar);
                                                    long j3 = je.b;
                                                    long j4 = andIncrement2 / j3;
                                                    int i3 = (int) (andIncrement2 % j3);
                                                    if (pgVar4.c != j4) {
                                                        pg m2 = heVar.m(j4, pgVar4);
                                                        if (m2 != null) {
                                                            pgVar2 = m2;
                                                        }
                                                    } else {
                                                        pgVar2 = pgVar4;
                                                    }
                                                    Object A3 = heVar.A(pgVar2, i3, andIncrement2, this);
                                                    pg pgVar5 = pgVar2;
                                                    if (A3 == je.m) {
                                                        a(pgVar5, i3);
                                                        break;
                                                    }
                                                    if (A3 == je.o) {
                                                        if (andIncrement2 < heVar.p()) {
                                                            pgVar5.a();
                                                        }
                                                        pgVar4 = pgVar5;
                                                    } else if (A3 != je.n) {
                                                        pgVar5.a();
                                                        this.c = A3;
                                                        this.d = null;
                                                        bool = Boolean.TRUE;
                                                    } else {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                }
                                            }
                                        } else {
                                            pgVar.a();
                                            this.c = A2;
                                            this.d = null;
                                            bool = Boolean.TRUE;
                                        }
                                        s.y(bool, s.e, null);
                                    }
                                    return s.r();
                                } catch (Throwable th) {
                                    s.x();
                                    throw th;
                                }
                            }
                            pgVar.a();
                            this.c = A;
                        }
                    } else {
                        c.o("unreachable");
                        return null;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() {
        Object obj = this.c;
        ce ceVar = je.p;
        if (obj != ceVar) {
            this.c = ceVar;
            if (obj != je.l) {
                return obj;
            }
            Throwable n = this.e.n();
            if (n == null) {
                n = new NoSuchElementException("Channel was closed");
            }
            int i = fp0.a;
            throw n;
        }
        c.o("`hasNext()` has not been invoked");
        return null;
    }
}
