package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class wm0 extends xm0 {
    public static List x(vm0 vm0Var) {
        Iterator it = vm0Var.iterator();
        if (!it.hasNext()) {
            return ut.c;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return f20.P(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
