package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class gi extends mi {
    public static final void o0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, vy vyVar) {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : collection) {
            boolean z = true;
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            if (vyVar != null) {
                sb.append((CharSequence) vyVar.h(obj));
            } else {
                if (obj != null) {
                    z = obj instanceof CharSequence;
                }
                if (z) {
                    sb.append((CharSequence) obj);
                } else if (obj instanceof Character) {
                    sb.append(((Character) obj).charValue());
                } else {
                    sb.append((CharSequence) obj.toString());
                }
            }
        }
        sb.append(charSequence3);
    }

    public static String p0(Collection collection, l0 l0Var, int i) {
        CharSequence charSequence;
        String str = "";
        if ((i & 2) != 0) {
            charSequence = "";
        } else {
            charSequence = "[";
        }
        if ((i & 4) == 0) {
            str = "]";
        }
        String str2 = str;
        if ((i & 32) != 0) {
            l0Var = null;
        }
        StringBuilder sb = new StringBuilder();
        o0(collection, sb, ", ", charSequence, str2, "...", l0Var);
        return sb.toString();
    }

    public static Set q0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            int i = 0;
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(q80.S(arrayList.size()));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    linkedHashSet.add(obj);
                }
                return linkedHashSet;
            }
            Set singleton = Collections.singleton(arrayList.get(0));
            singleton.getClass();
            return singleton;
        }
        return wt.c;
    }
}
