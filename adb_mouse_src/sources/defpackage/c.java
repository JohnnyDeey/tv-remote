package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements uc0 {
    public final /* synthetic */ int c;

    public /* synthetic */ c(int i) {
        this.c = i;
    }

    public static /* synthetic */ void a() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void c(int i, int i2) {
        throw new EOFException("DEF length " + i + ((Object) " object truncated by ") + i2);
    }

    public static /* synthetic */ void d(Object obj) {
        throw new InvalidKeySpecException(obj.toString());
    }

    public static /* synthetic */ void e(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void g(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void h(String str, int i, Object obj, int i2) {
        throw new IllegalStateException(str + i + obj + i2);
    }

    public static /* synthetic */ void i(String str, Object obj, Exception exc) {
        throw new w(0, exc, str + obj);
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void k(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new RuntimeException(str + ((Object) obj.toString()));
    }

    public static /* synthetic */ void o(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void q(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new InvalidKeySpecException(str + obj + ((Object) "."));
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // defpackage.uc0
    public Object b() {
        switch (this.c) {
            case 12:
                yk ykVar = j60.k;
                return new j60(true);
            case 13:
                return new LinkedHashMap();
            case 14:
                return new TreeMap();
            case 15:
                return new ConcurrentHashMap();
            case 16:
                return new ConcurrentSkipListMap();
            case 17:
                return new ArrayList();
            case 18:
                return new LinkedHashSet();
            case 19:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }
}
