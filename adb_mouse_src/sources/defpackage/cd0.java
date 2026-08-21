package defpackage;

import androidx.activity.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.ListIterator;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class cd0 extends b50 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cd0(int i, Object obj) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.ky
    public final Object a() {
        Object obj;
        b91 b91Var;
        int i = this.d;
        nw0 nw0Var = nw0.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ((b) obj2).b();
                return nw0Var;
            case 1:
                b bVar = (b) obj2;
                h8 h8Var = bVar.b;
                ListIterator listIterator = h8Var.listIterator(h8Var.e);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (((ox) obj).a) {
                        }
                    } else {
                        obj = null;
                    }
                }
                bVar.c = null;
                return nw0Var;
            case 2:
                ((b) obj2).b();
                return nw0Var;
            default:
                bz0 bz0Var = (bz0) obj2;
                ArrayList arrayList = new ArrayList();
                li0.a.getClass();
                arrayList.add(new zy0(ul0.class));
                zy0[] zy0VarArr = (zy0[]) arrayList.toArray(new zy0[0]);
                zy0[] zy0VarArr2 = (zy0[]) Arrays.copyOf(zy0VarArr, zy0VarArr.length);
                az0 d = bz0Var.d();
                if (bz0Var instanceof b10) {
                    b91Var = ((b10) bz0Var).c();
                } else {
                    b91Var = rl.c;
                }
                d.getClass();
                LinkedHashMap linkedHashMap = d.a;
                b91Var.getClass();
                yy0 yy0Var = (yy0) linkedHashMap.get("androidx.lifecycle.internal.SavedStateHandlesVM");
                if (ul0.class.isInstance(yy0Var)) {
                    yy0Var.getClass();
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll((LinkedHashMap) b91Var.b);
                    linkedHashMap2.put(os.g, "androidx.lifecycle.internal.SavedStateHandlesVM");
                    try {
                        yy0Var = null;
                        for (zy0 zy0Var : zy0VarArr2) {
                            if (zy0Var.a.equals(ul0.class)) {
                                yy0Var = new ul0();
                            }
                        }
                        if (yy0Var != null) {
                            yy0 yy0Var2 = (yy0) linkedHashMap.put("androidx.lifecycle.internal.SavedStateHandlesVM", yy0Var);
                            if (yy0Var2 != null) {
                                yy0Var2.a();
                            }
                        } else {
                            throw new IllegalArgumentException("No initializer set for given class ".concat(ul0.class.getName()));
                        }
                    } catch (AbstractMethodError unused) {
                        c.q("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
                        return null;
                    }
                }
                return (ul0) yy0Var;
        }
    }
}
