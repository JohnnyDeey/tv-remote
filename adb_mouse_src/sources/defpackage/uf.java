package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class uf implements ku0 {
    public final i81 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final xh e;
    public final xh f;
    public final int g;

    public uf(Context context, xh xhVar, xh xhVar2) {
        y30 y30Var = new y30();
        y8 y8Var = y8.a;
        y30Var.a(hd.class, y8Var);
        y30Var.a(p9.class, y8Var);
        b9 b9Var = b9.a;
        y30Var.a(n70.class, b9Var);
        y30Var.a(w9.class, b9Var);
        z8 z8Var = z8.a;
        y30Var.a(vh.class, z8Var);
        y30Var.a(q9.class, z8Var);
        x8 x8Var = x8.a;
        y30Var.a(m4.class, x8Var);
        y30Var.a(n9.class, x8Var);
        a9 a9Var = a9.a;
        y30Var.a(k70.class, a9Var);
        y30Var.a(v9.class, a9Var);
        c9 c9Var = c9.a;
        y30Var.a(bc0.class, c9Var);
        y30Var.a(y9.class, c9Var);
        y30Var.f = true;
        this.a = new i81(24, y30Var);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(ne.c);
        this.e = xhVar2;
        this.f = xhVar;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (((defpackage.zb0) defpackage.zb0.c.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.t9 a(defpackage.t9 r8) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uf.a(t9):t9");
    }
}
