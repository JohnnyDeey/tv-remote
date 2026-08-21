package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class a3 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a3(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [sx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [wx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, c60] */
    /* JADX WARN: Type inference failed for: r0v20, types: [android.view.View$BaseSavedState, d90, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [android.view.View$BaseSavedState, ub0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [ip0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View$BaseSavedState, f7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kp0] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        Intent intent = null;
        jj jjVar = null;
        boolean z3 = true;
        int i = 0;
        switch (this.a) {
            case 0:
                return new b3(parcel);
            case 1:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                if (parcel.readByte() == 0) {
                    z3 = false;
                }
                baseSavedState.c = z3;
                return baseSavedState;
            case 2:
                return new ic(parcel);
            case 3:
                return new jc(parcel);
            case 4:
                return new xe((wa0) parcel.readParcelable(wa0.class.getClassLoader()), (wa0) parcel.readParcelable(wa0.class.getClassLoader()), (jn) parcel.readParcelable(jn.class.getClassLoader()), (wa0) parcel.readParcelable(wa0.class.getClassLoader()), parcel.readInt());
            case 5:
                return new jn(parcel.readLong());
            case 6:
                return new ps(parcel);
            case 7:
                ?? obj = new Object();
                obj.c = parcel.readString();
                obj.d = parcel.readInt();
                return obj;
            case 8:
                ?? obj2 = new Object();
                obj2.g = null;
                obj2.h = new ArrayList();
                obj2.i = new ArrayList();
                obj2.c = parcel.createStringArrayList();
                obj2.d = parcel.createStringArrayList();
                obj2.e = (ic[]) parcel.createTypedArray(ic.CREATOR);
                obj2.f = parcel.readInt();
                obj2.g = parcel.readString();
                obj2.h = parcel.createStringArrayList();
                obj2.i = parcel.createTypedArrayList(jc.CREATOR);
                obj2.j = parcel.createTypedArrayList(sx.CREATOR);
                return obj2;
            case 9:
                return new ay(parcel);
            case 10:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new j20((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 11:
                ?? obj3 = new Object();
                obj3.c = parcel.readInt();
                obj3.d = parcel.readInt();
                if (parcel.readInt() != 1) {
                    z3 = false;
                }
                obj3.e = z3;
                return obj3;
            case 12:
                return new u60(parcel);
            case 13:
                ?? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.c = ((Integer) parcel.readValue(d90.class.getClassLoader())).intValue();
                return baseSavedState2;
            case 14:
                return wa0.a(parcel.readInt(), parcel.readInt());
            case 15:
                return new db0(parcel);
            case 16:
                ?? baseSavedState3 = new View.BaseSavedState(parcel);
                baseSavedState3.c = parcel.readInt();
                return baseSavedState3;
            case 17:
                return new ParcelImpl(parcel);
            case 18:
                return new ie0(parcel);
            case 19:
                return new re0(parcel);
            case 20:
                return new lm0(parcel);
            case 21:
                ?? obj4 = new Object();
                obj4.c = parcel.readInt();
                obj4.d = parcel.readInt();
                if (parcel.readInt() != 1) {
                    z3 = false;
                }
                obj4.f = z3;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    obj4.e = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj4;
            case 22:
                ?? obj5 = new Object();
                obj5.c = parcel.readInt();
                obj5.d = parcel.readInt();
                int readInt2 = parcel.readInt();
                obj5.e = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj5.f = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                obj5.g = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    obj5.h = iArr3;
                    parcel.readIntArray(iArr3);
                }
                if (parcel.readInt() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                obj5.j = z;
                if (parcel.readInt() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                obj5.k = z2;
                if (parcel.readInt() != 1) {
                    z3 = false;
                }
                obj5.l = z3;
                obj5.i = parcel.readArrayList(ip0.class.getClassLoader());
                return obj5;
            case 23:
                return new nu0(parcel);
            case 24:
                int S = mi0.S(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (parcel.dataPosition() < S) {
                        int readInt4 = parcel.readInt();
                        char c = (char) readInt4;
                        if (c != 1) {
                            if (c != 2) {
                                mi0.P(parcel, readInt4);
                            } else {
                                Parcelable.Creator<ua0> creator = ua0.CREATOR;
                                int M = mi0.M(parcel, readInt4);
                                int dataPosition = parcel.dataPosition();
                                if (M == 0) {
                                    break;
                                }
                                arrayList = parcel.createTypedArrayList(creator);
                                parcel.setDataPosition(dataPosition + M);
                            }
                        } else {
                            i = mi0.L(parcel, readInt4);
                        }
                    }
                    mi0.p(parcel, S);
                    return new er0(i, arrayList);
                    break;
                }
            case 25:
                int S2 = mi0.S(parcel);
                int i2 = 0;
                while (parcel.dataPosition() < S2) {
                    int readInt5 = parcel.readInt();
                    char c2 = (char) readInt5;
                    if (c2 != 1) {
                        if (c2 != 2) {
                            if (c2 != 3) {
                                mi0.P(parcel, readInt5);
                            } else {
                                intent = (Intent) mi0.l(parcel, readInt5, Intent.CREATOR);
                            }
                        } else {
                            i2 = mi0.L(parcel, readInt5);
                        }
                    } else {
                        i = mi0.L(parcel, readInt5);
                    }
                }
                mi0.p(parcel, S2);
                return new t21(i, i2, intent);
            case 26:
                int S3 = mi0.S(parcel);
                long j = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList2 = null;
                String str7 = null;
                String str8 = null;
                int i3 = 0;
                while (parcel.dataPosition() < S3) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i3 = mi0.L(parcel, readInt6);
                            break;
                        case 2:
                            str = mi0.m(parcel, readInt6);
                            break;
                        case 3:
                            str2 = mi0.m(parcel, readInt6);
                            break;
                        case 4:
                            str3 = mi0.m(parcel, readInt6);
                            break;
                        case 5:
                            str4 = mi0.m(parcel, readInt6);
                            break;
                        case 6:
                            uri = (Uri) mi0.l(parcel, readInt6, Uri.CREATOR);
                            break;
                        case 7:
                            str5 = mi0.m(parcel, readInt6);
                            break;
                        case '\b':
                            mi0.V(parcel, readInt6, 8);
                            j = parcel.readLong();
                            break;
                        case '\t':
                            str6 = mi0.m(parcel, readInt6);
                            break;
                        case '\n':
                            Parcelable.Creator<Scope> creator2 = Scope.CREATOR;
                            int M2 = mi0.M(parcel, readInt6);
                            int dataPosition2 = parcel.dataPosition();
                            if (M2 == 0) {
                                arrayList2 = null;
                                break;
                            } else {
                                ArrayList createTypedArrayList = parcel.createTypedArrayList(creator2);
                                parcel.setDataPosition(dataPosition2 + M2);
                                arrayList2 = createTypedArrayList;
                                break;
                            }
                        case 11:
                            str7 = mi0.m(parcel, readInt6);
                            break;
                        case '\f':
                            str8 = mi0.m(parcel, readInt6);
                            break;
                        default:
                            mi0.P(parcel, readInt6);
                            break;
                    }
                }
                mi0.p(parcel, S3);
                return new GoogleSignInAccount(i3, str, str2, str3, str4, uri, str5, j, str6, arrayList2, str7, str8);
            case 27:
                int S4 = mi0.S(parcel);
                ArrayList<String> arrayList3 = null;
                String str9 = null;
                while (parcel.dataPosition() < S4) {
                    int readInt7 = parcel.readInt();
                    char c3 = (char) readInt7;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            mi0.P(parcel, readInt7);
                        } else {
                            str9 = mi0.m(parcel, readInt7);
                        }
                    } else {
                        int M3 = mi0.M(parcel, readInt7);
                        int dataPosition3 = parcel.dataPosition();
                        if (M3 == 0) {
                            arrayList3 = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition3 + M3);
                            arrayList3 = createStringArrayList;
                        }
                    }
                }
                mi0.p(parcel, S4);
                return new p31(arrayList3, str9);
            case 28:
                int S5 = mi0.S(parcel);
                a41 a41Var = null;
                while (parcel.dataPosition() < S5) {
                    int readInt8 = parcel.readInt();
                    char c4 = (char) readInt8;
                    if (c4 != 1) {
                        if (c4 != 2) {
                            if (c4 != 3) {
                                mi0.P(parcel, readInt8);
                            } else {
                                a41Var = (a41) mi0.l(parcel, readInt8, a41.CREATOR);
                            }
                        } else {
                            jjVar = (jj) mi0.l(parcel, readInt8, jj.CREATOR);
                        }
                    } else {
                        i = mi0.L(parcel, readInt8);
                    }
                }
                mi0.p(parcel, S5);
                return new t31(i, jjVar, a41Var);
            default:
                int S6 = mi0.S(parcel);
                int i4 = -1;
                long j2 = 0;
                long j3 = 0;
                String str10 = null;
                String str11 = null;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (parcel.dataPosition() < S6) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            i5 = mi0.L(parcel, readInt9);
                            break;
                        case 2:
                            i6 = mi0.L(parcel, readInt9);
                            break;
                        case 3:
                            i7 = mi0.L(parcel, readInt9);
                            break;
                        case 4:
                            mi0.V(parcel, readInt9, 8);
                            j2 = parcel.readLong();
                            break;
                        case 5:
                            mi0.V(parcel, readInt9, 8);
                            j3 = parcel.readLong();
                            break;
                        case 6:
                            str10 = mi0.m(parcel, readInt9);
                            break;
                        case 7:
                            str11 = mi0.m(parcel, readInt9);
                            break;
                        case '\b':
                            i8 = mi0.L(parcel, readInt9);
                            break;
                        case '\t':
                            i4 = mi0.L(parcel, readInt9);
                            break;
                        default:
                            mi0.P(parcel, readInt9);
                            break;
                    }
                }
                mi0.p(parcel, S6);
                return new ua0(i5, i6, i7, j2, j3, str10, str11, i8, i4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new b3[i];
            case 1:
                return new f7[i];
            case 2:
                return new ic[i];
            case 3:
                return new jc[i];
            case 4:
                return new xe[i];
            case 5:
                return new jn[i];
            case 6:
                return new ps[i];
            case 7:
                return new sx[i];
            case 8:
                return new wx[i];
            case 9:
                return new ay[i];
            case 10:
                return new j20[i];
            case 11:
                return new c60[i];
            case 12:
                return new u60[i];
            case 13:
                return new d90[i];
            case 14:
                return new wa0[i];
            case 15:
                return new db0[i];
            case 16:
                return new ub0[i];
            case 17:
                return new ParcelImpl[i];
            case 18:
                return new ie0[i];
            case 19:
                return new re0[i];
            case 20:
                return new lm0[i];
            case 21:
                return new ip0[i];
            case 22:
                return new kp0[i];
            case 23:
                return new nu0[i];
            case 24:
                return new er0[i];
            case 25:
                return new t21[i];
            case 26:
                return new GoogleSignInAccount[i];
            case 27:
                return new p31[i];
            case 28:
                return new t31[i];
            default:
                return new ua0[i];
        }
    }
}
