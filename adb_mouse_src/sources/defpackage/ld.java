package defpackage;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class ld {
    public final Object a;
    public volatile Object b;
    public volatile Object c;

    public /* synthetic */ ld(Object obj) {
        this.a = obj;
    }

    public boolean a() {
        try {
            f5 f5Var = (f5) this.a;
            return f5Var.getPackageManager().getApplicationInfo(f5Var.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e) {
            m51.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
            return false;
        }
    }
}
