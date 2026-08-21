package defpackage;

import java.security.PrivilegedAction;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final class lz implements PrivilegedAction {
    public final /* synthetic */ int a;

    @Override // java.security.PrivilegedAction
    public final Object run() {
        boolean z;
        switch (this.a) {
            case 0:
                try {
                    ClassLoader classLoader = mz.class.getClassLoader();
                    if (classLoader == null) {
                        classLoader = ClassLoader.getSystemClassLoader();
                    }
                    Class<?> loadClass = classLoader.loadClass("javax.crypto.spec.GCMParameterSpec");
                    if (loadClass != null && AlgorithmParameterSpec.class.isAssignableFrom(loadClass)) {
                        return loadClass.getConstructor(Integer.TYPE, byte[].class);
                    }
                } catch (Exception unused) {
                }
                return null;
            case 1:
                try {
                    if (Cipher.class.getMethod("updateAAD", byte[].class) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
            default:
                return System.getProperty("line.separator");
        }
    }
}
