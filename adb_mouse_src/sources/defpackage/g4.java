package defpackage;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.preference.PreferenceScreen;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a449a41cc305adace0fb5eba15534f9e326e1bcd513b1eb0f49c7e6b20d3b31a */
/* loaded from: classes.dex */
public final class g4 extends Handler {
    public final /* synthetic */ int a = 0;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(qe0 qe0Var, Looper looper) {
        super(looper);
        this.b = qe0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i != -3 && i != -2 && i != -1) {
                    if (i == 1) {
                        ((DialogInterface) message.obj).dismiss();
                        return;
                    }
                    return;
                }
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.b).get(), message.what);
                return;
            default:
                if (message.what == 1) {
                    qe0 qe0Var = (qe0) this.b;
                    PreferenceScreen preferenceScreen = qe0Var.X.g;
                    if (preferenceScreen != null) {
                        qe0Var.Y.setAdapter(new te0(preferenceScreen));
                        preferenceScreen.j();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ g4() {
    }
}
