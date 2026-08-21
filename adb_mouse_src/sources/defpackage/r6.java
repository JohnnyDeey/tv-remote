package defpackage;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class r6 implements gf, jt, ft0, zu, ke0 {
    public static final int[] f = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ int c;
    public Object d;
    public Object e;

    public r6(Context context) {
        this.c = 8;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(mn.N(svarzee.android.apps.adb_mouse.R.attr.materialCalendarStyle, context, c90.class.getCanonicalName()).data, mg0.o);
        os.l(context, obtainStyledAttributes.getResourceId(4, 0));
        os.l(context, obtainStyledAttributes.getResourceId(2, 0));
        os.l(context, obtainStyledAttributes.getResourceId(3, 0));
        os.l(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList w = k20.w(context, obtainStyledAttributes, 7);
        this.d = os.l(context, obtainStyledAttributes.getResourceId(9, 0));
        os.l(context, obtainStyledAttributes.getResourceId(8, 0));
        this.e = os.l(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(w.getDefaultColor());
        obtainStyledAttributes.recycle();
    }

    public static int D(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        if (i3 + 1 > i2) {
            return i4 + 1;
        }
        return i4;
    }

    public KeyListener A(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((r6) ((i81) this.e).d).getClass();
            if (keyListener instanceof ht) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new ht(keyListener);
        }
        return keyListener;
    }

    public ECPublicKey B() {
        try {
            return (ECPublicKey) C();
        } catch (ClassCastException e) {
            f40.a(46, e, "Public key not EC");
            return null;
        }
    }

    public PublicKey C() {
        try {
            return ((X509Certificate) this.e).getPublicKey();
        } catch (RuntimeException e) {
            f40.a(42, e, null);
            return null;
        }
    }

    public void E() {
        ((SparseIntArray) this.d).clear();
    }

    public void F(AttributeSet attributeSet, int i) {
        boolean z = true;
        switch (this.c) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.d;
                b8 J = b8.J(absSeekBar.getContext(), attributeSet, f, i);
                Drawable A = J.A(0);
                if (A != null) {
                    if (A instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) A;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable M = M(animationDrawable.getFrame(i2), true);
                            M.setLevel(10000);
                            animationDrawable2.addFrame(M, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        A = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(A);
                }
                Drawable A2 = J.A(1);
                if (A2 != null) {
                    absSeekBar.setProgressDrawable(M(A2, false));
                }
                J.N();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.d).getContext().obtainStyledAttributes(attributeSet, ng0.i, i, 0);
                try {
                    if (obtainStyledAttributes.hasValue(14)) {
                        z = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    L(z);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public et G(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        i81 i81Var = (i81) this.e;
        if (inputConnection == null) {
            i81Var.getClass();
            inputConnection2 = null;
        } else {
            r6 r6Var = (r6) i81Var.d;
            r6Var.getClass();
            if (!(inputConnection instanceof et)) {
                inputConnection = new et(editorInfo, inputConnection, (EditText) r6Var.d);
            }
            inputConnection2 = inputConnection;
        }
        return (et) inputConnection2;
    }

    public void H(v2 v2Var) {
        l3 l3Var = (l3) this.d;
        ((ActionMode.Callback) l3Var.g).onDestroyActionMode(l3Var.f(v2Var));
        g6 g6Var = (g6) this.e;
        if (g6Var.x != null) {
            g6Var.n.getDecorView().removeCallbacks(g6Var.y);
        }
        if (g6Var.w != null) {
            dz0 dz0Var = g6Var.z;
            if (dz0Var != null) {
                dz0Var.b();
            }
            dz0 a = ry0.a(g6Var.w);
            a.a(0.0f);
            g6Var.z = a;
            a.d(new v5(2, this));
        }
        g6Var.v = null;
        ViewGroup viewGroup = g6Var.B;
        WeakHashMap weakHashMap = ry0.a;
        viewGroup.requestApplyInsets();
        g6Var.H();
    }

    public boolean I(v2 v2Var, Menu menu) {
        ViewGroup viewGroup = ((g6) this.e).B;
        WeakHashMap weakHashMap = ry0.a;
        viewGroup.requestApplyInsets();
        l3 l3Var = (l3) this.d;
        ActionMode.Callback callback = (ActionMode.Callback) l3Var.g;
        kq0 f2 = l3Var.f(v2Var);
        io0 io0Var = (io0) l3Var.f;
        Menu menu2 = (Menu) io0Var.get(menu);
        if (menu2 == null) {
            menu2 = new pa0((Context) l3Var.d, (w90) menu);
            io0Var.put(menu, menu2);
        }
        return callback.onPrepareActionMode(f2, menu2);
    }

    public void J(sw swVar) {
        fj0 fj0Var = (fj0) this.e;
        sb0 sb0Var = (sb0) this.d;
        int i = swVar.b;
        if (i == 0) {
            fj0Var.execute(new m61(sb0Var, 5, swVar.a));
        } else {
            fj0Var.execute(new af(i, 0, sb0Var));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0209, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0082. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x00c9. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:19:0x0062, B:28:0x0209, B:29:0x0074, B:30:0x0082, B:33:0x0087, B:41:0x0097, B:44:0x00b1, B:47:0x00a0, B:51:0x00a9, B:54:0x00bf, B:57:0x00ce, B:59:0x00d6, B:62:0x00e0, B:66:0x0109, B:69:0x0110, B:70:0x0128, B:72:0x00e9, B:74:0x00f1, B:77:0x00ff, B:80:0x0129, B:82:0x0131, B:85:0x013f, B:88:0x0149, B:91:0x0154, B:92:0x016c, B:94:0x016d, B:97:0x0177, B:100:0x0182, B:101:0x019a, B:103:0x019b, B:105:0x01a3, B:108:0x01ac, B:111:0x01b6, B:114:0x01c0, B:115:0x01d8, B:117:0x01d9, B:120:0x01e3, B:123:0x01ed, B:124:0x0205, B:127:0x0206), top: B:18:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r6.K(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public void L(boolean z) {
        ot otVar = (ot) ((r6) ((i81) this.e).d).e;
        if (otVar.e != z) {
            if (otVar.d != null) {
                zs a = zs.a();
                nt ntVar = otVar.d;
                a.getClass();
                mn.k(ntVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(ntVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            otVar.e = z;
            if (z) {
                ot.a(otVar.c, zs.a().b());
            }
        }
    }

    public Drawable M(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id != 16908301 && id != 16908303) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                drawableArr[i] = M(drawable2, z2);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
            }
            return layerDrawable2;
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.e) == null) {
                this.e = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }

    public void N(int i) {
        String str;
        boolean[] keyUsage = ((X509Certificate) this.e).getKeyUsage();
        if (keyUsage != null) {
            if (keyUsage.length <= i || !keyUsage[i]) {
                if (i != 8) {
                    if (i != 32) {
                        if (i == 128) {
                            str = "KeyUsage does not allow digital signatures";
                        } else {
                            throw new us0((short) 80, null, null);
                        }
                    } else {
                        str = "KeyUsage does not allow key encipherment";
                    }
                } else {
                    str = "KeyUsage does not allow key agreement";
                }
                f40.a(46, null, str);
            }
        }
    }

    public void O() {
        k4 k4Var = hq0.i(C().getEncoded()).c;
        byte[] bArr = qg0.a;
        s sVar = k4Var.c;
        if (!od0.a.m(sVar) && !x11.e.m(sVar)) {
            f40.a(46, null, "No support for rsa_pkcs1 signature schemes");
        }
    }

    public void P(short s) {
        byte[] bArr;
        byte[] bArr2;
        k4 k4Var = hq0.i(C().getEncoded()).c;
        byte[] bArr3 = qg0.a;
        if (od0.d.m(k4Var.c)) {
            i iVar = k4Var.d;
            if (iVar != null && !(iVar instanceof im)) {
                try {
                    byte[] h = iVar.c().h();
                    switch (s) {
                        case 9:
                            bArr = qg0.a;
                            bArr2 = qg0.d;
                            break;
                        case 10:
                            bArr = qg0.b;
                            bArr2 = qg0.e;
                            break;
                        case 11:
                            bArr = qg0.c;
                            bArr2 = qg0.f;
                            break;
                    }
                    if (Arrays.equals(bArr, h) || Arrays.equals(bArr2, h)) {
                        return;
                    }
                } catch (Exception unused) {
                }
            } else {
                switch (s) {
                    case 9:
                    case 10:
                    case 11:
                        return;
                }
            }
        }
        f40.a(46, null, "No support for rsa_pss_pss signature schemes");
    }

    @Override // defpackage.ft0
    public ho0 a() {
        return ((u20) ((f61) this.e).d).b;
    }

    @Override // defpackage.jt
    public Object b() {
        return (qw0) this.d;
    }

    @Override // defpackage.ke0
    public void c(Preference preference) {
        ((PreferenceGroup) this.d).U = Integer.MAX_VALUE;
        te0 te0Var = (te0) this.e;
        Handler handler = te0Var.h;
        l9 l9Var = te0Var.i;
        handler.removeCallbacks(l9Var);
        handler.post(l9Var);
    }

    @Override // defpackage.jt
    public boolean d(CharSequence charSequence, int i, int i2, gw0 gw0Var) {
        Spannable spannableString;
        if ((gw0Var.c & 4) > 0) {
            return true;
        }
        if (((qw0) this.d) == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.d = new qw0(spannableString);
        }
        ((g00) this.e).getClass();
        ((qw0) this.d).setSpan(new hw0(gw0Var), i, i2, 33);
        return true;
    }

    public void e(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(length + 1 + valueOf.length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        ((ArrayList) this.d).add(sb.toString());
    }

    public void f(int i) {
        if (i != 1) {
            if (i == 2) {
                N(4);
                B();
                return;
            }
            throw new us0((short) 80, null, null);
        }
        N(4);
        try {
        } catch (ClassCastException e) {
            f40.a(46, e, "Public key not DH");
        }
    }

    @Override // defpackage.ft0
    public boolean g() {
        u20 u20Var = (u20) ((f61) this.e).d;
        byte[] bArr = (byte[]) this.d;
        u20Var.getClass();
        try {
            return u20Var.a.verify(bArr);
        } catch (SignatureException e) {
            f40.a(80, e, null);
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [xh, java.lang.Object] */
    @Override // defpackage.yf0
    public Object get() {
        switch (this.c) {
            case 24:
                return new qa0((Context) ((d3) this.d).c, (b8) ((i81) this.e).get());
            default:
                ?? obj = new Object();
                g00 g00Var = new g00(18);
                Object obj2 = ((yf0) this.d).get();
                yf0 yf0Var = (yf0) this.e;
                return new fl0(obj, g00Var, u9.f, (bm0) obj2, yf0Var);
        }
    }

    public r6 h() {
        N(2);
        return new r6((rd) this.d, C(), 20, false);
    }

    public u20 i(int i) {
        rd rdVar = (rd) this.d;
        N(0);
        if (i != 513) {
            if (i != 515) {
                if (i != 1025) {
                    if (i != 1027) {
                        if (i != 1281) {
                            if (i != 1283) {
                                if (i != 1537) {
                                    if (i != 1539) {
                                        switch (i) {
                                            case 2052:
                                            case 2053:
                                            case 2054:
                                                k4 k4Var = hq0.i(C().getEncoded()).c;
                                                byte[] bArr = qg0.a;
                                                if (od0.a.m(k4Var.c)) {
                                                    int m = wg0.m(i);
                                                    rdVar.getClass();
                                                    String x = rd.x(m);
                                                    return rdVar.w(r21.p(x).concat("WITHRSAANDMGF1"), r21.w(x, m), C());
                                                }
                                                f40.a(46, null, "No support for rsa_pss_rsae signature schemes");
                                                return null;
                                            case 2055:
                                                PublicKey C = C();
                                                if (!"Ed25519".equals(C.getAlgorithm()) && (!"EdDSA".equals(C.getAlgorithm()) || C.toString().indexOf("Ed25519") < 0)) {
                                                    f40.a(46, null, "Public key not Ed25519");
                                                    return null;
                                                }
                                                return rdVar.w("Ed25519", null, C);
                                            case 2056:
                                                PublicKey C2 = C();
                                                if (!"Ed448".equals(C2.getAlgorithm()) && (!"EdDSA".equals(C2.getAlgorithm()) || C2.toString().indexOf("Ed448") < 0)) {
                                                    f40.a(46, null, "Public key not Ed448");
                                                    return null;
                                                }
                                                return rdVar.w("Ed448", null, C2);
                                            case 2057:
                                            case 2058:
                                            case 2059:
                                                P((short) (i & 255));
                                                int m2 = wg0.m(i);
                                                rdVar.getClass();
                                                String x2 = rd.x(m2);
                                                return rdVar.w(r21.p(x2).concat("WITHRSAANDMGF1"), r21.w(x2, m2), C());
                                            default:
                                                switch (i) {
                                                    case 2074:
                                                    case 2075:
                                                    case 2076:
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 2308:
                                                            case 2309:
                                                            case 2310:
                                                                return rdVar.w("ML-DSA", null, C());
                                                            default:
                                                                switch (i) {
                                                                    case 2321:
                                                                    case 2322:
                                                                    case 2323:
                                                                    case 2324:
                                                                    case 2325:
                                                                    case 2326:
                                                                    case 2327:
                                                                    case 2328:
                                                                    case 2329:
                                                                    case 2330:
                                                                    case 2331:
                                                                    case 2332:
                                                                        return rdVar.w("SLH-DSA", null, C());
                                                                    default:
                                                                        throw new us0((short) 80, null, null);
                                                                }
                                                        }
                                                }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int m3 = wg0.m(i);
            rdVar.getClass();
            return rdVar.w(r21.p(rd.x(m3)).concat("WITHECDSA"), null, B());
        }
        O();
        int m4 = wg0.m(i);
        rdVar.getClass();
        return rdVar.w(r21.p(rd.x(m4)).concat("WITHRSA"), null, C());
    }

    public void j(boolean z) {
        gx gxVar = ((vx) this.e).v;
        if (gxVar != null) {
            gxVar.j().l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c.a();
        }
    }

    public void k(boolean z) {
        vx vxVar = (vx) this.e;
        f5 f5Var = vxVar.t.t;
        gx gxVar = vxVar.v;
        if (gxVar != null) {
            gxVar.j().l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c.a();
        }
    }

    public void l(boolean z) {
        gx gxVar = ((vx) this.e).v;
        if (gxVar != null) {
            gxVar.j().l.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c.a();
        }
    }

    public void m(boolean z) {
        gx gxVar = ((vx) this.e).v;
        if (gxVar != null) {
            gxVar.j().l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c.a();
        }
    }

    public void n(boolean z) {
        gx gxVar = ((vx) this.e).v;
        if (gxVar != null) {
            gxVar.j().l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c.a();
        }
    }

    public void o(boolean z) {
        gx gxVar = ((vx) this.e).v;
        if (gxVar != null) {
            gxVar.j().l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c.a();
        }
    }

    @Override // defpackage.gf
    public void onCancel() {
        ((Animator) this.d).end();
        if (vx.F(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((xo0) this.e) + " has been canceled.");
        }
    }

    public void p(boolean z) {
        vx vxVar = (vx) this.e;
        f5 f5Var = vxVar.t.t;
        gx gxVar = vxVar.v;
        if (gxVar != null) {
            gxVar.j().l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c.a();
        }
    }

    public void q(boolean z) {
        gx gxVar = ((vx) this.e).v;
        if (gxVar != null) {
            gxVar.j().l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c.a();
        }
    }

    public void r(boolean z) {
        gx gxVar = ((vx) this.e).v;
        if (gxVar != null) {
            gxVar.j().l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c.a();
        }
    }

    public void s(boolean z) {
        gx gxVar = ((vx) this.e).v;
        if (gxVar != null) {
            gxVar.j().l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c.a();
        }
    }

    public void t(boolean z) {
        gx gxVar = ((vx) this.e).v;
        if (gxVar != null) {
            gxVar.j().l.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c.a();
        }
    }

    public String toString() {
        int i = 0;
        switch (this.c) {
            case 26:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.e.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                while (i < size) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
                sb.append('}');
                return sb.toString();
            case 27:
            default:
                return super.toString();
            case 28:
                String str = "[ ";
                if (((ro0) this.d) != null) {
                    while (i < 9) {
                        str = str + ((ro0) this.d).j[i] + " ";
                        i++;
                    }
                }
                return str + "] " + ((ro0) this.d);
        }
    }

    public void u(boolean z) {
        gx gxVar = ((vx) this.e).v;
        if (gxVar != null) {
            gxVar.j().l.u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c.a();
        }
    }

    public void v(boolean z) {
        gx gxVar = ((vx) this.e).v;
        if (gxVar != null) {
            gxVar.j().l.v(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c.a();
        }
    }

    public void w(boolean z) {
        gx gxVar = ((vx) this.e).v;
        if (gxVar != null) {
            gxVar.j().l.w(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            c.a();
        }
    }

    public byte[] x(int i, byte[] bArr) {
        Cipher e;
        PublicKey publicKey = (PublicKey) this.e;
        rd rdVar = (rd) this.d;
        try {
            sb0 sb0Var = (sb0) rdVar.c;
            try {
                e = sb0Var.e("RSA/NONE/PKCS1Padding");
            } catch (GeneralSecurityException unused) {
                e = sb0Var.e("RSA/ECB/PKCS1Padding");
            }
            try {
                e.init(3, publicKey, (SecureRandom) rdVar.d);
                return e.wrap(new SecretKeySpec(bArr, 0, i, "TLS"));
            } catch (Exception e2) {
                try {
                    e.init(1, publicKey, (SecureRandom) rdVar.d);
                    return e.doFinal(bArr, 0, i);
                } catch (Exception unused2) {
                    throw new us0((short) 80, null, e2);
                }
            }
        } catch (GeneralSecurityException e3) {
            f40.a(80, e3, null);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory y(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r6.y(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public byte[] z() {
        try {
            return ((X509Certificate) this.e).getEncoded();
        } catch (CertificateEncodingException e) {
            throw new ts0("unable to encode certificate: " + e.getMessage(), e);
        }
    }

    public /* synthetic */ r6(int i, boolean z) {
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r6(defpackage.rd r2, defpackage.jk0 r3) {
        /*
            r1 = this;
            r0 = 21
            r1.c = r0
            r1.<init>()
            r1.d = r2
            int r2 = r3.b
            switch(r2) {
                case 512: goto L19;
                case 513: goto L16;
                case 514: goto L13;
                default: goto Le;
            }
        Le:
            switch(r2) {
                case 583: goto L19;
                case 584: goto L16;
                case 585: goto L13;
                default: goto L11;
            }
        L11:
            r2 = 0
            goto L1b
        L13:
            java.lang.String r2 = "ML-KEM-1024"
            goto L1b
        L16:
            java.lang.String r2 = "ML-KEM-768"
            goto L1b
        L19:
            java.lang.String r2 = "ML-KEM-512"
        L1b:
            r1.e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r6.<init>(rd, jk0):void");
    }

    public r6(rd rdVar, byte[] bArr) {
        this.c = 19;
        sb0 sb0Var = (sb0) rdVar.c;
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xf.i(ht0.J(bArr)).h());
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509", (Provider) sb0Var.c).generateCertificate(byteArrayInputStream);
            if (byteArrayInputStream.available() != 0) {
                throw new IOException("Extra data detected in stream");
            }
            this.d = rdVar;
            this.e = x509Certificate;
        } catch (GeneralSecurityException e) {
            throw new ts0("unable to decode certificate", e);
        }
    }

    public r6(go0 go0Var, byte[] bArr) {
        this.c = 12;
        if (bArr == null) {
            c.k("'signature' cannot be null");
            throw null;
        }
        this.d = go0Var;
        this.e = bArr;
    }

    public /* synthetic */ r6(Object obj, int i, Object obj2) {
        this.c = i;
        this.e = obj;
        this.d = obj2;
    }

    public /* synthetic */ r6(Object obj, int i, boolean z) {
        this.c = i;
        this.d = obj;
        this.e = null;
    }

    public /* synthetic */ r6(Object obj, Object obj2, int i, boolean z) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }

    public /* synthetic */ r6(Object obj) {
        this.c = 26;
        this.e = obj;
        this.d = new ArrayList();
    }

    public r6(s21 s21Var, g00 g00Var) {
        this.c = 3;
        this.e = "ClientTelemetry.API";
        this.d = s21Var;
    }

    public r6(AbsSeekBar absSeekBar) {
        this.c = 0;
        this.d = absSeekBar;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [ct, android.text.Editable$Factory] */
    public r6(EditText editText, int i) {
        this.c = i;
        switch (i) {
            case 13:
                this.d = editText;
                ot otVar = new ot(editText);
                this.e = otVar;
                editText.addTextChangedListener(otVar);
                if (ct.b == null) {
                    synchronized (ct.a) {
                        try {
                            if (ct.b == null) {
                                ?? factory = new Editable.Factory();
                                try {
                                    ct.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, ct.class.getClassLoader());
                                } catch (Throwable unused) {
                                }
                                ct.b = factory;
                            }
                        } finally {
                        }
                    }
                }
                editText.setEditableFactory(ct.b);
                return;
            default:
                this.d = editText;
                this.e = new i81(editText);
                return;
        }
    }

    public r6(vx vxVar) {
        this.c = 16;
        this.d = new CopyOnWriteArrayList();
        this.e = vxVar;
    }

    public /* synthetic */ r6(int i, Object obj) {
        this.c = i;
        this.e = obj;
    }

    public r6(Animator animator) {
        this.c = 15;
        this.d = null;
        this.e = animator;
    }

    public r6(ArrayList arrayList, ArrayList arrayList2) {
        this.c = 17;
        int size = arrayList.size();
        this.d = new int[size];
        this.e = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.d)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.e)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public r6(int i, int i2) {
        this.c = 17;
        this.d = new int[]{i, i2};
        this.e = new float[]{0.0f, 1.0f};
    }

    public r6(int i) {
        this.c = i;
        switch (i) {
            case 18:
                this.d = new SparseIntArray();
                this.e = new SparseIntArray();
                return;
            default:
                this.d = Choreographer.getInstance();
                this.e = Looper.myLooper();
                return;
        }
    }

    public r6(int i, int i2, int i3) {
        this.c = 17;
        this.d = new int[]{i, i2, i3};
        this.e = new float[]{0.0f, 0.5f, 1.0f};
    }
}
