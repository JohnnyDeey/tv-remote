package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class cc {
    public static final cc c = new cc("bike128", 12323);
    public static final cc d = new cc("bike192", 24659);
    public static final cc e = new cc("bike256", 40973);
    public final String a;
    public final int b;

    public cc(String str, int i) {
        int i2;
        this.a = str;
        this.b = i;
        HashMap hashMap = new HashMap();
        int i3 = i - 2;
        int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i3);
        int i4 = -i;
        int i5 = (2 - (i4 * i4)) * i4;
        int i6 = (2 - (i4 * i5)) * i5;
        int i7 = (2 - (i4 * i6)) * i6;
        int i8 = (2 - (i4 * i7)) * i7;
        for (int i9 = 1; i9 < numberOfLeadingZeros; i9++) {
            int i10 = 1 << (i9 - 1);
            if (i10 >= 64 && !hashMap.containsKey(Integer.valueOf(i10))) {
                hashMap.put(Integer.valueOf(i10), Integer.valueOf(os.m(i, i8, i10)));
            }
            int i11 = 1 << i9;
            if ((i3 & i11) != 0 && (i2 = (i11 - 1) & i3) >= 64 && !hashMap.containsKey(Integer.valueOf(i2))) {
                hashMap.put(Integer.valueOf(i2), Integer.valueOf(os.m(i, i8, i2)));
            }
        }
    }
}
