package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.v4;
import defpackage.x10;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements x10 {
    @Override // defpackage.x10
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.x10
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new v4(this, context.getApplicationContext()));
        return new Object();
    }
}
