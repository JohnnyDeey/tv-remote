package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class v00 extends t40 {
    public final int d;
    public final boolean e;
    public final List f;
    public final List g;
    public final long h;
    public final long i;

    /* JADX WARN: Removed duplicated region for block: B:46:0x0192 A[LOOP:2: B:45:0x0190->B:46:0x0192, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0224 A[LOOP:3: B:49:0x021a->B:51:0x0224, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0243 A[EDGE_INSN: B:52:0x0243->B:53:0x0243 BREAK  A[LOOP:3: B:49:0x021a->B:51:0x0224], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0279 A[LOOP:4: B:57:0x0273->B:59:0x0279, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v00(defpackage.v40 r27, long r28, long r30) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v00.<init>(v40, long, long):void");
    }

    public static v00 a(Object obj) {
        Throwable th;
        if (obj instanceof v00) {
            return (v00) obj;
        }
        DataInputStream dataInputStream = null;
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() == 0) {
                int readInt = dataInputStream2.readInt();
                long readLong = dataInputStream2.readLong();
                long readLong2 = dataInputStream2.readLong();
                boolean readBoolean = dataInputStream2.readBoolean();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < readInt; i++) {
                    arrayList.add(v40.e(obj));
                }
                for (int i2 = 0; i2 < readInt - 1; i2++) {
                    arrayList2.add(x40.a(obj));
                }
                return new v00(readInt, arrayList, arrayList2, readLong, readLong2, readBoolean);
            }
            c.o("unknown version for hss private key");
            return null;
        }
        if (obj instanceof byte[]) {
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    try {
                        v00 a = a(dataInputStream3);
                        dataInputStream3.close();
                        return a;
                    } catch (Throwable th2) {
                        th = th2;
                        dataInputStream = dataInputStream3;
                        if (dataInputStream != null) {
                            dataInputStream.close();
                            throw th;
                        }
                        throw th;
                    }
                } catch (Exception unused) {
                    v00 v00Var = new v00(v40.e(obj), r4.d(), r4.g);
                    dataInputStream3.close();
                    return v00Var;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            if (obj instanceof InputStream) {
                return a(gi0.j((InputStream) obj));
            }
            c.r(obj, "cannot parse ");
            return null;
        }
    }

    public final Object clone() {
        try {
            return a(getEncoded());
        } catch (Exception e) {
            f40.k(e.getMessage(), e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v00.class != obj.getClass()) {
            return false;
        }
        v00 v00Var = (v00) obj;
        if (this.d != v00Var.d || this.e != v00Var.e || this.h != v00Var.h || this.i != v00Var.i || !this.f.equals(v00Var.f)) {
            return false;
        }
        return this.g.equals(v00Var.g);
    }

    @Override // defpackage.xt
    public final synchronized byte[] getEncoded() {
        v vVar;
        try {
            vVar = new v();
            vVar.h(0);
            vVar.h(this.d);
            long j = this.i;
            vVar.h((int) (j >>> 32));
            vVar.h((int) j);
            long j2 = this.h;
            vVar.h((int) (j2 >>> 32));
            vVar.h((int) j2);
            vVar.a.write(this.e ? 1 : 0);
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                vVar.a((v40) it.next());
            }
            Iterator it2 = this.g.iterator();
            while (it2.hasNext()) {
                vVar.a((x40) it2.next());
            }
        } catch (Throwable th) {
            throw th;
        }
        return vVar.a.toByteArray();
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + ((this.f.hashCode() + (((this.d * 31) + (this.e ? 1 : 0)) * 31)) * 31)) * 31;
        long j = this.h;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.i;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public v00(int i, ArrayList arrayList, ArrayList arrayList2, long j, long j2, boolean z) {
        super(true);
        this.i = 0L;
        this.d = i;
        this.f = Collections.unmodifiableList(arrayList);
        this.g = Collections.unmodifiableList(arrayList2);
        this.i = j;
        this.h = j2;
        this.e = z;
    }
}
