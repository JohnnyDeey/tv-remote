package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.SignatureException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class r21 {
    public static Method h;
    public static boolean i;
    public static final ce a = new ce("RESUME_TOKEN", 2);
    public static final gd b = new Object();
    public static final g00 c = new g00(9);
    public static final int[] d = {R.attr.theme, svarzee.android.apps.adb_mouse.R.attr.theme};
    public static final int[] e = {svarzee.android.apps.adb_mouse.R.attr.materialThemeOverlay};
    public static final boolean[] f = new boolean[3];
    public static final Object g = new Object();
    public static final byte[] j = {116, 108, 115, 49, 51, 32};

    public static i30 A(int i2, int i3, i30 i30Var, String str, byte[] bArr) {
        int length = str.length();
        if (length >= 1) {
            int length2 = bArr.length;
            byte[] bArr2 = j;
            int i4 = 6 + length;
            int i5 = length + 9;
            int i6 = length2 + 1 + i5;
            byte[] bArr3 = new byte[i6];
            ht0.g(i3);
            ht0.a0(bArr3, i3, 0);
            ht0.h(i4);
            bArr3[2] = (byte) i4;
            System.arraycopy(bArr2, 0, bArr3, 3, 6);
            for (int i7 = 0; i7 < length; i7++) {
                bArr3[9 + i7] = (byte) str.charAt(i7);
            }
            ht0.h(bArr.length);
            bArr3[i5] = (byte) bArr.length;
            System.arraycopy(bArr, 0, bArr3, length + 10, bArr.length);
            synchronized (i30Var) {
                if (i3 < 1) {
                    rd rdVar = i30Var.b;
                    byte[] bArr4 = ht0.e;
                    rdVar.getClass();
                    return new i30(rdVar, bArr4);
                }
                int u = u(i2);
                if (i3 <= u * 255) {
                    i30Var.a();
                    byte[] bArr5 = i30Var.a;
                    try {
                        i30Var.b.getClass();
                        String y = rd.y(i2);
                        Mac l = ((sb0) i30Var.b.c).l(y);
                        l.init(new SecretKeySpec(bArr5, 0, bArr5.length, y));
                        byte[] bArr6 = new byte[i3];
                        byte[] bArr7 = new byte[u];
                        byte b2 = 0;
                        int i8 = 0;
                        while (true) {
                            l.update(bArr3, 0, i6);
                            b2 = (byte) (b2 + 1);
                            l.update(b2);
                            l.doFinal(bArr7, 0);
                            int i9 = i3 - i8;
                            if (i9 <= u) {
                                System.arraycopy(bArr7, 0, bArr6, i8, i9);
                                rd rdVar2 = i30Var.b;
                                rdVar2.getClass();
                                return new i30(rdVar2, bArr6);
                            }
                            System.arraycopy(bArr7, 0, bArr6, i8, u);
                            i8 += u;
                            l.update(bArr7, 0, u);
                        }
                    } catch (GeneralSecurityException e2) {
                        throw new RuntimeException(e2);
                    }
                } else {
                    throw new IllegalArgumentException("'length' must be <= 255 * (output size of 'hashAlgorithm')");
                }
            }
        } else {
            throw new us0((short) 80, null, null);
        }
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, gd] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, gd] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, gd] */
    public static void B(int i2, rj rjVar, ak akVar, boolean z) {
        boolean z2;
        mj mjVar;
        mj mjVar2;
        boolean z3;
        boolean z4;
        mj mjVar3;
        mj mjVar4;
        if (!akVar.m) {
            if (!(akVar instanceof bk) && akVar.z() && d(akVar)) {
                bk.V(akVar, rjVar, new Object());
            }
            mj i3 = akVar.i(2);
            mj i4 = akVar.i(4);
            int d2 = i3.d();
            int d3 = i4.d();
            HashSet hashSet = i3.a;
            if (hashSet != null && i3.c) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    mj mjVar5 = (mj) it.next();
                    ak akVar2 = mjVar5.d;
                    int i5 = i2 + 1;
                    boolean d4 = d(akVar2);
                    mj mjVar6 = akVar2.I;
                    mj mjVar7 = akVar2.K;
                    if (akVar2.z() && d4) {
                        z3 = true;
                        bk.V(akVar2, rjVar, new Object());
                    } else {
                        z3 = true;
                    }
                    if ((mjVar5 == mjVar6 && (mjVar4 = mjVar7.f) != null && mjVar4.c) || (mjVar5 == mjVar7 && (mjVar3 = mjVar6.f) != null && mjVar3.c)) {
                        z4 = z3;
                    } else {
                        z4 = false;
                    }
                    int i6 = akVar2.p0[0];
                    if (i6 == 3 && !d4) {
                        if (i6 == 3 && akVar2.v >= 0 && akVar2.u >= 0 && (akVar2.g0 == 8 || (akVar2.r == 0 && akVar2.W == 0.0f))) {
                            if (!akVar2.x() && !akVar2.F && z4 && !akVar2.x()) {
                                K(i5, akVar, rjVar, akVar2, z);
                            }
                        }
                    } else if (!akVar2.z()) {
                        if (mjVar5 == mjVar6 && mjVar7.f == null) {
                            int e2 = mjVar6.e() + d2;
                            akVar2.J(e2, akVar2.q() + e2);
                            B(i5, rjVar, akVar2, z);
                        } else if (mjVar5 == mjVar7 && mjVar6.f == null) {
                            int e3 = d2 - mjVar7.e();
                            akVar2.J(e3 - akVar2.q(), e3);
                            B(i5, rjVar, akVar2, z);
                        } else if (z4 && !akVar2.x()) {
                            J(i5, rjVar, akVar2, z);
                        }
                    }
                }
            }
            if (akVar instanceof p00) {
                return;
            }
            HashSet hashSet2 = i4.a;
            if (hashSet2 != null && i4.c) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    mj mjVar8 = (mj) it2.next();
                    ak akVar3 = mjVar8.d;
                    int i7 = i2 + 1;
                    boolean d5 = d(akVar3);
                    mj mjVar9 = akVar3.I;
                    mj mjVar10 = akVar3.K;
                    if (akVar3.z() && d5) {
                        bk.V(akVar3, rjVar, new Object());
                    }
                    if ((mjVar8 == mjVar9 && (mjVar2 = mjVar10.f) != null && mjVar2.c) || (mjVar8 == mjVar10 && (mjVar = mjVar9.f) != null && mjVar.c)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i8 = akVar3.p0[0];
                    if (i8 == 3 && !d5) {
                        if (i8 == 3 && akVar3.v >= 0 && akVar3.u >= 0) {
                            if (akVar3.g0 == 8 || (akVar3.r == 0 && akVar3.W == 0.0f)) {
                                if (!akVar3.x() && !akVar3.F && z2 && !akVar3.x()) {
                                    K(i7, akVar, rjVar, akVar3, z);
                                }
                            }
                        }
                    } else if (!akVar3.z()) {
                        if (mjVar8 == mjVar9 && mjVar10.f == null) {
                            int e4 = mjVar9.e() + d3;
                            akVar3.J(e4, akVar3.q() + e4);
                            B(i7, rjVar, akVar3, z);
                        } else if (mjVar8 == mjVar10 && mjVar9.f == null) {
                            int e5 = d3 - mjVar10.e();
                            akVar3.J(e5 - akVar3.q(), e5);
                            B(i7, rjVar, akVar3, z);
                        } else if (z2 && !akVar3.x()) {
                            J(i7, rjVar, akVar3, z);
                        }
                    }
                }
            }
            akVar.m = true;
        }
    }

    public static ru C(String str, SignatureException signatureException) {
        return new ru(str + "-" + signatureException.getMessage(), signatureException);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [m0, mp0] */
    public static mp0 D(ll llVar, y00 y00Var, zy zyVar, int i2) {
        dl dlVar = y00Var;
        if ((i2 & 1) != 0) {
            dlVar = st.c;
        }
        dl n = n(llVar.b(), dlVar, true);
        ho hoVar = yq.a;
        if (n != hoVar && n.h(g00.e) == null) {
            n = n.g(hoVar);
        }
        ?? m0Var = new m0(n, true);
        m0Var.T(ol.c, m0Var, zyVar);
        return m0Var;
    }

    public static float E(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static float F(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ns.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static void G(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static final void H(ff ffVar, qk qkVar, boolean z) {
        Object h2;
        kw0 kw0Var;
        Object obj = ff.i.get(ffVar);
        Throwable g2 = ffVar.g(obj);
        if (g2 != null) {
            h2 = new sj0(g2);
        } else {
            h2 = ffVar.h(obj);
        }
        if (z) {
            qkVar.getClass();
            vq vqVar = (vq) qkVar;
            rk rkVar = vqVar.g;
            Object obj2 = vqVar.i;
            dl d2 = rkVar.d();
            Object c0 = wv0.c0(d2, obj2);
            if (c0 != wv0.n) {
                kw0Var = O(rkVar, d2, c0);
            } else {
                kw0Var = null;
            }
            try {
                rkVar.e(h2);
                if (kw0Var != null && !kw0Var.U()) {
                    return;
                }
                wv0.W(d2, c0);
                return;
            } catch (Throwable th) {
                if (kw0Var == null || kw0Var.U()) {
                    wv0.W(d2, c0);
                }
                throw th;
            }
        }
        qkVar.e(h2);
    }

    public static void I(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = false;
        int i2 = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (hasOnClickListeners || z) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i2 = 2;
        }
        checkableImageButton.setImportantForAccessibility(i2);
    }

    public static void J(int i2, rj rjVar, ak akVar, boolean z) {
        float f2;
        float f3 = akVar.d0;
        mj mjVar = akVar.I;
        int d2 = mjVar.f.d();
        mj mjVar2 = akVar.K;
        int d3 = mjVar2.f.d();
        int e2 = mjVar.e() + d2;
        int e3 = d3 - mjVar2.e();
        if (d2 == d3) {
            f3 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int q = akVar.q();
        int i3 = (d3 - d2) - q;
        if (d2 > d3) {
            i3 = (d2 - d3) - q;
        }
        if (i3 > 0) {
            f2 = (f3 * i3) + 0.5f;
        } else {
            f2 = f3 * i3;
        }
        int i4 = ((int) f2) + d2;
        int i5 = i4 + q;
        if (d2 > d3) {
            i5 = i4 - q;
        }
        akVar.J(i4, i5);
        B(i2 + 1, rjVar, akVar, z);
    }

    public static void K(int i2, ak akVar, rj rjVar, ak akVar2, boolean z) {
        int q;
        float f2 = akVar2.d0;
        mj mjVar = akVar2.I;
        int e2 = mjVar.e() + mjVar.f.d();
        mj mjVar2 = akVar2.K;
        int d2 = mjVar2.f.d() - mjVar2.e();
        if (d2 >= e2) {
            int q2 = akVar2.q();
            if (akVar2.g0 != 8) {
                int i3 = akVar2.r;
                if (i3 == 2) {
                    if (akVar instanceof bk) {
                        q = akVar.q();
                    } else {
                        q = akVar.T.q();
                    }
                    q2 = (int) (akVar2.d0 * 0.5f * q);
                } else if (i3 == 0) {
                    q2 = d2 - e2;
                }
                q2 = Math.max(akVar2.u, q2);
                int i4 = akVar2.v;
                if (i4 > 0) {
                    q2 = Math.min(i4, q2);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - q2)) + 0.5f));
            akVar2.J(i5, q2 + i5);
            B(i2 + 1, rjVar, akVar2, z);
        }
    }

    public static void L(int i2, rj rjVar, ak akVar) {
        float f2;
        float f3 = akVar.e0;
        mj mjVar = akVar.J;
        int d2 = mjVar.f.d();
        mj mjVar2 = akVar.L;
        int d3 = mjVar2.f.d();
        int e2 = mjVar.e() + d2;
        int e3 = d3 - mjVar2.e();
        if (d2 == d3) {
            f3 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int k = akVar.k();
        int i3 = (d3 - d2) - k;
        if (d2 > d3) {
            i3 = (d2 - d3) - k;
        }
        if (i3 > 0) {
            f2 = (f3 * i3) + 0.5f;
        } else {
            f2 = f3 * i3;
        }
        int i4 = (int) f2;
        int i5 = d2 + i4;
        int i6 = i5 + k;
        if (d2 > d3) {
            i5 = d2 - i4;
            i6 = i5 - k;
        }
        akVar.K(i5, i6);
        P(i2 + 1, rjVar, akVar);
    }

    public static void M(int i2, ak akVar, rj rjVar, ak akVar2) {
        int k;
        float f2 = akVar2.e0;
        mj mjVar = akVar2.J;
        int e2 = mjVar.e() + mjVar.f.d();
        mj mjVar2 = akVar2.L;
        int d2 = mjVar2.f.d() - mjVar2.e();
        if (d2 >= e2) {
            int k2 = akVar2.k();
            if (akVar2.g0 != 8) {
                int i3 = akVar2.s;
                if (i3 == 2) {
                    if (akVar instanceof bk) {
                        k = akVar.k();
                    } else {
                        k = akVar.T.k();
                    }
                    k2 = (int) (f2 * 0.5f * k);
                } else if (i3 == 0) {
                    k2 = d2 - e2;
                }
                k2 = Math.max(akVar2.x, k2);
                int i4 = akVar2.y;
                if (i4 > 0) {
                    k2 = Math.min(i4, k2);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - k2)) + 0.5f));
            akVar2.K(i5, k2 + i5);
            P(i2 + 1, rjVar, akVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if ((r2 instanceof defpackage.kw0) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        r0 = (defpackage.kw0) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        r0.V(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.h(defpackage.lw0.c) == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if ((r2 instanceof defpackage.wq) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        r2 = r2.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r2 != 0) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [rk] */
    /* JADX WARN: Type inference failed for: r2v1, types: [nl] */
    /* JADX WARN: Type inference failed for: r2v2, types: [nl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.kw0 O(defpackage.rk r2, defpackage.dl r3, java.lang.Object r4) {
        /*
            r0 = 0
            if (r2 != 0) goto L4
            goto L24
        L4:
            lw0 r1 = defpackage.lw0.c
            bl r1 = r3.h(r1)
            if (r1 == 0) goto L24
        Lc:
            boolean r1 = r2 instanceof defpackage.wq
            if (r1 == 0) goto L11
            goto L1f
        L11:
            nl r2 = r2.c()
            if (r2 != 0) goto L18
            goto L1f
        L18:
            boolean r1 = r2 instanceof defpackage.kw0
            if (r1 == 0) goto Lc
            r0 = r2
            kw0 r0 = (defpackage.kw0) r0
        L1f:
            if (r0 == 0) goto L24
            r0.V(r3, r4)
        L24:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r21.O(rk, dl, java.lang.Object):kw0");
    }

    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, gd] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, gd] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, gd] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, gd] */
    public static void P(int i2, rj rjVar, ak akVar) {
        boolean z;
        boolean z2;
        mj mjVar;
        mj mjVar2;
        boolean z3;
        mj mjVar3;
        mj mjVar4;
        if (!akVar.n) {
            if (!(akVar instanceof bk) && akVar.z() && d(akVar)) {
                bk.V(akVar, rjVar, new Object());
            }
            mj i3 = akVar.i(3);
            mj i4 = akVar.i(5);
            int d2 = i3.d();
            int d3 = i4.d();
            HashSet hashSet = i3.a;
            if (hashSet != null && i3.c) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    mj mjVar5 = (mj) it.next();
                    ak akVar2 = mjVar5.d;
                    int i5 = i2 + 1;
                    boolean d4 = d(akVar2);
                    mj mjVar6 = akVar2.J;
                    mj mjVar7 = akVar2.L;
                    if (akVar2.z() && d4) {
                        bk.V(akVar2, rjVar, new Object());
                    }
                    if ((mjVar5 == mjVar6 && (mjVar4 = mjVar7.f) != null && mjVar4.c) || (mjVar5 == mjVar7 && (mjVar3 = mjVar6.f) != null && mjVar3.c)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i6 = akVar2.p0[1];
                    if (i6 == 3 && !d4) {
                        if (i6 == 3 && akVar2.y >= 0 && akVar2.x >= 0 && (akVar2.g0 == 8 || (akVar2.s == 0 && akVar2.W == 0.0f))) {
                            if (!akVar2.y() && !akVar2.F && z3 && !akVar2.y()) {
                                M(i5, akVar, rjVar, akVar2);
                            }
                        }
                    } else if (!akVar2.z()) {
                        if (mjVar5 == mjVar6 && mjVar7.f == null) {
                            int e2 = mjVar6.e() + d2;
                            akVar2.K(e2, akVar2.k() + e2);
                            P(i5, rjVar, akVar2);
                        } else if (mjVar5 == mjVar7 && mjVar6.f == null) {
                            int e3 = d2 - mjVar7.e();
                            akVar2.K(e3 - akVar2.k(), e3);
                            P(i5, rjVar, akVar2);
                        } else if (z3 && !akVar2.y()) {
                            L(i5, rjVar, akVar2);
                        }
                    }
                }
            }
            boolean z4 = true;
            z4 = true;
            z4 = true;
            if (akVar instanceof p00) {
                return;
            }
            HashSet hashSet2 = i4.a;
            if (hashSet2 != null && i4.c) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    mj mjVar8 = (mj) it2.next();
                    ak akVar3 = mjVar8.d;
                    int i7 = i2 + 1;
                    boolean d5 = d(akVar3);
                    mj mjVar9 = akVar3.J;
                    mj mjVar10 = akVar3.L;
                    if (akVar3.z() && d5) {
                        bk.V(akVar3, rjVar, new Object());
                    }
                    if ((mjVar8 == mjVar9 && (mjVar2 = mjVar10.f) != null && mjVar2.c) || (mjVar8 == mjVar10 && (mjVar = mjVar9.f) != null && mjVar.c)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i8 = akVar3.p0[1];
                    if (i8 == 3 && !d5) {
                        if (i8 == 3 && akVar3.y >= 0 && akVar3.x >= 0 && (akVar3.g0 == 8 || (akVar3.s == 0 && akVar3.W == 0.0f))) {
                            if (!akVar3.y() && !akVar3.F && z2 && !akVar3.y()) {
                                M(i7, akVar, rjVar, akVar3);
                            }
                        }
                    } else if (!akVar3.z()) {
                        if (mjVar8 == mjVar9 && mjVar10.f == null) {
                            int e4 = mjVar9.e() + d3;
                            akVar3.K(e4, akVar3.k() + e4);
                            P(i7, rjVar, akVar3);
                        } else if (mjVar8 == mjVar10 && mjVar9.f == null) {
                            int e5 = d3 - mjVar10.e();
                            akVar3.K(e5 - akVar3.k(), e5);
                            P(i7, rjVar, akVar3);
                        } else if (z2 && !akVar3.y()) {
                            L(i7, rjVar, akVar3);
                        }
                    }
                }
            }
            mj i9 = akVar.i(6);
            if (i9.a != null && i9.c) {
                int d6 = i9.d();
                Iterator it3 = i9.a.iterator();
                while (it3.hasNext()) {
                    mj mjVar11 = (mj) it3.next();
                    ak akVar4 = mjVar11.d;
                    int i10 = i2 + 1;
                    boolean d7 = d(akVar4);
                    mj mjVar12 = akVar4.M;
                    if (akVar4.z() && d7) {
                        bk.V(akVar4, rjVar, new Object());
                    }
                    if (akVar4.p0[z4 ? 1 : 0] != 3 || d7) {
                        if (!akVar4.z()) {
                            if (mjVar11 == mjVar12) {
                                int e6 = mjVar11.e() + d6;
                                if (!akVar4.E) {
                                    z = z4 ? 1 : 0;
                                } else {
                                    int i11 = e6 - akVar4.a0;
                                    int i12 = akVar4.V + i11;
                                    akVar4.Z = i11;
                                    akVar4.J.l(i11);
                                    akVar4.L.l(i12);
                                    mjVar12.l(e6);
                                    z = z4 ? 1 : 0;
                                    akVar4.l = z;
                                }
                                P(i10, rjVar, akVar4);
                                z4 = z;
                            }
                        }
                    }
                    z = z4 ? 1 : 0;
                    z4 = z;
                }
            }
            akVar.n = z4;
        }
    }

    public static Context Q(Context context, AttributeSet attributeSet, int i2, int i3) {
        return R(context, attributeSet, i2, i3, new int[0]);
    }

    public static Context R(Context context, AttributeSet attributeSet, int i2, int i3, int[] iArr) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e, i2, i3);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i4 = iArr2[0];
        if ((context instanceof pk) && ((pk) context).a == i4) {
            z = true;
        } else {
            z = false;
        }
        if (i4 != 0 && !z) {
            pk pkVar = new pk(context, i4);
            int length = iArr.length;
            int[] iArr3 = new int[length];
            if (iArr.length > 0) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    iArr3[i5] = obtainStyledAttributes2.getResourceId(i5, 0);
                }
                obtainStyledAttributes2.recycle();
            }
            for (int i6 = 0; i6 < length; i6++) {
                int i7 = iArr3[i6];
                if (i7 != 0) {
                    pkVar.getTheme().applyStyle(i7, true);
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, d);
            int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
            obtainStyledAttributes3.recycle();
            if (resourceId == 0) {
                resourceId = resourceId2;
            }
            if (resourceId != 0) {
                pkVar.getTheme().applyStyle(resourceId, true);
            }
            return pkVar;
        }
        return context;
    }

    public static he a(int i2, int i3) {
        if (i2 != -2) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != Integer.MAX_VALUE) {
                        return new he(i2);
                    }
                    return new he(Integer.MAX_VALUE);
                }
                return new he(0);
            }
            return new ij(1, fe.d);
        }
        hg.a.getClass();
        return new he(gg.b);
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            } else {
                drawable.setTintList(colorStateList);
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static String c(String str, int i2, int i3) {
        if (i2 < 0) {
            return mi0.G("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return mi0.G("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        c.k(qo0.m("negative size: ", i3));
        return null;
    }

    public static boolean d(ak akVar) {
        bk bkVar;
        boolean z;
        boolean z2;
        int[] iArr = akVar.p0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        ak akVar2 = akVar.T;
        if (akVar2 != null) {
            bkVar = (bk) akVar2;
        } else {
            bkVar = null;
        }
        if (bkVar != null) {
            int i4 = bkVar.p0[0];
        }
        if (bkVar != null) {
            int i5 = bkVar.p0[1];
        }
        if (i2 != 1 && !akVar.A() && i2 != 2 && ((i2 != 3 || akVar.r != 0 || akVar.W != 0.0f || !akVar.t(0)) && (i2 != 3 || akVar.r != 1 || !akVar.u(0, akVar.q())))) {
            z = false;
        } else {
            z = true;
        }
        if (i3 != 1 && !akVar.B() && i3 != 2 && ((i3 != 3 || akVar.s != 0 || akVar.W != 0.0f || !akVar.t(1)) && (i3 != 3 || akVar.s != 1 || !akVar.u(1, akVar.k())))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((akVar.W <= 0.0f || (!z && !z2)) && (!z || !z2)) {
            return false;
        }
        return true;
    }

    public static void e(bk bkVar, e60 e60Var, ak akVar) {
        akVar.o = -1;
        mj mjVar = akVar.M;
        int[] iArr = akVar.p0;
        mj mjVar2 = akVar.L;
        mj mjVar3 = akVar.J;
        mj mjVar4 = akVar.K;
        mj mjVar5 = akVar.I;
        akVar.p = -1;
        int[] iArr2 = bkVar.p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i2 = mjVar5.g;
            int q = bkVar.q() - mjVar4.g;
            mjVar5.i = e60Var.k(mjVar5);
            mjVar4.i = e60Var.k(mjVar4);
            e60Var.d(mjVar5.i, i2);
            e60Var.d(mjVar4.i, q);
            akVar.o = 2;
            akVar.Y = i2;
            int i3 = q - i2;
            akVar.U = i3;
            int i4 = akVar.b0;
            if (i3 < i4) {
                akVar.U = i4;
            }
        }
        if (iArr2[1] != 2 && iArr[1] == 4) {
            int i5 = mjVar3.g;
            int k = bkVar.k() - mjVar2.g;
            mjVar3.i = e60Var.k(mjVar3);
            mjVar2.i = e60Var.k(mjVar2);
            e60Var.d(mjVar3.i, i5);
            e60Var.d(mjVar2.i, k);
            if (akVar.a0 > 0 || akVar.g0 == 8) {
                ro0 k2 = e60Var.k(mjVar);
                mjVar.i = k2;
                e60Var.d(k2, akVar.a0 + i5);
            }
            akVar.p = 2;
            akVar.Z = i5;
            int i6 = k - i5;
            akVar.V = i6;
            int i7 = akVar.c0;
            if (i6 < i7) {
                akVar.V = i7;
            }
        }
    }

    public static void f(int i2, int i3, int i4) {
        String c2;
        if (i2 >= 0 && i3 >= i2 && i3 <= i4) {
            return;
        }
        if (i2 >= 0 && i2 <= i4) {
            if (i3 >= 0 && i3 <= i4) {
                c2 = mi0.G("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            } else {
                c2 = c("end index", i3, i4);
            }
        } else {
            c2 = c("start index", i2, i4);
        }
        throw new IndexOutOfBoundsException(c2);
    }

    public static void g(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            c.k(qo0.o("fromIndex: ", i2, " > toIndex: ", i3));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
    }

    public static ImageView.ScaleType h(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    public static float[] i(float[] fArr, int i2) {
        if (i2 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i2, length);
                float[] fArr2 = new float[i2];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [vj0] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r5v1, types: [pw, ws] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.pw j(android.content.Context r13) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            qn r0 = new qn
            r0.<init>()
            goto L11
        Lc:
            vj0 r0 = new vj0
            r0.<init>()
        L11:
            android.content.pm.PackageManager r1 = r13.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            defpackage.mn.k(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L46
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2a
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2a
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2a
            goto L47
        L46:
            r4 = r5
        L47:
            if (r4 != 0) goto L4b
        L49:
            r6 = r5
            goto L7c
        L4b:
            java.lang.String r7 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            java.lang.String r8 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            android.content.pm.Signature[] r0 = r0.d(r1, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            int r2 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
        L59:
            if (r3 >= r2) goto L67
            r4 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            byte[] r4 = r4.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            r1.add(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            int r3 = r3 + 1
            goto L59
        L67:
            java.util.List r10 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            nw r6 = new nw     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            java.lang.String r9 = "emojicompat-emoji-font"
            r11 = 0
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            goto L7c
        L75:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L49
        L7c:
            if (r6 != 0) goto L7f
            goto L89
        L7f:
            pw r5 = new pw
            ow r0 = new ow
            r0.<init>(r13, r6)
            r5.<init>(r0)
        L89:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r21.j(android.content.Context):pw");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x007a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.vd0[] k(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r21.k(java.lang.String):vd0[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r10 == r5) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x0057, B:20:0x006b, B:22:0x0073, B:32:0x0046, B:34:0x004d), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v2, types: [aw, rk, qk] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [xv] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ge] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r8v5, types: [hg] */
    /* JADX WARN: Type inference failed for: r8v6, types: [hg] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0085 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(defpackage.xv r7, defpackage.hf0 r8, boolean r9, defpackage.rk r10) {
        /*
            boolean r0 = r10 instanceof defpackage.aw
            if (r0 == 0) goto L13
            r0 = r10
            aw r0 = (defpackage.aw) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            aw r0 = new aw
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.j
            int r1 = r0.k
            r2 = 0
            r3 = 2
            r4 = 1
            ml r5 = defpackage.ml.c
            if (r1 == 0) goto L4a
            if (r1 == r4) goto L3e
            if (r1 != r3) goto L38
            boolean r9 = r0.i
            ge r7 = r0.h
            hg r8 = r0.g
            xv r1 = r0.f
            defpackage.hi0.p(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r6 = r1
            r1 = r7
            r7 = r6
            goto L57
        L36:
            r7 = move-exception
            goto L90
        L38:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.o(r7)
            return r2
        L3e:
            boolean r9 = r0.i
            ge r7 = r0.h
            hg r8 = r0.g
            xv r1 = r0.f
            defpackage.hi0.p(r10)     // Catch: java.lang.Throwable -> L36
            goto L6b
        L4a:
            defpackage.hi0.p(r10)
            he r10 = r8.f     // Catch: java.lang.Throwable -> L36
            r10.getClass()     // Catch: java.lang.Throwable -> L36
            ge r1 = new ge     // Catch: java.lang.Throwable -> L36
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L36
        L57:
            r0.f = r7     // Catch: java.lang.Throwable -> L36
            r0.g = r8     // Catch: java.lang.Throwable -> L36
            r0.h = r1     // Catch: java.lang.Throwable -> L36
            r0.i = r9     // Catch: java.lang.Throwable -> L36
            r0.k = r4     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.b(r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r5) goto L68
            goto L87
        L68:
            r6 = r1
            r1 = r7
            r7 = r6
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L36
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r10 == 0) goto L88
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L36
            r0.f = r1     // Catch: java.lang.Throwable -> L36
            r0.g = r8     // Catch: java.lang.Throwable -> L36
            r0.h = r7     // Catch: java.lang.Throwable -> L36
            r0.i = r9     // Catch: java.lang.Throwable -> L36
            r0.k = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.i(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r5) goto L32
        L87:
            return r5
        L88:
            if (r9 == 0) goto L8d
            r8.j(r2)
        L8d:
            nw0 r7 = defpackage.nw0.a
            return r7
        L90:
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r10 = move-exception
            if (r9 == 0) goto Laa
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L9b
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L9b:
            if (r2 != 0) goto La7
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r2.<init>(r9)
            r2.initCause(r7)
        La7:
            r8.j(r2)
        Laa:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r21.l(xv, hf0, boolean, rk):java.lang.Object");
    }

    public static final boolean m(int i2, int i3) {
        if ((i2 & i3) == i3) {
            return true;
        }
        return false;
    }

    public static final dl n(dl dlVar, dl dlVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i2 = 4;
        boolean booleanValue = ((Boolean) dlVar.f(bool, new pi(i2))).booleanValue();
        boolean booleanValue2 = ((Boolean) dlVar2.f(bool, new pi(i2))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return dlVar.g(dlVar2);
        }
        pi piVar = new pi(2);
        st stVar = st.c;
        dl dlVar3 = (dl) dlVar.f(stVar, piVar);
        Object obj = dlVar2;
        if (booleanValue2) {
            obj = dlVar2.f(stVar, new pi(3));
        }
        return dlVar3.g((dl) obj);
    }

    public static int[] o(int i2, BigInteger bigInteger) {
        if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= i2) {
            int i3 = (i2 + 31) >> 5;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = bigInteger.intValue();
                bigInteger = bigInteger.shiftRight(32);
            }
            return iArr;
        }
        throw new IllegalArgumentException();
    }

    public static String p(String str) {
        int indexOf = str.indexOf(45);
        if (indexOf > 0 && !str.startsWith("SHA3")) {
            return str.substring(0, indexOf).concat(str.substring(indexOf + 1));
        }
        return str;
    }

    public static float q(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ns.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable r(Context context, int i2) {
        return lj0.b().c(context, i2);
    }

    public static byte[] s(u8 u8Var) {
        if (!u8Var.c) {
            try {
                return wg0.h(u8Var).h();
            } catch (Exception unused) {
                return null;
            }
        }
        c.k("private key found");
        return null;
    }

    public static int t(int i2) {
        String str;
        switch (i2) {
            case 0:
            case 1:
                c.k("legacy PRF not a valid algorithm");
                return 0;
            case 2:
            case 4:
                return 4;
            case 3:
            case 5:
                return 5;
            case 6:
            default:
                StringBuilder sb = new StringBuilder();
                switch (i2) {
                    case 0:
                        str = "ssl_prf_legacy";
                        break;
                    case 1:
                        str = "tls_prf_legacy";
                        break;
                    case 2:
                        str = "tls_prf_sha256";
                        break;
                    case 3:
                        str = "tls_prf_sha384";
                        break;
                    case 4:
                        str = "tls13_hkdf_sha256";
                        break;
                    case 5:
                        str = "tls13_hkdf_sha384";
                        break;
                    case 6:
                    default:
                        str = "UNKNOWN";
                        break;
                    case 7:
                        str = "tls13_hkdf_sm3";
                        break;
                    case 8:
                        str = "tls_prf_gostr3411_2012_256";
                        break;
                }
                sb.append(str);
                sb.append("(");
                sb.append(i2);
                sb.append(")");
                throw new IllegalArgumentException("unknown PRFAlgorithm: ".concat(sb.toString()));
            case 7:
                return 7;
            case 8:
                return 8;
        }
    }

    public static int u(int i2) {
        switch (i2) {
            case 1:
                return 16;
            case 2:
                return 20;
            case 3:
                return 28;
            case 4:
            case 7:
            case 8:
                return 32;
            case 5:
                return 48;
            case 6:
                return 64;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static String v(go0 go0Var) {
        String str;
        StringBuilder sb = new StringBuilder();
        switch (go0Var.a) {
            case 0:
                str = "none";
                break;
            case 1:
                str = "md5";
                break;
            case 2:
                str = "sha1";
                break;
            case 3:
                str = "sha224";
                break;
            case 4:
                str = "sha256";
                break;
            case 5:
                str = "sha384";
                break;
            case 6:
                str = "sha512";
                break;
            case 7:
            default:
                str = "UNKNOWN";
                break;
            case 8:
                str = "Intrinsic";
                break;
        }
        sb.append(str);
        sb.append("WITH");
        sb.append(yp0.f(oi0.g(go0Var.b)));
        return sb.toString();
    }

    public static PSSParameterSpec w(String str, int i2) {
        return new PSSParameterSpec(str, "MGF1", new MGF1ParameterSpec(str), u(i2), 1);
    }

    public static String x(short s) {
        String str;
        StringBuilder sb = new StringBuilder();
        switch (s) {
            case 20:
                str = "change_cipher_spec";
                break;
            case 21:
                str = "alert";
                break;
            case 22:
                str = "handshake";
                break;
            case 23:
                str = "application_data";
                break;
            case 24:
                str = "heartbeat";
                break;
            case 25:
                str = "tls12_cid";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append((int) s);
        sb.append(")");
        return sb.toString();
    }

    public abstract s3 N();

    public abstract short y(short s);

    public abstract short z(short s, short s2);
}
