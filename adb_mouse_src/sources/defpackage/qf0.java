package defpackage;

import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class qf0 {
    public static final ThreadLocal a = new ThreadLocal();

    public static String a(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new lh(1, str));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) a.get();
        if (map != null && (str2 = (String) map.get(str)) != null) {
            return str2;
        }
        return (String) AccessController.doPrivileged(new lh(2, str));
    }

    public static boolean b(String str) {
        try {
            String a2 = a(str);
            if (a2 != null && a2.length() == 4 && ((a2.charAt(0) == 't' || a2.charAt(0) == 'T') && ((a2.charAt(1) == 'r' || a2.charAt(1) == 'R') && (a2.charAt(2) == 'u' || a2.charAt(2) == 'U')))) {
                if (a2.charAt(3) != 'e') {
                    if (a2.charAt(3) == 'E') {
                    }
                }
                return true;
            }
        } catch (AccessControlException unused) {
        }
        return false;
    }
}
