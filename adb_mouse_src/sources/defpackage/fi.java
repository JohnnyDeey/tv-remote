package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class fi implements qu0 {
    public final /* synthetic */ int c;
    public final g00 d;

    public /* synthetic */ fi(g00 g00Var, int i) {
        this.c = i;
        this.d = g00Var;
    }

    @Override // defpackage.qu0
    public final pu0 a(k00 k00Var, xv0 xv0Var) {
        Type[] typeArr;
        pu0 pu0Var;
        int i = this.c;
        g00 g00Var = this.d;
        Type type = Object.class;
        switch (i) {
            case 0:
                Type type2 = xv0Var.b;
                Class cls = xv0Var.a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                Type F = f20.F(type2, cls, Collection.class);
                if (F instanceof ParameterizedType) {
                    type = ((ParameterizedType) F).getActualTypeArguments()[0];
                }
                ru0 ru0Var = new ru0(k00Var, k00Var.b(new xv0(type)), type);
                g00Var.e(xv0Var, false);
                return new ei(0, ru0Var);
            default:
                Type type3 = xv0Var.b;
                Class cls2 = xv0Var.a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls2)) {
                    typeArr = new Type[]{String.class, String.class};
                } else {
                    Type F2 = f20.F(type3, cls2, Map.class);
                    if (F2 instanceof ParameterizedType) {
                        typeArr = ((ParameterizedType) F2).getActualTypeArguments();
                    } else {
                        typeArr = new Type[]{type, type};
                    }
                }
                Type type4 = typeArr[0];
                Type type5 = typeArr[1];
                if (type4 != Boolean.TYPE && type4 != Boolean.class) {
                    pu0Var = k00Var.b(new xv0(type4));
                } else {
                    pu0Var = vv0.c;
                }
                ru0 ru0Var2 = new ru0(k00Var, pu0Var, type4);
                ru0 ru0Var3 = new ru0(k00Var, k00Var.b(new xv0(type5)), type5);
                g00Var.e(xv0Var, false);
                return new ei(this, ru0Var2, ru0Var3);
        }
    }
}
