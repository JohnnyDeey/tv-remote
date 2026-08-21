package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class k3 implements hs0 {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public k3(fh0 fh0Var) {
        this.b = new ee0(30);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = 0;
        this.e = fh0Var;
        this.f = new sb0(this);
    }

    @Override // defpackage.hs0
    public void a(byte[] bArr, int i, int i2) {
        this.e = new SecretKeySpec(bArr, i, i2, (String) this.d);
    }

    @Override // defpackage.hs0
    public void b(byte[] bArr, int i, int i2) {
        if (((byte[]) this.f) == null) {
            byte[] bArr2 = ht0.a;
            int i3 = (i2 + i) - i;
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, i, bArr3, 0, i3);
            this.f = bArr3;
            return;
        }
        c.o("unexpected reinitialization of an implicit-IV cipher");
    }

    @Override // defpackage.hs0
    public int c() {
        return ((Cipher) this.c).getBlockSize();
    }

    @Override // defpackage.hs0
    public int d(int i, byte[] bArr, byte[] bArr2) {
        Cipher cipher;
        int i2 = this.a;
        Object obj = this.c;
        Cipher cipher2 = (Cipher) obj;
        try {
            cipher2.init(i2, (SecretKeySpec) this.e, new IvParameterSpec((byte[]) this.f), (SecureRandom) ((rd) this.b).d);
            this.f = null;
            if (1 != i2) {
                int i3 = 5 + i;
                int blockSize = i3 - cipher2.getBlockSize();
                byte[] bArr3 = ht0.a;
                int i4 = i3 - blockSize;
                byte[] bArr4 = new byte[i4];
                System.arraycopy(bArr, blockSize, bArr4, 0, i4);
                this.f = bArr4;
            }
            int i5 = i;
            int i6 = 0;
            int i7 = 5;
            while (true) {
                cipher = (Cipher) obj;
                if (i5 <= 32768) {
                    break;
                }
                i6 += cipher.update(bArr, i7, 32768, bArr2, 5 + i6);
                i7 += 32768;
                i5 -= 32768;
            }
            int update = i6 + cipher.update(bArr, i7, i5, bArr2, 5 + i6);
            int doFinal = update + cipher2.doFinal(bArr2, 5 + update);
            if (1 == i2) {
                int i8 = 5 + doFinal;
                int blockSize2 = i8 - cipher2.getBlockSize();
                byte[] bArr5 = ht0.a;
                int i9 = i8 - blockSize2;
                byte[] bArr6 = new byte[i9];
                System.arraycopy(bArr2, blockSize2, bArr6, 0, i9);
                this.f = bArr6;
            }
            return doFinal;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    public void e() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((as0) this.d) != null) {
                if (((as0) this.f) == null) {
                    this.f = new Object();
                }
                as0 as0Var = (as0) this.f;
                as0Var.e = null;
                as0Var.d = false;
                as0Var.f = null;
                as0Var.c = false;
                WeakHashMap weakHashMap = ry0.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    as0Var.d = true;
                    as0Var.e = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    as0Var.c = true;
                    as0Var.f = backgroundTintMode;
                }
                if (as0Var.d || as0Var.c) {
                    j6.e(background, as0Var, view.getDrawableState());
                    return;
                }
            }
            as0 as0Var2 = (as0) this.e;
            if (as0Var2 != null) {
                j6.e(background, as0Var2, view.getDrawableState());
                return;
            }
            as0 as0Var3 = (as0) this.d;
            if (as0Var3 != null) {
                j6.e(background, as0Var3, view.getDrawableState());
            }
        }
    }

    public boolean f(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            j3 j3Var = (j3) arrayList.get(i2);
            int i3 = j3Var.a;
            if (i3 == 8) {
                if (k(j3Var.d, i2 + 1) == i) {
                    return true;
                }
            } else {
                if (i3 == 1) {
                    int i4 = j3Var.b;
                    int i5 = j3Var.d + i4;
                    while (i4 < i5) {
                        if (k(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public void g() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((fh0) this.e).a((j3) arrayList.get(i));
        }
        u(arrayList);
        this.a = 0;
    }

    public void h() {
        fh0 fh0Var = (fh0) this.e;
        g();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j3 j3Var = (j3) arrayList.get(i);
            int i2 = j3Var.a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            fh0Var.a(j3Var);
                            fh0Var.e(j3Var.b, j3Var.d);
                        }
                    } else {
                        fh0Var.a(j3Var);
                        fh0Var.c(j3Var.b, j3Var.d, j3Var.c);
                    }
                } else {
                    fh0Var.a(j3Var);
                    int i3 = j3Var.b;
                    int i4 = j3Var.d;
                    RecyclerView recyclerView = fh0Var.a;
                    recyclerView.O(i3, i4, true);
                    recyclerView.k0 = true;
                    recyclerView.h0.c += i4;
                }
            } else {
                fh0Var.a(j3Var);
                fh0Var.d(j3Var.b, j3Var.d);
            }
        }
        u(arrayList);
        this.a = 0;
    }

    public void i(j3 j3Var) {
        int i;
        ee0 ee0Var = (ee0) this.b;
        int i2 = j3Var.a;
        if (i2 != 1 && i2 != 8) {
            int y = y(j3Var.b, i2);
            int i3 = j3Var.b;
            int i4 = j3Var.a;
            if (i4 != 2) {
                if (i4 == 4) {
                    i = 1;
                } else {
                    c.r(j3Var, "op should be remove or update.");
                    return;
                }
            } else {
                i = 0;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < j3Var.d; i6++) {
                int y2 = y((i * i6) + j3Var.b, j3Var.a);
                int i7 = j3Var.a;
                if (i7 == 2 ? y2 == y : !(i7 != 4 || y2 != y + 1)) {
                    i5++;
                } else {
                    j3 p = p(j3Var.c, i7, y, i5);
                    j(p, i3);
                    p.c = null;
                    ee0Var.c(p);
                    if (j3Var.a == 4) {
                        i3 += i5;
                    }
                    i5 = 1;
                    y = y2;
                }
            }
            Object obj = j3Var.c;
            j3Var.c = null;
            ee0Var.c(j3Var);
            if (i5 > 0) {
                j3 p2 = p(obj, j3Var.a, y, i5);
                j(p2, i3);
                p2.c = null;
                ee0Var.c(p2);
                return;
            }
            return;
        }
        c.k("should not dispatch add or move for pre layout");
    }

    public void j(j3 j3Var, int i) {
        fh0 fh0Var = (fh0) this.e;
        fh0Var.a(j3Var);
        int i2 = j3Var.a;
        if (i2 != 2) {
            if (i2 == 4) {
                fh0Var.c(i, j3Var.d, j3Var.c);
                return;
            } else {
                c.k("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = j3Var.d;
        RecyclerView recyclerView = fh0Var.a;
        recyclerView.O(i, i3, true);
        recyclerView.k0 = true;
        recyclerView.h0.c += i3;
    }

    public int k(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            j3 j3Var = (j3) arrayList.get(i2);
            int i3 = j3Var.a;
            int i4 = j3Var.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = j3Var.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (j3Var.d <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = j3Var.d;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += j3Var.d;
            }
            i2++;
        }
        return i;
    }

    public ColorStateList l() {
        as0 as0Var = (as0) this.e;
        if (as0Var != null) {
            return (ColorStateList) as0Var.e;
        }
        return null;
    }

    public PorterDuff.Mode m() {
        as0 as0Var = (as0) this.e;
        if (as0Var != null) {
            return (PorterDuff.Mode) as0Var.f;
        }
        return null;
    }

    public boolean n() {
        if (((ArrayList) this.c).size() > 0) {
            return true;
        }
        return false;
    }

    public void o(AttributeSet attributeSet, int i) {
        ColorStateList f;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = ng0.z;
        b8 J = b8.J(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) J.d;
        View view2 = (View) this.b;
        ry0.l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) J.d, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                j6 j6Var = (j6) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (j6Var) {
                    f = j6Var.a.f(context2, i2);
                }
                if (f != null) {
                    v(f);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(J.y(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(lr.c(typedArray.getInt(2, -1), null));
            }
            J.N();
        } catch (Throwable th) {
            J.N();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [j3, java.lang.Object] */
    public j3 p(Object obj, int i, int i2, int i3) {
        j3 j3Var = (j3) ((ee0) this.b).a();
        if (j3Var == null) {
            ?? obj2 = new Object();
            obj2.a = i;
            obj2.b = i2;
            obj2.d = i3;
            obj2.c = obj;
            return obj2;
        }
        j3Var.a = i;
        j3Var.b = i2;
        j3Var.d = i3;
        j3Var.c = obj;
        return j3Var;
    }

    public void q() {
        this.a = -1;
        v(null);
        e();
    }

    public void r(int i) {
        ColorStateList colorStateList;
        this.a = i;
        j6 j6Var = (j6) this.c;
        if (j6Var != null) {
            Context context = ((View) this.b).getContext();
            synchronized (j6Var) {
                colorStateList = j6Var.a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        v(colorStateList);
        e();
    }

    public void s(j3 j3Var) {
        fh0 fh0Var = (fh0) this.e;
        ((ArrayList) this.d).add(j3Var);
        int i = j3Var.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        fh0Var.e(j3Var.b, j3Var.d);
                        return;
                    } else {
                        c.r(j3Var, "Unknown update op type for ");
                        return;
                    }
                }
                fh0Var.c(j3Var.b, j3Var.d, j3Var.c);
                return;
            }
            int i2 = j3Var.b;
            int i3 = j3Var.d;
            RecyclerView recyclerView = fh0Var.a;
            recyclerView.O(i2, i3, false);
            recyclerView.k0 = true;
            return;
        }
        fh0Var.d(j3Var.b, j3Var.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0125 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t() {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k3.t():void");
    }

    public void u(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j3 j3Var = (j3) arrayList.get(i);
            j3Var.c = null;
            ((ee0) this.b).c(j3Var);
        }
        arrayList.clear();
    }

    public void v(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((as0) this.d) == null) {
                this.d = new Object();
            }
            as0 as0Var = (as0) this.d;
            as0Var.e = colorStateList;
            as0Var.d = true;
        } else {
            this.d = null;
        }
        e();
    }

    public void w(ColorStateList colorStateList) {
        if (((as0) this.e) == null) {
            this.e = new Object();
        }
        as0 as0Var = (as0) this.e;
        as0Var.e = colorStateList;
        as0Var.d = true;
        e();
    }

    public void x(PorterDuff.Mode mode) {
        if (((as0) this.e) == null) {
            this.e = new Object();
        }
        as0 as0Var = (as0) this.e;
        as0Var.f = mode;
        as0Var.c = true;
        e();
    }

    public int y(int i, int i2) {
        int i3;
        int i4;
        ee0 ee0Var = (ee0) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j3 j3Var = (j3) arrayList.get(size);
            int i5 = j3Var.a;
            int i6 = j3Var.b;
            if (i5 == 8) {
                int i7 = j3Var.d;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i >= i3 && i <= i4) {
                    if (i3 == i6) {
                        if (i2 == 1) {
                            j3Var.d = i7 + 1;
                        } else if (i2 == 2) {
                            j3Var.d = i7 - 1;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            j3Var.b = i6 + 1;
                        } else if (i2 == 2) {
                            j3Var.b = i6 - 1;
                        }
                        i--;
                    }
                } else if (i < i6) {
                    if (i2 == 1) {
                        j3Var.b = i6 + 1;
                        j3Var.d = i7 + 1;
                    } else if (i2 == 2) {
                        j3Var.b = i6 - 1;
                        j3Var.d = i7 - 1;
                    }
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= j3Var.d;
                } else if (i5 == 2) {
                    i += j3Var.d;
                }
            } else if (i2 == 1) {
                j3Var.b = i6 + 1;
            } else if (i2 == 2) {
                j3Var.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            j3 j3Var2 = (j3) arrayList.get(size2);
            int i8 = j3Var2.a;
            int i9 = j3Var2.d;
            if (i8 == 8) {
                if (i9 == j3Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    j3Var2.c = null;
                    ee0Var.c(j3Var2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                j3Var2.c = null;
                ee0Var.c(j3Var2);
            }
        }
        return i;
    }

    public k3(xf0 xf0Var, byte[] bArr, byte[] bArr2, int[] iArr, Hashtable hashtable, int i) {
        this.b = xf0Var;
        this.c = bArr;
        this.d = bArr2;
        this.e = iArr;
        this.f = hashtable;
        this.a = i;
    }

    public k3(View view) {
        this.a = -1;
        this.b = view;
        this.c = j6.a();
    }

    public k3(rd rdVar, Cipher cipher, String str, boolean z) {
        this.b = rdVar;
        this.c = cipher;
        this.d = str;
        this.a = z ? 1 : 2;
    }
}
