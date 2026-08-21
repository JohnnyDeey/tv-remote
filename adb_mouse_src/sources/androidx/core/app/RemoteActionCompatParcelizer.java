package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.ay0;
import defpackage.by0;
import defpackage.zx0;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.app.RemoteActionCompat, java.lang.Object] */
    public static RemoteActionCompat read(zx0 zx0Var) {
        ?? obj = new Object();
        by0 by0Var = obj.a;
        boolean z = true;
        if (zx0Var.e(1)) {
            by0Var = zx0Var.g();
        }
        obj.a = (IconCompat) by0Var;
        CharSequence charSequence = obj.b;
        if (zx0Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((ay0) zx0Var).e);
        }
        obj.b = charSequence;
        CharSequence charSequence2 = obj.c;
        if (zx0Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((ay0) zx0Var).e);
        }
        obj.c = charSequence2;
        obj.d = (PendingIntent) zx0Var.f(obj.d, 4);
        boolean z2 = obj.e;
        if (zx0Var.e(5)) {
            if (((ay0) zx0Var).e.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        obj.e = z2;
        boolean z3 = obj.f;
        if (!zx0Var.e(6)) {
            z = z3;
        } else if (((ay0) zx0Var).e.readInt() == 0) {
            z = false;
        }
        obj.f = z;
        return obj;
    }

    public static void write(RemoteActionCompat remoteActionCompat, zx0 zx0Var) {
        zx0Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        zx0Var.h(1);
        zx0Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        zx0Var.h(2);
        Parcel parcel = ((ay0) zx0Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        zx0Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        zx0Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        zx0Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        zx0Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
