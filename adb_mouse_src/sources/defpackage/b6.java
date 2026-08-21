package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class b6 extends d6 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ g6 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(g6 g6Var, Context context) {
        super(g6Var);
        this.d = g6Var;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.d6
    public final IntentFilter f() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [mu0, java.lang.Object] */
    @Override // defpackage.d6
    public final int g() {
        Location location;
        boolean z;
        long j;
        Location location2;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (w5.a((PowerManager) obj)) {
                    return 2;
                }
                return 1;
            default:
                b8 b8Var = (b8) obj;
                bh0 bh0Var = (bh0) b8Var.e;
                LocationManager locationManager = (LocationManager) b8Var.d;
                if (bh0Var.b > System.currentTimeMillis()) {
                    z = bh0Var.a;
                } else {
                    Context context = (Context) b8Var.f;
                    Location location3 = null;
                    if (f20.d(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (f20.d(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    z = false;
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (mu0.d == null) {
                            mu0.d = new Object();
                        }
                        mu0 mu0Var = mu0.d;
                        mu0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        mu0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        if (mu0Var.c == 1) {
                            z = true;
                        }
                        long j2 = mu0Var.b;
                        long j3 = mu0Var.a;
                        mu0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j4 = mu0Var.b;
                        if (j2 != -1 && j3 != -1) {
                            if (currentTimeMillis > j3) {
                                j2 = j4;
                            } else if (currentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        } else {
                            j = currentTimeMillis + 43200000;
                        }
                        bh0Var.a = z;
                        bh0Var.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    return 2;
                }
                return 1;
        }
    }

    @Override // defpackage.d6
    public final void k() {
        int i = this.c;
        g6 g6Var = this.d;
        switch (i) {
            case 0:
                g6Var.m(true, true);
                return;
            default:
                g6Var.m(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(g6 g6Var, b8 b8Var) {
        super(g6Var);
        this.d = g6Var;
        this.e = b8Var;
    }
}
