package defpackage;

import android.view.View;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import svarzee.android.apps.adb_mouse.MainActivity;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class f40 implements ad0, nr0 {
    public static final f40 d = new f40(12);
    public static final f40 e = new f40(13);
    public static final f40 f = new f40(14);
    public static final f40 g = new f40(15);
    public static final f40 h = new f40(16);
    public final /* synthetic */ int c;

    public /* synthetic */ f40(int i) {
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(int i, Exception exc, String str) {
        throw new us0(i, str, exc);
    }

    public static /* synthetic */ void b(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void c(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) " for ");
        sb.append(obj2);
        throw new TimeoutException(sb.toString());
    }

    public static /* synthetic */ void d(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void f(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void h(String str, int i) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void j(String str, Object obj, Throwable th) {
        throw new IllegalStateException(str + obj, th);
    }

    public static /* synthetic */ void k(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void m(String str) {
        throw new IOException(str);
    }

    @Override // defpackage.ad0
    public m11 g(View view, m11 m11Var) {
        int i = MainActivity.E;
        view.getClass();
        d20 h2 = m11Var.a.h(2);
        h2.getClass();
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), h2.d);
        return m11Var;
    }
}
