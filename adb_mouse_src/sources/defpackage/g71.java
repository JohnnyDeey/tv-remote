package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class g71 {
    public static final g71 b = new g71(0);
    public static final g71 c = new g71(1);
    public static final g71 d = new g71(2);
    public static final g71 e = new g71(3);
    public static final g71 f = new g71(4);
    public static final g71 g = new g71(5);
    public static final g71 h = new g71(6);
    public static final g71 i = new g71(7);
    public final /* synthetic */ int a;

    public /* synthetic */ g71(int i2) {
        this.a = i2;
    }

    public final boolean a(int i2) {
        q91 q91Var;
        switch (this.a) {
            case 0:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    default:
                        switch (i2) {
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                                break;
                            default:
                                return false;
                        }
                }
                return true;
            case 2:
                if (qo0.f(i2) == 0) {
                    return false;
                }
                return true;
            case 3:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                q91Var = null;
                            } else {
                                q91Var = q91.ALTERNATIVE_BILLING_ACTION;
                            }
                        } else {
                            q91Var = q91.LOCAL_PURCHASES_UPDATED_ACTION;
                        }
                    } else {
                        q91Var = q91.PURCHASES_UPDATED_ACTION;
                    }
                } else {
                    q91Var = q91.BROADCAST_ACTION_UNSPECIFIED;
                }
                if (q91Var == null) {
                    return false;
                }
                return true;
            case 4:
                if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
                    return false;
                }
                return true;
            case 5:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        return true;
                    case 14:
                    case 15:
                    case 16:
                    default:
                        return false;
                }
            case 6:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            default:
                if (i2 != 0 && i2 != 1) {
                    return false;
                }
                return true;
        }
    }
}
