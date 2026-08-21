package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public enum x41 {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);

    public static final u51 e;
    public final int c;

    static {
        c0 c0Var = new c0(7);
        c0Var.e = new Object[8];
        c0Var.d = 0;
        for (x41 x41Var : values()) {
            Integer valueOf = Integer.valueOf(x41Var.c);
            int i = c0Var.d + 1;
            Object[] objArr = (Object[]) c0Var.e;
            int length = objArr.length;
            int i2 = i + i;
            if (i2 > length) {
                if (i2 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i2) {
                        int highestOneBit = Integer.highestOneBit(i2 - 1);
                        length = highestOneBit + highestOneBit;
                    }
                    if (length < 0) {
                        length = Integer.MAX_VALUE;
                    }
                }
                c0Var.e = Arrays.copyOf(objArr, length);
            }
            Object[] objArr2 = (Object[]) c0Var.e;
            int i3 = c0Var.d;
            int i4 = i3 + i3;
            objArr2[i4] = valueOf;
            objArr2[i4 + 1] = x41Var;
            c0Var.d = i3 + 1;
        }
        k51 k51Var = (k51) c0Var.f;
        if (k51Var == null) {
            u51 a = u51.a(c0Var.d, (Object[]) c0Var.e, c0Var);
            k51 k51Var2 = (k51) c0Var.f;
            if (k51Var2 == null) {
                e = a;
                return;
            }
            throw k51Var2.a();
        }
        throw k51Var.a();
    }

    x41(int i) {
        this.c = i;
    }
}
