package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ay0 extends zx0 {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    /* JADX WARN: Type inference failed for: r5v0, types: [n8, io0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [n8, io0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [n8, io0] */
    public ay0(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new io0(0), new io0(0), new io0(0));
    }

    @Override // defpackage.zx0
    public final ay0 a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new ay0(parcel, dataPosition, i, qo0.s(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    @Override // defpackage.zx0
    public final boolean e(int i) {
        while (true) {
            int i2 = this.j;
            int i3 = this.k;
            if (i2 < this.g) {
                if (i3 != i) {
                    if (String.valueOf(i3).compareTo(String.valueOf(i)) <= 0) {
                        int i4 = this.j;
                        Parcel parcel = this.e;
                        parcel.setDataPosition(i4);
                        int readInt = parcel.readInt();
                        this.k = parcel.readInt();
                        this.j += readInt;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                if (i3 == i) {
                    return true;
                }
                return false;
            }
        }
    }

    @Override // defpackage.zx0
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public ay0(Parcel parcel, int i, int i2, String str, n8 n8Var, n8 n8Var2, n8 n8Var3) {
        super(n8Var, n8Var2, n8Var3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
