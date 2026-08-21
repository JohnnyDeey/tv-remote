package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class l31 extends y31 {
    public final Context a;
    public final /* synthetic */ a00 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l31(defpackage.a00 r2, android.content.Context r3) {
        /*
            r1 = this;
            r1.b = r2
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 != 0) goto Ld
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r2 = android.os.Looper.myLooper()
        L11:
            r0 = 0
            r1.<init>(r2, r0)
            android.content.Context r2 = r3.getApplicationContext()
            r1.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l31.<init>(a00, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = b00.a;
        a00 a00Var = this.b;
        Context context = this.a;
        int b = a00Var.b(context, i2);
        int i3 = f00.c;
        if (b != 1 && b != 2 && b != 3 && b != 9) {
            return;
        }
        Intent a = a00Var.a(b, context, "n");
        if (a == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(context, 0, a, 201326592);
        }
        a00Var.f(context, b, activity);
    }
}
