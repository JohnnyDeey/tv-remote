package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class nu implements Runnable, Comparable, dr {
    private volatile Object _heap;
    public long c;
    public int d;

    @Override // defpackage.dr
    public final void a() {
        ou ouVar;
        synchronized (this) {
            try {
                Object obj = this._heap;
                ce ceVar = wv0.i;
                if (obj == ceVar) {
                    return;
                }
                ur0 ur0Var = null;
                if (obj instanceof ou) {
                    ouVar = (ou) obj;
                } else {
                    ouVar = null;
                }
                if (ouVar != null) {
                    synchronized (ouVar) {
                        Object obj2 = this._heap;
                        if (obj2 instanceof ur0) {
                            ur0Var = (ur0) obj2;
                        }
                        if (ur0Var != null) {
                            ouVar.b(this.d);
                        }
                    }
                }
                this._heap = ceVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j, ou ouVar, pu puVar) {
        nu nuVar;
        boolean z;
        synchronized (this) {
            if (this._heap == wv0.i) {
                return 2;
            }
            synchronized (ouVar) {
                try {
                    nu[] nuVarArr = ouVar.a;
                    if (nuVarArr != null) {
                        nuVar = nuVarArr[0];
                    } else {
                        nuVar = null;
                    }
                    if (pu.j.get(puVar) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return 1;
                    }
                    if (nuVar == null) {
                        ouVar.c = j;
                    } else {
                        long j2 = nuVar.c;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - ouVar.c > 0) {
                            ouVar.c = j;
                        }
                    }
                    long j3 = this.c;
                    long j4 = ouVar.c;
                    if (j3 - j4 < 0) {
                        this.c = j4;
                    }
                    ouVar.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.c - ((nu) obj).c;
        if (j > 0) {
            return 1;
        }
        if (j < 0) {
            return -1;
        }
        return 0;
    }

    public final void d(ou ouVar) {
        if (this._heap != wv0.i) {
            this._heap = ouVar;
        } else {
            c.k("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.c + ']';
    }
}
