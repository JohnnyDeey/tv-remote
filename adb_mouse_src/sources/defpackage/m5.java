package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class m5 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;

    public /* synthetic */ m5(Context context, int i) {
        this.c = i;
        this.d = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.c
            android.content.Context r10 = r10.d
            switch(r0) {
                case 0: goto L2d;
                case 1: goto L13;
                default: goto L7;
            }
        L7:
            lf0 r0 = new lf0
            r0.<init>()
            os r1 = defpackage.mn.g
            r2 = 0
            defpackage.mn.W(r10, r0, r1, r2)
            return
        L13:
            java.util.concurrent.ThreadPoolExecutor r3 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingQueue r9 = new java.util.concurrent.LinkedBlockingQueue
            r9.<init>()
            r4 = 0
            r5 = 1
            r6 = 0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3.<init>(r4, r5, r6, r8, r9)
            m5 r0 = new m5
            r1 = 2
            r0.<init>(r10, r1)
            r3.execute(r0)
            return
        L2d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto Lad
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r10, r4)
            android.content.pm.PackageManager r4 = r10.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto Lad
            java.lang.String r4 = "locale"
            if (r0 < r2) goto L84
            p8 r0 = defpackage.s5.i
            r0.getClass()
            j8 r2 = new j8
            r2.<init>(r0)
        L53:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            s5 r0 = (defpackage.s5) r0
            if (r0 == 0) goto L53
            g6 r0 = (defpackage.g6) r0
            android.content.Context r0 = r0.m
            if (r0 == 0) goto L53
            java.lang.Object r0 = r0.getSystemService(r4)
            goto L73
        L72:
            r0 = 0
        L73:
            if (r0 == 0) goto L89
            android.os.LocaleList r0 = defpackage.o5.a(r0)
            c70 r2 = new c70
            d70 r5 = new d70
            r5.<init>(r0)
            r2.<init>(r5)
            goto L8b
        L84:
            c70 r2 = defpackage.s5.e
            if (r2 == 0) goto L89
            goto L8b
        L89:
            c70 r2 = defpackage.c70.b
        L8b:
            d70 r0 = r2.a
            android.os.LocaleList r0 = r0.a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La6
            java.lang.String r0 = defpackage.k20.c0(r10)
            java.lang.Object r2 = r10.getSystemService(r4)
            if (r2 == 0) goto La6
            android.os.LocaleList r0 = defpackage.n5.a(r0)
            defpackage.o5.b(r2, r0)
        La6:
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            r10.setComponentEnabledSetting(r3, r1, r1)
        Lad:
            defpackage.s5.h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5.run():void");
    }
}
