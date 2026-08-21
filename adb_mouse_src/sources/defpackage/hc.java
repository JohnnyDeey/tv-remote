package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class hc implements tx {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList n;
    public ArrayList o;
    public boolean p;
    public final vx q;
    public boolean r;
    public int s;

    public hc(vx vxVar) {
        vxVar.C();
        ix ixVar = vxVar.t;
        if (ixVar != null) {
            ixVar.t.getClassLoader();
        }
        this.a = new ArrayList();
        this.h = true;
        this.p = false;
        this.s = -1;
        this.q = vxVar;
    }

    @Override // defpackage.tx
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (vx.F(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.g) {
            vx vxVar = this.q;
            if (vxVar.d == null) {
                vxVar.d = new ArrayList();
            }
            vxVar.d.add(this);
            return true;
        }
        return true;
    }

    public final void b(ey eyVar) {
        this.a.add(eyVar);
        eyVar.d = this.b;
        eyVar.e = this.c;
        eyVar.f = this.d;
        eyVar.g = this.e;
    }

    public final void c(int i) {
        if (this.g) {
            if (vx.F(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ey eyVar = (ey) arrayList.get(i2);
                gx gxVar = eyVar.b;
                if (gxVar != null) {
                    gxVar.s += i;
                    if (vx.F(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + eyVar.b + " to " + eyVar.b.s);
                    }
                }
            }
        }
    }

    public final int d(boolean z) {
        if (!this.r) {
            if (vx.F(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new p70());
                f("  ", printWriter, true);
                printWriter.close();
            }
            this.r = true;
            boolean z2 = this.g;
            vx vxVar = this.q;
            if (z2) {
                this.s = vxVar.i.getAndIncrement();
            } else {
                this.s = -1;
            }
            vxVar.v(this, z);
            return this.s;
        }
        c.o("commit already called");
        return 0;
    }

    public final void e(int i, gx gxVar, String str, int i2) {
        String str2 = gxVar.N;
        if (str2 != null) {
            dy.c(gxVar, str2);
        }
        Class<?> cls = gxVar.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = gxVar.z;
                if (str3 != null && !str.equals(str3)) {
                    StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                    sb.append(gxVar);
                    String str4 = gxVar.z;
                    sb.append(": was ");
                    sb.append(str4);
                    sb.append(" now ");
                    sb.append(str);
                    throw new IllegalStateException(sb.toString());
                }
                gxVar.z = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = gxVar.x;
                    if (i3 != 0 && i3 != i) {
                        StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                        sb2.append(gxVar);
                        int i4 = gxVar.x;
                        sb2.append(": was ");
                        sb2.append(i4);
                        sb2.append(" now ");
                        sb2.append(i);
                        throw new IllegalStateException(sb2.toString());
                    }
                    gxVar.x = i;
                    gxVar.y = i;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + gxVar + " with tag " + str + " to container view with no id");
                }
            }
            b(new ey(i2, gxVar));
            gxVar.t = this.q;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void f(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ey eyVar = (ey) arrayList.get(i);
                switch (eyVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + eyVar.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(eyVar.b);
                if (z) {
                    if (eyVar.d != 0 || eyVar.e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(eyVar.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(eyVar.e));
                    }
                    if (eyVar.f != 0 || eyVar.g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(eyVar.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(eyVar.g));
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }
}
