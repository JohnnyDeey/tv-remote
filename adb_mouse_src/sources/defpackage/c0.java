package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.WeakHashMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class c0 implements it0, ws0 {
    public final /* synthetic */ int c;
    public int d;
    public Object e;
    public Object f;

    public c0(rd rdVar, PublicKey publicKey, int i) {
        this.c = 4;
        if (rdVar != null) {
            if (publicKey != null) {
                switch (i) {
                    case 2052:
                    case 2053:
                    case 2054:
                    case 2057:
                    case 2058:
                    case 2059:
                        this.e = rdVar;
                        this.f = publicKey;
                        this.d = i;
                        return;
                    case 2055:
                    case 2056:
                    default:
                        c.k("signatureScheme");
                        throw null;
                }
            }
            c.g("publicKey");
            throw null;
        }
        c.g("crypto");
        throw null;
    }

    public static void f(c0 c0Var, c0 c0Var2, c0 c0Var3) {
        for (int i = 0; i < 64; i++) {
            int i2 = i * 4;
            short[] sArr = (short[]) c0Var2.e;
            short s = sArr[i2];
            int i3 = i2 + 1;
            short s2 = sArr[i3];
            short[] sArr2 = (short[]) c0Var3.e;
            short s3 = sArr2[i2];
            short s4 = sArr2[i3];
            short[] sArr3 = k20.p;
            int i4 = i + 64;
            k20.d(c0Var, i2, s, s2, s3, s4, sArr3[i4]);
            int i5 = i2 + 2;
            short[] sArr4 = (short[]) c0Var2.e;
            short s5 = sArr4[i5];
            int i6 = i2 + 3;
            short s6 = sArr4[i6];
            short[] sArr5 = (short[]) c0Var3.e;
            k20.d(c0Var, i5, s5, s6, sArr5[i5], sArr5[i6], (short) (sArr3[i4] * (-1)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        r0 = new defpackage.r6(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
    
        r16 = (int[]) r0.d;
        r17 = (float[]) r0.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0208, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x020a, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021f, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0268, code lost:
    
        return new defpackage.c0(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x021c, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0223, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.d, (float[]) r0.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0235, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0237, code lost:
    
        r20 = (int[]) r0.d;
        r21 = (float[]) r0.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0246, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0249, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x024b, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025c, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0256, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0270, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new defpackage.r6(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new defpackage.r6(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.c0 g(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c0.g(android.content.res.Resources, int, android.content.res.Resources$Theme):c0");
    }

    @Override // defpackage.ws0
    public void a(byte[] bArr, int i, int i2) {
        try {
            ((Mac) this.e).init(new SecretKeySpec(bArr, i, i2, (String) this.f));
        } catch (InvalidKeyException e) {
            c.k(e.getMessage());
        }
    }

    @Override // defpackage.ws0
    public int b() {
        return this.d;
    }

    @Override // defpackage.ws0
    public byte[] c() {
        return ((Mac) this.e).doFinal();
    }

    @Override // defpackage.ws0
    public int d() {
        return ((Mac) this.e).getMacLength();
    }

    public void e() {
        as0 as0Var;
        ImageView imageView = (ImageView) this.e;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            lr.a(drawable);
        }
        if (drawable != null && (as0Var = (as0) this.f) != null) {
            j6.e(drawable, as0Var, imageView.getDrawableState());
        }
    }

    public void h(byte[] bArr, byte b) {
        int i = this.d;
        int i2 = (i * 256) / 4;
        l3 l3Var = (l3) this.f;
        l3Var.getClass();
        int length = bArr.length + 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = b;
        ik0 ik0Var = (ik0) l3Var.f;
        ik0Var.update(bArr2, 0, length);
        ik0Var.k(new byte[i2], 0, i2);
        if (i != 3) {
            for (int i3 = 0; i3 < 32; i3++) {
                int i4 = i3 * 4;
                long j = (r5[i4] & 255) | ((r5[i4 + 1] & 255) << 8) | ((r5[i4 + 2] & 255) << 16) | ((r5[i4 + 3] & 255) << 24);
                long j2 = (j & 1431655765) + ((j >> 1) & 1431655765);
                for (int i5 = 0; i5 < 8; i5++) {
                    int i6 = i5 * 4;
                    ((short[]) this.e)[(i3 * 8) + i5] = (short) (((short) ((j2 >> i6) & 3)) - ((short) ((j2 >> (i6 + i)) & 3)));
                }
            }
            return;
        }
        for (int i7 = 0; i7 < 64; i7++) {
            int i8 = i7 * 3;
            long j3 = (r5[i8] & 255) | ((r5[i8 + 1] & 255) << 8) | ((r5[i8 + 2] & 255) << 16);
            long j4 = (j3 & 2396745) + ((j3 >> 1) & 2396745) + ((j3 >> 2) & 2396745);
            for (int i9 = 0; i9 < 4; i9++) {
                int i10 = i9 * 6;
                ((short[]) this.e)[(i7 * 4) + i9] = (short) (((short) ((j4 >> i10) & 7)) - ((short) ((j4 >> (i10 + 3)) & 7)));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i i(int i) {
        boolean z;
        byte[][] bArr = (byte[][]) this.f;
        int i2 = this.d;
        w50 w50Var = (w50) this.e;
        boolean z2 = false;
        Object[] objArr = 0;
        if (w50Var instanceof s10) {
            s10 s10Var = (s10) w50Var;
            s10Var.h = false;
            s10Var.b();
        }
        int g = n.g(i, w50Var);
        int i3 = 1;
        int i4 = 4;
        int i5 = 3;
        if (g != 3 && g != 4 && g != 16 && g != 17 && g != 8) {
            z = false;
        } else {
            z = true;
        }
        int e = n.e(w50Var, i2, z);
        if (e < 0) {
            if ((i & 32) != 0) {
                c0 c0Var = new c0(new s10(i2, w50Var), i2, bArr);
                int i6 = i & 192;
                if (i6 != 0) {
                    return new zb(i6, g, c0Var);
                }
                if (g != 3) {
                    if (g != 4) {
                        if (g != 8) {
                            if (g != 16) {
                                if (g == 17) {
                                    wb wbVar = new wb(i3);
                                    wbVar.d = c0Var;
                                    return wbVar;
                                }
                                c.f(Integer.toHexString(g), "unknown BER object encountered: 0x");
                                return null;
                            }
                            wb wbVar2 = new wb((int) (objArr == true ? 1 : 0));
                            wbVar2.d = c0Var;
                            return wbVar2;
                        }
                        return new wb(c0Var);
                    }
                    return new ub(c0Var);
                }
                return new rb(c0Var);
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        vo voVar = new vo(w50Var, e, i2);
        if ((i & 224) == 0) {
            if (g != 3) {
                if (g != 4) {
                    if (g != 8) {
                        if (g != 16) {
                            if (g != 17) {
                                try {
                                    return n.b(g, voVar, bArr);
                                } catch (IllegalArgumentException e2) {
                                    throw new l(e2, "corrupted stream detected");
                                }
                            }
                            throw new IOException("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
                        }
                        throw new IOException("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
                    }
                    throw new IOException("externals must use constructed encoding (see X.690 8.18)");
                }
                ub ubVar = new ub();
                ubVar.d = voVar;
                return ubVar;
            }
            return new an(voVar);
        }
        c0 c0Var2 = new c0(voVar, voVar.d, bArr);
        int i7 = i & 192;
        if (i7 != 0) {
            if ((i & 32) != 0) {
                z2 = true;
            }
            return new en(i7, g, z2, c0Var2);
        }
        if (g != 3) {
            if (g != 4) {
                if (g != 8) {
                    if (g != 16) {
                        if (g == 17) {
                            wb wbVar3 = new wb(i4);
                            wbVar3.d = c0Var2;
                            return wbVar3;
                        }
                        c.f(Integer.toHexString(g), "unknown DL object encountered: 0x");
                        return null;
                    }
                    wb wbVar4 = new wb(i5);
                    wbVar4.d = c0Var2;
                    return wbVar4;
                }
                return new wb(c0Var2);
            }
            return new ub(c0Var2);
        }
        return new rb(c0Var2);
    }

    public boolean j() {
        ColorStateList colorStateList;
        if (((Shader) this.e) == null && (colorStateList = (ColorStateList) this.f) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.it0
    public boolean k(r6 r6Var, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.it0
    public ft0 l(r6 r6Var) {
        rd rdVar = (rd) this.e;
        go0 go0Var = (go0) r6Var.d;
        if (go0Var != null) {
            int i = wg0.i(go0Var);
            int i2 = this.d;
            if (i == i2) {
                int m = wg0.m(i2);
                rdVar.getClass();
                String x = rd.x(m);
                return rdVar.v(r21.p(x).concat("WITHRSAANDMGF1"), r21.w(x, m), (byte[]) r6Var.e, (PublicKey) this.f);
            }
        }
        c.p(go0Var, "Invalid algorithm: ");
        return null;
    }

    public void m(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.e;
        Context context = imageView.getContext();
        int[] iArr = ng0.f;
        b8 J = b8.J(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) J.d;
        ry0.l(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) J.d, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = r21.r(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                lr.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(J.y(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(lr.c(typedArray.getInt(3, -1), null));
            }
            J.N();
        } catch (Throwable th) {
            J.N();
            throw th;
        }
    }

    public yb n(int i, int i2) {
        a0 a0Var;
        j o = o();
        int i3 = o.b;
        if (i3 == 1) {
            return new yb(3, i, i2, o.f(0), 0);
        }
        vb vbVar = sb.a;
        if (i3 < 1) {
            a0Var = sb.a;
        } else {
            a0Var = new a0(o);
        }
        return new yb(4, i, i2, a0Var, 0);
    }

    public j o() {
        x c;
        w50 w50Var = (w50) this.e;
        int read = w50Var.read();
        if (read < 0) {
            return new j(0);
        }
        j jVar = new j();
        do {
            i i = i(read);
            if (i instanceof o10) {
                c = ((o10) i).f();
            } else {
                c = i.c();
            }
            jVar.d(c);
            read = w50Var.read();
        } while (read >= 0);
        return jVar;
    }

    public void p() {
        for (int i = 0; i < 256; i++) {
            short[] sArr = (short[]) this.e;
            short s = sArr[i];
            sArr[i] = (short) (s - ((short) (((short) ((20159 * s) >> 26)) * 3329)));
        }
    }

    @Override // defpackage.ws0
    public void reset() {
        ((Mac) this.e).reset();
    }

    public String toString() {
        switch (this.c) {
            case 6:
                StringBuilder sb = new StringBuilder("[");
                int i = 0;
                while (true) {
                    short[] sArr = (short[]) this.e;
                    if (i < sArr.length) {
                        sb.append((int) sArr[i]);
                        if (i != ((short[]) this.e).length - 1) {
                            sb.append(", ");
                        }
                        i++;
                    } else {
                        sb.append("]");
                        return sb.toString();
                    }
                }
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ws0
    public void update(byte[] bArr, int i, int i2) {
        ((Mac) this.e).update(bArr, i, i2);
    }

    public c0(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.c = 8;
        this.d = i;
        this.f = str;
        this.e = arrayList;
    }

    public c0(int i, Mac mac, String str) {
        int i2;
        this.c = 5;
        this.e = mac;
        this.f = str;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 7:
            case 8:
                i2 = 64;
                break;
            case 5:
            case 6:
                i2 = 128;
                break;
            default:
                throw new IllegalArgumentException();
        }
        this.d = i2;
    }

    public c0(int i) {
        this.c = i;
        switch (i) {
            case 7:
                return;
            default:
                this.e = new WeakHashMap();
                this.f = new BigInteger[8];
                this.d = 0;
                return;
        }
    }

    public c0(rj rjVar) {
        this.c = 6;
        this.e = new short[256];
        rjVar.getClass();
        this.d = rjVar.c;
        this.f = (l3) rjVar.h;
    }

    public c0(w50 w50Var, int i, byte[][] bArr) {
        this.c = 0;
        this.e = w50Var;
        this.d = i;
        this.f = bArr;
    }

    public c0(ImageView imageView) {
        this.c = 1;
        this.d = 0;
        this.e = imageView;
    }

    public c0(Shader shader, ColorStateList colorStateList, int i) {
        this.c = 3;
        this.e = shader;
        this.f = colorStateList;
        this.d = i;
    }
}
