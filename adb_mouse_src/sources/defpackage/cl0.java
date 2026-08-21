package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class cl0 implements dl0, tq0 {
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cl0(long j, Object obj, Object obj2) {
        this.d = obj;
        this.e = obj2;
        this.c = j;
    }

    @Override // defpackage.tq0
    public Object a() {
        cx0 cx0Var = (cx0) this.d;
        ca caVar = (ca) this.e;
        fl0 fl0Var = cx0Var.c;
        long d = cx0Var.g.d() + this.c;
        fl0Var.getClass();
        fl0Var.c(new al0(d, caVar));
        return null;
    }

    @Override // defpackage.dl0
    public Object apply(Object obj) {
        boolean z;
        String str = (String) this.d;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((l70) this.e).c;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            if (rawQuery.getCount() > 0) {
                z = true;
            } else {
                z = false;
            }
            rawQuery.close();
            long j = this.c;
            if (!z) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i));
                contentValues.put("events_dropped_count", Long.valueOf(j));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
