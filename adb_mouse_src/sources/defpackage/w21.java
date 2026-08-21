package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public abstract class w21 extends Binder implements IInterface {
    public final /* synthetic */ int a;

    public w21(String str) {
        this.a = 2;
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.a;
        return this;
    }

    public boolean d(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (super.onTransact(r5, r6, r7, r8) != false) goto L27;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
        /*
            r4 = this;
            int r0 = r4.a
            r1 = 0
            r2 = 1
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            switch(r0) {
                case 0: goto L59;
                case 1: goto L1f;
                default: goto La;
            }
        La:
            if (r5 <= r3) goto L13
            boolean r8 = super.onTransact(r5, r6, r7, r8)
            if (r8 == 0) goto L1a
            goto L1e
        L13:
            java.lang.String r8 = r4.getInterfaceDescriptor()
            r6.enforceInterface(r8)
        L1a:
            boolean r2 = r4.d(r5, r6, r7)
        L1e:
            return r2
        L1f:
            if (r5 <= r3) goto L26
            boolean r7 = super.onTransact(r5, r6, r7, r8)
            goto L2e
        L26:
            java.lang.String r7 = r4.getInterfaceDescriptor()
            r6.enforceInterface(r7)
            r7 = r1
        L2e:
            if (r7 == 0) goto L32
        L30:
            r1 = r2
            goto L58
        L32:
            k61 r4 = (defpackage.k61) r4
            if (r5 != r2) goto L58
            int r5 = r6.readInt()
            int r7 = defpackage.s41.a
            int r6 = r6.dataAvail()
            if (r6 > 0) goto L4c
            pa1 r4 = r4.b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.a(r5)
            goto L30
        L4c:
            android.os.BadParcelableException r4 = new android.os.BadParcelableException
            java.lang.String r5 = "Parcel data not fully consumed, unread size: "
            java.lang.String r5 = defpackage.qo0.m(r5, r6)
            r4.<init>(r5)
            throw r4
        L58:
            return r1
        L59:
            if (r5 <= r3) goto L64
            boolean r8 = super.onTransact(r5, r6, r7, r8)
            if (r8 == 0) goto L6b
        L61:
            r1 = r2
            goto Ld8
        L64:
            java.lang.String r8 = r4.getInterfaceDescriptor()
            r6.enforceInterface(r8)
        L6b:
            i31 r4 = (defpackage.i31) r4
            switch(r5) {
                case 3: goto Lc1;
                case 4: goto Lb5;
                case 5: goto L70;
                case 6: goto La9;
                case 7: goto L95;
                case 8: goto L7d;
                case 9: goto L71;
                default: goto L70;
            }
        L70:
            goto Ld8
        L71:
            android.os.Parcelable$Creator<p31> r4 = defpackage.p31.CREATOR
            android.os.Parcelable r4 = defpackage.e31.a(r6, r4)
            p31 r4 = (defpackage.p31) r4
            defpackage.e31.b(r6)
            goto Ld4
        L7d:
            android.os.Parcelable$Creator<t31> r5 = defpackage.t31.CREATOR
            android.os.Parcelable r5 = defpackage.e31.a(r6, r5)
            t31 r5 = (defpackage.t31) r5
            defpackage.e31.b(r6)
            m61 r6 = new m61
            r8 = 12
            r6.<init>(r4, r5, r8, r1)
            android.os.Handler r4 = r4.c
            r4.post(r6)
            goto Ld4
        L95:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r4 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r4 = defpackage.e31.a(r6, r4)
            com.google.android.gms.common.api.Status r4 = (com.google.android.gms.common.api.Status) r4
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r4 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r4 = defpackage.e31.a(r6, r4)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r4 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r4
            defpackage.e31.b(r6)
            goto Ld4
        La9:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r4 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r4 = defpackage.e31.a(r6, r4)
            com.google.android.gms.common.api.Status r4 = (com.google.android.gms.common.api.Status) r4
            defpackage.e31.b(r6)
            goto Ld4
        Lb5:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r4 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r4 = defpackage.e31.a(r6, r4)
            com.google.android.gms.common.api.Status r4 = (com.google.android.gms.common.api.Status) r4
            defpackage.e31.b(r6)
            goto Ld4
        Lc1:
            android.os.Parcelable$Creator<jj> r4 = defpackage.jj.CREATOR
            android.os.Parcelable r4 = defpackage.e31.a(r6, r4)
            jj r4 = (defpackage.jj) r4
            android.os.Parcelable$Creator<t21> r4 = defpackage.t21.CREATOR
            android.os.Parcelable r4 = defpackage.e31.a(r6, r4)
            t21 r4 = (defpackage.t21) r4
            defpackage.e31.b(r6)
        Ld4:
            r7.writeNoException()
            goto L61
        Ld8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w21.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
