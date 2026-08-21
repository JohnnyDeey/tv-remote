package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class v71 {
    public static final v71 d;
    public static final v71 e;
    public static final v71[] f;
    public static final /* synthetic */ v71[] g;
    public final int c;

    /* JADX INFO: Fake field, exist only in values array */
    v71 EF0;

    static {
        g81 g81Var = g81.g;
        v71 v71Var = new v71("DOUBLE", 0, 0, 1, g81Var);
        g81 g81Var2 = g81.f;
        v71 v71Var2 = new v71("FLOAT", 1, 1, 1, g81Var2);
        g81 g81Var3 = g81.e;
        v71 v71Var3 = new v71("INT64", 2, 2, 1, g81Var3);
        v71 v71Var4 = new v71("UINT64", 3, 3, 1, g81Var3);
        g81 g81Var4 = g81.d;
        v71 v71Var5 = new v71("INT32", 4, 4, 1, g81Var4);
        v71 v71Var6 = new v71("FIXED64", 5, 5, 1, g81Var3);
        v71 v71Var7 = new v71("FIXED32", 6, 6, 1, g81Var4);
        g81 g81Var5 = g81.h;
        v71 v71Var8 = new v71("BOOL", 7, 7, 1, g81Var5);
        g81 g81Var6 = g81.i;
        v71 v71Var9 = new v71("STRING", 8, 8, 1, g81Var6);
        g81 g81Var7 = g81.l;
        v71 v71Var10 = new v71("MESSAGE", 9, 9, 1, g81Var7);
        g81 g81Var8 = g81.j;
        v71 v71Var11 = new v71("BYTES", 10, 10, 1, g81Var8);
        v71 v71Var12 = new v71("UINT32", 11, 11, 1, g81Var4);
        g81 g81Var9 = g81.k;
        v71 v71Var13 = new v71("ENUM", 12, 12, 1, g81Var9);
        v71 v71Var14 = new v71("SFIXED32", 13, 13, 1, g81Var4);
        v71 v71Var15 = new v71("SFIXED64", 14, 14, 1, g81Var3);
        v71 v71Var16 = new v71("SINT32", 15, 15, 1, g81Var4);
        v71 v71Var17 = new v71("SINT64", 16, 16, 1, g81Var3);
        v71 v71Var18 = new v71("GROUP", 17, 17, 1, g81Var7);
        v71 v71Var19 = new v71("DOUBLE_LIST", 18, 18, 2, g81Var);
        v71 v71Var20 = new v71("FLOAT_LIST", 19, 19, 2, g81Var2);
        v71 v71Var21 = new v71("INT64_LIST", 20, 20, 2, g81Var3);
        v71 v71Var22 = new v71("UINT64_LIST", 21, 21, 2, g81Var3);
        v71 v71Var23 = new v71("INT32_LIST", 22, 22, 2, g81Var4);
        v71 v71Var24 = new v71("FIXED64_LIST", 23, 23, 2, g81Var3);
        v71 v71Var25 = new v71("FIXED32_LIST", 24, 24, 2, g81Var4);
        v71 v71Var26 = new v71("BOOL_LIST", 25, 25, 2, g81Var5);
        v71 v71Var27 = new v71("STRING_LIST", 26, 26, 2, g81Var6);
        v71 v71Var28 = new v71("MESSAGE_LIST", 27, 27, 2, g81Var7);
        v71 v71Var29 = new v71("BYTES_LIST", 28, 28, 2, g81Var8);
        v71 v71Var30 = new v71("UINT32_LIST", 29, 29, 2, g81Var4);
        v71 v71Var31 = new v71("ENUM_LIST", 30, 30, 2, g81Var9);
        v71 v71Var32 = new v71("SFIXED32_LIST", 31, 31, 2, g81Var4);
        v71 v71Var33 = new v71("SFIXED64_LIST", 32, 32, 2, g81Var3);
        v71 v71Var34 = new v71("SINT32_LIST", 33, 33, 2, g81Var4);
        v71 v71Var35 = new v71("SINT64_LIST", 34, 34, 2, g81Var3);
        v71 v71Var36 = new v71("DOUBLE_LIST_PACKED", 35, 35, 3, g81Var);
        d = v71Var36;
        v71 v71Var37 = new v71("FLOAT_LIST_PACKED", 36, 36, 3, g81Var2);
        v71 v71Var38 = new v71("INT64_LIST_PACKED", 37, 37, 3, g81Var3);
        v71 v71Var39 = new v71("UINT64_LIST_PACKED", 38, 38, 3, g81Var3);
        v71 v71Var40 = new v71("INT32_LIST_PACKED", 39, 39, 3, g81Var4);
        v71 v71Var41 = new v71("FIXED64_LIST_PACKED", 40, 40, 3, g81Var3);
        v71 v71Var42 = new v71("FIXED32_LIST_PACKED", 41, 41, 3, g81Var4);
        v71 v71Var43 = new v71("BOOL_LIST_PACKED", 42, 42, 3, g81Var5);
        v71 v71Var44 = new v71("UINT32_LIST_PACKED", 43, 43, 3, g81Var4);
        v71 v71Var45 = new v71("ENUM_LIST_PACKED", 44, 44, 3, g81Var9);
        v71 v71Var46 = new v71("SFIXED32_LIST_PACKED", 45, 45, 3, g81Var4);
        v71 v71Var47 = new v71("SFIXED64_LIST_PACKED", 46, 46, 3, g81Var3);
        v71 v71Var48 = new v71("SINT32_LIST_PACKED", 47, 47, 3, g81Var4);
        v71 v71Var49 = new v71("SINT64_LIST_PACKED", 48, 48, 3, g81Var3);
        e = v71Var49;
        g = new v71[]{v71Var, v71Var2, v71Var3, v71Var4, v71Var5, v71Var6, v71Var7, v71Var8, v71Var9, v71Var10, v71Var11, v71Var12, v71Var13, v71Var14, v71Var15, v71Var16, v71Var17, v71Var18, v71Var19, v71Var20, v71Var21, v71Var22, v71Var23, v71Var24, v71Var25, v71Var26, v71Var27, v71Var28, v71Var29, v71Var30, v71Var31, v71Var32, v71Var33, v71Var34, v71Var35, v71Var36, v71Var37, v71Var38, v71Var39, v71Var40, v71Var41, v71Var42, v71Var43, v71Var44, v71Var45, v71Var46, v71Var47, v71Var48, v71Var49, new v71("GROUP_LIST", 49, 49, 2, g81Var7), new v71("MAP", 50, 50, 4, g81.c)};
        v71[] values = values();
        f = new v71[values.length];
        for (v71 v71Var50 : values) {
            f[v71Var50.c] = v71Var50;
        }
    }

    public v71(String str, int i, int i2, int i3, g81 g81Var) {
        this.c = i2;
        int i4 = i3 - 1;
        if (i4 != 1) {
            if (i4 == 3) {
                g81Var.getClass();
            }
        } else {
            g81Var.getClass();
        }
        if (i3 == 1) {
            g81 g81Var2 = g81.c;
            g81Var.ordinal();
        }
    }

    public static v71[] values() {
        return (v71[]) g.clone();
    }
}
