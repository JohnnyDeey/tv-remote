package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class qi implements dl, Serializable {
    public final dl c;
    public final bl d;

    public qi(bl blVar, dl dlVar) {
        dlVar.getClass();
        blVar.getClass();
        this.c = dlVar;
        this.d = blVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj instanceof qi) {
                qi qiVar = (qi) obj;
                int i = 2;
                qi qiVar2 = qiVar;
                int i2 = 2;
                while (true) {
                    dl dlVar = qiVar2.c;
                    if (dlVar instanceof qi) {
                        qiVar2 = (qi) dlVar;
                    } else {
                        qiVar2 = null;
                    }
                    if (qiVar2 == null) {
                        break;
                    }
                    i2++;
                }
                qi qiVar3 = this;
                while (true) {
                    dl dlVar2 = qiVar3.c;
                    if (dlVar2 instanceof qi) {
                        qiVar3 = (qi) dlVar2;
                    } else {
                        qiVar3 = null;
                    }
                    if (qiVar3 == null) {
                        break;
                    }
                    i++;
                }
                if (i2 == i) {
                    while (true) {
                        bl blVar = this.d;
                        if (!k20.c(qiVar.h(blVar.getKey()), blVar)) {
                            z = false;
                            break;
                        }
                        dl dlVar3 = this.c;
                        if (dlVar3 instanceof qi) {
                            this = (qi) dlVar3;
                        } else {
                            dlVar3.getClass();
                            bl blVar2 = (bl) dlVar3;
                            z = k20.c(qiVar.h(blVar2.getKey()), blVar2);
                            break;
                        }
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dl
    public final Object f(Object obj, zy zyVar) {
        return zyVar.g(this.c.f(obj, zyVar), this.d);
    }

    @Override // defpackage.dl
    public final dl g(dl dlVar) {
        return k20.b0(this, dlVar);
    }

    @Override // defpackage.dl
    public final bl h(cl clVar) {
        clVar.getClass();
        while (true) {
            bl h = this.d.h(clVar);
            if (h != null) {
                return h;
            }
            dl dlVar = this.c;
            if (dlVar instanceof qi) {
                this = (qi) dlVar;
            } else {
                return dlVar.h(clVar);
            }
        }
    }

    public final int hashCode() {
        return this.d.hashCode() + this.c.hashCode();
    }

    @Override // defpackage.dl
    public final dl k(cl clVar) {
        clVar.getClass();
        bl blVar = this.d;
        bl h = blVar.h(clVar);
        dl dlVar = this.c;
        if (h != null) {
            return dlVar;
        }
        dl k = dlVar.k(clVar);
        if (k == dlVar) {
            return this;
        }
        if (k == st.c) {
            return blVar;
        }
        return new qi(blVar, k);
    }

    public final String toString() {
        return "[" + ((String) f("", new pi(0))) + ']';
    }
}
