package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.a;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.apps.common.proguard.UsedByReflection;
import defpackage.c3;
import defpackage.e3;
import defpackage.f3;
import defpackage.j20;
import defpackage.m51;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends a {
    public ResultReceiver A;
    public ResultReceiver B;
    public f3 u;
    public f3 v;
    public f3 w;
    public f3 x;
    public ResultReceiver y;
    public ResultReceiver z;

    @Override // androidx.activity.a, defpackage.dj, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i = 2;
        final int i2 = 0;
        this.u = k(new e3(2), new c3(this) { // from class: c71
            public final /* synthetic */ ProxyBillingActivityV2 b;

            {
                this.b = this;
            }

            @Override // defpackage.c3
            public final void a(Object obj) {
                int i3 = i2;
                Bundle bundle2 = null;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.b;
                b3 b3Var = (b3) obj;
                switch (i3) {
                    case 0:
                        Intent intent = b3Var.d;
                        int i4 = m51.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.y;
                        if (resultReceiver != null) {
                            if (intent != null) {
                                bundle2 = intent.getExtras();
                            }
                            resultReceiver.send(i4, bundle2);
                        }
                        int i5 = b3Var.c;
                        if (i5 != -1 || i4 != 0) {
                            m51.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i5 + " and billing's responseCode: " + i4);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                    case 1:
                        Intent intent2 = b3Var.d;
                        int i6 = m51.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.z;
                        if (resultReceiver2 != null) {
                            if (intent2 != null) {
                                bundle2 = intent2.getExtras();
                            }
                            resultReceiver2.send(i6, bundle2);
                        }
                        int i7 = b3Var.c;
                        if (i7 != -1 || i6 != 0) {
                            m51.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i7 + " and billing's responseCode: " + i6);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                    case 2:
                        Intent intent3 = b3Var.d;
                        int i8 = b3Var.c;
                        if (intent3 != null) {
                            bundle2 = intent3.getExtras();
                        }
                        if (i8 != -1) {
                            if (bundle2 == null) {
                                bundle2 = new Bundle();
                            }
                            m51.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i8);
                            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i8);
                        }
                        int i9 = m51.e(intent3, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.A;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i9, bundle2);
                        } else {
                            m51.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i9 != 0) {
                            m51.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i9);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                    default:
                        Intent intent4 = b3Var.d;
                        int i10 = b3Var.c;
                        if (intent4 != null) {
                            bundle2 = intent4.getExtras();
                        }
                        if (i10 != -1) {
                            if (bundle2 == null) {
                                bundle2 = new Bundle();
                            }
                            m51.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i10);
                            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i10);
                        }
                        int i11 = m51.e(intent4, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.B;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i11, bundle2);
                        } else {
                            m51.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i11 != 0) {
                            m51.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i11);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                }
            }
        });
        final int i3 = 1;
        this.v = k(new e3(2), new c3(this) { // from class: c71
            public final /* synthetic */ ProxyBillingActivityV2 b;

            {
                this.b = this;
            }

            @Override // defpackage.c3
            public final void a(Object obj) {
                int i32 = i3;
                Bundle bundle2 = null;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.b;
                b3 b3Var = (b3) obj;
                switch (i32) {
                    case 0:
                        Intent intent = b3Var.d;
                        int i4 = m51.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.y;
                        if (resultReceiver != null) {
                            if (intent != null) {
                                bundle2 = intent.getExtras();
                            }
                            resultReceiver.send(i4, bundle2);
                        }
                        int i5 = b3Var.c;
                        if (i5 != -1 || i4 != 0) {
                            m51.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i5 + " and billing's responseCode: " + i4);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                    case 1:
                        Intent intent2 = b3Var.d;
                        int i6 = m51.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.z;
                        if (resultReceiver2 != null) {
                            if (intent2 != null) {
                                bundle2 = intent2.getExtras();
                            }
                            resultReceiver2.send(i6, bundle2);
                        }
                        int i7 = b3Var.c;
                        if (i7 != -1 || i6 != 0) {
                            m51.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i7 + " and billing's responseCode: " + i6);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                    case 2:
                        Intent intent3 = b3Var.d;
                        int i8 = b3Var.c;
                        if (intent3 != null) {
                            bundle2 = intent3.getExtras();
                        }
                        if (i8 != -1) {
                            if (bundle2 == null) {
                                bundle2 = new Bundle();
                            }
                            m51.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i8);
                            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i8);
                        }
                        int i9 = m51.e(intent3, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.A;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i9, bundle2);
                        } else {
                            m51.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i9 != 0) {
                            m51.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i9);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                    default:
                        Intent intent4 = b3Var.d;
                        int i10 = b3Var.c;
                        if (intent4 != null) {
                            bundle2 = intent4.getExtras();
                        }
                        if (i10 != -1) {
                            if (bundle2 == null) {
                                bundle2 = new Bundle();
                            }
                            m51.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i10);
                            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i10);
                        }
                        int i11 = m51.e(intent4, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.B;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i11, bundle2);
                        } else {
                            m51.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i11 != 0) {
                            m51.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i11);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                }
            }
        });
        this.w = k(new e3(2), new c3(this) { // from class: c71
            public final /* synthetic */ ProxyBillingActivityV2 b;

            {
                this.b = this;
            }

            @Override // defpackage.c3
            public final void a(Object obj) {
                int i32 = i;
                Bundle bundle2 = null;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.b;
                b3 b3Var = (b3) obj;
                switch (i32) {
                    case 0:
                        Intent intent = b3Var.d;
                        int i4 = m51.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.y;
                        if (resultReceiver != null) {
                            if (intent != null) {
                                bundle2 = intent.getExtras();
                            }
                            resultReceiver.send(i4, bundle2);
                        }
                        int i5 = b3Var.c;
                        if (i5 != -1 || i4 != 0) {
                            m51.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i5 + " and billing's responseCode: " + i4);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                    case 1:
                        Intent intent2 = b3Var.d;
                        int i6 = m51.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.z;
                        if (resultReceiver2 != null) {
                            if (intent2 != null) {
                                bundle2 = intent2.getExtras();
                            }
                            resultReceiver2.send(i6, bundle2);
                        }
                        int i7 = b3Var.c;
                        if (i7 != -1 || i6 != 0) {
                            m51.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i7 + " and billing's responseCode: " + i6);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                    case 2:
                        Intent intent3 = b3Var.d;
                        int i8 = b3Var.c;
                        if (intent3 != null) {
                            bundle2 = intent3.getExtras();
                        }
                        if (i8 != -1) {
                            if (bundle2 == null) {
                                bundle2 = new Bundle();
                            }
                            m51.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i8);
                            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i8);
                        }
                        int i9 = m51.e(intent3, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.A;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i9, bundle2);
                        } else {
                            m51.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i9 != 0) {
                            m51.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i9);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                    default:
                        Intent intent4 = b3Var.d;
                        int i10 = b3Var.c;
                        if (intent4 != null) {
                            bundle2 = intent4.getExtras();
                        }
                        if (i10 != -1) {
                            if (bundle2 == null) {
                                bundle2 = new Bundle();
                            }
                            m51.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i10);
                            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i10);
                        }
                        int i11 = m51.e(intent4, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.B;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i11, bundle2);
                        } else {
                            m51.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i11 != 0) {
                            m51.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i11);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                }
            }
        });
        final int i4 = 3;
        this.x = k(new e3(2), new c3(this) { // from class: c71
            public final /* synthetic */ ProxyBillingActivityV2 b;

            {
                this.b = this;
            }

            @Override // defpackage.c3
            public final void a(Object obj) {
                int i32 = i4;
                Bundle bundle2 = null;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.b;
                b3 b3Var = (b3) obj;
                switch (i32) {
                    case 0:
                        Intent intent = b3Var.d;
                        int i42 = m51.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.y;
                        if (resultReceiver != null) {
                            if (intent != null) {
                                bundle2 = intent.getExtras();
                            }
                            resultReceiver.send(i42, bundle2);
                        }
                        int i5 = b3Var.c;
                        if (i5 != -1 || i42 != 0) {
                            m51.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i5 + " and billing's responseCode: " + i42);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                    case 1:
                        Intent intent2 = b3Var.d;
                        int i6 = m51.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.z;
                        if (resultReceiver2 != null) {
                            if (intent2 != null) {
                                bundle2 = intent2.getExtras();
                            }
                            resultReceiver2.send(i6, bundle2);
                        }
                        int i7 = b3Var.c;
                        if (i7 != -1 || i6 != 0) {
                            m51.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i7 + " and billing's responseCode: " + i6);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                    case 2:
                        Intent intent3 = b3Var.d;
                        int i8 = b3Var.c;
                        if (intent3 != null) {
                            bundle2 = intent3.getExtras();
                        }
                        if (i8 != -1) {
                            if (bundle2 == null) {
                                bundle2 = new Bundle();
                            }
                            m51.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i8);
                            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i8);
                        }
                        int i9 = m51.e(intent3, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.A;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i9, bundle2);
                        } else {
                            m51.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i9 != 0) {
                            m51.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i9);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                    default:
                        Intent intent4 = b3Var.d;
                        int i10 = b3Var.c;
                        if (intent4 != null) {
                            bundle2 = intent4.getExtras();
                        }
                        if (i10 != -1) {
                            if (bundle2 == null) {
                                bundle2 = new Bundle();
                            }
                            m51.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i10);
                            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i10);
                        }
                        int i11 = m51.e(intent4, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.B;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i11, bundle2);
                        } else {
                            m51.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i11 != 0) {
                            m51.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i11);
                        }
                        proxyBillingActivityV2.finish();
                        return;
                }
            }
        });
        if (bundle == null) {
            m51.g("ProxyBillingActivityV2", "Launching Play Store billing dialog");
            if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
                PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
                this.y = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
                f3 f3Var = this.u;
                pendingIntent.getClass();
                IntentSender intentSender = pendingIntent.getIntentSender();
                intentSender.getClass();
                f3Var.h0(new j20(intentSender, null, 0, 0));
                return;
            }
            if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
                PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
                this.z = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
                f3 f3Var2 = this.v;
                pendingIntent2.getClass();
                IntentSender intentSender2 = pendingIntent2.getIntentSender();
                intentSender2.getClass();
                f3Var2.h0(new j20(intentSender2, null, 0, 0));
                return;
            }
            if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
                PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
                this.A = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
                f3 f3Var3 = this.w;
                pendingIntent3.getClass();
                IntentSender intentSender3 = pendingIntent3.getIntentSender();
                intentSender3.getClass();
                f3Var3.h0(new j20(intentSender3, null, 0, 0));
                return;
            }
            if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
                PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
                this.B = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
                f3 f3Var4 = this.x;
                pendingIntent4.getClass();
                IntentSender intentSender4 = pendingIntent4.getIntentSender();
                intentSender4.getClass();
                f3Var4.h0(new j20(intentSender4, null, 0, 0));
                return;
            }
            return;
        }
        if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
            this.y = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
        }
        if (bundle.containsKey("external_payment_dialog_result_receiver")) {
            this.z = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
        }
        if (bundle.containsKey("external_offer_flow_result_receiver")) {
            this.A = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
        }
        if (bundle.containsKey("launch_external_link_result_receiver")) {
            this.B = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
        }
    }

    @Override // androidx.activity.a, defpackage.dj, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.y;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.z;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.A;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.B;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
    }
}
