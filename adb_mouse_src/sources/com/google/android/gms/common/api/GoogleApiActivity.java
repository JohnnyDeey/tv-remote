package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import defpackage.a00;
import defpackage.e00;
import defpackage.jj;
import defpackage.qo0;
import defpackage.wv0;
import defpackage.y31;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int d = 0;
    public int c = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.c = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                e00 d2 = e00.d(this);
                if (i2 != -1) {
                    if (i2 == 0) {
                        d2.e(new jj(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    y31 y31Var = d2.m;
                    y31Var.sendMessage(y31Var.obtainMessage(3));
                }
            }
        } else if (i == 2) {
            this.c = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.c = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.c = bundle.getInt("resolution");
        }
        if (this.c != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent != null) {
                try {
                    googleApiActivity = this;
                    try {
                        googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        googleApiActivity.c = 1;
                    } catch (ActivityNotFoundException e) {
                        e = e;
                        ActivityNotFoundException activityNotFoundException = e;
                        if (extras.getBoolean("notify_manager", true)) {
                            e00.d(googleApiActivity).e(new jj(22, null, null), googleApiActivity.getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String r = qo0.r("Activity not found while launching ", pendingIntent.toString(), ".");
                            if (Build.FINGERPRINT.contains("generic")) {
                                r = r.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", r, activityNotFoundException);
                        }
                        googleApiActivity.c = 1;
                        googleApiActivity.finish();
                    } catch (IntentSender.SendIntentException e2) {
                        e = e2;
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                        googleApiActivity.finish();
                    }
                } catch (ActivityNotFoundException e3) {
                    e = e3;
                    googleApiActivity = this;
                } catch (IntentSender.SendIntentException e4) {
                    e = e4;
                    googleApiActivity = this;
                }
            } else {
                wv0.p(num);
                a00.c.c(this, num.intValue(), this);
                this.c = 1;
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.c);
        super.onSaveInstanceState(bundle);
    }
}
