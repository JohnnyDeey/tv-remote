package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ll0 extends rk implements xv {
    public final xv f;
    public final dl g;
    public final int h;
    public dl i;
    public qk j;

    public ll0(xv xvVar, dl dlVar) {
        super(ti.e, st.c);
        this.f = xvVar;
        this.g = dlVar;
        this.h = ((Number) dlVar.f(0, new pi(11))).intValue();
    }

    @Override // defpackage.rk, defpackage.nl
    public final nl c() {
        qk qkVar = this.j;
        if (qkVar instanceof nl) {
            return (nl) qkVar;
        }
        return null;
    }

    @Override // defpackage.rk, defpackage.qk
    public final dl d() {
        dl dlVar = this.i;
        if (dlVar == null) {
            return st.c;
        }
        return dlVar;
    }

    @Override // defpackage.xv
    public final Object i(Object obj, qk qkVar) {
        try {
            Object n = n(qkVar, obj);
            if (n == ml.c) {
                return n;
            }
            return nw0.a;
        } catch (Throwable th) {
            this.i = new fr(qkVar.d(), th);
            throw th;
        }
    }

    @Override // defpackage.rk
    public final StackTraceElement k() {
        return null;
    }

    @Override // defpackage.rk
    public final Object l(Object obj) {
        Throwable a = tj0.a(obj);
        if (a != null) {
            this.i = new fr(d(), a);
        }
        qk qkVar = this.j;
        if (qkVar != null) {
            qkVar.e(obj);
        }
        return ml.c;
    }

    public final Object n(qk qkVar, Object obj) {
        List list;
        Comparable comparable;
        int i;
        String str;
        dl d = qkVar.d();
        q30 q30Var = (q30) d.h(os.e);
        if (q30Var != null && !q30Var.D()) {
            throw q30Var.v();
        }
        dl dlVar = this.i;
        if (dlVar != d) {
            int i2 = 1;
            int i3 = 0;
            if (dlVar instanceof fr) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((fr) dlVar).d + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                f60 f60Var = new f60(str2);
                if (!f60Var.hasNext()) {
                    list = ut.c;
                } else {
                    Object next = f60Var.next();
                    if (!f60Var.hasNext()) {
                        list = f20.P(next);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (f60Var.hasNext()) {
                            arrayList.add(f60Var.next());
                        }
                        list = arrayList;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!fq0.N((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(ii.n0(arrayList2));
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i5 = 0;
                    while (true) {
                        if (i5 < length) {
                            char charAt = str3.charAt(i5);
                            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                                break;
                            }
                            i5++;
                        } else {
                            i5 = -1;
                            break;
                        }
                    }
                    if (i5 == -1) {
                        i5 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(i5));
                }
                Iterator it = arrayList3.iterator();
                if (!it.hasNext()) {
                    comparable = null;
                } else {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                }
                Integer num = (Integer) comparable;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                int length2 = str2.length();
                list.size();
                int size2 = list.size() - 1;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list) {
                    int i6 = i3 + 1;
                    if (i3 >= 0) {
                        String str4 = (String) obj4;
                        if ((i3 == 0 || i3 == size2) && fq0.N(str4)) {
                            str = null;
                        } else {
                            str4.getClass();
                            if (i >= 0) {
                                int length3 = str4.length();
                                if (i <= length3) {
                                    length3 = i;
                                }
                                str = str4.substring(length3);
                            } else {
                                f40.b(qo0.n("Requested character count ", i, " is less than zero."));
                                return null;
                            }
                        }
                        if (str != null) {
                            arrayList4.add(str);
                        }
                        i3 = i6;
                    } else {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                }
                StringBuilder sb = new StringBuilder(length2);
                gi.o0(arrayList4, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) d.f(0, new l80(i2, this))).intValue() == this.h) {
                this.i = d;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.g + ",\n\t\tbut emission happened in " + d + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.j = qkVar;
        az azVar = nl0.a;
        xv xvVar = this.f;
        xvVar.getClass();
        Object f = azVar.f(xvVar, obj, this);
        if (!k20.c(f, ml.c)) {
            this.j = null;
        }
        return f;
    }
}
