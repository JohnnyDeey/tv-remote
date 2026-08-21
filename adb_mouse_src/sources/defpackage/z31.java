package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class z31 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ z31(int i) {
        this.a = i;
    }

    public static void a(vz vzVar, Parcel parcel, int i) {
        int J = oi0.J(parcel, 20293);
        int i2 = vzVar.c;
        oi0.F(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = vzVar.d;
        oi0.F(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = vzVar.e;
        oi0.F(parcel, 3, 4);
        parcel.writeInt(i4);
        oi0.B(parcel, 4, vzVar.f);
        IBinder iBinder = vzVar.g;
        if (iBinder != null) {
            int J2 = oi0.J(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            oi0.L(parcel, J2);
        }
        oi0.C(parcel, 6, vzVar.h, i);
        Bundle bundle = vzVar.i;
        if (bundle != null) {
            int J3 = oi0.J(parcel, 7);
            parcel.writeBundle(bundle);
            oi0.L(parcel, J3);
        }
        oi0.A(parcel, 8, vzVar.j, i);
        oi0.C(parcel, 10, vzVar.k, i);
        oi0.C(parcel, 11, vzVar.l, i);
        boolean z = vzVar.m;
        oi0.F(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = vzVar.n;
        oi0.F(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = vzVar.o;
        oi0.F(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        oi0.B(parcel, 15, vzVar.p);
        oi0.L(parcel, J);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [i91, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Account account = null;
        String str = null;
        String str2 = null;
        int i = 0;
        switch (this.a) {
            case 0:
                int S = mi0.S(parcel);
                GoogleSignInAccount googleSignInAccount = null;
                int i2 = 0;
                while (parcel.dataPosition() < S) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                if (c != 4) {
                                    mi0.P(parcel, readInt);
                                } else {
                                    googleSignInAccount = (GoogleSignInAccount) mi0.l(parcel, readInt, GoogleSignInAccount.CREATOR);
                                }
                            } else {
                                i2 = mi0.L(parcel, readInt);
                            }
                        } else {
                            account = (Account) mi0.l(parcel, readInt, Account.CREATOR);
                        }
                    } else {
                        i = mi0.L(parcel, readInt);
                    }
                }
                mi0.p(parcel, S);
                return new x31(i, account, i2, googleSignInAccount);
            case 1:
                int S2 = mi0.S(parcel);
                IBinder iBinder = null;
                jj jjVar = null;
                int i3 = 0;
                boolean z = false;
                boolean z2 = false;
                while (parcel.dataPosition() < S2) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 != 1) {
                        if (c2 != 2) {
                            if (c2 != 3) {
                                if (c2 != 4) {
                                    if (c2 != 5) {
                                        mi0.P(parcel, readInt2);
                                    } else {
                                        z2 = mi0.K(parcel, readInt2);
                                    }
                                } else {
                                    z = mi0.K(parcel, readInt2);
                                }
                            } else {
                                jjVar = (jj) mi0.l(parcel, readInt2, jj.CREATOR);
                            }
                        } else {
                            int M = mi0.M(parcel, readInt2);
                            int dataPosition = parcel.dataPosition();
                            if (M == 0) {
                                iBinder = null;
                            } else {
                                iBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition + M);
                            }
                        }
                    } else {
                        i3 = mi0.L(parcel, readInt2);
                    }
                }
                mi0.p(parcel, S2);
                return new a41(i3, iBinder, jjVar, z, z2);
            case 2:
                int S3 = mi0.S(parcel);
                PendingIntent pendingIntent = null;
                String str3 = null;
                Integer num = null;
                int i4 = 0;
                int i5 = 0;
                while (parcel.dataPosition() < S3) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                if (c3 != 4) {
                                    if (c3 != 5) {
                                        mi0.P(parcel, readInt3);
                                    } else {
                                        int M2 = mi0.M(parcel, readInt3);
                                        if (M2 == 0) {
                                            num = null;
                                        } else if (M2 == 4) {
                                            num = Integer.valueOf(parcel.readInt());
                                        } else {
                                            String hexString = Integer.toHexString(M2);
                                            int length = String.valueOf(4).length();
                                            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(M2).length() + 4 + 1);
                                            sb.append("Expected size 4 got ");
                                            sb.append(M2);
                                            sb.append(" (0x");
                                            sb.append(hexString);
                                            sb.append(")");
                                            throw new vi(sb.toString(), parcel);
                                        }
                                    }
                                } else {
                                    str3 = mi0.m(parcel, readInt3);
                                }
                            } else {
                                pendingIntent = (PendingIntent) mi0.l(parcel, readInt3, PendingIntent.CREATOR);
                            }
                        } else {
                            i5 = mi0.L(parcel, readInt3);
                        }
                    } else {
                        i4 = mi0.L(parcel, readInt3);
                    }
                }
                mi0.p(parcel, S3);
                return new jj(i4, i5, pendingIntent, str3, num);
            case 3:
                int S4 = mi0.S(parcel);
                int i6 = 0;
                boolean z3 = false;
                boolean z4 = false;
                int i7 = 0;
                int i8 = 0;
                while (parcel.dataPosition() < S4) {
                    int readInt4 = parcel.readInt();
                    char c4 = (char) readInt4;
                    if (c4 != 1) {
                        if (c4 != 2) {
                            if (c4 != 3) {
                                if (c4 != 4) {
                                    if (c4 != 5) {
                                        mi0.P(parcel, readInt4);
                                    } else {
                                        i8 = mi0.L(parcel, readInt4);
                                    }
                                } else {
                                    i7 = mi0.L(parcel, readInt4);
                                }
                            } else {
                                z4 = mi0.K(parcel, readInt4);
                            }
                        } else {
                            z3 = mi0.K(parcel, readInt4);
                        }
                    } else {
                        i6 = mi0.L(parcel, readInt4);
                    }
                }
                mi0.p(parcel, S4);
                return new wj0(i6, z3, z4, i7, i8);
            case 4:
                int S5 = mi0.S(parcel);
                String str4 = null;
                int i9 = 0;
                boolean z5 = false;
                long j = -1;
                while (parcel.dataPosition() < S5) {
                    int readInt5 = parcel.readInt();
                    char c5 = (char) readInt5;
                    if (c5 != 1) {
                        if (c5 != 2) {
                            if (c5 != 3) {
                                if (c5 != 4) {
                                    mi0.P(parcel, readInt5);
                                } else {
                                    z5 = mi0.K(parcel, readInt5);
                                }
                            } else {
                                mi0.V(parcel, readInt5, 8);
                                j = parcel.readLong();
                            }
                        } else {
                            i9 = mi0.L(parcel, readInt5);
                        }
                    } else {
                        str4 = mi0.m(parcel, readInt5);
                    }
                }
                mi0.p(parcel, S5);
                return new pv(str4, i9, j, z5);
            case 5:
                int S6 = mi0.S(parcel);
                while (parcel.dataPosition() < S6) {
                    int readInt6 = parcel.readInt();
                    char c6 = (char) readInt6;
                    if (c6 != 1) {
                        if (c6 != 2) {
                            mi0.P(parcel, readInt6);
                        } else {
                            str2 = mi0.m(parcel, readInt6);
                        }
                    } else {
                        i = mi0.L(parcel, readInt6);
                    }
                }
                mi0.p(parcel, S6);
                return new Scope(str2, i);
            case 6:
                int S7 = mi0.S(parcel);
                PendingIntent pendingIntent2 = null;
                int i10 = 0;
                jj jjVar2 = null;
                while (parcel.dataPosition() < S7) {
                    int readInt7 = parcel.readInt();
                    char c7 = (char) readInt7;
                    if (c7 != 1) {
                        if (c7 != 2) {
                            if (c7 != 3) {
                                if (c7 != 4) {
                                    mi0.P(parcel, readInt7);
                                } else {
                                    jjVar2 = (jj) mi0.l(parcel, readInt7, jj.CREATOR);
                                }
                            } else {
                                pendingIntent2 = (PendingIntent) mi0.l(parcel, readInt7, PendingIntent.CREATOR);
                            }
                        } else {
                            str = mi0.m(parcel, readInt7);
                        }
                    } else {
                        i10 = mi0.L(parcel, readInt7);
                    }
                }
                mi0.p(parcel, S7);
                return new Status(i10, str, pendingIntent2, jjVar2);
            case 7:
                int S8 = mi0.S(parcel);
                Bundle bundle = null;
                pv[] pvVarArr = null;
                kj kjVar = null;
                while (parcel.dataPosition() < S8) {
                    int readInt8 = parcel.readInt();
                    char c8 = (char) readInt8;
                    if (c8 != 1) {
                        if (c8 != 2) {
                            if (c8 != 3) {
                                if (c8 != 4) {
                                    mi0.P(parcel, readInt8);
                                } else {
                                    kjVar = (kj) mi0.l(parcel, readInt8, kj.CREATOR);
                                }
                            } else {
                                i = mi0.L(parcel, readInt8);
                            }
                        } else {
                            pvVarArr = (pv[]) mi0.n(parcel, readInt8, pv.CREATOR);
                        }
                    } else {
                        int M3 = mi0.M(parcel, readInt8);
                        int dataPosition2 = parcel.dataPosition();
                        if (M3 == 0) {
                            bundle = null;
                        } else {
                            Bundle readBundle = parcel.readBundle();
                            parcel.setDataPosition(dataPosition2 + M3);
                            bundle = readBundle;
                        }
                    }
                }
                mi0.p(parcel, S8);
                ?? obj = new Object();
                obj.c = bundle;
                obj.d = pvVarArr;
                obj.e = i;
                obj.f = kjVar;
                return obj;
            case 8:
                int S9 = mi0.S(parcel);
                wj0 wj0Var = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z6 = false;
                boolean z7 = false;
                int i11 = 0;
                while (parcel.dataPosition() < S9) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            wj0Var = (wj0) mi0.l(parcel, readInt9, wj0.CREATOR);
                            break;
                        case 2:
                            z6 = mi0.K(parcel, readInt9);
                            break;
                        case 3:
                            z7 = mi0.K(parcel, readInt9);
                            break;
                        case 4:
                            int M4 = mi0.M(parcel, readInt9);
                            int dataPosition3 = parcel.dataPosition();
                            if (M4 == 0) {
                                iArr = null;
                                break;
                            } else {
                                int[] createIntArray = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition3 + M4);
                                iArr = createIntArray;
                                break;
                            }
                        case 5:
                            i11 = mi0.L(parcel, readInt9);
                            break;
                        case 6:
                            int M5 = mi0.M(parcel, readInt9);
                            int dataPosition4 = parcel.dataPosition();
                            if (M5 == 0) {
                                iArr2 = null;
                                break;
                            } else {
                                int[] createIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition4 + M5);
                                iArr2 = createIntArray2;
                                break;
                            }
                        default:
                            mi0.P(parcel, readInt9);
                            break;
                    }
                }
                mi0.p(parcel, S9);
                return new kj(wj0Var, z6, z7, iArr, i11, iArr2);
            default:
                int S10 = mi0.S(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = vz.q;
                pv[] pvVarArr2 = vz.r;
                pv[] pvVarArr3 = pvVarArr2;
                String str5 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str6 = null;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                boolean z8 = false;
                int i15 = 0;
                boolean z9 = false;
                while (parcel.dataPosition() < S10) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            i12 = mi0.L(parcel, readInt10);
                            break;
                        case 2:
                            i13 = mi0.L(parcel, readInt10);
                            break;
                        case 3:
                            i14 = mi0.L(parcel, readInt10);
                            break;
                        case 4:
                            str5 = mi0.m(parcel, readInt10);
                            break;
                        case 5:
                            int M6 = mi0.M(parcel, readInt10);
                            int dataPosition5 = parcel.dataPosition();
                            if (M6 == 0) {
                                iBinder2 = null;
                                break;
                            } else {
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition5 + M6);
                                iBinder2 = readStrongBinder;
                                break;
                            }
                        case 6:
                            scopeArr = (Scope[]) mi0.n(parcel, readInt10, Scope.CREATOR);
                            break;
                        case 7:
                            int M7 = mi0.M(parcel, readInt10);
                            int dataPosition6 = parcel.dataPosition();
                            if (M7 == 0) {
                                bundle2 = null;
                                break;
                            } else {
                                Bundle readBundle2 = parcel.readBundle();
                                parcel.setDataPosition(dataPosition6 + M7);
                                bundle2 = readBundle2;
                                break;
                            }
                        case '\b':
                            account2 = (Account) mi0.l(parcel, readInt10, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            mi0.P(parcel, readInt10);
                            break;
                        case '\n':
                            pvVarArr2 = (pv[]) mi0.n(parcel, readInt10, pv.CREATOR);
                            break;
                        case 11:
                            pvVarArr3 = (pv[]) mi0.n(parcel, readInt10, pv.CREATOR);
                            break;
                        case '\f':
                            z8 = mi0.K(parcel, readInt10);
                            break;
                        case '\r':
                            i15 = mi0.L(parcel, readInt10);
                            break;
                        case 14:
                            z9 = mi0.K(parcel, readInt10);
                            break;
                        case 15:
                            str6 = mi0.m(parcel, readInt10);
                            break;
                    }
                }
                mi0.p(parcel, S10);
                return new vz(i12, i13, i14, str5, iBinder2, scopeArr, bundle2, account2, pvVarArr2, pvVarArr3, z8, i15, z9, str6);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new x31[i];
            case 1:
                return new a41[i];
            case 2:
                return new jj[i];
            case 3:
                return new wj0[i];
            case 4:
                return new pv[i];
            case 5:
                return new Scope[i];
            case 6:
                return new Status[i];
            case 7:
                return new i91[i];
            case 8:
                return new kj[i];
            default:
                return new vz[i];
        }
    }
}
