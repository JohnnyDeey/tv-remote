package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class pz {
    public final int[] a;

    public pz(int[] iArr) {
        this.a = (int[]) iArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz)) {
            return false;
        }
        return Arrays.equals(this.a, ((pz) obj).a);
    }

    public final int hashCode() {
        int[] iArr = this.a;
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i = (i * 257) ^ iArr[length];
            } else {
                return i;
            }
        }
    }
}
