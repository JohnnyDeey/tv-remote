package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class y21 implements c00, d00 {
    public final z4 b;
    public final c5 c;
    public final jp0 d;
    public final int g;
    public final i31 h;
    public boolean i;
    public final /* synthetic */ e00 l;
    public final LinkedList a = new LinkedList();
    public final HashSet e = new HashSet();
    public final HashMap f = new HashMap();
    public final ArrayList j = new ArrayList();
    public jj k = null;

    public y21(e00 e00Var, u31 u31Var) {
        this.l = e00Var;
        Looper looper = e00Var.m.getLooper();
        b8 a = u31Var.a();
        i6 i6Var = new i6((p8) a.d, (String) a.e, (String) a.f);
        s21 s21Var = (s21) u31Var.c.d;
        wv0.p(s21Var);
        z4 g = s21Var.g(u31Var.a, looper, i6Var, u31Var.d, this, this);
        String str = u31Var.b;
        if (str != null && (g instanceof a)) {
            ((a) g).r = str;
        }
        if (str != null && (g instanceof ec0)) {
            if (g != null) {
                c.a();
                throw null;
            }
            throw null;
        }
        this.b = g;
        this.c = u31Var.e;
        this.d = new jp0(8);
        this.g = u31Var.f;
        if (g.k()) {
            Context context = e00Var.e;
            y31 y31Var = e00Var.m;
            b8 a2 = u31Var.a();
            this.h = new i31(context, y31Var, new i6((p8) a2.d, (String) a2.e, (String) a2.f));
            return;
        }
        this.h = null;
    }

    @Override // defpackage.c00
    public final void a(int i) {
        Looper myLooper = Looper.myLooper();
        y31 y31Var = this.l.m;
        if (myLooper == y31Var.getLooper()) {
            i(i);
        } else {
            y31Var.post(new af(i, 3, this));
        }
    }

    @Override // defpackage.d00
    public final void b(jj jjVar) {
        o(jjVar, null);
    }

    @Override // defpackage.c00
    public final void c() {
        Looper myLooper = Looper.myLooper();
        y31 y31Var = this.l.m;
        if (myLooper == y31Var.getLooper()) {
            h();
        } else {
            y31Var.post(new l9(17, this));
        }
    }

    public final void d(jj jjVar) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (f20.t(jjVar, jj.h)) {
                    this.b.h();
                }
                throw null;
            }
            c.a();
            return;
        }
        hashSet.clear();
    }

    public final void e(Status status) {
        wv0.o(this.l.m);
        f(status, null, false);
    }

    public final void f(Status status, Exception exc, boolean z) {
        boolean z2;
        wv0.o(this.l.m);
        boolean z3 = true;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc != null) {
            z3 = false;
        }
        if (z2 != z3) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                f31 f31Var = (f31) it.next();
                if (!z || f31Var.a == 2) {
                    if (status != null) {
                        f31Var.c(status);
                    } else {
                        f31Var.d(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        c.k("Status XOR exception should be null");
    }

    public final void g() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            f31 f31Var = (f31) arrayList.get(i);
            if (this.b.a()) {
                if (k(f31Var)) {
                    linkedList.remove(f31Var);
                }
            } else {
                return;
            }
        }
    }

    public final void h() {
        e00 e00Var = this.l;
        wv0.o(e00Var.m);
        this.k = null;
        d(jj.h);
        y31 y31Var = e00Var.m;
        if (this.i) {
            c5 c5Var = this.c;
            y31Var.removeMessages(11, c5Var);
            y31Var.removeMessages(9, c5Var);
            this.i = false;
        }
        Iterator it = this.f.values().iterator();
        if (!it.hasNext()) {
            g();
            j();
            return;
        }
        throw qo0.l(it);
    }

    public final void i(int i) {
        e00 e00Var = this.l;
        y31 y31Var = e00Var.m;
        wv0.o(e00Var.m);
        this.k = null;
        this.i = true;
        String j = this.b.j();
        jp0 jp0Var = this.d;
        jp0Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (j != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(j);
        }
        jp0Var.l(true, new Status(20, sb.toString(), null, null));
        c5 c5Var = this.c;
        y31Var.sendMessageDelayed(Message.obtain(y31Var, 9, c5Var), 5000L);
        y31Var.sendMessageDelayed(Message.obtain(y31Var, 11, c5Var), 120000L);
        ((SparseIntArray) e00Var.g.d).clear();
        Iterator it = this.f.values().iterator();
        if (!it.hasNext()) {
        } else {
            throw qo0.l(it);
        }
    }

    public final void j() {
        e00 e00Var = this.l;
        y31 y31Var = e00Var.m;
        c5 c5Var = this.c;
        y31Var.removeMessages(12, c5Var);
        y31Var.sendMessageDelayed(y31Var.obtainMessage(12, c5Var), e00Var.a);
    }

    public final boolean k(f31 f31Var) {
        pv pvVar;
        if (f31Var == null) {
            jp0 jp0Var = this.d;
            z4 z4Var = this.b;
            f31Var.f(jp0Var, z4Var.k());
            try {
                f31Var.e(this);
                return true;
            } catch (DeadObjectException unused) {
                a(1);
                z4Var.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        pv[] b = f31Var.b(this);
        if (b != null && b.length != 0) {
            pv[] g = this.b.g();
            if (g == null) {
                g = new pv[0];
            }
            io0 io0Var = new io0(g.length);
            for (pv pvVar2 : g) {
                io0Var.put(pvVar2.c, Long.valueOf(pvVar2.a()));
            }
            int length = b.length;
            for (int i = 0; i < length; i++) {
                pvVar = b[i];
                Long l = (Long) io0Var.get(pvVar.c);
                if (l == null || l.longValue() < pvVar.a()) {
                    break;
                }
            }
        }
        pvVar = null;
        if (pvVar == null) {
            jp0 jp0Var2 = this.d;
            z4 z4Var2 = this.b;
            f31Var.f(jp0Var2, z4Var2.k());
            try {
                f31Var.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                a(1);
                z4Var2.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + pvVar.c + ", " + pvVar.a() + ").");
        if (this.l.n && f31Var.a(this)) {
            z21 z21Var = new z21(this.c, pvVar);
            int indexOf = this.j.indexOf(z21Var);
            ArrayList arrayList = this.j;
            if (indexOf >= 0) {
                z21 z21Var2 = (z21) arrayList.get(indexOf);
                this.l.m.removeMessages(15, z21Var2);
                y31 y31Var = this.l.m;
                y31Var.sendMessageDelayed(Message.obtain(y31Var, 15, z21Var2), 5000L);
            } else {
                arrayList.add(z21Var);
                y31 y31Var2 = this.l.m;
                y31Var2.sendMessageDelayed(Message.obtain(y31Var2, 15, z21Var), 5000L);
                y31 y31Var3 = this.l.m;
                y31Var3.sendMessageDelayed(Message.obtain(y31Var3, 16, z21Var), 120000L);
                jj jjVar = new jj(2, null, null);
                if (!l(jjVar)) {
                    this.l.a(jjVar, this.g);
                }
            }
            return false;
        }
        f31Var.d(new ww0(pvVar));
        return true;
    }

    public final boolean l(jj jjVar) {
        synchronized (e00.q) {
        }
        return false;
    }

    public final void m() {
        e00 e00Var = this.l;
        wv0.o(e00Var.m);
        z4 z4Var = this.b;
        if (!z4Var.a() && !z4Var.f()) {
            try {
                jp0 jp0Var = e00Var.g;
                Context context = e00Var.e;
                SparseIntArray sparseIntArray = (SparseIntArray) jp0Var.d;
                wv0.p(context);
                int e = z4Var.e();
                int i = ((SparseIntArray) jp0Var.d).get(e, -1);
                if (i == -1) {
                    i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 < sparseIntArray.size()) {
                            int keyAt = sparseIntArray.keyAt(i2);
                            if (keyAt > e && sparseIntArray.get(keyAt) == 0) {
                                break;
                            } else {
                                i2++;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    if (i == -1) {
                        i = ((a00) jp0Var.e).b(context, e);
                    }
                    sparseIntArray.put(e, i);
                }
                if (i != 0) {
                    jj jjVar = new jj(i, null, null);
                    Log.w("GoogleApiManager", "The service for " + z4Var.getClass().getName() + " is not available: " + jjVar.toString());
                    o(jjVar, null);
                    return;
                }
                a31 a31Var = new a31(e00Var, z4Var, this.c);
                if (z4Var.k()) {
                    i31 i31Var = this.h;
                    wv0.p(i31Var);
                    Handler handler = i31Var.c;
                    i6 i6Var = i31Var.f;
                    eo0 eo0Var = i31Var.g;
                    if (eo0Var != null) {
                        eo0Var.n();
                    }
                    i6Var.f = Integer.valueOf(System.identityHashCode(i31Var));
                    i31Var.g = (eo0) i31Var.d.g(i31Var.b, handler.getLooper(), i6Var, (fo0) i6Var.e, i31Var, i31Var);
                    i31Var.h = a31Var;
                    Set set = i31Var.e;
                    if (set != null && !set.isEmpty()) {
                        eo0 eo0Var2 = i31Var.g;
                        eo0Var2.getClass();
                        eo0Var2.i(new i81(eo0Var2));
                    } else {
                        handler.post(new l9(19, i31Var));
                    }
                }
                try {
                    z4Var.i(a31Var);
                } catch (SecurityException e2) {
                    o(new jj(10, null, null), e2);
                }
            } catch (IllegalStateException e3) {
                o(new jj(10, null, null), e3);
            }
        }
    }

    public final void n(f31 f31Var) {
        wv0.o(this.l.m);
        boolean a = this.b.a();
        LinkedList linkedList = this.a;
        if (a) {
            if (k(f31Var)) {
                j();
                return;
            } else {
                linkedList.add(f31Var);
                return;
            }
        }
        linkedList.add(f31Var);
        jj jjVar = this.k;
        if (jjVar != null && jjVar.d != 0 && jjVar.e != null) {
            o(jjVar, null);
        } else {
            m();
        }
    }

    public final void o(jj jjVar, RuntimeException runtimeException) {
        eo0 eo0Var;
        wv0.o(this.l.m);
        i31 i31Var = this.h;
        if (i31Var != null && (eo0Var = i31Var.g) != null) {
            eo0Var.n();
        }
        wv0.o(this.l.m);
        this.k = null;
        ((SparseIntArray) this.l.g.d).clear();
        d(jjVar);
        if ((this.b instanceof w31) && jjVar.d != 24) {
            e00 e00Var = this.l;
            e00Var.b = true;
            y31 y31Var = e00Var.m;
            y31Var.sendMessageDelayed(y31Var.obtainMessage(19), 300000L);
        }
        if (jjVar.d == 4) {
            e(e00.p);
            return;
        }
        if (this.a.isEmpty()) {
            this.k = jjVar;
            return;
        }
        e00 e00Var2 = this.l;
        if (runtimeException != null) {
            wv0.o(e00Var2.m);
            f(null, runtimeException, false);
            return;
        }
        boolean z = e00Var2.n;
        c5 c5Var = this.c;
        if (z) {
            f(e00.b(c5Var, jjVar), null, true);
            if (!this.a.isEmpty() && !l(jjVar) && !this.l.a(jjVar, this.g)) {
                if (jjVar.d == 18) {
                    this.i = true;
                }
                if (this.i) {
                    e00 e00Var3 = this.l;
                    c5 c5Var2 = this.c;
                    y31 y31Var2 = e00Var3.m;
                    y31Var2.sendMessageDelayed(Message.obtain(y31Var2, 9, c5Var2), 5000L);
                    return;
                }
                e(e00.b(this.c, jjVar));
                return;
            }
            return;
        }
        e(e00.b(c5Var, jjVar));
    }

    public final void p(jj jjVar) {
        wv0.o(this.l.m);
        z4 z4Var = this.b;
        z4Var.c("onSignInFailed for " + z4Var.getClass().getName() + " with " + String.valueOf(jjVar));
        o(jjVar, null);
    }

    public final void q() {
        wv0.o(this.l.m);
        Status status = e00.o;
        e(status);
        this.d.l(false, status);
        for (y60 y60Var : (y60[]) this.f.keySet().toArray(new y60[0])) {
            n(new r31(new zq0()));
        }
        d(new jj(4, null, null));
        z4 z4Var = this.b;
        if (z4Var.a()) {
            z4Var.d(new sb0(this));
        }
    }
}
