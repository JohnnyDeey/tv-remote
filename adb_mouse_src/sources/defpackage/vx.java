package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.b;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class vx {
    public g3 A;
    public g3 B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public xx L;
    public final l9 M;
    public boolean b;
    public ArrayList d;
    public ArrayList e;
    public b g;
    public final r6 l;
    public final CopyOnWriteArrayList m;
    public final mx n;
    public final mx o;
    public final mx p;
    public final mx q;
    public final px r;
    public int s;
    public ix t;
    public wv0 u;
    public gx v;
    public gx w;
    public final qx x;
    public final vj0 y;
    public g3 z;
    public final ArrayList a = new ArrayList();
    public final l3 c = new l3(6);
    public final lx f = new lx(this);
    public final ox h = new ox(this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [mx] */
    /* JADX WARN: Type inference failed for: r0v13, types: [mx] */
    /* JADX WARN: Type inference failed for: r0v14, types: [mx] */
    /* JADX WARN: Type inference failed for: r0v15, types: [mx] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, vj0] */
    public vx() {
        Collections.synchronizedMap(new HashMap());
        this.l = new r6(this);
        this.m = new CopyOnWriteArrayList();
        final int i = 0;
        this.n = new hk(this) { // from class: mx
            public final /* synthetic */ vx b;

            {
                this.b = this;
            }

            @Override // defpackage.hk
            public final void accept(Object obj) {
                int i2 = i;
                vx vxVar = this.b;
                switch (i2) {
                    case 0:
                        if (vxVar.H()) {
                            vxVar.h(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (vxVar.H() && num.intValue() == 80) {
                            vxVar.l(false);
                            return;
                        }
                        return;
                    case 2:
                        gb0 gb0Var = (gb0) obj;
                        if (vxVar.H()) {
                            boolean z = gb0Var.a;
                            vxVar.m(false);
                            return;
                        }
                        return;
                    default:
                        ae0 ae0Var = (ae0) obj;
                        if (vxVar.H()) {
                            boolean z2 = ae0Var.a;
                            vxVar.r(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i2 = 1;
        this.o = new hk(this) { // from class: mx
            public final /* synthetic */ vx b;

            {
                this.b = this;
            }

            @Override // defpackage.hk
            public final void accept(Object obj) {
                int i22 = i2;
                vx vxVar = this.b;
                switch (i22) {
                    case 0:
                        if (vxVar.H()) {
                            vxVar.h(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (vxVar.H() && num.intValue() == 80) {
                            vxVar.l(false);
                            return;
                        }
                        return;
                    case 2:
                        gb0 gb0Var = (gb0) obj;
                        if (vxVar.H()) {
                            boolean z = gb0Var.a;
                            vxVar.m(false);
                            return;
                        }
                        return;
                    default:
                        ae0 ae0Var = (ae0) obj;
                        if (vxVar.H()) {
                            boolean z2 = ae0Var.a;
                            vxVar.r(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i3 = 2;
        this.p = new hk(this) { // from class: mx
            public final /* synthetic */ vx b;

            {
                this.b = this;
            }

            @Override // defpackage.hk
            public final void accept(Object obj) {
                int i22 = i3;
                vx vxVar = this.b;
                switch (i22) {
                    case 0:
                        if (vxVar.H()) {
                            vxVar.h(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (vxVar.H() && num.intValue() == 80) {
                            vxVar.l(false);
                            return;
                        }
                        return;
                    case 2:
                        gb0 gb0Var = (gb0) obj;
                        if (vxVar.H()) {
                            boolean z = gb0Var.a;
                            vxVar.m(false);
                            return;
                        }
                        return;
                    default:
                        ae0 ae0Var = (ae0) obj;
                        if (vxVar.H()) {
                            boolean z2 = ae0Var.a;
                            vxVar.r(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i4 = 3;
        this.q = new hk(this) { // from class: mx
            public final /* synthetic */ vx b;

            {
                this.b = this;
            }

            @Override // defpackage.hk
            public final void accept(Object obj) {
                int i22 = i4;
                vx vxVar = this.b;
                switch (i22) {
                    case 0:
                        if (vxVar.H()) {
                            vxVar.h(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (vxVar.H() && num.intValue() == 80) {
                            vxVar.l(false);
                            return;
                        }
                        return;
                    case 2:
                        gb0 gb0Var = (gb0) obj;
                        if (vxVar.H()) {
                            boolean z = gb0Var.a;
                            vxVar.m(false);
                            return;
                        }
                        return;
                    default:
                        ae0 ae0Var = (ae0) obj;
                        if (vxVar.H()) {
                            boolean z2 = ae0Var.a;
                            vxVar.r(false);
                            return;
                        }
                        return;
                }
            }
        };
        this.r = new px(this);
        this.s = -1;
        this.x = new qx(this);
        this.y = new Object();
        this.C = new ArrayDeque();
        this.M = new l9(8, this);
    }

    public static boolean F(int i) {
        if (Log.isLoggable("FragmentManager", i)) {
            return true;
        }
        return false;
    }

    public static boolean G(gx gxVar) {
        gxVar.getClass();
        ArrayList h = gxVar.v.c.h();
        int size = h.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = h.get(i);
            i++;
            gx gxVar2 = (gx) obj;
            if (gxVar2 != null) {
                z = G(gxVar2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean I(gx gxVar) {
        if (gxVar != null) {
            if (gxVar.D) {
                if (gxVar.t == null || I(gxVar.w)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean J(gx gxVar) {
        if (gxVar != null) {
            vx vxVar = gxVar.t;
            if (gxVar == vxVar.w && J(vxVar.v)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void Y(gx gxVar) {
        if (F(2)) {
            Log.v("FragmentManager", "show: " + gxVar);
        }
        if (gxVar.A) {
            gxVar.A = false;
            gxVar.K = !gxVar.K;
        }
    }

    public final gx A(String str) {
        l3 l3Var = this.c;
        ArrayList arrayList = (ArrayList) l3Var.g;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            gx gxVar = (gx) arrayList.get(size);
            if (gxVar != null && str.equals(gxVar.z)) {
                return gxVar;
            }
        }
        for (a aVar : ((HashMap) l3Var.d).values()) {
            if (aVar != null) {
                gx gxVar2 = aVar.c;
                if (str.equals(gxVar2.z)) {
                    return gxVar2;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(gx gxVar) {
        ViewGroup viewGroup = gxVar.F;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (gxVar.y > 0 && this.u.O()) {
            View N = this.u.N(gxVar.y);
            if (N instanceof ViewGroup) {
                return (ViewGroup) N;
            }
            return null;
        }
        return null;
    }

    public final qx C() {
        gx gxVar = this.v;
        if (gxVar != null) {
            return gxVar.t.C();
        }
        return this.x;
    }

    public final vj0 D() {
        gx gxVar = this.v;
        if (gxVar != null) {
            return gxVar.t.D();
        }
        return this.y;
    }

    public final void E(gx gxVar) {
        if (F(2)) {
            Log.v("FragmentManager", "hide: " + gxVar);
        }
        if (!gxVar.A) {
            gxVar.A = true;
            gxVar.K = true ^ gxVar.K;
            X(gxVar);
        }
    }

    public final boolean H() {
        gx gxVar = this.v;
        if (gxVar != null) {
            if (gxVar.u != null && gxVar.m && gxVar.j().H()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void K(int i, boolean z) {
        ix ixVar;
        if (this.t == null && i != -1) {
            c.o("No activity");
            return;
        }
        if (z || i != this.s) {
            this.s = i;
            l3 l3Var = this.c;
            HashMap hashMap = (HashMap) l3Var.d;
            ArrayList arrayList = (ArrayList) l3Var.g;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                a aVar = (a) hashMap.get(((gx) obj).g);
                if (aVar != null) {
                    aVar.k();
                }
            }
            for (a aVar2 : hashMap.values()) {
                if (aVar2 != null) {
                    aVar2.k();
                    gx gxVar = aVar2.c;
                    if (gxVar.n && !gxVar.q()) {
                        l3Var.o(aVar2);
                    }
                }
            }
            Z();
            if (this.D && (ixVar = this.t) != null && this.s == 7) {
                ixVar.w.invalidateOptionsMenu();
                this.D = false;
            }
        }
    }

    public final void L() {
        if (this.t != null) {
            this.E = false;
            this.F = false;
            this.L.h = false;
            for (gx gxVar : this.c.j()) {
                if (gxVar != null) {
                    gxVar.v.L();
                }
            }
        }
    }

    public final boolean M() {
        return N(-1, 0);
    }

    public final boolean N(int i, int i2) {
        x(false);
        w(true);
        gx gxVar = this.w;
        if (gxVar != null && i < 0 && gxVar.g().M()) {
            return true;
        }
        boolean O = O(this.I, this.J, i, i2);
        if (O) {
            this.b = true;
            try {
                Q(this.I, this.J);
            } finally {
                d();
            }
        }
        b0();
        if (this.H) {
            this.H = false;
            Z();
        }
        ((HashMap) this.c.d).values().removeAll(Collections.singleton(null));
        return O;
    }

    public final boolean O(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList3 = this.d;
        int i3 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i3 = z ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    hc hcVar = (hc) this.d.get(size);
                    if (i >= 0 && i == hcVar.s) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i3 = size;
                } else if (z) {
                    i3 = size;
                    while (i3 > 0) {
                        hc hcVar2 = (hc) this.d.get(i3 - 1);
                        if (i < 0 || i != hcVar2.s) {
                            break;
                        }
                        i3--;
                    }
                } else if (size != this.d.size() - 1) {
                    i3 = size + 1;
                }
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i3; size2--) {
            arrayList.add((hc) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void P(gx gxVar) {
        if (F(2)) {
            Log.v("FragmentManager", "remove: " + gxVar + " nesting=" + gxVar.s);
        }
        boolean q = gxVar.q();
        if (gxVar.B && q) {
            return;
        }
        l3 l3Var = this.c;
        synchronized (((ArrayList) l3Var.g)) {
            ((ArrayList) l3Var.g).remove(gxVar);
        }
        gxVar.m = false;
        if (G(gxVar)) {
            this.D = true;
        }
        gxVar.n = true;
        X(gxVar);
    }

    public final void Q(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((hc) arrayList.get(i)).p) {
                        if (i2 != i) {
                            y(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((hc) arrayList.get(i2)).p) {
                                i2++;
                            }
                        }
                        y(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    y(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            c.o("Internal error with the back stack records");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [ey, java.lang.Object] */
    public final void R(Parcelable parcelable) {
        r6 r6Var;
        int i;
        boolean z;
        int i2;
        boolean z2;
        a aVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.t.t.getClassLoader());
                this.k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.t.t.getClassLoader());
                arrayList.add((ay) bundle.getParcelable("state"));
            }
        }
        l3 l3Var = this.c;
        HashMap hashMap = (HashMap) l3Var.e;
        HashMap hashMap2 = (HashMap) l3Var.d;
        hashMap.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ay ayVar = (ay) obj;
            hashMap.put(ayVar.d, ayVar);
        }
        wx wxVar = (wx) bundle3.getParcelable("state");
        if (wxVar == null) {
            return;
        }
        hashMap2.clear();
        ArrayList arrayList2 = wxVar.c;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (true) {
            r6Var = this.l;
            i = 2;
            if (i4 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i4);
            i4++;
            ay ayVar2 = (ay) ((HashMap) l3Var.e).remove((String) obj2);
            if (ayVar2 != null) {
                gx gxVar = (gx) this.L.c.get(ayVar2.d);
                if (gxVar != null) {
                    if (F(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + gxVar);
                    }
                    aVar = new a(r6Var, l3Var, gxVar, ayVar2);
                } else {
                    aVar = new a(this.l, this.c, this.t.t.getClassLoader(), C(), ayVar2);
                }
                gx gxVar2 = aVar.c;
                gxVar2.t = this;
                if (F(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + gxVar2.g + "): " + gxVar2);
                }
                aVar.m(this.t.t.getClassLoader());
                l3Var.n(aVar);
                aVar.e = this.s;
            }
        }
        xx xxVar = this.L;
        xxVar.getClass();
        ArrayList arrayList3 = new ArrayList(xxVar.c.values());
        int size3 = arrayList3.size();
        int i5 = 0;
        while (true) {
            z = true;
            if (i5 >= size3) {
                break;
            }
            Object obj3 = arrayList3.get(i5);
            i5++;
            gx gxVar3 = (gx) obj3;
            if (hashMap2.get(gxVar3.g) == null) {
                if (F(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + gxVar3 + " that was not found in the set of active Fragments " + wxVar.c);
                }
                this.L.d(gxVar3);
                gxVar3.t = this;
                a aVar2 = new a(r6Var, l3Var, gxVar3);
                aVar2.e = 1;
                aVar2.k();
                gxVar3.n = true;
                aVar2.k();
            }
        }
        ArrayList arrayList4 = wxVar.d;
        ((ArrayList) l3Var.g).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList4.get(i6);
                i6++;
                String str3 = (String) obj4;
                gx d = l3Var.d(str3);
                if (d != null) {
                    if (F(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + d);
                    }
                    l3Var.a(d);
                } else {
                    c.o(qo0.r("No instantiated fragment for (", str3, ")"));
                    return;
                }
            }
        }
        if (wxVar.e != null) {
            this.d = new ArrayList(wxVar.e.length);
            int i7 = 0;
            while (true) {
                ic[] icVarArr = wxVar.e;
                if (i7 >= icVarArr.length) {
                    break;
                }
                ic icVar = icVarArr[i7];
                ArrayList arrayList5 = icVar.d;
                hc hcVar = new hc(this);
                int[] iArr = icVar.c;
                int i8 = 0;
                int i9 = 0;
                while (i8 < iArr.length) {
                    ?? obj5 = new Object();
                    int i10 = i8 + 1;
                    int i11 = i;
                    obj5.a = iArr[i8];
                    if (F(i11)) {
                        Log.v("FragmentManager", "Instantiate " + hcVar + " op #" + i9 + " base fragment #" + iArr[i10]);
                    }
                    obj5.h = m50.values()[icVar.e[i9]];
                    obj5.i = m50.values()[icVar.f[i9]];
                    int i12 = i8 + 2;
                    if (iArr[i10] != 0) {
                        z2 = z;
                    } else {
                        z2 = false;
                    }
                    obj5.c = z2;
                    int i13 = iArr[i12];
                    obj5.d = i13;
                    int i14 = iArr[i8 + 3];
                    obj5.e = i14;
                    int i15 = i8 + 5;
                    int i16 = iArr[i8 + 4];
                    obj5.f = i16;
                    i8 += 6;
                    int[] iArr2 = iArr;
                    int i17 = iArr2[i15];
                    obj5.g = i17;
                    hcVar.b = i13;
                    hcVar.c = i14;
                    hcVar.d = i16;
                    hcVar.e = i17;
                    hcVar.b(obj5);
                    i9++;
                    i = i11;
                    iArr = iArr2;
                    z = true;
                }
                int i18 = i;
                hcVar.f = icVar.g;
                hcVar.i = icVar.h;
                hcVar.g = true;
                hcVar.j = icVar.j;
                hcVar.k = icVar.k;
                hcVar.l = icVar.l;
                hcVar.m = icVar.m;
                hcVar.n = icVar.n;
                hcVar.o = icVar.o;
                hcVar.p = icVar.p;
                hcVar.s = icVar.i;
                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                    String str4 = (String) arrayList5.get(i19);
                    if (str4 != null) {
                        ((ey) hcVar.a.get(i19)).b = l3Var.d(str4);
                    }
                }
                hcVar.c(1);
                if (F(i18)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + hcVar.s + "): " + hcVar);
                    PrintWriter printWriter = new PrintWriter(new p70());
                    hcVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(hcVar);
                i7++;
                i = i18;
                z = true;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = null;
        }
        this.i.set(wxVar.f);
        String str5 = wxVar.g;
        if (str5 != null) {
            gx d2 = l3Var.d(str5);
            this.w = d2;
            q(d2);
        }
        ArrayList arrayList6 = wxVar.h;
        if (arrayList6 != null) {
            while (i2 < arrayList6.size()) {
                this.j.put((String) arrayList6.get(i2), (jc) wxVar.i.get(i2));
                i2++;
            }
        }
        this.C = new ArrayDeque(wxVar.j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [wx, android.os.Parcelable, java.lang.Object] */
    public final Bundle S() {
        int i;
        ArrayList arrayList;
        ic[] icVarArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            no noVar = (no) it.next();
            if (noVar.e) {
                if (F(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                noVar.e = false;
                noVar.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((no) it2.next()).e();
        }
        x(true);
        this.E = true;
        this.L.h = true;
        l3 l3Var = this.c;
        l3Var.getClass();
        HashMap hashMap = (HashMap) l3Var.d;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it3 = hashMap.values().iterator();
        while (true) {
            Bundle bundle2 = null;
            if (!it3.hasNext()) {
                break;
            }
            a aVar = (a) it3.next();
            if (aVar != null) {
                gx gxVar = aVar.c;
                ay ayVar = new ay(gxVar);
                if (gxVar.c > -1 && ayVar.o == null) {
                    Bundle bundle3 = new Bundle();
                    gxVar.z(bundle3);
                    gxVar.S.e(bundle3);
                    bundle3.putParcelable("android:support:fragments", gxVar.v.S());
                    aVar.a.s(false);
                    if (!bundle3.isEmpty()) {
                        bundle2 = bundle3;
                    }
                    if (gxVar.G != null) {
                        aVar.o();
                    }
                    if (gxVar.e != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", gxVar.e);
                    }
                    if (gxVar.f != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", gxVar.f);
                    }
                    if (!gxVar.I) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", gxVar.I);
                    }
                    ayVar.o = bundle2;
                    if (gxVar.j != null) {
                        if (bundle2 == null) {
                            ayVar.o = new Bundle();
                        }
                        ayVar.o.putString("android:target_state", gxVar.j);
                        int i2 = gxVar.k;
                        if (i2 != 0) {
                            ayVar.o.putInt("android:target_req_state", i2);
                        }
                    }
                } else {
                    ayVar.o = gxVar.d;
                }
                arrayList2.add(gxVar.g);
                if (F(2)) {
                    Log.v("FragmentManager", "Saved state of " + gxVar + ": " + gxVar.d);
                }
            }
        }
        l3 l3Var2 = this.c;
        l3Var2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) l3Var2.e).values());
        if (arrayList3.isEmpty()) {
            if (F(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
                return bundle;
            }
        } else {
            l3 l3Var3 = this.c;
            synchronized (((ArrayList) l3Var3.g)) {
                try {
                    if (((ArrayList) l3Var3.g).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) l3Var3.g).size());
                        ArrayList arrayList4 = (ArrayList) l3Var3.g;
                        int size2 = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj = arrayList4.get(i3);
                            i3++;
                            gx gxVar2 = (gx) obj;
                            arrayList.add(gxVar2.g);
                            if (F(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + gxVar2.g + "): " + gxVar2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList5 = this.d;
            if (arrayList5 != null && (size = arrayList5.size()) > 0) {
                icVarArr = new ic[size];
                for (int i4 = 0; i4 < size; i4++) {
                    icVarArr[i4] = new ic((hc) this.d.get(i4));
                    if (F(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.d.get(i4));
                    }
                }
            } else {
                icVarArr = null;
            }
            ?? obj2 = new Object();
            obj2.g = null;
            ArrayList arrayList6 = new ArrayList();
            obj2.h = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            obj2.i = arrayList7;
            obj2.c = arrayList2;
            obj2.d = arrayList;
            obj2.e = icVarArr;
            obj2.f = this.i.get();
            gx gxVar3 = this.w;
            if (gxVar3 != null) {
                obj2.g = gxVar3.g;
            }
            arrayList6.addAll(this.j.keySet());
            arrayList7.addAll(this.j.values());
            obj2.j = new ArrayList(this.C);
            bundle.putParcelable("state", obj2);
            for (String str : this.k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.k.get(str));
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                ay ayVar2 = (ay) obj3;
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", ayVar2);
                bundle.putBundle("fragment_" + ayVar2.d, bundle4);
            }
        }
        return bundle;
    }

    public final void T() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.t.u.removeCallbacks(this.M);
                    this.t.u.post(this.M);
                    b0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void U(gx gxVar, boolean z) {
        ViewGroup B = B(gxVar);
        if (B != null && (B instanceof FragmentContainerView)) {
            ((FragmentContainerView) B).setDrawDisappearingViewsLast(!z);
        }
    }

    public final void V(gx gxVar, m50 m50Var) {
        if (gxVar == this.c.d(gxVar.g) && (gxVar.u == null || gxVar.t == this)) {
            gxVar.O = m50Var;
        } else {
            f40.i("Fragment ", gxVar, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void W(gx gxVar) {
        if (gxVar != null) {
            if (gxVar != this.c.d(gxVar.g) || (gxVar.u != null && gxVar.t != this)) {
                f40.i("Fragment ", gxVar, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        gx gxVar2 = this.w;
        this.w = gxVar;
        q(gxVar2);
        q(this.w);
    }

    public final void X(gx gxVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup B = B(gxVar);
        if (B != null) {
            fx fxVar = gxVar.J;
            boolean z = false;
            if (fxVar == null) {
                i = 0;
            } else {
                i = fxVar.b;
            }
            if (fxVar == null) {
                i2 = 0;
            } else {
                i2 = fxVar.c;
            }
            int i5 = i2 + i;
            if (fxVar == null) {
                i3 = 0;
            } else {
                i3 = fxVar.d;
            }
            int i6 = i3 + i5;
            if (fxVar == null) {
                i4 = 0;
            } else {
                i4 = fxVar.e;
            }
            if (i4 + i6 > 0) {
                if (B.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    B.setTag(R.id.visible_removing_fragment_view_tag, gxVar);
                }
                gx gxVar2 = (gx) B.getTag(R.id.visible_removing_fragment_view_tag);
                fx fxVar2 = gxVar.J;
                if (fxVar2 != null) {
                    z = fxVar2.a;
                }
                if (gxVar2.J != null) {
                    gxVar2.f().a = z;
                }
            }
        }
    }

    public final void Z() {
        ArrayList g = this.c.g();
        int size = g.size();
        int i = 0;
        while (i < size) {
            Object obj = g.get(i);
            i++;
            a aVar = (a) obj;
            gx gxVar = aVar.c;
            if (gxVar.H) {
                if (this.b) {
                    this.H = true;
                } else {
                    gxVar.H = false;
                    aVar.k();
                }
            }
        }
    }

    public final a a(gx gxVar) {
        String str = gxVar.N;
        if (str != null) {
            dy.c(gxVar, str);
        }
        if (F(2)) {
            Log.v("FragmentManager", "add: " + gxVar);
        }
        a f = f(gxVar);
        gxVar.t = this;
        l3 l3Var = this.c;
        l3Var.n(f);
        if (!gxVar.B) {
            l3Var.a(gxVar);
            gxVar.n = false;
            if (gxVar.G == null) {
                gxVar.K = false;
            }
            if (G(gxVar)) {
                this.D = true;
            }
        }
        return f;
    }

    public final void a0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new p70());
        ix ixVar = this.t;
        if (ixVar != null) {
            try {
                ixVar.w.dump("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            u("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(ix ixVar, wv0 wv0Var, gx gxVar) {
        xx xxVar;
        boolean z;
        String str;
        ix ixVar2;
        if (this.t == null) {
            this.t = ixVar;
            this.u = wv0Var;
            this.v = gxVar;
            CopyOnWriteArrayList copyOnWriteArrayList = this.m;
            if (gxVar != 0) {
                copyOnWriteArrayList.add(new rx(gxVar));
            } else if (ixVar != null) {
                copyOnWriteArrayList.add(ixVar);
            }
            if (this.v != null) {
                b0();
            }
            if (ixVar != null) {
                b i = ixVar.w.i();
                this.g = i;
                if (gxVar != 0) {
                    ixVar2 = gxVar;
                } else {
                    ixVar2 = ixVar;
                }
                i.a(ixVar2, this.h);
            }
            int i2 = 0;
            int i3 = 1;
            if (gxVar != 0) {
                xx xxVar2 = gxVar.t.L;
                HashMap hashMap = xxVar2.d;
                xx xxVar3 = (xx) hashMap.get(gxVar.g);
                if (xxVar3 == null) {
                    xxVar3 = new xx(xxVar2.f);
                    hashMap.put(gxVar.g, xxVar3);
                }
                this.L = xxVar3;
            } else if (ixVar != null) {
                az0 d = ixVar.w.d();
                d.getClass();
                rl rlVar = rl.c;
                rlVar.getClass();
                String canonicalName = xx.class.getCanonicalName();
                if (canonicalName != null) {
                    String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
                    LinkedHashMap linkedHashMap = d.a;
                    yy0 yy0Var = (yy0) linkedHashMap.get(concat);
                    if (xx.class.isInstance(yy0Var)) {
                        yy0Var.getClass();
                    } else {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.putAll((LinkedHashMap) rlVar.b);
                        linkedHashMap2.put(os.g, concat);
                        try {
                            xxVar = new xx(true);
                        } catch (AbstractMethodError unused) {
                            xxVar = new xx(true);
                        }
                        yy0Var = xxVar;
                        yy0 yy0Var2 = (yy0) linkedHashMap.put(concat, yy0Var);
                        if (yy0Var2 != null) {
                            yy0Var2.a();
                        }
                    }
                    this.L = (xx) yy0Var;
                } else {
                    c.k("Local and anonymous classes can not be ViewModels");
                    return;
                }
            } else {
                this.L = new xx(false);
            }
            xx xxVar4 = this.L;
            if (!this.E && !this.F) {
                z = false;
            } else {
                z = true;
            }
            xxVar4.h = z;
            this.c.f = xxVar4;
            ix ixVar3 = this.t;
            int i4 = 2;
            if (ixVar3 != null && gxVar == 0) {
                l5 a = ixVar3.a();
                a.e("android:support:fragments", new xi(i4, this));
                Bundle c = a.c("android:support:fragments");
                if (c != null) {
                    R(c);
                }
            }
            ix ixVar4 = this.t;
            if (ixVar4 != null) {
                zi ziVar = ixVar4.w.m;
                if (gxVar != 0) {
                    str = qo0.s(new StringBuilder(), gxVar.g, ":");
                } else {
                    str = "";
                }
                String concat2 = "FragmentManager:".concat(str);
                this.z = ziVar.d(concat2.concat("StartActivityForResult"), new e3(i3), new nx(this, i3));
                this.A = ziVar.d(concat2.concat("StartIntentSenderForResult"), new e3(3), new nx(this, i4));
                this.B = ziVar.d(concat2.concat("RequestPermissions"), new e3(i2), new nx(this, i2));
            }
            ix ixVar5 = this.t;
            if (ixVar5 != null) {
                ixVar5.w.g(this.n);
            }
            ix ixVar6 = this.t;
            if (ixVar6 != null) {
                ixVar6.w.o.add(this.o);
            }
            ix ixVar7 = this.t;
            if (ixVar7 != null) {
                ixVar7.w.q.add(this.p);
            }
            ix ixVar8 = this.t;
            if (ixVar8 != null) {
                ixVar8.w.r.add(this.q);
            }
            ix ixVar9 = this.t;
            if (ixVar9 != null && gxVar == 0) {
                b8 b8Var = ixVar9.w.e;
                ((CopyOnWriteArrayList) b8Var.f).add(this.r);
                ((Runnable) b8Var.e).run();
                return;
            }
            return;
        }
        c.o("Already attached");
    }

    public final void b0() {
        int i;
        synchronized (this.a) {
            try {
                boolean z = true;
                if (!this.a.isEmpty()) {
                    ox oxVar = this.h;
                    oxVar.a = true;
                    ky kyVar = oxVar.c;
                    if (kyVar != null) {
                        kyVar.a();
                    }
                    return;
                }
                ox oxVar2 = this.h;
                ArrayList arrayList = this.d;
                if (arrayList != null) {
                    i = arrayList.size();
                } else {
                    i = 0;
                }
                if (i <= 0 || !J(this.v)) {
                    z = false;
                }
                oxVar2.a = z;
                ky kyVar2 = oxVar2.c;
                if (kyVar2 != null) {
                    kyVar2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(gx gxVar) {
        if (F(2)) {
            Log.v("FragmentManager", "attach: " + gxVar);
        }
        if (gxVar.B) {
            gxVar.B = false;
            if (!gxVar.m) {
                this.c.a(gxVar);
                if (F(2)) {
                    Log.v("FragmentManager", "add from attach: " + gxVar);
                }
                if (G(gxVar)) {
                    this.D = true;
                }
            }
        }
    }

    public final void d() {
        this.b = false;
        this.J.clear();
        this.I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        ArrayList g = this.c.g();
        int size = g.size();
        int i = 0;
        while (i < size) {
            Object obj = g.get(i);
            i++;
            ViewGroup viewGroup = ((a) obj).c.F;
            if (viewGroup != null) {
                hashSet.add(no.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final a f(gx gxVar) {
        String str = gxVar.g;
        l3 l3Var = this.c;
        a aVar = (a) ((HashMap) l3Var.d).get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this.l, l3Var, gxVar);
        aVar2.m(this.t.t.getClassLoader());
        aVar2.e = this.s;
        return aVar2;
    }

    public final void g(gx gxVar) {
        if (F(2)) {
            Log.v("FragmentManager", "detach: " + gxVar);
        }
        if (!gxVar.B) {
            gxVar.B = true;
            if (gxVar.m) {
                if (F(2)) {
                    Log.v("FragmentManager", "remove from detach: " + gxVar);
                }
                l3 l3Var = this.c;
                synchronized (((ArrayList) l3Var.g)) {
                    ((ArrayList) l3Var.g).remove(gxVar);
                }
                gxVar.m = false;
                if (G(gxVar)) {
                    this.D = true;
                }
                X(gxVar);
            }
        }
    }

    public final void h(boolean z) {
        if (z && this.t != null) {
            a0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (gx gxVar : this.c.j()) {
            if (gxVar != null) {
                gxVar.E = true;
                if (z) {
                    gxVar.v.h(true);
                }
            }
        }
    }

    public final boolean i() {
        boolean z;
        if (this.s >= 1) {
            for (gx gxVar : this.c.j()) {
                if (gxVar != null) {
                    if (!gxVar.A) {
                        z = gxVar.v.i();
                    } else {
                        z = false;
                    }
                    if (z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        boolean z;
        if (this.s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (gx gxVar : this.c.j()) {
            if (gxVar != null && I(gxVar)) {
                if (!gxVar.A) {
                    z = gxVar.v.j();
                } else {
                    z = false;
                }
                if (z) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(gxVar);
                    z2 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                gx gxVar2 = (gx) this.e.get(i);
                if (arrayList == null || !arrayList.contains(gxVar2)) {
                    gxVar2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z2;
    }

    public final void k() {
        boolean z = true;
        this.G = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((no) it.next()).e();
        }
        ix ixVar = this.t;
        l3 l3Var = this.c;
        if (ixVar != null) {
            z = ((xx) l3Var.f).g;
        } else {
            f5 f5Var = ixVar.t;
            if (f5Var != null) {
                z = true ^ f5Var.isChangingConfigurations();
            }
        }
        if (z) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((jc) it2.next()).c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str = (String) obj;
                    xx xxVar = (xx) l3Var.f;
                    xxVar.getClass();
                    if (F(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    xxVar.c(str);
                }
            }
        }
        t(-1);
        ix ixVar2 = this.t;
        if (ixVar2 != null) {
            ixVar2.w.o.remove(this.o);
        }
        ix ixVar3 = this.t;
        if (ixVar3 != null) {
            ixVar3.w.n.remove(this.n);
        }
        ix ixVar4 = this.t;
        if (ixVar4 != null) {
            ixVar4.w.q.remove(this.p);
        }
        ix ixVar5 = this.t;
        if (ixVar5 != null) {
            ixVar5.w.r.remove(this.q);
        }
        ix ixVar6 = this.t;
        if (ixVar6 != null) {
            b8 b8Var = ixVar6.w.e;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) b8Var.f;
            px pxVar = this.r;
            copyOnWriteArrayList.remove(pxVar);
            if (((HashMap) b8Var.d).remove(pxVar) == null) {
                ((Runnable) b8Var.e).run();
            } else {
                c.a();
            }
        }
        this.t = null;
        this.u = null;
        this.v = null;
        if (this.g != null) {
            Iterator it3 = this.h.b.iterator();
            while (it3.hasNext()) {
                ((ef) it3.next()).cancel();
            }
            this.g = null;
        }
        g3 g3Var = this.z;
        if (g3Var != null) {
            g3Var.t.f(g3Var.s);
            g3 g3Var2 = this.A;
            g3Var2.t.f(g3Var2.s);
            g3 g3Var3 = this.B;
            g3Var3.t.f(g3Var3.s);
        }
    }

    public final void l(boolean z) {
        if (z && this.t != null) {
            a0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (gx gxVar : this.c.j()) {
            if (gxVar != null) {
                gxVar.E = true;
                if (z) {
                    gxVar.v.l(true);
                }
            }
        }
    }

    public final void m(boolean z) {
        if (z && this.t != null) {
            a0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (gx gxVar : this.c.j()) {
            if (gxVar != null && z) {
                gxVar.v.m(true);
            }
        }
    }

    public final void n() {
        ArrayList h = this.c.h();
        int size = h.size();
        int i = 0;
        while (i < size) {
            Object obj = h.get(i);
            i++;
            gx gxVar = (gx) obj;
            if (gxVar != null) {
                gxVar.p();
                gxVar.v.n();
            }
        }
    }

    public final boolean o() {
        boolean z;
        if (this.s >= 1) {
            for (gx gxVar : this.c.j()) {
                if (gxVar != null) {
                    if (!gxVar.A) {
                        z = gxVar.v.o();
                    } else {
                        z = false;
                    }
                    if (z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.s >= 1) {
            for (gx gxVar : this.c.j()) {
                if (gxVar != null && !gxVar.A) {
                    gxVar.v.p();
                }
            }
        }
    }

    public final void q(gx gxVar) {
        if (gxVar != null) {
            if (gxVar == this.c.d(gxVar.g)) {
                gxVar.t.getClass();
                boolean J = J(gxVar);
                Boolean bool = gxVar.l;
                if (bool == null || bool.booleanValue() != J) {
                    gxVar.l = Boolean.valueOf(J);
                    vx vxVar = gxVar.v;
                    vxVar.b0();
                    vxVar.q(vxVar.w);
                }
            }
        }
    }

    public final void r(boolean z) {
        if (z && this.t != null) {
            a0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (gx gxVar : this.c.j()) {
            if (gxVar != null && z) {
                gxVar.v.r(true);
            }
        }
    }

    public final boolean s() {
        boolean z;
        if (this.s < 1) {
            return false;
        }
        boolean z2 = false;
        for (gx gxVar : this.c.j()) {
            if (gxVar != null && I(gxVar)) {
                if (!gxVar.A) {
                    z = gxVar.v.s();
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t(int i) {
        try {
            this.b = true;
            for (a aVar : ((HashMap) this.c.d).values()) {
                if (aVar != null) {
                    aVar.e = i;
                }
            }
            K(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((no) it.next()).e();
            }
            this.b = false;
            x(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        gx gxVar = this.v;
        if (gxVar != null) {
            sb.append(gxVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.v)));
            sb.append("}");
        } else {
            ix ixVar = this.t;
            if (ixVar != null) {
                sb.append(ixVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        b70 b70Var;
        int i5;
        int i6;
        int i7;
        int i8;
        String str2 = str + "    ";
        l3 l3Var = this.c;
        ArrayList arrayList = (ArrayList) l3Var.g;
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) l3Var.d;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (a aVar : hashMap.values()) {
                printWriter.print(str);
                if (aVar != null) {
                    gx gxVar = aVar.c;
                    printWriter.println(gxVar);
                    gxVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(gxVar.x));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(gxVar.y));
                    printWriter.print(" mTag=");
                    printWriter.println(gxVar.z);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(gxVar.c);
                    printWriter.print(" mWho=");
                    printWriter.print(gxVar.g);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(gxVar.s);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(gxVar.m);
                    printWriter.print(" mRemoving=");
                    printWriter.print(gxVar.n);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(gxVar.o);
                    printWriter.print(" mInLayout=");
                    printWriter.println(gxVar.p);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(gxVar.A);
                    printWriter.print(" mDetached=");
                    printWriter.print(gxVar.B);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(gxVar.D);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(gxVar.C);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(gxVar.I);
                    if (gxVar.t != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(gxVar.t);
                    }
                    if (gxVar.u != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(gxVar.u);
                    }
                    if (gxVar.w != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(gxVar.w);
                    }
                    if (gxVar.h != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(gxVar.h);
                    }
                    if (gxVar.d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(gxVar.d);
                    }
                    if (gxVar.e != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(gxVar.e);
                    }
                    if (gxVar.f != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(gxVar.f);
                    }
                    Object m = gxVar.m(false);
                    if (m != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(m);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(gxVar.k);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    fx fxVar = gxVar.J;
                    if (fxVar == null) {
                        z = false;
                    } else {
                        z = fxVar.a;
                    }
                    printWriter.println(z);
                    fx fxVar2 = gxVar.J;
                    if (fxVar2 == null) {
                        i = 0;
                    } else {
                        i = fxVar2.b;
                    }
                    if (i != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        fx fxVar3 = gxVar.J;
                        if (fxVar3 == null) {
                            i8 = 0;
                        } else {
                            i8 = fxVar3.b;
                        }
                        printWriter.println(i8);
                    }
                    fx fxVar4 = gxVar.J;
                    if (fxVar4 == null) {
                        i2 = 0;
                    } else {
                        i2 = fxVar4.c;
                    }
                    if (i2 != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        fx fxVar5 = gxVar.J;
                        if (fxVar5 == null) {
                            i7 = 0;
                        } else {
                            i7 = fxVar5.c;
                        }
                        printWriter.println(i7);
                    }
                    fx fxVar6 = gxVar.J;
                    if (fxVar6 == null) {
                        i3 = 0;
                    } else {
                        i3 = fxVar6.d;
                    }
                    if (i3 != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        fx fxVar7 = gxVar.J;
                        if (fxVar7 == null) {
                            i6 = 0;
                        } else {
                            i6 = fxVar7.d;
                        }
                        printWriter.println(i6);
                    }
                    fx fxVar8 = gxVar.J;
                    if (fxVar8 == null) {
                        i4 = 0;
                    } else {
                        i4 = fxVar8.e;
                    }
                    if (i4 != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        fx fxVar9 = gxVar.J;
                        if (fxVar9 == null) {
                            i5 = 0;
                        } else {
                            i5 = fxVar9.e;
                        }
                        printWriter.println(i5);
                    }
                    if (gxVar.F != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(gxVar.F);
                    }
                    if (gxVar.G != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(gxVar.G);
                    }
                    if (gxVar.h() != null) {
                        az0 d = gxVar.d();
                        d.getClass();
                        rl rlVar = rl.c;
                        rlVar.getClass();
                        String canonicalName = b70.class.getCanonicalName();
                        if (canonicalName != null) {
                            String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
                            LinkedHashMap linkedHashMap = d.a;
                            yy0 yy0Var = (yy0) linkedHashMap.get(concat);
                            if (b70.class.isInstance(yy0Var)) {
                                yy0Var.getClass();
                            } else {
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                linkedHashMap2.putAll((LinkedHashMap) rlVar.b);
                                linkedHashMap2.put(os.g, concat);
                                try {
                                    b70Var = new b70();
                                } catch (AbstractMethodError unused) {
                                    b70Var = new b70();
                                }
                                yy0Var = b70Var;
                                yy0 yy0Var2 = (yy0) linkedHashMap.put(concat, yy0Var);
                                if (yy0Var2 != null) {
                                    yy0Var2.a();
                                }
                            }
                            vo0 vo0Var = ((b70) yy0Var).c;
                            if (vo0Var.e > 0) {
                                printWriter.print(str3);
                                printWriter.println("Loaders:");
                                if (vo0Var.e > 0) {
                                    if (vo0Var.d[0] != null) {
                                        c.a();
                                    } else {
                                        printWriter.print(str3);
                                        printWriter.print("  #");
                                        printWriter.print(vo0Var.c[0]);
                                        printWriter.print(": ");
                                        throw null;
                                    }
                                }
                            }
                        } else {
                            c.k("Local and anonymous classes can not be ViewModels");
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + gxVar.v + ":");
                    gxVar.v.u(str3.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i9 = 0; i9 < size3; i9++) {
                gx gxVar2 = (gx) arrayList.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(gxVar2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                gx gxVar3 = (gx) this.e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(gxVar3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                hc hcVar = (hc) this.d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(hcVar.toString());
                hcVar.f(str2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size4; i12++) {
                        Object obj = (tx) this.a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.u);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void v(tx txVar, boolean z) {
        if (!z) {
            if (this.t == null) {
                if (this.G) {
                    c.o("FragmentManager has been destroyed");
                    return;
                } else {
                    c.o("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.E || this.F) {
                c.o("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.t == null) {
                    if (z) {
                    } else {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(txVar);
                    T();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z) {
        if (!this.b) {
            if (this.t == null) {
                if (this.G) {
                    c.o("FragmentManager has been destroyed");
                    return;
                } else {
                    c.o("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (Looper.myLooper() == this.t.u.getLooper()) {
                if (!z && (this.E || this.F)) {
                    c.o("Can not perform this action after onSaveInstanceState");
                    return;
                } else {
                    if (this.I == null) {
                        this.I = new ArrayList();
                        this.J = new ArrayList();
                        return;
                    }
                    return;
                }
            }
            c.o("Must be called from main thread of fragment host");
            return;
        }
        c.o("FragmentManager is already executing transactions");
    }

    public final boolean x(boolean z) {
        boolean z2;
        ArrayList arrayList;
        w(z);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList2 = this.I;
            ArrayList arrayList3 = this.J;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i = 0;
                        z2 = false;
                        while (true) {
                            arrayList = this.a;
                            if (i >= size) {
                                break;
                            }
                            z2 |= ((tx) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                        }
                        arrayList.clear();
                        this.t.u.removeCallbacks(this.M);
                    } finally {
                    }
                }
            }
            if (!z2) {
                break;
            }
            z3 = true;
            this.b = true;
            try {
                Q(this.I, this.J);
            } finally {
                d();
            }
        }
        b0();
        if (this.H) {
            this.H = false;
            Z();
        }
        ((HashMap) this.c.d).values().removeAll(Collections.singleton(null));
        return z3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:141:0x024d. Please report as an issue. */
    public final void y(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        int i6;
        int i7;
        l3 l3Var = this.c;
        boolean z5 = ((hc) arrayList.get(i)).p;
        ArrayList arrayList3 = this.K;
        if (arrayList3 == null) {
            this.K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.K.addAll(l3Var.j());
        gx gxVar = this.w;
        int i8 = i;
        boolean z6 = false;
        while (true) {
            int i9 = 1;
            if (i8 < i2) {
                hc hcVar = (hc) arrayList.get(i8);
                boolean booleanValue = ((Boolean) arrayList2.get(i8)).booleanValue();
                ArrayList arrayList4 = this.K;
                if (!booleanValue) {
                    ArrayList arrayList5 = hcVar.a;
                    int i10 = 0;
                    while (i10 < arrayList5.size()) {
                        ey eyVar = (ey) arrayList5.get(i10);
                        int i11 = eyVar.a;
                        if (i11 != i9) {
                            if (i11 != 2) {
                                if (i11 != 3 && i11 != 6) {
                                    if (i11 != 7) {
                                        if (i11 != 8) {
                                            z3 = z5;
                                        } else {
                                            z3 = z5;
                                            arrayList5.add(i10, new ey(9, gxVar, 0));
                                            eyVar.c = true;
                                            i10++;
                                            gxVar = eyVar.b;
                                        }
                                    } else {
                                        z3 = z5;
                                        i4 = 1;
                                    }
                                } else {
                                    z3 = z5;
                                    arrayList4.remove(eyVar.b);
                                    gx gxVar2 = eyVar.b;
                                    if (gxVar2 == gxVar) {
                                        arrayList5.add(i10, new ey(9, gxVar2));
                                        i10++;
                                        i5 = i8;
                                        z4 = z6;
                                        i4 = 1;
                                        gxVar = null;
                                    }
                                }
                                i5 = i8;
                                z4 = z6;
                                i4 = 1;
                            } else {
                                z3 = z5;
                                gx gxVar3 = eyVar.b;
                                int i12 = gxVar3.y;
                                int size = arrayList4.size() - 1;
                                boolean z7 = false;
                                while (size >= 0) {
                                    int i13 = i8;
                                    gx gxVar4 = (gx) arrayList4.get(size);
                                    boolean z8 = z6;
                                    if (gxVar4.y == i12) {
                                        if (gxVar4 == gxVar3) {
                                            i6 = i12;
                                            z7 = true;
                                        } else {
                                            if (gxVar4 == gxVar) {
                                                i6 = i12;
                                                i7 = 0;
                                                arrayList5.add(i10, new ey(9, gxVar4, 0));
                                                i10++;
                                                gxVar = null;
                                            } else {
                                                i6 = i12;
                                                i7 = 0;
                                            }
                                            ey eyVar2 = new ey(3, gxVar4, i7);
                                            eyVar2.d = eyVar.d;
                                            eyVar2.f = eyVar.f;
                                            eyVar2.e = eyVar.e;
                                            eyVar2.g = eyVar.g;
                                            arrayList5.add(i10, eyVar2);
                                            arrayList4.remove(gxVar4);
                                            i10++;
                                            gxVar = gxVar;
                                        }
                                    } else {
                                        i6 = i12;
                                    }
                                    size--;
                                    i12 = i6;
                                    z6 = z8;
                                    i8 = i13;
                                }
                                i5 = i8;
                                z4 = z6;
                                i4 = 1;
                                if (z7) {
                                    arrayList5.remove(i10);
                                    i10--;
                                } else {
                                    eyVar.a = 1;
                                    eyVar.c = true;
                                    arrayList4.add(gxVar3);
                                }
                            }
                            i10 += i4;
                            i9 = i4;
                            z5 = z3;
                            z6 = z4;
                            i8 = i5;
                        } else {
                            z3 = z5;
                            i4 = i9;
                        }
                        i5 = i8;
                        z4 = z6;
                        arrayList4.add(eyVar.b);
                        i10 += i4;
                        i9 = i4;
                        z5 = z3;
                        z6 = z4;
                        i8 = i5;
                    }
                    z = z5;
                    i3 = i8;
                    z2 = z6;
                } else {
                    z = z5;
                    i3 = i8;
                    z2 = z6;
                    int i14 = 1;
                    ArrayList arrayList6 = hcVar.a;
                    int size2 = arrayList6.size() - 1;
                    while (size2 >= 0) {
                        ey eyVar3 = (ey) arrayList6.get(size2);
                        int i15 = eyVar3.a;
                        if (i15 != i14) {
                            if (i15 != 3) {
                                switch (i15) {
                                    case 8:
                                        gxVar = null;
                                        break;
                                    case 9:
                                        gxVar = eyVar3.b;
                                        break;
                                    case 10:
                                        eyVar3.i = eyVar3.h;
                                        break;
                                }
                                size2--;
                                i14 = 1;
                            }
                            arrayList4.add(eyVar3.b);
                            size2--;
                            i14 = 1;
                        }
                        arrayList4.remove(eyVar3.b);
                        size2--;
                        i14 = 1;
                    }
                }
                if (!z2 && !hcVar.g) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                i8 = i3 + 1;
                z5 = z;
            } else {
                boolean z9 = z5;
                this.K.clear();
                if (!z9 && this.s >= 1) {
                    for (int i16 = i; i16 < i2; i16++) {
                        ArrayList arrayList7 = ((hc) arrayList.get(i16)).a;
                        int size3 = arrayList7.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            Object obj = arrayList7.get(i17);
                            i17++;
                            gx gxVar5 = ((ey) obj).b;
                            if (gxVar5 != null && gxVar5.t != null) {
                                l3Var.n(f(gxVar5));
                            }
                        }
                    }
                }
                for (int i18 = i; i18 < i2; i18++) {
                    hc hcVar2 = (hc) arrayList.get(i18);
                    if (((Boolean) arrayList2.get(i18)).booleanValue()) {
                        hcVar2.c(-1);
                        vx vxVar = hcVar2.q;
                        ArrayList arrayList8 = hcVar2.a;
                        boolean z10 = true;
                        for (int size4 = arrayList8.size() - 1; size4 >= 0; size4--) {
                            ey eyVar4 = (ey) arrayList8.get(size4);
                            gx gxVar6 = eyVar4.b;
                            if (gxVar6 != null) {
                                if (gxVar6.J != null) {
                                    gxVar6.f().a = z10;
                                }
                                int i19 = hcVar2.f;
                                int i20 = 8194;
                                int i21 = 4097;
                                if (i19 != 4097) {
                                    if (i19 != 8194) {
                                        i20 = 4100;
                                        i21 = 8197;
                                        if (i19 != 8197) {
                                            if (i19 != 4099) {
                                                if (i19 != 4100) {
                                                    i20 = 0;
                                                }
                                            } else {
                                                i20 = 4099;
                                            }
                                        }
                                    }
                                    i20 = i21;
                                }
                                if (gxVar6.J != null || i20 != 0) {
                                    gxVar6.f();
                                    gxVar6.J.f = i20;
                                }
                                gxVar6.f();
                                gxVar6.J.getClass();
                            }
                            switch (eyVar4.a) {
                                case 1:
                                    gxVar6.J(eyVar4.d, eyVar4.e, eyVar4.f, eyVar4.g);
                                    z10 = true;
                                    vxVar.U(gxVar6, true);
                                    vxVar.P(gxVar6);
                                case 2:
                                default:
                                    f40.h("Unknown cmd: ", eyVar4.a);
                                    return;
                                case 3:
                                    gxVar6.J(eyVar4.d, eyVar4.e, eyVar4.f, eyVar4.g);
                                    vxVar.a(gxVar6);
                                    z10 = true;
                                case 4:
                                    gxVar6.J(eyVar4.d, eyVar4.e, eyVar4.f, eyVar4.g);
                                    vxVar.getClass();
                                    Y(gxVar6);
                                    z10 = true;
                                case 5:
                                    gxVar6.J(eyVar4.d, eyVar4.e, eyVar4.f, eyVar4.g);
                                    vxVar.U(gxVar6, true);
                                    vxVar.E(gxVar6);
                                    z10 = true;
                                case 6:
                                    gxVar6.J(eyVar4.d, eyVar4.e, eyVar4.f, eyVar4.g);
                                    vxVar.c(gxVar6);
                                    z10 = true;
                                case 7:
                                    gxVar6.J(eyVar4.d, eyVar4.e, eyVar4.f, eyVar4.g);
                                    vxVar.U(gxVar6, true);
                                    vxVar.g(gxVar6);
                                    z10 = true;
                                case 8:
                                    vxVar.W(null);
                                    z10 = true;
                                case 9:
                                    vxVar.W(gxVar6);
                                    z10 = true;
                                case 10:
                                    vxVar.V(gxVar6, eyVar4.h);
                                    z10 = true;
                            }
                        }
                    } else {
                        hcVar2.c(1);
                        vx vxVar2 = hcVar2.q;
                        ArrayList arrayList9 = hcVar2.a;
                        int size5 = arrayList9.size();
                        for (int i22 = 0; i22 < size5; i22++) {
                            ey eyVar5 = (ey) arrayList9.get(i22);
                            gx gxVar7 = eyVar5.b;
                            if (gxVar7 != null) {
                                if (gxVar7.J != null) {
                                    gxVar7.f().a = false;
                                }
                                int i23 = hcVar2.f;
                                if (gxVar7.J != null || i23 != 0) {
                                    gxVar7.f();
                                    gxVar7.J.f = i23;
                                }
                                gxVar7.f();
                                gxVar7.J.getClass();
                            }
                            switch (eyVar5.a) {
                                case 1:
                                    gxVar7.J(eyVar5.d, eyVar5.e, eyVar5.f, eyVar5.g);
                                    vxVar2.U(gxVar7, false);
                                    vxVar2.a(gxVar7);
                                    break;
                                case 2:
                                default:
                                    f40.h("Unknown cmd: ", eyVar5.a);
                                    return;
                                case 3:
                                    gxVar7.J(eyVar5.d, eyVar5.e, eyVar5.f, eyVar5.g);
                                    vxVar2.P(gxVar7);
                                    break;
                                case 4:
                                    gxVar7.J(eyVar5.d, eyVar5.e, eyVar5.f, eyVar5.g);
                                    vxVar2.E(gxVar7);
                                    break;
                                case 5:
                                    gxVar7.J(eyVar5.d, eyVar5.e, eyVar5.f, eyVar5.g);
                                    vxVar2.U(gxVar7, false);
                                    Y(gxVar7);
                                    break;
                                case 6:
                                    gxVar7.J(eyVar5.d, eyVar5.e, eyVar5.f, eyVar5.g);
                                    vxVar2.g(gxVar7);
                                    break;
                                case 7:
                                    gxVar7.J(eyVar5.d, eyVar5.e, eyVar5.f, eyVar5.g);
                                    vxVar2.U(gxVar7, false);
                                    vxVar2.c(gxVar7);
                                    break;
                                case 8:
                                    vxVar2.W(gxVar7);
                                    break;
                                case 9:
                                    vxVar2.W(null);
                                    break;
                                case 10:
                                    vxVar2.V(gxVar7, eyVar5.i);
                                    break;
                            }
                        }
                    }
                }
                boolean booleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i24 = i; i24 < i2; i24++) {
                    hc hcVar3 = (hc) arrayList.get(i24);
                    if (booleanValue2) {
                        for (int size6 = hcVar3.a.size() - 1; size6 >= 0; size6--) {
                            gx gxVar8 = ((ey) hcVar3.a.get(size6)).b;
                            if (gxVar8 != null) {
                                f(gxVar8).k();
                            }
                        }
                    } else {
                        ArrayList arrayList10 = hcVar3.a;
                        int size7 = arrayList10.size();
                        int i25 = 0;
                        while (i25 < size7) {
                            Object obj2 = arrayList10.get(i25);
                            i25++;
                            gx gxVar9 = ((ey) obj2).b;
                            if (gxVar9 != null) {
                                f(gxVar9).k();
                            }
                        }
                    }
                }
                K(this.s, true);
                HashSet hashSet = new HashSet();
                for (int i26 = i; i26 < i2; i26++) {
                    ArrayList arrayList11 = ((hc) arrayList.get(i26)).a;
                    int size8 = arrayList11.size();
                    int i27 = 0;
                    while (i27 < size8) {
                        Object obj3 = arrayList11.get(i27);
                        i27++;
                        gx gxVar10 = ((ey) obj3).b;
                        if (gxVar10 != null && (viewGroup = gxVar10.F) != null) {
                            hashSet.add(no.f(viewGroup, D()));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    no noVar = (no) it.next();
                    noVar.d = booleanValue2;
                    synchronized (noVar.b) {
                        try {
                            noVar.g();
                            noVar.e = false;
                            int size9 = noVar.b.size() - 1;
                            while (true) {
                                if (size9 >= 0) {
                                    xo0 xo0Var = (xo0) noVar.b.get(size9);
                                    int c = qo0.c(xo0Var.c.G);
                                    if (xo0Var.a == 2 && c != 2) {
                                        fx fxVar = xo0Var.c.J;
                                        noVar.e = false;
                                    } else {
                                        size9--;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    noVar.c();
                }
                for (int i28 = i; i28 < i2; i28++) {
                    hc hcVar4 = (hc) arrayList.get(i28);
                    if (((Boolean) arrayList2.get(i28)).booleanValue() && hcVar4.s >= 0) {
                        hcVar4.s = -1;
                    }
                    hcVar4.getClass();
                }
                return;
            }
        }
    }

    public final gx z(int i) {
        l3 l3Var = this.c;
        ArrayList arrayList = (ArrayList) l3Var.g;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            gx gxVar = (gx) arrayList.get(size);
            if (gxVar != null && gxVar.x == i) {
                return gxVar;
            }
        }
        for (a aVar : ((HashMap) l3Var.d).values()) {
            if (aVar != null) {
                gx gxVar2 = aVar.c;
                if (gxVar2.x == i) {
                    return gxVar2;
                }
            }
        }
        return null;
    }
}
