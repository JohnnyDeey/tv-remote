package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class u31 {
    public static final r6 i = new r6(new s21(2), new g00(5));
    public final Context a;
    public final String b;
    public final r6 c;
    public final fr0 d;
    public final c5 e;
    public final int f;
    public final vj0 g;
    public final e00 h;

    public u31(Context context) {
        String str;
        zz zzVar = zz.b;
        wv0.q(context, "Null context is not permitted.");
        r6 r6Var = i;
        wv0.q(r6Var, "Api must not be null.");
        wv0.q(zzVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        wv0.q(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        if (Build.VERSION.SDK_INT >= 30) {
            str = context.getAttributionTag();
        } else {
            str = null;
        }
        this.b = str;
        this.c = r6Var;
        this.d = fr0.a;
        this.e = new c5(r6Var, str);
        e00 d = e00.d(applicationContext);
        this.h = d;
        this.f = d.h.getAndIncrement();
        this.g = zzVar.a;
        y31 y31Var = d.m;
        y31Var.sendMessage(y31Var.obtainMessage(7, this));
    }

    public final b8 a() {
        b8 b8Var = new b8(6);
        Set set = Collections.EMPTY_SET;
        if (((p8) b8Var.d) == null) {
            b8Var.d = new p8(0);
        }
        ((p8) b8Var.d).addAll(set);
        Context context = this.a;
        b8Var.f = context.getClass().getName();
        b8Var.e = context.getPackageName();
        return b8Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [sb0, java.lang.Object] */
    public final void b(er0 er0Var) {
        ?? obj = new Object();
        pv[] pvVarArr = {f20.q};
        obj.c = new sb0(er0Var);
        jy jyVar = new jy(obj, pvVarArr, false);
        zq0 zq0Var = new zq0();
        e00 e00Var = this.h;
        e00Var.getClass();
        h31 h31Var = new h31(new q31(jyVar, zq0Var, this.g), e00Var.i.get(), this);
        y31 y31Var = e00Var.m;
        y31Var.sendMessage(y31Var.obtainMessage(4, h31Var));
    }
}
