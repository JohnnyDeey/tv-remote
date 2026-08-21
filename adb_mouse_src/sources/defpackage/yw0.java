package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class yw0 implements tq0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ fl0 d;

    public /* synthetic */ yw0(fl0 fl0Var, int i) {
        this.c = i;
        this.d = fl0Var;
    }

    @Override // defpackage.tq0
    public final Object a() {
        int i = this.c;
        fl0 fl0Var = this.d;
        switch (i) {
            case 0:
                fl0Var.getClass();
                int i2 = wh.e;
                l3 l3Var = new l3(3);
                l3Var.g = null;
                l3Var.d = new ArrayList();
                l3Var.e = null;
                l3Var.f = "";
                HashMap hashMap = new HashMap();
                SQLiteDatabase a = fl0Var.a();
                a.beginTransaction();
                try {
                    wh whVar = (wh) fl0.h(a.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new go(fl0Var, hashMap, l3Var, 3));
                    a.setTransactionSuccessful();
                    return whVar;
                } finally {
                    a.endTransaction();
                }
            default:
                Integer num = (Integer) fl0Var.c(new al0(fl0Var, fl0Var.d.d() - fl0Var.f.d));
                num.getClass();
                return num;
        }
    }
}
