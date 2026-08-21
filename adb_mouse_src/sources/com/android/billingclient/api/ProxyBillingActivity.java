package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import defpackage.m51;
import defpackage.o61;
import defpackage.q91;
import defpackage.sd;
import defpackage.td;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {
    public ResultReceiver c;
    public boolean d;
    public boolean e;
    public int f;
    public long g;
    public boolean h;

    public static int a(int i, Intent intent) {
        if (intent == null) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 3) {
                        if (i != 4) {
                            return 117;
                        }
                        return 116;
                    }
                    return 115;
                }
                return 114;
            }
            return 113;
        }
        if (intent.getExtras() == null) {
            return 22;
        }
        if (i == 5) {
            return 139;
        }
        return 1;
    }

    public final Intent b(int i, long j) {
        Intent c = c();
        c.putExtra("RESPONSE_CODE", 6);
        c.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        sd a = td.a();
        a.b = 6;
        a.d = "An internal error occurred.";
        td a2 = a.a();
        int i2 = o61.a;
        c.putExtra("FAILURE_LOGGING_PAYLOAD", o61.b(i, 2, a2, null, q91.BROADCAST_ACTION_UNSPECIFIED).b());
        c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        c.putExtra("billingClientTransactionId", j);
        c.putExtra("wasServiceAutoReconnected", this.h);
        return c;
    }

    public final Intent c() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0013, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005f, code lost:
    
        if (r11 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r11 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003a  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r9, int r10, android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle == null) {
            m51.g("ProxyBillingActivity", "Launching Play Store billing flow");
            this.f = 100;
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.e = true;
                    this.f = 110;
                }
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.c = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                this.f = 101;
            } else {
                pendingIntent = null;
            }
            if (getIntent().hasExtra("billingClientTransactionId")) {
                this.g = getIntent().getLongExtra("billingClientTransactionId", 0L);
            }
            if (getIntent().hasExtra("wasServiceAutoReconnected")) {
                this.h = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
            }
            try {
                this.d = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), this.f, new Intent(), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e) {
                m51.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
                ResultReceiver resultReceiver = this.c;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                } else {
                    Intent b = b(137, this.g);
                    if (this.e) {
                        b.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    sendBroadcast(b);
                }
                this.d = false;
                finish();
                return;
            }
        }
        m51.g("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
        this.d = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
        if (bundle.containsKey("in_app_message_result_receiver")) {
            this.c = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
        }
        this.e = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
        this.f = bundle.getInt("activity_code", 100);
        if (bundle.containsKey("billingClientTransactionId")) {
            this.g = bundle.getLong("billingClientTransactionId");
        }
        if (bundle.containsKey("wasServiceAutoReconnected")) {
            this.h = bundle.getBoolean("wasServiceAutoReconnected");
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.d) {
            Intent c = c();
            c.putExtra("RESPONSE_CODE", 1);
            c.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.e) {
                c.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.f;
            if (i == 110 || i == 100) {
                c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                c.putExtra("billingClientTransactionId", this.g);
            }
            sendBroadcast(c);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.c;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.d);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.e);
        bundle.putInt("activity_code", this.f);
        bundle.putLong("billingClientTransactionId", this.g);
        bundle.putBoolean("wasServiceAutoReconnected", this.h);
    }
}
