package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class y10 extends InputConnectionWrapper {
    public final /* synthetic */ sf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y10(InputConnection inputConnection, sf sfVar) {
        super(inputConnection, false);
        this.a = sfVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        i81 i81Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            i81Var = new i81(21, new a20(inputContentInfo));
        }
        if (this.a.e(i81Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
