package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import svarzee.android.apps.adb_mouse.R;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class os implements cl, is0, la0, me0, mf0, xh {
    public static volatile os d;
    public static os h;
    public static final Object c = new Object();
    public static final /* synthetic */ os e = new Object();
    public static final os f = new Object();
    public static final os g = new Object();

    public os(View view) {
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [os, java.lang.Object] */
    public static os l(Context context, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        mn.i("Cannot create a CalendarItemStyle with a styleResId of 0", z);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, mg0.p);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        k20.w(context, obtainStyledAttributes, 4);
        k20.w(context, obtainStyledAttributes, 9);
        k20.w(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        on0.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new k0(0.0f)).a();
        obtainStyledAttributes.recycle();
        ?? obj = new Object();
        mn.j(rect.left);
        mn.j(rect.top);
        mn.j(rect.right);
        mn.j(rect.bottom);
        return obj;
    }

    public static int m(int i, int i2, int i3) {
        int i4 = 1;
        while (i3 >= 32) {
            i4 = (int) ((((4294967295L & (i2 * i4)) * i) + i4) >>> 32);
            i3 -= 32;
        }
        if (i3 > 0) {
            return (int) ((((4294967295L & ((i2 * i4) & ((-1) >>> (-i3)))) * i) + i4) >>> i3);
        }
        return i4;
    }

    @Override // defpackage.is0
    public ps0 c(long j, short s, xf0 xf0Var, byte[] bArr, int i) {
        return new ps0(5, i, s, bArr);
    }

    @Override // defpackage.xh
    public long d() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.is0
    public boolean e() {
        return false;
    }

    @Override // defpackage.me0
    public CharSequence g(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(editTextPreference.V)) {
            return editTextPreference.c.getString(R.string.not_set);
        }
        return editTextPreference.V;
    }

    @Override // defpackage.is0
    public ss0 i(long j, short s, xf0 xf0Var, byte[] bArr, int i, int i2) {
        int i3 = 5 + i2;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 5, i2);
        return new ss0(bArr2, i3, s);
    }

    @Override // defpackage.is0
    public void j() {
        throw new us0((short) 80, null, null);
    }

    @Override // defpackage.is0
    public void k() {
        throw new us0((short) 80, null, null);
    }

    public boolean n(CharSequence charSequence) {
        return false;
    }

    public void o(Context context, ma1 ma1Var) {
        try {
            context.unbindService(ma1Var);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    @Override // defpackage.la0
    public boolean p(w90 w90Var) {
        return false;
    }

    public boolean q(Context context, String str, Intent intent, ma1 ma1Var, Executor executor) {
        boolean bindService;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((t11.a(context).a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (executor == null) {
            executor = null;
        }
        if (Build.VERSION.SDK_INT >= 29 && executor != null) {
            bindService = context.bindService(intent, 4225, executor, ma1Var);
            return bindService;
        }
        return context.bindService(intent, ma1Var, 4225);
    }

    @Override // defpackage.mf0
    public void f() {
    }

    @Override // defpackage.is0
    public int b(int i) {
        return i;
    }

    @Override // defpackage.la0
    public void a(w90 w90Var, boolean z) {
    }

    @Override // defpackage.mf0
    public void h(int i, Object obj) {
    }
}
