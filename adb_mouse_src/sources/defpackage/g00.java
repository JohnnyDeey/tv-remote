package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class g00 implements cl, l81, zu, me0, mf0, xh {
    public static g00 d;
    public static final /* synthetic */ g00 e = new g00(1);
    public static final g00 f = new g00(2);
    public static final g00 g = new g00(3);
    public static final g00 h = new g00(4);
    public static g00 i;
    public final /* synthetic */ int c;

    public g00(View view) {
        this.c = 16;
        if (Build.VERSION.SDK_INT >= 30) {
            new os(view);
        } else {
            new os(view);
        }
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
    
        r6 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean i(android.content.pm.PackageInfo r13) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g00.i(android.content.pm.PackageInfo):boolean");
    }

    public static l91 j(PackageInfo packageInfo, l91... l91VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            x91 x91Var = new x91(packageInfo.signatures[0].toByteArray());
            for (int i2 = 0; i2 < l91VarArr.length; i2++) {
                if (l91VarArr[i2].equals(x91Var)) {
                    return l91VarArr[i2];
                }
            }
        }
        return null;
    }

    @Override // defpackage.l81
    public t81 b(Class cls) {
        switch (this.c) {
            case 4:
                if (x71.class.isAssignableFrom(cls)) {
                    try {
                        return (t81) x71.m(cls.asSubclass(x71.class)).j(3);
                    } catch (Exception e2) {
                        f40.k("Unable to get message info for ".concat(cls.getName()), e2);
                        return null;
                    }
                }
                c.k("Unsupported message type: ".concat(cls.getName()));
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.l81
    public boolean c(Class cls) {
        switch (this.c) {
            case 4:
                return x71.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // defpackage.xh
    public long d() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f7, code lost:
    
        if (defpackage.f20.E(r7[0]) != java.lang.String.class) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.uc0 e(defpackage.xv0 r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g00.e(xv0, boolean):uc0");
    }

    @Override // defpackage.mf0
    public void f() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.me0
    public CharSequence g(Preference preference) {
        CharSequence charSequence;
        CharSequence[] charSequenceArr;
        CharSequence[] charSequenceArr2;
        ListPreference listPreference = (ListPreference) preference;
        int y = listPreference.y(listPreference.X);
        if (y >= 0 && (charSequenceArr2 = listPreference.V) != null) {
            charSequence = charSequenceArr2[y];
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            return listPreference.c.getString(R.string.not_set);
        }
        int y2 = listPreference.y(listPreference.X);
        if (y2 < 0 || (charSequenceArr = listPreference.V) == null) {
            return null;
        }
        return charSequenceArr[y2];
    }

    /* JADX WARN: Type inference failed for: r15v3, types: [xh, java.lang.Object] */
    @Override // defpackage.yf0
    public Object get() {
        switch (this.c) {
            case 9:
                return new fj0(1, Executors.newSingleThreadExecutor());
            default:
                ?? obj = new Object();
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    hashMap.put(af0.c, new ba(30000L, 86400000L, set));
                    if (set != null) {
                        hashMap.put(af0.e, new ba(1000L, 86400000L, set));
                        if (set != null) {
                            Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zl0.d)));
                            if (unmodifiableSet != null) {
                                hashMap.put(af0.d, new ba(86400000L, 86400000L, unmodifiableSet));
                                if (hashMap.keySet().size() >= af0.values().length) {
                                    new HashMap();
                                    return new aa(obj, hashMap);
                                }
                                c.o("Not all priorities have been configured");
                                return null;
                            }
                            c.g("Null flags");
                            return null;
                        }
                        c.g("Null flags");
                        return null;
                    }
                    c.g("Null flags");
                    return null;
                }
                c.g("Null flags");
                return null;
        }
    }

    @Override // defpackage.mf0
    public void h(int i2, Object obj) {
        String str;
        switch (i2) {
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
        if (i2 != 6 && i2 != 7 && i2 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    public String toString() {
        switch (this.c) {
            case 7:
                return Collections.EMPTY_MAP.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ g00(int i2) {
        this.c = i2;
    }
}
