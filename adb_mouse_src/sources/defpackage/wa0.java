package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class wa0 implements Comparable, Parcelable {
    public static final Parcelable.Creator<wa0> CREATOR = new a3(14);
    public final Calendar c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final long h;
    public String i;

    public wa0(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a = dx0.a(calendar);
        this.c = a;
        this.d = a.get(2);
        this.e = a.get(1);
        this.f = a.getMaximum(7);
        this.g = a.getActualMaximum(5);
        this.h = a.getTimeInMillis();
    }

    public static wa0 a(int i, int i2) {
        Calendar c = dx0.c(null);
        c.set(1, i);
        c.set(2, i2);
        return new wa0(c);
    }

    public static wa0 b(long j) {
        Calendar c = dx0.c(null);
        c.setTimeInMillis(j);
        return new wa0(c);
    }

    public final String c() {
        if (this.i == null) {
            long timeInMillis = this.c.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = dx0.a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.i = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.c.compareTo(((wa0) obj).c);
    }

    public final int d(wa0 wa0Var) {
        if (this.c instanceof GregorianCalendar) {
            return (wa0Var.d - this.d) + ((wa0Var.e - this.e) * 12);
        }
        c.k("Only Gregorian calendars are supported.");
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa0)) {
            return false;
        }
        wa0 wa0Var = (wa0) obj;
        if (this.d == wa0Var.d && this.e == wa0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.d);
    }
}
