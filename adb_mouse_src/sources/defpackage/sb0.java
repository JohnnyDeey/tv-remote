package defpackage;

import android.util.Log;
import android.view.View;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class sb0 implements mf0, gf, c2, l81 {
    public Object c;

    public sb0(rj rjVar) {
        int i = rjVar.b;
        this.c = new de0[i];
        for (int i2 = 0; i2 < i; i2++) {
            ((de0[]) this.c)[i2] = new de0(rjVar, 1);
        }
    }

    @Override // defpackage.c2
    public boolean a(View view) {
        int width;
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.c;
        boolean z = false;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        if (view.getLayoutDirection() == 1) {
            z = true;
        }
        int i = swipeDismissBehavior.d;
        if ((i == 0 && z) || (i == 1 && !z)) {
            width = -view.getWidth();
        } else {
            width = view.getWidth();
        }
        WeakHashMap weakHashMap = ry0.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // defpackage.l81
    public t81 b(Class cls) {
        for (int i = 0; i < 2; i++) {
            l81 l81Var = ((l81[]) this.c)[i];
            if (l81Var.c(cls)) {
                return l81Var.b(cls);
            }
        }
        c.q("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.l81
    public boolean c(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((l81[]) this.c)[i].c(cls)) {
                return true;
            }
        }
        return false;
    }

    public AlgorithmParameters d(String str) {
        return AlgorithmParameters.getInstance(str, (Provider) this.c);
    }

    public Cipher e(String str) {
        return Cipher.getInstance(str, (Provider) this.c);
    }

    @Override // defpackage.mf0
    public void f() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public KeyAgreement g(String str) {
        return KeyAgreement.getInstance(str, (Provider) this.c);
    }

    @Override // defpackage.mf0
    public void h(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i != 6 && i != 7 && i != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.c).setResultCode(i);
    }

    public KeyFactory i(String str) {
        return KeyFactory.getInstance(str, (Provider) this.c);
    }

    public KeyGenerator j(String str) {
        return KeyGenerator.getInstance(str, (Provider) this.c);
    }

    public KeyPairGenerator k(String str) {
        return KeyPairGenerator.getInstance(str, (Provider) this.c);
    }

    public Mac l(String str) {
        return Mac.getInstance(str, (Provider) this.c);
    }

    public MessageDigest m(String str) {
        return MessageDigest.getInstance(str, (Provider) this.c);
    }

    public Signature n(String str) {
        return Signature.getInstance(str, (Provider) this.c);
    }

    public void o(byte[] bArr) {
        int i = 0;
        while (true) {
            de0[] de0VarArr = (de0[]) this.c;
            if (i < de0VarArr.length) {
                de0 de0Var = de0VarArr[i];
                int i2 = i << 8;
                int i3 = 0;
                while (true) {
                    b8[] b8VarArr = de0Var.b;
                    if (i3 < b8VarArr.length) {
                        b8 b8Var = b8VarArr[i3];
                        short s = (short) (i2 + i3);
                        jp0 jp0Var = (jp0) b8Var.f;
                        jp0Var.getClass();
                        ik0 ik0Var = (ik0) jp0Var.d;
                        byte[] bArr2 = new byte[842];
                        ik0Var.i(ik0Var.e);
                        ik0Var.update(bArr, 0, bArr.length);
                        ik0Var.update(new byte[]{(byte) s, (byte) (s >> 8)}, 0, 2);
                        int i4 = 840;
                        ik0Var.l(bArr2, 0, 840);
                        int P = b8.P(b8Var, 0, 256, bArr2, 840);
                        while (P < 256) {
                            int i5 = i4 % 3;
                            for (int i6 = 0; i6 < i5; i6++) {
                                bArr2[i6] = bArr2[(i4 - i5) + i6];
                            }
                            ik0Var.l(bArr2, i5, 168);
                            i4 = 168 + i5;
                            P += b8.P(b8Var, P, 256 - P, bArr2, i4);
                        }
                        i3++;
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.gf
    public void onCancel() {
        ((xo0) this.c).a();
    }

    public im0 p() {
        return ((js0) this.c).c();
    }

    public void q() {
        ((js0) this.c).getClass();
    }

    public void r(de0 de0Var, de0 de0Var2) {
        b8[] b8VarArr = de0Var2.b;
        int i = 0;
        int i2 = 0;
        while (true) {
            de0[] de0VarArr = (de0[]) this.c;
            if (i2 < de0VarArr.length) {
                b8 b8Var = de0Var.b[i2];
                de0 de0Var3 = de0VarArr[i2];
                rj rjVar = (rj) b8Var.e;
                int[] iArr = new int[256];
                ((jp0) rjVar.h).getClass();
                b8 b8Var2 = de0Var3.b[i];
                b8 b8Var3 = b8VarArr[i];
                for (int i3 = i; i3 < 256; i3++) {
                    ((int[]) b8Var.d)[i3] = hi0.i(((int[]) b8Var2.d)[i3] * ((int[]) b8Var3.d)[i3]);
                }
                for (int i4 = 1; i4 < rjVar.c; i4++) {
                    b8 b8Var4 = de0Var3.b[i4];
                    b8 b8Var5 = b8VarArr[i4];
                    for (int i5 = 0; i5 < 256; i5++) {
                        iArr[i5] = hi0.i(((int[]) b8Var4.d)[i5] * ((int[]) b8Var5.d)[i5]);
                    }
                    for (int i6 = 0; i6 < 256; i6++) {
                        int[] iArr2 = (int[]) b8Var.d;
                        iArr2[i6] = iArr2[i6] + iArr[i6];
                    }
                }
                i2++;
                i = 0;
            } else {
                return;
            }
        }
    }

    public void s(int i, Object obj, u81 u81Var) {
        p71 p71Var = (p71) this.c;
        h71 h71Var = (h71) obj;
        p71Var.i(i, 2);
        p71Var.k(h71Var.c(u81Var));
        u81Var.i(h71Var, this);
    }

    public /* synthetic */ sb0(Object obj) {
        this.c = obj;
    }
}
