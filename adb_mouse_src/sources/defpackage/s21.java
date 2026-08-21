package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class s21 extends k20 {
    public final /* synthetic */ int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s21(int i) {
        super(10);
        this.G = i;
    }

    @Override // defpackage.k20
    public z4 g(Context context, Looper looper, i6 i6Var, Object obj, c00 c00Var, d00 d00Var) {
        switch (this.G) {
            case 0:
                i6Var.getClass();
                Integer num = (Integer) i6Var.f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new eo0(context, looper, i6Var, bundle, c00Var, d00Var);
            case 1:
                obj.getClass();
                throw new ClassCastException();
            default:
                return super.g(context, looper, i6Var, obj, c00Var, d00Var);
        }
    }

    @Override // defpackage.k20
    public /* synthetic */ z4 h(Context context, Looper looper, i6 i6Var, Object obj, y21 y21Var, y21 y21Var2) {
        switch (this.G) {
            case 2:
                return new w31(context, looper, i6Var, (fr0) obj, y21Var, y21Var2);
            default:
                return super.h(context, looper, i6Var, obj, y21Var, y21Var2);
        }
    }
}
