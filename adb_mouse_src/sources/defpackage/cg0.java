package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class cg0 {
    public static final cg0 c;
    public static final /* synthetic */ cg0[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, java.lang.Object, cg0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, java.lang.Object, cg0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, java.lang.Object, cg0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, java.lang.Object, cg0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, java.lang.Object, cg0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, java.lang.Object, cg0] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        c = r0;
        ?? r1 = new Enum("UNMETERED_ONLY", 1);
        ?? r2 = new Enum("UNMETERED_OR_DAILY", 2);
        ?? r3 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        ?? r4 = new Enum("NEVER", 4);
        ?? r5 = new Enum("UNRECOGNIZED", 5);
        d = new cg0[]{r0, r1, r2, r3, r4, r5};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r0);
        sparseArray.put(1, r1);
        sparseArray.put(2, r2);
        sparseArray.put(3, r3);
        sparseArray.put(4, r4);
        sparseArray.put(-1, r5);
    }

    public static cg0 valueOf(String str) {
        return (cg0) Enum.valueOf(cg0.class, str);
    }

    public static cg0[] values() {
        return (cg0[]) d.clone();
    }
}
