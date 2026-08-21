package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class f0 {
    public static final vj0 d;
    public static final f0 e;
    public static final f0 f;
    public static final f0 g;
    public static final /* synthetic */ f0[] h;
    public static final /* synthetic */ iu i;
    public final int c;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, vj0] */
    static {
        f0 f0Var = new f0("TOKEN", 0, 1);
        e = f0Var;
        f0 f0Var2 = new f0("SIGNATURE", 1, 2);
        f = f0Var2;
        f0 f0Var3 = new f0("RSAPUBLICKEY", 2, 3);
        g = f0Var3;
        f0[] f0VarArr = {f0Var, f0Var2, f0Var3};
        h = f0VarArr;
        i = new iu(f0VarArr);
        d = new Object();
    }

    public f0(String str, int i2, int i3) {
        this.c = i3;
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) h.clone();
    }
}
