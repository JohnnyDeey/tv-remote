package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class bl0 implements dl0, ke0, tq0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bl0(Object obj, int i, Object obj2) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }

    @Override // defpackage.tq0
    public Object a() {
        int i = this.c;
        Object obj = this.e;
        cx0 cx0Var = (cx0) this.d;
        switch (i) {
            case 2:
                Iterable iterable = (Iterable) obj;
                fl0 fl0Var = cx0Var.c;
                fl0Var.getClass();
                if (iterable.iterator().hasNext()) {
                    fl0Var.a().compileStatement("DELETE FROM events WHERE _id in ".concat(fl0.g(iterable))).execute();
                }
                return null;
            default:
                Iterator it = ((HashMap) obj).entrySet().iterator();
                while (it.hasNext()) {
                    cx0Var.i.e(((Integer) r2.getValue()).intValue(), l70.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                return null;
        }
    }

    @Override // defpackage.dl0
    public Object apply(Object obj) {
        fl0 fl0Var = (fl0) this.d;
        ca caVar = (ca) this.e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        u9 u9Var = fl0Var.f;
        ArrayList d = fl0Var.d(sQLiteDatabase, caVar, u9Var.b);
        for (af0 af0Var : af0.values()) {
            if (af0Var != caVar.c) {
                int size = u9Var.b - d.size();
                if (size <= 0) {
                    break;
                }
                b8 a = ca.a();
                a.S(caVar.a);
                if (af0Var != null) {
                    a.f = af0Var;
                    a.e = caVar.b;
                    d.addAll(fl0Var.d(sQLiteDatabase, a.o(), size));
                } else {
                    c.g("Null priority");
                    return null;
                }
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < d.size(); i++) {
            sb.append(((z9) d.get(i)).a);
            if (i < d.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new el0(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            z9 z9Var = (z9) listIterator.next();
            long j2 = z9Var.a;
            if (hashMap.containsKey(Long.valueOf(j2))) {
                i6 c = z9Var.c.c();
                for (el0 el0Var : (Set) hashMap.get(Long.valueOf(j2))) {
                    c.a(el0Var.a, el0Var.b);
                }
                listIterator.set(new z9(j2, z9Var.b, c.c()));
            }
        }
        return d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, vj0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [od, java.lang.Object] */
    @Override // defpackage.ke0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(androidx.preference.Preference r8) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl0.c(androidx.preference.Preference):void");
    }
}
