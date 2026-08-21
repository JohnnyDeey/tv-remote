package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class fl0 implements Closeable {
    public static final bu h = new bu("proto");
    public final bm0 c;
    public final xh d;
    public final xh e;
    public final u9 f;
    public final yf0 g;

    public fl0(xh xhVar, xh xhVar2, u9 u9Var, bm0 bm0Var, yf0 yf0Var) {
        this.c = bm0Var;
        this.d = xhVar;
        this.e = xhVar2;
        this.f = u9Var;
        this.g = yf0Var;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, ca caVar) {
        Long valueOf;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(caVar.a, String.valueOf(cf0.a(caVar.c))));
        byte[] bArr = caVar.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            if (!query.moveToNext()) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(query.getLong(0));
            }
            return valueOf;
        } finally {
            query.close();
        }
    }

    public static String g(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((z9) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object h(Cursor cursor, dl0 dl0Var) {
        try {
            return dl0Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        bm0 bm0Var = this.c;
        Objects.requireNonNull(bm0Var);
        xh xhVar = this.e;
        long d = xhVar.d();
        while (true) {
            try {
                return bm0Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (xhVar.d() < this.f.c + d) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e);
                }
            }
        }
    }

    public final Object c(dl0 dl0Var) {
        SQLiteDatabase a = a();
        a.beginTransaction();
        try {
            Object apply = dl0Var.apply(a);
            a.setTransactionSuccessful();
            return apply;
        } finally {
            a.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, ca caVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long b = b(sQLiteDatabase, caVar);
        if (b == null) {
            return arrayList;
        }
        h(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b.toString()}, null, null, null, String.valueOf(i)), new go(this, (Object) arrayList, caVar, 2));
        return arrayList;
    }

    public final void e(long j, l70 l70Var, String str) {
        c(new cl0(j, str, l70Var));
    }

    public final Object f(tq0 tq0Var) {
        SQLiteDatabase a = a();
        xh xhVar = this.e;
        long d = xhVar.d();
        while (true) {
            try {
                a.beginTransaction();
                try {
                    Object a2 = tq0Var.a();
                    a.setTransactionSuccessful();
                    return a2;
                } finally {
                    a.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (xhVar.d() < this.f.c + d) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e);
                }
            }
        }
    }
}
