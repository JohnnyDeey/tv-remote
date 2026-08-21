package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class j31 extends o31 {
    public final /* synthetic */ Intent c;
    public final /* synthetic */ GoogleApiActivity d;

    public j31(Intent intent, GoogleApiActivity googleApiActivity) {
        this.c = intent;
        this.d = googleApiActivity;
    }

    @Override // defpackage.o31
    public final void a() {
        Intent intent = this.c;
        if (intent != null) {
            this.d.startActivityForResult(intent, 2);
        }
    }
}
