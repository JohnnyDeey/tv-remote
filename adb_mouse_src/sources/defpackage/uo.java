package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;

/* loaded from: classes.dex */
public final class uo implements xs0 {
    public final js0 a;
    public nq b = new ByteArrayOutputStream();
    public Hashtable c = new Hashtable();
    public boolean d = false;
    public boolean e = false;

    /* JADX WARN: Type inference failed for: r1v1, types: [nq, java.io.ByteArrayOutputStream] */
    public uo(js0 js0Var) {
        this.a = js0Var;
    }

    @Override // defpackage.xs0
    public final byte[] a() {
        throw new IllegalStateException("Use 'forkPRFHash' to get a definite hash");
    }

    @Override // defpackage.xs0
    public final xs0 b() {
        throw new IllegalStateException("attempt to clone a DeferredHash");
    }

    public final void c() {
        if (!this.d && this.e && this.b != null && this.c.size() <= 4) {
            Enumeration elements = this.c.elements();
            while (elements.hasMoreElements()) {
                this.b.e((xs0) elements.nextElement());
            }
            this.b = null;
        }
    }

    public final void d(int i) {
        Integer valueOf = Integer.valueOf(i);
        if (!this.c.containsKey(valueOf)) {
            this.c.put(valueOf, this.a.a.q(i));
        }
    }

    public final void e(Hashtable hashtable, int i) {
        Integer valueOf = Integer.valueOf(i);
        xs0 b = ((xs0) this.c.get(valueOf)).b();
        nq nqVar = this.b;
        if (nqVar != null) {
            nqVar.e(b);
        }
        hashtable.put(valueOf, b);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [ri, java.lang.Object] */
    public final xs0 f() {
        xs0 xs0Var;
        c();
        js0 js0Var = this.a;
        im0 c = js0Var.c();
        int i = c.f;
        if (i != 0 && i != 1) {
            xs0Var = ((xs0) this.c.get(Integer.valueOf(c.g))).b();
        } else {
            xs0 b = ((xs0) this.c.get(1)).b();
            xs0 b2 = ((xs0) this.c.get(2)).b();
            ?? obj = new Object();
            obj.a = js0Var;
            obj.b = js0Var.a;
            obj.c = b;
            obj.d = b2;
            xs0Var = obj;
        }
        nq nqVar = this.b;
        if (nqVar != null) {
            nqVar.e(xs0Var);
        }
        return xs0Var;
    }

    public final void g() {
        int i;
        im0 c = this.a.c();
        int i2 = c.f;
        if (i2 != 0 && i2 != 1) {
            i = c.g;
        } else {
            d(1);
            i = 2;
        }
        d(i);
    }

    public final void h() {
        if (!this.e) {
            this.e = true;
            c();
        } else {
            c.o("Already sealed");
        }
    }

    @Override // defpackage.xs0
    public final void reset() {
        nq nqVar = this.b;
        if (nqVar != null) {
            nqVar.reset();
            return;
        }
        Enumeration elements = this.c.elements();
        while (elements.hasMoreElements()) {
            ((xs0) elements.nextElement()).reset();
        }
    }

    @Override // defpackage.xs0
    public final void update(byte[] bArr, int i, int i2) {
        nq nqVar = this.b;
        if (nqVar != null) {
            nqVar.write(bArr, i, i2);
            return;
        }
        Enumeration elements = this.c.elements();
        while (elements.hasMoreElements()) {
            ((xs0) elements.nextElement()).update(bArr, i, i2);
        }
    }
}
