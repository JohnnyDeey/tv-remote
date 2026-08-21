package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class al0 implements dl0 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ al0(long j, ca caVar) {
        this.d = j;
        this.e = caVar;
    }

    @Override // defpackage.dl0
    public final Object apply(Object obj) {
        int i = this.c;
        Object obj2 = this.e;
        long j = this.d;
        switch (i) {
            case 0:
                fl0 fl0Var = (fl0) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                fl0Var.getClass();
                String[] strArr = {String.valueOf(j)};
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                while (rawQuery.moveToNext()) {
                    try {
                        fl0Var.e(rawQuery.getInt(0), l70.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            default:
                ca caVar = (ca) obj2;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j));
                String str = caVar.a;
                af0 af0Var = caVar.c;
                if (sQLiteDatabase2.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(cf0.a(af0Var))}) < 1) {
                    contentValues.put("backend_name", str);
                    contentValues.put("priority", Integer.valueOf(cf0.a(af0Var)));
                    sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                return null;
        }
    }

    public /* synthetic */ al0(fl0 fl0Var, long j) {
        this.e = fl0Var;
        this.d = j;
    }
}
