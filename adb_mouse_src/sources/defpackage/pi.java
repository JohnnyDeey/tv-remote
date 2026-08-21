package defpackage;

import java.net.InetAddress;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class pi implements zy {
    public final /* synthetic */ int c;

    public /* synthetic */ pi(int i) {
        this.c = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // defpackage.zy
    public final Object g(Object obj, Object obj2) {
        qi qiVar;
        Object obj3;
        int i = this.c;
        nw0 nw0Var = nw0.a;
        switch (i) {
            case 0:
                String str = (String) obj;
                bl blVar = (bl) obj2;
                str.getClass();
                blVar.getClass();
                if (str.length() == 0) {
                    return blVar.toString();
                }
                return str + ", " + blVar;
            case 1:
                dl dlVar = (dl) obj;
                bl blVar2 = (bl) obj2;
                dlVar.getClass();
                blVar2.getClass();
                dl k = dlVar.k(blVar2.getKey());
                st stVar = st.c;
                if (k != stVar) {
                    g00 g00Var = g00.e;
                    gl glVar = (gl) k.h(g00Var);
                    if (glVar == null) {
                        qiVar = new qi(blVar2, k);
                    } else {
                        dl k2 = k.k(g00Var);
                        if (k2 == stVar) {
                            return new qi(glVar, blVar2);
                        }
                        qiVar = new qi(glVar, new qi(blVar2, k2));
                    }
                    return qiVar;
                }
                return blVar2;
            case 2:
                return ((dl) obj).g((bl) obj2);
            case 3:
                return ((dl) obj).g((bl) obj2);
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                obj3 = bool;
                return obj3;
            case 5:
                ((Integer) obj2).intValue();
                ((String) obj).getClass();
                return nw0Var;
            case 6:
                ((Integer) obj2).intValue();
                ((String) obj).getClass();
                return nw0Var;
            case 7:
                ((Integer) obj2).intValue();
                ((String) obj).getClass();
                return nw0Var;
            case 8:
                ((Integer) obj2).intValue();
                ((String) obj).getClass();
                return nw0Var;
            case 9:
                ((Integer) obj2).intValue();
                ((String) obj).getClass();
                return nw0Var;
            case 10:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                str2.getClass();
                int i2 = ByteBuffer.wrap(InetAddress.getByName(str2).getAddress()).getInt();
                str3.getClass();
                return Integer.valueOf(Integer.compare(i2 ^ Integer.MIN_VALUE, ByteBuffer.wrap(InetAddress.getByName(str3).getAddress()).getInt() ^ Integer.MIN_VALUE));
            case 11:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 12:
                return obj;
            case 13:
                if (obj == null) {
                    return null;
                }
                c.a();
                return null;
            default:
                obj3 = (vr0) obj;
                return obj3;
        }
    }
}
