package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class x91 extends l91 {
    public final byte[] c;

    public x91(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.c = bArr;
    }

    @Override // defpackage.l91
    public final byte[] e() {
        return this.c;
    }
}
