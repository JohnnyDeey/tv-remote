package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class v9 extends k70 {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final bc0 g;

    public v9(long j, Integer num, long j2, byte[] bArr, String str, long j3, bc0 bc0Var) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = bc0Var;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof k70) {
            k70 k70Var = (k70) obj;
            v9 v9Var = (v9) k70Var;
            if (this.a == v9Var.a) {
                Integer num = v9Var.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c == v9Var.c) {
                        if (k70Var instanceof v9) {
                            bArr = ((v9) k70Var).d;
                        } else {
                            bArr = v9Var.d;
                        }
                        if (Arrays.equals(this.d, bArr)) {
                            String str = v9Var.e;
                            String str2 = this.e;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (this.f == v9Var.f) {
                                    bc0 bc0Var = v9Var.g;
                                    bc0 bc0Var2 = this.g;
                                    if (bc0Var2 != null ? bc0Var2.equals(bc0Var) : bc0Var == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        int i2 = 0;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i3 = (i ^ hashCode) * 1000003;
        long j2 = this.c;
        int hashCode3 = (((i3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i4 = (hashCode3 ^ hashCode2) * 1000003;
        long j3 = this.f;
        int i5 = (i4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        bc0 bc0Var = this.g;
        if (bc0Var != null) {
            i2 = bc0Var.hashCode();
        }
        return i5 ^ i2;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
