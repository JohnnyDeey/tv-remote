package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.ArrayList;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class a00 extends b00 {
    public static final Object b = new Object();
    public static final a00 c = new Object();

    public static AlertDialog d(Activity activity, int i, o31 o31Var, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(activity, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(d31.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    string = resources.getString(R.string.ok);
                } else {
                    string = resources.getString(svarzee.android.apps.adb_mouse.R.string.common_google_play_services_enable_button);
                }
            } else {
                string = resources.getString(svarzee.android.apps.adb_mouse.R.string.common_google_play_services_update_button);
            }
        } else {
            string = resources.getString(svarzee.android.apps.adb_mouse.R.string.common_google_play_services_install_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, o31Var);
        }
        String c2 = d31.c(activity, i);
        if (c2 != null) {
            builder.setTitle(c2);
        }
        Log.w("GoogleApiAvailability", qo0.m("Creating dialog for Google Play services availability issue. ConnectionResult=", i), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [lu, android.app.DialogFragment] */
    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof f5) {
                vx vxVar = ((ix) ((f5) activity).u.d).v;
                lq0 lq0Var = new lq0();
                wv0.q(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                lq0Var.k0 = alertDialog;
                if (onCancelListener != null) {
                    lq0Var.l0 = onCancelListener;
                }
                lq0Var.h0 = false;
                lq0Var.i0 = true;
                vxVar.getClass();
                hc hcVar = new hc(vxVar);
                hcVar.p = true;
                hcVar.e(0, lq0Var, str, 1);
                hcVar.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        wv0.q(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.c = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.d = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog d = d(googleApiActivity, i, new j31(super.a(i, googleApiActivity, "d"), googleApiActivity), googleApiActivity2);
        if (d == null) {
            return;
        }
        e(googleApiActivity, d, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [hc0, java.lang.Object] */
    public final void f(Context context, int i, PendingIntent pendingIntent) {
        String c2;
        String d;
        Notification build;
        int i2;
        Bundle bundle;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", qo0.n("GMS core API Availability. ConnectionResult=", i, ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new l31(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        if (i == 6) {
            c2 = d31.e(context, "common_google_play_services_resolution_required_title");
        } else {
            c2 = d31.c(context, i);
        }
        if (c2 == null) {
            c2 = context.getResources().getString(svarzee.android.apps.adb_mouse.R.string.common_google_play_services_notification_ticker);
        }
        if (i != 6 && i != 19) {
            d = d31.b(context, i);
        } else {
            d = d31.d(context, "common_google_play_services_resolution_required_text", d31.a(context));
        }
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        wv0.p(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        ?? obj = new Object();
        ArrayList arrayList = new ArrayList();
        obj.b = arrayList;
        obj.c = new ArrayList();
        obj.d = new ArrayList();
        obj.i = true;
        obj.k = false;
        Notification notification = new Notification();
        obj.o = notification;
        obj.a = context;
        obj.m = null;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        obj.h = 0;
        obj.p = new ArrayList();
        obj.n = true;
        obj.k = true;
        notification.flags |= 16;
        obj.e = hc0.a(c2);
        r6 r6Var = new r6(25, false);
        r6Var.e = hc0.a(d);
        obj.b(r6Var);
        PackageManager packageManager = context.getPackageManager();
        if (f20.s == null) {
            f20.s = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (f20.s.booleanValue()) {
            notification.icon = context.getApplicationInfo().icon;
            obj.h = 2;
            if (f20.N(context)) {
                arrayList.add(new gc0(resources.getString(svarzee.android.apps.adb_mouse.R.string.common_open_on_phone), pendingIntent));
            } else {
                obj.g = pendingIntent;
            }
        } else {
            notification.icon = R.drawable.stat_sys_warning;
            notification.tickerText = hc0.a(resources.getString(svarzee.android.apps.adb_mouse.R.string.common_google_play_services_notification_ticker));
            notification.when = System.currentTimeMillis();
            obj.g = pendingIntent;
            obj.f = hc0.a(d);
        }
        if (k20.K()) {
            if (k20.K()) {
                synchronized (b) {
                }
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(svarzee.android.apps.adb_mouse.R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(h1.c(string));
                } else {
                    name = notificationChannel.getName();
                    if (!string.contentEquals(name)) {
                        notificationChannel.setName(string);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                obj.m = "com.google.android.gms.availability";
            } else {
                throw new IllegalStateException();
            }
        }
        b8 b8Var = new b8((hc0) obj);
        Notification.Builder builder = (Notification.Builder) b8Var.d;
        hc0 hc0Var = (hc0) b8Var.e;
        r6 r6Var2 = hc0Var.j;
        if (r6Var2 != null) {
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText((CharSequence) r6Var2.e);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            build = builder.build();
        } else {
            build = builder.build();
        }
        if (r6Var2 != null) {
            hc0Var.j.getClass();
        }
        if (r6Var2 != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        if (i != 1 && i != 2 && i != 3) {
            i2 = 39789;
        } else {
            f00.a.set(false);
            i2 = 10436;
        }
        notificationManager.notify(i2, build);
    }

    public final void g(Activity activity, q50 q50Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d = d(activity, i, new n31(super.a(i, activity, "d"), q50Var), onCancelListener);
        if (d == null) {
            return;
        }
        e(activity, d, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
