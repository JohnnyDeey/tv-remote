package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class l3 implements gf, zu {
    public final /* synthetic */ int c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public l3(Typeface typeface, sa0 sa0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        this.c = 7;
        this.f = typeface;
        this.g = sa0Var;
        this.e = new ta0(1024);
        int a = sa0Var.a(6);
        if (a != 0) {
            int i6 = a + sa0Var.a;
            i = ((ByteBuffer) sa0Var.d).getInt(((ByteBuffer) sa0Var.d).getInt(i6) + i6);
        } else {
            i = 0;
        }
        this.d = new char[i * 2];
        int a2 = sa0Var.a(6);
        if (a2 != 0) {
            int i7 = a2 + sa0Var.a;
            i2 = ((ByteBuffer) sa0Var.d).getInt(((ByteBuffer) sa0Var.d).getInt(i7) + i7);
        } else {
            i2 = 0;
        }
        for (int i8 = 0; i8 < i2; i8++) {
            gw0 gw0Var = new gw0(this, i8);
            ra0 b = gw0Var.b();
            int a3 = b.a(4);
            if (a3 != 0) {
                i3 = ((ByteBuffer) b.d).getInt(a3 + b.a);
            } else {
                i3 = 0;
            }
            Character.toChars(i3, (char[]) this.d, i8 * 2);
            ra0 b2 = gw0Var.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i9 = a4 + b2.a;
                i4 = ((ByteBuffer) b2.d).getInt(((ByteBuffer) b2.d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            if (i4 > 0) {
                z = true;
            } else {
                z = false;
            }
            mn.i("invalid metadata codepoint length", z);
            ta0 ta0Var = (ta0) this.e;
            ra0 b3 = gw0Var.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i10 = a5 + b3.a;
                i5 = ((ByteBuffer) b3.d).getInt(((ByteBuffer) b3.d).getInt(i10) + i10);
            } else {
                i5 = 0;
            }
            ta0Var.a(gw0Var, 0, i5 - 1);
        }
    }

    public static l3 t(js0 js0Var, a10 a10Var) {
        Vector vector;
        Vector vector2;
        Vector vector3;
        xf0 xf0Var = js0Var.a().H;
        Vector vector4 = null;
        if (ht0.A(xf0Var)) {
            byte[] K = ht0.K(ht0.S(a10Var), a10Var);
            Hashtable w = ks0.w(13, ht0.K(ht0.P(a10Var), a10Var));
            byte[] r = ht0.r(w, 13);
            if (r == null) {
                vector2 = null;
            } else {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(r);
                Vector G = ht0.G(byteArrayInputStream);
                ks0.b(byteArrayInputStream);
                vector2 = G;
            }
            if (vector2 != null) {
                byte[] r2 = ht0.r(w, 50);
                if (r2 == null) {
                    vector3 = null;
                } else {
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(r2);
                    Vector G2 = ht0.G(byteArrayInputStream2);
                    ks0.b(byteArrayInputStream2);
                    vector3 = G2;
                }
                byte[] r3 = ht0.r(w, 47);
                if (r3 != null) {
                    if (r3.length >= 5) {
                        ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(r3);
                        if (ht0.P(byteArrayInputStream3) == r3.length - 2) {
                            vector4 = new Vector();
                            while (byteArrayInputStream3.available() > 0) {
                                byte[] L = ht0.L(byteArrayInputStream3);
                                v11 i = v11.i(ht0.J(L));
                                ht0.T(i, L);
                                vector4.addElement(i);
                            }
                        } else {
                            throw new us0((short) 50, null, null);
                        }
                    } else {
                        throw new us0((short) 50, null, null);
                    }
                }
                return new l3(K, (short[]) null, vector2, vector3, vector4);
            }
            f40.a(109, null, "'signature_algorithms' is required");
            return null;
        }
        boolean i2 = xf0.f.i(xf0Var.d());
        int S = ht0.S(a10Var);
        if (S >= 1) {
            short[] sArr = new short[S];
            for (int i3 = 0; i3 < S; i3++) {
                sArr[i3] = ht0.S(a10Var);
            }
            if (i2) {
                vector = ht0.G(a10Var);
            } else {
                vector = null;
            }
            byte[] K2 = ht0.K(ht0.P(a10Var), a10Var);
            if (K2.length > 0) {
                Vector vector5 = new Vector();
                ByteArrayInputStream byteArrayInputStream4 = new ByteArrayInputStream(K2);
                do {
                    byte[] L2 = ht0.L(byteArrayInputStream4);
                    v11 i4 = v11.i(ht0.J(L2));
                    ht0.T(i4, L2);
                    vector5.addElement(i4);
                } while (byteArrayInputStream4.available() > 0);
                vector4 = vector5;
            }
            return new l3(sArr, vector, vector4);
        }
        throw new us0((short) 50, null, null);
    }

    public void a(gx gxVar) {
        if (!((ArrayList) this.g).contains(gxVar)) {
            synchronized (((ArrayList) this.g)) {
                ((ArrayList) this.g).add(gxVar);
            }
            gxVar.m = true;
            return;
        }
        c.p(gxVar, "Fragment already added: ");
    }

    public byte[] b(byte[] bArr, int i, sc0 sc0Var) {
        oq oqVar = (oq) this.d;
        qz qzVar = (qz) this.g;
        int i2 = qzVar.a;
        if (bArr.length == i2) {
            sc0Var.a();
            if (i <= qzVar.b - 1) {
                if (i == 0) {
                    return bArr;
                }
                byte[] b = b(bArr, i - 1, sc0Var);
                z40 z40Var = new z40(1);
                z40Var.c = sc0Var.a;
                z40Var.b = sc0Var.b;
                z40Var.e = sc0Var.e;
                z40Var.f = sc0Var.f;
                z40Var.g = i - 1;
                z40Var.d = 0;
                sc0 sc0Var2 = new sc0(z40Var);
                byte[] e = oqVar.e((byte[]) this.e, sc0Var2.a());
                z40 z40Var2 = new z40(1);
                z40Var2.c = sc0Var2.a;
                z40Var2.b = sc0Var2.b;
                z40Var2.e = sc0Var2.e;
                z40Var2.f = sc0Var2.f;
                z40Var2.g = sc0Var2.g;
                z40Var2.d = 1;
                byte[] e2 = oqVar.e((byte[]) this.e, new sc0(z40Var2).a());
                byte[] bArr2 = new byte[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    bArr2[i3] = (byte) (b[i3] ^ e2[i3]);
                }
                int length = e.length;
                int i4 = oqVar.b;
                if (length == i4) {
                    if (i2 == i4) {
                        return oqVar.f(0, e, bArr2);
                    }
                    c.k("wrong in length");
                    return null;
                }
                c.k("wrong key length");
                return null;
            }
            c.k("max chain length must not be greater than w");
            return null;
        }
        c.k(qo0.n("startHash needs to be ", i2, "bytes"));
        return null;
    }

    public void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((io0) this.d).get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    c(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        f40.f("This graph contains cyclic dependencies");
    }

    public gx d(String str) {
        a aVar = (a) ((HashMap) this.d).get(str);
        if (aVar != null) {
            return aVar.c;
        }
        return null;
    }

    public gx e(String str) {
        for (a aVar : ((HashMap) this.d).values()) {
            if (aVar != null) {
                gx gxVar = aVar.c;
                if (!str.equals(gxVar.g)) {
                    gxVar = gxVar.v.c.e(str);
                }
                if (gxVar != null) {
                    return gxVar;
                }
            }
        }
        return null;
    }

    public kq0 f(v2 v2Var) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kq0 kq0Var = (kq0) arrayList.get(i);
            if (kq0Var != null && kq0Var.b == v2Var) {
                return kq0Var;
            }
        }
        kq0 kq0Var2 = new kq0((Context) this.d, v2Var);
        arrayList.add(kq0Var2);
        return kq0Var2;
    }

    public ArrayList g() {
        ArrayList arrayList = new ArrayList();
        for (a aVar : ((HashMap) this.d).values()) {
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    @Override // defpackage.yf0
    public Object get() {
        return new l3((Executor) ((yf0) this.g).get(), (fl0) ((yf0) this.d).get(), (b8) ((b8) this.e).get(), (fl0) ((yf0) this.f).get(), 12);
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (a aVar : ((HashMap) this.d).values()) {
            if (aVar != null) {
                arrayList.add(aVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public s20 i(l3 l3Var) {
        switch (this.c) {
            case 0:
                l3Var.getClass();
                sb0 sb0Var = new sb0(((m3) this.g).b);
                rd rdVar = (rd) this.d;
                return new s20(sb0Var, rdVar, ((KeyPair) this.e).getPrivate(), new wf((short) 0, new byte[0], new yf[]{new yf(rdVar.h((short) 0, (byte[]) this.f), null)}), go0.m);
            default:
                l3Var.getClass();
                sb0 sb0Var2 = new sb0(((t3) this.g).b);
                rd rdVar2 = (rd) this.d;
                return new s20(sb0Var2, rdVar2, ((KeyPair) this.e).getPrivate(), new wf((short) 0, new byte[0], new yf[]{new yf(rdVar2.h((short) 0, (byte[]) this.f), null)}), go0.m);
        }
    }

    public List j() {
        ArrayList arrayList;
        if (((ArrayList) this.g).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.g)) {
            arrayList = new ArrayList((ArrayList) this.g);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0058, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        defpackage.c.k("index out of bounds");
     */
    /* JADX WARN: Type inference failed for: r10v1, types: [sb0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.sb0 k(defpackage.sc0 r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.g
            qz r0 = (defpackage.qz) r0
            int r1 = r0.c
            byte[][] r1 = new byte[r1]
            r2 = 0
            r3 = r2
        La:
            int r4 = r0.c
            r5 = 0
            if (r3 >= r4) goto L59
            z40 r6 = new z40
            r7 = 1
            r6.<init>(r7)
            int r8 = r11.a
            r6.c = r8
            long r8 = r11.b
            r6.b = r8
            int r8 = r11.e
            r6.e = r8
            r6.f = r3
            int r8 = r11.g
            r6.g = r8
            int r11 = r11.d
            r6.d = r11
            sc0 r11 = new sc0
            r11.<init>(r6)
            if (r3 < 0) goto L53
            if (r3 >= r4) goto L53
            java.lang.Object r4 = r10.d
            oq r4 = (defpackage.oq) r4
            java.lang.Object r5 = r10.f
            byte[] r5 = (byte[]) r5
            long r8 = (long) r3
            r6 = 32
            byte[] r6 = defpackage.mi0.Q(r6, r8)
            byte[] r4 = r4.e(r5, r6)
            int r5 = r0.b
            int r5 = r5 - r7
            byte[] r4 = r10.b(r4, r5, r11)
            r1[r3] = r4
            int r3 = r3 + 1
            goto La
        L53:
            java.lang.String r10 = "index out of bounds"
            defpackage.c.k(r10)
            return r5
        L59:
            sb0 r10 = new sb0
            r10.<init>()
            if (r0 == 0) goto L96
            r11 = r2
        L61:
            int r3 = r1.length
            if (r11 >= r3) goto L71
            r3 = r1[r11]
            if (r3 == 0) goto L6b
            int r11 = r11 + 1
            goto L61
        L6b:
            java.lang.String r10 = "publicKey byte array == null"
            defpackage.c.g(r10)
            throw r5
        L71:
            int r11 = r1.length
            int r3 = r0.c
            if (r11 != r3) goto L90
        L76:
            int r11 = r1.length
            if (r2 >= r11) goto L89
            r11 = r1[r2]
            int r11 = r11.length
            int r3 = r0.a
            if (r11 != r3) goto L83
            int r2 = r2 + 1
            goto L76
        L83:
            java.lang.String r10 = "wrong publicKey format"
            defpackage.c.k(r10)
            throw r5
        L89:
            byte[][] r11 = defpackage.mi0.f(r1)
            r10.c = r11
            return r10
        L90:
            java.lang.String r10 = "wrong publicKey size"
            defpackage.c.k(r10)
            throw r5
        L96:
            java.lang.String r10 = "params == null"
            defpackage.c.g(r10)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l3.k(sc0):sb0");
    }

    public byte[] l(byte[] bArr, sc0 sc0Var) {
        z40 z40Var = new z40(1);
        z40Var.c = sc0Var.a;
        z40Var.b = sc0Var.b;
        z40Var.e = sc0Var.e;
        return ((oq) this.d).e(bArr, new sc0(z40Var).a());
    }

    public void m(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = ((qz) this.g).a;
        if (length == i) {
            if (bArr2 != null) {
                if (bArr2.length == i) {
                    this.f = bArr;
                    this.e = bArr2;
                    return;
                } else {
                    c.k("size of publicSeed needs to be equal to size of digest");
                    return;
                }
            }
            c.g("publicSeed == null");
            return;
        }
        c.k("size of secretKeySeed needs to be equal to size of digest");
    }

    public void n(a aVar) {
        gx gxVar = aVar.c;
        String str = gxVar.g;
        HashMap hashMap = (HashMap) this.d;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(gxVar.g, aVar);
        if (vx.F(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + gxVar);
        }
    }

    public void o(a aVar) {
        gx gxVar = aVar.c;
        if (gxVar.C) {
            ((xx) this.f).d(gxVar);
        }
        if (((a) ((HashMap) this.d).put(gxVar.g, null)) != null && vx.F(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + gxVar);
        }
    }

    @Override // defpackage.gf
    public void onCancel() {
        View view = (View) this.g;
        view.clearAnimation();
        ((ViewGroup) this.d).endViewTransition(view);
        ((lo) this.e).e();
        if (vx.F(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((xo0) this.f) + " has been cancelled.");
        }
    }

    public boolean r(v2 v2Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.g).onActionItemClicked(f(v2Var), new da0((Context) this.d, (pq0) menuItem));
    }

    public boolean s(v2 v2Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.g;
        kq0 f = f(v2Var);
        io0 io0Var = (io0) this.f;
        Menu menu2 = (Menu) io0Var.get(menu);
        if (menu2 == null) {
            menu2 = new pa0((Context) this.d, (w90) menu);
            io0Var.put(menu, menu2);
        }
        return callback.onCreateActionMode(f, menu2);
    }

    private final void p(g00 g00Var) {
    }

    private final void q(g00 g00Var) {
    }

    public l3(qz qzVar) {
        this.c = 11;
        if (qzVar == null) {
            c.g("params == null");
            throw null;
        }
        this.g = qzVar;
        int i = qzVar.a;
        this.d = new oq(i, (s) qzVar.d);
        this.f = new byte[i];
        this.e = new byte[i];
    }

    public /* synthetic */ l3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.c = i;
        this.g = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if ((r0 & 255) == r0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l3(byte[] r3, short[] r4, java.util.Vector r5, java.util.Vector r6, java.util.Vector r7) {
        /*
            r2 = this;
            r6 = 2
            r2.c = r6
            r2.<init>()
            r6 = 0
            if (r3 == 0) goto L17
            int r0 = r3.length
            byte[] r1 = defpackage.ht0.a
            r1 = r0 & 255(0xff, float:3.57E-43)
            if (r1 != r0) goto L11
            goto L17
        L11:
            java.lang.String r2 = "'certificateRequestContext' cannot be longer than 255"
            defpackage.c.k(r2)
            throw r6
        L17:
            if (r4 == 0) goto L2b
            int r0 = r4.length
            r1 = 1
            if (r0 < r1) goto L25
            int r0 = r4.length
            byte[] r1 = defpackage.ht0.a
            r1 = r0 & 255(0xff, float:3.57E-43)
            if (r1 != r0) goto L25
            goto L2b
        L25:
            java.lang.String r2 = "'certificateTypes' should have length from 1 to 255"
            defpackage.c.k(r2)
            throw r6
        L2b:
            byte[] r0 = defpackage.ht0.a
            if (r3 != 0) goto L30
            goto L3d
        L30:
            int r6 = r3.length
            if (r6 != 0) goto L36
            byte[] r6 = defpackage.ht0.e
            goto L3d
        L36:
            java.lang.Object r3 = r3.clone()
            r6 = r3
            byte[] r6 = (byte[]) r6
        L3d:
            r2.f = r6
            r2.g = r4
            r2.d = r5
            r2.e = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l3.<init>(byte[], short[], java.util.Vector, java.util.Vector, java.util.Vector):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l3(short[] sArr, Vector vector, Vector vector2) {
        this((byte[]) null, sArr, vector, (Vector) null, vector2);
        this.c = 2;
    }

    public l3(int i) {
        this.c = i;
        switch (i) {
            case 5:
                this.g = new ee0(10);
                this.d = new io0(0);
                this.e = new ArrayList();
                this.f = new HashSet();
                return;
            case 6:
                this.g = new ArrayList();
                this.d = new HashMap();
                this.e = new HashMap();
                return;
            case 7:
            case 8:
            default:
                return;
            case 9:
                this.g = new j40(128);
                this.f = new ik0(256);
                this.e = new hk0(256);
                this.d = new hk0(512);
                return;
            case 10:
                this.g = new io0(0);
                this.d = new SparseArray();
                this.e = new r70();
                this.f = new io0(0);
                return;
        }
    }

    public /* synthetic */ l3(int i, Object obj) {
        this.c = i;
        this.f = null;
        this.d = null;
        this.e = null;
        this.g = obj;
    }

    public l3(Context context, ActionMode.Callback callback) {
        this.c = 8;
        this.d = context;
        this.g = callback;
        this.e = new ArrayList();
        this.f = new io0(0);
    }
}
